package kotlinx.coroutines;

import p000.kn1;
import p000.nn1;

/* JADX INFO: loaded from: classes.dex */
public final class DispatchException extends Exception {

    /* JADX INFO: renamed from: a */
    public final Throwable f47748a;

    public DispatchException(Throwable th, nn1 nn1Var, kn1 kn1Var) {
        super("Coroutine dispatcher " + nn1Var + " threw an exception, context = " + kn1Var, th);
        this.f47748a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f47748a;
    }
}
