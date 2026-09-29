package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.Sort;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c23;
import p000.c32;
import p000.c61;
import p000.l91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$fetchCourseLessons$1", m4291f = "CollectionViewModel.kt", m4292l = {1053}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$fetchCourseLessons$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l91 f25377c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Sort f25378d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f25379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$fetchCourseLessons$1(C2034d c2034d, l91 l91Var, Sort sort, int i, Continuation continuation) {
        super(1, continuation);
        this.f25376b = c2034d;
        this.f25377c = l91Var;
        this.f25378d = sort;
        this.f25379e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$fetchCourseLessons$1(this.f25376b, this.f25377c, this.f25378d, this.f25379e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$fetchCourseLessons$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        Object objM7310e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25375a;
        C2034d c2034d = this.f25376b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                l91 l91Var = this.f25377c;
                Sort sort = this.f25378d;
                int i2 = this.f25379e;
                c23 c23Var = c2034d.f25582l;
                String str = l91Var.f49324a;
                int i3 = c2034d.f25567Z;
                this.f25375a = 1;
                objM7310e = ((C1296l) c23Var.f9349a).m7310e(str, i3, sort, EmptyList.f47638a, i2, this);
                if (objM7310e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM7310e = obj;
            }
            failure = new Integer(((Number) objM7310e).intValue());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.m15355a(failure) != null) {
            failure = new Integer(0);
        }
        if (((Number) failure).intValue() == 0 && ((List) c2034d.f25562U.getValue()).isEmpty()) {
            C3244l c3244l = c2034d.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, null, false, false, false, false, false, false, false, true, false, false, false, false, null, 127999)));
        }
        return xfa.f68157a;
    }
}
