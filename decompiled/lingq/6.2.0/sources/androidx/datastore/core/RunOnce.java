package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C3213d;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c32;
import p000.c76;
import p000.r46;
import p000.wb1;
import p000.xb1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public abstract class RunOnce {
    private final c76 runMutex = new C3248a();
    private final wb1 didRun = r46.m20377b();

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1 */
    @c32(m4290c = "androidx.datastore.core.RunOnce", m4291f = "DataStoreImpl.kt", m4292l = {566, 517}, m4293m = "runIfNeeded", m4294v = 1)
    public static final class C05171 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C05171(Continuation<? super C05171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public final Object awaitComplete(Continuation<? super xfa> continuation) throws Throwable {
        Object objM15517w = ((xb1) this.didRun).m15517w(continuation);
        return objM15517w == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15517w : xfa.f68157a;
    }

    public abstract Object doRun(Continuation<? super xfa> continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object runIfNeeded(Continuation<? super xfa> continuation) throws Throwable {
        C05171 c05171;
        c76 c76Var;
        c76 c76Var2;
        if (continuation instanceof C05171) {
            c05171 = (C05171) continuation;
            int i = c05171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05171.label = i - Integer.MIN_VALUE;
            } else {
                c05171 = new C05171(continuation);
            }
        } else {
            c05171 = new C05171(continuation);
        }
        Object obj = c05171.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c05171.label;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                if (((C3213d) this.didRun).m15504W()) {
                    return xfaVar;
                }
                c76Var = this.runMutex;
                c05171.L$0 = c76Var;
                c05171.label = 1;
                if (c76Var.mo4388c(c05171) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c76Var2 = (c76) c05171.L$0;
                try {
                    AbstractC3193b.m15359b(obj);
                    ((xb1) this.didRun).m15505Y(xfaVar);
                    c76Var2.mo4387b(null);
                    return xfaVar;
                } catch (Throwable th) {
                    th = th;
                    c76Var2.mo4387b(null);
                    throw th;
                }
            }
            c76 c76Var3 = (c76) c05171.L$0;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var3;
            if (((C3213d) this.didRun).m15504W()) {
                c76Var.mo4387b(null);
                return xfaVar;
            }
            c05171.L$0 = c76Var;
            c05171.label = 2;
            if (doRun(c05171) != obj2) {
                c76Var2 = c76Var;
                ((xb1) this.didRun).m15505Y(xfaVar);
                c76Var2.mo4387b(null);
                return xfaVar;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            c76Var2 = c76Var;
            c76Var2.mo4387b(null);
            throw th;
        }
    }
}
