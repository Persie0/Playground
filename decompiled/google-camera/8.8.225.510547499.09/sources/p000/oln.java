package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oln implements olv {
    private final olw key;

    public oln(olw olwVar) {
        olwVar.getClass();
        this.key = olwVar;
    }

    @Override // p000.oly
    public Object fold(Object obj, onm onmVar) {
        return omn.m18702g(this, obj, onmVar);
    }

    @Override // p000.olv, p000.oly
    public olv get(olw olwVar) {
        return omn.m18703h(this, olwVar);
    }

    @Override // p000.olv
    public olw getKey() {
        return this.key;
    }

    @Override // p000.oly
    public oly minusKey(olw olwVar) {
        return omn.m18704i(this, olwVar);
    }

    @Override // p000.oly
    public oly plus(oly olyVar) {
        return omn.m18705j(this, olyVar);
    }
}
