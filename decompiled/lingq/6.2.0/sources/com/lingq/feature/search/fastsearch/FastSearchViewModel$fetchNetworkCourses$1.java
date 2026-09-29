package com.lingq.feature.search.fastsearch;

import com.lingq.core.data.repository.C1305u;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.i23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$fetchNetworkCourses$1", m4291f = "FastSearchViewModel.kt", m4292l = {261}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$fetchNetworkCourses$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32847b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f32848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$fetchNetworkCourses$1(C2768b c2768b, List list, Continuation continuation) {
        super(1, continuation);
        this.f32847b = c2768b;
        this.f32848c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FastSearchViewModel$fetchNetworkCourses$1(this.f32847b, this.f32848c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((FastSearchViewModel$fetchNetworkCourses$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32846a;
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
        C2768b c2768b = this.f32847b;
        i23 i23Var = c2768b.f32886j;
        String strMo4589b2 = c2768b.f32878b.mo4589b2();
        this.f32846a = 1;
        Object objM7374e = ((C1305u) i23Var.f43380a).m7374e(strMo4589b2, this.f32848c, this);
        if (objM7374e != coroutineSingletons) {
            objM7374e = xfaVar;
        }
        return objM7374e == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
