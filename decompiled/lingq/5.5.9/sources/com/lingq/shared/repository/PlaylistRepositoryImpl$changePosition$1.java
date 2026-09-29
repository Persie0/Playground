package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {803, 804, 806}, m19208m = "changePosition")
public final class PlaylistRepositoryImpl$changePosition$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20242d;

    /* JADX INFO: renamed from: e */
    public Object f20243e;

    /* JADX INFO: renamed from: f */
    public int f20244f;

    /* JADX INFO: renamed from: g */
    public int f20245g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20246h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistRepositoryImpl f20247i;

    /* JADX INFO: renamed from: j */
    public int f20248j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$changePosition$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$changePosition$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20247i = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20246h = obj;
        this.f20248j |= Integer.MIN_VALUE;
        return this.f20247i.mo6122q(0, 0, null, 0, this);
    }
}
