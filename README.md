# 🎯 Data Format ?

<img src="xml1">

## 📌 Maven Dependencies

```xml

<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.14.2</version>
</dependency>
```

* com.fasterxml.jackson.dataformat.xml kütüphanesi, Java nesnelerini XML formatına serileştirme ve XML verilerini Java
  nesnelerine deserileştirme gibi işlemler için kullanılan bir kütüphanedir.

* Bu kütüphanenin temel metotlarından bazılarıdır şunlardır:

* ObjectMapper.readValue(): Bu metod, XML verilerini Java nesnelerine deserileştirir.

* ObjectMapper.writeValueAsString(): Bu metod, Java nesnelerini XML formatına serileştirir.

* XmlMapper.configure(): Bu metod, serileştirme/deserileştirme işlemlerinde kullanılan yapılandırma ayarlarını tanımlar.

* XmlMapper.setSerializationInclusion(): Bu metod, null veya boş değerlere sahip alanların serileştirilip
  serileştirilmeyeceğini tanımlar.

* XmlMapper.setPropertyNamingStrategy(): Bu metod, alan isimlerinin serileştirme/deserileştirme işlemlerinde nasıl
  görüneceğini tanımlar.

* @JacksonXmlProperty : Bu anotasyon, belirli bir Java nesnesinin XML çıktısında nasıl görüneceğini tanımlar.
* Örneğin, Java nesnesindeki bir alanın XML çıktısında belirli bir etiket ismi vermenize veya belirli bir sıralama
  kullanmanıza olanak tanır.

* @JacksonXmlRootElement : Bu anotasyon, bir Java nesnesinin XML çıktısının kök etiketini tanımlar.
* Örneğin, bir Java nesnesinin XML çıktısının kök etiketi "person" olarak tanımlanabilir.

* @JacksonXmlText : Bu anotasyon, bir Java nesnesinin XML çıktısındaki değerin nerede görüneceğini tanımlar.
* Örneğin, bir Java nesnesinin adı ve soyadı gibi değerleri içeren alanları, XML çıktısındaki bir etiketin içeriği
  olarak görüntülemek isteyebilirsiniz.

## 📌 Docker Compose

```yaml
version: '3.8'
services:

  xml-producer:
    image: rasitesdmr1486/xml-producer:v1.0
    container_name: xml-producer
    restart: always
    ports:
      - "8081:8081"
    depends_on:
      - kafka
    networks:
      - my-network

  xml-consumer:
    image: rasitesdmr1486/xml-consumer:v1.0
    container_name: xml-consumer
    restart: always
    ports:
      - "8082:8082"
    depends_on:
      - xml-producer
    networks:
      - my-network

  zookeeper:
    container_name: zookeeper
    image: confluentinc/cp-zookeeper:5.4.9
    restart: always
    ports:
      - "2181:2181"
    environment:
      ZOOKEEPER_CLIENT_PORT: 2181
    networks:
      - my-network

  kafka:
    container_name: kafka
    image: confluentinc/cp-kafka:6.0.9
    restart: always
    depends_on:
      - zookeeper
    ports:
      - "9092:9092"
    environment:
      KAFKA_ZOOKEEPER_CONNECT: "zookeeper:2181"
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: PLAINTEXT:PLAINTEXT,PLAINTEXT_HOST:PLAINTEXT
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://kafka:29092,PLAINTEXT_HOST://kafka:9092
      KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR: "1"
      KAFKA_DELETE_TOPIC_ENABLE: "true"
      KAFKA_ADVERTISED_HOST_NAME:
    networks:
      - my-network

  kafdrop:
    image: obsidiandynamics/kafdrop
    container_name: kafdrop
    restart: always
    depends_on:
      - zookeeper
      - kafka
    ports:
      - "9000:9000"
    environment:
      KAFKA_BROKERCONNECT: kafka:29092
    networks:
      - my-network

networks:
  my-network:
    driver: bridge
```

## 📌 docker-compose.yaml

```yaml
docker-compose up -d
```

```yaml
docker-compose down -v
```

## 📌 Docker Containers

<img src="docker1">

## 📌 XML example

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<products>
    <product>
        <Name>Casper Excalibur G770.1245-8VH0X-B</Name>
        <Price>14.999</Price>
        <İşlemciTipi>Intel Core i5</İşlemciTipi>
        <SSDKapasitesi>500 GB</SSDKapasitesi>
        <Çözünürlük>1920 x 1080</Çözünürlük>
        <EkranKartı>Nvidia GeForce GTX 1650</EkranKartı>
        <EkranKartıTipi>Harici</EkranKartıTipi>
        <İşlemciModeli>12450H</İşlemciModeli>
        <İşlemciNesli>12.Nesil</İşlemciNesli>
        <DokunmatikEkran>Yok</DokunmatikEkran>
        <ÇözünürlükStandartı>Full HD (FHD)</ÇözünürlükStandartı>
        <GarantiTipi>Casper Türkiye Garantili</GarantiTipi>
        <Bağlantılar>Bluetooth</Bağlantılar>
        <Renk>Siyah</Renk>
        <Ram>8 GB</Ram>
        <İşletimSistemi>Free Dos</İşletimSistemi>
        <EkranYenilemeHızı>144 Hz</EkranYenilemeHızı>
        <EkranBoyutu>15,6 inç</EkranBoyutu>
        <CihazAğırlığı>2 - 4 kg</CihazAğırlığı>
        <EkranKartıHafızası>4 GB</EkranKartıHafızası>
        <İşlemciÇekirdekSayısı>8</İşlemciÇekirdekSayısı>
        <GarantiSüresi>2 Yıl</GarantiSüresi>
    </product>
</products>

```

## 📌 xml-producer

▶️ swagger path : http://localhost:8081/swagger-ui.html

<img src="swagger1">

## 📌 xml-consumer

▶️ H2 path : http://localhost:8082/h2-console

* datasource : jdbc:h2:mem:testdb
* username : sa
* password : password

<img src="h2">

## 📌 KafDrop

▶️ path : http://localhost:9000/

<img src="drop">