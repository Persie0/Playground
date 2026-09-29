package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import dm.C5207g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$prepareSentenceTranslation$1", m19206f = "LessonPageViewModel.kt", m19207l = {927}, m19208m = "invokeSuspend")
final class LessonPageViewModel$prepareSentenceTranslation$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28627e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28628f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28629g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$prepareSentenceTranslation$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "translation", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$prepareSentenceTranslation$1$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43761 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28630e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageViewModel f28631f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f28632g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f28633h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43761(int i10, LessonPageViewModel lessonPageViewModel, String str, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28631f = lessonPageViewModel;
            this.f28632g = i10;
            this.f28633h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43761 c43761 = new C43761(this.f28632g, this.f28631f, this.f28633h, interfaceC9968c);
            c43761.f28630e = obj;
            return c43761;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43761) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object next;
            TranslationStudy translationStudy;
            String str;
            String lowerCase;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) this.f28630e;
            int i10 = this.f28632g;
            LessonPageViewModel lessonPageViewModel = this.f28631f;
            if (lessonStudyTranslationSentence != null) {
                HashSet hashSetM14921S = C7499b.m14921S("zh-cn", "zh-t", "zh-tw", "zh");
                Iterator<T> it = lessonStudyTranslationSentence.f21900f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    translationStudy = (TranslationStudy) next;
                    Locale locale = Locale.ROOT;
                    str = this.f28633h;
                    lowerCase = str.toLowerCase(locale);
                    C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } while (!(hashSetM14921S.contains(lowerCase) ? hashSetM14921S.contains(translationStudy.f21917b) : C5207g.m11106a(translationStudy.f21917b, str)));
                TranslationStudy translationStudy2 = (TranslationStudy) next;
                if (translationStudy2 != null) {
                    String str2 = translationStudy2.f21916a;
                    if (str2.length() > 0) {
                        lessonPageViewModel.f28566m0.setValue(str2);
                    } else {
                        LessonPageViewModel.m10196l2(lessonPageViewModel, i10, lessonPageViewModel.f28527I);
                    }
                } else {
                    LessonPageViewModel.m10196l2(lessonPageViewModel, i10, lessonPageViewModel.f28527I);
                }
            } else {
                LessonPageViewModel.m10196l2(lessonPageViewModel, i10, lessonPageViewModel.f28527I);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$prepareSentenceTranslation$1(LessonPageViewModel lessonPageViewModel, int i10, InterfaceC9968c<? super LessonPageViewModel$prepareSentenceTranslation$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f28628f = lessonPageViewModel;
        this.f28629g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$prepareSentenceTranslation$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$prepareSentenceTranslation$1(this.f28628f, this.f28629g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28627e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageViewModel lessonPageViewModel = this.f28628f;
            String strMo507p1 = lessonPageViewModel.mo507p1();
            InterfaceC3324a interfaceC3324a = lessonPageViewModel.f28552f;
            int i11 = lessonPageViewModel.f28527I;
            int i12 = this.f28629g;
            InterfaceC7116c<LessonStudyTranslationSentence> interfaceC7116cMo9479A = interfaceC3324a.mo9479A(i12, i11);
            C43761 c43761 = new C43761(i12, lessonPageViewModel, strMo507p1, null);
            this.f28627e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9479A, c43761, this) == coroutineSingletons) {
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
