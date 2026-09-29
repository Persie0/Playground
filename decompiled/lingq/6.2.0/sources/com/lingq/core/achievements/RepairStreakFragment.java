package com.lingq.core.achievements;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.abd;
import p000.af3;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.h31;
import p000.jfa;
import p000.lda;
import p000.or1;
import p000.ui3;
import p000.ut3;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zoc;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class RepairStreakFragment extends ut3 {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ bh4[] f14177T0 = {new PropertyReference1Impl(RepairStreakFragment.class, "binding", "getBinding()Lcom/lingq/core/achievements/databinding/FragmentRepairStreakBinding;")};

    /* JADX INFO: renamed from: R0 */
    public final C3309ls f14178R0;

    /* JADX INFO: renamed from: S0 */
    public final w41 f14179S0;

    public RepairStreakFragment() {
        super(R$layout.fragment_repair_streak);
        this.f14178R0 = jfa.m14432o(this, RepairStreakFragment$binding$2.f14180i);
        final RepairStreakFragment$special$$inlined$viewModels$default$1 repairStreakFragment$special$$inlined$viewModels$default$1 = new RepairStreakFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.core.achievements.RepairStreakFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) repairStreakFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f14179S0 = new w41(y38.m24933a(C1236c.class), new ui3() { // from class: com.lingq.core.achievements.RepairStreakFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.core.achievements.RepairStreakFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f14214b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.core.achievements.RepairStreakFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        Window window;
        view.getClass();
        Dialog dialog = this.f8417H0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Bundle bundle = this.f5695f;
        String strM25735a = zoc.m25735a(bundle != null ? bundle.getString("brokenStreakDate") : null);
        af3 af3VarM6996m0 = m6996m0();
        TextView textView = af3VarM6996m0.f577d;
        Locale locale = Locale.getDefault();
        String strM2111m = m2111m(R$string.streak_for_just_n_coins);
        strM2111m.getClass();
        textView.setText(abd.m245a(String.format(locale, strM2111m, Arrays.copyOf(new Object[]{5000}, 1)), "5000"));
        af3VarM6996m0.f575b.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.core.achievements.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
                C1236c c1236cM6997n0 = this.f14225a.m6997n0();
                wfb.m23926u(lda.m16103C(c1236cM6997n0), c1236cM6997n0.f14229e, null, new RepairStreakViewModel$repairStreak$1(c1236cM6997n0, null), 2);
            }
        });
        af3VarM6996m0.f574a.setOnClickListener(new h31(this, 9));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1227xf8ec0b7e(this, Lifecycle$State.STARTED, null, this, strM25735a), 3);
    }

    /* JADX INFO: renamed from: m0 */
    public final af3 m6996m0() {
        return (af3) this.f14178R0.getValue(this, f14177T0[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public final C1236c m6997n0() {
        return (C1236c) this.f14179S0.getValue();
    }
}
