package com.lingq.shared.repository;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lcom/lingq/shared/domain/Profile;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1", m19206f = "PlaylistRepository.kt", m19207l = {1026}, m19208m = "invokeSuspend")
final class PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Profile>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20268e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistRepositoryImpl f20269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20269f = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1(this.f20269f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Profile> interfaceC9968c) {
        return ((PlaylistRepositoryImpl$dispatchAddPlaylistWorker$profile$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20268e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20269f.f20205i.mo9619h();
            this.f20268e = 1;
            obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
