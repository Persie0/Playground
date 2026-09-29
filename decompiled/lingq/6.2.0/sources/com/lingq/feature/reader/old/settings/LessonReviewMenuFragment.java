package com.lingq.feature.reader.old.settings;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C3309ls;
import p000.C3440oy;
import p000.C3509qs;
import p000.bh4;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.fy4;
import p000.gr3;
import p000.hz4;
import p000.i65;
import p000.jfa;
import p000.lda;
import p000.or1;
import p000.r46;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wsa;
import p000.y38;
import p000.ze3;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class LessonReviewMenuFragment extends rt3 {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ bh4[] f29427G0 = {new PropertyReference1Impl(LessonReviewMenuFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentReaderReviewMenuBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f29428C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f29429D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f29430E0;

    /* JADX INFO: renamed from: F0 */
    public C3509qs f29431F0;

    public LessonReviewMenuFragment() {
        super(R$layout.fragment_reader_review_menu, 6);
        this.f29428C0 = jfa.m14432o(this, LessonReviewMenuFragment$binding$2.f29432i);
        final LessonReviewMenuFragment$special$$inlined$viewModels$default$1 lessonReviewMenuFragment$special$$inlined$viewModels$default$1 = new LessonReviewMenuFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) lessonReviewMenuFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f29429D0 = new w41(y38.m24933a(i65.class), new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29477b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 5);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f29430E0 = new w41(y38.m24933a(C2412n.class), new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f29482b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$special$$inlined$viewModels$default$8
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
    /* JADX INFO: renamed from: G */
    public final void mo2080G() {
        this.f5688b0 = true;
        m9346T0().mo8740G(TooltipStep.ReviewMenu);
        m9346T0().mo8745Q();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        C3440oy c3440oy = new C3440oy(this, 22);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, c3440oy);
        vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationShort4, 200), this);
        ze3 ze3VarM9344R0 = m9344R0();
        final int i = 0;
        ze3VarM9344R0.f71454k.setOnClickListener(new View.OnClickListener(this) { // from class: f65

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonReviewMenuFragment f38518b;

            {
                this.f38518b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                LessonReviewMenuFragment lessonReviewMenuFragment = this.f38518b;
                switch (i2) {
                    case 0:
                        bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        break;
                    case 1:
                        bh4[] bh4VarArr2 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.Page);
                        break;
                    case 2:
                        bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.SrsDue);
                        break;
                    case 3:
                        bh4[] bh4VarArr4 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.All);
                        break;
                    default:
                        bh4[] bh4VarArr5 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        C2412n c2412nM9345S0 = lessonReviewMenuFragment.m9345S0();
                        c2412nM9345S0.f29405s1.mo4677k(ix7.f44741e);
                        break;
                }
            }
        });
        final int i2 = 1;
        ze3VarM9344R0.f71449f.setOnClickListener(new View.OnClickListener(this) { // from class: f65

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonReviewMenuFragment f38518b;

            {
                this.f38518b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                LessonReviewMenuFragment lessonReviewMenuFragment = this.f38518b;
                switch (i3) {
                    case 0:
                        bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        break;
                    case 1:
                        bh4[] bh4VarArr2 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.Page);
                        break;
                    case 2:
                        bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.SrsDue);
                        break;
                    case 3:
                        bh4[] bh4VarArr4 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.All);
                        break;
                    default:
                        bh4[] bh4VarArr5 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        C2412n c2412nM9345S0 = lessonReviewMenuFragment.m9345S0();
                        c2412nM9345S0.f29405s1.mo4677k(ix7.f44741e);
                        break;
                }
            }
        });
        final int i3 = 2;
        ze3VarM9344R0.f71448e.setOnClickListener(new View.OnClickListener(this) { // from class: f65

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonReviewMenuFragment f38518b;

            {
                this.f38518b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                LessonReviewMenuFragment lessonReviewMenuFragment = this.f38518b;
                switch (i4) {
                    case 0:
                        bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        break;
                    case 1:
                        bh4[] bh4VarArr2 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.Page);
                        break;
                    case 2:
                        bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.SrsDue);
                        break;
                    case 3:
                        bh4[] bh4VarArr4 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.All);
                        break;
                    default:
                        bh4[] bh4VarArr5 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        C2412n c2412nM9345S0 = lessonReviewMenuFragment.m9345S0();
                        c2412nM9345S0.f29405s1.mo4677k(ix7.f44741e);
                        break;
                }
            }
        });
        final int i4 = 3;
        ze3VarM9344R0.f71447d.setOnClickListener(new View.OnClickListener(this) { // from class: f65

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonReviewMenuFragment f38518b;

            {
                this.f38518b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = i4;
                LessonReviewMenuFragment lessonReviewMenuFragment = this.f38518b;
                switch (i5) {
                    case 0:
                        bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        break;
                    case 1:
                        bh4[] bh4VarArr2 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.Page);
                        break;
                    case 2:
                        bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.SrsDue);
                        break;
                    case 3:
                        bh4[] bh4VarArr4 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.All);
                        break;
                    default:
                        bh4[] bh4VarArr5 = LessonReviewMenuFragment.f29427G0;
                        lessonReviewMenuFragment.m2109k().m2147T();
                        C2412n c2412nM9345S0 = lessonReviewMenuFragment.m9345S0();
                        c2412nM9345S0.f29405s1.mo4677k(ix7.f44741e);
                        break;
                }
            }
        });
        boolean zM23653w = vz1.m23653w(this);
        TextView textView = ze3VarM9344R0.f71450g;
        if (zM23653w) {
            jfa.m14425h(textView);
        } else {
            final int i5 = 4;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: f65

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonReviewMenuFragment f38518b;

                {
                    this.f38518b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = i5;
                    LessonReviewMenuFragment lessonReviewMenuFragment = this.f38518b;
                    switch (i6) {
                        case 0:
                            bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                            lessonReviewMenuFragment.m2109k().m2147T();
                            break;
                        case 1:
                            bh4[] bh4VarArr2 = LessonReviewMenuFragment.f29427G0;
                            lessonReviewMenuFragment.m2109k().m2147T();
                            lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.Page);
                            break;
                        case 2:
                            bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                            lessonReviewMenuFragment.m2109k().m2147T();
                            lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.SrsDue);
                            break;
                        case 3:
                            bh4[] bh4VarArr4 = LessonReviewMenuFragment.f29427G0;
                            lessonReviewMenuFragment.m2109k().m2147T();
                            lessonReviewMenuFragment.m9345S0().m9339s3(ReviewType.All);
                            break;
                        default:
                            bh4[] bh4VarArr5 = LessonReviewMenuFragment.f29427G0;
                            lessonReviewMenuFragment.m2109k().m2147T();
                            C2412n c2412nM9345S0 = lessonReviewMenuFragment.m9345S0();
                            c2412nM9345S0.f29405s1.mo4677k(ix7.f44741e);
                            break;
                    }
                }
            });
        }
        wfb.m23926u(AbstractC0708b.m2508a(this), null, null, new LessonReviewMenuFragment$onViewCreated$3(this, null), 3).mo4540r(new fy4(this, 6));
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2413xd0ccf142(this, Lifecycle$State.STARTED, null, this), 3);
        i65 i65VarM9346T0 = m9346T0();
        i65VarM9346T0.getClass();
        wfb.m23926u(lda.m16103C(i65VarM9346T0), null, null, new LessonReviewMenuViewModel$showReviewTooltip$1(i65VarM9346T0, null), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final ze3 m9344R0() {
        return (ze3) this.f29428C0.getValue(this, f29427G0[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C2412n m9345S0() {
        return (C2412n) this.f29430E0.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final i65 m9346T0() {
        return (i65) this.f29429D0.getValue();
    }
}
