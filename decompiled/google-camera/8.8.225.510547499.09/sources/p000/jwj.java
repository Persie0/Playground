package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwj implements jwn {

    /* JADX INFO: renamed from: a */
    private final jwn f34951a;

    private jwj(jwn jwnVar) {
        this.f34951a = jwnVar;
    }

    /* JADX INFO: renamed from: c */
    public static jwn m13624c(jwn jwnVar) {
        return jwnVar instanceof jwj ? jwnVar : new jwj(jwnVar);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34951a.mo3830a(new jwi(executor, kbgVar), new jwx());
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34951a.mo3831be();
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e(KMNlNMe.hBfFtGZLDigTqrM);
        mrlVarM16766e.m16822a(this.f34951a);
        return mrlVarM16766e.toString();
    }
}
