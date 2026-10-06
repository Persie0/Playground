package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oym extends orq {

    /* JADX INFO: renamed from: d */
    public final oyj f46843d;

    public oym(int i, int i2, long j) {
        this.f46843d = new oyj(i, i2, j);
    }

    @Override // p000.orq
    /* JADX INFO: renamed from: c */
    public final Executor mo18970c() {
        return this.f46843d;
    }

    public void close() {
        this.f46843d.close();
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        oyj.m19182e(this.f46843d, runnable);
    }
}
