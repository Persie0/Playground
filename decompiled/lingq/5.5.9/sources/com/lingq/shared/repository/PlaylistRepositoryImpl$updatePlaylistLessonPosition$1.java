package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {834, 840, 846, 852}, m19208m = "updatePlaylistLessonPosition")
final class PlaylistRepositoryImpl$updatePlaylistLessonPosition$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20363d;

    /* JADX INFO: renamed from: e */
    public String f20364e;

    /* JADX INFO: renamed from: f */
    public int f20365f;

    /* JADX INFO: renamed from: g */
    public int f20366g;

    /* JADX INFO: renamed from: h */
    public int f20367h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20368i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistRepositoryImpl f20369j;

    /* JADX INFO: renamed from: k */
    public int f20370k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$updatePlaylistLessonPosition$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$updatePlaylistLessonPosition$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20369j = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20368i = obj;
        this.f20370k |= Integer.MIN_VALUE;
        return PlaylistRepositoryImpl.m9542L(this.f20369j, null, 0, false, 0, 0, this);
    }
}
