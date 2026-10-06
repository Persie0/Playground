package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgv implements Runnable {

    /* JADX INFO: renamed from: a */
    public boolean f35980a;

    /* JADX INFO: renamed from: b */
    public boolean f35981b;

    /* JADX INFO: renamed from: d */
    public boolean f35983d;

    /* JADX INFO: renamed from: f */
    public boolean f35985f;

    /* JADX INFO: renamed from: g */
    public boolean f35986g;

    /* JADX INFO: renamed from: i */
    private final ihk f35988i;

    /* JADX INFO: renamed from: h */
    public kfv f35987h = null;

    /* JADX INFO: renamed from: c */
    public kfd f35982c = null;

    /* JADX INFO: renamed from: e */
    public kpp f35984e = null;

    public kgv(ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f35988i = ihkVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        kfv kfvVar = this.f35987h;
        kfvVar.getClass();
        if (this.f35980a) {
            kfvVar.mo4006bb();
        }
        if (this.f35981b) {
            kfv kfvVar2 = this.f35987h;
            this.f35982c.getClass();
            kfvVar2.mo9369bx();
        }
        if (this.f35983d) {
            this.f35987h.mo6748bo(this.f35984e);
        }
        if (this.f35985f) {
            this.f35987h.mo5510bi();
        }
        if (this.f35986g) {
            this.f35987h.mo4007bc();
        }
        this.f35987h = null;
        this.f35980a = false;
        this.f35981b = false;
        this.f35982c = null;
        this.f35983d = false;
        this.f35984e = null;
        this.f35985f = false;
        this.f35986g = false;
        ihk ihkVar = this.f35988i;
        synchronized (ihkVar.f30967b) {
            ihkVar.f30967b.add(this);
        }
    }
}
