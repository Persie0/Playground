package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s8b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u8b f60542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p8b f60543c;

    public /* synthetic */ s8b(u8b u8bVar, p8b p8bVar, int i) {
        this.f60541a = i;
        this.f60542b = u8bVar;
        this.f60543c = p8bVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f60541a;
        xfa xfaVar = xfa.f68157a;
        p8b p8bVar = this.f60543c;
        u8b u8bVar = this.f60542b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                u8bVar.f63599b.m20400B(bk8Var, p8bVar);
                break;
            default:
                bk8Var.getClass();
                u8bVar.f63600c.m21729K(bk8Var, p8bVar);
                break;
        }
        return xfaVar;
    }
}
