package com.lingq.feature.collections;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.l91;
import p000.q91;
import p000.un1;
import p000.xfa;
import p000.z61;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$checkPaidContentBeforeSave$1", m4291f = "CollectionViewModel.kt", m4292l = {394}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$checkPaidContentBeforeSave$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25359c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25360d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f25361e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f25362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$checkPaidContentBeforeSave$1(C2034d c2034d, String str, int i, int i2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f25358b = c2034d;
        this.f25359c = str;
        this.f25360d = i;
        this.f25361e = i2;
        this.f25362f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$checkPaidContentBeforeSave$1(this.f25358b, this.f25359c, this.f25360d, this.f25361e, this.f25362f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$checkPaidContentBeforeSave$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25357a;
        C2034d c2034d = this.f25358b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25357a = 1;
            obj = c2034d.f25546E.m8961b(this);
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
        String str = this.f25359c;
        boolean zM11650l = fa4.m11650l(str, (String) obj);
        boolean z = this.f25362f;
        int i2 = this.f25360d;
        if (zM11650l) {
            l91 l91Var = c2034d.f25557P;
            if (l91Var != null) {
                c2034d.m8952f3(l91Var, i2, z);
            }
        } else {
            C3244l c3244l = c2034d.f25555N;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, q91.m19806a((q91) value, null, false, null, new z61(i2, this.f25361e, str, z), null, false, false, 239)));
        }
        return xfa.f68157a;
    }
}
