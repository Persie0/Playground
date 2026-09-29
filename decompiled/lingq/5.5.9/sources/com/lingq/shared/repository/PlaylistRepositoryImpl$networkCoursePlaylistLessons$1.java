package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {889, 892, 905}, m19208m = "networkCoursePlaylistLessons")
final class PlaylistRepositoryImpl$networkCoursePlaylistLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20284d;

    /* JADX INFO: renamed from: e */
    public String f20285e;

    /* JADX INFO: renamed from: f */
    public int f20286f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20287g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PlaylistRepositoryImpl f20288h;

    /* JADX INFO: renamed from: i */
    public int f20289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$networkCoursePlaylistLessons$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$networkCoursePlaylistLessons$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20288h = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20287g = obj;
        this.f20289i |= Integer.MIN_VALUE;
        return this.f20288h.mo6116k(0, null, this);
    }
}
