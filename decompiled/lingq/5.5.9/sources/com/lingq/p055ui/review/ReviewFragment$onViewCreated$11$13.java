package com.lingq.p055ui.review;

import ae.C0062b;
import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.C1084b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.lesson.LessonProgressBar;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p462wj.AbstractC9953a;
import p462wj.InterfaceC9956d;
import p462wj.InterfaceC9957e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$13", m19206f = "ReviewFragment.kt", m19207l = {343}, m19208m = "invokeSuspend")
public final class ReviewFragment$onViewCreated$11$13 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29458e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewFragment f29459f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$13$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lwj/a;", "activity", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$13$1", m19206f = "ReviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45151 extends SuspendLambda implements InterfaceC2056p<AbstractC9953a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29460e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewFragment f29461f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45151(ReviewFragment reviewFragment, InterfaceC9968c<? super C45151> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29461f = reviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45151 c45151 = new C45151(this.f29461f, interfaceC9968c);
            c45151.f29460e = obj;
            return c45151;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC9953a abstractC9953a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45151) mo1336a(abstractC9953a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Object obj2 = (AbstractC9953a) this.f29460e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29461f;
            LessonProgressBar lessonProgressBar = reviewFragment.m10239n0().f45105d;
            lessonProgressBar.m10119c(lessonProgressBar.f27349Q);
            MaterialCardView materialCardView = reviewFragment.m10239n0().f45104c;
            C5207g.m11110e(materialCardView, "binding.cardView");
            C4924a.m10442U(materialCardView);
            Bundle bundle = new Bundle();
            if (obj2 instanceof InterfaceC9957e) {
                MaterialCardView materialCardView2 = reviewFragment.m10239n0().f45104c;
                C5207g.m11110e(materialCardView2, "binding.cardView");
                C4924a.m10457e0(materialCardView2);
                InterfaceC9957e interfaceC9957e = (InterfaceC9957e) obj2;
                bundle.putString("currentCard", interfaceC9957e.mo18533a().f41692b);
                boolean z10 = true;
                if (interfaceC9957e instanceof AbstractC9953a.d ? true : interfaceC9957e instanceof AbstractC9953a.e) {
                    FragmentContainerView fragmentContainerView = reviewFragment.m10239n0().f45106e;
                    C5207g.m11110e(fragmentContainerView, "binding.navHostFragmentReview");
                    C1084b.m4034a(fragmentContainerView).m3992m(R.id.fragment_review_flashcard, bundle, null);
                } else {
                    if (!(interfaceC9957e instanceof AbstractC9953a.b ? true : interfaceC9957e instanceof AbstractC9953a.c ? true : interfaceC9957e instanceof AbstractC9953a.g ? true : interfaceC9957e instanceof AbstractC9953a.h)) {
                        z10 = interfaceC9957e instanceof AbstractC9953a.a;
                    }
                    if (z10) {
                        FragmentContainerView fragmentContainerView2 = reviewFragment.m10239n0().f45106e;
                        C5207g.m11110e(fragmentContainerView2, "binding.navHostFragmentReview");
                        C1084b.m4034a(fragmentContainerView2).m3992m(R.id.fragment_review_multichoice, bundle, null);
                    }
                }
            } else if (obj2 instanceof InterfaceC9956d) {
                InterfaceC9956d interfaceC9956d = (InterfaceC9956d) obj2;
                if (interfaceC9956d instanceof AbstractC9953a.j) {
                    bundle.putInt("lessonId", reviewFragment.m10240o0().f29612J.f49120a);
                    bundle.putInt("sentenceIndex", ((AbstractC9953a.j) obj2).f50651a);
                    FragmentContainerView fragmentContainerView3 = reviewFragment.m10239n0().f45106e;
                    C5207g.m11110e(fragmentContainerView3, "binding.navHostFragmentReview");
                    C1084b.m4034a(fragmentContainerView3).m3992m(R.id.fragment_review_unscramble, bundle, null);
                } else if (interfaceC9956d instanceof AbstractC9953a.i) {
                    bundle.putInt("lessonId", reviewFragment.m10240o0().f29612J.f49120a);
                    bundle.putInt("sentenceIndex", ((AbstractC9953a.i) obj2).f50650a);
                    FragmentContainerView fragmentContainerView4 = reviewFragment.m10239n0().f45106e;
                    C5207g.m11110e(fragmentContainerView4, "binding.navHostFragmentReview");
                    C1084b.m4034a(fragmentContainerView4).m3992m(R.id.fragment_review_speaking, bundle, null);
                } else if (interfaceC9956d instanceof AbstractC9953a.f) {
                    bundle.putStringArray("terms", (String[]) ((AbstractC9953a.f) obj2).f50643a.toArray(new String[0]));
                    FragmentContainerView fragmentContainerView5 = reviewFragment.m10239n0().f45106e;
                    C5207g.m11110e(fragmentContainerView5, "binding.navHostFragmentReview");
                    C1084b.m4034a(fragmentContainerView5).m3992m(R.id.fragment_review_activity_matching, bundle, null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFragment$onViewCreated$11$13(ReviewFragment reviewFragment, InterfaceC9968c<? super ReviewFragment$onViewCreated$11$13> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29459f = reviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewFragment$onViewCreated$11$13(this.f29459f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewFragment$onViewCreated$11$13) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29458e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29459f;
            ReviewViewModel reviewViewModelM10240o0 = reviewFragment.m10240o0();
            C45151 c45151 = new C45151(reviewFragment, null);
            this.f29458e = 1;
            if (C0062b.m369m0(reviewViewModelM10240o0.f29668r0, c45151, this) == coroutineSingletons) {
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
