package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc9 extends qh9 implements vc9, dh9, t66 {

    /* JADX INFO: renamed from: b */
    public pc9 f57585b;

    @Override // p000.vc9
    /* JADX INFO: renamed from: b */
    public final yc9 mo19860b() {
        return tr3.f62761g;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f57585b;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: f */
    public final rh9 mo19144f(rh9 rh9Var, rh9 rh9Var2, rh9 rh9Var3) {
        if (((pc9) rh9Var2).f55951c == ((pc9) rh9Var3).f55951c) {
            return rh9Var2;
        }
        return null;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.getClass();
        this.f57585b = (pc9) rh9Var;
    }

    @Override // p000.dh9
    public final Object getValue() {
        return Float.valueOf(m19861h());
    }

    /* JADX INFO: renamed from: h */
    public final float m19861h() {
        return ((pc9) nc9.m17368t(this.f57585b, this)).f55951c;
    }

    /* JADX INFO: renamed from: i */
    public final void m19862i(float f) {
        jc9 jc9VarM17358j;
        pc9 pc9Var = (pc9) nc9.m17356h(this.f57585b);
        if (pc9Var.f55951c == f) {
            return;
        }
        pc9 pc9Var2 = this.f57585b;
        synchronized (nc9.f52602c) {
            jc9VarM17358j = nc9.m17358j();
            ((pc9) nc9.m17363o(pc9Var2, this, jc9VarM17358j, pc9Var)).f55951c = f;
        }
        nc9.m17362n(jc9VarM17358j, this);
    }

    @Override // p000.t66
    public final void setValue(Object obj) {
        m19862i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((pc9) nc9.m17356h(this.f57585b)).f55951c + ")@" + hashCode();
    }
}
