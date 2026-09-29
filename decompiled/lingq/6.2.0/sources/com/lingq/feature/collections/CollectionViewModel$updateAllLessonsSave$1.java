package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.l91;
import p000.m23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$updateAllLessonsSave$1", m4291f = "CollectionViewModel.kt", m4292l = {704}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$updateAllLessonsSave$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$updateAllLessonsSave$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(2, continuation);
        this.f25519b = c2034d;
        this.f25520c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$updateAllLessonsSave$1(this.f25519b, this.f25520c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$updateAllLessonsSave$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25518a;
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
        C2034d c2034d = this.f25519b;
        m23 m23Var = c2034d.f25594x;
        l91 l91Var = this.f25520c;
        int i2 = l91Var.f49325b;
        int i3 = c2034d.f25567Z;
        String str = l91Var.f49324a;
        this.f25518a = 1;
        Object objM7295p0 = ((C1295k) m23Var.f50448a).m7295p0(i2, i3, str, this);
        if (objM7295p0 != coroutineSingletons) {
            objM7295p0 = xfaVar;
        }
        return objM7295p0 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
