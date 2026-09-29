package com.lingq.p055ui.info;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$buyLesson$1", m19206f = "LessonInfoViewModel.kt", m19207l = {464, 465, 466, 468}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$buyLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26957e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f26958f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f26959g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f26960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$buyLesson$1(LessonInfoViewModel lessonInfoViewModel, int i10, int i11, InterfaceC9968c<? super LessonInfoViewModel$buyLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26958f = lessonInfoViewModel;
        this.f26959g = i10;
        this.f26960h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$buyLesson$1(this.f26958f, this.f26959g, this.f26960h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$buyLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[RETURN] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26957e;
        int i11 = this.f26959g;
        LessonInfoViewModel lessonInfoViewModel = this.f26958f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = lessonInfoViewModel.f26952i.mo9619h();
                this.f26957e = 3;
                obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profile = (Profile) obj;
                profile.f17800t -= this.f26960h;
                interfaceC5180b = lessonInfoViewModel.f26952i;
                this.f26957e = 4;
                if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 == 3) {
                C7499b.m14977z0(obj);
                profile = (Profile) obj;
                profile.f17800t -= this.f26960h;
                interfaceC5180b = lessonInfoViewModel.f26952i;
                this.f26957e = 4;
                if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = lessonInfoViewModel.f26942d;
        this.f26957e = 1;
        if (interfaceC3324a.mo9481C(i11, true, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        InterfaceC3324a interfaceC3324a2 = lessonInfoViewModel.f26942d;
        this.f26957e = 2;
        if (interfaceC3324a2.mo9484F(i11, true, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h2 = lessonInfoViewModel.f26952i.mo9619h();
        this.f26957e = 3;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        profile = (Profile) obj;
        profile.f17800t -= this.f26960h;
        interfaceC5180b = lessonInfoViewModel.f26952i;
        this.f26957e = 4;
        if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
