package com.lingq.core.token.domain;

import com.lingq.core.datastore.C1371d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetPopularLocalePreferenceUseCase$invoke$1", m4291f = "GetAndUpdatePopularLocalePreferenceUseCase.kt", m4292l = {24}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPopularLocalePreferenceUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23802a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23804c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23805d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1906c f23806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPopularLocalePreferenceUseCase$invoke$1(String str, String str2, C1906c c1906c, Continuation continuation) {
        super(2, continuation);
        this.f23804c = str;
        this.f23805d = str2;
        this.f23806e = c1906c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPopularLocalePreferenceUseCase$invoke$1 getPopularLocalePreferenceUseCase$invoke$1 = new GetPopularLocalePreferenceUseCase$invoke$1(this.f23804c, this.f23805d, this.f23806e, continuation);
        getPopularLocalePreferenceUseCase$invoke$1.f23803b = obj;
        return getPopularLocalePreferenceUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPopularLocalePreferenceUseCase$invoke$1) create((Map) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = (Map) this.f23803b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23802a;
        String str = this.f23805d;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return str;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        String str2 = this.f23804c;
        String str3 = (String) map.get(str2);
        if (str3 != null) {
            return str3;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(str2, str);
        vma vmaVar = (vma) this.f23806e.f23860a;
        this.f23803b = null;
        this.f23802a = 1;
        return ((C1371d) vmaVar).m7966f(linkedHashMap, this) == coroutineSingletons ? coroutineSingletons : str;
    }
}
