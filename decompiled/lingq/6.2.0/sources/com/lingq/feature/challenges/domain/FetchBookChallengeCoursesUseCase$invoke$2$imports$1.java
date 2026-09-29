package com.lingq.feature.challenges.domain;

import com.lingq.core.data.repository.C1290f;
import java.io.Serializable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.xo1;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.domain.FetchBookChallengeCoursesUseCase$invoke$2$imports$1", m4291f = "FetchBookChallengeCoursesUseCase.kt", m4292l = {14}, m4293m = "invokeSuspend", m4294v = 2)
final class FetchBookChallengeCoursesUseCase$invoke$2$imports$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1982a f24729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24730c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f24731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBookChallengeCoursesUseCase$invoke$2$imports$1(C1982a c1982a, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f24729b = c1982a;
        this.f24730c = str;
        this.f24731d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchBookChallengeCoursesUseCase$invoke$2$imports$1(this.f24729b, this.f24730c, this.f24731d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchBookChallengeCoursesUseCase$invoke$2$imports$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24728a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        xo1 xo1Var = this.f24729b.f24754a;
        this.f24728a = 1;
        Serializable serializableM7177a = ((C1290f) xo1Var).m7177a(this.f24730c, this.f24731d, "my_import", this);
        return serializableM7177a == coroutineSingletons ? coroutineSingletons : serializableM7177a;
    }
}
