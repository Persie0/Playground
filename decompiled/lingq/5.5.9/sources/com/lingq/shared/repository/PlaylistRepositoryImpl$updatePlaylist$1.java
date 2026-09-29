package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {377, 379}, m19208m = "updatePlaylist")
public final class PlaylistRepositoryImpl$updatePlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20356d;

    /* JADX INFO: renamed from: e */
    public String f20357e;

    /* JADX INFO: renamed from: f */
    public String f20358f;

    /* JADX INFO: renamed from: g */
    public Object f20359g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20360h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistRepositoryImpl f20361i;

    /* JADX INFO: renamed from: j */
    public int f20362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$updatePlaylist$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$updatePlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20361i = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20360h = obj;
        this.f20362j |= Integer.MIN_VALUE;
        return this.f20361i.mo6110e(null, null, null, this);
    }
}
