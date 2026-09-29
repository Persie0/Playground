package com.lingq.p055ui.home.playlist;

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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$buyLesson$1", m19206f = "PlaylistViewModel.kt", m19207l = {1122, 1123, 1125}, m19208m = "invokeSuspend")
final class PlaylistViewModel$buyLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25705e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25706f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25707g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f25708h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$buyLesson$1(PlaylistViewModel playlistViewModel, int i10, int i11, InterfaceC9968c<? super PlaylistViewModel$buyLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25706f = playlistViewModel;
        this.f25707g = i10;
        this.f25708h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$buyLesson$1(this.f25706f, this.f25707g, this.f25708h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$buyLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25705e;
        PlaylistViewModel playlistViewModel = this.f25706f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                profile = (Profile) obj;
                profile.f17800t -= this.f25708h;
                interfaceC5180b = playlistViewModel.f25582I;
                this.f25705e = 3;
                if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = playlistViewModel.f25605e;
        this.f25705e = 1;
        if (interfaceC3324a.mo9484F(this.f25707g, true, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = playlistViewModel.f25582I.mo9619h();
        this.f25705e = 2;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        profile = (Profile) obj;
        profile.f17800t -= this.f25708h;
        interfaceC5180b = playlistViewModel.f25582I;
        this.f25705e = 3;
        if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
