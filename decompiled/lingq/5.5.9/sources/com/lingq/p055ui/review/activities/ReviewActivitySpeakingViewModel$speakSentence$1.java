package com.lingq.p055ui.review.activities;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$speakSentence$1", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {187}, m19208m = "invokeSuspend")
final class ReviewActivitySpeakingViewModel$speakSentence$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public ReviewActivitySpeakingViewModel f30063e;

    /* JADX INFO: renamed from: f */
    public double f30064f;

    /* JADX INFO: renamed from: g */
    public double f30065g;

    /* JADX INFO: renamed from: h */
    public int f30066h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ReviewActivitySpeakingViewModel f30067i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$speakSentence$1(ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel, InterfaceC9968c<? super ReviewActivitySpeakingViewModel$speakSentence$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30067i = reviewActivitySpeakingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivitySpeakingViewModel$speakSentence$1(this.f30067i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivitySpeakingViewModel$speakSentence$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel;
        ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel2;
        double d10;
        double d11;
        LessonStudyTranslationSentence lessonStudyTranslationSentence;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30066h;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            reviewActivitySpeakingViewModel = this.f30067i;
            LessonStudyTranslationSentence lessonStudyTranslationSentence2 = (LessonStudyTranslationSentence) reviewActivitySpeakingViewModel.f30032k.getValue();
            if (lessonStudyTranslationSentence2 != null) {
                Double d12 = lessonStudyTranslationSentence2.f21897c;
                double dDoubleValue = d12 != null ? d12.doubleValue() : 0.0d;
                Double d13 = lessonStudyTranslationSentence2.f21898d;
                double dDoubleValue2 = d13 != null ? d13.doubleValue() : 0.0d;
                if (((int) dDoubleValue2) != 0) {
                    PreferenceStoreImpl$special$$inlined$map$8 preferenceStoreImpl$special$$inlined$map$8Mo9583b0 = reviewActivitySpeakingViewModel.f30028g.mo9583b0();
                    this.f30063e = reviewActivitySpeakingViewModel;
                    this.f30064f = dDoubleValue;
                    this.f30065g = dDoubleValue2;
                    this.f30066h = 1;
                    obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$8Mo9583b0, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    reviewActivitySpeakingViewModel2 = reviewActivitySpeakingViewModel;
                    d10 = dDoubleValue2;
                    d11 = dDoubleValue;
                }
                lessonStudyTranslationSentence = (LessonStudyTranslationSentence) reviewActivitySpeakingViewModel.f30032k.getValue();
                if (lessonStudyTranslationSentence != null) {
                    str = lessonStudyTranslationSentence.f21899e;
                } else {
                    str = null;
                }
                InterfaceC3275c interfaceC3275c = reviewActivitySpeakingViewModel.f30027f;
                String strMo498E1 = reviewActivitySpeakingViewModel.mo498E1();
                if (str == null) {
                    str = "";
                }
                InterfaceC3275c.a.m9347b(interfaceC3275c, strMo498E1, str, true, 0.0f, 8);
            }
            return C9072e.f47360a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d10 = this.f30065g;
        double d14 = this.f30064f;
        ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel3 = this.f30063e;
        C7499b.m14977z0(obj);
        reviewActivitySpeakingViewModel2 = reviewActivitySpeakingViewModel3;
        d11 = d14;
        if (((Boolean) obj).booleanValue()) {
            reviewActivitySpeakingViewModel2.f30027f.mo9337M1(reviewActivitySpeakingViewModel2.f30030i, d11, new Double(d10), 1.0f);
        } else {
            reviewActivitySpeakingViewModel = reviewActivitySpeakingViewModel2;
            lessonStudyTranslationSentence = (LessonStudyTranslationSentence) reviewActivitySpeakingViewModel.f30032k.getValue();
            if (lessonStudyTranslationSentence != null) {
                str = lessonStudyTranslationSentence.f21899e;
            } else {
                str = null;
            }
            InterfaceC3275c interfaceC3275c2 = reviewActivitySpeakingViewModel.f30027f;
            String strMo498E2 = reviewActivitySpeakingViewModel.mo498E1();
            if (str == null) {
                str = "";
            }
            InterfaceC3275c.a.m9347b(interfaceC3275c2, strMo498E2, str, true, 0.0f, 8);
        }
        return C9072e.f47360a;
    }
}
