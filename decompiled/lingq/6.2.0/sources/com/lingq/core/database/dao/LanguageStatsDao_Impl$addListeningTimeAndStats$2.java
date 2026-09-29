package com.lingq.core.database.dao;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LanguageStatsDao_Impl$addListeningTimeAndStats$2", m4291f = "LanguageStatsDao_Impl.kt", m4292l = {562}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDao_Impl$addListeningTimeAndStats$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1319g f16951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16952c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f16953d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f16954e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ double f16955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDao_Impl$addListeningTimeAndStats$2(C1319g c1319g, String str, String str2, String str3, double d, Continuation continuation) {
        super(1, continuation);
        this.f16951b = c1319g;
        this.f16952c = str;
        this.f16953d = str2;
        this.f16954e = str3;
        this.f16955f = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsDao_Impl$addListeningTimeAndStats$2(this.f16951b, this.f16952c, this.f16953d, this.f16954e, this.f16955f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsDao_Impl$addListeningTimeAndStats$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16950a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16950a = 1;
            if (C1319g.m7480z0(this.f16951b, this.f16952c, this.f16953d, this.f16954e, this.f16955f, this) == coroutineSingletons) {
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
