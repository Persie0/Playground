package com.lingq.feature.collections;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3639u8;
import p000.c32;
import p000.l91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$blacklistCourse$1", m4291f = "CollectionViewModel.kt", m4292l = {753}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$blacklistCourse$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25345c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$blacklistCourse$1(C2034d c2034d, l91 l91Var, String str, Continuation continuation) {
        super(1, continuation);
        this.f25344b = c2034d;
        this.f25345c = l91Var;
        this.f25346d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$blacklistCourse$1(this.f25344b, this.f25345c, this.f25346d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$blacklistCourse$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25343a;
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
        C2034d c2034d = this.f25344b;
        C3639u8 c3639u8 = c2034d.f25596z;
        l91 l91Var = this.f25345c;
        int i2 = l91Var.f49325b;
        String str = l91Var.f49324a;
        int i3 = c2034d.f25567Z;
        this.f25343a = 1;
        Object objM7099a = c3639u8.f63533a.m7099a(i2, i3, str, this.f25346d, this);
        if (objM7099a != coroutineSingletons) {
            objM7099a = xfaVar;
        }
        return objM7099a == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
