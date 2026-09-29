package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import ci.InterfaceC2023p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7376c;
import ni.C7793a;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchPopularMeanings$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {214}, m19208m = "invokeSuspend")
final class LessonVocabularyPageViewModel$fetchPopularMeanings$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29300e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyPageViewModel f29301f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f29302g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchPopularMeanings$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/c;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchPopularMeanings$1$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {220}, m19208m = "invokeSuspend")
    public static final class C44881 extends SuspendLambda implements InterfaceC2056p<C7376c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29303e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f29304f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonVocabularyPageViewModel f29305g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f29306h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44881(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, String str, InterfaceC9968c<? super C44881> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29305g = lessonVocabularyPageViewModel;
            this.f29306h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44881 c44881 = new C44881(this.f29305g, this.f29306h, interfaceC9968c);
            c44881.f29304f = obj;
            return c44881;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7376c c7376c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44881) mo1336a(c7376c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            StateFlowImpl stateFlowImpl;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29303e;
            String str = this.f29306h;
            LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29305g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C7376c c7376c = (C7376c) this.f29304f;
                if (c7376c != null) {
                    LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) lessonVocabularyPageViewModel.f29274K.getValue());
                    Locale locale = lessonVocabularyPageViewModel.f29282k;
                    C5207g.m11110e(locale, "locale");
                    String strM15502f = C7793a.m15502f(str, locale);
                    TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7376c.f41165a);
                    if (tokenMeaning == null) {
                        tokenMeaning = new TokenMeaning(0, null, null, 0, false, null, false, 0, 255, null);
                    }
                    linkedHashMapM13467T0.put(strM15502f, tokenMeaning);
                    do {
                        stateFlowImpl = lessonVocabularyPageViewModel.f29274K;
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.mo14366c(value, linkedHashMapM13467T0));
                } else {
                    this.f29303e = 1;
                    if (C7828f.m15567a(100L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            C7828f.m15570d(C8573r0.m16767w0(lessonVocabularyPageViewModel), null, null, new LessonVocabularyPageViewModel$updatePopularMeanings$1(lessonVocabularyPageViewModel, lessonVocabularyPageViewModel.mo498E1(), str, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyPageViewModel$fetchPopularMeanings$1(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, String str, InterfaceC9968c<? super LessonVocabularyPageViewModel$fetchPopularMeanings$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29301f = lessonVocabularyPageViewModel;
        this.f29302g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyPageViewModel$fetchPopularMeanings$1(this.f29301f, this.f29302g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyPageViewModel$fetchPopularMeanings$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29300e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29301f;
            InterfaceC2023p interfaceC2023p = lessonVocabularyPageViewModel.f29278g;
            String strMo498E1 = lessonVocabularyPageViewModel.mo498E1();
            String strMo507p1 = lessonVocabularyPageViewModel.mo507p1();
            String str = this.f29302g;
            InterfaceC7116c<C7376c> interfaceC7116cMo6166d = interfaceC2023p.mo6166d(strMo498E1, str, strMo507p1);
            C44881 c44881 = new C44881(lessonVocabularyPageViewModel, str, null);
            this.f29300e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6166d, c44881, this) == coroutineSingletons) {
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
