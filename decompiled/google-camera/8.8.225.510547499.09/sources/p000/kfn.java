package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kfn {

    /* JADX INFO: renamed from: a */
    public final kmg f35837a;

    /* JADX INFO: renamed from: b */
    public final kfx f35838b;

    /* JADX INFO: renamed from: c */
    public final kgb f35839c;

    /* JADX INFO: renamed from: d */
    public final kgb f35840d;

    /* JADX INFO: renamed from: e */
    public final kgb f35841e;

    /* JADX INFO: renamed from: f */
    public final kgb f35842f;

    /* JADX INFO: renamed from: g */
    public final mws f35843g;

    /* JADX INFO: renamed from: h */
    public final mxk f35844h;

    /* JADX INFO: renamed from: i */
    public final kea f35845i;

    /* JADX INFO: renamed from: j */
    public final kev f35846j;

    /* JADX INFO: renamed from: k */
    public final long f35847k;

    /* JADX INFO: renamed from: l */
    public final int f35848l;

    /* JADX INFO: renamed from: m */
    public final mxk f35849m;

    /* JADX INFO: renamed from: n */
    public final kfv f35850n;

    /* JADX INFO: renamed from: o */
    private final kgb f35851o;

    public kfn() {
    }

    public kfn(kmg kmgVar, kfx kfxVar, kgb kgbVar, kgb kgbVar2, kgb kgbVar3, kgb kgbVar4, kgb kgbVar5, kfv kfvVar, mws mwsVar, mxk mxkVar, kea keaVar, kev kevVar, long j, int i, mxk mxkVar2, byte[] bArr) {
        this.f35837a = kmgVar;
        this.f35838b = kfxVar;
        this.f35839c = kgbVar;
        this.f35840d = kgbVar2;
        this.f35851o = kgbVar3;
        this.f35841e = kgbVar4;
        this.f35842f = kgbVar5;
        this.f35850n = kfvVar;
        this.f35843g = mwsVar;
        this.f35844h = mxkVar;
        this.f35845i = keaVar;
        this.f35846j = kevVar;
        this.f35847k = j;
        this.f35848l = i;
        this.f35849m = mxkVar2;
    }

    /* JADX INFO: renamed from: a */
    public static kfm m14151a() {
        kfm kfmVar = new kfm();
        kfmVar.m14146g(kfx.NORMAL);
        kfmVar.m14149j(new kgb(1));
        kfmVar.f35819a = new kgb(2);
        kfmVar.f35820b = new kgb(-1);
        kfmVar.f35821c = new kgb(1);
        kfmVar.m14148i(new kgb(5));
        kfmVar.m14150k(kfi.f35818a);
        kfmVar.m14144e(new kfw());
        kfmVar.f35822d = 3100010001000L;
        byte b = kfmVar.f35824f;
        kfmVar.f35823e = 60;
        kfmVar.f35824f = (byte) (b | 3);
        kfmVar.m14147h(mzx.f41874a);
        kfmVar.f35824f = (byte) (kfmVar.f35824f | 12);
        return kfmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfn) {
            kfn kfnVar = (kfn) obj;
            if (this.f35837a.equals(kfnVar.f35837a) && this.f35838b.equals(kfnVar.f35838b) && this.f35839c.equals(kfnVar.f35839c) && this.f35840d.equals(kfnVar.f35840d) && this.f35851o.equals(kfnVar.f35851o) && this.f35841e.equals(kfnVar.f35841e) && this.f35842f.equals(kfnVar.f35842f) && this.f35850n.equals(kfnVar.f35850n) && mkv.m16505M(this.f35843g, kfnVar.f35843g) && this.f35844h.equals(kfnVar.f35844h) && this.f35845i.equals(kfnVar.f35845i) && this.f35846j.equals(kfnVar.f35846j) && this.f35847k == kfnVar.f35847k && this.f35848l == kfnVar.f35848l && this.f35849m.equals(kfnVar.f35849m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.f35837a.f36541b ^ 1000003) * 1000003) ^ this.f35838b.hashCode()) * 1000003) ^ this.f35839c.hashCode()) * 1000003) ^ this.f35840d.hashCode()) * 1000003) ^ this.f35851o.hashCode()) * 1000003) ^ this.f35841e.hashCode()) * 1000003) ^ this.f35842f.hashCode()) * 1000003) ^ this.f35850n.hashCode()) * 1000003) ^ this.f35843g.hashCode()) * 1000003) ^ this.f35844h.hashCode()) * 1000003) ^ this.f35845i.hashCode()) * 1000003) ^ this.f35846j.hashCode();
        long j = this.f35847k;
        return (((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f35848l) * 1000003) ^ this.f35849m.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "FrameServerConfig{cameraId=" + String.valueOf(this.f35837a) + ", operatingMode=" + String.valueOf(this.f35838b) + ", template=" + String.valueOf(this.f35839c) + ", captureTemplate=" + String.valueOf(this.f35840d) + ", reprocessingTemplate=" + String.valueOf(this.f35851o) + ", repeatingTemplate=" + String.valueOf(this.f35841e) + ", repeatingCaptureTemplate=" + String.valueOf(this.f35842f) + ", frameListener=" + String.valueOf(this.f35850n) + ", streams=" + String.valueOf(this.f35843g) + ", sessionParameters=" + String.valueOf(this.f35844h) + ", fatalErrorHandler=" + String.valueOf(this.f35845i) + ", cameraDeviceErrorListener=" + String.valueOf(this.f35846j) + ", result3ATimeoutNs=" + this.f35847k + ", result3ATimeoutFrameCount=" + this.f35848l + ", quirks=" + String.valueOf(this.f35849m) + ", autoResume=false, useCameraPipe=false}";
    }
}
