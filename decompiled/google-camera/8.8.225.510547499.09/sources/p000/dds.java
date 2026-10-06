package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dds implements Executor {

    /* JADX INFO: renamed from: a */
    private final Executor f10581a;

    /* JADX INFO: renamed from: b */
    private final kbo f10582b;

    public dds(kbo kboVar, dhv dhvVar, Executor executor) {
        this.f10581a = executor;
        this.f10582b = kboVar.mo6314a("SQLiteExpnCatchr");
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10581a.execute(new aza(this.f10582b, runnable, 3));
    }
}
