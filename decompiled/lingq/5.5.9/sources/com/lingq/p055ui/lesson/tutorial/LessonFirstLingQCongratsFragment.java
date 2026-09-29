package com.lingq.p055ui.lesson.tutorial;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C7076b;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p155he.C6041e;
import p225kk.C6716m;
import p260m8.C7499b;
import p265mj.C7569c;
import p265mj.C7570d;
import p338qd.C8573r0;
import p344qj.AbstractC8638c;
import p344qj.C8636a;
import p385sf.C9000b;
import p427v3.AbstractC9634a;
import ph.C8386y1;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/tutorial/LessonFirstLingQCongratsFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonFirstLingQCongratsFragment extends AbstractC8638c {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29187S0 = {C0204c.m857q(LessonFirstLingQCongratsFragment.class, "getBinding()Lcom/lingq/databinding/FragmentTooltipsFirstLingqBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f29188Q0 = C4924a.m10477o0(this, LessonFirstLingQCongratsFragment$binding$2.f29192j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f29189R0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC4458a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f29190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonFirstLingQCongratsFragment f29191b;

        public ViewTreeObserverOnGlobalLayoutListenerC4458a(TextView textView, LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment) {
            this.f29190a = textView;
            this.f29191b = lessonFirstLingQCongratsFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.f29190a;
            if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                return;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFirstLingQCongratsFragment.f29187S0;
            LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = this.f29191b;
            lessonFirstLingQCongratsFragment.getClass();
            try {
                String strM3600t = lessonFirstLingQCongratsFragment.m3600t(R.string.tooltips_first_lingq_blue);
                C5207g.m11110e(strM3600t, "getString(R.string.tooltips_first_lingq_blue)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C7661i.m15254T2(strM3600t, "*", ""));
                lessonFirstLingQCongratsFragment.m10229u0().f45477d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                lessonFirstLingQCongratsFragment.m10229u0().f45477d.invalidate();
                int iM14285e3 = C7076b.m14285e3(strM3600t, "**", 0, false, 6) - 2;
                int iM14288h3 = C7076b.m14288h3(strM3600t, "**", 6) - 4;
                int i10 = iM14285e3 < 0 ? 0 : iM14285e3;
                int i11 = iM14288h3 < 0 ? 0 : iM14288h3;
                int iM14285e4 = C7076b.m14285e3(strM3600t, "*", 0, false, 6);
                int iM14288h4 = C7076b.m14288h3(C7661i.m15254T2(strM3600t, "**", ""), "*", 6) - 1;
                String strSubstring = C7661i.m15254T2(strM3600t, "*", "").substring(i10, i11);
                C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (iM14285e4 < 0) {
                    iM14285e4 = 0;
                }
                if (iM14288h4 < 0) {
                    iM14288h4 = 0;
                }
                String strSubstring2 = C7661i.m15254T2(strM3600t, "*", "").substring(iM14285e4, iM14288h4);
                C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                spannableStringBuilder.setSpan(new C8636a(lessonFirstLingQCongratsFragment.m3578a0(), lessonFirstLingQCongratsFragment.m10229u0().f45477d.getLayout(), C9000b.m17252r(new C7569c(R.attr.blueWordColor, ViewsUtilsKt.m10419e(WordStatus.New.getValue()), R.attr.blueWordColor, new C7570d(iM14285e4, iM14288h4, 0, 0, strSubstring2, 0, 0, 0, null, null, null, 0, 16364), true, 0, 336), new C7569c(R.attr.yellowWordColor, ViewsUtilsKt.m10417c(1, null), R.attr.yellowWordBorderColor, new C7570d(i10, i11, 0, 0, strSubstring, 0, 0, 0, null, null, null, 0, 16364), true, CardStatus.Recognized.getValue(), 80))), 0, spannableStringBuilder.length(), 33);
                lessonFirstLingQCongratsFragment.m10229u0().f45477d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            } catch (Exception e10) {
                C6041e.m12476a().m12477b(e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$1] */
    public LessonFirstLingQCongratsFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f29189R0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonFirstLingQCongratsViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_tooltips_first_lingq, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        Dialog dialog = this.f6328G0;
        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM8602w = BottomSheetBehavior.m8602w(viewFindViewById);
            C5207g.m11110e(bottomSheetBehaviorM8602w, "from(it)");
            DisplayMetrics displayMetrics = m3599s().getDisplayMetrics();
            int i10 = displayMetrics.heightPixels;
            List<Integer> list = C6716m.f37937a;
            bottomSheetBehaviorM8602w.m8605C(i10 - ((int) C6716m.m13316a(200)));
            RelativeLayout relativeLayout = m10229u0().f45474a;
            C5207g.m11110e(relativeLayout, "binding.root");
            C4924a.m10444W(relativeLayout, displayMetrics.heightPixels - ((int) C6716m.m13316a(200)));
        }
        C8386y1 c8386y1M10229u0 = m10229u0();
        c8386y1M10229u0.f45478e.setOnClickListener(new ViewOnClickListenerC2238x(21, this));
        c8386y1M10229u0.f45475b.setOnClickListener(new ViewOnClickListenerC2239y(28, this));
        List<Integer> list2 = C6716m.f37937a;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C6716m.m13333r(R.attr.colorSecondaryVariant, m3578a0()));
        String strM3600t = m3600t(R.string.tooltips_first_lingq_congrats);
        C5207g.m11110e(strM3600t, "getString(R.string.tooltips_first_lingq_congrats)");
        int iM14285e3 = C7076b.m14285e3(strM3600t, "**", 0, false, 6);
        int iM14288h3 = C7076b.m14288h3(strM3600t, "**", 6) - 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C7661i.m15254T2(strM3600t, "**", ""));
        try {
            spannableStringBuilder.setSpan(foregroundColorSpan, iM14285e3, iM14288h3, 0);
            m10229u0().f45476c.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        }
        TextView textView = c8386y1M10229u0.f45477d;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC4458a(textView, this));
        C7828f.m15570d(C7499b.m14906H(this), null, null, new LessonFirstLingQCongratsFragment$onViewCreated$3(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$onViewCreated$4
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFirstLingQCongratsFragment.f29187S0;
                ((LessonFirstLingQCongratsViewModel) this.f29196b.f29189R0.getValue()).mo9731b0(true);
                return C9072e.f47360a;
            }
        });
        ((LessonFirstLingQCongratsViewModel) this.f29189R0.getValue()).mo9723I(TooltipStep.FirstLingQ);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX INFO: renamed from: u0 */
    public final C8386y1 m10229u0() {
        return (C8386y1) this.f29188Q0.m10489a(this, f29187S0[0]);
    }
}
