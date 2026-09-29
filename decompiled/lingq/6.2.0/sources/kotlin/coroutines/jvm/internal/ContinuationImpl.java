package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import p000.cc1;
import p000.in1;
import p000.jj5;
import p000.kh2;
import p000.kn1;
import p000.nn1;
import p000.sm0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final kn1 _context;
    private transient Continuation<Object> intercepted;

    public ContinuationImpl(Continuation continuation) {
        this(continuation != null ? continuation.getContext() : null, continuation);
    }

    @Override // kotlin.coroutines.Continuation
    public kn1 getContext() {
        kn1 kn1Var = this._context;
        kn1Var.getClass();
        return kn1Var;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null) {
            return continuation;
        }
        nn1 nn1Var = (nn1) getContext().get(jj5.f45612c);
        Continuation<Object> kh2Var = nn1Var != null ? new kh2(nn1Var, this) : this;
        this.intercepted = kh2Var;
        return kh2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            in1 in1Var = getContext().get(jj5.f45612c);
            in1Var.getClass();
            kh2 kh2Var = (kh2) continuation;
            kh2Var.m15235i();
            sm0 sm0VarM15237m = kh2Var.m15237m();
            if (sm0VarM15237m != null) {
                sm0VarM15237m.m21463n();
            }
        }
        this.intercepted = cc1.f9874b;
    }

    public ContinuationImpl(kn1 kn1Var, Continuation continuation) {
        super(continuation);
        this._context = kn1Var;
    }
}
