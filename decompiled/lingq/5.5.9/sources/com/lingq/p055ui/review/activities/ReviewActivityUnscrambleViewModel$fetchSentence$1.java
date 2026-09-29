package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1", m19206f = "ReviewActivityUnscrambleViewModel.kt", m19207l = {78}, m19208m = "invokeSuspend")
final class ReviewActivityUnscrambleViewModel$fetchSentence$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30139e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityUnscrambleViewModel f30140f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$1", m19206f = "ReviewActivityUnscrambleViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46561 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super LessonStudyTranslationSentence>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f30141e;

        public C46561(InterfaceC9968c<? super C46561> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super LessonStudyTranslationSentence> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C46561 c46561 = new C46561(interfaceC9968c);
            c46561.f30141e = th2;
            return c46561.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30141e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentence", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$fetchSentence$1$2", m19206f = "ReviewActivityUnscrambleViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46572 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30142e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityUnscrambleViewModel f30143f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46572(ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel, InterfaceC9968c<? super C46572> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30143f = reviewActivityUnscrambleViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46572 c46572 = new C46572(this.f30143f, interfaceC9968c);
            c46572.f30142e = obj;
            return c46572;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46572) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30143f.f30130l.setValue((LessonStudyTranslationSentence) this.f30142e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$fetchSentence$1(ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel, InterfaceC9968c<? super ReviewActivityUnscrambleViewModel$fetchSentence$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30140f = reviewActivityUnscrambleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityUnscrambleViewModel$fetchSentence$1(this.f30140f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityUnscrambleViewModel$fetchSentence$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30139e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel = this.f30140f;
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(reviewActivityUnscrambleViewModel.f30122d.mo9479A(reviewActivityUnscrambleViewModel.f30128j, reviewActivityUnscrambleViewModel.f30129k - 1), new C46561(null));
            C46572 c46572 = new C46572(reviewActivityUnscrambleViewModel, null);
            this.f30139e = 1;
            if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c46572, this) == coroutineSingletons) {
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
