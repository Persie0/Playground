package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$getStreak$1", m19206f = "LessonViewModel.kt", m19207l = {1714}, m19208m = "invokeSuspend")
final class LessonViewModel$getStreak$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27681e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27682f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$getStreak$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$getStreak$1$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42541 extends SuspendLambda implements InterfaceC2056p<UserLanguageStudyStats, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27683e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonViewModel f27684f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42541(LessonViewModel lessonViewModel, InterfaceC9968c<? super C42541> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27684f = lessonViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42541 c42541 = new C42541(this.f27684f, interfaceC9968c);
            c42541.f27683e = obj;
            return c42541;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguageStudyStats userLanguageStudyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42541) mo1336a(userLanguageStudyStats, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) this.f27683e;
            if (userLanguageStudyStats != null) {
                this.f27684f.f27496m1.setValue(userLanguageStudyStats);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$getStreak$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$getStreak$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f27682f = lessonViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$getStreak$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$getStreak$1(this.f27682f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27681e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonViewModel lessonViewModel = this.f27682f;
            InterfaceC7116c<UserLanguageStudyStats> interfaceC7116cMo6051l = lessonViewModel.f27480h.mo6051l(lessonViewModel.mo498E1());
            C42541 c42541 = new C42541(lessonViewModel, null);
            this.f27681e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6051l, c42541, this) == coroutineSingletons) {
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
