package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyc implements osr {

    /* JADX INFO: renamed from: a */
    private final Object f46808a;

    /* JADX INFO: renamed from: b */
    private final ThreadLocal f46809b;

    /* JADX INFO: renamed from: c */
    private final olw f46810c;

    public oyc(Object obj, ThreadLocal threadLocal) {
        this.f46808a = obj;
        this.f46809b = threadLocal;
        this.f46810c = new oyd(threadLocal);
    }

    @Override // p000.osr
    /* JADX INFO: renamed from: cK */
    public final Object mo18918cK(oly olyVar) {
        Object obj = this.f46809b.get();
        this.f46809b.set(this.f46808a);
        return obj;
    }

    @Override // p000.osr
    /* JADX INFO: renamed from: cL */
    public final void mo18919cL(Object obj) {
        this.f46809b.set(obj);
    }

    @Override // p000.oly
    public final Object fold(Object obj, onm onmVar) {
        return omn.m18702g(this, obj, onmVar);
    }

    @Override // p000.olv, p000.oly
    public final olv get(olw olwVar) {
        olwVar.getClass();
        if (ooc.m18737c(this.f46810c, olwVar)) {
            return this;
        }
        return null;
    }

    @Override // p000.olv
    public final olw getKey() {
        return this.f46810c;
    }

    @Override // p000.oly
    public final oly minusKey(olw olwVar) {
        olwVar.getClass();
        return ooc.m18737c(this.f46810c, olwVar) ? olz.f46282a : this;
    }

    @Override // p000.oly
    public final oly plus(oly olyVar) {
        olyVar.getClass();
        return omn.m18705j(this, olyVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f46808a + ", threadLocal = " + this.f46809b + ")";
    }
}
