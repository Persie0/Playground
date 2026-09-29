package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s86 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o86 f60512b;

    public /* synthetic */ s86(o86 o86Var, int i) {
        this.f60511a = i;
        this.f60512b = o86Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.f60511a;
        o86 o86Var = this.f60512b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                zContains = o86Var.m17848b().contains(str);
                break;
            default:
                str.getClass();
                zContains = o86Var.m17848b().contains(str);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
