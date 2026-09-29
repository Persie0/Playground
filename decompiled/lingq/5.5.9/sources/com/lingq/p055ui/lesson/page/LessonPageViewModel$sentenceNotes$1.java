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
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$sentenceNotes$1", m19206f = "LessonPageViewModel.kt", m19207l = {1011}, m19208m = "invokeSuspend")
final class LessonPageViewModel$sentenceNotes$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28634e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28635f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28636g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$sentenceNotes$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$sentenceNotes$1$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43771 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28637e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageViewModel f28638f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43771(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super C43771> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28638f = lessonPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43771 c43771 = new C43771(this.f28638f, interfaceC9968c);
            c43771.f28637e = obj;
            return c43771;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43771) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object next;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) this.f28637e;
            if (lessonStudyTranslationSentence != null) {
                StateFlowImpl stateFlowImpl = this.f28638f.f28568o0;
                Iterator<T> it = lessonStudyTranslationSentence.f21900f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!C5207g.m11106a(((TranslationStudy) next).f21917b, "notes"));
                TranslationStudy translationStudy = (TranslationStudy) next;
                if (translationStudy == null || (str = translationStudy.f21916a) == null) {
                    str = "";
                }
                stateFlowImpl.setValue(str);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$sentenceNotes$1(LessonPageViewModel lessonPageViewModel, int i10, InterfaceC9968c<? super LessonPageViewModel$sentenceNotes$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f28635f = lessonPageViewModel;
        this.f28636g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$sentenceNotes$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$sentenceNotes$1(this.f28635f, this.f28636g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28634e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageViewModel lessonPageViewModel = this.f28635f;
            InterfaceC7116c<LessonStudyTranslationSentence> interfaceC7116cMo9479A = lessonPageViewModel.f28552f.mo9479A(this.f28636g, lessonPageViewModel.f28527I);
            C43771 c43771 = new C43771(lessonPageViewModel, null);
            this.f28634e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9479A, c43771, this) == coroutineSingletons) {
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
