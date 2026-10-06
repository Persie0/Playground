package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwu implements jww {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f34970a;

    public jwu(Object obj) {
        this.f34970a = obj;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        executor.execute(new jpm(kbgVar, this.f34970a, 13));
        return jwv.f34971a;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34970a;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("Prop.of");
        mrlVarM16766e.m16822a(this.f34970a);
        return mrlVarM16766e.toString();
    }
}
