package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mce implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f39934a;

    public mce(int i) {
        this.f39934a = i;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f39934a) {
            case 0:
                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
            case 1:
                return new mav();
            default:
                return new lij((char[]) null);
        }
    }
}
