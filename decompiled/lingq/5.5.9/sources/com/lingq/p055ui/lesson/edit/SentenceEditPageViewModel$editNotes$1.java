package com.lingq.p055ui.lesson.edit;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$editNotes$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {212, 214}, m19208m = "invokeSuspend")
final class SentenceEditPageViewModel$editNotes$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28064e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SentenceEditPageViewModel f28065f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f28066g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPageViewModel$editNotes$1(SentenceEditPageViewModel sentenceEditPageViewModel, String str, InterfaceC9968c<? super SentenceEditPageViewModel$editNotes$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28065f = sentenceEditPageViewModel;
        this.f28066g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SentenceEditPageViewModel$editNotes$1(this.f28065f, this.f28066g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SentenceEditPageViewModel$editNotes$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<TranslationStudy> list;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28064e;
        SentenceEditPageViewModel sentenceEditPageViewModel = this.f28065f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            sentenceEditPageViewModel.mo10157T(((Number) sentenceEditPageViewModel.f28029k.getValue()).intValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        this.f28064e = 1;
        if (C7828f.m15567a(500L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) sentenceEditPageViewModel.f28030l.getValue();
        String str = null;
        if (lessonStudyTranslationSentence != null && (list = lessonStudyTranslationSentence.f21900f) != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C5207g.m11106a(((TranslationStudy) next).f21917b, "notes"));
            TranslationStudy translationStudy = (TranslationStudy) next;
            if (translationStudy != null) {
                str = translationStudy.f21916a;
            }
        }
        if (!C5207g.m11106a(str, this.f28066g)) {
            InterfaceC3324a interfaceC3324a = sentenceEditPageViewModel.f28022d;
            sentenceEditPageViewModel.mo498E1();
            int i11 = sentenceEditPageViewModel.f28027i;
            int iIntValue = ((Number) sentenceEditPageViewModel.f28029k.getValue()).intValue();
            String str2 = this.f28066g;
            this.f28064e = 2;
            if (interfaceC3324a.mo9504Z(i11, iIntValue, "notes", str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            sentenceEditPageViewModel.mo10157T(((Number) sentenceEditPageViewModel.f28029k.getValue()).intValue());
        }
        return C9072e.f47360a;
    }
}
