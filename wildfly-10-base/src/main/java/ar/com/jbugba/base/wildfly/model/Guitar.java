package ar.com.jbugba.base.wildfly.model;

import javax.persistence.*;

@Entity
@Table(name = "BASE_GUITAR")
public class Guitar extends Storable {

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "STYLE")
    @Enumerated(EnumType.STRING)
    private MusicStyle style;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MusicStyle getStyle() {
        return style;
    }

    public void setStyle(MusicStyle style) {
        this.style = style;
    }
}
