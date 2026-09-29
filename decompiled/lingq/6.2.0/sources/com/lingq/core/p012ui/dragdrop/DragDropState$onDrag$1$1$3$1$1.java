package com.lingq.core.p012ui.dragdrop;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.dragdrop.DragDropState$onDrag$1$1$3$1$1", m4291f = "DragDropState.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DragDropState$onDrag$1$1$3$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1919b f23960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f23961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f23962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropState$onDrag$1$1$3$1$1(C1919b c1919b, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f23960a = c1919b;
        this.f23961b = i;
        this.f23962c = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DragDropState$onDrag$1$1$3$1$1(this.f23960a, this.f23961b, this.f23962c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DragDropState$onDrag$1$1$3$1$1 dragDropState$onDrag$1$1$3$1$1 = (DragDropState$onDrag$1$1$3$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dragDropState$onDrag$1$1$3$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f23960a.f23970c.invoke(new Integer(this.f23961b), new Integer(this.f23962c));
        return xfa.f68157a;
    }
}
