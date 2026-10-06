package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dvk implements dvf {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12657c;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ dvk f12656b = new dvk(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ dvk f12655a = new dvk(0);

    private /* synthetic */ dvk(int i) {
        this.f12657c = i;
    }

    @Override // p000.dvf
    /* JADX INFO: renamed from: a */
    public final boolean mo6770a(dvg dvgVar) {
        switch (this.f12657c) {
            case 0:
                return false;
            default:
                synchronized (dvgVar.f12640a) {
                    dvgVar.f12642c = 0;
                    break;
                }
                return true;
        }
    }
}
