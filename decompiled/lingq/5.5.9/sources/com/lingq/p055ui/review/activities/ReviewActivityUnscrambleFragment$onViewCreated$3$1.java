package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.views.unscrambler.SentenceBuilderView;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import com.linguist.R;
import dm.C5207g;
import java.util.Iterator;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$1", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {78}, m19208m = "invokeSuspend")
public final class ReviewActivityUnscrambleFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30082e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f30083f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentence", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$1$1", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46401 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30084e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f30085f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46401(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, InterfaceC9968c<? super C46401> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30085f = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46401 c46401 = new C46401(this.f30085f, interfaceC9968c);
            c46401.f30084e = obj;
            return c46401;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46401) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object next;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) this.f30084e;
            boolean zIsEmpty = lessonStudyTranslationSentence.f21900f.isEmpty();
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f30085f;
            if (zIsEmpty) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
                reviewActivityUnscrambleFragment.m10288o0().f45083a.setText(reviewActivityUnscrambleFragment.m3600t(R.string.lingq_loading_translation));
                ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModelM10290q0 = reviewActivityUnscrambleFragment.m10290q0();
                C7828f.m15570d(C8573r0.m16767w0(reviewActivityUnscrambleViewModelM10290q0), null, null, new ReviewActivityUnscrambleViewModel$loadTranslation$1(reviewActivityUnscrambleViewModelM10290q0, null), 3);
            } else {
                Iterator<T> it = lessonStudyTranslationSentence.f21900f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    str = ((TranslationStudy) next).f21917b;
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewActivityUnscrambleFragment.f30068D0;
                } while (!C5207g.m11106a(str, reviewActivityUnscrambleFragment.m10290q0().mo507p1()));
                TranslationStudy translationStudy = (TranslationStudy) next;
                String str2 = translationStudy != null ? translationStudy.f21916a : null;
                if (str2 == null || C7661i.m15250P2(str2)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewActivityUnscrambleFragment.f30068D0;
                    reviewActivityUnscrambleFragment.m10288o0().f45083a.setText(reviewActivityUnscrambleFragment.m3600t(R.string.lingq_loading_translation));
                    ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModelM10290q1 = reviewActivityUnscrambleFragment.m10290q0();
                    C7828f.m15570d(C8573r0.m16767w0(reviewActivityUnscrambleViewModelM10290q1), null, null, new ReviewActivityUnscrambleViewModel$loadTranslation$1(reviewActivityUnscrambleViewModelM10290q1, null), 3);
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr4 = ReviewActivityUnscrambleFragment.f30068D0;
                    reviewActivityUnscrambleFragment.m10288o0().f45083a.setText(str2);
                }
            }
            SentenceBuilderView sentenceBuilderView = reviewActivityUnscrambleFragment.m10288o0().f45084b;
            C5207g.m11110e(sentenceBuilderView, "binding.viewSentenceBuilder");
            String string = C7076b.m14277B3(lessonStudyTranslationSentence.f21899e).toString();
            int i10 = SentenceBuilderView.f30485j;
            sentenceBuilderView.m10319d(string, false);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$3$1(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, InterfaceC9968c<? super ReviewActivityUnscrambleFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30083f = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$3$1(this.f30083f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30082e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f30083f;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(reviewActivityUnscrambleFragment.m10290q0().f30117H);
            C46401 c46401 = new C46401(reviewActivityUnscrambleFragment, null);
            this.f30082e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c46401, this) == coroutineSingletons) {
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
