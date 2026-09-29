package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$loadTranslation$1", m19206f = "ReviewActivityUnscrambleViewModel.kt", m19207l = {92}, m19208m = "invokeSuspend")
final class ReviewActivityUnscrambleViewModel$loadTranslation$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30144e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityUnscrambleViewModel f30145f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$loadTranslation$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "translation", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$loadTranslation$1$1", m19206f = "ReviewActivityUnscrambleViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46581 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30146e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityUnscrambleViewModel f30147f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f30148g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f30149h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46581(ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel, int i10, String str, InterfaceC9968c<? super C46581> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30147f = reviewActivityUnscrambleViewModel;
            this.f30148g = i10;
            this.f30149h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46581 c46581 = new C46581(this.f30147f, this.f30148g, this.f30149h, interfaceC9968c);
            c46581.f30146e = obj;
            return c46581;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46581) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0083  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object next;
            TranslationStudy translationStudy;
            String str;
            String lowerCase;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) this.f30146e;
            int i10 = this.f30148g;
            ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel = this.f30147f;
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
                    str = this.f30149h;
                    lowerCase = str.toLowerCase(locale);
                    C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } while (!(hashSetM14921S.contains(lowerCase) ? hashSetM14921S.contains(translationStudy.f21917b) : C5207g.m11106a(translationStudy.f21917b, str)));
                TranslationStudy translationStudy2 = (TranslationStudy) next;
                if (translationStudy2 != null) {
                    String str2 = translationStudy2.f21916a;
                    if (str2.length() > 0) {
                        reviewActivityUnscrambleViewModel.f30118I.setValue(str2);
                    } else {
                        C7499b.m14933c0(C8573r0.m16767w0(reviewActivityUnscrambleViewModel), reviewActivityUnscrambleViewModel.f30126h, reviewActivityUnscrambleViewModel.f30125g, "networkGoogleSentence", new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(reviewActivityUnscrambleViewModel, reviewActivityUnscrambleViewModel.f30128j, i10, null));
                    }
                } else {
                    C7499b.m14933c0(C8573r0.m16767w0(reviewActivityUnscrambleViewModel), reviewActivityUnscrambleViewModel.f30126h, reviewActivityUnscrambleViewModel.f30125g, "networkGoogleSentence", new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(reviewActivityUnscrambleViewModel, reviewActivityUnscrambleViewModel.f30128j, i10, null));
                }
            } else {
                C7499b.m14933c0(C8573r0.m16767w0(reviewActivityUnscrambleViewModel), reviewActivityUnscrambleViewModel.f30126h, reviewActivityUnscrambleViewModel.f30125g, "networkGoogleSentence", new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(reviewActivityUnscrambleViewModel, reviewActivityUnscrambleViewModel.f30128j, i10, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$loadTranslation$1(ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel, InterfaceC9968c<? super ReviewActivityUnscrambleViewModel$loadTranslation$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30145f = reviewActivityUnscrambleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityUnscrambleViewModel$loadTranslation$1(this.f30145f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityUnscrambleViewModel$loadTranslation$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30144e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel = this.f30145f;
            int i11 = reviewActivityUnscrambleViewModel.f30129k - 1;
            String strMo507p1 = reviewActivityUnscrambleViewModel.mo507p1();
            InterfaceC7116c<LessonStudyTranslationSentence> interfaceC7116cMo9479A = reviewActivityUnscrambleViewModel.f30122d.mo9479A(reviewActivityUnscrambleViewModel.f30128j, i11);
            C46581 c46581 = new C46581(reviewActivityUnscrambleViewModel, i11, strMo507p1, null);
            this.f30144e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9479A, c46581, this) == coroutineSingletons) {
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
