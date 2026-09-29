package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.Result;
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
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$fetchCourse$1", m4291f = "CollectionViewModel.kt", m4292l = {1019}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$fetchCourse$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25370b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$fetchCourse$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25370b = c2034d;
        this.f25371c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$fetchCourse$1(this.f25370b, this.f25371c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$fetchCourse$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25369a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2034d c2034d = this.f25370b;
                l91 l91Var = this.f25371c;
                d23 d23Var = c2034d.f25578h;
                String str = l91Var.f49324a;
                int i2 = c2034d.f25567Z;
                this.f25369a = 1;
                obj = ((C1290f) d23Var.f34865a).m7179c(i2, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            new Integer(((Number) obj).intValue());
        } catch (Throwable th) {
            new Result.Failure(th);
        }
        return xfa.f68157a;
    }
}
