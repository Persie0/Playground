package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwz implements jwn {

    /* JADX INFO: renamed from: a */
    private final jwn f34976a;

    /* JADX INFO: renamed from: b */
    private final jxa f34977b;

    public jwz(jwn jwnVar) {
        this.f34976a = jwnVar;
        jxa jxaVar = new jxa(jwnVar.mo3831be());
        this.f34977b = jxaVar;
        jwnVar.mo3830a(new ijp(jxaVar, 15), not.INSTANCE);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34977b.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34977b.f34942d;
    }
}
