package com.lingq.p055ui.home.language.stats;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.activity.result.InterfaceC0202a;
import androidx.fragment.app.C0964m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dk.C5196a;
import dk.C5197b;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p035c.C1643c;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p487xi.AbstractC10195c;
import p487xi.ViewOnClickListenerC10200h;
import ph.C8366u1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/language/stats/StatsShareFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StatsShareFragment extends AbstractC10195c {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f24390T0 = {C0204c.m857q(StatsShareFragment.class, "getBinding()Lcom/lingq/databinding/FragmentStatsShareBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f24391Q0 = C4924a.m10477o0(this, StatsShareFragment$binding$2.f24396j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f24392R0;

    /* JADX INFO: renamed from: S0 */
    public C0964m f24393S0;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$a */
    public static final class C3728a implements InterfaceC0202a<Boolean> {
        public C3728a() {
        }

        @Override // androidx.activity.result.InterfaceC0202a
        /* JADX INFO: renamed from: a */
        public final void mo843a(Boolean bool) {
            if (bool.booleanValue()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
                StatsShareFragment.this.m9922v0().m9924m2();
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$b */
    public static final class C3729b implements InterfaceC7774a<C5196a> {

        /* JADX INFO: renamed from: a */
        public static final C3729b f24395a = new C3729b();

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(C5196a c5196a) {
            C5207g.m11111f(c5196a, "it");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.language.stats.StatsShareFragment$special$$inlined$viewModels$default$1] */
    public StatsShareFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.language.stats.StatsShareFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.language.stats.StatsShareFragment$special$$inlined$viewModels$default$2
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
        this.f24392R0 = C8573r0.m16711Z(this, C5209i.m11118a(StatsShareViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.language.stats.StatsShareFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.language.stats.StatsShareFragment$special$$inlined$viewModels$default$4
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
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.language.stats.StatsShareFragment$special$$inlined$viewModels$default$5
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

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_stats_share, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        this.f24393S0 = m3575X(new C3728a(), new C1643c());
        C5197b c5197b = new C5197b(C3729b.f24395a);
        C8366u1 c8366u1M9921u0 = m9921u0();
        RecyclerView recyclerView = c8366u1M9921u0.f45310d;
        m3578a0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        c8366u1M9921u0.f45310d.setAdapter(c5197b);
        c8366u1M9921u0.f45307a.setOnClickListener(new ViewOnClickListenerC10200h(1, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3730xaefdbe53(this, Lifecycle.State.STARTED, null, this, c5197b), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: u0 */
    public final C8366u1 m9921u0() {
        return (C8366u1) this.f24391Q0.m10489a(this, f24390T0[0]);
    }

    /* JADX INFO: renamed from: v0 */
    public final StatsShareViewModel m9922v0() {
        return (StatsShareViewModel) this.f24392R0.getValue();
    }
}
