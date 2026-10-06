package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxb implements jwn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jwn f34980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jxc f34981b;

    public jxb(jxc jxcVar, jwn jwnVar) {
        this.f34981b = jxcVar;
        this.f34980a = jwnVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34980a.mo3830a(new gmb(this, kbgVar, 16), executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34981b.m13648h(this.f34980a.mo3831be());
    }
}
