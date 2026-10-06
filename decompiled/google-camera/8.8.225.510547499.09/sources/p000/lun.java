package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lun extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f39238a;

    private lun(int i, String str) {
        super(str);
        this.f39238a = i;
    }

    /* JADX INFO: renamed from: a */
    public static lun m16012a(int i, String str, Object... objArr) {
        String str2;
        Object[] objArr2 = new Object[2];
        switch (i) {
            case 1:
                str2 = "SSID_LENGTH_INVALID";
                break;
            case 2:
                str2 = "OPEN_NETWORK_HAS_PASSWORD";
                break;
            case 3:
                str2 = "SECURE_NETWORK_BUT_MISSING_PASSWORD";
                break;
            default:
                str2 = pIeXJQLZLfgIN.vRFHyGl;
                break;
        }
        objArr2[0] = str2;
        objArr2[1] = String.format(str, objArr);
        return new lun(i, String.format("Reason: %s. Additional details: %s", objArr2));
    }
}
