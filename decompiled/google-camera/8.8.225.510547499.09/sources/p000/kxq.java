package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kxq implements kxs {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bfd f37669a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37670b;

    public /* synthetic */ kxq(bfd bfdVar, int i) {
        this.f37670b = i;
        this.f37669a = bfdVar;
    }

    @Override // p000.kxs
    /* JADX INFO: renamed from: a */
    public final Object mo15036a() {
        switch (this.f37670b) {
            case 0:
                return this.f37669a.mo2291b("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset");
            case 1:
                Integer numMo2291b = this.f37669a.mo2291b("http://ns.google.com/photos/1.0/camera/", "MicroVideo");
                return (numMo2291b == null || numMo2291b.intValue() <= 0) ? null : 1;
            default:
                Integer numMo2291b2 = this.f37669a.mo2291b("http://ns.google.com/photos/1.0/camera/", "MotionPhoto");
                return (numMo2291b2 == null || numMo2291b2.intValue() <= 0) ? null : 2;
        }
    }
}
