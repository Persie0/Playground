package com.lingq.core.tooltips.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.faa;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.tooltips.components.TooltipHostKt$TooltipManager$2$1", m4291f = "TooltipHost.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TooltipHostKt$TooltipManager$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ faa f23939a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f23940b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f23941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipHostKt$TooltipManager$2$1(faa faaVar, ui3 ui3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23939a = faaVar;
        this.f23940b = ui3Var;
        this.f23941c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TooltipHostKt$TooltipManager$2$1(this.f23939a, this.f23940b, this.f23941c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TooltipHostKt$TooltipManager$2$1 tooltipHostKt$TooltipManager$2$1 = (TooltipHostKt$TooltipManager$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tooltipHostKt$TooltipManager$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        faa faaVar = this.f23939a;
        Object objM11669c = faaVar.m11669c();
        TooltipAnimationState tooltipAnimationState = TooltipAnimationState.Hidden;
        if (objM11669c == tooltipAnimationState && ((xc9) faaVar.f38738d).getValue() == tooltipAnimationState && ((Boolean) this.f23941c.getValue()).booleanValue()) {
            this.f23940b.mo0a();
        }
        return xfa.f68157a;
    }
}
