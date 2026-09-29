package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class sc9 extends qh9 implements vc9, dh9, t66 {

    /* JADX INFO: renamed from: b */
    public rc9 f60687b;

    @Override // p000.vc9
    /* JADX INFO: renamed from: b */
    public final yc9 mo19860b() {
        return tr3.f62761g;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f60687b;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: f */
    public final rh9 mo19144f(rh9 rh9Var, rh9 rh9Var2, rh9 rh9Var3) {
        if (((rc9) rh9Var2).f59074c == ((rc9) rh9Var3).f59074c) {
            return rh9Var2;
        }
        return null;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.getClass();
        this.f60687b = (rc9) rh9Var;
    }

    @Override // p000.dh9
    public final Object getValue() {
        return Integer.valueOf(m21222h());
    }

    /* JADX INFO: renamed from: h */
    public final int m21222h() {
        return ((rc9) nc9.m17368t(this.f60687b, this)).f59074c;
    }

    /* JADX INFO: renamed from: i */
    public final void m21223i(int i) {
        jc9 jc9VarM17358j;
        rc9 rc9Var = (rc9) nc9.m17356h(this.f60687b);
        if (rc9Var.f59074c != i) {
            rc9 rc9Var2 = this.f60687b;
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                ((rc9) nc9.m17363o(rc9Var2, this, jc9VarM17358j, rc9Var)).f59074c = i;
            }
            nc9.m17362n(jc9VarM17358j, this);
        }
    }

    @Override // p000.t66
    public final void setValue(Object obj) {
        m21223i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((rc9) nc9.m17356h(this.f60687b)).f59074c + ")@" + hashCode();
    }
}
