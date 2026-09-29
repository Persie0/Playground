package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {642, 643}, m19208m = "clearDownloads")
public final class PlaylistRepositoryImpl$clearDownloads$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20256d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20257e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistRepositoryImpl f20258f;

    /* JADX INFO: renamed from: g */
    public int f20259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$clearDownloads$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$clearDownloads$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20258f = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20257e = obj;
        this.f20259g |= Integer.MIN_VALUE;
        return this.f20258f.mo6120o(this);
    }
}
