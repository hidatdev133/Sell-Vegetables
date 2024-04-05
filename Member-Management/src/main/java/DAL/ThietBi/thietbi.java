package DAL.ThietBi;

import javax.persistence.*;
import lombok.Data;

@Entity
public class thietbi {

    @Id
    private int MaTB;
    @Column
    private String TenTB;
    @Column
    private String MoTaTB;

    public thietbi() {
    }

    public thietbi(int MaTB, String TenTB, String MoTaTB) {
        this.MaTB = MaTB;
        this.TenTB = TenTB;
        this.MoTaTB = MoTaTB;
    }

    public int getMaTB() {
        return MaTB;
    }

    public void setMaTB(int MaTB) {
        this.MaTB = MaTB;
    }

    public String getTenTB() {
        return TenTB;
    }

    public void setTenTB(String TenTB) {
        this.TenTB = TenTB;
    }

    public String getMoTaTB() {
        return MoTaTB;
    }

    public void setMoTaTB(String MoTaTB) {
        this.MoTaTB = MoTaTB;
    }
    
//    @OneToMany (mappedBy = "thongtinsd")
//    private List<thongtinsd> listttsd; 
    
}
