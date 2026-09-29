package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {268, 285, 287}, m19208m = "addPlaylistLesson")
final class PlaylistRepositoryImpl$addPlaylistLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20233d;

    /* JADX INFO: renamed from: e */
    public String f20234e;

    /* JADX INFO: renamed from: f */
    public String f20235f;

    /* JADX INFO: renamed from: g */
    public String f20236g;

    /* JADX INFO: renamed from: h */
    public int f20237h;

    /* JADX INFO: renamed from: i */
    public int f20238i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f20239j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ PlaylistRepositoryImpl f20240k;

    /* JADX INFO: renamed from: l */
    public int f20241l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylistLesson$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$addPlaylistLesson$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20240k = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20239j = obj;
        this.f20241l |= Integer.MIN_VALUE;
        return this.f20240k.mo6103I(0, 0, null, null, null, this);
    }
}
