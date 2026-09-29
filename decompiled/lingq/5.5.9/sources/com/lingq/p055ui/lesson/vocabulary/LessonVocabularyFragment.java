package com.lingq.p055ui.lesson.vocabulary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.C3083d;
import com.google.android.material.tabs.C3083d.a;
import com.google.android.material.tabs.TabLayout;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p118fe.C5509a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p369rj.AbstractC8816a;
import p369rj.C8818c;
import p402u0.C9369l;
import p406u4.AbstractC9409f0;
import p406u4.C9415i0;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p522z2.C10437a;
import ph.C8345q0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/vocabulary/LessonVocabularyFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonVocabularyFragment extends AbstractC8816a {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29206D0 = {C0204c.m857q(LessonVocabularyFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonVocabularyBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29207A0;

    /* JADX INFO: renamed from: B0 */
    public final C1681f f29208B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29209C0;

    public LessonVocabularyFragment() {
        super(R.layout.fragment_lesson_vocabulary);
        this.f29207A0 = C4924a.m10477o0(this, LessonVocabularyFragment$binding$2.f29210j);
        this.f29208B0 = new C1681f(C5209i.m11118a(C8818c.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29234b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29209C0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonVocabularyViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(18, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        if (!C7777d.m15481b(this)) {
            C9415i0 c9415i0 = new C9415i0(m3578a0());
            AbstractC9409f0 abstractC9409f0M17816c = c9415i0.m17816c(R.transition.slide_up);
            abstractC9409f0M17816c.mo17785L(C10437a.m19409b(0.05f, 0.7f, 0.1f, 1.0f));
            abstractC9409f0M17816c.mo17783J(600L);
            m3585f0(abstractC9409f0M17816c);
            AbstractC9409f0 abstractC9409f0M17816c2 = c9415i0.m17816c(R.transition.slide_down);
            abstractC9409f0M17816c2.mo17785L(C10437a.m19409b(0.3f, 0.0f, 0.8f, 0.15f));
            abstractC9409f0M17816c2.mo17783J(400L);
            m3591j0(abstractC9409f0M17816c2);
        }
        C1681f c1681f = this.f29208B0;
        C4496b c4496b = new C4496b(((C8818c) c1681f.getValue()).f46713a, this);
        C8345q0 c8345q0M10230n0 = m10230n0();
        if (((C8818c) c1681f.getValue()).f46714b) {
            MaterialToolbar materialToolbar = c8345q0M10230n0.f45164c;
            C5207g.m11110e(materialToolbar, "toolbar");
            C4924a.m10442U(materialToolbar);
            MaterialCardView materialCardView = c8345q0M10230n0.f45162a;
            C5207g.m11110e(materialCardView, "cardView");
            C4924a.m10457e0(materialCardView);
        } else {
            c8345q0M10230n0.f45164c.setTitle(m3600t(R.string.lesson_lesson_vocabulary));
            Context contextM3578a0 = m3578a0();
            Object obj = C7472a.f41322a;
            Drawable drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_close_s);
            MaterialToolbar materialToolbar2 = c8345q0M10230n0.f45164c;
            materialToolbar2.setNavigationIcon(drawableM14849b);
            List<Integer> list = C6716m.f37937a;
            materialToolbar2.setNavigationIconTint(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
            materialToolbar2.setNavigationOnClickListener(new ViewOnClickListenerC2238x(22, this));
        }
        c8345q0M10230n0.f45165d.setAdapter(c4496b);
        ViewPager2 viewPager2 = c8345q0M10230n0.f45165d;
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(1);
        TabLayout tabLayout = c8345q0M10230n0.f45163b;
        tabLayout.setTabMode(1);
        C3083d c3083d = new C3083d(tabLayout, viewPager2, new C9369l(22, this));
        if (c3083d.f15699e) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
        c3083d.f15698d = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        c3083d.f15699e = true;
        viewPager2.f7742c.f7767a.add(new C3083d.c(tabLayout));
        tabLayout.m8852a(new C3083d.d(viewPager2, true));
        c3083d.f15698d.m4234o(c3083d.new a());
        c3083d.m8881a();
        tabLayout.m8865o(viewPager2.getCurrentItem(), 0.0f, true, true, true);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4466x3383ae91(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8345q0 m10230n0() {
        return (C8345q0) this.f29207A0.m10489a(this, f29206D0[0]);
    }
}
