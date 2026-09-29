package com.lingq.feature.reader.old.tutorial;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.designsystem.R$style;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.old.C2412n;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3509qs;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.fa4;
import p000.fy4;
import p000.gr3;
import p000.h31;
import p000.hm5;
import p000.hz4;
import p000.jfa;
import p000.or1;
import p000.qt3;
import p000.s05;
import p000.spa;
import p000.sq5;
import p000.tr0;
import p000.u05;
import p000.ui3;
import p000.uq0;
import p000.vj6;
import p000.w41;
import p000.wd3;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonDealWithWordsFragment extends qt3 {

    /* JADX INFO: renamed from: Z0 */
    public static final /* synthetic */ bh4[] f29486Z0 = {new PropertyReference1Impl(LessonDealWithWordsFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentLessonDealWithWordsBinding;")};

    /* JADX INFO: renamed from: S0 */
    public final C3309ls f29487S0;

    /* JADX INFO: renamed from: T0 */
    public final w41 f29488T0;

    /* JADX INFO: renamed from: U0 */
    public final sq5 f29489U0;

    /* JADX INFO: renamed from: V0 */
    public final w41 f29490V0;

    /* JADX INFO: renamed from: W0 */
    public C3509qs f29491W0;

    /* JADX INFO: renamed from: X0 */
    public hm5 f29492X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f29493Y0;

    public LessonDealWithWordsFragment() {
        super(3);
        this.f29487S0 = jfa.m14432o(this, LessonDealWithWordsFragment$binding$2.f29494i);
        final C2427x7b5ad5b6 c2427x7b5ad5b6 = new C2427x7b5ad5b6(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2427x7b5ad5b6.mo0a();
            }
        });
        this.f29488T0 = new w41(y38.m24933a(C2457b.class), new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29523b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$4
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
        this.f29489U0 = new sq5(3, y38.m24933a(u05.class), new uq0(this, 9));
        final hz4 hz4Var = new hz4(this, 2);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f29490V0 = new w41(y38.m24933a(C2412n.class), new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b2.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29528b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b2.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R$layout.fragment_lesson_deal_with_words, viewGroup, false);
    }

    /* JADX INFO: renamed from: A0 */
    public final C2412n m9347A0() {
        return (C2412n) this.f29490V0.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public final C2457b m9348B0() {
        return (C2457b) this.f29488T0.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        Dialog dialog = this.f8417H0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R$id.design_bottom_sheet) : null;
        bh4[] bh4VarArr = f29486Z0;
        C3309ls c3309ls = this.f29487S0;
        sq5 sq5Var = this.f29489U0;
        int i = 1;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
            DisplayMetrics displayMetrics = m2110l().getDisplayMetrics();
            bottomSheetBehaviorM6021C.m6031L(displayMetrics.heightPixels - (((u05) sq5Var.getValue()).f63169b != -1 ? (int) jfa.m14419b(m2090R(), 100) : 0));
            ConstraintLayout constraintLayout = ((wd3) c3309ls.getValue(this, bh4VarArr[0])).f66638a;
            constraintLayout.getClass();
            jfa.m14426i(constraintLayout, displayMetrics.heightPixels - (((u05) sq5Var.getValue()).f63169b != -1 ? (int) jfa.m14419b(m2090R(), 100) : 0));
            bottomSheetBehaviorM6021C.f12695L = ((u05) sq5Var.getValue()).f63169b != -1;
            bottomSheetBehaviorM6021C.m6029J(true);
        }
        hm5 hm5Var = this.f29492X0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("Lesson ID", ((u05) sq5Var.getValue()).f63168a);
        C3509qs c3509qs = this.f29491W0;
        if (c3509qs == null) {
            fa4.m11636J("appSettings");
            throw null;
        }
        bundle.putInt("nth time shown", c3509qs.f58118b.getInt("pagingDealWithWordsTimes", 0));
        ((C1240a) hm5Var).m7025f("Paging prompt showed", bundle);
        s05 s05Var = new s05(new vj6(this, 23));
        C3509qs c3509qs2 = this.f29491W0;
        if (c3509qs2 == null) {
            fa4.m11636J("appSettings");
            throw null;
        }
        SharedPreferences sharedPreferences = c3509qs2.f58118b;
        int i2 = sharedPreferences.getInt("pagingDealWithWordsTimes", 0) + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putInt("pagingDealWithWordsTimes", i2);
        editorEdit.apply();
        wd3 wd3Var = (wd3) c3309ls.getValue(this, bh4VarArr[0]);
        C3509qs c3509qs3 = this.f29491W0;
        if (c3509qs3 == null) {
            fa4.m11636J("appSettings");
            throw null;
        }
        if (c3509qs3.f58118b.getInt("pagingDealWithWordsTimes", 0) >= 2) {
            jfa.m14429l(wd3Var.f66641d);
            wd3Var.f66641d.setOnClickListener(new tr0(i, this, wd3Var));
        } else {
            jfa.m14425h(wd3Var.f66641d);
        }
        Button button = wd3Var.f66639b;
        RecyclerView recyclerView = wd3Var.f66640c;
        button.setOnClickListener(new h31(this, 4));
        if (m9348B0().f29652h != -1) {
            ConstraintLayout constraintLayout2 = wd3Var.f66643f;
            constraintLayout2.getClass();
            constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), 0);
        }
        m2090R();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.m2741i(new spa((int) jfa.m14419b(m2090R(), 8)));
        recyclerView.setAdapter(s05Var);
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new LessonDealWithWordsFragment$onViewCreated$4(this, null), 3).mo4540r(new fy4(this, i));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2422x8b9cc0f2(this, Lifecycle$State.STARTED, null, this, s05Var), 3);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }

    @Override // p000.be2, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.f29493Y0) {
            return;
        }
        hm5 hm5Var = this.f29492X0;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        ((C1240a) hm5Var).m7025f("Paging prompt go back clicked", null);
        if (m9348B0().f29652h != -1) {
            m9347A0().f29264B1.mo4677k(Integer.valueOf(m9348B0().f29652h));
        }
    }
}
