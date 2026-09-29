package com.lingq.core.p012ui.dragdrop;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.ss5;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.dragdrop.DragDropState$onDragInterrupted$1", m4291f = "DragDropState.kt", m4292l = {65}, m4293m = "invokeSuspend", m4294v = 2)
final class DragDropState$onDragInterrupted$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1919b f23964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropState$onDragInterrupted$1(C1919b c1919b, Continuation continuation) {
        super(2, continuation);
        this.f23964b = c1919b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DragDropState$onDragInterrupted$1(this.f23964b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DragDropState$onDragInterrupted$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23963a;
        C1919b c1919b = this.f23964b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0059a c0059a = c1919b.f23974g;
            Float f = new Float(0.0f);
            bg9 bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, new Float(Float.intBitsToFloat((int) (((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)) & 4294967295L))), 1);
            this.f23963a = 1;
            if (C0059a.m744c(c0059a, f, bg9VarM21698Y, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ((xc9) c1919b.f23973f).setValue(null);
        return xfa.f68157a;
    }
}
