package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p367rh.C8805s;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {767, 773, 775, 778}, m19208m = "removePlaylistCourse")
final class PlaylistRepositoryImpl$removePlaylistCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f20321H;

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20322d;

    /* JADX INFO: renamed from: e */
    public String f20323e;

    /* JADX INFO: renamed from: f */
    public Object f20324f;

    /* JADX INFO: renamed from: g */
    public LibraryData f20325g;

    /* JADX INFO: renamed from: h */
    public C8805s f20326h;

    /* JADX INFO: renamed from: i */
    public int f20327i;

    /* JADX INFO: renamed from: j */
    public int f20328j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f20329k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ PlaylistRepositoryImpl f20330l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistCourse$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$removePlaylistCourse$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20330l = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20329k = obj;
        this.f20321H |= Integer.MIN_VALUE;
        return this.f20330l.mo6118m(0, 0, null, null, this);
    }
}
