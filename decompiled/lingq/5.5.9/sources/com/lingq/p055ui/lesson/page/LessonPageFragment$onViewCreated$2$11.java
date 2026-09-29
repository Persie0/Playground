package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7569c;
import p265mj.C7571e;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$11", m19206f = "LessonPageFragment.kt", m19207l = {569}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$11 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28382e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28383f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$11$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lmj/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$11$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43451 extends SuspendLambda implements InterfaceC2056p<C7569c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28384e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28385f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43451(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43451> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28385f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43451 c43451 = new C43451(this.f28385f, interfaceC9968c);
            c43451.f28384e = obj;
            return c43451;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7569c c7569c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43451) mo1336a(c7569c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C7569c c7569c = (C7569c) this.f28384e;
            if (c7569c != null) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                LessonPageFragment lessonPageFragment = this.f28385f;
                String str = (String) lessonPageFragment.m10193t0().f28535Q.getValue();
                String strMo498E1 = lessonPageFragment.m10193t0().mo498E1();
                Context contextM3578a0 = lessonPageFragment.m3578a0();
                LessonTextView lessonTextView = lessonPageFragment.f28342F0;
                if (lessonTextView == null) {
                    C5207g.m11117l("tvContentRelatedPhrases");
                    throw null;
                }
                C7571e c7571e = new C7571e(contextM3578a0, lessonTextView.getLayout(), strMo498E1, C9000b.m17251q(c7569c), c7569c.f41717d, LessonHighlightStyle.Default);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                LessonTextView lessonTextView2 = lessonPageFragment.f28342F0;
                if (lessonTextView2 == null) {
                    C5207g.m11117l("tvContentRelatedPhrases");
                    throw null;
                }
                spannableStringBuilder.setSpan(c7571e, 0, lessonTextView2.getText().length(), 33);
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(lessonPageFragment.m3578a0().getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin)), 0, spannableStringBuilder.length(), 33);
                LessonTextView lessonTextView3 = lessonPageFragment.f28342F0;
                if (lessonTextView3 == null) {
                    C5207g.m11117l("tvContentRelatedPhrases");
                    throw null;
                }
                lessonTextView3.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$11(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$11> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28383f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$11(this.f28383f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$11) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28382e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28383f;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C43451 c43451 = new C43451(lessonPageFragment, null);
            this.f28382e = 1;
            if (C0062b.m369m0(lessonPageViewModelM10193t0.f28561j0, c43451, this) == coroutineSingletons) {
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
