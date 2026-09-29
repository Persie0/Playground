package p000;

import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class pz9 implements in1 {

    /* JADX INFO: renamed from: a */
    public final Object f57057a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal f57058b;

    /* JADX INFO: renamed from: c */
    public final rz9 f57059c;

    public pz9(Object obj, ThreadLocal threadLocal) {
        this.f57057a = obj;
        this.f57058b = threadLocal;
        this.f57059c = new rz9(threadLocal);
    }

    /* JADX INFO: renamed from: d */
    public final void m19579d(Object obj) {
        this.f57058b.set(obj);
    }

    /* JADX INFO: renamed from: f */
    public final Object m19580f() {
        ThreadLocal threadLocal = this.f57058b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f57057a);
        return obj;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        if (this.f57059c.equals(jn1Var)) {
            return this;
        }
        return null;
    }

    @Override // p000.in1
    public final jn1 getKey() {
        return this.f57059c;
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return this.f57059c.equals(jn1Var) ? EmptyCoroutineContext.f47685a : this;
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f57057a + ", threadLocal = " + this.f57058b + ')';
    }
}
