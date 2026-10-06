package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hcj {

    /* JADX INFO: renamed from: a */
    public final heo f27246a;

    /* JADX INFO: renamed from: b */
    public final boolean f27247b;

    /* JADX INFO: renamed from: c */
    public final boolean f27248c;

    /* JADX INFO: renamed from: d */
    public final boolean f27249d;

    /* JADX INFO: renamed from: e */
    public final boolean f27250e;

    /* JADX INFO: renamed from: f */
    public final int f27251f;

    public hcj() {
    }

    public hcj(heo heoVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f27246a = heoVar;
        this.f27251f = i;
        this.f27247b = z;
        this.f27248c = z2;
        this.f27249d = z3;
        this.f27250e = z4;
    }

    /* JADX INFO: renamed from: a */
    public static hci m10111a(heo heoVar) {
        hci hciVar = new hci();
        hciVar.f27239a = heoVar;
        hciVar.m10110f(1);
        hciVar.m10106b(false);
        hciVar.m10108d(false);
        hciVar.m10107c(false);
        hciVar.m10109e(false);
        return hciVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcj)) {
            return false;
        }
        hcj hcjVar = (hcj) obj;
        if (this.f27246a.equals(hcjVar.f27246a)) {
            int i = this.f27251f;
            int i2 = hcjVar.f27251f;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.f27247b == hcjVar.f27247b && this.f27248c == hcjVar.f27248c && this.f27249d == hcjVar.f27249d && this.f27250e == hcjVar.f27250e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f27246a.hashCode() ^ 1000003;
        int i = this.f27251f;
        if (i == 0) {
            throw null;
        }
        int i2 = iHashCode * 1000003;
        int i3 = true != this.f27247b ? 1237 : 1231;
        int i4 = true != this.f27248c ? 1237 : 1231;
        return ((((((((i2 ^ i) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (true != this.f27249d ? 1237 : 1231)) * 1000003) ^ (true == this.f27250e ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.f27246a);
        switch (this.f27251f) {
            case 1:
                str = "HIDE";
                break;
            case 2:
                str = "ZOOMING";
                break;
            case 3:
                str = "RESTING";
                break;
            case 4:
                str = "SLIDING";
                break;
            case 5:
                str = "CONTINUOUS_ZOOM";
                break;
            case 6:
                str = "DOUBLE_TAP_ZOOM";
                break;
            case 7:
                str = "COLLAPSED";
                break;
            default:
                str = "null";
                break;
        }
        return "SmartChipCharacteristics{entry=" + strValueOf + ", zoomUiMode=" + str + ", isLayoutUpdate=" + this.f27247b + ", isZoomInViewfinder=" + this.f27248c + VCYBIzY.QQAcWd + this.f27249d + ", isZoomToggleEnabled=" + this.f27250e + hsSUWRJfoeC.FLfjhjSfRVUPkO;
    }
}
