package com.lingq.feature.library.preview;

import android.view.View;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import com.lingq.core.p012ui.R$layout;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.C3244l;
import p000.C3309ls;
import p000.C3487q7;
import p000.RunnableC3470pr;
import p000.bh4;
import p000.c82;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.fa4;
import p000.fr5;
import p000.gm5;
import p000.gr3;
import p000.jfa;
import p000.lda;
import p000.o55;
import p000.ob1;
import p000.or1;
import p000.q55;
import p000.r46;
import p000.s55;
import p000.sq5;
import p000.st3;
import p000.ui3;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.xd3;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes.dex */
public final class LessonPreviewFragment extends st3 {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f26702G0 = {new PropertyReference1Impl(LessonPreviewFragment.class, "binding", "getBinding()Lcom/lingq/core/ui/databinding/FragmentLessonPreviewBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f26703C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f26704D0;

    /* JADX INFO: renamed from: E0 */
    public final sq5 f26705E0;

    /* JADX INFO: renamed from: F0 */
    public ob1 f26706F0;

    public LessonPreviewFragment() {
        super(R$layout.fragment_lesson_preview, 1);
        this.f26703C0 = jfa.m14432o(this, LessonPreviewFragment$binding$2.f26707i);
        final LessonPreviewFragment$special$$inlined$viewModels$default$1 lessonPreviewFragment$special$$inlined$viewModels$default$1 = new LessonPreviewFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.library.preview.LessonPreviewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) lessonPreviewFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26704D0 = new w41(y38.m24933a(C2155b.class), new ui3() { // from class: com.lingq.feature.library.preview.LessonPreviewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.library.preview.LessonPreviewFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26733b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.library.preview.LessonPreviewFragment$special$$inlined$viewModels$default$4
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
        this.f26705E0 = new sq5(3, y38.m24933a(s55.class), new c82(this, 3));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        VirtualLessonImportMode virtualLessonImportMode;
        view.getClass();
        vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 500), this);
        C3487q7 c3487q7 = new C3487q7(this, 15);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, c3487q7);
        xd3 xd3VarM9082h0 = m9082h0();
        boolean z = m9081g0().f60378f;
        boolean z2 = m9081g0().f60379g;
        if (z) {
            virtualLessonImportMode = z2 ? VirtualLessonImportMode.AUDIO_VIRTUAL : VirtualLessonImportMode.AUDIOLESS_VIRTUAL;
        } else {
            virtualLessonImportMode = VirtualLessonImportMode.EXTERNAL_PREVIEW;
        }
        int i = q55.f57292a[virtualLessonImportMode.ordinal()];
        final int i2 = 1;
        if (i == 1) {
            jfa.m14425h(xd3VarM9082h0.f68097e);
            jfa.m14425h(xd3VarM9082h0.f68093a);
            m9085k0();
        } else if (i == 2) {
            jfa.m14425h(xd3VarM9082h0.f68097e);
            jfa.m14425h(xd3VarM9082h0.f68093a);
            wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new LessonPreviewFragment$onViewCreated$2$1(this, null), 3);
        } else {
            if (i != 3) {
                gm5.m12750e();
                return;
            }
            if (m9081g0().f60373a.equals("Netflix")) {
                jfa.m14425h(xd3VarM9082h0.f68097e);
                m9085k0();
            } else {
                if (m9081g0().f60373a.equals("primevideo.com")) {
                    ob1 ob1Var = this.f26706F0;
                    if (ob1Var == null) {
                        fa4.m11636J("utils");
                        throw null;
                    }
                    ob1Var.m17896j();
                }
                view.postDelayed(new RunnableC3470pr(24, xd3VarM9082h0, this), 500L);
            }
        }
        final int i3 = 0;
        xd3VarM9082h0.f68094b.setOnClickListener(new View.OnClickListener(this) { // from class: n55

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonPreviewFragment f52364b;

            {
                this.f52364b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                LessonPreviewFragment lessonPreviewFragment = this.f52364b;
                switch (i4) {
                    case 0:
                        bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                        b34.m3244j(lessonPreviewFragment).m22689f();
                        break;
                    default:
                        bh4[] bh4VarArr2 = LessonPreviewFragment.f26702G0;
                        lessonPreviewFragment.m9084j0();
                        break;
                }
            }
        });
        xd3VarM9082h0.f68093a.setOnClickListener(new View.OnClickListener(this) { // from class: n55

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonPreviewFragment f52364b;

            {
                this.f52364b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                LessonPreviewFragment lessonPreviewFragment = this.f52364b;
                switch (i4) {
                    case 0:
                        bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                        b34.m3244j(lessonPreviewFragment).m22689f();
                        break;
                    default:
                        bh4[] bh4VarArr2 = LessonPreviewFragment.f26702G0;
                        lessonPreviewFragment.m9084j0();
                        break;
                }
            }
        });
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2147x6de2cf03(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: g0 */
    public final s55 m9081g0() {
        return (s55) this.f26705E0.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    public final xd3 m9082h0() {
        return (xd3) this.f26703C0.getValue(this, f26702G0[0]);
    }

    /* JADX INFO: renamed from: i0 */
    public final C2155b m9083i0() {
        return (C2155b) this.f26704D0.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m9084j0() {
        C2155b c2155bM9083i0 = m9083i0();
        int i = m9081g0().f60376d;
        String str = m9081g0().f60374b;
        String str2 = m9081g0().f60373a;
        if (!vk9.m23391n0(str)) {
            wfb.m23926u(lda.m16103C(c2155bM9083i0), c2155bM9083i0.f26770g, null, new LessonPreviewViewModel$importLesson$1(c2155bM9083i0, str, str2, i, null), 2);
            return;
        }
        C3244l c3244l = c2155bM9083i0.f26773j;
        Boolean bool = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m9085k0() {
        fr5 fr5Var = new fr5(m2090R());
        fr5Var.m12028k(R$string.lingq_import_lesson);
        fr5Var.m12020c(com.lingq.feature.library.R$string.import_generic_warning);
        fr5Var.m12019b();
        fr5Var.m12025h(com.lingq.feature.library.R$string.ui_return, new o55(this, 2)).m25557a();
    }
}
