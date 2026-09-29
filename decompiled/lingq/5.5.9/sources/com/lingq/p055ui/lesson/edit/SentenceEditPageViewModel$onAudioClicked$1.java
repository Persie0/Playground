package com.lingq.p055ui.lesson.edit;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$onAudioClicked$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {243}, m19208m = "invokeSuspend")
final class SentenceEditPageViewModel$onAudioClicked$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28077e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SentenceEditPageViewModel f28078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPageViewModel$onAudioClicked$1(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super SentenceEditPageViewModel$onAudioClicked$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28078f = sentenceEditPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SentenceEditPageViewModel$onAudioClicked$1(this.f28078f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SentenceEditPageViewModel$onAudioClicked$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Double d10;
        Double d11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28077e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f28077e = 1;
            if (C7828f.m15567a(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        SentenceEditPageViewModel sentenceEditPageViewModel = this.f28078f;
        InterfaceC3275c interfaceC3275c = sentenceEditPageViewModel.f28024f;
        int i11 = sentenceEditPageViewModel.f28027i;
        StateFlowImpl stateFlowImpl = sentenceEditPageViewModel.f28030l;
        LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) stateFlowImpl.getValue();
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (lessonStudyTranslationSentence == null || (d11 = lessonStudyTranslationSentence.f21897c) == null) ? 0.0d : d11.doubleValue();
        LessonStudyTranslationSentence lessonStudyTranslationSentence2 = (LessonStudyTranslationSentence) stateFlowImpl.getValue();
        if (lessonStudyTranslationSentence2 != null && (d10 = lessonStudyTranslationSentence2.f21898d) != null) {
            dDoubleValue = d10.doubleValue();
        }
        interfaceC3275c.mo9337M1(i11, dDoubleValue2, new Double(dDoubleValue), 1.0f);
        return C9072e.f47360a;
    }
}
