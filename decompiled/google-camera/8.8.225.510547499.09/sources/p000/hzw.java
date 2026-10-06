package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzw {

    /* JADX INFO: renamed from: a */
    public final boolean f30099a;

    /* JADX INFO: renamed from: b */
    public final mws f30100b;

    /* JADX INFO: renamed from: c */
    private final boolean f30101c;

    /* JADX INFO: renamed from: d */
    private final boolean f30102d;

    public hzw() {
    }

    public hzw(boolean z, boolean z2, boolean z3, mws mwsVar) {
        this.f30099a = z;
        this.f30101c = z2;
        this.f30102d = z3;
        this.f30100b = mwsVar;
    }

    /* JADX INFO: renamed from: a */
    public static hzv m10973a() {
        hzv hzvVar = new hzv();
        hzvVar.m10964b(false);
        hzvVar.m10965c(false);
        hzvVar.m10966d(false);
        int i = mws.f41739d;
        hzvVar.m10967e(mzr.f41857a);
        return hzvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzw) {
            hzw hzwVar = (hzw) obj;
            if (this.f30099a == hzwVar.f30099a && this.f30101c == hzwVar.f30101c && this.f30102d == hzwVar.f30102d && mkv.m16505M(this.f30100b, hzwVar.f30100b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.f30099a ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ (true != this.f30101c ? 1237 : 1231)) * 1000003) ^ (true == this.f30102d ? 1231 : 1237)) * 1000003) ^ this.f30100b.hashCode();
    }

    public final String toString() {
        return "LensPostCaptureFeatureCapability{supportDocumentScanning=" + this.f30099a + ", supportTextFilterIntent=" + this.f30101c + ", supportTranslate=" + this.f30102d + ", supportedTranslateLanguages=" + String.valueOf(this.f30100b) + "}";
    }
}
