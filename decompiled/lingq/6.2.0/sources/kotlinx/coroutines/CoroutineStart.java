package kotlinx.coroutines;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.enums.AbstractC3201a;
import p000.AbstractC3584sr;
import p000.eh0;
import p000.gm5;
import p000.kn1;
import p000.lda;
import p000.r46;
import p000.wn1;
import p000.xfa;
import p000.ys2;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <R, T> void invoke(zi3 zi3Var, R r, Continuation<? super T> continuation) {
        Object objInvoke;
        int i = wn1.f67090a[ordinal()];
        xfa xfaVar = xfa.f68157a;
        if (i == 1) {
            try {
                eh0.m11116M(xfaVar, AbstractC3584sr.m21600K(AbstractC3584sr.m21647z(zi3Var, r, continuation)));
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).f47748a;
                }
                continuation.resumeWith(AbstractC3193b.m15358a(th));
                throw th;
            }
        }
        if (i == 2) {
            zi3Var.getClass();
            continuation.getClass();
            AbstractC3584sr.m21600K(AbstractC3584sr.m21647z(zi3Var, r, continuation)).resumeWith(xfaVar);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            gm5.m12750e();
            return;
        }
        continuation.getClass();
        try {
            kn1 context = continuation.getContext();
            Object objM20372O = r46.m20372O(context, null);
            try {
                if (zi3Var instanceof BaseContinuationImpl) {
                    lda.m16119e(2, zi3Var);
                    objInvoke = zi3Var.invoke(r, continuation);
                } else {
                    objInvoke = AbstractC3584sr.m21631i0(zi3Var, r, continuation);
                }
                r46.m20367J(context, objM20372O);
                if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    continuation.resumeWith(objInvoke);
                }
            } catch (Throwable th2) {
                r46.m20367J(context, objM20372O);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f47748a;
            }
            continuation.resumeWith(AbstractC3193b.m15358a(th));
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
