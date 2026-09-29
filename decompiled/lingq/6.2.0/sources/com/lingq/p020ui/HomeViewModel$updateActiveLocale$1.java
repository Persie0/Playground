package com.lingq.p020ui;

import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$updateActiveLocale$1", m4291f = "HomeViewModel.kt", m4292l = {186}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$updateActiveLocale$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateActiveLocale$1(C2888d c2888d, String str, Continuation continuation) {
        super(2, continuation);
        this.f33987b = c2888d;
        this.f33988c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$updateActiveLocale$1(this.f33987b, this.f33988c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$updateActiveLocale$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33986a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            km7 km7Var = this.f33987b.f34170e;
            this.f33986a = 1;
            if (((C1267a) km7Var).m7093w(this.f33988c, this) == coroutineSingletons) {
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
