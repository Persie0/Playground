package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c61;
import p000.c83;
import p000.e23;
import p000.u91;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseCounter$1", m4291f = "CollectionViewModel.kt", m4292l = {968}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeCourseCounter$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25419c;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeCourseCounter$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeCourseCounter$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20141 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25420a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20141(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25421b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20141 c20141 = new C20141(this.f25421b, continuation);
            c20141.f25420a = obj;
            return c20141;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20141 c20141 = (C20141) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20141.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            List list = (List) this.f25420a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) u91.m22591I0(list);
            if (libraryItemCounter != null) {
                C3244l c3244l = this.f25421b.f25559R;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, libraryItemCounter, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, 131069)));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeCourseCounter$1(C2034d c2034d, int i, Continuation continuation) {
        super(1, continuation);
        this.f25418b = c2034d;
        this.f25419c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeCourseCounter$1(this.f25418b, this.f25419c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeCourseCounter$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25417a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25418b;
            e23 e23Var = c2034d.f25551J;
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1296l) e23Var.f36613a).m7317l(vz1.m23604J(new Pair(new Integer(this.f25419c), LibraryItemType.Collection.getValue()))));
            C20141 c20141 = new C20141(c2034d, null);
            this.f25417a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c20141, this) == coroutineSingletons) {
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
