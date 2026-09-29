package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p159hi.C6050a;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$isLessonInPlaylist$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {374}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$isLessonInPlaylist$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29051e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteViewModel f29052f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f29053g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteViewModel$isLessonInPlaylist$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$isLessonInPlaylist$1$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44341 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f29054e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonCompleteViewModel f29055f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44341(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super C44341> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29055f = lessonCompleteViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44341 c44341 = new C44341(this.f29055f, interfaceC9968c);
            c44341.f29054e = ((Number) obj).intValue();
            return c44341;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44341) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f29054e;
            LessonCompleteViewModel lessonCompleteViewModel = this.f29055f;
            lessonCompleteViewModel.f28975J.setValue(new Integer(i10));
            C6050a c6050a = (C6050a) lessonCompleteViewModel.f28976K.getValue();
            if (c6050a != null) {
                lessonCompleteViewModel.f28996d0.setValue(new AbstractC7791r.a(i10 >= 1, c6050a.f35728h, false, true));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$isLessonInPlaylist$1(LessonCompleteViewModel lessonCompleteViewModel, int i10, InterfaceC9968c<? super LessonCompleteViewModel$isLessonInPlaylist$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f29052f = lessonCompleteViewModel;
        this.f29053g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$isLessonInPlaylist$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$isLessonInPlaylist$1(this.f29052f, this.f29053g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29051e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonCompleteViewModel lessonCompleteViewModel = this.f29052f;
            InterfaceC7116c<Integer> interfaceC7116cMo6095A = lessonCompleteViewModel.f28997e.mo6095A(lessonCompleteViewModel.mo498E1(), this.f29053g);
            C44341 c44341 = new C44341(lessonCompleteViewModel, null);
            this.f29051e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6095A, c44341, this) == coroutineSingletons) {
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
