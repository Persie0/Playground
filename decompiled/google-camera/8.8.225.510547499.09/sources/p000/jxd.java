package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jxd implements jww {

    /* JADX INFO: renamed from: a */
    private final jww f34984a;

    /* JADX INFO: renamed from: b */
    private final jwn f34985b;

    protected jxd(jww jwwVar) {
        this.f34984a = jwwVar;
        this.f34985b = jwr.m13640j(jwwVar, new hgv(this, 9));
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34985b.mo3830a(kbgVar, executor);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo3609b(Object obj);

    /* JADX INFO: renamed from: be */
    public Object mo3831be() {
        return this.f34985b.mo3831be();
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        jww jwwVar = this.f34984a;
        obj.getClass();
        Object objMo3610c = mo3610c(obj);
        if (objMo3610c != null) {
            jwwVar.mo3415bf(objMo3610c);
            return;
        }
        throw new NullPointerException("Transforming output value: " + obj.toString() + " resulted in a null input value for: " + getClass().getName());
    }

    /* JADX INFO: renamed from: c */
    protected abstract Object mo3610c(Object obj);
}
