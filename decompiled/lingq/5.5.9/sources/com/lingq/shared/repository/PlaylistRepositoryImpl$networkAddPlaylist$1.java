package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultPlaylistFolder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {426, 427, 430}, m19208m = "networkAddPlaylist")
public final class PlaylistRepositoryImpl$networkAddPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20276d;

    /* JADX INFO: renamed from: e */
    public String f20277e;

    /* JADX INFO: renamed from: f */
    public Integer f20278f;

    /* JADX INFO: renamed from: g */
    public String f20279g;

    /* JADX INFO: renamed from: h */
    public ResultPlaylistFolder f20280h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20281i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistRepositoryImpl f20282j;

    /* JADX INFO: renamed from: k */
    public int f20283k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$networkAddPlaylist$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$networkAddPlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20282j = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20281i = obj;
        this.f20283k |= Integer.MIN_VALUE;
        return this.f20282j.mo6131z(null, null, null, null, this);
    }
}
