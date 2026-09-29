package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1", m19206f = "LessonViewModel.kt", m19207l = {1402, 1410}, m19208m = "invokeSuspend")
final class LessonViewModel$fetchLessonSentences$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27665e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27666f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1$1", m19206f = "LessonViewModel.kt", m19207l = {1407}, m19208m = "invokeSuspend")
    public static final class C42501 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27667e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonViewModel f27668f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42501(LessonViewModel lessonViewModel, InterfaceC9968c<? super C42501> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27668f = lessonViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C42501(this.f27668f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42501) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27667e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = this.f27668f;
                InterfaceC3324a interfaceC3324a = lessonViewModel.f27465d;
                String strMo498E1 = lessonViewModel.mo498E1();
                int iM10152y2 = lessonViewModel.m10152y2();
                this.f27667e = 1;
                if (interfaceC3324a.mo9524l(strMo498E1, iM10152y2, false, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1$2", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42512 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f27669e;

        public C42512(InterfaceC9968c<? super C42512> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C42512 c42512 = new C42512(interfaceC9968c);
            c42512.f27669e = th2;
            return c42512.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f27669e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLessonSentences$1$3", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42523 extends SuspendLambda implements InterfaceC2056p<List<? extends LessonStudyTranslationSentence>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27670e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonViewModel f27671f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42523(LessonViewModel lessonViewModel, InterfaceC9968c<? super C42523> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27671f = lessonViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42523 c42523 = new C42523(this.f27671f, interfaceC9968c);
            c42523.f27670e = obj;
            return c42523;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LessonStudyTranslationSentence> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42523) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f27671f.f27445W0.setValue((List) this.f27670e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$fetchLessonSentences$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$fetchLessonSentences$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27666f = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$fetchLessonSentences$1(this.f27666f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$fetchLessonSentences$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27665e;
        LessonViewModel lessonViewModel = this.f27666f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = lessonViewModel.f27465d;
        lessonViewModel.mo498E1();
        int iM10152y2 = lessonViewModel.m10152y2();
        this.f27665e = 1;
        obj = interfaceC3324a.mo9537y(iM10152y2);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C42501(lessonViewModel, null), (InterfaceC7116c) obj), new C42512(null));
        C42523 c42523 = new C42523(lessonViewModel, null);
        this.f27665e = 2;
        if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c42523, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
