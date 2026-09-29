package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", m4291f = "TapGestureDetector.kt", m4292l = {474, 475}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$launchAwaitingReset$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2152a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2153b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cd4 f2154c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f2155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$launchAwaitingReset$1(cd4 cd4Var, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f2154c = cd4Var;
        this.f2155d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.f2154c, this.f2155d, continuation);
        tapGestureDetectorKt$launchAwaitingReset$1.f2153b = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r5.f2155d.invoke(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2152a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1Var = (un1) this.f2153b;
            this.f2153b = un1Var;
            this.f2152a = 1;
            if (this.f2154c.mo4539q(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            un1Var = (un1) this.f2153b;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        this.f2153b = null;
        this.f2152a = 2;
    }
}
