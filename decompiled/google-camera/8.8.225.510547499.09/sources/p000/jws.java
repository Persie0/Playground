package p000;

import com.google.android.material.snackbar.VMX.rgoX;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jws implements jwn {

    /* JADX INFO: renamed from: a */
    private final msi f34965a;

    /* JADX INFO: renamed from: b */
    private final jwf f34966b;

    /* JADX INFO: renamed from: c */
    private final jwn f34967c;

    public jws(msi msiVar) {
        this.f34965a = msiVar;
        jwf jwfVar = new jwf(msiVar.mo6051a());
        this.f34966b = jwfVar;
        this.f34967c = jwj.m13624c(jwfVar);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34967c.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34966b.f34942d;
    }

    /* JADX INFO: renamed from: c */
    public final void m13643c() {
        this.f34966b.mo3415bf(this.f34965a.mo6051a());
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e(rgoX.remKI);
        mrlVarM16766e.m16822a(this.f34965a);
        return mrlVarM16766e.toString();
    }
}
