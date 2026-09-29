package com.lingq.feature.reader.old.vocabulary;

import android.view.View;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.vocabulary.C2610a;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3440oy;
import p000.a75;
import p000.bh4;
import p000.bia;
import p000.c75;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.gr3;
import p000.h31;
import p000.hz4;
import p000.jfa;
import p000.or1;
import p000.rt3;
import p000.sq5;
import p000.ui3;
import p000.uq0;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.y38;
import p000.yd3;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonVocabularyFragment extends rt3 {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f29676G0 = {new PropertyReference1Impl(LessonVocabularyFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentLessonVocabularyBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f29677C0;

    /* JADX INFO: renamed from: D0 */
    public final sq5 f29678D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f29679E0;

    /* JADX INFO: renamed from: F0 */
    public bia f29680F0;

    public LessonVocabularyFragment() {
        super(R$layout.fragment_lesson_vocabulary, 7);
        this.f29677C0 = jfa.m14432o(this, LessonVocabularyFragment$binding$2.f29681i);
        this.f29678D0 = new sq5(3, y38.m24933a(c75.class), new uq0(this, 12));
        final hz4 hz4Var = new hz4(this, 6);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) hz4Var.f43241b;
                bh4[] bh4VarArr = LessonVocabularyFragment.f29676G0;
                return lessonVocabularyFragment;
            }
        });
        this.f29679E0 = new w41(y38.m24933a(C2610a.class), new ui3() { // from class: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$4
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29701b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment$special$$inlined$viewModels$default$3
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
        view.getClass();
        C3440oy c3440oy = new C3440oy(this, 23);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, c3440oy);
        if (!vz1.m23653w(this)) {
            vz1.m23641m0(this);
        }
        yd3 yd3VarM9355R0 = m9355R0();
        if (((c75) this.f29678D0.getValue()).f9662b) {
            jfa.m14425h(yd3VarM9355R0.f69679b);
            jfa.m14429l(yd3VarM9355R0.f69678a);
        } else {
            MaterialToolbar materialToolbar = yd3VarM9355R0.f69679b;
            materialToolbar.setTitle(m2111m(R$string.lesson_lesson_vocabulary));
            materialToolbar.setNavigationIcon(m2090R().getDrawable(R$drawable.ic_close_s));
            materialToolbar.setNavigationOnClickListener(new h31(this, 5));
        }
        ComposeView composeView = m9355R0().f69680c;
        composeView.setViewCompositionStrategy(C0411w.f4868a);
        composeView.setContent(new C0282a(1610856591, true, new a75(this, 0)));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2459x3383ae91(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final yd3 m9355R0() {
        return (yd3) this.f29677C0.getValue(this, f29676G0[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C2610a m9356S0() {
        return (C2610a) this.f29679E0.getValue();
    }
}
