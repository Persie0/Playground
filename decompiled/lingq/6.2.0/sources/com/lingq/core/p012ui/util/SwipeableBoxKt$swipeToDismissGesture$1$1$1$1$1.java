package com.lingq.core.p012ui.util;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bg9;
import p000.c32;
import p000.fda;
import p000.ss5;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.util.SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1", m4291f = "SwipeableBox.kt", m4292l = {82}, m4293m = "invokeSuspend", m4294v = 2)
final class SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f24156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f24157c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0059a f24158d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f24159e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f24160f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ un1 f24161g;

    /* JADX INFO: renamed from: com.lingq.core.ui.util.SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1$1 */
    @c32(m4290c = "com.lingq.core.ui.util.SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1$1", m4291f = "SwipeableBox.kt", m4292l = {86}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19341 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24162a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0059a f24163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19341(C0059a c0059a, Continuation continuation) {
            super(2, continuation);
            this.f24163b = c0059a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19341(this.f24163b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19341) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24162a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Float f = new Float(0.0f);
                bg9 bg9VarM21698Y = ss5.m21698Y(0.5f, 400.0f, null, 4);
                this.f24162a = 1;
                if (C0059a.m744c(this.f24163b, f, bg9VarM21698Y, null, this, 12) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1(float f, float f2, C0059a c0059a, int i, ui3 ui3Var, un1 un1Var, Continuation continuation) {
        super(2, continuation);
        this.f24156b = f;
        this.f24157c = f2;
        this.f24158d = c0059a;
        this.f24159e = i;
        this.f24160f = ui3Var;
        this.f24161g = un1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1(this.f24156b, this.f24157c, this.f24158d, this.f24159e, this.f24160f, this.f24161g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SwipeableBoxKt$swipeToDismissGesture$1$1$1$1$1 swipeableBoxKt$swipeToDismissGesture$1$1$1$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24155a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            float f = this.f24156b;
            float f2 = this.f24157c;
            C0059a c0059a = this.f24158d;
            if (f > f2) {
                float fFloatValue = ((Number) c0059a.m745d()).floatValue();
                int i2 = this.f24159e;
                Float f3 = new Float(fFloatValue > 0.0f ? i2 : -i2);
                fda fdaVarM21703b0 = ss5.m21703b0(300, 0, null, 6);
                this.f24155a = 1;
                swipeableBoxKt$swipeToDismissGesture$1$1$1$1$1 = this;
                if (C0059a.m744c(this.f24158d, f3, fdaVarM21703b0, null, swipeableBoxKt$swipeToDismissGesture$1$1$1$1$1, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                wfb.m23926u(this.f24161g, null, null, new C19341(c0059a, null), 3);
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        swipeableBoxKt$swipeToDismissGesture$1$1$1$1$1 = this;
        swipeableBoxKt$swipeToDismissGesture$1$1$1$1$1.f24160f.mo0a();
        return xfa.f68157a;
    }
}
