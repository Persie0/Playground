package com.lingq.core.tooltips.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.c7a;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.tooltips.components.TooltipHostKt$TooltipManager$1$1", m4291f = "TooltipHost.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TooltipHostKt$TooltipManager$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c7a f23937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f23938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipHostKt$TooltipManager$1$1(c7a c7aVar, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23937a = c7aVar;
        this.f23938b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TooltipHostKt$TooltipManager$1$1(this.f23937a, this.f23938b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TooltipHostKt$TooltipManager$1$1 tooltipHostKt$TooltipManager$1$1 = (TooltipHostKt$TooltipManager$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tooltipHostKt$TooltipManager$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f23937a == null) {
            this.f23938b.setValue(Boolean.FALSE);
        }
        return xfa.f68157a;
    }
}
