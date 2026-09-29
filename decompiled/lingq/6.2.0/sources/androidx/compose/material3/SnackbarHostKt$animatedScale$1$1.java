package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", m4291f = "SnackbarHost.kt", m4292l = {419}, m4293m = "invokeSuspend", m4294v = 1)
final class SnackbarHostKt$animatedScale$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f3329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0025an f3330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1$1(C0059a c0059a, boolean z, InterfaceC0025an interfaceC0025an, Continuation continuation) {
        super(2, continuation);
        this.f3328b = c0059a;
        this.f3329c = z;
        this.f3330d = interfaceC0025an;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnackbarHostKt$animatedScale$1$1(this.f3328b, this.f3329c, this.f3330d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$animatedScale$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3327a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Float f = new Float(this.f3329c ? 1.0f : 0.8f);
            this.f3327a = 1;
            if (C0059a.m744c(this.f3328b, f, this.f3330d, null, this, 12) == coroutineSingletons) {
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
