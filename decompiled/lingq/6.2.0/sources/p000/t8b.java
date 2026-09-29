package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t8b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u8b f61993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bk8 f61994c;

    public /* synthetic */ t8b(u8b u8bVar, bk8 bk8Var, int i) {
        this.f61992a = i;
        this.f61993b = u8bVar;
        this.f61994c = bk8Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f61992a;
        xfa xfaVar = xfa.f68157a;
        bk8 bk8Var = this.f61994c;
        u8b u8bVar = this.f61993b;
        C3275kv c3275kv = (C3275kv) obj;
        switch (i) {
            case 0:
                c3275kv.getClass();
                u8bVar.m22565a(bk8Var, c3275kv);
                break;
            default:
                c3275kv.getClass();
                u8bVar.m22566b(bk8Var, c3275kv);
                break;
        }
        return xfaVar;
    }
}
