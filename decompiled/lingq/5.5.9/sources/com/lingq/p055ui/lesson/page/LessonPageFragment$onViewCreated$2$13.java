package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$13", m19206f = "LessonPageFragment.kt", m19207l = {585}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$13 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28390e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28391f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$13$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$13$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43471 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28392e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28393f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$13$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonPageFragment f28394a;

            public a(LessonPageFragment lessonPageFragment) {
                this.f28394a = lessonPageFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                TextView textView = this.f28394a.m10191r0().f44790n;
                C5207g.m11110e(textView, "binding.tvNotes");
                textView.setVisibility(textView.getVisibility() == 0 ? 8 : 0);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$13$1$b */
        public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f28395a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonPageFragment f28396b;

            public b(LessonTextView lessonTextView, LessonPageFragment lessonPageFragment) {
                this.f28395a = lessonTextView;
                this.f28396b = lessonPageFragment;
            }

            /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Point point;
                View view = this.f28395a;
                if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    LessonPageFragment lessonPageFragment = this.f28396b;
                    if (lessonPageFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                        LessonTextView lessonTextView = lessonPageFragment.f28340D0;
                        if (lessonTextView == null) {
                            C5207g.m11117l("tvContent");
                            throw null;
                        }
                        if (lessonTextView.getLayoutDirection() == 1) {
                            TextView textView = lessonPageFragment.m10191r0().f44778b;
                            C5207g.m11110e(textView, "binding.btnSentenceNotes");
                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            }
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                            layoutParams2.removeRule(20);
                            layoutParams2.addRule(21);
                            textView.setLayoutParams(layoutParams2);
                        }
                        LessonTextView lessonTextView2 = lessonPageFragment.f28340D0;
                        if (lessonTextView2 == null) {
                            C5207g.m11117l("tvContent");
                            throw null;
                        }
                        if (lessonTextView2 == null) {
                            C5207g.m11117l("tvContent");
                            throw null;
                        }
                        int length = lessonTextView2.getText().length() - 1;
                        lessonPageFragment.getClass();
                        if (lessonTextView2.getLayout() == null) {
                            point = null;
                        } else {
                            int lineForOffset = lessonTextView2.getLayout().getLineForOffset(length);
                            int primaryHorizontal = (int) lessonTextView2.getLayout().getPrimaryHorizontal(length);
                            Rect rect = new Rect();
                            LessonTextView lessonTextView3 = lessonPageFragment.f28340D0;
                            if (lessonTextView3 == null) {
                                C5207g.m11117l("tvContent");
                                throw null;
                            }
                            lessonTextView3.getLayout().getLineBounds(lineForOffset, rect);
                            point = new Point(primaryHorizontal, rect.top);
                        }
                        if (point != null) {
                            int dimensionPixelSize = lessonPageFragment.m3578a0().getResources().getDimensionPixelSize(R.dimen.spacing_standard);
                            TextView textView2 = lessonPageFragment.m10191r0().f44778b;
                            C5207g.m11110e(textView2, "binding.btnSentenceNotes");
                            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                            if (layoutParams3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            }
                            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                            LessonTextView lessonTextView4 = lessonPageFragment.f28340D0;
                            if (lessonTextView4 == null) {
                                C5207g.m11117l("tvContent");
                                throw null;
                            }
                            if (lessonTextView4.getLayoutDirection() == 1) {
                                layoutParams4.setMarginEnd(point.x - (dimensionPixelSize * 2));
                            } else {
                                layoutParams4.setMarginStart(point.x + dimensionPixelSize);
                            }
                            layoutParams4.topMargin = point.y + dimensionPixelSize;
                            textView2.setLayoutParams(layoutParams4);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43471(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43471> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28393f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43471 c43471 = new C43471(this.f28393f, interfaceC9968c);
            c43471.f28392e = obj;
            return c43471;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43471) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f28392e;
            boolean z10 = !C7661i.m15250P2(str);
            LessonPageFragment lessonPageFragment = this.f28393f;
            if (z10) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                lessonPageFragment.m10191r0().f44790n.setText(str);
                TextView textView = lessonPageFragment.m10191r0().f44778b;
                C5207g.m11110e(textView, "binding.btnSentenceNotes");
                C4924a.m10457e0(textView);
                LessonTextView lessonTextView = lessonPageFragment.f28340D0;
                if (lessonTextView == null) {
                    C5207g.m11117l("tvContent");
                    throw null;
                }
                lessonTextView.getViewTreeObserver().addOnGlobalLayoutListener(new b(lessonTextView, lessonPageFragment));
                lessonPageFragment.m10191r0().f44778b.setOnClickListener(new a(lessonPageFragment));
            } else {
                LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                TextView textView2 = lessonPageFragment.m10191r0().f44778b;
                C5207g.m11110e(textView2, "binding.btnSentenceNotes");
                C4924a.m10442U(textView2);
                TextView textView3 = lessonPageFragment.m10191r0().f44790n;
                C5207g.m11110e(textView3, "binding.tvNotes");
                C4924a.m10442U(textView3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$13(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$13> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28391f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$13(this.f28391f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$13) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28390e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28391f;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C43471 c43471 = new C43471(lessonPageFragment, null);
            this.f28390e = 1;
            if (C0062b.m369m0(lessonPageViewModelM10193t0.f28569p0, c43471, this) == coroutineSingletons) {
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
