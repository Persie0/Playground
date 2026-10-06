package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwh implements jwn {

    /* JADX INFO: renamed from: a */
    private final jwn f34947a;

    private jwh(jwn jwnVar) {
        this.f34947a = jwnVar;
    }

    /* JADX INFO: renamed from: c */
    public static jwn m13623c(jwn jwnVar) {
        return jwj.m13624c(new jwh(jwnVar));
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        jvb jvbVar = new jvb();
        jvbVar.m13537d(this.f34947a.mo3830a(new jwg(kbgVar, executor, jvbVar), new jwx()));
        return jvbVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return ((jwn) this.f34947a.mo3831be()).mo3831be();
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("DerefObs");
        mrlVarM16766e.m16822a(this.f34947a);
        return mrlVarM16766e.toString();
    }
}
