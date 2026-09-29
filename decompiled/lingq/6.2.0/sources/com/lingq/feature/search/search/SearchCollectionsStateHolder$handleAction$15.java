package com.lingq.feature.search.search;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3639u8;
import p000.c32;
import p000.dp8;
import p000.vi3;
import p000.xfa;
import p000.zs8;
import p000.zyc;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$handleAction$15", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {203}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$handleAction$15 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32959a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2775b f32960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zyc f32961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$handleAction$15(C2775b c2775b, zyc zycVar, Continuation continuation) {
        super(1, continuation);
        this.f32960b = c2775b;
        this.f32961c = zycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchCollectionsStateHolder$handleAction$15(this.f32960b, this.f32961c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchCollectionsStateHolder$handleAction$15) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32959a;
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
        C2775b c2775b = this.f32960b;
        C3639u8 c3639u8 = c2775b.f33075k;
        zs8 zs8Var = c2775b.f33086v;
        int i2 = zs8Var.f72110b;
        String str = zs8Var.f72109a;
        String str2 = ((dp8) this.f32961c).f36008a;
        this.f32959a = 1;
        Object objM7108j = c3639u8.f63533a.m7108j(i2, str, str2, this);
        if (objM7108j != coroutineSingletons) {
            objM7108j = xfaVar;
        }
        return objM7108j == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
