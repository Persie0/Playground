package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nq7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oq7 f53140b;

    public /* synthetic */ nq7(fb2 fb2Var, oq7 oq7Var, int i) {
        this.f53139a = i;
        this.f53140b = oq7Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f53139a;
        xfa xfaVar = xfa.f68157a;
        oq7 oq7Var = this.f53140b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                oq7Var.f54736b.mo0a();
                break;
            case 1:
                n84 n84Var = (n84) obj;
                oq7Var.f54741g.m19862i((int) (n84Var.f52482a >> 32));
                oq7Var.f54742h.m19862i((int) (n84Var.f52482a & 4294967295L));
                break;
            case 2:
                oq7Var.getClass();
                oq7Var.m18215i(wa9.m23825b(((wa9) obj).f66569a));
                break;
            case 3:
                n84 n84Var2 = (n84) obj;
                oq7Var.f54743i.m19862i((int) (n84Var2.f52482a >> 32));
                oq7Var.f54744j.m19862i((int) (n84Var2.f52482a & 4294967295L));
                break;
            default:
                oq7Var.getClass();
                oq7Var.m18214h(wa9.m23824a(((wa9) obj).f66569a));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ nq7(oq7 oq7Var, int i) {
        this.f53139a = i;
        this.f53140b = oq7Var;
    }
}
