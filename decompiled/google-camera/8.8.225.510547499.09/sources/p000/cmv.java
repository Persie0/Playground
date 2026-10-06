package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f6322a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6323b;

    public cmv(oju ojuVar, int i) {
        this.f6323b = i;
        this.f6322a = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static cmv m3972b(oju ojuVar) {
        return new cmv(ojuVar, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m3973a() {
        switch (this.f6323b) {
            case 0:
                dhv dhvVar = (dhv) this.f6322a.get();
                return Integer.valueOf(dhvVar.mo6173a(dib.f11383y).isPresent() ? ((Integer) dhvVar.mo6173a(dib.f11383y).get()).intValue() : 60);
            case 1:
                return Integer.valueOf(true != ((fxj) this.f6322a).m8922a().mo14537F() ? 4 : 2);
            case 2:
                return Integer.valueOf(((Integer) ((dhv) this.f6322a.get()).mo6173a(dhp.f11145b).get()).intValue());
            case 3:
                return Integer.valueOf(((ebv) this.f6322a.get()).f13302d);
            case 4:
                return Integer.valueOf(((ebv) this.f6322a.get()).f13303e);
            default:
                return Integer.valueOf(((ebv) this.f6322a.get()).f13300b);
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f6323b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return m3973a();
    }
}
