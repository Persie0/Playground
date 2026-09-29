package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.p055ui.lesson.data.StaticLayoutTextView;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import mo.C7661i;
import no.InterfaceC7882z;
import p096ei.C5408a;
import p160hj.C6069o;
import p182ij.C6337a;
import p225kk.C6716m;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8274e0;
import ph.C8347q2;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$6", m19206f = "LessonFragment.kt", m19207l = {618}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27309e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27310f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$6$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lhj/o;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$6$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42171 extends SuspendLambda implements InterfaceC2056p<C6069o, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27311e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27312f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$6$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27313a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C6069o f27314b;

            public a(LessonFragment lessonFragment, C6069o c6069o) {
                this.f27313a = lessonFragment;
                this.f27314b = c6069o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Collection collection;
                C7570d c7570d;
                int i10;
                int i11;
                int i12;
                LessonFragment lessonFragment = this.f27313a;
                if (lessonFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                    C6069o c6069o = this.f27314b;
                    LessonStudy lessonStudy = c6069o.f35783a;
                    C8274e0 c8274e0M10107o0 = lessonFragment.m10107o0();
                    int dimensionPixelSize = lessonFragment.m3599s().getDimensionPixelSize(R.dimen.list_vertical_margin) * 2;
                    float measuredWidth = c8274e0M10107o0.f44701l.getMeasuredWidth();
                    ViewPager2 viewPager2 = c8274e0M10107o0.f44701l;
                    float f3 = dimensionPixelSize;
                    float measuredHeight = viewPager2.getMeasuredHeight() - f3;
                    if (measuredWidth < 0.0f || measuredHeight < 0.0f) {
                        measuredWidth = viewPager2.getWidth();
                        measuredHeight = viewPager2.getHeight() - f3;
                    }
                    C8347q2 c8347q2 = c8274e0M10107o0.f44696g;
                    ((RelativeLayout) c8347q2.f45173e).setVisibility(4);
                    ImageView imageView = c8347q2.f45169a;
                    imageView.setVisibility(4);
                    MaterialButton materialButton = c8274e0M10107o0.f44691b;
                    materialButton.setVisibility(4);
                    c8347q2.f45171c.setText(lessonStudy.f21816b);
                    c8347q2.f45170b.setText(lessonStudy.f21823i);
                    C4924a.m10438Q(imageView, lessonStudy.f21819e, 0.0f, 0, 0, 14);
                    LinearLayout linearLayout = (LinearLayout) c8347q2.f45174f;
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    C5207g.m11109d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.removeRule(20);
                    layoutParams2.addRule(17, R.id.iv_lesson);
                    linearLayout.setLayoutParams(layoutParams2);
                    RelativeLayout relativeLayout = (RelativeLayout) c8347q2.f45173e;
                    int i13 = (int) measuredWidth;
                    relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(i13, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight2 = relativeLayout.getMeasuredHeight();
                    StaticLayoutTextView staticLayoutTextView = c8274e0M10107o0.f44698i;
                    C5207g.m11110e(staticLayoutTextView, "lessonPageStatic");
                    ViewGroup.LayoutParams layoutParams3 = staticLayoutTextView.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = lessonFragment.m3599s().getDimensionPixelSize(R.dimen.list_vertical_margin) + measuredHeight2;
                    staticLayoutTextView.setLayoutParams(layoutParams4);
                    relativeLayout.setVisibility(8);
                    imageView.setVisibility(8);
                    materialButton.measure(View.MeasureSpec.makeMeasureSpec(i13, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight3 = materialButton.getMeasuredHeight();
                    materialButton.setVisibility(8);
                    Context contextM3578a0 = lessonFragment.m3578a0();
                    C6337a c6337a = new C6337a(contextM3578a0);
                    String strMo498E1 = lessonFragment.m10109q0().mo498E1();
                    C5207g.m11111f(strMo498E1, "language");
                    c6337a.f36641g = strMo498E1;
                    c6337a.f36639e = measuredHeight2;
                    c6337a.f36640f = measuredHeight3;
                    c6337a.f36636b = measuredWidth;
                    c6337a.f36637c = measuredHeight;
                    StaticLayoutTextView staticLayoutTextView2 = lessonFragment.m10107o0().f44698i;
                    C5207g.m11110e(staticLayoutTextView2, "binding.lessonPageStatic");
                    String str = c6069o.f35784b;
                    C5207g.m11111f(str, "fullText");
                    String str2 = c6069o.f35793k;
                    C5207g.m11111f(str2, "japaneseScript");
                    String str3 = c6069o.f35792j;
                    C5207g.m11111f(str3, "chineseTraditionalScript");
                    String str4 = c6069o.f35794l;
                    C5207g.m11111f(str4, "cantoneseScript");
                    String str5 = c6069o.f35791i;
                    C5207g.m11111f(str5, "mandarinScript");
                    LessonFont lessonFont = c6069o.f35786d;
                    C5207g.m11111f(lessonFont, "lessonFont");
                    float f10 = c6337a.f36636b;
                    ArrayList arrayList = c6337a.f36638d;
                    if (f10 > 0.0f) {
                        double d10 = c6069o.f35788f;
                        c6337a.f36645k = d10;
                        c6337a.f36643i = c6069o.f35789g;
                        String str6 = c6337a.f36641g;
                        if (C5207g.m11106a(str6, C5408a.m11569b(LanguageLearn.Japanese))) {
                            c6337a.f36645k = d10 < 0.65d ? 0.65d : d10;
                        } else if (C5207g.m11106a(str6, C5408a.m11569b(LanguageLearn.Mandarin))) {
                            c6337a.f36645k = d10 < 0.65d ? 0.65d : d10;
                            str2 = str5;
                        } else if (C5207g.m11106a(str6, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                            c6337a.f36645k = d10 < 0.65d ? 0.65d : d10;
                            str2 = str3;
                        } else if (C5207g.m11106a(str6, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                            c6337a.f36645k = d10 < 0.65d ? 0.65d : d10;
                            str2 = str4;
                        } else {
                            str2 = "Off";
                        }
                        c6337a.f36646l = str2;
                        c6337a.f36647m = c6069o.f35787e;
                        c6337a.f36644j = lessonFont;
                        boolean z10 = c6069o.f35790h;
                        c6337a.f36642h = z10;
                        if (z10) {
                            arrayList.addAll(C7076b.m14299s3(str, new String[]{"***--ENDOFSENTENCE--***"}, 0, 6));
                        } else {
                            c6337a.f36648n = str;
                        }
                        int dimensionPixelSize2 = contextM3578a0.getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin) * 2;
                        String str7 = c6337a.f36648n;
                        int i14 = c6337a.f36647m;
                        float f11 = c6337a.f36636b - dimensionPixelSize2;
                        float f12 = (float) d10;
                        C5207g.m11111f(str7, "text");
                        TextPaint textPaint = new TextPaint();
                        List<Integer> list = C6716m.f37937a;
                        textPaint.setTextSize(C6716m.m13331p(i14));
                        textPaint.setColor(staticLayoutTextView2.getContext().getColor(R.color.red));
                        textPaint.setAntiAlias(true);
                        Context context = staticLayoutTextView2.getContext();
                        C5207g.m11110e(context, "context");
                        textPaint.setTypeface(C4924a.m10475n0(lessonFont, context));
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        float fM13331p = C6716m.m13331p(i14);
                        C5207g.m11111f(alignment, "alignment");
                        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str7, 0, str7.length(), textPaint, (int) f11);
                        builderObtain.setAlignment(alignment);
                        builderObtain.setLineSpacing(fM13331p, f12);
                        builderObtain.setIncludePad(false);
                        builderObtain.setHyphenationFrequency(0);
                        builderObtain.setBreakStrategy(0);
                        StaticLayout staticLayoutBuild = builderObtain.build();
                        C5207g.m11110e(staticLayoutBuild, "obtain(source, 0, source…EGY_SIMPLE)\n    }.build()");
                        staticLayoutTextView2.textContainer = staticLayoutBuild;
                        staticLayoutTextView2.invalidate();
                        c6337a.f36635a = staticLayoutTextView2.getTextContainer();
                    }
                    List<C7570d> list2 = c6069o.f35785c;
                    C5207g.m11111f(list2, "fullTextObjects");
                    if (c6337a.f36636b <= 0.0f) {
                        collection = EmptyList.f38032a;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        StaticLayout staticLayout = c6337a.f36635a;
                        if (staticLayout != null) {
                            int lineCount = staticLayout.getLineCount();
                            int dimensionPixelSize3 = contextM3578a0.getResources().getDimensionPixelSize(R.dimen.list_vertical_margin) * 2;
                            float f13 = c6337a.f36639e;
                            float f14 = dimensionPixelSize3;
                            float f15 = (c6337a.f36637c - f13) - f14;
                            if (c6337a.f36642h) {
                                int size = arrayList.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    String strSubstring = (String) arrayList.get(i15);
                                    if (C7661i.m15256V2(strSubstring, "\n\n", false)) {
                                        strSubstring = strSubstring.substring(1, strSubstring.length());
                                        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    int length = strSubstring.length() + c6337a.f36650p;
                                    ArrayList arrayList3 = new ArrayList();
                                    while (c6337a.f36651q < list2.size() && (i10 = (c7570d = list2.get(c6337a.f36651q)).f41721a) >= (i11 = c6337a.f36650p) && (i12 = c7570d.f41722b) <= length) {
                                        c7570d.f41721a = i10 - i11;
                                        c7570d.f41722b = i12 - i11;
                                        c7570d.f41733m = arrayList2.size();
                                        arrayList3.add(c7570d);
                                        c6337a.f36649o.put(Integer.valueOf(c6337a.f36651q), c7570d);
                                        c6337a.f36651q++;
                                    }
                                    arrayList2.add(new C7567a(arrayList2.isEmpty(), strSubstring, arrayList3, i15 == arrayList.size() - 1, c6337a.f36644j, c6337a.f36645k, c6337a.f36647m, c6337a.f36643i, c6337a.f36646l));
                                    c6337a.f36650p = strSubstring.length() + c6337a.f36650p;
                                    i15++;
                                    size = size;
                                    arrayList = arrayList;
                                }
                            } else {
                                int i16 = 0;
                                int iM12966a = 0;
                                while (i16 < lineCount) {
                                    Rect rect = new Rect();
                                    staticLayout.getLineBounds(i16, rect);
                                    float f16 = rect.bottom;
                                    float f17 = f15 - f14;
                                    if (f16 > f17 - c6337a.f36640f && i16 == lineCount - 1) {
                                        while (true) {
                                            float f18 = f15 - f14;
                                            if (rect.bottom > f18 - c6337a.f36640f) {
                                                i16--;
                                                staticLayout.getLineBounds(i16, rect);
                                                if (rect.bottom <= f18) {
                                                    iM12966a = c6337a.m12966a(staticLayout, list2, i16, c6337a.f36648n, iM12966a, arrayList2, lineCount);
                                                    f15 = rect.bottom + ((c6337a.f36637c - f13) - f14);
                                                }
                                            }
                                        }
                                    } else if (f16 > f17) {
                                        iM12966a = c6337a.m12966a(staticLayout, list2, i16, c6337a.f36648n, iM12966a, arrayList2, lineCount);
                                        f15 = ((c6337a.f36637c - 0.0f) - f14) + rect.bottom;
                                        i16++;
                                        f13 = 0.0f;
                                    } else {
                                        if (i16 == lineCount - 1) {
                                            iM12966a = c6337a.m12966a(staticLayout, list2, i16, c6337a.f36648n, iM12966a, arrayList2, lineCount);
                                        }
                                        i16++;
                                    }
                                }
                            }
                        }
                        collection = arrayList2;
                    }
                    LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                    C5207g.m11111f(collection, "lessonPages");
                    if (!collection.isEmpty()) {
                        lessonViewModelM10109q0.f27424P0.setValue(collection);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42171(LessonFragment lessonFragment, InterfaceC9968c<? super C42171> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27312f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42171 c42171 = new C42171(this.f27312f, interfaceC9968c);
            c42171.f27311e = obj;
            return c42171;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6069o c6069o, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42171) mo1336a(c6069o, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C6069o c6069o = (C6069o) this.f27311e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27312f;
            lessonFragment.m10107o0().f44701l.post(new a(lessonFragment, c6069o));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$6(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27310f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$6(this.f27310f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27309e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27310f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C42171 c42171 = new C42171(lessonFragment, null);
            this.f27309e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27442V0, c42171, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
