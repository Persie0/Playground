package com.lingq.feature.onboarding;

import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$fetchLessonsNetwork$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {239}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$fetchLessonsNetwork$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26945c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LibraryShelf f26946d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LibraryTab f26947e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f26948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$fetchLessonsNetwork$1(C2197b c2197b, String str, LibraryShelf libraryShelf, LibraryTab libraryTab, String str2, Continuation continuation) {
        super(2, continuation);
        this.f26944b = c2197b;
        this.f26945c = str;
        this.f26946d = libraryShelf;
        this.f26947e = libraryTab;
        this.f26948f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$fetchLessonsNetwork$1(this.f26944b, this.f26945c, this.f26946d, this.f26947e, this.f26948f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$fetchLessonsNetwork$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26943a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                y95 y95Var = this.f26944b.f27167h;
                String str = this.f26945c;
                String strM18220E = AbstractC3423or.m18220E(this.f26946d, this.f26947e);
                String str2 = this.f26948f;
                this.f26943a = 1;
                if (y95.m24995a(y95Var, str, strM18220E, "", true, str2, null, null, null, 0, this, 480) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
