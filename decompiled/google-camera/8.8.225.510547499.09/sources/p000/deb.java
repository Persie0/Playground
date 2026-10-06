package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class deb {

    /* JADX INFO: renamed from: a */
    public final long f10631a;

    /* JADX INFO: renamed from: b */
    public final String f10632b;

    /* JADX INFO: renamed from: c */
    public final Runnable f10633c;

    /* JADX INFO: renamed from: d */
    public final Drawable f10634d;

    /* JADX INFO: renamed from: e */
    public final mrm f10635e;

    /* JADX INFO: renamed from: f */
    public final int f10636f;

    /* JADX INFO: renamed from: g */
    public final int f10637g;

    /* JADX INFO: renamed from: h */
    public final mrm f10638h;

    /* JADX INFO: renamed from: i */
    public final boolean f10639i;

    /* JADX INFO: renamed from: j */
    public final long f10640j;

    /* JADX INFO: renamed from: k */
    public final int f10641k;

    /* JADX INFO: renamed from: l */
    public final int f10642l;

    public deb() {
    }

    public deb(long j, String str, Runnable runnable, Drawable drawable, int i, int i2, mrm mrmVar, int i3, int i4, mrm mrmVar2, boolean z, long j2) {
        this.f10631a = j;
        this.f10632b = str;
        this.f10633c = runnable;
        this.f10634d = drawable;
        this.f10641k = i;
        this.f10642l = i2;
        this.f10635e = mrmVar;
        this.f10636f = i3;
        this.f10637g = i4;
        this.f10638h = mrmVar2;
        this.f10639i = z;
        this.f10640j = j2;
    }

    /* JADX INFO: renamed from: a */
    static dea m5974a() {
        dea deaVar = new dea((byte[]) null);
        deaVar.f10623f = 1;
        deaVar.m5968b(0);
        deaVar.m5969c(0);
        deaVar.m5971e(false);
        deaVar.f10619b = cik.f5798f;
        return deaVar;
    }

    public final boolean equals(Object obj) {
        String str;
        Runnable runnable;
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof deb)) {
            return false;
        }
        deb debVar = (deb) obj;
        if (this.f10631a == debVar.f10631a && ((str = this.f10632b) != null ? str.equals(debVar.f10632b) : debVar.f10632b == null) && ((runnable = this.f10633c) != null ? runnable.equals(debVar.f10633c) : debVar.f10633c == null) && ((drawable = this.f10634d) != null ? drawable.equals(debVar.f10634d) : debVar.f10634d == null)) {
            int i = this.f10641k;
            int i2 = debVar.f10641k;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.f10642l;
                int i4 = debVar.f10642l;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4 && this.f10635e.equals(debVar.f10635e) && this.f10636f == debVar.f10636f && this.f10637g == debVar.f10637g && this.f10638h.equals(debVar.f10638h) && this.f10639i == debVar.f10639i && this.f10640j == debVar.f10640j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        long j = this.f10631a;
        String str2 = this.f10632b;
        String strValueOf = String.valueOf(this.f10633c);
        String strValueOf2 = String.valueOf(this.f10634d);
        String str3 = "null";
        switch (this.f10641k) {
            case 1:
                str = "LAUNCH_LENS";
                break;
            case 2:
                str = "INTENT";
                break;
            case 3:
                str = "LAUNCH_DRIVE";
                break;
            case 4:
                str = "DISMISS";
                break;
            default:
                str = "null";
                break;
        }
        switch (this.f10642l) {
            case 1:
                str3 = "UNKNOWN";
                break;
            case 2:
                str3 = "BARCODE";
                break;
            case 3:
                str3 = "SCAN_DOCUMENT";
                break;
        }
        return "CameraVisionKitChipResult{id=" + j + ", text=" + str2 + ", chipClickAction=" + strValueOf + ", icon=" + strValueOf2 + ", actionType=" + str + ", resultType=" + str3 + ", detectedDocumentData=" + String.valueOf(this.f10635e) + ", barcodeValueFormat=" + this.f10636f + ", barcodeFormat=" + this.f10637g + ", boundingBox=" + String.valueOf(this.f10638h) + ", gleamingEnabled=" + this.f10639i + ", timestamp=" + this.f10640j + "}";
    }

    public final int hashCode() {
        long j = this.f10631a;
        long j2 = j ^ (j >>> 32);
        String str = this.f10632b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = (int) j2;
        Runnable runnable = this.f10633c;
        int iHashCode2 = runnable == null ? 0 : runnable.hashCode();
        int i2 = ((i ^ 1000003) * 1000003) ^ iHashCode;
        Drawable drawable = this.f10634d;
        int iHashCode3 = (((iHashCode2 ^ (i2 * 1000003)) * 1000003) ^ (drawable != null ? drawable.hashCode() : 0)) * 1000003;
        int i3 = this.f10641k;
        if (i3 == 0) {
            throw null;
        }
        int i4 = (iHashCode3 ^ i3) * 1000003;
        int i5 = this.f10642l;
        if (i5 == 0) {
            throw null;
        }
        int iHashCode4 = (((((((((i4 ^ i5) * 1000003) ^ this.f10635e.hashCode()) * 1000003) ^ this.f10636f) * 1000003) ^ this.f10637g) * 1000003) ^ this.f10638h.hashCode()) * 1000003;
        int i6 = true != this.f10639i ? 1237 : 1231;
        long j3 = this.f10640j;
        return ((iHashCode4 ^ i6) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }
}
