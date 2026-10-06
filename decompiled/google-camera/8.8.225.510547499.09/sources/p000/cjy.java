package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjy implements jwn {

    /* JADX INFO: renamed from: a */
    private final jwn f5950a;

    public cjy(jwn jwnVar) {
        this.f5950a = jwnVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f5950a.mo3830a(new cbx(kbgVar, 14), executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f5950a.mo3831be();
    }
}
