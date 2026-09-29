package com.lingq.feature.reader.old.tutorial;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$WordsPagingType;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3440oy;
import p000.C3509qs;
import p000.abd;
import p000.bh4;
import p000.ck6;
import p000.cl9;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.fy4;
import p000.gr3;
import p000.hm5;
import p000.hz4;
import p000.ii2;
import p000.jfa;
import p000.or1;
import p000.rt3;
import p000.s05;
import p000.ui3;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.xe3;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonMoveKnownFragment extends rt3 {

    /* JADX INFO: renamed from: H0 */
    public static final /* synthetic */ bh4[] f29562H0 = {new PropertyReference1Impl(LessonMoveKnownFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentReaderMoveKnownBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f29563C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f29564D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f29565E0;

    /* JADX INFO: renamed from: F0 */
    public C3509qs f29566F0;

    /* JADX INFO: renamed from: G0 */
    public hm5 f29567G0;

    public LessonMoveKnownFragment() {
        super(R$layout.fragment_reader_move_known, 5);
        this.f29563C0 = jfa.m14432o(this, LessonMoveKnownFragment$binding$2.f29568i);
        final LessonMoveKnownFragment$special$$inlined$viewModels$default$1 lessonMoveKnownFragment$special$$inlined$viewModels$default$1 = new LessonMoveKnownFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) lessonMoveKnownFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f29564D0 = new w41(y38.m24933a(C2458c.class), new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29601b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 4);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f29565E0 = new w41(y38.m24933a(C2412n.class), new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29606b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$special$$inlined$viewModels$default$8
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
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        C3440oy c3440oy = new C3440oy(this, 21);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, c3440oy);
        vz1.m23617Y(this);
        s05 s05Var = new s05(new ck6(this, 18));
        xe3 xe3VarM9350R0 = m9350R0();
        String strM2111m = m2111m(R$string.paging_move_known_title);
        strM2111m.getClass();
        String strM4839V = cl9.m4839V(strM2111m, "**", "");
        String strM23371G0 = vk9.m23371G0(vk9.m23368D0(strM2111m, "**", strM2111m), "**");
        String strM23368D0 = vk9.m23368D0(strM2111m, "**", strM2111m);
        String strM23368D1 = vk9.m23368D0(strM23368D0, "**", strM23368D0);
        m9350R0().f68124e.setText(abd.m245a(strM4839V, strM23371G0, vk9.m23371G0(vk9.m23368D0(strM23368D1, "**", strM23368D1), "**")), TextView.BufferType.SPANNABLE);
        jfa.m14425h(xe3VarM9350R0.f68125f);
        final int i = 0;
        xe3VarM9350R0.f68126g.setOnClickListener(new View.OnClickListener(this) { // from class: z45

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonMoveKnownFragment f70876b;

            {
                this.f70876b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                LessonMoveKnownFragment lessonMoveKnownFragment = this.f70876b;
                switch (i2) {
                    case 0:
                        bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
                        hm5 hm5Var = lessonMoveKnownFragment.f29567G0;
                        if (hm5Var == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var).m7025f("Paging prompt go back clicked", null);
                        if (lessonMoveKnownFragment.m9352T0().f29666i != -1) {
                            lessonMoveKnownFragment.m9351S0().f29264B1.mo4677k(Integer.valueOf(lessonMoveKnownFragment.m9352T0().f29666i));
                        }
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = LessonMoveKnownFragment.f29562H0;
                        hm5 hm5Var2 = lessonMoveKnownFragment.f29567G0;
                        if (hm5Var2 == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var2).m7025f("Paging prompt go back clicked", null);
                        if (lessonMoveKnownFragment.m9352T0().f29666i != -1) {
                            lessonMoveKnownFragment.m9351S0().f29264B1.mo4677k(Integer.valueOf(lessonMoveKnownFragment.m9352T0().f29666i));
                        }
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                    default:
                        C3509qs c3509qs = lessonMoveKnownFragment.f29566F0;
                        if (c3509qs == null) {
                            fa4.m11636J("appSettings");
                            throw null;
                        }
                        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                        editorEdit.getClass();
                        editorEdit.putBoolean("pagingMoveToKnown", false);
                        editorEdit.apply();
                        lessonMoveKnownFragment.m9351S0().m9333m3(lessonMoveKnownFragment.m9352T0().f29666i + 1, LqAnalyticsValues$WordsPagingType.PagingPrompt.getValue());
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                }
            }
        });
        final int i2 = 1;
        xe3VarM9350R0.f68120a.setOnClickListener(new View.OnClickListener(this) { // from class: z45

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonMoveKnownFragment f70876b;

            {
                this.f70876b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                LessonMoveKnownFragment lessonMoveKnownFragment = this.f70876b;
                switch (i3) {
                    case 0:
                        bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
                        hm5 hm5Var = lessonMoveKnownFragment.f29567G0;
                        if (hm5Var == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var).m7025f("Paging prompt go back clicked", null);
                        if (lessonMoveKnownFragment.m9352T0().f29666i != -1) {
                            lessonMoveKnownFragment.m9351S0().f29264B1.mo4677k(Integer.valueOf(lessonMoveKnownFragment.m9352T0().f29666i));
                        }
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = LessonMoveKnownFragment.f29562H0;
                        hm5 hm5Var2 = lessonMoveKnownFragment.f29567G0;
                        if (hm5Var2 == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var2).m7025f("Paging prompt go back clicked", null);
                        if (lessonMoveKnownFragment.m9352T0().f29666i != -1) {
                            lessonMoveKnownFragment.m9351S0().f29264B1.mo4677k(Integer.valueOf(lessonMoveKnownFragment.m9352T0().f29666i));
                        }
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                    default:
                        C3509qs c3509qs = lessonMoveKnownFragment.f29566F0;
                        if (c3509qs == null) {
                            fa4.m11636J("appSettings");
                            throw null;
                        }
                        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                        editorEdit.getClass();
                        editorEdit.putBoolean("pagingMoveToKnown", false);
                        editorEdit.apply();
                        lessonMoveKnownFragment.m9351S0().m9333m3(lessonMoveKnownFragment.m9352T0().f29666i + 1, LqAnalyticsValues$WordsPagingType.PagingPrompt.getValue());
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                }
            }
        });
        final int i3 = 2;
        xe3VarM9350R0.f68121b.setOnClickListener(new View.OnClickListener(this) { // from class: z45

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonMoveKnownFragment f70876b;

            {
                this.f70876b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                LessonMoveKnownFragment lessonMoveKnownFragment = this.f70876b;
                switch (i4) {
                    case 0:
                        bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
                        hm5 hm5Var = lessonMoveKnownFragment.f29567G0;
                        if (hm5Var == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var).m7025f("Paging prompt go back clicked", null);
                        if (lessonMoveKnownFragment.m9352T0().f29666i != -1) {
                            lessonMoveKnownFragment.m9351S0().f29264B1.mo4677k(Integer.valueOf(lessonMoveKnownFragment.m9352T0().f29666i));
                        }
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = LessonMoveKnownFragment.f29562H0;
                        hm5 hm5Var2 = lessonMoveKnownFragment.f29567G0;
                        if (hm5Var2 == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var2).m7025f("Paging prompt go back clicked", null);
                        if (lessonMoveKnownFragment.m9352T0().f29666i != -1) {
                            lessonMoveKnownFragment.m9351S0().f29264B1.mo4677k(Integer.valueOf(lessonMoveKnownFragment.m9352T0().f29666i));
                        }
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                    default:
                        C3509qs c3509qs = lessonMoveKnownFragment.f29566F0;
                        if (c3509qs == null) {
                            fa4.m11636J("appSettings");
                            throw null;
                        }
                        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                        editorEdit.getClass();
                        editorEdit.putBoolean("pagingMoveToKnown", false);
                        editorEdit.apply();
                        lessonMoveKnownFragment.m9351S0().m9333m3(lessonMoveKnownFragment.m9352T0().f29666i + 1, LqAnalyticsValues$WordsPagingType.PagingPrompt.getValue());
                        lessonMoveKnownFragment.m2109k().m2147T();
                        return;
                }
            }
        });
        RecyclerView recyclerView = xe3VarM9350R0.f68123d;
        m2090R();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.m2741i(new ii2((int) jfa.m14419b(m2090R(), 16), m2090R().getDrawable(R$drawable.dr_item_divider)));
        recyclerView.setAdapter(s05Var);
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new LessonMoveKnownFragment$onViewCreated$3(this, null), 3).mo4540r(new fy4(this, 5));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2444x1be43ead(this, Lifecycle$State.STARTED, null, this, s05Var), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final xe3 m9350R0() {
        return (xe3) this.f29563C0.getValue(this, f29562H0[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C2412n m9351S0() {
        return (C2412n) this.f29565E0.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final C2458c m9352T0() {
        return (C2458c) this.f29564D0.getValue();
    }
}
