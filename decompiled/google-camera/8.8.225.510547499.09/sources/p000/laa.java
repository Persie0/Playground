package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class laa implements kzx {

    /* JADX INFO: renamed from: a */
    private final kzx f37801a;

    private laa(kzx kzxVar) {
        this.f37801a = kzxVar;
    }

    /* JADX INFO: renamed from: j */
    public static laa m15114j(kzx kzxVar) {
        return new laa(kzxVar);
    }

    /* JADX INFO: renamed from: k */
    public static laa m15115k(kzx kzxVar) {
        return m15114j(kzxVar.mo15102a(not.INSTANCE, lqi.m15875t()));
    }

    /* JADX INFO: renamed from: l */
    public static laa m15116l(Executor executor, Runnable runnable) {
        return new laa(lqi.m15863h(executor, new lbv(runnable, 1)));
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: a */
    public final kzx mo15102a(Executor executor, kyz kyzVar) {
        return this.f37801a.mo15102a(executor, kyzVar);
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: b */
    public final kzx mo15103b(Executor executor, lab labVar) {
        return this.f37801a.mo15103b(executor, labVar);
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: c */
    public final kzx mo15104c(Executor executor, kyz kyzVar, kyz kyzVar2) {
        return this.f37801a.mo15104c(executor, kyzVar, kyzVar2);
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: d */
    public final kzx mo15105d(Executor executor, lab labVar, lab labVar2) {
        return this.f37801a.mo15105d(executor, labVar, labVar2);
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: e */
    public final nps mo15106e() {
        return this.f37801a.mo15106e();
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo15107f() {
        return (kyy) this.f37801a.mo15107f();
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: g */
    public final boolean mo15108g() {
        return this.f37801a.mo15108g();
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: h */
    public final void mo15109h(kzj kzjVar) {
        this.f37801a.mo15109h(kzjVar);
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final laa mo15110i(Executor executor, lhz lhzVar) {
        return new laa(this.f37801a.mo15110i(executor, lhzVar));
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
