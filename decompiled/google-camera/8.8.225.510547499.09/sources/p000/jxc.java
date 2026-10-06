package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jxc implements jwn {

    /* JADX INFO: renamed from: a */
    private final jwn f34982a;

    /* JADX INFO: renamed from: b */
    private final jwn f34983b;

    protected jxc(jwn jwnVar) {
        this.f34982a = jwnVar;
        this.f34983b = jwj.m13624c(new jxb(this, jwnVar));
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34983b.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34983b.mo3831be();
    }

    /* JADX INFO: renamed from: d */
    protected abstract Object mo3833d(Object obj);

    /* JADX INFO: renamed from: h */
    public final Object m13648h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Input: " + String.valueOf(this.f34982a) + " returned a null value");
        }
        Object objMo3833d = mo3833d(obj);
        if (objMo3833d != null) {
            return objMo3833d;
        }
        throw new NullPointerException("Transforming input value: " + obj.toString() + " resulted in a null output for: " + getClass().getName());
    }
}
