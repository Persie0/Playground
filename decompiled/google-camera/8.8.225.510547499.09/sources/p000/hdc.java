package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hdc implements hdi {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f27296e;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hdc f27295d = new hdc(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hdc f27294c = new hdc(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ hdc f27293b = new hdc(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ hdc f27292a = new hdc(0);

    private /* synthetic */ hdc(int i) {
        this.f27296e = i;
    }

    @Override // p000.hdi
    /* JADX INFO: renamed from: a */
    public final void mo10117a(Object obj) {
        switch (this.f27296e) {
            case 0:
                hdz hdzVar = (hdz) obj;
                lku.m15613H(hdzVar.f27413d);
                if (hdzVar.f27414e) {
                    hdzVar.f27410a.mo3969v();
                }
                hdzVar.f27410a.mo3950a();
                hdzVar.f27412c.mo10130a();
                hdzVar.f27415f.close();
                break;
            case 1:
                ((hdz) obj).m10135c(false);
                break;
            case 2:
                ((hdz) obj).m10135c(true);
                break;
            default:
                hdz hdzVar2 = (hdz) obj;
                lku.m15613H(hdzVar2.f27413d);
                if (hdzVar2.f27411b.f27489g.mo16813g()) {
                    ((hem) hdzVar2.f27411b.f27489g.mo16809c()).mo6091d();
                }
                break;
        }
    }
}
