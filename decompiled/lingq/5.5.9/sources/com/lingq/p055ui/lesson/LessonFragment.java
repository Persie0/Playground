package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.lesson.LessonFragment;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.p055ui.lesson.data.TokenFragmentData;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import dm.C5209i;
import gd.C5772k;
import java.util.List;
import java.util.WeakHashMap;
import kh.C6681h;
import kh.C6684k;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p076di.InterfaceC5179a;
import p080e.RunnableC5286r;
import p096ei.C5408a;
import p160hj.AbstractC6056b;
import p160hj.C6061g;
import p160hj.ViewOnTouchListenerC6057c;
import p225kk.C6704a;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.C7777d;
import p304ok.InterfaceC8066b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p378s3.C8953b;
import p385sf.C9000b;
import p402u0.C9370m;
import p406u4.AbstractC9409f0;
import p406u4.C9415i0;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p522z2.C10437a;
import ph.C8274e0;
import ph.C8278e4;
import ph.C8324m2;
import pk.InterfaceC8402c;
import sh.AbstractC9006b;
import sh.InterfaceC9008d;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/LessonFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonFragment extends AbstractC6056b {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f27053M0 = {C0204c.m857q(LessonFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonBinding;")};

    /* JADX INFO: renamed from: A0 */
    public C4270d f27054A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f27055B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f27056C0;

    /* JADX INFO: renamed from: D0 */
    public final C1681f f27057D0;

    /* JADX INFO: renamed from: E0 */
    public PopupWindow f27058E0;

    /* JADX INFO: renamed from: F0 */
    public C8278e4 f27059F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f27060G0;

    /* JADX INFO: renamed from: H0 */
    public final C4167f f27061H0;

    /* JADX INFO: renamed from: I0 */
    public C7796d f27062I0;

    /* JADX INFO: renamed from: J0 */
    public InterfaceC5179a f27063J0;

    /* JADX INFO: renamed from: K0 */
    public C6704a f27064K0;

    /* JADX INFO: renamed from: L0 */
    public PlayerController f27065L0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$a */
    public static final class C4162a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C8274e0 f27067b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f27068c;

        public C4162a(C8274e0 c8274e0, boolean z10) {
            this.f27067b = c8274e0;
            this.f27068c = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C5207g.m11111f(animator, "animation");
            LessonFragment lessonFragment = LessonFragment.this;
            if (lessonFragment.f6094c0 != null && lessonFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                C8274e0 c8274e0 = this.f27067b;
                LinearLayout linearLayout = (LinearLayout) c8274e0.f44699j.f45031e;
                boolean z10 = this.f27068c;
                linearLayout.setVisibility(z10 ? 0 : 8);
                if (!z10) {
                    c8274e0.f44700k.m10122f(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$b */
    public static final class C4163b implements InterfaceC9008d {
        public C4163b() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: a */
        public final void mo9863a(float f3) {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: b */
        public final void mo9864b() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().m10135B2(AbstractC9006b.c.f47218a);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: c */
        public final void mo9865c(float f3) {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: d */
        public final void mo9866d() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().m10135B2(AbstractC9006b.h.f47223a);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: e */
        public final void mo9867e() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: f */
        public final void mo9868f() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().m10135B2(AbstractC9006b.b.f47217a);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: g */
        public final void mo9869g() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: h */
        public final void mo9870h() {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().m10135B2(AbstractC9006b.a.f47216a);
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: i */
        public final void mo9871i() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: j */
        public final void mo9872j() {
        }

        @Override // sh.InterfaceC9008d
        /* JADX INFO: renamed from: k */
        public final void mo9873k() {
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$c */
    public static final class C4164c implements LessonProgressBar.InterfaceC4222a {
        public C4164c() {
        }

        @Override // com.lingq.p055ui.lesson.LessonProgressBar.InterfaceC4222a
        /* JADX INFO: renamed from: a */
        public final void mo10113a(int i10) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().m10139F2(i10, true);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$d */
    public static final class C4165d implements InterfaceC8402c {
        @Override // pk.InterfaceC8402c
        /* JADX INFO: renamed from: a */
        public final void mo5247a(InterfaceC8066b interfaceC8066b) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            interfaceC8066b.pause();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$e */
    public static final class ViewOnLayoutChangeListenerC4166e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC4166e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C5207g.m11111f(view, "view");
            view.removeOnLayoutChangeListener(this);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().f27418N0.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$f */
    public static final class C4167f extends ViewPager2.AbstractC1229e {
        public C4167f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: a */
        public final void mo4680a(int i10) {
            LessonFragment lessonFragment = LessonFragment.this;
            if (i10 == 0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                lessonFragment.m10107o0().f44700k.m10126l();
            } else {
                if (i10 != 2) {
                    return;
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                lessonFragment.m10109q0().f27487j0.setValue(Boolean.TRUE);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: b */
        public final void mo4686b(float f3, int i10, int i11) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10107o0().f44700k.m10125k(i10, f3);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: c */
        public final void mo4681c(int i10) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment.this.m10109q0().m10139F2(i10, true);
        }
    }

    public LessonFragment() {
        super(R.layout.fragment_lesson);
        this.f27055B0 = C4924a.m10477o0(this, LessonFragment$binding$2.f27070j);
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.LessonFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f27338b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.LessonFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f27056C0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.LessonFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.LessonFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.LessonFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f27057D0 = new C1681f(C5209i.m11118a(C6061g.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.lesson.LessonFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
        this.f27061H0 = new C4167f();
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m10106n0(LessonFragment lessonFragment, TokenData tokenData) {
        lessonFragment.getClass();
        FragmentManager fragmentManagerM10446Y = C4924a.m10446Y(lessonFragment);
        if (((TokenFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(TokenFragment.class.getName()) : null)) == null) {
            lessonFragment.m10111s0(tokenData);
            return;
        }
        lessonFragment.m10109q0().mo10064t0(tokenData);
        if (tokenData.f31176b != TokenType.NewWordOrPhraseType) {
            if (!C7777d.m15481b(lessonFragment)) {
                C7777d.m15483d(lessonFragment.m3594l(), true);
            }
            if (!C4924a.m10462h(lessonFragment.m3578a0())) {
                lessonFragment.m10109q0().mo9745u0(false);
            }
            lessonFragment.m3580c0().postDelayed(new RunnableC5286r(lessonFragment, 20, tokenData), 200L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        m10109q0().mo9731b0(true);
        m10109q0().mo9720E(PlayingFrom.Lesson);
        m10109q0().mo9402N(AppUsageType.Reading);
        if (C7777d.m15481b(this)) {
            m10109q0().mo10065z();
        }
        if (this.f27060G0) {
            this.f27060G0 = false;
            LessonViewModel lessonViewModelM10109q0 = m10109q0();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$updateUser$1(lessonViewModelM10109q0, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        m10109q0().f27484i0.setValue(-1);
        m10107o0().f44701l.f7742c.f7767a.remove(this.f27061H0);
        LessonViewModel lessonViewModelM10109q0 = m10109q0();
        C7828f.m15570d(lessonViewModelM10109q0.f27429R, null, null, new LessonViewModel$updateCounterForLesson$1(lessonViewModelM10109q0, C9000b.m17251q(Integer.valueOf(lessonViewModelM10109q0.m10152y2())), null), 3);
        m10109q0().mo9731b0(false);
        m10109q0().f27418N0.setValue(Boolean.FALSE);
        if (C4924a.m10460g(m3578a0())) {
            m10109q0().f27499o0.setValue(Boolean.valueOf(C7777d.m15481b(this)));
        }
        m10109q0().mo9421x(AppUsageType.Reading);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility", "RestrictedApi"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9370m c9370m = new C9370m(14, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9370m);
        C1681f c1681f = this.f27057D0;
        final int i10 = 1;
        final int i11 = 0;
        if (((C6061g) c1681f.getValue()).f35770d) {
            C9415i0 c9415i0 = new C9415i0(m3578a0());
            AbstractC9409f0 abstractC9409f0M17816c = c9415i0.m17816c(R.transition.slide_up);
            abstractC9409f0M17816c.mo17785L(C10437a.m19409b(0.05f, 0.7f, 0.1f, 1.0f));
            abstractC9409f0M17816c.mo17783J(600L);
            m3585f0(abstractC9409f0M17816c);
            AbstractC9409f0 abstractC9409f0M17816c2 = c9415i0.m17816c(R.transition.slide_down);
            abstractC9409f0M17816c2.mo17785L(C10437a.m19409b(0.3f, 0.0f, 0.8f, 0.15f));
            abstractC9409f0M17816c2.mo17783J(400L);
            m3591j0(abstractC9409f0M17816c2);
        } else {
            C8228i c8228i = new C8228i(1, true);
            c8228i.f48293c = 600L;
            c8228i.f48294d = new C8953b();
            m3585f0(c8228i);
            C8228i c8228i2 = new C8228i(1, false);
            c8228i2.f48293c = 200L;
            c8228i2.f48294d = new C8953b();
            m3591j0(c8228i2);
            C8228i c8228i3 = new C8228i(1, false);
            c8228i3.f48293c = 200L;
            m3587g0(c8228i3);
        }
        C8274e0 c8274e0M10107o0 = m10107o0();
        ViewPager2 viewPager2 = m10107o0().f44701l;
        C5207g.m11110e(viewPager2, "binding.pagerLesson");
        if (!C10029b0.g.m18699c(viewPager2) || viewPager2.isLayoutRequested()) {
            viewPager2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4166e());
        } else {
            m10109q0().f27418N0.setValue(Boolean.TRUE);
        }
        LinearLayout linearLayout = (LinearLayout) c8274e0M10107o0.f44699j.f45031e;
        C5207g.m11110e(linearLayout, "loadingViews.viewLoading");
        C4924a.m10457e0(linearLayout);
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: hj.e

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFragment f35764b;

            {
                this.f35764b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                LessonFragment lessonFragment = this.f35764b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        C8573r0.m16725g0(lessonFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        InterfaceC4865b.a.m10388a(lessonFragment.m10109q0(), false, 3);
                        lessonFragment.m10112t0();
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        lessonFragment.m10109q0().mo9724L();
                        lessonFragment.m10109q0().mo10025A1();
                        PopupWindow popupWindow = lessonFragment.f27058E0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            C5207g.m11117l("popupSettings");
                            throw null;
                        }
                }
            }
        };
        ImageView imageView = c8274e0M10107o0.f44690a;
        imageView.setOnClickListener(onClickListener);
        C8324m2 c8324m2 = c8274e0M10107o0.f44699j;
        ((ImageView) c8324m2.f45028b).setOnClickListener(new View.OnClickListener(this) { // from class: hj.f

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFragment f35766b;

            {
                this.f35766b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                LessonFragment lessonFragment = this.f35766b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        C8573r0.m16725g0(lessonFragment).m3995p();
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        lessonFragment.m10108p0().pause();
                        lessonFragment.m10109q0().m10138E2(ReviewType.Integrated);
                        break;
                }
            }
        });
        c8274e0M10107o0.f44703n.setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.ui.lesson.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFragment f27843b;

            {
                this.f27843b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                LessonFragment lessonFragment = this.f27843b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        RelativeLayout relativeLayout = lessonFragment.m10107o0().f44715z;
                        C5207g.m11110e(relativeLayout, "binding.viewYoutubePlayer");
                        C4924a.m10442U(relativeLayout);
                        YouTubePlayerView youTubePlayerView = lessonFragment.m10107o0().f44689A;
                        C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                        C4924a.m10442U(youTubePlayerView);
                        lessonFragment.m10107o0().f44689A.m10491a(new LessonFragment.C4165d());
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                        C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$onPlayAudio$1$1(lessonViewModelM10109q0, ((Number) lessonViewModelM10109q0.f27470e0.getValue()).intValue(), null), 3);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
                        lessonViewModelM10109q1.mo10025A1();
                        C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q1), null, null, new LessonViewModel$showReview$1(lessonViewModelM10109q1, null), 3);
                        break;
                }
            }
        });
        LessonPlayerView lessonPlayerView = c8274e0M10107o0.f44712w;
        lessonPlayerView.getBinding().f44868c.setOnClickListener(new View.OnClickListener(this) { // from class: hj.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFragment f35762b;

            {
                this.f35762b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                LessonFragment lessonFragment = this.f35762b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, true));
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, false));
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        lessonFragment.m10109q0().mo9724L();
                        PopupWindow popupWindow = lessonFragment.f27058E0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            C5207g.m11117l("popupSettings");
                            throw null;
                        }
                }
            }
        });
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: hj.e

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFragment f35764b;

            {
                this.f35764b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                LessonFragment lessonFragment = this.f35764b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        C8573r0.m16725g0(lessonFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        InterfaceC4865b.a.m10388a(lessonFragment.m10109q0(), false, 3);
                        lessonFragment.m10112t0();
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                        C5207g.m11111f(lessonFragment, "this$0");
                        lessonFragment.m10109q0().mo9724L();
                        lessonFragment.m10109q0().mo10025A1();
                        PopupWindow popupWindow = lessonFragment.f27058E0;
                        if (popupWindow != null) {
                            popupWindow.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            C5207g.m11117l("popupSettings");
                            throw null;
                        }
                }
            }
        };
        ImageView imageView2 = c8274e0M10107o0.f44710u;
        imageView2.setOnClickListener(onClickListener2);
        boolean z10 = ((C6061g) c1681f.getValue()).f35770d;
        final int i12 = 2;
        LinearLayout linearLayout2 = c8274e0M10107o0.f44713x;
        if (z10) {
            ((ImageView) c8324m2.f45028b).setImageResource(R.drawable.ic_sentence_mode_close);
            c8274e0M10107o0.f44706q.setImageResource(R.drawable.ic_sentence_review);
            TextView textView = c8274e0M10107o0.f44707r;
            C5207g.m11110e(textView, "tbReviewDesc");
            C4924a.m10442U(textView);
            linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: hj.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonFragment f35766b;

                {
                    this.f35766b = this;
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i10;
                    LessonFragment lessonFragment = this.f35766b;
                    switch (i13) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                            C5207g.m11111f(lessonFragment, "this$0");
                            C8573r0.m16725g0(lessonFragment).m3995p();
                            break;
                        default:
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                            C5207g.m11111f(lessonFragment, "this$0");
                            lessonFragment.m10108p0().pause();
                            lessonFragment.m10109q0().m10138E2(ReviewType.Integrated);
                            break;
                    }
                }
            });
        } else {
            linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.ui.lesson.b

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonFragment f27843b;

                {
                    this.f27843b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i12;
                    LessonFragment lessonFragment = this.f27843b;
                    switch (i13) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                            C5207g.m11111f(lessonFragment, "this$0");
                            RelativeLayout relativeLayout = lessonFragment.m10107o0().f44715z;
                            C5207g.m11110e(relativeLayout, "binding.viewYoutubePlayer");
                            C4924a.m10442U(relativeLayout);
                            YouTubePlayerView youTubePlayerView = lessonFragment.m10107o0().f44689A;
                            C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                            C4924a.m10442U(youTubePlayerView);
                            lessonFragment.m10107o0().f44689A.m10491a(new LessonFragment.C4165d());
                            break;
                        case 1:
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                            C5207g.m11111f(lessonFragment, "this$0");
                            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$onPlayAudio$1$1(lessonViewModelM10109q0, ((Number) lessonViewModelM10109q0.f27470e0.getValue()).intValue(), null), 3);
                            break;
                        default:
                            InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                            C5207g.m11111f(lessonFragment, "this$0");
                            LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
                            lessonViewModelM10109q1.mo10025A1();
                            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q1), null, null, new LessonViewModel$showReview$1(lessonViewModelM10109q1, null), 3);
                            break;
                    }
                }
            });
        }
        LayoutInflater layoutInflaterMo468M = this.f6104h0;
        if (layoutInflaterMo468M == null) {
            layoutInflaterMo468M = mo468M(null);
            this.f6104h0 = layoutInflaterMo468M;
        }
        View viewInflate = layoutInflaterMo468M.inflate(R.layout.menu_lesson, (ViewGroup) null, false);
        int i13 = R.id.btnGrammarGuide;
        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnGrammarGuide);
        if (linearLayout3 != null) {
            i13 = R.id.btnHelp;
            LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnHelp);
            if (linearLayout4 != null) {
                i13 = R.id.btnLessonEdit;
                LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnLessonEdit);
                if (linearLayout5 != null) {
                    i13 = R.id.btnLessonInfo;
                    LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnLessonInfo);
                    if (linearLayout6 != null) {
                        i13 = R.id.btnNextLesson;
                        ImageView imageView3 = (ImageView) C0062b.m298P0(viewInflate, R.id.btnNextLesson);
                        if (imageView3 != null) {
                            i13 = R.id.btnPreviousLesson;
                            ImageView imageView4 = (ImageView) C0062b.m298P0(viewInflate, R.id.btnPreviousLesson);
                            if (imageView4 != null) {
                                i13 = R.id.btnRefresh;
                                LinearLayout linearLayout7 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnRefresh);
                                if (linearLayout7 != null) {
                                    i13 = R.id.btnSettings;
                                    LinearLayout linearLayout8 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnSettings);
                                    if (linearLayout8 != null) {
                                        i13 = R.id.btnStatistics;
                                        LinearLayout linearLayout9 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnStatistics);
                                        if (linearLayout9 != null) {
                                            i13 = R.id.divider;
                                            if (C0062b.m298P0(viewInflate, R.id.divider) != null) {
                                                i13 = R.id.tvLessonTitle;
                                                TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvLessonTitle);
                                                if (textView2 != null) {
                                                    i13 = R.id.viewHeader;
                                                    if (((RelativeLayout) C0062b.m298P0(viewInflate, R.id.viewHeader)) != null) {
                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                        this.f27059F0 = new C8278e4(frameLayout, linearLayout3, linearLayout4, linearLayout5, linearLayout6, imageView3, imageView4, linearLayout7, linearLayout8, linearLayout9, textView2, frameLayout);
                                                        C8278e4 c8278e4 = this.f27059F0;
                                                        if (c8278e4 == null) {
                                                            C5207g.m11117l("viewLessonMenuBinding");
                                                            throw null;
                                                        }
                                                        this.f27058E0 = new PopupWindow((View) c8278e4.f44736a, C4924a.m10460g(m3576Y()) ? -2 : -1, -1, true);
                                                        C8278e4 c8278e5 = this.f27059F0;
                                                        if (c8278e5 == null) {
                                                            C5207g.m11117l("viewLessonMenuBinding");
                                                            throw null;
                                                        }
                                                        c8278e5.f44747l.setOnClickListener(new View.OnClickListener(this) { // from class: hj.d

                                                            /* JADX INFO: renamed from: b */
                                                            public final /* synthetic */ LessonFragment f35762b;

                                                            {
                                                                this.f35762b = this;
                                                            }

                                                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i12;
                                                                LessonFragment lessonFragment = this.f35762b;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                                                                        C5207g.m11111f(lessonFragment, "this$0");
                                                                        C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, true));
                                                                        return;
                                                                    case 1:
                                                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                                                                        C5207g.m11111f(lessonFragment, "this$0");
                                                                        C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, false));
                                                                        return;
                                                                    default:
                                                                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                                                                        C5207g.m11111f(lessonFragment, "this$0");
                                                                        lessonFragment.m10109q0().mo9724L();
                                                                        PopupWindow popupWindow = lessonFragment.f27058E0;
                                                                        if (popupWindow != null) {
                                                                            popupWindow.dismiss();
                                                                            return;
                                                                        } else {
                                                                            C5207g.m11117l("popupSettings");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        c8274e0M10107o0.f44692c.setOnClickListener(new View.OnClickListener(this) { // from class: hj.e

                                                            /* JADX INFO: renamed from: b */
                                                            public final /* synthetic */ LessonFragment f35764b;

                                                            {
                                                                this.f35764b = this;
                                                            }

                                                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i12;
                                                                LessonFragment lessonFragment = this.f35764b;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                                                                        C5207g.m11111f(lessonFragment, "this$0");
                                                                        C8573r0.m16725g0(lessonFragment).m3995p();
                                                                        return;
                                                                    case 1:
                                                                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                                                                        C5207g.m11111f(lessonFragment, "this$0");
                                                                        InterfaceC4865b.a.m10388a(lessonFragment.m10109q0(), false, 3);
                                                                        lessonFragment.m10112t0();
                                                                        return;
                                                                    default:
                                                                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                                                                        C5207g.m11111f(lessonFragment, "this$0");
                                                                        lessonFragment.m10109q0().mo9724L();
                                                                        lessonFragment.m10109q0().mo10025A1();
                                                                        PopupWindow popupWindow = lessonFragment.f27058E0;
                                                                        if (popupWindow != null) {
                                                                            popupWindow.showAsDropDown(view2, 0, 0, 0);
                                                                            return;
                                                                        } else {
                                                                            C5207g.m11117l("popupSettings");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        C7796d c7796d = this.f27062I0;
                                                        if (c7796d == null) {
                                                            C5207g.m11117l("analytics");
                                                            throw null;
                                                        }
                                                        lessonPlayerView.setupViews(c7796d);
                                                        lessonPlayerView.setPlayerControlsListener(new C4163b());
                                                        c8274e0M10107o0.f44702m.setOnTouchListener(new ViewOnTouchListenerC6057c(this, i11, c8274e0M10107o0));
                                                        TextView textView3 = c8274e0M10107o0.f44704o;
                                                        C5207g.m11110e(textView3, "tbPlayDownloadProgress");
                                                        C4924a.m10442U(textView3);
                                                        this.f27054A0 = new C4270d(EmptyList.f38032a, this);
                                                        ViewPager2 viewPager3 = m10107o0().f44701l;
                                                        C4270d c4270d = this.f27054A0;
                                                        if (c4270d == null) {
                                                            C5207g.m11117l("lessonPagerAdapter");
                                                            throw null;
                                                        }
                                                        viewPager3.setAdapter(c4270d);
                                                        C4164c c4164c = new C4164c();
                                                        LessonProgressBar lessonProgressBar = c8274e0M10107o0.f44700k;
                                                        lessonProgressBar.setOnPageChangedListener(c4164c);
                                                        ViewPager2 viewPager4 = c8274e0M10107o0.f44701l;
                                                        viewPager4.setOffscreenPageLimit(-1);
                                                        if (C5408a.m11572e(m10109q0().mo498E1())) {
                                                            lessonProgressBar.f27361c0 = true;
                                                            lessonProgressBar.m10127m();
                                                        } else {
                                                            i10 = 0;
                                                        }
                                                        viewPager4.setLayoutDirection(i10);
                                                        C4270d c4270d2 = this.f27054A0;
                                                        if (c4270d2 == null) {
                                                            C5207g.m11117l("lessonPagerAdapter");
                                                            throw null;
                                                        }
                                                        c4270d2.f7042c = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                                                        c4270d2.f7040a.m4264g();
                                                        C4270d c4270d3 = this.f27054A0;
                                                        if (c4270d3 == null) {
                                                            C5207g.m11117l("lessonPagerAdapter");
                                                            throw null;
                                                        }
                                                        viewPager4.setAdapter(c4270d3);
                                                        if (((C6061g) c1681f.getValue()).f35770d) {
                                                            imageView.setImageResource(R.drawable.ic_sentence_mode_close);
                                                            MaterialCardView materialCardView = c8274e0M10107o0.f44695f;
                                                            C5772k shapeAppearanceModel = materialCardView.getShapeAppearanceModel();
                                                            shapeAppearanceModel.getClass();
                                                            C5772k.a aVar = new C5772k.a(shapeAppearanceModel);
                                                            aVar.m12157d(0.0f);
                                                            aVar.m12158e(0.0f);
                                                            aVar.m12159f(m3578a0().getResources().getDimension(R.dimen.btn_corner_radius_high));
                                                            aVar.m12160g(m3578a0().getResources().getDimension(R.dimen.btn_corner_radius_high));
                                                            materialCardView.setShapeAppearanceModel(new C5772k(aVar));
                                                            List<Integer> list = C6716m.f37937a;
                                                            materialCardView.setCardElevation(C6716m.m13316a(12));
                                                            RelativeLayout relativeLayout = c8274e0M10107o0.f44711v;
                                                            C5207g.m11110e(relativeLayout, "viewPlay");
                                                            C4924a.m10422A(relativeLayout);
                                                            C4924a.m10422A(imageView2);
                                                            TextView textView4 = c8274e0M10107o0.f44709t;
                                                            C5207g.m11110e(textView4, "tbSentenceModeDesc");
                                                            C4924a.m10422A(textView4);
                                                            m10107o0().f44693d.setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.ui.lesson.b

                                                                /* JADX INFO: renamed from: b */
                                                                public final /* synthetic */ LessonFragment f27843b;

                                                                {
                                                                    this.f27843b = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    int i14 = i11;
                                                                    LessonFragment lessonFragment = this.f27843b;
                                                                    switch (i14) {
                                                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                                                                            C5207g.m11111f(lessonFragment, "this$0");
                                                                            RelativeLayout relativeLayout2 = lessonFragment.m10107o0().f44715z;
                                                                            C5207g.m11110e(relativeLayout2, "binding.viewYoutubePlayer");
                                                                            C4924a.m10442U(relativeLayout2);
                                                                            YouTubePlayerView youTubePlayerView = lessonFragment.m10107o0().f44689A;
                                                                            C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                                                                            C4924a.m10442U(youTubePlayerView);
                                                                            lessonFragment.m10107o0().f44689A.m10491a(new LessonFragment.C4165d());
                                                                            break;
                                                                        case 1:
                                                                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                                                                            C5207g.m11111f(lessonFragment, "this$0");
                                                                            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                                                                            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$onPlayAudio$1$1(lessonViewModelM10109q0, ((Number) lessonViewModelM10109q0.f27470e0.getValue()).intValue(), null), 3);
                                                                            break;
                                                                        default:
                                                                            InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                                                                            C5207g.m11111f(lessonFragment, "this$0");
                                                                            LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
                                                                            lessonViewModelM10109q1.mo10025A1();
                                                                            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q1), null, null, new LessonViewModel$showReview$1(lessonViewModelM10109q1, null), 3);
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            m10107o0().f44694e.setOnClickListener(new View.OnClickListener(this) { // from class: hj.d

                                                                /* JADX INFO: renamed from: b */
                                                                public final /* synthetic */ LessonFragment f35762b;

                                                                {
                                                                    this.f35762b = this;
                                                                }

                                                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    int i14 = i11;
                                                                    LessonFragment lessonFragment = this.f35762b;
                                                                    switch (i14) {
                                                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                                                                            C5207g.m11111f(lessonFragment, "this$0");
                                                                            C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, true));
                                                                            return;
                                                                        case 1:
                                                                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                                                                            C5207g.m11111f(lessonFragment, "this$0");
                                                                            C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, false));
                                                                            return;
                                                                        default:
                                                                            InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                                                                            C5207g.m11111f(lessonFragment, "this$0");
                                                                            lessonFragment.m10109q0().mo9724L();
                                                                            PopupWindow popupWindow = lessonFragment.f27058E0;
                                                                            if (popupWindow != null) {
                                                                                popupWindow.dismiss();
                                                                                return;
                                                                            } else {
                                                                                C5207g.m11117l("popupSettings");
                                                                                throw null;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4169xe8180f0b(this, Lifecycle.State.STARTED, null, this), 3);
                                                        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4168xee138dae(this, Lifecycle.State.RESUMED, null, this), 3);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: o0 */
    public final C8274e0 m10107o0() {
        return (C8274e0) this.f27055B0.m10489a(this, f27053M0[0]);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p0 */
    public final PlayerController m10108p0() {
        PlayerController playerController = this.f27065L0;
        if (playerController != null) {
            return playerController;
        }
        C5207g.m11117l("playerController");
        throw null;
    }

    /* JADX INFO: renamed from: q0 */
    public final LessonViewModel m10109q0() {
        return (LessonViewModel) this.f27056C0.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10110r0(boolean z10) {
        C8274e0 c8274e0M10107o0 = m10107o0();
        Animation animation = ((LinearLayout) c8274e0M10107o0.f44699j.f45031e).getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        ((LinearLayout) c8274e0M10107o0.f44699j.f45031e).animate().setDuration(100).alpha(z10 ? 1.0f : 0.0f).setListener(new C4162a(c8274e0M10107o0, z10));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m10111s0(TokenData tokenData) {
        Bundle bundle = new Bundle();
        String str = tokenData.f31175a;
        TokenType tokenType = tokenData.f31176b;
        int i10 = tokenData.f31177c;
        int i11 = tokenData.f31178d;
        TokenFragmentData tokenFragmentData = tokenData.f31179e;
        bundle.putParcelable("tokenData", new TokenData(str, tokenType, i10, i11, new TokenFragmentData(tokenFragmentData.f27865a, tokenFragmentData.f27866b), tokenData.f31180f, C7777d.m15481b(this) ? TokenControllerType.LessonExpanded : TokenControllerType.Lesson, null, tokenData.f31183i, tokenData.f31184j, BuildConfig.SDK_TRUNCATE_LENGTH));
        bundle.putInt("lessonId", m10109q0().m10152y2());
        boolean z10 = true;
        if (!m3599s().getBoolean(R.bool.is_phone) && (m3599s().getBoolean(R.bool.is_phone) || m3599s().getConfiguration().orientation != 1)) {
            z10 = false;
        }
        C7777d.m15485f(m3594l(), C7777d.m15481b(this) ? R.id.fragment_container_token : R.id.fragment_top, bundle, z10, C7777d.m15481b(this));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10112t0() {
        AbstractC9409f0 abstractC9409f0M17816c = new C9415i0(m3578a0()).m17816c(R.transition.fade);
        abstractC9409f0M17816c.mo17783J(200L);
        abstractC9409f0M17816c.mo17785L(new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        m3587g0(abstractC9409f0M17816c);
        C4924a.m10447Z(C8573r0.m16725g0(this), new C6681h(m10109q0().m10152y2(), -1, "", true, "", ((C6061g) this.f27057D0.getValue()).f35772f));
    }
}
