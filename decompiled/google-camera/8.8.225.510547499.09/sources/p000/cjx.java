package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjx implements jwn, kba {

    /* JADX INFO: renamed from: a */
    private final kba f5948a;

    /* JADX INFO: renamed from: b */
    private final jwn f5949b;

    public cjx(jwn jwnVar, Executor executor) {
        Executor executorM14956B = kxk.m14956B(executor);
        jwf jwfVar = new jwf(jwnVar.mo3831be());
        this.f5949b = jwfVar;
        this.f5948a = jwnVar.mo3830a(new cbx(jwfVar, 13), executorM14956B);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f5949b.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return ((jwf) this.f5949b).f34942d;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f5948a.close();
    }
}
