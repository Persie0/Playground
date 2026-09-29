package com.lingq.feature.library;

import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onLikeLesson$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1054}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onLikeLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onLikeLesson$1(C2146e c2146e, int i, Continuation continuation) {
        super(2, continuation);
        this.f26533b = c2146e;
        this.f26534c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onLikeLesson$1(this.f26533b, this.f26534c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onLikeLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26532a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2146e c2146e = this.f26533b;
            String strMo4589b2 = c2146e.f26677b.mo4589b2();
            LqAnalyticsValues$LikeLocation lqAnalyticsValues$LikeLocation = LqAnalyticsValues$LikeLocation.LessonDropdown;
            this.f26532a = 1;
            d65 d65Var = c2146e.f26686k.f26649a;
            Object objM7277g0 = ((C1295k) d65Var).m7277g0(this.f26534c, strMo4589b2, lqAnalyticsValues$LikeLocation.getValue(), this);
            if (objM7277g0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM7277g0 = xfaVar;
            }
            if (objM7277g0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
