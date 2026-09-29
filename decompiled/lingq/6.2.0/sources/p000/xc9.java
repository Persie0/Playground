package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc9 extends qh9 implements vc9 {

    /* JADX INFO: renamed from: b */
    public final yc9 f68067b;

    /* JADX INFO: renamed from: c */
    public wc9 f68068c;

    public xc9(Object obj, yc9 yc9Var) {
        this.f68067b = yc9Var;
        jc9 jc9VarM17358j = nc9.m17358j();
        wc9 wc9Var = new wc9(obj, jc9VarM17358j.mo3582g());
        if (!(jc9VarM17358j instanceof yn3)) {
            wc9Var.f59323b = new wc9(obj, 1L);
        }
        this.f68068c = wc9Var;
    }

    @Override // p000.vc9
    /* JADX INFO: renamed from: b */
    public final yc9 mo19860b() {
        return this.f68067b;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f68068c;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: f */
    public final rh9 mo19144f(rh9 rh9Var, rh9 rh9Var2, rh9 rh9Var3) {
        if (this.f68067b.mo21078f(((wc9) rh9Var2).f66620c, ((wc9) rh9Var3).f66620c)) {
            return rh9Var2;
        }
        return null;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.getClass();
        this.f68068c = (wc9) rh9Var;
    }

    @Override // p000.dh9
    public final Object getValue() {
        return ((wc9) nc9.m17368t(this.f68068c, this)).f66620c;
    }

    @Override // p000.t66
    public final void setValue(Object obj) {
        jc9 jc9VarM17358j;
        wc9 wc9Var = (wc9) nc9.m17356h(this.f68068c);
        if (this.f68067b.mo21078f(wc9Var.f66620c, obj)) {
            return;
        }
        wc9 wc9Var2 = this.f68068c;
        synchronized (nc9.f52602c) {
            jc9VarM17358j = nc9.m17358j();
            ((wc9) nc9.m17363o(wc9Var2, this, jc9VarM17358j, wc9Var)).f66620c = obj;
        }
        nc9.m17362n(jc9VarM17358j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((wc9) nc9.m17356h(this.f68068c)).f66620c + ")@" + hashCode();
    }
}
