package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.gq6;
import p000.kg7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$7", m4291f = "TapGestureDetector.kt", m4292l = {188}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$processTapGesture$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aj3 f2178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0108p f2179c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kg7 f2180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$processTapGesture$7(aj3 aj3Var, C0108p c0108p, kg7 kg7Var, Continuation continuation) {
        super(2, continuation);
        this.f2178b = aj3Var;
        this.f2179c = c0108p;
        this.f2180d = kg7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapGestureDetectorKt$processTapGesture$7(this.f2178b, this.f2179c, this.f2180d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$processTapGesture$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2177a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            gq6 gq6Var = new gq6(this.f2180d.f47237c);
            this.f2177a = 1;
            if (this.f2178b.invoke(this.f2179c, gq6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
