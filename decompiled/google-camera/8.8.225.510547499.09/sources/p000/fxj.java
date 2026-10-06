package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxj implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f23798a;

    /* JADX INFO: renamed from: b */
    private final Object f23799b;

    public fxj(bkn bknVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f23798a = i;
        this.f23799b = bknVar;
    }

    public fxj(oju ojuVar, int i) {
        this.f23798a = i;
        this.f23799b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public final fvu m8922a() {
        switch (this.f23798a) {
            case 0:
                return (fvu) ((bkn) this.f23799b).f3651a;
            default:
                return new fvu(((cwb) this.f23799b).get().mo14116c().mo14139d());
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f23798a) {
            case 0:
                break;
        }
        return m8922a();
    }
}
