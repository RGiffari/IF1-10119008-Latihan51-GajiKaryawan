package latihan.GajiKaryawan;

public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return this.kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = hadir * 10000;
    }

    public float tunjanganJabatan(String jabatan) {
        jabatan = jabatan.toLowerCase();
        switch (jabatan){
            case "manager" :
                return this.tunjanganJabatan = 2000000;
            case "kabag" :
                return this.tunjanganJabatan = 1000000;
            default :
                return this.tunjanganJabatan = 0;
        }
    }

    public float tunjanganGolongan(int golongan) {
        switch (golongan){
            case 1 :
                return this.tunjanganGolongan = 500000;
            case 2 :
                return this.tunjanganGolongan = 1000000;
            case 3 :
                return this.tunjanganGolongan = 1500000;
            default:
                return this.tunjanganGolongan = 0;
        }
    }

    public float gajiTotal() {
        return this.tunjanganJabatan + this.tunjanganGolongan + this.tunjanganKehadiran;
    }

}
