package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kzt implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Object f37789a;

    /* JADX INFO: renamed from: b */
    private final Executor f37790b;

    /* JADX INFO: renamed from: c */
    private final lav f37791c;

    /* JADX INFO: renamed from: d */
    private final lab f37792d;

    public kzt(Object obj, lab labVar, Executor executor, lav lavVar) {
        this.f37789a = obj;
        this.f37790b = executor;
        this.f37791c = lavVar;
        this.f37792d = labVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f37789a;
        lab labVar = this.f37792d;
        Executor executor = this.f37790b;
        lav lavVar = this.f37791c;
        try {
            labVar.mo15098a(obj, executor).mo15104c(not.INSTANCE, new kzv(lavVar), new kzu(lavVar)).mo15109h(kzj.f37771a);
        } catch (kzy e) {
            lavVar.m15131m(e);
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    public final String toString() {
        return this.f37792d.toString();
    }
}
