package Coba2;

public enum StatusKaryawan {
    aktif("AKTIF"),
    cuti("CUTI"),
    resign("RESIGN");

    private String status;

    StatusKaryawan(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
