package com.lingq.p055ui.lesson.edit;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentence", "locales", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$canAddLocales$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {130}, m19208m = "invokeSuspend")
final class SentenceEditPageViewModel$canAddLocales$1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super List<? extends UserDictionaryLocale>>, LessonStudyTranslationSentence, List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28054e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28055f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ LessonStudyTranslationSentence f28056g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ List f28057h;

    public SentenceEditPageViewModel$canAddLocales$1(InterfaceC9968c<? super SentenceEditPageViewModel$canAddLocales$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(InterfaceC7117d<? super List<? extends UserDictionaryLocale>> interfaceC7117d, LessonStudyTranslationSentence lessonStudyTranslationSentence, List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        SentenceEditPageViewModel$canAddLocales$1 sentenceEditPageViewModel$canAddLocales$1 = new SentenceEditPageViewModel$canAddLocales$1(interfaceC9968c);
        sentenceEditPageViewModel$canAddLocales$1.f28055f = interfaceC7117d;
        sentenceEditPageViewModel$canAddLocales$1.f28056g = lessonStudyTranslationSentence;
        sentenceEditPageViewModel$canAddLocales$1.f28057h = list;
        return sentenceEditPageViewModel$canAddLocales$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ArrayList arrayList;
        TranslationStudy translationStudy;
        List<TranslationStudy> list;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28054e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28055f;
            LessonStudyTranslationSentence lessonStudyTranslationSentence = this.f28056g;
            List list2 = this.f28057h;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    UserDictionaryLocale userDictionaryLocale = (UserDictionaryLocale) obj2;
                    if (lessonStudyTranslationSentence == null || (list = lessonStudyTranslationSentence.f21900f) == null) {
                        translationStudy = null;
                    } else {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!C5207g.m11106a(((TranslationStudy) next).f21917b, userDictionaryLocale.f21721a));
                        translationStudy = (TranslationStudy) next;
                    }
                    if (translationStudy == null) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            this.f28055f = null;
            this.f28056g = null;
            this.f28054e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
