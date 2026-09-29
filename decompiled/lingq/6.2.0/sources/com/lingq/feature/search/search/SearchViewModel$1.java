package com.lingq.feature.search.search;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c32;
import p000.kj2;
import p000.lda;
import p000.m83;
import p000.mm3;
import p000.nn1;
import p000.xfa;
import p000.zi3;
import p000.zs8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$1", m4291f = "SearchViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f32994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$1(C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f32994b = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SearchViewModel$1 searchViewModel$1 = new SearchViewModel$1(this.f32994b, continuation);
        searchViewModel$1.f32993a = obj;
        return searchViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchViewModel$1 searchViewModel$1 = (SearchViewModel$1) create((Language) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchViewModel$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        Language language = (Language) this.f32993a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2779e c2779e = this.f32994b;
        nn1 nn1Var = c2779e.f33108p;
        C2775b c2775b = c2779e.f33106n;
        if (language == null || (str = language.f19024a) == null) {
            str = "";
        }
        int i = language != null ? language.f19025b : 0;
        if (language == null || (str2 = language.f19032i) == null) {
            str2 = "en";
        }
        zs8 zs8Var = new zs8(str, i, str2);
        c2775b.getClass();
        c2775b.f33086v = zs8Var;
        c2779e.m9708Y2(true);
        xfa xfaVar = xfa.f68157a;
        if (language != null && (str3 = language.f19024a) != null) {
            AbstractC1263a.m7049d(new m83(c2779e.f33097e.m8001a(language.f19025b, str3), new SearchViewModel$observeBlacklists$1(c2779e, null), 2), lda.m16103C(c2779e), "search_blacklists", nn1Var);
            mm3 mm3Var = c2779e.f33096d;
            mm3Var.getClass();
            AbstractC1263a.m7049d(new m83(AbstractC3224d.m15536o(new kj2(((C1368a) mm3Var.f51514a).f18407f1, mm3Var, str3, 1)), new SearchViewModel$observeLevels$1(c2779e, str3, null), 2), lda.m16103C(c2779e), "search_levels", nn1Var);
        }
        return xfaVar;
    }
}
