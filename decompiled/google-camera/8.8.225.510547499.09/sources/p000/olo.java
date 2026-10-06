package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olo implements olw {

    /* JADX INFO: renamed from: a */
    private final oni f46261a;

    /* JADX INFO: renamed from: b */
    private final olw f46262b;

    public olo(olw olwVar, oni oniVar) {
        this.f46261a = oniVar;
        this.f46262b = olwVar instanceof olo ? ((olo) olwVar).f46262b : olwVar;
    }

    /* JADX INFO: renamed from: a */
    public final olv m18635a(olv olvVar) {
        return (olv) this.f46261a.mo1803a(olvVar);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18636b(olw olwVar) {
        olwVar.getClass();
        return olwVar == this || this.f46262b == olwVar;
    }

    public olo() {
        throw null;
    }
}
