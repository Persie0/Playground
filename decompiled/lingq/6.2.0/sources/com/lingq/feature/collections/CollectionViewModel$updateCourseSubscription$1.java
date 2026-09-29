package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d23;
import p000.l91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$updateCourseSubscription$1", m4291f = "CollectionViewModel.kt", m4292l = {695}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$updateCourseSubscription$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$updateCourseSubscription$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25525b = c2034d;
        this.f25526c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$updateCourseSubscription$1(this.f25525b, this.f25526c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$updateCourseSubscription$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25524a;
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
        C2034d c2034d = this.f25525b;
        d23 d23Var = c2034d.f25593w;
        int i2 = c2034d.f25567Z;
        String str = this.f25526c.f49324a;
        this.f25524a = 1;
        Object objM7187k = ((C1290f) d23Var.f34865a).m7187k(i2, str, this);
        if (objM7187k != coroutineSingletons) {
            objM7187k = xfaVar;
        }
        return objM7187k == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
