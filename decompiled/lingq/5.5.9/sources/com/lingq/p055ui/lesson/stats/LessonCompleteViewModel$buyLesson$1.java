package com.lingq.p055ui.lesson.stats;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.C7828f;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p159hi.C6050a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$buyLesson$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {680, 681, 683}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$buyLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29027e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteViewModel f29028f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f29029g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f29030h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$buyLesson$1(LessonCompleteViewModel lessonCompleteViewModel, int i10, int i11, InterfaceC9968c<? super LessonCompleteViewModel$buyLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29028f = lessonCompleteViewModel;
        this.f29029g = i10;
        this.f29030h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$buyLesson$1(this.f29028f, this.f29029g, this.f29030h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$buyLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        C6050a c6050a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29027e;
        LessonCompleteViewModel lessonCompleteViewModel = this.f29028f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                profile = (Profile) obj;
                profile.f17800t -= this.f29030h;
                interfaceC5180b = lessonCompleteViewModel.f29003h;
                this.f29027e = 3;
                if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            lessonCompleteViewModel.getClass();
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModel), null, null, new LessonCompleteViewModel$getLessonCounters$1(lessonCompleteViewModel, null), 3);
            c6050a = (C6050a) lessonCompleteViewModel.f28976K.getValue();
            if (c6050a != null) {
                lessonCompleteViewModel.f28985T.mo14371k(c6050a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = lessonCompleteViewModel.f28995d;
        this.f29027e = 1;
        if (interfaceC3324a.mo9484F(this.f29029g, true, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = lessonCompleteViewModel.f29003h.mo9619h();
        this.f29027e = 2;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        profile = (Profile) obj;
        profile.f17800t -= this.f29030h;
        interfaceC5180b = lessonCompleteViewModel.f29003h;
        this.f29027e = 3;
        if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonCompleteViewModel.getClass();
        C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModel), null, null, new LessonCompleteViewModel$getLessonCounters$1(lessonCompleteViewModel, null), 3);
        c6050a = (C6050a) lessonCompleteViewModel.f28976K.getValue();
        if (c6050a != null) {
            lessonCompleteViewModel.f28985T.mo14371k(c6050a);
        }
        return C9072e.f47360a;
    }
}
