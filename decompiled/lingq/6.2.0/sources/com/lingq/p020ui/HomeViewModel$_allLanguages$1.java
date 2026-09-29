package com.lingq.p020ui;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.qy3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$_allLanguages$1", m4291f = "HomeViewModel.kt", m4292l = {98}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$_allLanguages$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33950a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2888d f33952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$_allLanguages$1(C2888d c2888d, Continuation continuation) {
        super(3, continuation);
        this.f33952c = c2888d;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HomeViewModel$_allLanguages$1 homeViewModel$_allLanguages$1 = new HomeViewModel$_allLanguages$1(this.f33952c, (Continuation) obj3);
        homeViewModel$_allLanguages$1.f33951b = (e83) obj;
        return homeViewModel$_allLanguages$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33951b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33950a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((C1293i) this.f33952c.f34171f).f16489b.f64042K, false, new String[]{"LanguageEntity"}, new qy3(9)));
            this.f33951b = null;
            this.f33950a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
