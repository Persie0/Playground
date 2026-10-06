package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kxr implements kxs {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37673c;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ kxr f37672b = new kxr(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kxr f37671a = new kxr(0);

    private /* synthetic */ kxr(int i) {
        this.f37673c = i;
    }

    @Override // p000.kxs
    /* JADX INFO: renamed from: a */
    public final Object mo15036a() {
        switch (this.f37673c) {
            case 0:
                return (Integer) lqi.m15878w("payload length");
            default:
                return (Integer) lqi.m15878w("determining file format version");
        }
    }
}
