package com.lingq.feature.reader.stats.p019ui.all;

import android.view.View;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.feature.reader.R$layout;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.dy4;
import p000.gr3;
import p000.hy4;
import p000.jfa;
import p000.or1;
import p000.rt3;
import p000.sq5;
import p000.ui3;
import p000.uq0;
import p000.vd3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonCompleteAllWordsFragment extends rt3 {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ bh4[] f30861F0 = {new PropertyReference1Impl(LessonCompleteAllWordsFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentLessonCompleteAllWordsBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f30862C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f30863D0;

    /* JADX INFO: renamed from: E0 */
    public final sq5 f30864E0;

    public LessonCompleteAllWordsFragment() {
        super(R$layout.fragment_lesson_complete_all_words, 4);
        this.f30862C0 = jfa.m14432o(this, LessonCompleteAllWordsFragment$binding$2.f30865i);
        final C2539x5cbc2790 c2539x5cbc2790 = new C2539x5cbc2790(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2539x5cbc2790.mo0a();
            }
        });
        this.f30863D0 = new w41(y38.m24933a(C2556c.class), new ui3() { // from class: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f30883b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsFragment$special$$inlined$viewModels$default$4
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
        this.f30864E0 = new sq5(3, y38.m24933a(hy4.class), new uq0(this, 6));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23640l0(this);
        ComposeView composeView = ((vd3) this.f30862C0.getValue(this, f30861F0[0])).f65229a;
        composeView.setViewCompositionStrategy(C0411w.f4868a);
        composeView.setContent(new C0282a(797315381, true, new dy4(this, 0)));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2536xf6d327cc(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final C2556c m9466R0() {
        return (C2556c) this.f30863D0.getValue();
    }
}
