package kafka.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JacksonXmlProperty(localName = "Name")
    //   @Column(name ="Name")
    private String name;

    @JacksonXmlProperty(localName = "Price")
    //   @Column(name ="Price")
    private String price;

    @JacksonXmlProperty(localName = "İşlemciTipi")
    //   @Column(name = "İşlemci Tipi")
    private String islemciTipi;

    @JacksonXmlProperty(localName = "SSDKapasitesi")
    //   @Column(name = "SSD Kapasitesi")
    private String ssdKapasitesi;

    @JacksonXmlProperty(localName = "Çözünürlük")
    //   @Column(name = "Çözünürlük")
    private String cozunurluk;

    @JacksonXmlProperty(localName = "EkranKartı")
    //   @Column(name = "Ekran Kartı")
    private String ekranKarti;

    @JacksonXmlProperty(localName = "EkranKartıTipi")
    //   @Column(name = "Ekran Kartı Tipi")
    private String ekranKartiTipi;

    @JacksonXmlProperty(localName = "İşlemciModeli")
    //   @Column(name = "İşlemci Modeli")
    private String islemciModeli;

    @JacksonXmlProperty(localName = "İşlemciNesli")
    //   @Column(name = "İşlemci Nesli")
    private String islemciNesli ;

    @JacksonXmlProperty(localName = "DokunmatikEkran")
    //   @Column(name = "Dokunmatik Ekran")
    private String dokunmatikEkran;

    @JacksonXmlProperty(localName = "ÇözünürlükStandartı")
    //  @Column(name ="Çözünürlük Standartı" )
    private String cozunurlukStandarti ;

    @JacksonXmlProperty(localName = "GarantiTipi")
    //  @Column(name = "Garanti Tipi")
    private String garantiTipi;

    @JacksonXmlProperty(localName = "Bağlantılar")
    //  @Column(name ="Bağlantılar" )
    private String baglantilar ;

    @JacksonXmlProperty(localName = "Renk")
    //   @Column(name = "Renk")
    private String renk ;

    @JacksonXmlProperty(localName = "Ram")
    //   @Column(name ="Ram" )
    private String ram ;

    @JacksonXmlProperty(localName = "İşletimSistemi")
    //    @Column(name ="İşletim Sistemi" )
    private String isletimSistemi;

    @JacksonXmlProperty(localName = "EkranYenilemeHızı")
    //   @Column(name = "Ekran Yenileme Hızı")
    private String ekranYenilemeHizi;

    @JacksonXmlProperty(localName = "EkranBoyutu")
    //   @Column(name ="Ekran Boyutu" )
    private String ekranBoyutu ;

    @JacksonXmlProperty(localName = "CihazAğırlığı")
    //   @Column(name ="Cihaz Ağırlığı" )
    private String cihazAgirligi ;

    @JacksonXmlProperty(localName = "EkranKartıHafızası")
    //    @Column(name = "Ekran Kartı Hafızası")
    private String ekranKartiHafizasi ;

    @JacksonXmlProperty(localName = "İşlemciÇekirdekSayısı")
    //    @Column(name = "İşlemci Çekirdek Sayısı")
    private int islemcicekirdekSayisi ;

    @JacksonXmlProperty(localName = "GarantiSüresi")
//    @Column(name = "Garanti Süresi")
    private String garantiSuresi ;

}
