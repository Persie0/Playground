package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", m4291f = "MouseWheelScrollingLogic.kt", m4292l = {201}, m4293m = "invokeSuspend", m4294v = 1)
final class C0089x7147264f extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0106n f2008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089x7147264f(C0106n c0106n, Continuation continuation) {
        super(2, continuation);
        this.f2008b = c0106n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0089x7147264f(this.f2008b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0089x7147264f) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2007a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C3211a c3211a = this.f2008b.f2294g;
        this.f2007a = 1;
        Object objM23649s = vz1.m23649s(new NonTouchScrollingLogicKt$busyReceive$2(c3211a, null), this);
        return objM23649s == coroutineSingletons ? coroutineSingletons : objM23649s;
    }
}
