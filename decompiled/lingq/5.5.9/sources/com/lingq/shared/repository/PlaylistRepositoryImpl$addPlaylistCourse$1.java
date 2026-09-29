package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {305, 322}, m19208m = "addPlaylistCourse")
final class PlaylistRepositoryImpl$addPlaylistCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20224d;

    /* JADX INFO: renamed from: e */
    public String f20225e;

    /* JADX INFO: renamed from: f */
    public String f20226f;

    /* JADX INFO: renamed from: g */
    public String f20227g;

    /* JADX INFO: renamed from: h */
    public int f20228h;

    /* JADX INFO: renamed from: i */
    public int f20229i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f20230j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ PlaylistRepositoryImpl f20231k;

    /* JADX INFO: renamed from: l */
    public int f20232l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylistCourse$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$addPlaylistCourse$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20231k = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20230j = obj;
        this.f20232l |= Integer.MIN_VALUE;
        return this.f20231k.mo6127v(0, 0, null, null, null, this);
    }
}
