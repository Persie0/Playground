package com.lingq.p055ui.lesson.edit;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
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
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p204jj.AbstractC6483d;
import p260m8.C7499b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8316l0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/SentenceEditPagerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceEditPagerFragment extends AbstractC6483d {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f28085E0 = {C0204c.m857q(SentenceEditPagerFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonEditSentencePagerBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f28086A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f28087B0;

    /* JADX INFO: renamed from: C0 */
    public C4307b f28088C0;

    /* JADX INFO: renamed from: D0 */
    public final C4302a f28089D0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$a */
    public static final class C4302a extends ViewPager2.AbstractC1229e {
        public C4302a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: a */
        public final void mo4680a(int i10) {
            if (i10 != 0) {
                return;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr = SentenceEditPagerFragment.f28085E0;
            SentenceEditPagerFragment.this.m10181n0().f44992b.m10126l();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: b */
        public final void mo4686b(float f3, int i10, int i11) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = SentenceEditPagerFragment.f28085E0;
            SentenceEditPagerFragment.this.m10181n0().f44992b.m10125k(i10, f3);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
        /* JADX INFO: renamed from: c */
        public final void mo4681c(int i10) {
            InterfaceC6727j<Object>[] interfaceC6727jArr = SentenceEditPagerFragment.f28085E0;
            SentenceEditPagerFragment.this.m10181n0().f44992b.setCurrentPage(i10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.lesson.edit.SentenceEditPagerFragment$special$$inlined$viewModels$default$1] */
    public SentenceEditPagerFragment() {
        super(R.layout.fragment_lesson_edit_sentence_pager);
        this.f28086A0 = C4924a.m10477o0(this, SentenceEditPagerFragment$binding$2.f28091j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f28087B0 = C8573r0.m16711Z(this, C5209i.m11118a(SentenceEditPagerViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$special$$inlined$viewModels$default$5
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
        this.f28089D0 = new C4302a();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        m10182o0().f28112f.mo9336K();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, true);
        c8228iM29r.f48293c = 400L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(0, false);
        c8228i.f48293c = 400L;
        m3591j0(c8228i);
        C8316l0 c8316l0M10181n0 = m10181n0();
        c8316l0M10181n0.f44994d.setOnClickListener(new ViewOnClickListenerC2238x(16, this));
        c8316l0M10181n0.f44991a.setOnClickListener(new ViewOnClickListenerC2239y(25, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4303xf474e0c9(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8316l0 m10181n0() {
        return (C8316l0) this.f28086A0.m10489a(this, f28085E0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final SentenceEditPagerViewModel m10182o0() {
        return (SentenceEditPagerViewModel) this.f28087B0.getValue();
    }
}
