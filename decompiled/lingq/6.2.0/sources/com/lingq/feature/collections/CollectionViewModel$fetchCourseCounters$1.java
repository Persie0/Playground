package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b23;
import p000.c32;
import p000.l91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$fetchCourseCounters$1", m4291f = "CollectionViewModel.kt", m4292l = {1070}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$fetchCourseCounters$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25373b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$fetchCourseCounters$1(C2034d c2034d, l91 l91Var, Continuation continuation) {
        super(1, continuation);
        this.f25373b = c2034d;
        this.f25374c = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$fetchCourseCounters$1(this.f25373b, this.f25374c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$fetchCourseCounters$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7308c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25372a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25373b;
            l91 l91Var = this.f25374c;
            b23 b23Var = c2034d.f25584n;
            String str = l91Var.f49324a;
            List listM23604J = vz1.m23604J(new Integer(c2034d.f25567Z));
            this.f25372a = 1;
            b23Var.getClass();
            if (listM23604J.isEmpty() || (objM7308c = ((C1296l) b23Var.f7790a).m7308c(str, listM23604J, this)) != coroutineSingletons) {
                objM7308c = xfaVar;
            }
            return objM7308c == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Throwable th) {
            new Result.Failure(th);
            return xfaVar;
        }
    }
}
