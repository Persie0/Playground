package com.lingq.feature.collections.components;

import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.vi3;
import p000.w81;
import p000.x81;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.components.CollectionObserveListEndKt$CollectionObserveListEnd$1$1", m4291f = "CollectionObserveListEnd.kt", m4292l = {20}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionObserveListEndKt$CollectionObserveListEnd$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25539a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0127b f25540b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f25541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionObserveListEndKt$CollectionObserveListEnd$1$1(C0127b c0127b, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f25540b = c0127b;
        this.f25541c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionObserveListEndKt$CollectionObserveListEnd$1$1(this.f25540b, this.f25541c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionObserveListEndKt$CollectionObserveListEnd$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25539a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC0278f.m1264n(new w81(this.f25540b, 0)));
            x81 x81Var = new x81(this.f25541c, 0);
            this.f25539a = 1;
            if (c83VarM15536o.collect(x81Var, this) == coroutineSingletons) {
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
