package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxy implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kxz f37688a;

    /* JADX INFO: renamed from: b */
    private final Executor f37689b;

    public kxy(kxz kxzVar, Executor executor) {
        this.f37688a = kxzVar;
        this.f37689b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f37689b.execute(new kds(this, runnable, 13));
    }
}
