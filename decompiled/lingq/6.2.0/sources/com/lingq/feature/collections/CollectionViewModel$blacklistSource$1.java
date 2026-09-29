package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1286b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l91;
import p000.vi3;
import p000.web;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$blacklistSource$1", m4291f = "CollectionViewModel.kt", m4292l = {721}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$blacklistSource$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25349c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$blacklistSource$1(C2034d c2034d, l91 l91Var, String str, Continuation continuation) {
        super(1, continuation);
        this.f25348b = c2034d;
        this.f25349c = l91Var;
        this.f25350d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$blacklistSource$1(this.f25348b, this.f25349c, this.f25350d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$blacklistSource$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25347a;
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
        web webVar = this.f25348b.f25595y;
        l91 l91Var = this.f25349c;
        int i2 = l91Var.f49325b;
        String str = l91Var.f49324a;
        this.f25347a = 1;
        Object objM7100b = ((C1286b) webVar.f66742a).m7100b(i2, str, this.f25350d, this);
        if (objM7100b != coroutineSingletons) {
            objM7100b = xfaVar;
        }
        return objM7100b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
