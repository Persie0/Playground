package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p159hi.C6050a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$fetchLesson$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {355}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$fetchLesson$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29031e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteViewModel f29032f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteViewModel$fetchLesson$1$a */
    public static final class C4428a implements InterfaceC7117d<C6050a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonCompleteViewModel f29033a;

        public C4428a(LessonCompleteViewModel lessonCompleteViewModel) {
            this.f29033a = lessonCompleteViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(C6050a c6050a, InterfaceC9968c interfaceC9968c) {
            LessonCompleteViewModel lessonCompleteViewModel = this.f29033a;
            lessonCompleteViewModel.f28976K.setValue(c6050a);
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModel), null, null, new LessonCompleteViewModel$getLessonStatistics$1(lessonCompleteViewModel, null), 3);
            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(lessonCompleteViewModel);
            StringBuilder sb2 = new StringBuilder("isLessonInPlaylist ");
            int i10 = lessonCompleteViewModel.f28973H;
            sb2.append(i10);
            C7499b.m14933c0(interfaceC7882zM16767w0, lessonCompleteViewModel.f29007j, lessonCompleteViewModel.f29005i, sb2.toString(), new LessonCompleteViewModel$isLessonInPlaylist$1(lessonCompleteViewModel, i10, null));
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModel), null, null, new LessonCompleteViewModel$getLessonCounters$1(lessonCompleteViewModel, null), 3);
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModel), null, null, new LessonCompleteViewModel$updateCounterForLesson$1(lessonCompleteViewModel, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$fetchLesson$1(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super LessonCompleteViewModel$fetchLesson$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f29032f = lessonCompleteViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$fetchLesson$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$fetchLesson$1(this.f29032f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29031e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonCompleteViewModel lessonCompleteViewModel = this.f29032f;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(lessonCompleteViewModel.f28995d.mo9513e(lessonCompleteViewModel.f28973H), lessonCompleteViewModel.f29005i);
            C4428a c4428a = new C4428a(lessonCompleteViewModel);
            this.f29031e = 1;
            if (interfaceC7116cM307S0.mo9539a(c4428a, this) == coroutineSingletons) {
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
