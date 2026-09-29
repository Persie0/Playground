package com.lingq.feature.challenges;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import java.util.Arrays;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.jfa;
import p000.ld3;
import p000.or1;
import p000.qt3;
import p000.sq5;
import p000.tr0;
import p000.ui3;
import p000.uq0;
import p000.vr0;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeShareFragment extends qt3 {

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ bh4[] f24412V0 = {new PropertyReference1Impl(ChallengeShareFragment.class, "binding", "getBinding()Lcom/lingq/feature/challenges/databinding/FragmentChallengeShareBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f24413S0;

    /* JADX INFO: renamed from: T0 */
    public final w41 f24414T0;

    /* JADX INFO: renamed from: U0 */
    public final sq5 f24415U0;

    public ChallengeShareFragment() {
        super(1);
        this.f24413S0 = jfa.m14432o(this, ChallengeShareFragment$binding$2.f24416i);
        final ChallengeShareFragment$special$$inlined$viewModels$default$1 challengeShareFragment$special$$inlined$viewModels$default$1 = new ChallengeShareFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) challengeShareFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f24414T0 = new w41(y38.m24933a(C1973c.class), new ui3() { // from class: com.lingq.feature.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f24431b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.challenges.ChallengeShareFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
        this.f24415U0 = new sq5(3, y38.m24933a(vr0.class), new uq0(this, 1));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_challenge_share, viewGroup, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        if (vz1.m23653w(this)) {
            Dialog dialog = this.f8417H0;
            View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R$id.design_bottom_sheet) : null;
            if (viewFindViewById != null) {
                BottomSheetBehavior.m6021C(viewFindViewById).m6032M(3);
            }
        }
        ld3 ld3Var = (ld3) this.f24413S0.getValue(this, f24412V0[0]);
        TextView textView = ld3Var.f49497c;
        String strM2111m = m2111m(R$string.challenges_share);
        strM2111m.getClass();
        textView.setText(String.format(strM2111m, Arrays.copyOf(new Object[]{((vr0) this.f24415U0.getValue()).f65822b}, 1)));
        ld3Var.f49495a.setOnClickListener(new tr0(0, this, ld3Var));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1954x5ac4160f(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }
}
