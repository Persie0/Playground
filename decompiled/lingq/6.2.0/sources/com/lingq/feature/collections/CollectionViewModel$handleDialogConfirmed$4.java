package com.lingq.feature.collections;

import com.lingq.core.domain.premiumlessons.C1525a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l91;
import p000.un1;
import p000.x61;
import p000.xfa;
import p000.z7d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$handleDialogConfirmed$4", m4291f = "CollectionViewModel.kt", m4292l = {460}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$handleDialogConfirmed$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25392c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z7d f25393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$handleDialogConfirmed$4(C2034d c2034d, l91 l91Var, z7d z7dVar, Continuation continuation) {
        super(2, continuation);
        this.f25391b = c2034d;
        this.f25392c = l91Var;
        this.f25393d = z7dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$handleDialogConfirmed$4(this.f25391b, this.f25392c, this.f25393d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$handleDialogConfirmed$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25390a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1525a c1525a = this.f25391b.f25575e;
            int i2 = this.f25392c.f49325b;
            x61 x61Var = (x61) this.f25393d;
            int i3 = x61Var.f67812c;
            int i4 = x61Var.f67810a;
            this.f25390a = 1;
            if (c1525a.m8202a(i2, i3, i4, this) == coroutineSingletons) {
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
