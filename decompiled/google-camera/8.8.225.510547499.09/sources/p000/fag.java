package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fag implements faz {

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f21106h;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ fag f21105g = new fag(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ fag f21104f = new fag(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fag f21103e = new fag(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fag f21102d = new fag(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fag f21101c = new fag(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ fag f21100b = new fag(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ fag f21099a = new fag(0);

    private /* synthetic */ fag(int i) {
        this.f21106h = i;
    }

    @Override // p000.faz
    /* JADX INFO: renamed from: a */
    public final void mo8080a(fbp fbpVar) {
        switch (this.f21106h) {
            case 0:
                int i = fan.f21134e;
                if (fbpVar instanceof ezr) {
                    ((ezr) fbpVar).m8074a();
                }
                break;
            case 1:
                int i2 = fan.f21134e;
                if (fbpVar instanceof ezz) {
                    ((ezz) fbpVar).m8076a();
                }
                break;
            case 2:
                if (fbpVar instanceof far) {
                    ((far) fbpVar).mo5929c();
                }
                break;
            case 3:
                if (fbpVar instanceof fap) {
                    ((fap) fbpVar).m8084a();
                }
                break;
            case 4:
                if (fbpVar instanceof fas) {
                    ((fas) fbpVar).mo8085a();
                }
                break;
            case 5:
                int i3 = fba.f21187l;
                if (fbpVar instanceof fbl) {
                    ((fbl) fbpVar).mo3523bF();
                }
                break;
            default:
                int i4 = fba.f21187l;
                if (fbpVar instanceof fbn) {
                    ((fbn) fbpVar).mo3524bG();
                }
                break;
        }
    }
}
