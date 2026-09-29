package com.lingq.feature.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.hg8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$showSuccessOverlayAndAdvance$2", m4291f = "ReviewComposeViewModel.kt", m4292l = {513, 515}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$showSuccessOverlayAndAdvance$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$showSuccessOverlayAndAdvance$2(C2751b c2751b, Continuation continuation) {
        super(2, continuation);
        this.f31735b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$showSuccessOverlayAndAdvance$2(this.f31735b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$showSuccessOverlayAndAdvance$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r2.m9568Z2(r17) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31734a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f31734a = 1;
            if (AbstractC3208a.m15437d(800L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        C2751b c2751b = this.f31735b;
        C3244l c3244l = c2751b.f32405m;
        hg8 hg8VarM13232a = hg8.m13232a((hg8) c3244l.getValue(), null, null, null, false, null, null, null, null, 383);
        c3244l.getClass();
        c3244l.m15572j(null, hg8VarM13232a);
        this.f31734a = 2;
    }
}
