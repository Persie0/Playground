package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l91;
import p000.vi3;
import p000.xfa;
import p000.zl3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$updateCourseLike$1", m4291f = "CollectionViewModel.kt", m4292l = {686}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$updateCourseLike$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$updateCourseLike$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25522b = c2034d;
        this.f25523c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$updateCourseLike$1(this.f25522b, this.f25523c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$updateCourseLike$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25521a;
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
        C2034d c2034d = this.f25522b;
        zl3 zl3Var = c2034d.f25592v;
        int i2 = c2034d.f25567Z;
        String str = this.f25523c.f49324a;
        this.f25521a = 1;
        Object objM7186j = ((C1290f) zl3Var.f71694a).m7186j(i2, str, this);
        if (objM7186j != coroutineSingletons) {
            objM7186j = xfaVar;
        }
        return objM7186j == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
