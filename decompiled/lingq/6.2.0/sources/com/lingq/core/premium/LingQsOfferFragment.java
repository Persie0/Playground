package com.lingq.core.premium;

import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.core.premium.LingQsOfferFragment;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.ce5;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.hg3;
import p000.jfa;
import p000.nsa;
import p000.or1;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class LingQsOfferFragment extends rt3 {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ bh4[] f22346E0 = {new PropertyReference1Impl(LingQsOfferFragment.class, "binding", "getBinding()Lcom/lingq/core/premium/databinding/FragmentUpgradeLingqsOfferBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final w41 f22347C0;

    /* JADX INFO: renamed from: D0 */
    public final C3309ls f22348D0;

    public LingQsOfferFragment() {
        super(R$layout.fragment_upgrade_lingqs_offer, 8);
        final LingQsOfferFragment$special$$inlined$viewModels$default$1 lingQsOfferFragment$special$$inlined$viewModels$default$1 = new LingQsOfferFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.core.premium.LingQsOfferFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) lingQsOfferFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f22347C0 = new w41(y38.m24933a(ce5.class), new ui3() { // from class: com.lingq.core.premium.LingQsOfferFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.core.premium.LingQsOfferFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f22374b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.core.premium.LingQsOfferFragment$special$$inlined$viewModels$default$4
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
        this.f22348D0 = jfa.m14432o(this, LingQsOfferFragment$binding$2.f22349i);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23617Y(this);
        hg3 hg3VarM8513R0 = m8513R0();
        final int i = 0;
        hg3VarM8513R0.f42322d.setOnClickListener(new View.OnClickListener(this) { // from class: ae5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQsOfferFragment f542b;

            {
                this.f542b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                LingQsOfferFragment lingQsOfferFragment = this.f542b;
                switch (i2) {
                    case 0:
                        bh4[] bh4VarArr = LingQsOfferFragment.f22346E0;
                        lingQsOfferFragment.m2109k().m2148U(LingQsOfferFragment.class.getName());
                        break;
                    default:
                        bh4[] bh4VarArr2 = LingQsOfferFragment.f22346E0;
                        lingQsOfferFragment.m2109k().m2148U(LingQsOfferFragment.class.getName());
                        break;
                }
            }
        });
        final int i2 = 1;
        hg3VarM8513R0.f42319a.setOnClickListener(new View.OnClickListener(this) { // from class: ae5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQsOfferFragment f542b;

            {
                this.f542b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                LingQsOfferFragment lingQsOfferFragment = this.f542b;
                switch (i3) {
                    case 0:
                        bh4[] bh4VarArr = LingQsOfferFragment.f22346E0;
                        lingQsOfferFragment.m2109k().m2148U(LingQsOfferFragment.class.getName());
                        break;
                    default:
                        bh4[] bh4VarArr2 = LingQsOfferFragment.f22346E0;
                        lingQsOfferFragment.m2109k().m2148U(LingQsOfferFragment.class.getName());
                        break;
                }
            }
        });
        hg3VarM8513R0.f42323e.m6161b();
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C1834xedd82717(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final hg3 m8513R0() {
        nsa value = this.f22348D0.getValue(this, f22346E0[0]);
        value.getClass();
        return (hg3) value;
    }
}
