package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvd extends jxd {

    /* JADX INFO: renamed from: a */
    public final jwn f23623a;

    public fvd(jww jwwVar) {
        super(jwwVar);
        this.f23623a = jwwVar;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        switch (((Integer) obj).intValue()) {
            case 1:
                return fvc.AUTO;
            case 2:
                return fvc.INCANDESCENT;
            case 3:
                return fvc.FLUORESCENT;
            case 4:
            default:
                throw new RuntimeException("Unknown WB input value");
            case 5:
                return fvc.f23619c;
            case 6:
                return fvc.CLOUDY;
        }
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* bridge */ /* synthetic */ Object mo3610c(Object obj) {
        switch ((fvc) obj) {
            case AUTO:
                return 1;
            case CLOUDY:
                return 6;
            case f23619c:
                return 5;
            case INCANDESCENT:
                return 2;
            case FLUORESCENT:
                return 3;
            default:
                throw new RuntimeException("Unknown WB output value");
        }
    }
}
