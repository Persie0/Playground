package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsViewModel$playlists$1", m19206f = "PlaylistsViewModel.kt", m19207l = {42}, m19208m = "invokeSuspend")
final class PlaylistsViewModel$playlists$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends UserPlaylist>>, List<? extends UserPlaylist>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25928e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f25929f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f25930g;

    public PlaylistsViewModel$playlists$1(InterfaceC9968c<? super PlaylistsViewModel$playlists$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends UserPlaylist>> interfaceC7117d, List<? extends UserPlaylist> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        PlaylistsViewModel$playlists$1 playlistsViewModel$playlists$1 = new PlaylistsViewModel$playlists$1(interfaceC9968c);
        playlistsViewModel$playlists$1.f25929f = interfaceC7117d;
        playlistsViewModel$playlists$1.f25930g = list;
        return playlistsViewModel$playlists$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25928e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f25929f;
            ArrayList arrayListM13421O = C6752c.m13421O(this.f25930g);
            this.f25929f = null;
            this.f25928e = 1;
            if (interfaceC7117d.mo1339r(arrayListM13421O, this) == coroutineSingletons) {
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
