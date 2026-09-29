package com.lingq.p055ui.review.activities;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.p055ui.token.TokenTransliteration;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import com.lingq.shared.uimodel.lesson.LessonStudyTextToken;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingViewModel$fetchSentenceTokens$1", m19206f = "ReviewActivitySpeakingViewModel.kt", m19207l = {110}, m19208m = "invokeSuspend")
final class ReviewActivitySpeakingViewModel$fetchSentenceTokens$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30061e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivitySpeakingViewModel f30062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$fetchSentenceTokens$1(ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel, InterfaceC9968c<? super ReviewActivitySpeakingViewModel$fetchSentenceTokens$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30062f = reviewActivitySpeakingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivitySpeakingViewModel$fetchSentenceTokens$1(this.f30062f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivitySpeakingViewModel$fetchSentenceTokens$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objMo9489K;
        List<LessonStudyTextToken> list;
        int length;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30061e;
        ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModel = this.f30062f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC3324a interfaceC3324a = reviewActivitySpeakingViewModel.f30025d;
            this.f30061e = 1;
            objMo9489K = interfaceC3324a.mo9489K(reviewActivitySpeakingViewModel.f30030i, reviewActivitySpeakingViewModel.f30031j, this);
            if (objMo9489K == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            objMo9489K = obj;
        }
        LessonStudySentence lessonStudySentence = (LessonStudySentence) objMo9489K;
        if (lessonStudySentence != null && (list = lessonStudySentence.f21858a) != null) {
            reviewActivitySpeakingViewModel.getClass();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int i11 = 0;
            int i12 = 0;
            for (LessonStudyTextToken lessonStudyTextToken : list) {
                String str = lessonStudyTextToken.f21871a;
                if (str != null) {
                    length = str.length() + i11;
                    sb2.append(lessonStudyTextToken.f21871a);
                } else if (lessonStudyTextToken.f21872b != null) {
                    i11++;
                    i12++;
                    sb2.append(" ");
                    sb3.append(" ");
                } else {
                    String str2 = lessonStudyTextToken.f21880j;
                    if (str2 != null) {
                        int length2 = str2.length() + i11;
                        int length3 = str2.length() + i12;
                        int i13 = lessonStudyTextToken.f21877g;
                        int i14 = lessonStudyTextToken.f21878h;
                        LessonStudyTransliteration lessonStudyTransliteration = lessonStudyTextToken.f21876f;
                        arrayList.add(new C7570d(i11, length2, i12, length3, str2, i13, 0, i14, "", new TokenTransliteration(lessonStudyTransliteration != null ? lessonStudyTransliteration.f21907a : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21908b : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21909c : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21910d : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21911e : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21912f : null), TextTokenType.WORD, lessonStudyTextToken.f21883m, 12288));
                        length = str2.length() + i11;
                        int length4 = str2.length() + i12;
                        sb2.append(str2);
                        sb3.append(str2);
                        i12 = length4;
                    }
                }
                i11 = length;
            }
            String string = sb3.toString();
            C5207g.m11110e(string, "sentenceStringWithoutPunct.toString()");
            reviewActivitySpeakingViewModel.f30023K = string;
            String string2 = sb2.toString();
            C5207g.m11110e(string2, "sentenceString.toString()");
            reviewActivitySpeakingViewModel.f30020H.setValue(string2);
            reviewActivitySpeakingViewModel.f30033l.setValue(C6752c.m13453u0(arrayList));
        }
        return C9072e.f47360a;
    }
}
