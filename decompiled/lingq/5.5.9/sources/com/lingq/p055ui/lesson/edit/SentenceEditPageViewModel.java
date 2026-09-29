package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2015h;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p204jj.InterfaceC6484e;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/SentenceEditPageViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Ljj/e;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceEditPageViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC6484e {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f28015H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f28016I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f28017J;

    /* JADX INFO: renamed from: K */
    public C7848l1 f28018K;

    /* JADX INFO: renamed from: L */
    public final C7135p f28019L;

    /* JADX INFO: renamed from: M */
    public final C7135p f28020M;

    /* JADX INFO: renamed from: N */
    public final C7135p f28021N;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f28022d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2015h f28023e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3275c f28024f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f28025g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC6484e f28026h;

    /* JADX INFO: renamed from: i */
    public final int f28027i;

    /* JADX INFO: renamed from: j */
    public final boolean f28028j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f28029k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f28030l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {141}, m19208m = "invokeSuspend")
    final class C42991 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28031e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {149}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f28033e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ int f28034f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ SentenceEditPageViewModel f28035g;

            /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1$1$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
            public static final class C106291 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super LessonStudyTranslationSentence>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public /* synthetic */ Throwable f28036e;

                public C106291(InterfaceC9968c<? super C106291> interfaceC9968c) {
                    super(3, interfaceC9968c);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super LessonStudyTranslationSentence> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C106291 c106291 = new C106291(interfaceC9968c);
                    c106291.f28036e = th2;
                    return c106291.mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    this.f28036e.printStackTrace();
                    return C9072e.f47360a;
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1$1$2, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentence", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$1$1$2", m19206f = "SentenceEditPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<LessonStudyTranslationSentence, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public /* synthetic */ Object f28037e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ SentenceEditPageViewModel f28038f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f28038f = sentenceEditPageViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f28038f, interfaceC9968c);
                    anonymousClass2.f28037e = obj;
                    return anonymousClass2;
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(LessonStudyTranslationSentence lessonStudyTranslationSentence, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass2) mo1336a(lessonStudyTranslationSentence, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    this.f28038f.f28030l.setValue((LessonStudyTranslationSentence) this.f28037e);
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28035g = sentenceEditPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28035g, interfaceC9968c);
                anonymousClass1.f28034f = ((Number) obj).intValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f28033e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    int i11 = this.f28034f;
                    SentenceEditPageViewModel sentenceEditPageViewModel = this.f28035g;
                    StateFlowImpl stateFlowImpl = sentenceEditPageViewModel.f28015H;
                    Boolean bool = Boolean.FALSE;
                    stateFlowImpl.setValue(bool);
                    sentenceEditPageViewModel.f28016I.setValue(bool);
                    sentenceEditPageViewModel.f28017J.setValue(new Long(0L));
                    sentenceEditPageViewModel.f28024f.mo9336K();
                    FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(sentenceEditPageViewModel.f28022d.mo9479A(sentenceEditPageViewModel.f28027i, i11 - 1), new C106291(null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(sentenceEditPageViewModel, null);
                    this.f28033e = 1;
                    if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, anonymousClass2, this) == coroutineSingletons) {
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

        public C42991(InterfaceC9968c<? super C42991> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SentenceEditPageViewModel.this.new C42991(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42991) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28031e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SentenceEditPageViewModel sentenceEditPageViewModel = SentenceEditPageViewModel.this;
                StateFlowImpl stateFlowImpl = sentenceEditPageViewModel.f28029k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sentenceEditPageViewModel, null);
                this.f28031e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$2", m19206f = "SentenceEditPageViewModel.kt", m19207l = {156}, m19208m = "invokeSuspend")
    final class C43002 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28039e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$2$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f28041e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ SentenceEditPageViewModel f28042f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28042f = sentenceEditPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28042f, interfaceC9968c);
                anonymousClass1.f28041e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f28042f.f28016I.setValue(Boolean.valueOf(this.f28041e));
                return C9072e.f47360a;
            }
        }

        public C43002(InterfaceC9968c<? super C43002> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SentenceEditPageViewModel.this.new C43002(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43002) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28039e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SentenceEditPageViewModel sentenceEditPageViewModel = SentenceEditPageViewModel.this;
                InterfaceC7116c<Boolean> interfaceC7116cMo9344t = sentenceEditPageViewModel.f28024f.mo9344t();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sentenceEditPageViewModel, null);
                this.f28039e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9344t, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$3", m19206f = "SentenceEditPageViewModel.kt", m19207l = {162}, m19208m = "invokeSuspend")
    final class C43013 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28043e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$3$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Long, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ long f28045e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ SentenceEditPageViewModel f28046f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28046f = sentenceEditPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28046f, interfaceC9968c);
                anonymousClass1.f28045e = ((Number) obj).longValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Long l10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Long.valueOf(l10.longValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                long j10 = this.f28045e;
                SentenceEditPageViewModel sentenceEditPageViewModel = this.f28046f;
                sentenceEditPageViewModel.f28017J.setValue(new Long(j10));
                if (j10 == 0) {
                    sentenceEditPageViewModel.f28016I.setValue(Boolean.FALSE);
                }
                return C9072e.f47360a;
            }
        }

        public C43013(InterfaceC9968c<? super C43013> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SentenceEditPageViewModel.this.new C43013(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43013) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28043e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SentenceEditPageViewModel sentenceEditPageViewModel = SentenceEditPageViewModel.this;
                InterfaceC7116c<Long> interfaceC7116cMo9339c = sentenceEditPageViewModel.f28024f.mo9339c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sentenceEditPageViewModel, null);
                this.f28043e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9339c, anonymousClass1, this) == coroutineSingletons) {
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

    public SentenceEditPageViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2015h interfaceC2015h, ExecutorC7177a executorC7177a, InterfaceC3275c interfaceC3275c, InterfaceC0113j interfaceC0113j, InterfaceC6484e interfaceC6484e, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6484e, "lessonEditDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28022d = interfaceC3324a;
        this.f28023e = interfaceC2015h;
        this.f28024f = interfaceC3275c;
        this.f28025g = interfaceC0113j;
        this.f28026h = interfaceC6484e;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        int i10 = 0;
        this.f28027i = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) c1024c0.m3929b("hasAudio");
        this.f28028j = bool != null ? bool.booleanValue() : false;
        Integer num2 = (Integer) c1024c0.m3929b("sentenceIndex");
        this.f28029k = C7120g.m14379a(Integer.valueOf(num2 != null ? num2.intValue() : i10));
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f28030l = stateFlowImplM14379a;
        Boolean bool2 = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool2);
        this.f28015H = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(bool2);
        this.f28016I = stateFlowImplM14379a3;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(0L);
        this.f28017J = stateFlowImplM14379a4;
        C7136q c7136qM393s0 = C0062b.m393s0(stateFlowImplM14379a, stateFlowImplM14379a2, stateFlowImplM14379a3, stateFlowImplM14379a4, new SentenceEditPageViewModel$adapterItems$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        EmptyList emptyList = EmptyList.f38032a;
        this.f28019L = C0062b.m353h2(c7136qM393s0, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        C7135p c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(mo509w0(), new SentenceEditPageViewModel$locales$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f28020M = c7135pM353h2;
        this.f28021N = C0062b.m353h2(C0062b.m385q0(stateFlowImplM14379a, c7135pM353h2, new SentenceEditPageViewModel$canAddLocales$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42991(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43002(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43013(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f28025g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28025g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f28025g.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28025g.mo499J(profile, interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC7137r<Boolean> mo10155K0() {
        return this.f28026h.mo10155K0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC7137r<Pair<Integer, Integer>> mo10156M0() {
        return this.f28026h.mo10156M0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f28025g.mo500P();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: T */
    public final void mo10157T(int i10) {
        this.f28026h.mo10157T(i10);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: W0 */
    public final void mo10158W0() {
        this.f28026h.mo10158W0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: Z1 */
    public final List<Integer> mo10159Z1() {
        return this.f28026h.mo10159Z1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28025g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f28025g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28025g.mo503f1(interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: i */
    public final void mo10160i(int i10, int i11) {
        this.f28026h.mo10160i(i10, i11);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f28025g.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28025g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f28025g.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10180l2(String str, String str2) {
        C5207g.m11111f(str, "language");
        C4924a.m10450b(this.f28018K);
        this.f28018K = C7828f.m15570d(C8573r0.m16767w0(this), null, null, new SentenceEditPageViewModel$editSentenceTranslation$1(this, str2, str, null), 3);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC7137r<Boolean> mo10161m0() {
        return this.f28026h.mo10161m0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f28025g.mo507p1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: s0 */
    public final void mo10162s0() {
        this.f28026h.mo10162s0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f28025g.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f28025g.mo509w0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: x1 */
    public final void mo10163x1() {
        this.f28026h.mo10163x1();
    }
}
