package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Playlist;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {485, 494, 496, 498, 499, 501, 504, 512, 514}, m19208m = "networkPlaylists")
public final class PlaylistRepositoryImpl$networkPlaylists$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20312d;

    /* JADX INFO: renamed from: e */
    public String f20313e;

    /* JADX INFO: renamed from: f */
    public Object f20314f;

    /* JADX INFO: renamed from: g */
    public Iterator f20315g;

    /* JADX INFO: renamed from: h */
    public Playlist f20316h;

    /* JADX INFO: renamed from: i */
    public Playlist f20317i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f20318j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ PlaylistRepositoryImpl f20319k;

    /* JADX INFO: renamed from: l */
    public int f20320l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$networkPlaylists$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$networkPlaylists$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20319k = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20318j = obj;
        this.f20320l |= Integer.MIN_VALUE;
        return this.f20319k.mo6097C(null, this);
    }
}
