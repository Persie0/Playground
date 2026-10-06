package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class grb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final grc f26103a;

    /* JADX INFO: renamed from: b */
    private final grv f26104b;

    /* JADX INFO: renamed from: c */
    private final kbz f26105c;

    /* JADX INFO: renamed from: d */
    private final gtd f26106d;

    public grb(grc grcVar, gtd gtdVar, grv grvVar, kbz kbzVar, byte[] bArr) {
        this.f26103a = grcVar;
        this.f26106d = gtdVar;
        this.f26104b = grvVar;
        this.f26105c = kbzVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        this.f26105c.mo13961e("TaskDoneWrapper#run");
        try {
            this.f26104b.run();
            this.f26103a.m9661a(this.f26104b);
            Object obj = this.f26106d.f26334a;
            synchronized (this.f26103a.f26113f) {
                if (((grj) obj).f26140b.m9637a(-1) == 0) {
                    ((grj) obj).f26140b.m9640d();
                    ?? r1 = this.f26106d.f26335b;
                    grc grcVar = this.f26103a;
                    synchronized (grcVar.f26112e) {
                        for (kpw kpwVar : r1) {
                            if (((gra) grcVar.f26112e.get(kpwVar)) != null && !grcVar.f26114g.contains(kpwVar)) {
                                grcVar.f26114g.add(kpwVar);
                            }
                        }
                    }
                    Runnable runnable = ((grj) obj).f26141c;
                    if (runnable != null) {
                        this.f26105c.mo13961e("TaskDoneWrapper#done#run");
                        Executor executor = this.f26104b.f26186d;
                        if (executor == null) {
                            runnable.run();
                        } else {
                            executor.execute(runnable);
                        }
                        this.f26105c.mo13962f();
                    }
                }
            }
            this.f26105c.mo13962f();
        } catch (Throwable th) {
            this.f26103a.m9661a(this.f26104b);
            throw th;
        }
    }
}
