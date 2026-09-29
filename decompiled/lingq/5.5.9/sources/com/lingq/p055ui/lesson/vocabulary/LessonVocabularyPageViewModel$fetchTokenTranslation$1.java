package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import ci.InterfaceC2023p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenTranslationSimple;
import com.lingq.shared.uimodel.token.TokenTranslations;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchTokenTranslation$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {180}, m19208m = "invokeSuspend")
final class LessonVocabularyPageViewModel$fetchTokenTranslation$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29307e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonVocabularyPageViewModel f29308f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f29309g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchTokenTranslation$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenTranslations;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$fetchTokenTranslation$1$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {190}, m19208m = "invokeSuspend")
    public static final class C44891 extends SuspendLambda implements InterfaceC2056p<TokenTranslations, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29310e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f29311f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonVocabularyPageViewModel f29312g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f29313h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44891(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, String str, InterfaceC9968c<? super C44891> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29312g = lessonVocabularyPageViewModel;
            this.f29313h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44891 c44891 = new C44891(this.f29312g, this.f29313h, interfaceC9968c);
            c44891.f29311f = obj;
            return c44891;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TokenTranslations tokenTranslations, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44891) mo1336a(tokenTranslations, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            StateFlowImpl stateFlowImpl;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29310e;
            String str2 = this.f29313h;
            LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29312g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                TokenTranslations tokenTranslations = (TokenTranslations) this.f29311f;
                if (tokenTranslations != null) {
                    LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) lessonVocabularyPageViewModel.f29274K.getValue());
                    Locale locale = lessonVocabularyPageViewModel.f29282k;
                    C5207g.m11110e(locale, "locale");
                    String strM15502f = C7793a.m15502f(str2, locale);
                    TokenTranslationSimple tokenTranslationSimple = (TokenTranslationSimple) C6752c.m13425S(tokenTranslations.f22122b);
                    if (tokenTranslationSimple == null || (str = tokenTranslationSimple.f22117a) == null) {
                        str = "";
                    }
                    linkedHashMapM13467T0.put(strM15502f, new TokenMeaning(0, null, str, 0, false, null, true, 0, 187, null));
                    do {
                        stateFlowImpl = lessonVocabularyPageViewModel.f29274K;
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.mo14366c(value, linkedHashMapM13467T0));
                } else {
                    this.f29310e = 1;
                    if (C7828f.m15567a(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            lessonVocabularyPageViewModel.getClass();
            C7828f.m15570d(C8573r0.m16767w0(lessonVocabularyPageViewModel), null, null, new LessonVocabularyPageViewModel$updateTokenTranslation$1(lessonVocabularyPageViewModel, str2, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyPageViewModel$fetchTokenTranslation$1(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, String str, InterfaceC9968c<? super LessonVocabularyPageViewModel$fetchTokenTranslation$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29308f = lessonVocabularyPageViewModel;
        this.f29309g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonVocabularyPageViewModel$fetchTokenTranslation$1(this.f29308f, this.f29309g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonVocabularyPageViewModel$fetchTokenTranslation$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29307e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29308f;
            InterfaceC2023p interfaceC2023p = lessonVocabularyPageViewModel.f29278g;
            String strMo498E1 = lessonVocabularyPageViewModel.mo498E1();
            String strMo507p1 = lessonVocabularyPageViewModel.mo507p1();
            String str = this.f29309g;
            InterfaceC7116c<TokenTranslations> interfaceC7116cMo6168f = interfaceC2023p.mo6168f(strMo498E1, strMo507p1, str);
            C44891 c44891 = new C44891(lessonVocabularyPageViewModel, str, null);
            this.f29307e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6168f, c44891, this) == coroutineSingletons) {
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
