package com.lingq.p055ui.lesson.player;

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
import no.C7828f;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "lessonId", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$_sentencesTranslations$1", m19206f = "ListeningModeViewModel.kt", m19207l = {98, 97}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$_sentencesTranslations$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, Integer, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28831e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28832f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f28833g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ListeningModeViewModel f28834h;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$_sentencesTranslations$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$_sentencesTranslations$1$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44041 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ListeningModeViewModel f28835e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f28836f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44041(ListeningModeViewModel listeningModeViewModel, int i10, InterfaceC9968c<? super C44041> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28835e = listeningModeViewModel;
            this.f28836f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C44041(this.f28835e, this.f28836f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44041) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ListeningModeViewModel listeningModeViewModel = this.f28835e;
            listeningModeViewModel.f28802R.setValue(Boolean.TRUE);
            C7828f.m15570d(C8573r0.m16767w0(listeningModeViewModel), null, null, new ListeningModeViewModel$networkUpdateSentences$1(listeningModeViewModel, this.f28836f, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$_sentencesTranslations$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$_sentencesTranslations$1$2", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44052 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f28837e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListeningModeViewModel f28838f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44052(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super C44052> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f28838f = listeningModeViewModel;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C44052 c44052 = new C44052(this.f28838f, interfaceC9968c);
            c44052.f28837e = th2;
            return c44052.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Throwable th2 = this.f28837e;
            this.f28838f.f28802R.setValue(Boolean.FALSE);
            th2.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeViewModel$_sentencesTranslations$1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super ListeningModeViewModel$_sentencesTranslations$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f28834h = listeningModeViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        int iIntValue = num.intValue();
        ListeningModeViewModel$_sentencesTranslations$1 listeningModeViewModel$_sentencesTranslations$1 = new ListeningModeViewModel$_sentencesTranslations$1(this.f28834h, interfaceC9968c);
        listeningModeViewModel$_sentencesTranslations$1.f28832f = interfaceC7117d;
        listeningModeViewModel$_sentencesTranslations$1.f28833g = iIntValue;
        return listeningModeViewModel$_sentencesTranslations$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        InterfaceC7117d interfaceC7117d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f28831e;
        ListeningModeViewModel listeningModeViewModel = this.f28834h;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f28833g;
                interfaceC7117d = this.f28832f;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC7117d interfaceC7117d2 = this.f28832f;
        i10 = this.f28833g;
        InterfaceC3324a interfaceC3324a = listeningModeViewModel.f28807d;
        listeningModeViewModel.mo498E1();
        this.f28832f = interfaceC7117d2;
        this.f28833g = i10;
        this.f28831e = 1;
        InterfaceC7116c interfaceC7116cMo9537y = interfaceC3324a.mo9537y(i10);
        if (interfaceC7116cMo9537y == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC7117d = interfaceC7117d2;
        obj = interfaceC7116cMo9537y;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C44041(listeningModeViewModel, i10, null), (InterfaceC7116c) obj), new C44052(listeningModeViewModel, null));
        this.f28832f = null;
        this.f28831e = 2;
        return C0062b.m280J0(this, flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, interfaceC7117d) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
