package com.lingq.feature.playlist;

import com.lingq.core.domain.model.CoursePlaylistSort;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.l55;
import p000.lda;
import p000.n83;
import p000.q2c;
import p000.v91;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$getCoursePlaylist$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {227}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$getCoursePlaylist$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27560b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.CollectionPlaylistViewModel$getCoursePlaylist$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$getCoursePlaylist$1$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22351 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2251a f27562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22351(C2251a c2251a, Continuation continuation) {
            super(2, continuation);
            this.f27562b = c2251a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22351 c22351 = new C22351(this.f27562b, continuation);
            c22351.f27561a = obj;
            return c22351;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22351 c22351 = (C22351) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22351.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f27561a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2251a c2251a = this.f27562b;
            C3244l c3244l = c2251a.f27789r;
            Boolean boolValueOf = Boolean.valueOf(list.isEmpty());
            c3244l.getClass();
            c3244l.m15572j(null, boolValueOf);
            C3244l c3244l2 = c2251a.f27786o;
            c3244l2.getClass();
            c3244l2.m15572j(null, list);
            ArrayList arrayListM19624a = q2c.m19624a(list);
            ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM19624a, 10));
            Iterator it = arrayListM19624a.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((l55) it.next()).f49081a.f63767a, arrayList);
            }
            wfb.m23926u(lda.m16103C(c2251a), c2251a.f27783l, null, new CollectionPlaylistViewModel$fetchLessonCounters$1(c2251a, arrayList, null), 2);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$getCoursePlaylist$1(C2251a c2251a, Continuation continuation) {
        super(1, continuation);
        this.f27560b = c2251a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionPlaylistViewModel$getCoursePlaylist$1(this.f27560b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionPlaylistViewModel$getCoursePlaylist$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27559a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2251a c2251a = this.f27560b;
            n83 n83VarM8198a = c2251a.f27778g.m8198a((CoursePlaylistSort) c2251a.f27787p.getValue(), c2251a.f27785n.f71040a);
            C22351 c22351 = new C22351(c2251a, null);
            this.f27559a = 1;
            if (AbstractC3224d.m15529h(n83VarM8198a, c22351, this) == coroutineSingletons) {
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
