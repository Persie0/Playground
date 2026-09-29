package com.lingq.feature.collections;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e23;
import p000.v91;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeLessonCounters$1", m4291f = "CollectionViewModel.kt", m4292l = {1087}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeLessonCounters$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f25474c;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeLessonCounters$1$2 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeLessonCounters$1$2", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20242 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25475a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25476b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20242(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25476b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20242 c20242 = new C20242(this.f25476b, continuation);
            c20242.f25475a = obj;
            return c20242;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20242 c20242 = (C20242) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20242.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25475a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f25476b.f25563V.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeLessonCounters$1(C2034d c2034d, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f25473b = c2034d;
        this.f25474c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionViewModel$observeLessonCounters$1(this.f25473b, this.f25474c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionViewModel$observeLessonCounters$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25472a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25473b;
            e23 e23Var = c2034d.f25551J;
            ArrayList arrayList = this.f25474c;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Pair(new Integer(((Number) it.next()).intValue()), LibraryItemType.Content.getValue()));
            }
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1296l) e23Var.f36613a).m7317l(arrayList2));
            C20242 c20242 = new C20242(c2034d, null);
            this.f25472a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c20242, this) == coroutineSingletons) {
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
