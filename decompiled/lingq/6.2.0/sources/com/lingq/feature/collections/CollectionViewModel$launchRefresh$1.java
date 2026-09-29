package com.lingq.feature.collections;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$launchRefresh$1", m4291f = "CollectionViewModel.kt", m4292l = {1122}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$launchRefresh$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f25395b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2034d f25396c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25397d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f25398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$launchRefresh$1(vi3 vi3Var, C2034d c2034d, String str, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f25395b = vi3Var;
        this.f25396c = c2034d;
        this.f25397d = str;
        this.f25398e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$launchRefresh$1(this.f25395b, this.f25396c, this.f25397d, this.f25398e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$launchRefresh$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConcurrentHashMap concurrentHashMap = this.f25396c.f25558Q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25394a;
        Object obj2 = this.f25398e;
        String str = this.f25397d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vi3 vi3Var = this.f25395b;
                this.f25394a = 1;
                if (vi3Var.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            concurrentHashMap.remove(str, obj2);
            return xfa.f68157a;
        } catch (Throwable th) {
            concurrentHashMap.remove(str, obj2);
            throw th;
        }
    }
}
