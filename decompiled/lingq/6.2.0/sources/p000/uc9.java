package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc9 extends qh9 implements vc9, dh9, t66 {

    /* JADX INFO: renamed from: b */
    public tc9 f63721b;

    @Override // p000.vc9
    /* JADX INFO: renamed from: b */
    public final yc9 mo19860b() {
        return tr3.f62761g;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f63721b;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: f */
    public final rh9 mo19144f(rh9 rh9Var, rh9 rh9Var2, rh9 rh9Var3) {
        if (((tc9) rh9Var2).f62155c == ((tc9) rh9Var3).f62155c) {
            return rh9Var2;
        }
        return null;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.getClass();
        this.f63721b = (tc9) rh9Var;
    }

    @Override // p000.dh9
    public final Object getValue() {
        return Long.valueOf(m22673h());
    }

    /* JADX INFO: renamed from: h */
    public final long m22673h() {
        return ((tc9) nc9.m17368t(this.f63721b, this)).f62155c;
    }

    /* JADX INFO: renamed from: i */
    public final void m22674i(long j) {
        jc9 jc9VarM17358j;
        tc9 tc9Var = (tc9) nc9.m17356h(this.f63721b);
        if (tc9Var.f62155c != j) {
            tc9 tc9Var2 = this.f63721b;
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                ((tc9) nc9.m17363o(tc9Var2, this, jc9VarM17358j, tc9Var)).f62155c = j;
            }
            nc9.m17362n(jc9VarM17358j, this);
        }
    }

    @Override // p000.t66
    public final void setValue(Object obj) {
        m22674i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((tc9) nc9.m17356h(this.f63721b)).f62155c + ")@" + hashCode();
    }
}
