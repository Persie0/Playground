package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.network.api.result.ResultLanguageContext;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.c32;
import p000.ul4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl$networkUserLanguage$2$1$1", m4291f = "LanguageRepositoryImpl.kt", m4292l = {573}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageRepositoryImpl$networkUserLanguage$2$1$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1293i f15210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ResultLanguageContext f15211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f15212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUserLanguage$2$1$1(C1293i c1293i, ResultLanguageContext resultLanguageContext, String str, Continuation continuation) {
        super(1, continuation);
        this.f15210b = c1293i;
        this.f15211c = resultLanguageContext;
        this.f15212d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageRepositoryImpl$networkUserLanguage$2$1$1(this.f15210b, this.f15211c, this.f15212d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageRepositoryImpl$networkUserLanguage$2$1$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15209a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ul4 ul4Var = this.f15210b.f16489b;
        LanguageContextEntity languageContextEntityM19769F = AbstractC3489q9.m19769F(this.f15211c, this.f15212d);
        this.f15209a = 1;
        Object objMo4095v0 = ul4Var.mo4095v0(languageContextEntityM19769F, this);
        return objMo4095v0 == coroutineSingletons ? coroutineSingletons : objMo4095v0;
    }
}
