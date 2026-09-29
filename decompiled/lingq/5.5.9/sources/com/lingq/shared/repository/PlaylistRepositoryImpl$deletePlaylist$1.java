package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Playlist;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {393, 395, 396, 398, 401, 402}, m19208m = "deletePlaylist")
final class PlaylistRepositoryImpl$deletePlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20260d;

    /* JADX INFO: renamed from: e */
    public String f20261e;

    /* JADX INFO: renamed from: f */
    public Object f20262f;

    /* JADX INFO: renamed from: g */
    public Playlist f20263g;

    /* JADX INFO: renamed from: h */
    public int f20264h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20265i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistRepositoryImpl f20266j;

    /* JADX INFO: renamed from: k */
    public int f20267k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$deletePlaylist$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$deletePlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20266j = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20265i = obj;
        this.f20267k |= Integer.MIN_VALUE;
        return this.f20266j.mo6106a(0, null, null, this);
    }
}
