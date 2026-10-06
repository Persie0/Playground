package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfx implements cfc {

    /* JADX INFO: renamed from: a */
    public final dhv f5545a;

    /* JADX INFO: renamed from: b */
    public final jww f5546b = new jwf(0);

    /* JADX INFO: renamed from: c */
    public final jww f5547c = new jwf(false);

    /* JADX INFO: renamed from: d */
    public final ihk f5548d;

    /* JADX INFO: renamed from: e */
    private final jwn f5549e;

    public cfx(ihk ihkVar, dhv dhvVar, hah hahVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5548d = ihkVar;
        this.f5545a = dhvVar;
        this.f5549e = hahVar.mo10029a(gzy.f27058q);
    }

    /* JADX INFO: renamed from: e */
    public static String m3611e(kmg kmgVar, String str) {
        return "pref_camera_dirty_lens_history_key".concat(String.valueOf(str == null ? kmgVar.f36540a : String.format("%s-%s", kmgVar.f36540a, str)));
    }

    @Override // p000.cfc
    /* JADX INFO: renamed from: a */
    public final jwn mo3590a() {
        return jwr.m13634d(this.f5547c, this.f5549e);
    }

    @Override // p000.cfc
    /* JADX INFO: renamed from: b */
    public final jww mo3591b() {
        return this.f5546b;
    }

    @Override // p000.cfc
    /* JADX INFO: renamed from: c */
    public final boolean mo3592c() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final cfw m3612d(kmg kmgVar) {
        String strM3611e = m3611e(kmgVar, null);
        return new cfw(strM3611e, this.f5548d.m11351s(strM3611e, ""), this.f5545a);
    }
}
