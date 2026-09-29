package androidx.compose.p002ui.input.pointer;

import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.sm0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", m4291f = "SuspendingPointerInputFilter.kt", m4292l = {882, 883}, m4293m = "invokeSuspend", m4294v = 1)
final class C0324xf3489d20 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f4108b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0332f f4109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0324xf3489d20(long j, C0332f c0332f, Continuation continuation) {
        super(2, continuation);
        this.f4108b = j;
        this.f4109c = c0332f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0324xf3489d20(this.f4108b, this.f4109c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0324xf3489d20) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(8, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4107a;
        long j = this.f4108b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f4107a = 1;
            if (AbstractC3208a.m15437d(j - 8, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        sm0 sm0Var = this.f4109c.f4133c;
        if (sm0Var != null) {
            sm0Var.resumeWith(new Result.Failure(new PointerEventTimeoutCancellationException(j)));
        }
        return xfa.f68157a;
        this.f4107a = 2;
    }
}
