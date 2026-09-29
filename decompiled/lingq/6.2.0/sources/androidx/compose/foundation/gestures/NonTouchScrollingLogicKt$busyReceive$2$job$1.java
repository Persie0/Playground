package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.tf4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1", m4291f = "NonTouchScrollingLogic.kt", m4292l = {76}, m4293m = "invokeSuspend", m4294v = 1)
final class NonTouchScrollingLogicKt$busyReceive$2$job$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2021a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2022b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NonTouchScrollingLogicKt$busyReceive$2$job$1 nonTouchScrollingLogicKt$busyReceive$2$job$1 = new NonTouchScrollingLogicKt$busyReceive$2$job$1(2, continuation);
        nonTouchScrollingLogicKt$busyReceive$2$job$1.f2022b = obj;
        return nonTouchScrollingLogicKt$busyReceive$2$job$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2021a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1Var = (un1) this.f2022b;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            un1Var = (un1) this.f2022b;
            AbstractC3193b.m15359b(obj);
        }
        while (AbstractC3208a.m15443j(un1Var.mo1309x())) {
            tf4 tf4Var = new tf4(29);
            this.f2022b = un1Var;
            this.f2021a = 1;
            if (b34.m3250q(getContext()).mo1250e(tf4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfa.f68157a;
    }
}
