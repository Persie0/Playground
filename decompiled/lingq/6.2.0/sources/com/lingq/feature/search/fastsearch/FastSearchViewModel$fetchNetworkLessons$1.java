package com.lingq.feature.search.fastsearch;

import com.lingq.core.data.repository.C1305u;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.j23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$fetchNetworkLessons$1", m4291f = "FastSearchViewModel.kt", m4292l = {252}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$fetchNetworkLessons$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32850b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f32851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$fetchNetworkLessons$1(C2768b c2768b, List list, Continuation continuation) {
        super(1, continuation);
        this.f32850b = c2768b;
        this.f32851c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FastSearchViewModel$fetchNetworkLessons$1(this.f32850b, this.f32851c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((FastSearchViewModel$fetchNetworkLessons$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32849a;
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
        C2768b c2768b = this.f32850b;
        j23 j23Var = c2768b.f32885i;
        String strMo4589b2 = c2768b.f32878b.mo4589b2();
        this.f32849a = 1;
        Object objM7376g = ((C1305u) j23Var.f44938a).m7376g(strMo4589b2, this.f32851c, this);
        if (objM7376g != coroutineSingletons) {
            objM7376g = xfaVar;
        }
        return objM7376g == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
