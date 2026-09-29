package com.lingq.p055ui.upgrade;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ni.C7796d;
import p003a2.C0009a;
import p199jd.ViewOnClickListenerC6464i;
import p205jk.AbstractC6508d;
import p322pd.C8227h;
import p322pd.C8228i;
import p338qd.C8573r0;
import p408u6.ViewOnClickListenerC9466e;
import p427v3.AbstractC9634a;
import ph.C8258b2;
import si.ViewOnClickListenerC9029m;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/upgrade/UpgradeGoPremiumFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UpgradeGoPremiumFragment extends AbstractC6508d {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f32014D0 = {C0204c.m857q(UpgradeGoPremiumFragment.class, "getBinding()Lcom/lingq/databinding/FragmentUpgradeGoPremiumBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final C1038i0 f32015A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f32016B0;

    /* JADX INFO: renamed from: C0 */
    public C7796d f32017C0;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.UpgradeGoPremiumFragment$a */
    public /* synthetic */ class C4923a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32018a;

        static {
            int[] iArr = new int[UpgradeReason.values().length];
            try {
                iArr[UpgradeReason.LIMIT_IMPORTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpgradeReason.LIMIT_IMPORTS_WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpgradeReason.SENTENCES_TRANSLATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpgradeReason.LIMIT_WORDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UpgradeReason.CHALLENGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UpgradeReason.PLAYLISTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UpgradeReason.GENERATE_TTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f32018a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.lingq.ui.upgrade.UpgradeGoPremiumFragment$special$$inlined$viewModels$default$1] */
    public UpgradeGoPremiumFragment() {
        super(R.layout.fragment_upgrade_go_premium);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.upgrade.UpgradeGoPremiumFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.upgrade.UpgradeGoPremiumFragment$special$$inlined$viewModels$default$2
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
        this.f32015A0 = C8573r0.m16711Z(this, C5209i.m11118a(UpgradeGoPremiumViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.upgrade.UpgradeGoPremiumFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.upgrade.UpgradeGoPremiumFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.upgrade.UpgradeGoPremiumFragment$special$$inlined$viewModels$default$5
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
        this.f32016B0 = C4924a.m10477o0(this, UpgradeGoPremiumFragment$binding$2.f32019j);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 1, true);
        c8228iM29r.f48293c = 300L;
        m3585f0(c8228iM29r);
        C8228i c8228i = new C8228i(1, false);
        c8228i.f48293c = 300L;
        m3589h0(c8228i);
        C8227h c8227h = new C8227h();
        c8227h.f48293c = 180L;
        m3587g0(c8227h);
        C7796d c7796d = this.f32017C0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "show_upgrade_popup");
        Object obj = m3577Z().get("reason");
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.ui.upgrade.UpgradeReason");
        UpgradeReason upgradeReason = (UpgradeReason) obj;
        C8258b2 c8258b2 = (C8258b2) this.f32016B0.m10489a(this, f32014D0[0]);
        switch (C4923a.f32018a[upgradeReason.ordinal()]) {
            case 1:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_limited_imports));
                Bundle bundle2 = new Bundle();
                bundle2.putString("Client", "android");
                C7796d c7796d2 = this.f32017C0;
                if (c7796d2 == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d2.m15505b(bundle2, "hit_import_limit");
                break;
                break;
            case 2:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_limited_imports));
                Bundle bundle3 = new Bundle();
                bundle3.putString("Client", "android");
                C7796d c7796d3 = this.f32017C0;
                if (c7796d3 == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d3.m15505b(bundle3, "hit_import_limit");
                break;
                break;
            case 3:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_limited_translations));
                break;
            case 4:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_limited_lingqs));
                break;
            case 5:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_to_complete_challenges));
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_multiple_playlists));
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                c8258b2.f44614c.setText(m3600t(R.string.upgrade_generate_tts));
                break;
        }
        int i10 = 25;
        c8258b2.f44615d.setOnClickListener(new ViewOnClickListenerC6464i(this, i10, upgradeReason));
        c8258b2.f44612a.setOnClickListener(new ViewOnClickListenerC9466e(this, i10, upgradeReason));
        c8258b2.f44613b.setOnClickListener(new ViewOnClickListenerC9029m(this, 24, upgradeReason));
    }
}
