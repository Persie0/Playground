package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcf implements Executor {

    /* JADX INFO: renamed from: a */
    private final Executor f35557a;

    /* JADX INFO: renamed from: b */
    private final kbz f35558b;

    /* JADX INFO: renamed from: c */
    private final String f35559c;

    public kcf(Executor executor, kbz kbzVar, String str) {
        this.f35557a = executor;
        this.f35558b = kbzVar;
        this.f35559c = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f35557a.execute(this.f35558b.mo13959c(this.f35559c, runnable));
    }
}
