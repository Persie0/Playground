package androidx.compose.material3.internal;

import androidx.compose.material3.C0252k0;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1", m4291f = "BasicTooltip.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class BasicTooltipKt$TooltipPopup$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0252k0 f3453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$TooltipPopup$1$1$1(C0252k0 c0252k0, Continuation continuation) {
        super(2, continuation);
        this.f3453a = c0252k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasicTooltipKt$TooltipPopup$1$1$1(this.f3453a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        BasicTooltipKt$TooltipPopup$1$1$1 basicTooltipKt$TooltipPopup$1$1$1 = (BasicTooltipKt$TooltipPopup$1$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        basicTooltipKt$TooltipPopup$1$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f3453a.m1177a();
        return xfa.f68157a;
    }
}
