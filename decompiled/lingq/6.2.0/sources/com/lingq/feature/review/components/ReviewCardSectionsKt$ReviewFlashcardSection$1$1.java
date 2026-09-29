package com.lingq.feature.review.components;

import androidx.compose.animation.core.C0059a;
import com.lingq.feature.review.data.ReviewCardLayoutStyle;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.io2;
import p000.qc8;
import p000.ss5;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.components.ReviewCardSectionsKt$ReviewFlashcardSection$1$1", m4291f = "ReviewCardSections.kt", m4292l = {90, 91}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewCardSectionsKt$ReviewFlashcardSection$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qc8 f32408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0059a f32409c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f32410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCardSectionsKt$ReviewFlashcardSection$1$1(qc8 qc8Var, C0059a c0059a, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f32408b = qc8Var;
        this.f32409c = c0059a;
        this.f32410d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewCardSectionsKt$ReviewFlashcardSection$1$1(this.f32408b, this.f32409c, this.f32410d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewCardSectionsKt$ReviewFlashcardSection$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r12.f32409c, r7, r8, null, r12, 12) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32407a;
        qc8 qc8Var = this.f32408b;
        t66 t66Var = this.f32410d;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            t66Var.setValue(qc8Var.f57567a);
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        ReviewCardLayoutStyle reviewCardLayoutStyle = (ReviewCardLayoutStyle) t66Var.getValue();
        ReviewCardLayoutStyle reviewCardLayoutStyle2 = qc8Var.f57567a;
        if (reviewCardLayoutStyle != reviewCardLayoutStyle2) {
            Float f = new Float(reviewCardLayoutStyle2 == ReviewCardLayoutStyle.FlashcardBack ? -92.0f : 92.0f);
            this.f32407a = 1;
            if (this.f32409c.m747f(f, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
        Float f2 = new Float(0.0f);
        fda fdaVarM21703b0 = ss5.m21703b0(420, 0, io2.f44349a, 2);
        this.f32407a = 2;
    }
}
