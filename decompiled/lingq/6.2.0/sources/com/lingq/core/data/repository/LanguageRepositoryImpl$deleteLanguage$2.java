package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.t70;
import p000.ul4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl$deleteLanguage$2", m4291f = "LanguageRepositoryImpl.kt", m4292l = {585, 586}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageRepositoryImpl$deleteLanguage$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1293i f15168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f15169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$deleteLanguage$2(C1293i c1293i, String str, Continuation continuation) {
        super(1, continuation);
        this.f15168b = c1293i;
        this.f15169c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageRepositoryImpl$deleteLanguage$2(this.f15168b, this.f15169c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageRepositoryImpl$deleteLanguage$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ul4 ul4Var = this.f15168b.f16489b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15167a;
        String str = this.f15169c;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f15167a = 1;
            Object objM2861d = AbstractC0758a.m2861d(new t70(str, 28), ul4Var.f64042K, this, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f15167a = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new t70(str, 29), ul4Var.f64042K, this, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
