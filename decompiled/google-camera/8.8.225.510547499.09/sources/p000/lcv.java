package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcv implements lby {

    /* JADX INFO: renamed from: c */
    private final lby f37957c;

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f37955a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f37956b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private final Throwable f37958d = new Throwable("Context stacktrace");

    public lcv(lby lbyVar) {
        this.f37957c = lbyVar;
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        return this.f37957c.mo15079a();
    }

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37956b.set(true);
        this.f37957c.close();
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: d */
    public final ldb mo15152d() {
        return this.f37957c.mo15152d();
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: e */
    public final leb mo15153e() {
        return this.f37957c.mo15153e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f37957c.execute(new lcu(this, runnable, this.f37958d, 0));
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: f */
    public final void mo15154f(lde ldeVar, Runnable runnable) {
        this.f37957c.mo15154f(ldeVar, runnable);
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: g */
    public final boolean mo15155g() {
        return this.f37957c.mo15155g();
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: h */
    public final lgg mo15156h(Object obj, msi msiVar) {
        return this.f37957c.mo15156h(obj, msiVar);
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: i */
    public final ldx mo15157i() {
        return this.f37957c.mo15157i();
    }
}
