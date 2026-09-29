package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", m4291f = "SnackbarHost.kt", m4292l = {409}, m4293m = "invokeSuspend", m4294v = 1)
final class SnackbarHostKt$animatedOpacity$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f3323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f3324c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0025an f3325d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f3326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2$1(C0059a c0059a, boolean z, InterfaceC0025an interfaceC0025an, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f3323b = c0059a;
        this.f3324c = z;
        this.f3325d = interfaceC0025an;
        this.f3326e = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.f3323b, this.f3324c, this.f3325d, this.f3326e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3322a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Float f = new Float(this.f3324c ? 1.0f : 0.0f);
            this.f3322a = 1;
            snackbarHostKt$animatedOpacity$2$1 = this;
            if (C0059a.m744c(this.f3323b, f, this.f3325d, null, snackbarHostKt$animatedOpacity$2$1, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            snackbarHostKt$animatedOpacity$2$1 = this;
        }
        snackbarHostKt$animatedOpacity$2$1.f3326e.mo0a();
        return xfa.f68157a;
    }
}
