package com.lingq.p055ui.lesson.edit;

import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u00020\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/lesson/edit/SentenceEditPageAdapter$a;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentence", "", "viewAllTranslations", "audio", "", "progress", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$adapterItems$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {119}, m19208m = "invokeSuspend")
final class SentenceEditPageViewModel$adapterItems$1 extends SuspendLambda implements InterfaceC2060t<InterfaceC7117d<? super List<SentenceEditPageAdapter.AbstractC4290a>>, LessonStudyTranslationSentence, Boolean, Boolean, Long, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28047e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28048f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ LessonStudyTranslationSentence f28049g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean f28050h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ boolean f28051i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f28052j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ SentenceEditPageViewModel f28053k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPageViewModel$adapterItems$1(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super SentenceEditPageViewModel$adapterItems$1> interfaceC9968c) {
        super(6, interfaceC9968c);
        this.f28053k = sentenceEditPageViewModel;
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final Object mo1858g0(InterfaceC7117d<? super List<SentenceEditPageAdapter.AbstractC4290a>> interfaceC7117d, LessonStudyTranslationSentence lessonStudyTranslationSentence, Boolean bool, Boolean bool2, Long l10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        long jLongValue = l10.longValue();
        SentenceEditPageViewModel$adapterItems$1 sentenceEditPageViewModel$adapterItems$1 = new SentenceEditPageViewModel$adapterItems$1(this.f28053k, interfaceC9968c);
        sentenceEditPageViewModel$adapterItems$1.f28048f = interfaceC7117d;
        sentenceEditPageViewModel$adapterItems$1.f28049g = lessonStudyTranslationSentence;
        sentenceEditPageViewModel$adapterItems$1.f28050h = zBooleanValue;
        sentenceEditPageViewModel$adapterItems$1.f28051i = zBooleanValue2;
        sentenceEditPageViewModel$adapterItems$1.f28052j = jLongValue;
        return sentenceEditPageViewModel$adapterItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        TranslationStudy translationStudy;
        String strMo507p1;
        String str2;
        String str3;
        String str4;
        Double d10;
        Double d11;
        List<TranslationStudy> list;
        Object next;
        String str5;
        ?? arrayList;
        List<TranslationStudy> list2;
        boolean z10;
        List<TranslationStudy> list3;
        Object next2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28047e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28048f;
            LessonStudyTranslationSentence lessonStudyTranslationSentence = this.f28049g;
            boolean z11 = this.f28050h;
            boolean z12 = this.f28051i;
            long j10 = this.f28052j;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.c(R.string.lesson_sentence_edit));
            String str6 = "";
            if (lessonStudyTranslationSentence == null || (str = lessonStudyTranslationSentence.f21899e) == null) {
                str = "";
            }
            arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.f(str));
            arrayList2.add(SentenceEditPageAdapter.AbstractC4290a.d.f27973a);
            SentenceEditPageViewModel sentenceEditPageViewModel = this.f28053k;
            if (lessonStudyTranslationSentence == null || (list3 = lessonStudyTranslationSentence.f21900f) == null) {
                translationStudy = null;
            } else {
                Iterator it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!C5207g.m11106a(((TranslationStudy) next2).f21917b, sentenceEditPageViewModel.mo507p1()));
                translationStudy = (TranslationStudy) next2;
            }
            if (translationStudy == null || (strMo507p1 = translationStudy.f21917b) == null) {
                strMo507p1 = sentenceEditPageViewModel.mo507p1();
            }
            if (translationStudy == null || (str2 = translationStudy.f21916a) == null) {
                str2 = "";
            }
            arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.g(strMo507p1, str2, z11));
            if (z11) {
                if (lessonStudyTranslationSentence == null || (list2 = lessonStudyTranslationSentence.f21900f) == null) {
                    str3 = "";
                    arrayList = EmptyList.f38032a;
                } else {
                    ArrayList<TranslationStudy> arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        TranslationStudy translationStudy2 = (TranslationStudy) obj2;
                        String str7 = str6;
                        if (C5207g.m11106a(translationStudy2.f21917b, "notes")) {
                            z10 = false;
                        } else if (C5207g.m11106a(translationStudy2.f21917b, sentenceEditPageViewModel.mo507p1())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            arrayList3.add(obj2);
                        }
                        str6 = str7;
                    }
                    str3 = str6;
                    arrayList = new ArrayList(C9325m.m17681z(arrayList3, 10));
                    for (TranslationStudy translationStudy3 : arrayList3) {
                        arrayList.add(new SentenceEditPageAdapter.AbstractC4290a.g(translationStudy3.f21917b, translationStudy3.f21916a, z11));
                    }
                }
                arrayList2.addAll(arrayList);
                arrayList2.add(SentenceEditPageAdapter.AbstractC4290a.a.f27967a);
            } else {
                str3 = "";
            }
            arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.c(R.string.card_notes));
            if (lessonStudyTranslationSentence == null || (list = lessonStudyTranslationSentence.f21900f) == null) {
                str4 = str3;
            } else {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!C5207g.m11106a(((TranslationStudy) next).f21917b, "notes"));
                TranslationStudy translationStudy4 = (TranslationStudy) next;
                if (translationStudy4 == null || (str5 = translationStudy4.f21916a) == null) {
                    str4 = str3;
                } else {
                    str4 = str5;
                }
            }
            arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.e(str4));
            if (sentenceEditPageViewModel.f28028j) {
                arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.c(R.string.lesson_edit_audio));
                double dDoubleValue = 0.0d;
                double d12 = 10;
                double dFloor = Math.floor(((lessonStudyTranslationSentence == null || (d11 = lessonStudyTranslationSentence.f21897c) == null) ? 0.0d : d11.doubleValue()) * d12) / d12;
                if (lessonStudyTranslationSentence != null && (d10 = lessonStudyTranslationSentence.f21898d) != null) {
                    dDoubleValue = d10.doubleValue();
                }
                arrayList2.add(new SentenceEditPageAdapter.AbstractC4290a.b(dFloor, Math.floor(dDoubleValue * d12) / d12, j10, z12));
            }
            this.f28048f = null;
            this.f28047e = 1;
            if (interfaceC7117d.mo1339r(arrayList2, this) == coroutineSingletons) {
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
