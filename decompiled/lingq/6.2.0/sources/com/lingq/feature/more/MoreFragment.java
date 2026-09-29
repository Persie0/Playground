package com.lingq.feature.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.d26;
import p000.dta;
import p000.dua;
import p000.fa4;
import p000.fg2;
import p000.gr3;
import p000.lda;
import p000.or1;
import p000.rt3;
import p000.ui3;
import p000.v26;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.x74;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreFragment extends rt3 {

    /* JADX INFO: renamed from: C0 */
    public final w41 f26808C0;

    /* JADX INFO: renamed from: D0 */
    public w41 f26809D0;

    public MoreFragment() {
        super(R$layout.fragment_home_more, 9);
        final MoreFragment$special$$inlined$viewModels$default$1 moreFragment$special$$inlined$viewModels$default$1 = new MoreFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.more.MoreFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) moreFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26808C0 = new w41(y38.m24933a(v26.class), new ui3() { // from class: com.lingq.feature.more.MoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.more.MoreFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26827b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.more.MoreFragment$special$$inlined$viewModels$default$4
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
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1948445747, true, new d26(this, 1)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        v26 v26VarM9094S0 = m9094S0();
        v26VarM9094S0.getClass();
        wfb.m23926u(lda.m16103C(v26VarM9094S0), null, null, new MoreViewModel$updateNotifications$1(v26VarM9094S0, null), 3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23636i0(this);
        fg2 fg2Var = new fg2(11);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, fg2Var);
        x74.m24339F(this, "lessonImportedFromUser", new d26(this, 0));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2157x6c6e7ce8(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final w41 m9093R0() {
        w41 w41Var = this.f26809D0;
        if (w41Var != null) {
            return w41Var;
        }
        fa4.m11636J("navGraphController");
        throw null;
    }

    /* JADX INFO: renamed from: S0 */
    public final v26 m9094S0() {
        return (v26) this.f26808C0.getValue();
    }
}
