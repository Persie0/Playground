package androidx.compose.foundation.gestures;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
@c32(m4290c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$6", m4291f = "TapGestureDetector.kt", m4292l = {184, ModuleDescriptor.MODULE_VERSION}, m4293m = "invokeSuspend", m4294v = 1)
final class TapGestureDetectorKt$processTapGesture$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cd4 f2175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0108p f2176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$processTapGesture$6(cd4 cd4Var, C0108p c0108p, Continuation continuation) {
        super(2, continuation);
        this.f2175b = cd4Var;
        this.f2176c = c0108p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapGestureDetectorKt$processTapGesture$6(this.f2175b, this.f2176c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$processTapGesture$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r4.f2176c.m910e(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2174a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f2174a = 1;
            if (this.f2175b.mo4539q(this) != coroutineSingletons) {
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
        return xfa.f68157a;
        this.f2174a = 2;
    }
}
