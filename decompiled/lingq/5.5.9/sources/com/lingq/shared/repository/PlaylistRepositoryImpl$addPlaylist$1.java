package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {348, 356}, m19208m = "addPlaylist")
final class PlaylistRepositoryImpl$addPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20216d;

    /* JADX INFO: renamed from: e */
    public String f20217e;

    /* JADX INFO: renamed from: f */
    public String f20218f;

    /* JADX INFO: renamed from: g */
    public Integer f20219g;

    /* JADX INFO: renamed from: h */
    public String f20220h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20221i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistRepositoryImpl f20222j;

    /* JADX INFO: renamed from: k */
    public int f20223k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylist$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$addPlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20222j = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20221i = obj;
        this.f20223k |= Integer.MIN_VALUE;
        return this.f20222j.mo6121p(null, null, null, null, this);
    }
}
