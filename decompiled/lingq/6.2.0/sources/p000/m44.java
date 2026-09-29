package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m44 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50565a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f50566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f50567c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dh9 f50568d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f50569e;

    public /* synthetic */ m44(ld9 ld9Var, zi3 zi3Var, t66 t66Var, t66 t66Var2) {
        this.f50566b = ld9Var;
        this.f50567c = zi3Var;
        this.f50568d = t66Var;
        this.f50569e = t66Var2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f50565a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f50569e;
        dh9 dh9Var = this.f50568d;
        Object obj2 = this.f50567c;
        Object obj3 = this.f50566b;
        switch (i) {
            case 0:
                Comparable comparable = (Comparable) obj3;
                l44 l44Var = (l44) dh9Var;
                Comparable comparable2 = (Comparable) obj2;
                k44 k44Var = (k44) obj;
                if (!comparable.equals(l44Var.f49014a) || !comparable2.equals(l44Var.f49015b)) {
                    l44Var.f49014a = comparable;
                    l44Var.f49015b = comparable2;
                    l44Var.f49018e = new or9(k44Var, l44Var.f49016c, comparable, comparable2, null);
                    ((xc9) l44Var.f49022i.f1551b).setValue(Boolean.TRUE);
                    l44Var.f49019f = false;
                    l44Var.f49020g = true;
                }
                break;
            default:
                ld9 ld9Var = (ld9) obj3;
                zi3 zi3Var = (zi3) obj2;
                t66 t66Var = (t66) dh9Var;
                t66 t66Var2 = (t66) obj;
                if (ld9Var != null) {
                    ((pa2) ld9Var).m19004a();
                }
                zi3Var.invoke(((vv9) t66Var.getValue()).f65990a.f54604b, ((vv9) t66Var2.getValue()).f65990a.f54604b);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ m44(Comparable comparable, l44 l44Var, Comparable comparable2, k44 k44Var) {
        this.f50566b = comparable;
        this.f50568d = l44Var;
        this.f50567c = comparable2;
        this.f50569e = k44Var;
    }
}
