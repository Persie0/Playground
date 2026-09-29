package com.lingq.p055ui.review;

import ae.C0062b;
import cm.InterfaceC2056p;
import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p264mi.C7566f;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$1", m19206f = "ReviewSessionCompleteFragment.kt", m19207l = {130}, m19208m = "invokeSuspend")
public final class ReviewSessionCompleteFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29547e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewSessionCompleteFragment f29548f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u00020\n*8\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Triple;", "", "Lmi/f;", "", "", "", "cards", "timesCorrect", "timesIncorrect", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$1$1", m19206f = "ReviewSessionCompleteFragment.kt", m19207l = {129}, m19208m = "invokeSuspend")
    public static final class C45371 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super Triple<? extends List<? extends C7566f>, ? extends Map<String, ? extends Integer>, ? extends Map<String, ? extends Integer>>>, List<? extends C7566f>, Map<String, ? extends Integer>, Map<String, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29549e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f29550f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ List f29551g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Map f29552h;

        /* JADX INFO: renamed from: i */
        public /* synthetic */ Map f29553i;

        public C45371(InterfaceC9968c<? super C45371> interfaceC9968c) {
            super(5, interfaceC9968c);
        }

        @Override // cm.InterfaceC2059s
        /* JADX INFO: renamed from: o0 */
        public final Object mo1501o0(InterfaceC7117d<? super Triple<? extends List<? extends C7566f>, ? extends Map<String, ? extends Integer>, ? extends Map<String, ? extends Integer>>> interfaceC7117d, List<? extends C7566f> list, Map<String, ? extends Integer> map, Map<String, ? extends Integer> map2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C45371 c45371 = new C45371(interfaceC9968c);
            c45371.f29550f = interfaceC7117d;
            c45371.f29551g = list;
            c45371.f29552h = map;
            c45371.f29553i = map2;
            return c45371.mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29549e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7117d interfaceC7117d = this.f29550f;
                Triple triple = new Triple(this.f29551g, this.f29552h, this.f29553i);
                this.f29550f = null;
                this.f29551g = null;
                this.f29552h = null;
                this.f29549e = 1;
                if (interfaceC7117d.mo1339r(triple, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$1$2 */
    @Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u000726\u0010\u0006\u001a2\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "Lmi/f;", "", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$1$2", m19206f = "ReviewSessionCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45382 extends SuspendLambda implements InterfaceC2056p<Triple<? extends List<? extends C7566f>, ? extends Map<String, ? extends Integer>, ? extends Map<String, ? extends Integer>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29554e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewSessionCompleteFragment f29555f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45382(ReviewSessionCompleteFragment reviewSessionCompleteFragment, InterfaceC9968c<? super C45382> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29555f = reviewSessionCompleteFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45382 c45382 = new C45382(this.f29555f, interfaceC9968c);
            c45382.f29554e = obj;
            return c45382;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends List<? extends C7566f>, ? extends Map<String, ? extends Integer>, ? extends Map<String, ? extends Integer>> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45382) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f29554e;
            List list = (List) triple.f38021a;
            Map map = (Map) triple.f38022b;
            Map map2 = (Map) triple.f38023c;
            if (!list.isEmpty()) {
                ReviewSessionCompleteViewModel reviewSessionCompleteViewModelM10243n0 = ReviewSessionCompleteFragment.m10243n0(this.f29555f);
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7566f) it.next()).f41692b);
                }
                C5207g.m11111f(map, "timesCorrect");
                C5207g.m11111f(map2, "timesIncorrect");
                reviewSessionCompleteViewModelM10243n0.f29583i.setValue(map);
                reviewSessionCompleteViewModelM10243n0.f29584j.setValue(map2);
                C7828f.m15570d(C8573r0.m16767w0(reviewSessionCompleteViewModelM10243n0), null, null, new ReviewSessionCompleteViewModel$fetchCards$1(reviewSessionCompleteViewModelM10243n0, arrayList, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteFragment$onViewCreated$3$1(ReviewSessionCompleteFragment reviewSessionCompleteFragment, InterfaceC9968c<? super ReviewSessionCompleteFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29548f = reviewSessionCompleteFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewSessionCompleteFragment$onViewCreated$3$1(this.f29548f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewSessionCompleteFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29547e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewSessionCompleteFragment.f29530F0;
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f29548f;
            ReviewViewModel reviewViewModelM10244o0 = reviewSessionCompleteFragment.m10244o0();
            ReviewViewModel reviewViewModelM10244o1 = reviewSessionCompleteFragment.m10244o0();
            ReviewViewModel reviewViewModelM10244o2 = reviewSessionCompleteFragment.m10244o0();
            C7136q c7136qM389r0 = C0062b.m389r0(reviewViewModelM10244o0.f29624P, reviewViewModelM10244o1.f29636V, reviewViewModelM10244o2.f29639X, new C45371(null));
            C45382 c45382 = new C45382(reviewSessionCompleteFragment, null);
            this.f29547e = 1;
            if (C0062b.m369m0(c7136qM389r0, c45382, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
