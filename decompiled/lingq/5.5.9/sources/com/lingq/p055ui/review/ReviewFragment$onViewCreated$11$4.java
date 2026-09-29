package com.lingq.p055ui.review;

import ae.C0062b;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.C1084b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p462wj.C9955c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$4", m19206f = "ReviewFragment.kt", m19207l = {255}, m19208m = "invokeSuspend")
public final class ReviewFragment$onViewCreated$11$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29483e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewFragment f29484f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$4$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$4$1", m19206f = "ReviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45221 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ReviewFragment f29485e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45221(ReviewFragment reviewFragment, InterfaceC9968c<? super C45221> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29485e = reviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C45221(this.f29485e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45221) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29485e;
            FragmentContainerView fragmentContainerView = reviewFragment.m10239n0().f45106e;
            C5207g.m11110e(fragmentContainerView, "binding.navHostFragmentReview");
            C1084b.m4034a(fragmentContainerView).m3996q(R.id.fragment_review_start, false);
            ReviewViewModel reviewViewModelM10240o0 = reviewFragment.m10240o0();
            StateFlowImpl stateFlowImpl = reviewViewModelM10240o0.f29641Z;
            stateFlowImpl.setValue(0);
            EmptyList emptyList = EmptyList.f38032a;
            reviewViewModelM10240o0.f29622O.setValue(emptyList);
            reviewViewModelM10240o0.f29634U.setValue(C6753d.m13459L0());
            reviewViewModelM10240o0.f29638W.setValue(C6753d.m13459L0());
            reviewViewModelM10240o0.f29626Q.setValue(emptyList);
            reviewViewModelM10240o0.f29660k0.setValue(new C9955c(ReviewActivityShow.Nothing));
            reviewViewModelM10240o0.f29630S.setValue(0);
            stateFlowImpl.setValue(-1);
            reviewViewModelM10240o0.f29618M.mo14371k(reviewViewModelM10240o0.f29616L);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFragment$onViewCreated$11$4(ReviewFragment reviewFragment, InterfaceC9968c<? super ReviewFragment$onViewCreated$11$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29484f = reviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewFragment$onViewCreated$11$4(this.f29484f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewFragment$onViewCreated$11$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29483e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29484f;
            ReviewViewModel reviewViewModelM10240o0 = reviewFragment.m10240o0();
            C45221 c45221 = new C45221(reviewFragment, null);
            this.f29483e = 1;
            if (C0062b.m369m0(reviewViewModelM10240o0.f29650f0, c45221, this) == coroutineSingletons) {
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
