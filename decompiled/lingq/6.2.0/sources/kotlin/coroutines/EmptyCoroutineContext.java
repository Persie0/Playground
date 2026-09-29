package kotlin.coroutines;

import java.io.Serializable;
import p000.in1;
import p000.jn1;
import p000.kn1;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class EmptyCoroutineContext implements kn1, Serializable {

    /* JADX INFO: renamed from: a */
    public static final EmptyCoroutineContext f47685a = new EmptyCoroutineContext();

    private final Object readResolve() {
        return f47685a;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return obj;
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        jn1Var.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        jn1Var.getClass();
        return this;
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        kn1Var.getClass();
        return kn1Var;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
