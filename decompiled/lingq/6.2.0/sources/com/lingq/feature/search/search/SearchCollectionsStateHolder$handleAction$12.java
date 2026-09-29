package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hp8;
import p000.jh9;
import p000.vi3;
import p000.xfa;
import p000.xo1;
import p000.zyc;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$handleAction$12", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {164}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$handleAction$12 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2775b f32951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zyc f32952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$handleAction$12(C2775b c2775b, zyc zycVar, Continuation continuation) {
        super(1, continuation);
        this.f32951b = c2775b;
        this.f32952c = zycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchCollectionsStateHolder$handleAction$12(this.f32951b, this.f32952c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchCollectionsStateHolder$handleAction$12) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32950a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2775b c2775b = this.f32951b;
        jh9 jh9Var = c2775b.f33073i;
        int i2 = ((hp8) this.f32952c).f42744a;
        String str = c2775b.f33086v.f72109a;
        this.f32950a = 1;
        Object objM7186j = ((C1290f) ((xo1) jh9Var.f45552b)).m7186j(i2, str, this);
        if (objM7186j != coroutineSingletons) {
            objM7186j = xfaVar;
        }
        return objM7186j == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
