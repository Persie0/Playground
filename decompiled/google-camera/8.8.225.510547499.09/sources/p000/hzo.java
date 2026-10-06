package p000;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzo {

    /* JADX INFO: renamed from: a */
    public static final hzo f30065a;

    /* JADX INFO: renamed from: b */
    public final Size f30066b;

    /* JADX INFO: renamed from: c */
    public final Size f30067c;

    /* JADX INFO: renamed from: d */
    public final Size f30068d;

    /* JADX INFO: renamed from: e */
    public final Integer f30069e;

    /* JADX INFO: renamed from: f */
    public final boolean f30070f;

    /* JADX INFO: renamed from: g */
    public final ilk f30071g;

    /* JADX INFO: renamed from: h */
    public final ikw f30072h;

    /* JADX INFO: renamed from: i */
    public final hzj f30073i;

    static {
        hzn hznVar = new hzn();
        hznVar.m10943c(false);
        hznVar.m10944d();
        hznVar.m10945e(ikw.UNINITIALIZED);
        hznVar.m10946f(ilk.PORTRAIT);
        hznVar.m10942b(hzj.PHONE_LAYOUT);
        f30065a = hznVar.m10941a();
    }

    public hzo() {
    }

    public hzo(Size size, Size size2, Size size3, Integer num, boolean z, ilk ilkVar, ikw ikwVar, hzj hzjVar) {
        this.f30066b = size;
        this.f30067c = size2;
        this.f30068d = size3;
        this.f30069e = num;
        this.f30070f = z;
        this.f30071g = ilkVar;
        this.f30072h = ikwVar;
        this.f30073i = hzjVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10947a() {
        return (this.f30066b == null || this.f30067c == null || this.f30069e == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final hzn m10948b() {
        return new hzn(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hzo)) {
            return false;
        }
        hzo hzoVar = (hzo) obj;
        Size size = this.f30066b;
        if (size != null ? size.equals(hzoVar.f30066b) : hzoVar.f30066b == null) {
            Size size2 = this.f30067c;
            if (size2 != null ? size2.equals(hzoVar.f30067c) : hzoVar.f30067c == null) {
                Size size3 = this.f30068d;
                if (size3 != null ? size3.equals(hzoVar.f30068d) : hzoVar.f30068d == null) {
                    Integer num = this.f30069e;
                    if (num != null ? num.equals(hzoVar.f30069e) : hzoVar.f30069e == null) {
                        if (this.f30070f == hzoVar.f30070f && this.f30071g.equals(hzoVar.f30071g) && this.f30072h.equals(hzoVar.f30072h) && this.f30073i.equals(hzoVar.f30073i)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "CameraLayoutConstants{windowSize=" + String.valueOf(this.f30066b) + ", previewSize=" + String.valueOf(this.f30067c) + ", orientedPreviewSize=" + String.valueOf(this.f30068d) + ", sensorOrientationDegree=" + this.f30069e + ", isPreviewMaximized=false, hasCutout=" + this.f30070f + ", orientation=" + String.valueOf(this.f30071g) + ", mode=" + String.valueOf(this.f30072h) + ", decision=" + String.valueOf(this.f30073i) + "}";
    }

    public final int hashCode() {
        Size size = this.f30066b;
        int iHashCode = size == null ? 0 : size.hashCode();
        Size size2 = this.f30067c;
        int iHashCode2 = size2 == null ? 0 : size2.hashCode();
        int i = iHashCode ^ 1000003;
        Size size3 = this.f30068d;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (size3 == null ? 0 : size3.hashCode())) * 1000003;
        Integer num = this.f30069e;
        return ((((((((((iHashCode3 ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ 1237) * 1000003) ^ (true == this.f30070f ? 1231 : 1237)) * 1000003) ^ this.f30071g.hashCode()) * 1000003) ^ this.f30072h.hashCode()) * 1000003) ^ this.f30073i.hashCode();
    }
}
