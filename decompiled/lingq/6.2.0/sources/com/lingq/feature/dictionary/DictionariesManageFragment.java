package com.lingq.feature.dictionary;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.core.designsystem.R$style;
import java.util.ArrayList;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.AbstractC3489q9;
import p000.C3309ls;
import p000.ae3;
import p000.bh4;
import p000.cs4;
import p000.dua;
import p000.fa4;
import p000.gld;
import p000.gr3;
import p000.h31;
import p000.hi8;
import p000.jfa;
import p000.or1;
import p000.qt3;
import p000.ua4;
import p000.ui3;
import p000.v28;
import p000.va4;
import p000.vj6;
import p000.w41;
import p000.wfb;
import p000.xa4;
import p000.y38;
import p000.za4;
import p000.zta;

/* JADX INFO: loaded from: classes2.dex */
public final class DictionariesManageFragment extends qt3 {

    /* JADX INFO: renamed from: W0 */
    public static final /* synthetic */ bh4[] f25721W0 = {new PropertyReference1Impl(DictionariesManageFragment.class, "binding", "getBinding()Lcom/lingq/feature/dictionary/databinding/FragmentManageDictionariesBinding;")};

    /* JADX INFO: renamed from: S0 */
    public C2064h f25722S0;

    /* JADX INFO: renamed from: T0 */
    public za4 f25723T0;

    /* JADX INFO: renamed from: U0 */
    public final C3309ls f25724U0;

    /* JADX INFO: renamed from: V0 */
    public final w41 f25725V0;

    public DictionariesManageFragment() {
        super(2);
        this.f25724U0 = jfa.m14432o(this, DictionariesManageFragment$binding$2.f25726i);
        final DictionariesManageFragment$special$$inlined$viewModels$default$1 dictionariesManageFragment$special$$inlined$viewModels$default$1 = new DictionariesManageFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.dictionary.DictionariesManageFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) dictionariesManageFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f25725V0 = new w41(y38.m24933a(C2057b.class), new ui3() { // from class: com.lingq.feature.dictionary.DictionariesManageFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.dictionary.DictionariesManageFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f25741b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.dictionary.DictionariesManageFragment$special$$inlined$viewModels$default$4
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
        return layoutInflater.inflate(R$layout.fragment_manage_dictionaries, viewGroup, false);
    }

    /* JADX INFO: renamed from: A0 */
    public final ae3 m8962A0() {
        return (ae3) this.f25724U0.getValue(this, f25721W0[0]);
    }

    /* JADX INFO: renamed from: B0 */
    public final C2057b m8963B0() {
        return (C2057b) this.f25725V0.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        Dialog dialog = this.f8417H0;
        View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R$id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM6021C = BottomSheetBehavior.m6021C(viewFindViewById);
            DisplayMetrics displayMetrics = m2110l().getDisplayMetrics();
            bottomSheetBehaviorM6021C.m6031L(displayMetrics.heightPixels);
            RelativeLayout relativeLayout = m8962A0().f536a;
            relativeLayout.getClass();
            jfa.m14426i(relativeLayout, displayMetrics.heightPixels);
        }
        ae3 ae3VarM8962A0 = m8962A0();
        TextView textView = ae3VarM8962A0.f538c;
        RecyclerView recyclerView = ae3VarM8962A0.f537b;
        textView.setOnClickListener(new h31(this, 2));
        this.f25722S0 = new C2064h(new hi8(this, 12), new vj6(this, 11));
        m8962A0().f536a.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C2064h c2064h = this.f25722S0;
        if (c2064h == null) {
            fa4.m11636J("dictionariesManageAdapter");
            throw null;
        }
        za4 za4Var = new za4(new gld(c2064h, AbstractC3489q9.m19788r(Integer.valueOf(DictionariesManageAdapter$DictionaryAdapterItemType.AvailableDictionary.ordinal()), Integer.valueOf(DictionariesManageAdapter$DictionaryAdapterItemType.Filter.ordinal())), new C2065i(this)));
        this.f25723T0 = za4Var;
        RecyclerView recyclerView2 = m8962A0().f537b;
        RecyclerView recyclerView3 = za4Var.f71277q;
        if (recyclerView3 != recyclerView2) {
            ua4 ua4Var = za4Var.f71285y;
            if (recyclerView3 != null) {
                recyclerView3.m2736e0(za4Var);
                RecyclerView recyclerView4 = za4Var.f71277q;
                recyclerView4.f6619L.remove(ua4Var);
                if (recyclerView4.f6621M == ua4Var) {
                    recyclerView4.f6621M = null;
                }
                ArrayList arrayList = za4Var.f71277q.f6644a0;
                if (arrayList != null) {
                    arrayList.remove(za4Var);
                }
                ArrayList arrayList2 = za4Var.f71276p;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    va4 va4Var = (va4) arrayList2.get(0);
                    va4Var.f65128g.cancel();
                    za4Var.f71273m.m12740a(za4Var.f71277q, va4Var.f65126e);
                }
                arrayList2.clear();
                za4Var.f71282v = null;
                VelocityTracker velocityTracker = za4Var.f71279s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    za4Var.f71279s = null;
                }
                xa4 xa4Var = za4Var.f71284x;
                if (xa4Var != null) {
                    xa4Var.f67991a = false;
                    za4Var.f71284x = null;
                }
                if (za4Var.f71283w != null) {
                    za4Var.f71283w = null;
                }
            }
            za4Var.f71277q = recyclerView2;
            Resources resources = recyclerView2.getResources();
            za4Var.f71266f = resources.getDimension(R$dimen.item_touch_helper_swipe_escape_velocity);
            za4Var.f71267g = resources.getDimension(R$dimen.item_touch_helper_swipe_escape_max_velocity);
            ViewConfiguration.get(za4Var.f71277q.getContext()).getScaledTouchSlop();
            za4Var.f71277q.m2741i(za4Var);
            za4Var.f71277q.f6619L.add(ua4Var);
            RecyclerView recyclerView5 = za4Var.f71277q;
            if (recyclerView5.f6644a0 == null) {
                recyclerView5.f6644a0 = new ArrayList();
            }
            recyclerView5.f6644a0.add(za4Var);
            za4Var.f71284x = new xa4(za4Var);
            za4Var.f71283w = new GestureDetector(za4Var.f71277q.getContext(), za4Var.f71284x);
        }
        v28 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f64747f = 0L;
        }
        C2064h c2064h2 = this.f25722S0;
        if (c2064h2 == null) {
            fa4.m11636J("dictionariesManageAdapter");
            throw null;
        }
        recyclerView.setAdapter(c2064h2);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2054x672f82cc(this, Lifecycle$State.STARTED, null, this), 3);
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: g0 */
    public final int mo3661g0() {
        return R$style.AppTheme_BottomSheetDialog;
    }
}
