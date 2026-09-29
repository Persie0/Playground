package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$shouldDisableDownloads$1", m19206f = "PlaylistViewModel.kt", m19207l = {1104}, m19208m = "invokeSuspend")
final class PlaylistViewModel$shouldDisableDownloads$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25831e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$shouldDisableDownloads$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$shouldDisableDownloads$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25832f = playlistViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$shouldDisableDownloads$1(this.f25832f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        return ((PlaylistViewModel$shouldDisableDownloads$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25831e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PreferenceStoreImpl$special$$inlined$map$23 preferenceStoreImpl$special$$inlined$map$23Mo9578Y = this.f25832f.f25619l.mo9578Y();
            this.f25831e = 1;
            obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$23Mo9578Y, this);
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
