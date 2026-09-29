package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5", m19206f = "LessonPageFragment.kt", m19207l = {430}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28477e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28478f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "text", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5$2", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43642 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28479e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28480f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43642(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43642> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28480f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43642 c43642 = new C43642(this.f28480f, interfaceC9968c);
            c43642.f28479e = obj;
            return c43642;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43642) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f28479e;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            LessonPageFragment lessonPageFragment = this.f28480f;
            int dimensionPixelSize = lessonPageFragment.m3578a0().getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(dimensionPixelSize), 0, spannableStringBuilder.length(), 33);
            LessonTextView lessonTextView = lessonPageFragment.f28340D0;
            if (lessonTextView == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            lessonTextView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            spannableStringBuilder2.setSpan(new LeadingMarginSpan.Standard(dimensionPixelSize), 0, spannableStringBuilder.length(), 33);
            LessonTextView lessonTextView2 = lessonPageFragment.f28341E0;
            if (lessonTextView2 == null) {
                C5207g.m11117l("tvContentPhrases");
                throw null;
            }
            lessonTextView2.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
            spannableStringBuilder3.setSpan(new LeadingMarginSpan.Standard(dimensionPixelSize), 0, spannableStringBuilder.length(), 33);
            LessonTextView lessonTextView3 = lessonPageFragment.f28342F0;
            if (lessonTextView3 != null) {
                lessonTextView3.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                return C9072e.f47360a;
            }
            C5207g.m11117l("tvContentRelatedPhrases");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$5(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28478f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$5(this.f28478f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28477e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28478f;
            final C7135p c7135p = lessonPageFragment.m10193t0().f28535Q;
            InterfaceC7116c<String> interfaceC7116c = new InterfaceC7116c<String>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5$invokeSuspend$$inlined$filterNot$1

                /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC7117d {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC7117d f28482a;

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$5$invokeSuspend$$inlined$filterNot$1$2", m19206f = "LessonPageFragment.kt", m19207l = {223}, m19208m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: d */
                        public /* synthetic */ Object f28483d;

                        /* JADX INFO: renamed from: e */
                        public int f28484e;

                        public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                            super(interfaceC9968c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) {
                            this.f28483d = obj;
                            this.f28484e |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.mo1339r(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                        this.f28482a = interfaceC7117d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                    @Override // kotlinx.coroutines.flow.InterfaceC7117d
                    /* JADX INFO: renamed from: r */
                    public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC9968c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                            int i10 = anonymousClass1.f28484e;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f28484e = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                        Object obj2 = anonymousClass1.f28483d;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = anonymousClass1.f28484e;
                        if (i11 == 0) {
                            C7499b.m14977z0(obj2);
                            if (!(((String) obj).length() == 0)) {
                                anonymousClass1.f28484e = 1;
                                if (this.f28482a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(obj2);
                        }
                        return C9072e.f47360a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC7116c
                /* JADX INFO: renamed from: a */
                public final Object mo9539a(InterfaceC7117d<? super String> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                    Object objMo9539a = c7135p.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                    return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                }
            };
            C43642 c43642 = new C43642(lessonPageFragment, null);
            this.f28477e = 1;
            if (C0062b.m369m0(interfaceC7116c, c43642, this) == coroutineSingletons) {
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
