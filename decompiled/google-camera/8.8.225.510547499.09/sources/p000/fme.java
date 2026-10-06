package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fme implements jwn, kba {

    /* JADX INFO: renamed from: a */
    public final jwf f22545a;

    /* JADX INFO: renamed from: b */
    public final Executor f22546b;

    /* JADX INFO: renamed from: c */
    public jwn f22547c;

    /* JADX INFO: renamed from: d */
    public jwn f22548d;

    /* JADX INFO: renamed from: e */
    public kba f22549e;

    /* JADX INFO: renamed from: f */
    public kba f22550f;

    /* JADX INFO: renamed from: g */
    public boolean f22551g;

    public fme() {
        jvd jvdVar = jvd.f34878b;
        this.f22551g = false;
        this.f22545a = new jwf(true);
        this.f22546b = jvdVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f22545a.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean mo3831be() {
        return (Boolean) this.f22545a.f34942d;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f22546b.execute(new fit(this, 10));
    }

    /* JADX INFO: renamed from: d */
    public final void m8577d(jwn jwnVar) {
        this.f22546b.execute(new ewo(this, jwnVar, 16));
    }

    /* JADX INFO: renamed from: e */
    public final void m8578e() {
        if (this.f22551g) {
            return;
        }
        jwn jwnVar = this.f22547c;
        boolean z = false;
        boolean z2 = jwnVar == null || ((Boolean) jwnVar.mo3831be()).booleanValue();
        jwn jwnVar2 = this.f22548d;
        boolean z3 = jwnVar2 == null || ((Boolean) jwnVar2.mo3831be()).booleanValue();
        jwf jwfVar = this.f22545a;
        if (z2 && z3) {
            z = true;
        }
        jwfVar.mo3415bf(Boolean.valueOf(z));
    }
}
