package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {749, 751}, m19208m = "removePlaylistLesson")
final class PlaylistRepositoryImpl$removePlaylistLesson$5 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20348d;

    /* JADX INFO: renamed from: e */
    public String f20349e;

    /* JADX INFO: renamed from: f */
    public String f20350f;

    /* JADX INFO: renamed from: g */
    public int f20351g;

    /* JADX INFO: renamed from: h */
    public int f20352h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20353i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistRepositoryImpl f20354j;

    /* JADX INFO: renamed from: k */
    public int f20355k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLesson$5(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$removePlaylistLesson$5> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20354j = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20353i = obj;
        this.f20355k |= Integer.MIN_VALUE;
        return this.f20354j.mo6108c(0, 0, null, null, this);
    }
}
