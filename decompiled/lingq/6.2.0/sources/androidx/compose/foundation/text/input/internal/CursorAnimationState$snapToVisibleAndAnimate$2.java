package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.hn1;
import p000.qc9;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m4291f = "CursorAnimationState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0188b f2932b;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1 */
    @c32(m4290c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m4291f = "CursorAnimationState.kt", m4292l = {72, 77, 79, 81}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01841 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cd4 f2934b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0188b f2935c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01841(cd4 cd4Var, C0188b c0188b, Continuation continuation) {
            super(2, continuation);
            this.f2934b = cd4Var;
            this.f2935c = c0188b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01841(this.f2934b, this.f2935c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01841) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x006a  */
        /* JADX WARN: Code duplicated, block: B:36:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001c, B:39:0x0077, B:33:0x0062, B:36:0x006b, B:14:0x0028, B:15:0x002c, B:31:0x005c, B:32:0x0061, B:26:0x004c, B:28:0x0053), top: B:43:0x0012 }] */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
        
            if (kotlinx.coroutines.AbstractC3208a.m15437d(500, r13) == r2) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0074 -> B:39:0x0077). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C0188b c0188b = this.f2935c;
            qc9 qc9Var = c0188b.f2946c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2933a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    cd4 cd4Var = this.f2934b;
                    if (cd4Var != null) {
                        this.f2933a = 1;
                        cd4Var.mo4537a(null);
                        Object objMo4539q = cd4Var.mo4539q(this);
                        if (objMo4539q != coroutineSingletons) {
                            objMo4539q = xfa.f68157a;
                        }
                        if (objMo4539q != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        AbstractC3193b.m15359b(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i == 3) {
                        AbstractC3193b.m15359b(obj);
                        qc9Var.m19862i(0.0f);
                        this.f2933a = 4;
                    } else {
                        if (i != 4) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    qc9Var.m19862i(1.0f);
                    this.f2933a = 3;
                    if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                        qc9Var.m19862i(0.0f);
                        this.f2933a = 4;
                    }
                    return coroutineSingletons;
                }
                AbstractC3193b.m15359b(obj);
                qc9Var.m19862i(1.0f);
                if (!c0188b.f2944a) {
                    this.f2933a = 2;
                    if (AbstractC3208a.m15435b(this) == coroutineSingletons) {
                    }
                    throw new KotlinNothingValueException();
                }
                this.f2933a = 3;
                if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                    qc9Var.m19862i(0.0f);
                    this.f2933a = 4;
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                qc9Var.m19862i(0.0f);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(C0188b c0188b, Continuation continuation) {
        super(2, continuation);
        this.f2932b = c0188b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.f2932b, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.f2931a = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f2931a;
        C0188b c0188b = this.f2932b;
        AtomicReference atomicReference = c0188b.f2945b;
        return Boolean.valueOf(hn1.m13376z(atomicReference, wfb.m23926u(un1Var, null, null, new C01841((cd4) atomicReference.getAndSet(null), c0188b, null), 3)));
    }
}
