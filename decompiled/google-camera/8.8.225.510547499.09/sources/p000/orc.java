package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class orc implements Executor {

    /* JADX INFO: renamed from: a */
    public final oqo f46445a;

    public orc(oqo oqoVar) {
        this.f46445a = oqoVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f46445a.mo18915d(olz.f46282a, runnable);
    }

    public final String toString() {
        return this.f46445a.toString();
    }
}
