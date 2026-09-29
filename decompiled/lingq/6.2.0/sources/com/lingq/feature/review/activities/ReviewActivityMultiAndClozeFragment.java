package com.lingq.feature.review.activities;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.material.R$attr;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.review.C2758f;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.R$string;
import com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.feature.review.data.ReviewActivityResult;
import com.lingq.feature.review.data.ReviewActivityShow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random$Default;
import p000.AbstractC3352my;
import p000.C3309ls;
import p000.bh4;
import p000.cs4;
import p000.db8;
import p000.df3;
import p000.dua;
import p000.eb8;
import p000.fa4;
import p000.fb8;
import p000.gr3;
import p000.hz4;
import p000.jb8;
import p000.jc8;
import p000.jfa;
import p000.jq7;
import p000.kb8;
import p000.nb8;
import p000.or1;
import p000.qv7;
import p000.r46;
import p000.rt3;
import p000.sc8;
import p000.sca;
import p000.tr0;
import p000.u91;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewActivityMultiAndClozeFragment extends rt3 {

    /* JADX INFO: renamed from: I0 */
    public static final /* synthetic */ bh4[] f32016I0 = {new PropertyReference1Impl(ReviewActivityMultiAndClozeFragment.class, "binding", "getBinding()Lcom/lingq/feature/review/databinding/FragmentReviewActivityMultiAndClozeBinding;")};

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f32017C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f32018D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f32019E0;

    /* JADX INFO: renamed from: F0 */
    public final TextView[] f32020F0;

    /* JADX INFO: renamed from: G0 */
    public final View[] f32021G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f32022H0;

    public ReviewActivityMultiAndClozeFragment() {
        super(R$layout.fragment_review_activity_multi_and_cloze, 16);
        this.f32017C0 = jfa.m14432o(this, ReviewActivityMultiAndClozeFragment$binding$2.f32023i);
        final C2674xd72b4f23 c2674xd72b4f23 = new C2674xd72b4f23(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) c2674xd72b4f23.mo0a();
            }
        });
        this.f32018D0 = new w41(y38.m24933a(C2750e.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32060b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$4
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
        final hz4 hz4Var = new hz4(this, 23);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f32019E0 = new w41(y38.m24933a(C2758f.class), new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f32065b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$special$$inlined$viewModels$default$8
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
        this.f32020F0 = new TextView[4];
        this.f32021G0 = new View[4];
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 500), this);
        m9542S0().m9606Z2(new jc8(ReviewActivityShow.DoNotKnow));
        nb8 nb8VarM9609c3 = m9542S0().m9609c3();
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2668x697204df(this, Lifecycle$State.STARTED, null, this, nb8VarM9609c3), 3);
    }

    /* JADX INFO: renamed from: R0 */
    public final df3 m9541R0() {
        return (df3) this.f32017C0.getValue(this, f32016I0[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C2758f m9542S0() {
        return (C2758f) this.f32019E0.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final C2750e m9543T0() {
        return (C2750e) this.f32018D0.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m9544U0(final LessonCard lessonCard, nb8 nb8Var, sc8 sc8Var) {
        final int i;
        String str;
        final ArrayList arrayList;
        final ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this;
        df3 df3VarM9541R0 = reviewActivityMultiAndClozeFragment.m9541R0();
        TextView textView = df3VarM9541R0.f35552d;
        TextView textView2 = df3VarM9541R0.f35550b;
        TextView textView3 = df3VarM9541R0.f35551c;
        TextView textView4 = df3VarM9541R0.f35555g;
        ImageButton imageButton = df3VarM9541R0.f35549a;
        View[] viewArr = reviewActivityMultiAndClozeFragment.f32021G0;
        final int i2 = 0;
        viewArr[0] = textView;
        TextView textView5 = df3VarM9541R0.f35554f;
        viewArr[1] = textView5;
        TextView textView6 = df3VarM9541R0.f35556h;
        int i3 = 2;
        viewArr[2] = textView6;
        TextView textView7 = df3VarM9541R0.f35553e;
        viewArr[3] = textView7;
        TextView[] textViewArr = reviewActivityMultiAndClozeFragment.f32020F0;
        textViewArr[0] = textView;
        textViewArr[1] = textView5;
        textViewArr[2] = textView6;
        textViewArr[3] = textView7;
        ArrayList arrayList2 = new ArrayList();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f47718a = "";
        if (nb8Var instanceof db8) {
            reviewActivityMultiAndClozeFragment.m9543T0().m9560V2(ReviewSettingsKeys.Cloze);
            textView4.setText(sc8Var != null ? AbstractC3352my.m17124i(u91.m22596N0(sc8Var.f60684b, "", null, null, new qv7(7), 30)) : null);
            textView2.setText("");
            if (sc8Var != null) {
                List list = sc8Var.f60685c;
                List list2 = list;
                if (!list2.isEmpty()) {
                    Random$Default random$Default = jq7.f46010a;
                    int iMo14353c = jq7.f46011b.mo14353c(0, list.size());
                    arrayList2.addAll(list2);
                    String str2 = ((db8) nb8Var).f35361b;
                    arrayList2.add(iMo14353c, str2);
                    ref$ObjectRef.f47718a = str2;
                }
                imageButton.setOnClickListener(new tr0(i3, reviewActivityMultiAndClozeFragment, sc8Var));
                if (fa4.m11650l(reviewActivityMultiAndClozeFragment.m9543T0().f32389v.getValue(), Boolean.TRUE)) {
                    jfa.m14429l(imageButton);
                } else {
                    jfa.m14425h(imageButton);
                }
                textView3.setText(reviewActivityMultiAndClozeFragment.m2111m(R$string.activities_select_missing_word));
            }
        } else if (nb8Var instanceof jb8) {
            reviewActivityMultiAndClozeFragment.m9543T0().m9560V2(ReviewSettingsKeys.MultipleChoice);
            reviewActivityMultiAndClozeFragment.m9543T0().m9561W2(ReviewSettingsKeys.MultipleChoiceFrontTransliteration);
            textView4.setText(AbstractC3352my.m17124i(lessonCard.f19178a));
            jb8 jb8Var = (jb8) nb8Var;
            arrayList2.addAll(jb8Var.f45383c);
            ref$ObjectRef.f47718a = jb8Var.f45382b;
            imageButton.setOnClickListener(new View.OnClickListener(reviewActivityMultiAndClozeFragment) { // from class: rb8

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReviewActivityMultiAndClozeFragment f59028b;

                {
                    this.f59028b = reviewActivityMultiAndClozeFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i2;
                    LessonCard lessonCard2 = lessonCard;
                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment2 = this.f59028b;
                    switch (i4) {
                        case 0:
                            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                        case 1:
                            bh4[] bh4VarArr2 = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                        default:
                            bh4[] bh4VarArr3 = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                    }
                }
            });
            jfa.m14429l(imageButton);
            textView3.setText(reviewActivityMultiAndClozeFragment.m2111m(R$string.activities_select_meaning));
        } else if (nb8Var instanceof kb8) {
            reviewActivityMultiAndClozeFragment.m9543T0().m9560V2(ReviewSettingsKeys.MultipleChoice);
            reviewActivityMultiAndClozeFragment.m9543T0().m9561W2(ReviewSettingsKeys.MultipleChoiceFrontTransliteration);
            TokenMeaning tokenMeaning = (TokenMeaning) u91.m22592J0(0, lessonCard.f19183f);
            textView4.setText((tokenMeaning == null || (str = tokenMeaning.f19596c) == null) ? "" : AbstractC3352my.m17124i(str));
            textView2.setText("");
            kb8 kb8Var = (kb8) nb8Var;
            arrayList2.addAll(kb8Var.f46980c);
            ref$ObjectRef.f47718a = kb8Var.f46979b;
            jfa.m14420c(imageButton);
            textView3.setText(reviewActivityMultiAndClozeFragment.m2111m(R$string.activities_select_meaning_match));
        } else if (nb8Var instanceof eb8) {
            reviewActivityMultiAndClozeFragment.m9543T0().m9560V2(ReviewSettingsKeys.Dictation);
            textView4.setText("");
            textView2.setText("");
            eb8 eb8Var = (eb8) nb8Var;
            arrayList2.addAll(eb8Var.f36983c);
            ref$ObjectRef.f47718a = eb8Var.f36982b;
            if (reviewActivityMultiAndClozeFragment.f32022H0) {
                i = 1;
            } else {
                sca.m21224J0(reviewActivityMultiAndClozeFragment.m9543T0(), lessonCard.f19178a, false, 12);
                i = 1;
                reviewActivityMultiAndClozeFragment.f32022H0 = true;
            }
            imageButton.setOnClickListener(new View.OnClickListener(reviewActivityMultiAndClozeFragment) { // from class: rb8

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReviewActivityMultiAndClozeFragment f59028b;

                {
                    this.f59028b = reviewActivityMultiAndClozeFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i;
                    LessonCard lessonCard2 = lessonCard;
                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment2 = this.f59028b;
                    switch (i4) {
                        case 0:
                            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                        case 1:
                            bh4[] bh4VarArr2 = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                        default:
                            bh4[] bh4VarArr3 = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                    }
                }
            });
            jfa.m14429l(imageButton);
            textView3.setText(reviewActivityMultiAndClozeFragment.m2111m(R$string.activities_select_word_hear));
        } else if (nb8Var instanceof fb8) {
            reviewActivityMultiAndClozeFragment.m9543T0().m9560V2(ReviewSettingsKeys.Dictation);
            textView4.setText("");
            textView2.setText("");
            fb8 fb8Var = (fb8) nb8Var;
            arrayList2.addAll(fb8Var.f38799c);
            ref$ObjectRef.f47718a = fb8Var.f38798b;
            if (!reviewActivityMultiAndClozeFragment.f32022H0) {
                sca.m21224J0(reviewActivityMultiAndClozeFragment.m9543T0(), lessonCard.f19178a, false, 12);
                reviewActivityMultiAndClozeFragment.f32022H0 = true;
            }
            final int i4 = 2;
            imageButton.setOnClickListener(new View.OnClickListener(reviewActivityMultiAndClozeFragment) { // from class: rb8

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReviewActivityMultiAndClozeFragment f59028b;

                {
                    this.f59028b = reviewActivityMultiAndClozeFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i4;
                    LessonCard lessonCard2 = lessonCard;
                    ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment2 = this.f59028b;
                    switch (i5) {
                        case 0:
                            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                        case 1:
                            bh4[] bh4VarArr2 = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                        default:
                            bh4[] bh4VarArr3 = ReviewActivityMultiAndClozeFragment.f32016I0;
                            sca.m21224J0(reviewActivityMultiAndClozeFragment2.m9543T0(), lessonCard2.f19178a, false, 12);
                            break;
                    }
                }
            });
            jfa.m14429l(imageButton);
            textView3.setText(reviewActivityMultiAndClozeFragment.m2111m(R$string.activities_select_word_meaning_hear));
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            final int i5 = i2;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            i2 = i5 + 1;
            if (i5 < 0) {
                vz1.m23628e0();
                throw null;
            }
            final String str3 = (String) next;
            if (fa4.m11650l(str3, "")) {
                arrayList = arrayList2;
                View view = viewArr[i5];
                if (view != null) {
                    view.setVisibility(4);
                }
            } else {
                TextView textView8 = textViewArr[i5];
                if (textView8 != null) {
                    textView8.setText(str3);
                }
                TextView textView9 = textViewArr[i5];
                arrayList = arrayList2;
                if (textView9 != null) {
                    textView9.setOnClickListener(new View.OnClickListener() { // from class: sb8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6;
                            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment2;
                            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                            ArrayList arrayList3 = arrayList;
                            int size = arrayList3.size();
                            int i7 = 0;
                            while (true) {
                                i6 = i5;
                                reviewActivityMultiAndClozeFragment2 = reviewActivityMultiAndClozeFragment;
                                if (i7 >= size) {
                                    break;
                                }
                                if (i7 == i6) {
                                    TextView textView10 = reviewActivityMultiAndClozeFragment2.f32020F0[i7];
                                    if (textView10 != null) {
                                        textView10.setSelected(!textView10.isSelected());
                                    }
                                } else {
                                    TextView textView11 = reviewActivityMultiAndClozeFragment2.f32020F0[i7];
                                    if (textView11 != null) {
                                        textView11.setSelected(false);
                                    }
                                }
                                i7++;
                            }
                            reviewActivityMultiAndClozeFragment2.m9542S0().f32483B.mo4677k(new dc8((String) arrayList3.get(i6), fa4.m11650l(str3, ref$ObjectRef.f47718a) ? ReviewActivityResult.Correct : ReviewActivityResult.Incorrect));
                        }
                    });
                }
            }
            reviewActivityMultiAndClozeFragment = this;
            arrayList2 = arrayList;
        }
    }
}
