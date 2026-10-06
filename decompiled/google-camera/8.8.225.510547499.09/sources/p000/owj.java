package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class owj implements oly {

    /* JADX INFO: renamed from: a */
    public final Throwable f46718a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ oly f46719b;

    public owj(Throwable th, oly olyVar) {
        olyVar.getClass();
        this.f46718a = th;
        this.f46719b = olyVar;
    }

    @Override // p000.oly
    public final Object fold(Object obj, onm onmVar) {
        return this.f46719b.fold(obj, onmVar);
    }

    @Override // p000.oly
    public final olv get(olw olwVar) {
        olwVar.getClass();
        return this.f46719b.get(olwVar);
    }

    @Override // p000.oly
    public final oly minusKey(olw olwVar) {
        olwVar.getClass();
        return this.f46719b.minusKey(olwVar);
    }

    @Override // p000.oly
    public final oly plus(oly olyVar) {
        olyVar.getClass();
        return this.f46719b.plus(olyVar);
    }
}
