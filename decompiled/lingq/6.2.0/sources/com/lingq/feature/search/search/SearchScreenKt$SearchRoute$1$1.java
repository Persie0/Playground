package com.lingq.feature.search.search;

import android.app.Activity;
import android.content.Context;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.er8;
import p000.mbd;
import p000.t66;
import p000.ud6;
import p000.un1;
import p000.xfa;
import p000.xs8;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchScreenKt$SearchRoute$1$1", m4291f = "SearchScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchScreenKt$SearchRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t66 f32985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f32986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud6 f32987c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2779e f32988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchScreenKt$SearchRoute$1$1(t66 t66Var, Context context, ud6 ud6Var, C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f32985a = t66Var;
        this.f32986b = context;
        this.f32987c = ud6Var;
        this.f32988d = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchScreenKt$SearchRoute$1$1(this.f32985a, this.f32986b, this.f32987c, this.f32988d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SearchScreenKt$SearchRoute$1$1 searchScreenKt$SearchRoute$1$1 = (SearchScreenKt$SearchRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        searchScreenKt$SearchRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = ((xs8) this.f32985a.getValue()).f68662k;
        if (str != null) {
            Context context = this.f32986b;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                mbd.m16755c(activity, str, null, 26);
            }
            this.f32988d.m9706W2(er8.f37758a);
        }
        return xfa.f68157a;
    }
}
