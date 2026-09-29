package androidx.compose.p002ui.scrollcapture;

import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.gq6;
import p000.mn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", m4291f = "ComposeScrollCaptureCallback.android.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 1)
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public boolean f4897a;

    /* JADX INFO: renamed from: b */
    public int f4898b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ float f4899c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ScrollCaptureCallbackC0417a f4900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a, Continuation continuation) {
        super(2, continuation);
        this.f4900d = scrollCaptureCallbackC0417a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.f4900d, continuation);
        composeScrollCaptureCallback$scrollTracker$1.f4899c = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4898b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            float f = this.f4899c;
            ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a = this.f4900d;
            zi3 zi3Var = (zi3) AbstractC0422b.m1838a(scrollCaptureCallbackC0417a.f4907a.f4974d, AbstractC0421a.f4949e);
            if (zi3Var == null) {
                throw AbstractC3393o1.m17745t("Required value was null.");
            }
            boolean z2 = ((mn8) scrollCaptureCallbackC0417a.f4907a.f4974d.m15706g(AbstractC0424d.f5016w)).f51590c;
            if (z2) {
                f = -f;
            }
            gq6 gq6Var = new gq6((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.f4897a = z2;
            this.f4898b = 1;
            obj = zi3Var.invoke(gq6Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = z2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.f4897a;
            AbstractC3193b.m15359b(obj);
        }
        long j = ((gq6) obj).f41189a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
