package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olz implements Serializable, oly {

    /* JADX INFO: renamed from: a */
    public static final olz f46282a = new olz();
    private static final long serialVersionUID = 0;

    private olz() {
    }

    private final Object readResolve() {
        return f46282a;
    }

    @Override // p000.oly
    public final Object fold(Object obj, onm onmVar) {
        return obj;
    }

    @Override // p000.oly
    public final olv get(olw olwVar) {
        olwVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p000.oly
    public final oly minusKey(olw olwVar) {
        olwVar.getClass();
        return this;
    }

    @Override // p000.oly
    public final oly plus(oly olyVar) {
        olyVar.getClass();
        return olyVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
