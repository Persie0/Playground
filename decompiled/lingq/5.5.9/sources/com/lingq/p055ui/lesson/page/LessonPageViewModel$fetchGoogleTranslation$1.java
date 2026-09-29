package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.lesson.TranslationStudy;
import dm.C5207g;
import java.util.Iterator;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$fetchGoogleTranslation$1", m19206f = "LessonPageViewModel.kt", m19207l = {964}, m19208m = "invokeSuspend")
final class LessonPageViewModel$fetchGoogleTranslation$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28601e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28602f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28603g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$fetchGoogleTranslation$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$fetchGoogleTranslation$1$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43751 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28604e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageViewModel f28605f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43751(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super C43751> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28605f = lessonPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43751 c43751 = new C43751(this.f28605f, interfaceC9968c);
            c43751.f28604e = obj;
            return c43751;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43751) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            LessonPageViewModel lessonPageViewModel;
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) this.f28604e;
            if (lessonStudyTranslationSentence != null) {
                Iterator<T> it = lessonStudyTranslationSentence.f21900f.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    lessonPageViewModel = this.f28605f;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!C5207g.m11106a(((TranslationStudy) next).f21917b, lessonPageViewModel.mo507p1()));
                TranslationStudy translationStudy = (TranslationStudy) next;
                if (translationStudy != null) {
                    lessonPageViewModel.f28566m0.setValue(translationStudy.f21916a);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$fetchGoogleTranslation$1(LessonPageViewModel lessonPageViewModel, int i10, InterfaceC9968c<? super LessonPageViewModel$fetchGoogleTranslation$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f28602f = lessonPageViewModel;
        this.f28603g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$fetchGoogleTranslation$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$fetchGoogleTranslation$1(this.f28602f, this.f28603g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28601e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageViewModel lessonPageViewModel = this.f28602f;
            InterfaceC7116c<LessonStudyTranslationSentence> interfaceC7116cMo9479A = lessonPageViewModel.f28552f.mo9479A(this.f28603g, lessonPageViewModel.f28527I);
            C43751 c43751 = new C43751(lessonPageViewModel, null);
            this.f28601e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9479A, c43751, this) == coroutineSingletons) {
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
