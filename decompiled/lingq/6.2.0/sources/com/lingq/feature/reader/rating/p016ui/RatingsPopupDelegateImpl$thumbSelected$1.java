package com.lingq.feature.reader.rating.p016ui;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.onboarding.RatingController;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.yma;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.rating.ui.RatingsPopupDelegateImpl$thumbSelected$1", m4291f = "RatingsPopupDelegate.kt", m4292l = {146, 148}, m4293m = "invokeSuspend", m4294v = 2)
final class RatingsPopupDelegateImpl$thumbSelected$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2475b f29928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f29929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingsPopupDelegateImpl$thumbSelected$1(C2475b c2475b, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f29928b = c2475b;
        this.f29929c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatingsPopupDelegateImpl$thumbSelected$1(this.f29928b, this.f29929c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RatingsPopupDelegateImpl$thumbSelected$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r0).m7968h(r6, r5) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        vma vmaVar = this.f29928b.f29933a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29927a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            yma ymaVar = ((C1371d) vmaVar).f18563C;
            this.f29927a = 1;
            obj = AbstractC3224d.m15541t(ymaVar, this);
            if (obj != coroutineSingletons) {
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
        RatingController ratingController = (RatingController) obj;
        ratingController.f19552e = this.f29929c;
        this.f29927a = 2;
    }
}
