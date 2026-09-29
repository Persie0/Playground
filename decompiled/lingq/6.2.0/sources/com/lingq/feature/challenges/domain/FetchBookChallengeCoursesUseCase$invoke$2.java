package com.lingq.feature.challenges.domain;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.t13;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.y92;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.domain.FetchBookChallengeCoursesUseCase$invoke$2", m4291f = "FetchBookChallengeCoursesUseCase.kt", m4292l = {15, 15}, m4293m = "invokeSuspend", m4294v = 2)
final class FetchBookChallengeCoursesUseCase$invoke$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public y92 f24721a;

    /* JADX INFO: renamed from: b */
    public List f24722b;

    /* JADX INFO: renamed from: c */
    public int f24723c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24724d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1982a f24725e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24726f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBookChallengeCoursesUseCase$invoke$2(C1982a c1982a, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f24725e = c1982a;
        this.f24726f = str;
        this.f24727g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FetchBookChallengeCoursesUseCase$invoke$2 fetchBookChallengeCoursesUseCase$invoke$2 = new FetchBookChallengeCoursesUseCase$invoke$2(this.f24725e, this.f24726f, this.f24727g, continuation);
        fetchBookChallengeCoursesUseCase$invoke$2.f24724d = obj;
        return fetchBookChallengeCoursesUseCase$invoke$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchBookChallengeCoursesUseCase$invoke$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        y92 y92VarM23910e;
        List list;
        un1 un1Var = (un1) this.f24724d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24723c;
        if (i != 0) {
            if (i == 1) {
                y92VarM23910e = this.f24721a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = this.f24722b;
                AbstractC3193b.m15359b(obj);
            }
            return new t13(list, (List) obj);
        }
        AbstractC3193b.m15359b(obj);
        C1982a c1982a = this.f24725e;
        String str = this.f24726f;
        String str2 = this.f24727g;
        y92 y92VarM23910e2 = wfb.m23910e(un1Var, null, new FetchBookChallengeCoursesUseCase$invoke$2$library$1(c1982a, str, str2, null), 3);
        y92VarM23910e = wfb.m23910e(un1Var, null, new FetchBookChallengeCoursesUseCase$invoke$2$imports$1(c1982a, str, str2, null), 3);
        this.f24724d = null;
        this.f24721a = y92VarM23910e;
        this.f24723c = 1;
        obj = y92VarM23910e2.m15517w(this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        List list2 = (List) obj;
        this.f24724d = null;
        this.f24721a = null;
        this.f24722b = list2;
        this.f24723c = 2;
        Object objMo24416n = y92VarM23910e.mo24416n(this);
        if (objMo24416n != coroutineSingletons) {
            obj = objMo24416n;
            list = list2;
            return new t13(list, (List) obj);
        }
        return coroutineSingletons;
    }
}
