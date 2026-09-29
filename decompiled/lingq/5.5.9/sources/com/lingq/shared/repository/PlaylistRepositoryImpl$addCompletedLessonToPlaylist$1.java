package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {326, 328, 330}, m19208m = "addCompletedLessonToPlaylist")
final class PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20210d;

    /* JADX INFO: renamed from: e */
    public UserPlaylist f20211e;

    /* JADX INFO: renamed from: f */
    public int f20212f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20213g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PlaylistRepositoryImpl f20214h;

    /* JADX INFO: renamed from: i */
    public int f20215i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$addCompletedLessonToPlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20214h = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20213g = obj;
        this.f20215i |= Integer.MIN_VALUE;
        return this.f20214h.mo6119n(0, null, this);
    }
}
