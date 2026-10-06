package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jgq {

    /* JADX INFO: renamed from: d */
    public Object f33975d;

    /* JADX INFO: renamed from: e */
    public boolean f33976e = false;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ jgw f33977f;

    public jgq(jgw jgwVar, Object obj) {
        this.f33977f = jgwVar;
        this.f33975d = obj;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo13143b();

    /* JADX INFO: renamed from: d */
    protected abstract void mo13145d();

    /* JADX INFO: renamed from: e */
    public final void m13148e() {
        synchronized (this) {
            this.f33975d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13149f() {
        m13148e();
        synchronized (this.f33977f.f33991h) {
            this.f33977f.f33991h.remove(this);
        }
    }
}
