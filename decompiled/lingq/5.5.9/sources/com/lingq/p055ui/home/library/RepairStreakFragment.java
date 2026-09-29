package com.lingq.p055ui.home.library;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p512yi.AbstractC10386n;
import ph.C8293h1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/library/RepairStreakFragment;", "Landroidx/fragment/app/l;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RepairStreakFragment extends AbstractC10386n {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f24937S0 = {C0204c.m857q(RepairStreakFragment.class, "getBinding()Lcom/lingq/databinding/FragmentRepairStreakBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f24938Q0 = C4924a.m10477o0(this, RepairStreakFragment$binding$2.f24940j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f24939R0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.home.library.RepairStreakFragment$special$$inlined$viewModels$default$1] */
    public RepairStreakFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.home.library.RepairStreakFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.library.RepairStreakFragment$special$$inlined$viewModels$default$2
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
        this.f24939R0 = C8573r0.m16711Z(this, C5209i.m11118a(RepairStreakViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.library.RepairStreakFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.library.RepairStreakFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.library.RepairStreakFragment$special$$inlined$viewModels$default$5
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
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        Window window;
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        C8293h1 c8293h1M9951u0 = m9951u0();
        TextView textView = c8293h1M9951u0.f44842d;
        List<Integer> list = C6716m.f37937a;
        Locale locale = Locale.getDefault();
        String strM3600t = m3600t(R.string.streak_for_just_n_coins);
        C5207g.m11110e(strM3600t, "getString(R.string.streak_for_just_n_coins)");
        textView.setText(C6716m.m13322g(C0141b.m613i(new Object[]{5000}, 1, locale, strM3600t, "format(locale, format, *args)"), "5000"));
        String strM3600t2 = m3600t(R.string.lesson_coins);
        C5207g.m11110e(strM3600t2, "getString(R.string.lesson_coins)");
        c8293h1M9951u0.f44846h.setTitle(strM3600t2);
        c8293h1M9951u0.f44840b.setOnClickListener(new ViewOnClickListenerC3807a(3, this));
        c8293h1M9951u0.f44839a.setOnClickListener(new ViewOnClickListenerC2239y(16, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3798xf8ec0b7e(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: u0 */
    public final C8293h1 m9951u0() {
        return (C8293h1) this.f24938Q0.m10489a(this, f24937S0[0]);
    }

    /* JADX INFO: renamed from: v0 */
    public final RepairStreakViewModel m9952v0() {
        return (RepairStreakViewModel) this.f24939R0.getValue();
    }
}
