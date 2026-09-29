package com.lingq.p055ui.lesson.player;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$enableSentenceMode$1", m19206f = "ListeningModeViewModel.kt", m19207l = {288}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$enableSentenceMode$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28842e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeViewModel f28843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeViewModel$enableSentenceMode$1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super ListeningModeViewModel$enableSentenceMode$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28843f = listeningModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeViewModel$enableSentenceMode$1(this.f28843f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeViewModel$enableSentenceMode$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean zM10212l2;
        Double d10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28842e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ListeningModeViewModel listeningModeViewModel = this.f28843f;
            List list = (List) listeningModeViewModel.f28801Q.getValue();
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) obj2;
                Double d11 = lessonStudyTranslationSentence.f21897c;
                if (d11 != null) {
                    double dDoubleValue = d11.doubleValue();
                    LessonStudyTranslationSentence lessonStudyTranslationSentence2 = (LessonStudyTranslationSentence) C6752c.m13426T(i12, list);
                    double dDoubleValue2 = (lessonStudyTranslationSentence2 == null || (d10 = lessonStudyTranslationSentence2.f21897c) == null) ? dDoubleValue : d10.doubleValue();
                    long jLongValue = ((Number) listeningModeViewModel.f28804T.getValue()).longValue();
                    Double d12 = lessonStudyTranslationSentence.f21898d;
                    zM10212l2 = ListeningModeViewModel.m10212l2(listeningModeViewModel, jLongValue, dDoubleValue, d12 != null && dDoubleValue == d12.doubleValue(), dDoubleValue2);
                } else {
                    zM10212l2 = false;
                }
                if (zM10212l2) {
                    arrayList.add(obj2);
                }
                i11 = i12;
            }
            LessonStudyTranslationSentence lessonStudyTranslationSentence3 = (LessonStudyTranslationSentence) C6752c.m13425S(C6752c.m13448p0(arrayList, 1));
            int i13 = lessonStudyTranslationSentence3 != null ? lessonStudyTranslationSentence3.f21895a : -1;
            this.f28842e = 1;
            if (listeningModeViewModel.mo10142U0(i13, this) == coroutineSingletons) {
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
