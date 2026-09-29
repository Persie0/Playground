package com.lingq.feature.reader.old;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import coil.request.CachePolicy;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.designsystem.R$color;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.old.C2411m;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3550rv;
import p000.C3309ls;
import p000.C3509qs;
import p000.al3;
import p000.bh4;
import p000.cl9;
import p000.cq4;
import p000.cs4;
import p000.d04;
import p000.dr5;
import p000.dua;
import p000.fa4;
import p000.gr3;
import p000.h31;
import p000.hm5;
import p000.hz4;
import p000.jfa;
import p000.l70;
import p000.l9a;
import p000.lda;
import p000.mq7;
import p000.or1;
import p000.p58;
import p000.qx7;
import p000.rt3;
import p000.rx7;
import p000.u91;
import p000.ui3;
import p000.ux5;
import p000.vk9;
import p000.vx7;
import p000.w41;
import p000.wfb;
import p000.xx7;
import p000.xz7;
import p000.y38;
import p000.ye3;
import p000.yx7;
import p000.zi8;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReaderPageFragment extends rt3 {

    /* JADX INFO: renamed from: C0 */
    public final C3309ls f28441C0;

    /* JADX INFO: renamed from: D0 */
    public final w41 f28442D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f28443E0;

    /* JADX INFO: renamed from: F0 */
    public LessonTextView f28444F0;

    /* JADX INFO: renamed from: G0 */
    public ActionMode f28445G0;

    /* JADX INFO: renamed from: H0 */
    public final int f28446H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f28447I0;

    /* JADX INFO: renamed from: J0 */
    public hm5 f28448J0;

    /* JADX INFO: renamed from: K0 */
    public C3509qs f28449K0;

    /* JADX INFO: renamed from: L0 */
    public final Regex f28450L0;

    /* JADX INFO: renamed from: M0 */
    public xz7 f28451M0;

    /* JADX INFO: renamed from: N0 */
    public final xx7 f28452N0;

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ bh4[] f28440O0 = {new PropertyReference1Impl(ReaderPageFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentReaderPageBinding;")};
    public static final vx7 Companion = new vx7();

    public ReaderPageFragment() {
        super(R$layout.fragment_reader_page, 13);
        this.f28441C0 = jfa.m14432o(this, ReaderPageFragment$binding$2.f28453i);
        final hz4 hz4Var = new hz4(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f28442D0 = new w41(y38.m24933a(C2412n.class), new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$4
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f28595b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$3
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
        final ReaderPageFragment$special$$inlined$viewModels$default$5 readerPageFragment$special$$inlined$viewModels$default$5 = new ReaderPageFragment$special$$inlined$viewModels$default$5(this);
        final cs4 cs4VarM15357b2 = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) readerPageFragment$special$$inlined$viewModels$default$5.mo0a();
            }
        });
        this.f28443E0 = new w41(y38.m24933a(C2411m.class), new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b2.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$9
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f28601b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.ReaderPageFragment$special$$inlined$viewModels$default$8
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
        this.f28446H0 = 80;
        this.f28450L0 = new Regex("IMG_\\d+_READ");
        this.f28452N0 = new xx7(this);
    }

    /* JADX INFO: renamed from: R0 */
    public static final xz7 m9293R0(ReaderPageFragment readerPageFragment) {
        int i;
        int iMax;
        LessonTextView lessonTextView = readerPageFragment.f28444F0;
        if (lessonTextView == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        if (lessonTextView.isFocused()) {
            LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
            if (lessonTextView2 == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            int selectionStart = lessonTextView2.getSelectionStart();
            LessonTextView lessonTextView3 = readerPageFragment.f28444F0;
            if (lessonTextView3 == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            int selectionEnd = lessonTextView3.getSelectionEnd();
            int iMax2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            iMax = Math.max(0, Math.max(selectionStart, selectionEnd));
            i = iMax2;
        } else {
            i = 0;
            iMax = 0;
        }
        LessonTextView lessonTextView4 = readerPageFragment.f28444F0;
        if (lessonTextView4 != null) {
            return new xz7(i, iMax, 0, 0, lessonTextView4.getText().subSequence(i, iMax).toString(), 0, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262124);
        }
        fa4.m11636J("tvContent");
        throw null;
    }

    /* JADX INFO: renamed from: S0 */
    public static final void m9294S0(ReaderPageFragment readerPageFragment, String str, SpannableString spannableString) {
        String str2;
        al3 al3Var = new al3(Regex.m15422c(readerPageFragment.f28450L0, str));
        while (al3Var.hasNext()) {
            dr5 dr5Var = (dr5) al3Var.next();
            spannableString.setSpan(new ForegroundColorSpan(0), dr5Var.m10611b().f40379a, dr5Var.m10611b().f40380b + 1, 33);
            String strM10612c = dr5Var.m10612c();
            Integer numM4844a0 = cl9.m4844a0(vk9.m23371G0(vk9.m23368D0(strM10612c, "_", strM10612c), "_"));
            if (numM4844a0 != null && (str2 = (String) ((Map) readerPageFragment.m9299X0().f29242k0.getValue()).get(numM4844a0)) != null) {
                try {
                    LessonTextView lessonTextView = readerPageFragment.f28444F0;
                    if (lessonTextView == null) {
                        fa4.m11636J("tvContent");
                        throw null;
                    }
                    if ((lessonTextView.getWidth() - jfa.m14419b(readerPageFragment.m2090R(), readerPageFragment.f28446H0)) - readerPageFragment.m2090R().getResources().getDimensionPixelSize(R$dimen.activity_horizontal_margin) > 0.0f) {
                        int iM14419b = (int) jfa.m14419b(readerPageFragment.m2090R(), 200);
                        d04 d04Var = new d04(readerPageFragment.m2090R());
                        d04Var.f34778c = str2;
                        d04Var.f34788m = CachePolicy.ENABLED;
                        d04Var.m9962c(iM14419b, iM14419b);
                        d04Var.f34781f = l70.m15918I(AbstractC3550rv.m20852t0(new l9a[]{new zi8(32.0f)}));
                        d04Var.f34786k = Boolean.FALSE;
                        d04Var.f34779d = new mq7(spannableString, readerPageFragment, dr5Var, 2);
                        d04Var.m9961b();
                        p58.m18903m(readerPageFragment.m2090R()).m4951b(d04Var.m9960a());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: G */
    public final void mo2080G() {
        this.f5688b0 = true;
        m9299X0().mo8482P();
        m9296U0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        C2411m c2411mM9299X0 = m9299X0();
        c2411mM9299X0.getClass();
        wfb.m23926u(lda.m16103C(c2411mM9299X0), null, null, new ReaderPageViewModel$fetchTtsForPage$1(c2411mM9299X0, null), 3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        String string;
        String string2;
        String string3;
        view.getClass();
        Bundle bundle = this.f5695f;
        String str = "";
        if (bundle == null || (string = bundle.getString("lessonTitle")) == null) {
            string = "";
        }
        Bundle bundle2 = this.f5695f;
        if (bundle2 == null || (string2 = bundle2.getString("collectionTitle")) == null) {
            string2 = "";
        }
        Bundle bundle3 = this.f5695f;
        if (bundle3 != null && (string3 = bundle3.getString("lessonImage")) != null) {
            str = string3;
        }
        Bundle bundle4 = this.f5695f;
        int i = 0;
        boolean z = bundle4 != null ? bundle4.getBoolean("isSentenceMode") : false;
        Bundle bundle5 = this.f5695f;
        final int i2 = bundle5 != null ? bundle5.getInt("pagePosition") : 0;
        final ye3 ye3VarM9297V0 = m9297V0();
        NestedScrollView nestedScrollView = ye3VarM9297V0.f69718i;
        ImageButton imageButton = ye3VarM9297V0.f69715f;
        RelativeLayout relativeLayout = ye3VarM9297V0.f69725p;
        TextView textView = ye3VarM9297V0.f69713d;
        NestedScrollView nestedScrollView2 = ye3VarM9297V0.f69726q;
        cq4 cq4Var = ye3VarM9297V0.f69724o;
        RelativeLayout relativeLayout2 = (RelativeLayout) cq4Var.f34380d;
        LinearLayout linearLayout = (LinearLayout) cq4Var.f34382f;
        boolean z2 = z;
        nestedScrollView.setOnTouchListener(new qx7(this, i));
        nestedScrollView2.setOnTouchListener(new qx7(this, 1));
        ye3VarM9297V0.f69717h.setOnTouchListener(new qx7(this, 2));
        yx7 yx7Var = new yx7();
        ye3 ye3VarM9297V1 = m9297V0();
        this.f28444F0 = z2 ? ye3VarM9297V1.f69720k : ye3VarM9297V1.f69719j;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(20);
        layoutParams2.addRule(17, R$id.iv_lesson);
        linearLayout.setLayoutParams(layoutParams2);
        if (z2) {
            ComposeView composeView = m9297V0().f69723n;
            composeView.setViewCompositionStrategy(C0411w.f4868a);
            composeView.setContent(new C0282a(804902768, true, new rx7(this, 1)));
            jfa.m14429l(nestedScrollView2);
            jfa.m14425h(relativeLayout);
            jfa.m14425h(relativeLayout2);
            Boolean bool = (Boolean) m9298W0().f29324V1.getValue();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            ConstraintLayout constraintLayout = ye3VarM9297V0.f69727r;
            if (zBooleanValue) {
                jfa.m14429l(constraintLayout);
            } else {
                jfa.m14425h(constraintLayout);
            }
            jfa.m14429l(textView);
            textView.setText(m2111m(R$string.lesson_show_translation));
            jfa.m14425h(ye3VarM9297V0.f69722m);
            final int i3 = 0;
            ye3VarM9297V0.f69716g.setOnClickListener(new View.OnClickListener(this) { // from class: tx7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReaderPageFragment f63059b;

                {
                    this.f63059b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i4 = i3;
                    int i5 = i2;
                    ReaderPageFragment readerPageFragment = this.f63059b;
                    switch (i4) {
                        case 0:
                            vx7 vx7Var = ReaderPageFragment.Companion;
                            readerPageFragment.m9298W0().m9335o3(i5, 1.0f);
                            break;
                        default:
                            vx7 vx7Var2 = ReaderPageFragment.Companion;
                            readerPageFragment.m9298W0().m9335o3(i5, ((Number) ((C3244l) readerPageFragment.m9299X0().f29216U.f9311a).getValue()).floatValue());
                            break;
                    }
                }
            });
            final int i4 = 1;
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: tx7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReaderPageFragment f63059b;

                {
                    this.f63059b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i4;
                    int i6 = i2;
                    ReaderPageFragment readerPageFragment = this.f63059b;
                    switch (i5) {
                        case 0:
                            vx7 vx7Var = ReaderPageFragment.Companion;
                            readerPageFragment.m9298W0().m9335o3(i6, 1.0f);
                            break;
                        default:
                            vx7 vx7Var2 = ReaderPageFragment.Companion;
                            readerPageFragment.m9298W0().m9335o3(i6, ((Number) ((C3244l) readerPageFragment.m9299X0().f29216U.f9311a).getValue()).floatValue());
                            break;
                    }
                }
            });
            imageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: ux7
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    vx7 vx7Var = ReaderPageFragment.Companion;
                    final ReaderPageFragment readerPageFragment = this.f64489a;
                    C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
                    c2411mM9299X0.getClass();
                    Set setM20855w0 = AbstractC3550rv.m20855w0(new Float[]{Float.valueOf(0.5f), Float.valueOf(0.66f), Float.valueOf(0.75f), Float.valueOf(0.9f), Float.valueOf(1.0f), Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(1.75f), Float.valueOf(2.0f)});
                    String[] strArr = {"0.5x", "0.66x", "0.75x", "0.9x", "1x", "1.1x", "1.25x", "1.5x", "1.75x", "2x"};
                    c18 c18Var = c2411mM9299X0.f29216U;
                    int iM22593K0 = setM20855w0.contains(((C3244l) c18Var.f9311a).getValue()) ? u91.m22593K0(setM20855w0, ((C3244l) c18Var.f9311a).getValue()) : 4;
                    final Set set = setM20855w0;
                    fr5 fr5VarM12027j = new fr5(readerPageFragment.m2090R(), 0).m12027j(readerPageFragment.m2111m(com.lingq.feature.reader.R$string.audio_speed));
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.lingq.feature.reader.old.i
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            vx7 vx7Var2 = ReaderPageFragment.Companion;
                            C2411m c2411mM9299X1 = readerPageFragment.m9299X0();
                            float fFloatValue = ((Number) u91.m22586D0(set, i5)).floatValue();
                            c2411mM9299X1.getClass();
                            wfb.m23926u(lda.m16103C(c2411mM9299X1), null, null, new ReaderPageViewModel$setPlaybackRate$1(c2411mM9299X1, fFloatValue, null), 3);
                            dialogInterface.dismiss();
                        }
                    };
                    C3681vd c3681vd = fr5VarM12027j.f71376a;
                    c3681vd.f65219q = strArr;
                    c3681vd.f65221s = onClickListener;
                    c3681vd.f65224v = iM22593K0;
                    c3681vd.f65223u = true;
                    fr5VarM12027j.m25557a();
                    return true;
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.reader.old.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    vx7 vx7Var = ReaderPageFragment.Companion;
                    ReaderPageFragment readerPageFragment = this.f29194a;
                    if (!readerPageFragment.m9298W0().f29340b.mo4595s1()) {
                        readerPageFragment.m9298W0().mo3737M1(UpgradeReason.SENTENCES_TRANSLATIONS);
                        return;
                    }
                    ye3 ye3Var = ye3VarM9297V0;
                    TextView textView2 = ye3Var.f69722m;
                    ImageView imageView = ye3Var.f69711b;
                    boolean z3 = textView2.getVisibility() == 0;
                    TextView textView3 = ye3Var.f69713d;
                    if (z3) {
                        textView3.setText(readerPageFragment.m2111m(R$string.lesson_show_translation));
                        jfa.m14425h(textView2);
                        jfa.m14425h(imageView);
                        return;
                    }
                    textView3.setText(readerPageFragment.m2111m(R$string.lesson_hide_translation));
                    jfa.m14429l(textView2);
                    if (((Boolean) ((C3244l) readerPageFragment.m9298W0().f29390n1.f9311a).getValue()).booleanValue()) {
                        jfa.m14429l(imageView);
                    }
                    C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
                    int iM9332l3 = readerPageFragment.m9298W0().m9332l3();
                    c2411mM9299X0.getClass();
                    AbstractC1263a.m7047b(lda.m16103C(c2411mM9299X0), c2411mM9299X0.f29247o, "sentenceTranslation", new ReaderPageViewModel$prepareSentenceTranslation$1(c2411mM9299X0, iM9332l3, null));
                    hm5 hm5Var = readerPageFragment.f28448J0;
                    if (hm5Var != null) {
                        ((C1240a) hm5Var).m7025f("Sentence translation viewed", null);
                    } else {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                }
            });
            ye3VarM9297V0.f69711b.setOnClickListener(new h31(this, 8));
        } else {
            jfa.m14423f(cq4Var.f34381e, str, 6);
            jfa.m14425h(nestedScrollView2);
            jfa.m14425h(relativeLayout2);
            jfa.m14429l(relativeLayout);
            cq4Var.f34378b.setText(string);
            cq4Var.f34377a.setText(string2);
        }
        LessonTextView lessonTextView = this.f28444F0;
        if (lessonTextView == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView.setTextDirection(2);
        LessonTextView lessonTextView2 = this.f28444F0;
        if (lessonTextView2 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView2.setLayerType(2, null);
        LessonTextView lessonTextView3 = this.f28444F0;
        if (lessonTextView3 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView3.setHighlightColor(m2090R().getColor(R$color.transparent));
        LessonTextView lessonTextView4 = this.f28444F0;
        if (lessonTextView4 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView4.setCustomSelectionActionModeCallback(this.f28452N0);
        if (z2) {
            C2411m c2411mM9299X0 = m9299X0();
            int iM9332l3 = m9298W0().m9332l3();
            c2411mM9299X0.getClass();
            AbstractC1263a.m7047b(lda.m16103C(c2411mM9299X0), c2411mM9299X0.f29247o, ux5.m22988k(c2411mM9299X0.f29249q, "sentenceNotes "), new ReaderPageViewModel$sentenceNotes$1(c2411mM9299X0, iM9332l3, null));
        }
        LessonTextView lessonTextView5 = this.f28444F0;
        if (lessonTextView5 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView5.setSpannableFactory(yx7Var);
        int i5 = i2;
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2326x1aac7745(this, Lifecycle$State.STARTED, null, this, i5), 3);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2325x2988cfe8(this, Lifecycle$State.RESUMED, null, this, i5), 3);
    }

    /* JADX INFO: renamed from: T0 */
    public final Rect m9295T0(xz7 xz7Var, boolean z) {
        int length;
        int length2;
        Rect rect = new Rect();
        LessonTextView lessonTextView = this.f28444F0;
        if (lessonTextView == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        Layout layout = lessonTextView.getLayout();
        if (layout == null) {
            return rect;
        }
        int i = xz7Var.f69004a;
        LessonTextView lessonTextView2 = this.f28444F0;
        if (lessonTextView2 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        if (i >= lessonTextView2.getText().length()) {
            LessonTextView lessonTextView3 = this.f28444F0;
            if (lessonTextView3 == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            length = lessonTextView3.getText().length();
        } else {
            length = xz7Var.f69004a;
        }
        double d = length;
        int i2 = xz7Var.f69005b;
        LessonTextView lessonTextView4 = this.f28444F0;
        if (lessonTextView4 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        if (i2 >= lessonTextView4.getText().length()) {
            LessonTextView lessonTextView5 = this.f28444F0;
            if (lessonTextView5 == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            length2 = lessonTextView5.getText().length();
        } else {
            length2 = xz7Var.f69005b;
        }
        double d2 = length2;
        int i3 = (int) d;
        double primaryHorizontal = layout.getPrimaryHorizontal(i3);
        int i4 = (int) d2;
        double primaryHorizontal2 = layout.getPrimaryHorizontal(i4);
        int lineForOffset = layout.getLineForOffset(i3);
        layout.getLineForOffset(i4);
        layout.getLineBounds(lineForOffset, rect);
        int[] iArr = {0, 0};
        LessonTextView lessonTextView6 = this.f28444F0;
        if (lessonTextView6 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        lessonTextView6.getLocationOnScreen(iArr);
        rect.bottom = (int) ((((double) (layout.getLineBaseline(lineForOffset) - rect.top)) / 3.0d) + ((double) layout.getLineBaseline(lineForOffset)));
        int i5 = iArr[1];
        LessonTextView lessonTextView7 = this.f28444F0;
        if (lessonTextView7 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        int scrollY = i5 - lessonTextView7.getScrollY();
        rect.top += scrollY;
        rect.bottom += scrollY;
        int i6 = rect.left;
        double d3 = ((double) iArr[0]) + primaryHorizontal;
        LessonTextView lessonTextView8 = this.f28444F0;
        if (lessonTextView8 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        double compoundPaddingLeft = d3 + ((double) lessonTextView8.getCompoundPaddingLeft());
        LessonTextView lessonTextView9 = this.f28444F0;
        if (lessonTextView9 == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        int scrollX = i6 + ((int) (compoundPaddingLeft - ((double) lessonTextView9.getScrollX())));
        rect.left = scrollX;
        rect.right = (int) ((((double) scrollX) + primaryHorizontal2) - primaryHorizontal);
        int i7 = rect.top;
        return z ? new Rect(rect.right, i7, scrollX, rect.bottom) : new Rect(scrollX, i7, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m9296U0() {
        ActionMode actionMode = this.f28445G0;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final ye3 m9297V0() {
        return (ye3) this.f28441C0.getValue(this, f28440O0[0]);
    }

    /* JADX INFO: renamed from: W0 */
    public final C2412n m9298W0() {
        return (C2412n) this.f28442D0.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    public final C2411m m9299X0() {
        return (C2411m) this.f28443E0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX INFO: renamed from: Y0 */
    public final void m9300Y0(boolean z, MotionEvent motionEvent) {
        if (!z) {
            m9298W0().mo8747U1();
        }
        LessonTextView lessonTextView = this.f28444F0;
        if (lessonTextView == null) {
            fa4.m11636J("tvContent");
            throw null;
        }
        int i = 1;
        boolean z2 = lessonTextView.getLayoutDirection() == 1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f28447I0 = true;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (motionEvent.getHistorySize() <= 0 || ((int) Math.abs(motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0))) <= 5) {
                    return;
                }
                this.f28447I0 = false;
                return;
            }
            if (actionMasked != 3) {
                this.f28447I0 = false;
                return;
            }
        }
        if (this.f28447I0) {
            float x = motionEvent.getX();
            LessonTextView lessonTextView2 = this.f28444F0;
            if (lessonTextView2 == null) {
                fa4.m11636J("tvContent");
                throw null;
            }
            float width = lessonTextView2.getWidth();
            Context contextM2090R = m2090R();
            int i2 = this.f28446H0;
            if (x > width - jfa.m14419b(contextM2090R, i2)) {
                if (z2) {
                    i = -1;
                }
            } else if (motionEvent.getX() >= jfa.m14419b(m2090R(), i2)) {
                i = 0;
            } else if (!z2) {
                i = -1;
            }
            if (i == 0 || !((Boolean) m9298W0().f29339a2.getValue()).booleanValue()) {
                m9298W0().mo8747U1();
            } else {
                m9298W0().mo8774r2(i);
            }
            this.f28447I0 = false;
        }
    }
}
