package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p265mj.C7569c;
import p265mj.C7570d;
import p265mj.C7571e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$10", m19206f = "LessonPageFragment.kt", m19207l = {541}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$10 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28376e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28377f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$10$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/lesson/page/LessonPageViewModel$b;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$10$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43441 extends SuspendLambda implements InterfaceC2056p<LessonPageViewModel.C4374b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28378e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28379f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$10$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28380a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonPageViewModel.C4374b f28381b;

            public a(LessonPageFragment lessonPageFragment, LessonPageViewModel.C4374b c4374b) {
                this.f28380a = lessonPageFragment;
                this.f28381b = c4374b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int length;
                int iM13333r;
                int length2;
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                LessonPageFragment lessonPageFragment = this.f28380a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence) lessonPageFragment.m10193t0().f28535Q.getValue());
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(lessonPageFragment.m3578a0().getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin)), 0, spannableStringBuilder.length(), 33);
                    String strMo498E1 = lessonPageFragment.m10193t0().mo498E1();
                    LessonPageViewModel.C4374b c4374b = this.f28381b;
                    List<C7569c> list = c4374b.f28596b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!((C7569c) obj).f41718e) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList<C7569c> arrayListM13438f0 = C6752c.m13438f0(c4374b.f28595a, arrayList);
                    Context contextM3578a0 = lessonPageFragment.m3578a0();
                    LessonTextView lessonTextView = lessonPageFragment.f28340D0;
                    if (lessonTextView == null) {
                        C5207g.m11117l("tvContent");
                        throw null;
                    }
                    C7571e c7571e = new C7571e(contextM3578a0, lessonTextView.getLayout(), strMo498E1, arrayListM13438f0, c4374b.f28597c, c4374b.f28599e);
                    LessonTextView lessonTextView2 = lessonPageFragment.f28340D0;
                    if (lessonTextView2 == null) {
                        C5207g.m11117l("tvContent");
                        throw null;
                    }
                    spannableStringBuilder.setSpan(c7571e, 0, lessonTextView2.getText().length(), 33);
                    if (c4374b.f28599e == LessonHighlightStyle.ForegroundColor) {
                        for (C7569c c7569c : arrayListM13438f0) {
                            if (c7569c.f41719f) {
                                int i10 = c7569c.f41714a;
                                if (i10 == R.attr.yellowWordStatus4Color) {
                                    List<Integer> list2 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(R.attr.primaryTextColor, lessonPageFragment.m3578a0());
                                } else if (i10 == R.color.transparent) {
                                    List<Integer> list3 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(R.attr.yellowWordBorderColor, lessonPageFragment.m3578a0());
                                } else {
                                    List<Integer> list4 = C6716m.f37937a;
                                    iM13333r = C6716m.m13333r(R.attr.blueWordBorderColor, lessonPageFragment.m3578a0());
                                }
                            } else if (c7569c.f41714a == R.attr.yellowWordStatus4Color) {
                                List<Integer> list5 = C6716m.f37937a;
                                iM13333r = C6716m.m13333r(R.attr.primaryTextColor, lessonPageFragment.m3578a0());
                            } else {
                                List<Integer> list6 = C6716m.f37937a;
                                iM13333r = C6716m.m13333r(R.attr.yellowWordBorderColor, lessonPageFragment.m3578a0());
                            }
                            C7570d c7570d = c7569c.f41717d;
                            int length3 = c7570d.f41721a <= spannableStringBuilder.length() ? c7570d.f41721a : spannableStringBuilder.length();
                            if (c7570d.f41722b <= spannableStringBuilder.length()) {
                                length2 = c7570d.f41725e.length() + length3;
                                if (length2 > spannableStringBuilder.length()) {
                                    length2 = c7570d.f41722b;
                                }
                            } else {
                                length2 = spannableStringBuilder.length();
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(iM13333r), length3, length2, 33);
                        }
                    }
                    for (C7569c c7569c2 : arrayListM13438f0) {
                        C7570d c7570d2 = c7569c2.f41717d;
                        int length4 = c7570d2.f41721a <= spannableStringBuilder.length() ? c7570d2.f41721a : spannableStringBuilder.length();
                        if (c7570d2.f41722b <= spannableStringBuilder.length()) {
                            length = (c7570d2.f41725e.length() + length4) - 1;
                            if (length > spannableStringBuilder.length()) {
                                length = c7570d2.f41722b;
                            }
                        } else {
                            length = spannableStringBuilder.length();
                        }
                        spannableStringBuilder.setSpan(new C4387c(c7569c2, lessonPageFragment, c7570d2), length4, length, 17);
                    }
                    String str = (String) lessonPageFragment.m10193t0().f28535Q.getValue();
                    C7570d c7570d3 = c4374b.f28598d;
                    LessonHighlightStyle lessonHighlightStyle = c4374b.f28599e;
                    String strMo498E2 = lessonPageFragment.m10193t0().mo498E1();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : c4374b.f28596b) {
                        if (((C7569c) obj2).f41718e) {
                            arrayList2.add(obj2);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    Context contextM3578a1 = lessonPageFragment.m3578a0();
                    LessonTextView lessonTextView3 = lessonPageFragment.f28341E0;
                    if (lessonTextView3 == null) {
                        C5207g.m11117l("tvContentPhrases");
                        throw null;
                    }
                    C7571e c7571e2 = new C7571e(contextM3578a1, lessonTextView3.getLayout(), strMo498E2, arrayList2, c7570d3, lessonHighlightStyle);
                    LessonTextView lessonTextView4 = lessonPageFragment.f28341E0;
                    if (lessonTextView4 == null) {
                        C5207g.m11117l("tvContentPhrases");
                        throw null;
                    }
                    spannableStringBuilder2.setSpan(c7571e2, 0, lessonTextView4.getText().length(), 33);
                    spannableStringBuilder2.setSpan(new LeadingMarginSpan.Standard(lessonPageFragment.m3578a0().getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin)), 0, spannableStringBuilder2.length(), 33);
                    LessonTextView lessonTextView5 = lessonPageFragment.f28341E0;
                    if (lessonTextView5 == null) {
                        C5207g.m11117l("tvContentPhrases");
                        throw null;
                    }
                    lessonTextView5.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
                    LessonTextView lessonTextView6 = lessonPageFragment.f28340D0;
                    if (lessonTextView6 == null) {
                        C5207g.m11117l("tvContent");
                        throw null;
                    }
                    lessonTextView6.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43441(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43441> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28379f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43441 c43441 = new C43441(this.f28379f, interfaceC9968c);
            c43441.f28378e = obj;
            return c43441;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonPageViewModel.C4374b c4374b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43441) mo1336a(c4374b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonPageViewModel.C4374b c4374b = (LessonPageViewModel.C4374b) this.f28378e;
            LessonPageFragment lessonPageFragment = this.f28379f;
            LessonTextView lessonTextView = lessonPageFragment.f28340D0;
            if (lessonTextView != null) {
                lessonTextView.post(new a(lessonPageFragment, c4374b));
                return C9072e.f47360a;
            }
            C5207g.m11117l("tvContent");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$10(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$10> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28377f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$10(this.f28377f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$10) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28376e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28377f;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(lessonPageFragment.m10193t0().f28557h0);
            C43441 c43441 = new C43441(lessonPageFragment, null);
            this.f28376e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c43441, this) == coroutineSingletons) {
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
