package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvi implements Executor {

    /* JADX INFO: renamed from: a */
    static final jvd f34887a = new jvd(jvd.f34877a);

    /* JADX INFO: renamed from: b */
    public final jvd f34888b = f34887a;

    /* JADX INFO: renamed from: c */
    private final Executor f34889c;

    public jvi(Executor executor) {
        this.f34889c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34889c.execute(new bso(this, runnable, 2));
    }
}
