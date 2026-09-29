package com.lingq.p020ui;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$locales$1", m4291f = "HomeViewModel.kt", m4292l = {102}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$locales$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33962a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2888d f33964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$locales$1(C2888d c2888d, Continuation continuation) {
        super(3, continuation);
        this.f33964c = c2888d;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HomeViewModel$locales$1 homeViewModel$locales$1 = new HomeViewModel$locales$1(this.f33964c, (Continuation) obj3);
        homeViewModel$locales$1.f33963b = (e83) obj;
        return homeViewModel$locales$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33963b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33962a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7329c = this.f33964c.f34172g.m7329c();
            this.f33963b = null;
            this.f33962a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7329c, this) == coroutineSingletons) {
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
