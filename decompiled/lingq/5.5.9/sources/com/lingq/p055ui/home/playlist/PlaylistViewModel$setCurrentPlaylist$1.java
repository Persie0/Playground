package com.lingq.p055ui.home.playlist;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel", m19206f = "PlaylistViewModel.kt", m19207l = {844, 846, 850, 852}, m19208m = "setCurrentPlaylist")
final class PlaylistViewModel$setCurrentPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistViewModel f25814d;

    /* JADX INFO: renamed from: e */
    public UserPlaylist f25815e;

    /* JADX INFO: renamed from: f */
    public UserPlaylist f25816f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f25817g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PlaylistViewModel f25818h;

    /* JADX INFO: renamed from: i */
    public int f25819i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setCurrentPlaylist$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$setCurrentPlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f25818h = playlistViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f25817g = obj;
        this.f25819i |= Integer.MIN_VALUE;
        return PlaylistViewModel.m9991l2(this.f25818h, null, this);
    }
}
