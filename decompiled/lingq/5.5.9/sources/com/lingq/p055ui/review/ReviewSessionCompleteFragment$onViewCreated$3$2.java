package com.lingq.p055ui.review;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$2", m19206f = "ReviewSessionCompleteFragment.kt", m19207l = {138}, m19208m = "invokeSuspend")
public final class ReviewSessionCompleteFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29556e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewSessionCompleteFragment f29557f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ReviewSessionCompleteAdapter f29558g;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/review/ReviewSessionCompleteAdapter$a;", "items", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteFragment$onViewCreated$3$2$1", m19206f = "ReviewSessionCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45391 extends SuspendLambda implements InterfaceC2056p<List<? extends ReviewSessionCompleteAdapter.AbstractC4530a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29559e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewSessionCompleteFragment f29560f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ReviewSessionCompleteAdapter f29561g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45391(ReviewSessionCompleteAdapter reviewSessionCompleteAdapter, ReviewSessionCompleteFragment reviewSessionCompleteFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29560f = reviewSessionCompleteFragment;
            this.f29561g = reviewSessionCompleteAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45391 c45391 = new C45391(this.f29561g, this.f29560f, interfaceC9968c);
            c45391.f29559e = obj;
            return c45391;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends ReviewSessionCompleteAdapter.AbstractC4530a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45391) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29559e;
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f29560f;
            boolean zM15481b = C7777d.m15481b(reviewSessionCompleteFragment);
            ReviewSessionCompleteAdapter reviewSessionCompleteAdapter = this.f29561g;
            if (zM15481b) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((ReviewSessionCompleteAdapter.AbstractC4530a) obj2) instanceof ReviewSessionCompleteAdapter.AbstractC4530a.a)) {
                        arrayList.add(obj2);
                    }
                }
                reviewSessionCompleteAdapter.m4529q(arrayList);
                ReviewSessionCompleteAdapter reviewSessionCompleteAdapter2 = reviewSessionCompleteFragment.f29534D0;
                if (reviewSessionCompleteAdapter2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    loop1: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop1;
                            }
                            Object next = it.next();
                            if (next instanceof ReviewSessionCompleteAdapter.AbstractC4530a.a) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    reviewSessionCompleteAdapter2.m4529q(arrayList2);
                }
            } else {
                reviewSessionCompleteAdapter.m4529q(list);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteFragment$onViewCreated$3$2(ReviewSessionCompleteAdapter reviewSessionCompleteAdapter, ReviewSessionCompleteFragment reviewSessionCompleteFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29557f = reviewSessionCompleteFragment;
        this.f29558g = reviewSessionCompleteAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewSessionCompleteFragment$onViewCreated$3$2(this.f29558g, this.f29557f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewSessionCompleteFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29556e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewSessionCompleteFragment reviewSessionCompleteFragment = this.f29557f;
            ReviewSessionCompleteViewModel reviewSessionCompleteViewModelM10243n0 = ReviewSessionCompleteFragment.m10243n0(reviewSessionCompleteFragment);
            C45391 c45391 = new C45391(this.f29558g, reviewSessionCompleteFragment, null);
            this.f29556e = 1;
            if (C0062b.m369m0(reviewSessionCompleteViewModelM10243n0.f29585k, c45391, this) == coroutineSingletons) {
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
