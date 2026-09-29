package com.lingq.feature.reader.old.tutorial;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.bh4;
import p000.cl9;
import p000.cs4;
import p000.dua;
import p000.fy4;
import p000.gr3;
import p000.jfa;
import p000.m25;
import p000.o25;
import p000.or1;
import p000.qt3;
import p000.uf3;
import p000.ui3;
import p000.vk9;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonFirstLingQCongratsFragment extends qt3 {

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ bh4[] f29549U0 = {new PropertyReference1Impl(LessonFirstLingQCongratsFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentTooltipsFirstLingqBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f29550S0;

    /* JADX INFO: renamed from: T0 */
    public final w41 f29551T0;

    public LessonFirstLingQCongratsFragment() {
        super(4);
        this.f29550S0 = jfa.m14432o(this, LessonFirstLingQCongratsFragment$binding$2.f29552i);
        final C2439x5dc2e9ed c2439x5dc2e9ed = new C2439x5dc2e9ed(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2439x5dc2e9ed.mo0a();
            }
        });
        this.f29551T0 = new w41(y38.m24933a(o25.class), new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29560b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$4
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
        return layoutInflater.inflate(R$layout.fragment_tooltips_first_lingq, viewGroup, false);
    }

    /* JADX INFO: renamed from: A0 */
    public final uf3 m9349A0() {
        return (uf3) this.f29550S0.getValue(this, f29549U0[0]);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        Dialog dialog = this.f8417H0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R$id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
            DisplayMetrics displayMetrics = m2110l().getDisplayMetrics();
            bottomSheetBehaviorM6021C.m6031L(displayMetrics.heightPixels - ((int) jfa.m14419b(m2090R(), 200)));
            RelativeLayout relativeLayout = m9349A0().f63833a;
            relativeLayout.getClass();
            jfa.m14426i(relativeLayout, displayMetrics.heightPixels - ((int) jfa.m14419b(m2090R(), 200)));
        }
        uf3 uf3VarM9349A0 = m9349A0();
        final int i = 0;
        uf3VarM9349A0.f63837e.setOnClickListener(new View.OnClickListener(this) { // from class: l25

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFirstLingQCongratsFragment f48937b;

            {
                this.f48937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = this.f48937b;
                switch (i2) {
                    case 0:
                        bh4[] bh4VarArr = LessonFirstLingQCongratsFragment.f29549U0;
                        b34.m3244j(lessonFirstLingQCongratsFragment).m22689f();
                        break;
                    default:
                        bh4[] bh4VarArr2 = LessonFirstLingQCongratsFragment.f29549U0;
                        b34.m3244j(lessonFirstLingQCongratsFragment).m22689f();
                        break;
                }
            }
        });
        final int i2 = 1;
        uf3VarM9349A0.f63834b.setOnClickListener(new View.OnClickListener(this) { // from class: l25

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFirstLingQCongratsFragment f48937b;

            {
                this.f48937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = this.f48937b;
                switch (i3) {
                    case 0:
                        bh4[] bh4VarArr = LessonFirstLingQCongratsFragment.f29549U0;
                        b34.m3244j(lessonFirstLingQCongratsFragment).m22689f();
                        break;
                    default:
                        bh4[] bh4VarArr2 = LessonFirstLingQCongratsFragment.f29549U0;
                        b34.m3244j(lessonFirstLingQCongratsFragment).m22689f();
                        break;
                }
            }
        });
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(jfa.m14431n(m2090R(), R$attr.colorSecondaryVariant));
        String strM2111m = m2111m(R$string.tooltips_first_lingq_congrats);
        strM2111m.getClass();
        int iM23389l0 = vk9.m23389l0(strM2111m, "**", 0, false, 6);
        int iM23394q0 = vk9.m23394q0(strM2111m, 6, "**") - 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cl9.m4839V(strM2111m, "**", ""));
        try {
            spannableStringBuilder.setSpan(foregroundColorSpan, iM23389l0, iM23394q0, 0);
            m9349A0().f63835c.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        TextView textView = uf3VarM9349A0.f63836d;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new m25(i, textView, this));
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new LessonFirstLingQCongratsFragment$onViewCreated$3(this, null), 3).mo4540r(new fy4(this, 3));
        ((o25) this.f29551T0.getValue()).mo8742L(TooltipStep.FirstLingQ);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }
}
