package com.lingq.p055ui.lesson;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$observeLessonDownload$1", m19206f = "LessonViewModel.kt", m19207l = {1602}, m19208m = "invokeSuspend")
final class LessonViewModel$observeLessonDownload$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27714e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27715f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f27716g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$observeLessonDownload$1$a */
    public static final class C4255a implements InterfaceC7117d<C6698d> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonViewModel f27717a;

        public C4255a(LessonViewModel lessonViewModel) {
            this.f27717a = lessonViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(C6698d c6698d, InterfaceC9968c interfaceC9968c) {
            this.f27717a.f27488j1.setValue(c6698d);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$observeLessonDownload$1(LessonViewModel lessonViewModel, int i10, InterfaceC9968c<? super LessonViewModel$observeLessonDownload$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f27715f = lessonViewModel;
        this.f27716g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$observeLessonDownload$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$observeLessonDownload$1(this.f27715f, this.f27716g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27714e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonViewModel lessonViewModel = this.f27715f;
            InterfaceC7116c<C6698d> interfaceC7116cMo6125t = lessonViewModel.f27469e.mo6125t(lessonViewModel.mo498E1(), this.f27716g);
            C4255a c4255a = new C4255a(lessonViewModel);
            this.f27714e = 1;
            if (interfaceC7116cMo6125t.mo9539a(c4255a, this) == coroutineSingletons) {
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
