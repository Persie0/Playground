package com.lingq.feature.search.search;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.zs8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$updateSave$1", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {311}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$updateSave$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2775b f32970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f32972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$updateSave$1(C2775b c2775b, int i, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f32970b = c2775b;
        this.f32971c = i;
        this.f32972d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchCollectionsStateHolder$updateSave$1(this.f32970b, this.f32971c, this.f32972d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchCollectionsStateHolder$updateSave$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32969a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2775b c2775b = this.f32970b;
            C3139j9 c3139j9 = c2775b.f33066b;
            zs8 zs8Var = c2775b.f33086v;
            int i2 = zs8Var.f72110b;
            String str = zs8Var.f72109a;
            this.f32969a = 1;
            if (c3139j9.m14347b(i2, this.f32971c, str, this, this.f32972d) == coroutineSingletons) {
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
