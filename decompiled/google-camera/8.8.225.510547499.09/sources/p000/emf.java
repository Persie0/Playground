package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emf implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f14703a;

    /* JADX INFO: renamed from: b */
    private final Object f14704b;

    public emf(fws fwsVar, int i) {
        this.f14703a = i;
        this.f14704b = fwsVar;
    }

    public emf(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14703a = i;
        this.f14704b = gtdVar;
    }

    public emf(jfs jfsVar, int i, byte[] bArr, byte[] bArr2) {
        this.f14703a = i;
        this.f14704b = jfsVar;
    }

    public emf(oju ojuVar, int i) {
        this.f14703a = i;
        this.f14704b = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static emf m7518b(gtd gtdVar) {
        return new emf(gtdVar, 0, null, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: a */
    public final jwn m7519a() {
        switch (this.f14703a) {
            case 0:
                return ((gtd) this.f14704b).f26335b;
            case 1:
                return ((dbr) this.f14704b.get()).f10419b;
            case 2:
                return ((fws) this.f14704b).f23770g;
            case 3:
                return (jwn) ((mrq) ((etl) this.f14704b).m7866a()).f41482a;
            default:
                return ((jfs) this.f14704b).f33914a;
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f14703a) {
            case 0:
            case 1:
                break;
        }
        return m7519a();
    }
}
