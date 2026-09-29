package com.lingq.p055ui.info;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.util.CoroutineJobManager;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p137gj.C5808d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getLesson$1", m19206f = "LessonInfoViewModel.kt", m19207l = {229}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$getLesson$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26978e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f26979f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoViewModel$getLesson$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LessonInfo;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getLesson$1$1", m19206f = "LessonInfoViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41481 extends SuspendLambda implements InterfaceC2056p<LessonInfo, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26980e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoViewModel f26981f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41481(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super C41481> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26981f = lessonInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41481 c41481 = new C41481(this.f26981f, interfaceC9968c);
            c41481.f26980e = obj;
            return c41481;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonInfo lessonInfo, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41481) mo1336a(lessonInfo, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonInfo lessonInfo = (LessonInfo) this.f26980e;
            LessonInfoViewModel lessonInfoViewModel = this.f26981f;
            lessonInfoViewModel.f26922J.setValue(lessonInfo);
            CoroutineDispatcher coroutineDispatcher = lessonInfoViewModel.f26954j;
            CoroutineJobManager coroutineJobManager = lessonInfoViewModel.f26955k;
            C5808d c5808d = lessonInfoViewModel.f26921I;
            if (lessonInfo != null) {
                String strMo498E1 = lessonInfoViewModel.mo498E1();
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(lessonInfoViewModel);
                String strM761g = C0166e.m761g("updateLessonPreview ", c5808d.f35086a);
                int i10 = lessonInfo.f21964a;
                C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, strM761g, new LessonInfoViewModel$updateLessonPreview$1(lessonInfoViewModel, strMo498E1, i10, null));
                String strMo498E2 = lessonInfoViewModel.mo498E1();
                C7499b.m14933c0(C8573r0.m16767w0(lessonInfoViewModel), coroutineJobManager, coroutineDispatcher, "lessonPreview " + c5808d.f35086a, new LessonInfoViewModel$getLessonPreview$1(lessonInfoViewModel, strMo498E2, i10, null));
                int i11 = lessonInfo.f21971h;
                LessonInfoViewModel.m10101m2(lessonInfoViewModel, i11);
                LessonInfoViewModel.m10100l2(lessonInfoViewModel, i11);
            }
            if (lessonInfoViewModel.f26922J.getValue() == null) {
                C7499b.m14933c0(C8573r0.m16767w0(lessonInfoViewModel), coroutineJobManager, coroutineDispatcher, C0166e.m761g("getLessonFromLibrary ", c5808d.f35086a), new LessonInfoViewModel$getLessonFromLibrary$1(lessonInfoViewModel, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$getLesson$1(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super LessonInfoViewModel$getLesson$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26979f = lessonInfoViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$getLesson$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$getLesson$1(this.f26979f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26978e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonInfoViewModel lessonInfoViewModel = this.f26979f;
            InterfaceC7116c<LessonInfo> interfaceC7116cMo9507b = lessonInfoViewModel.f26942d.mo9507b(lessonInfoViewModel.f26921I.f35086a);
            C41481 c41481 = new C41481(lessonInfoViewModel, null);
            this.f26978e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9507b, c41481, this) == coroutineSingletons) {
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
