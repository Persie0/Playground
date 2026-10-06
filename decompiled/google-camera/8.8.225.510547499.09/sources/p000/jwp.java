package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwp implements jwn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f34961a;

    public jwp(Object obj) {
        this.f34961a = obj;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        executor.execute(new jpm(kbgVar, this.f34961a, 12));
        return jwr.f34964a;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34961a;
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("Obs.of");
        mrlVarM16766e.m16822a(this.f34961a);
        return mrlVarM16766e.toString();
    }
}
