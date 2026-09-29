package com.lingq.p055ui.info;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getPlaylistLessonCount$1", m19206f = "LessonInfoViewModel.kt", m19207l = {154}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$getPlaylistLessonCount$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26998e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f26999f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoViewModel$getPlaylistLessonCount$1$a */
    public static final class C4153a implements InterfaceC7117d<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonInfoViewModel f27000a;

        public C4153a(LessonInfoViewModel lessonInfoViewModel) {
            this.f27000a = lessonInfoViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(Integer num, InterfaceC9968c interfaceC9968c) {
            this.f27000a.f26926N.setValue(new Integer(num.intValue()));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$getPlaylistLessonCount$1(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super LessonInfoViewModel$getPlaylistLessonCount$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26999f = lessonInfoViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$getPlaylistLessonCount$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$getPlaylistLessonCount$1(this.f26999f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26998e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonInfoViewModel lessonInfoViewModel = this.f26999f;
            InterfaceC7116c<Integer> interfaceC7116cMo6095A = lessonInfoViewModel.f26946f.mo6095A(lessonInfoViewModel.mo498E1(), lessonInfoViewModel.f26921I.f35086a);
            C4153a c4153a = new C4153a(lessonInfoViewModel);
            this.f26998e = 1;
            if (interfaceC7116cMo6095A.mo9539a(c4153a, this) == coroutineSingletons) {
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
