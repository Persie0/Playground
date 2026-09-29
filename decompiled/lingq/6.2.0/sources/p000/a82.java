package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a82 implements k73 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f336b;

    public /* synthetic */ a82(Object obj, int i) {
        this.f335a = i;
        this.f336b = obj;
    }

    @Override // p000.k73
    /* JADX INFO: renamed from: a */
    public final float mo169a() {
        l7a state;
        l7a state2;
        int i = this.f335a;
        Object obj = this.f336b;
        switch (i) {
            case 0:
                k7a k7aVar = ((o89) obj).f54014l;
                if (k7aVar == null || (state = k7aVar.getState()) == null) {
                    return 0.0f;
                }
                return state.m15979b();
            case 1:
                k7a k7aVar2 = ((ida) obj).f44004r;
                if (k7aVar2 == null || (state2 = k7aVar2.getState()) == null) {
                    return 0.0f;
                }
                return state2.m15979b();
            default:
                return ((Number) ((mp7) obj).f51704a.m745d()).floatValue();
        }
    }
}
