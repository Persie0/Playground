package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p367rh.C8805s;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl", m19206f = "PlaylistRepository.kt", m19207l = {705, 714, 715, 716, 719}, m19208m = "removePlaylistLesson")
public final class PlaylistRepositoryImpl$removePlaylistLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f20331H;

    /* JADX INFO: renamed from: d */
    public PlaylistRepositoryImpl f20332d;

    /* JADX INFO: renamed from: e */
    public String f20333e;

    /* JADX INFO: renamed from: f */
    public String f20334f;

    /* JADX INFO: renamed from: g */
    public Object f20335g;

    /* JADX INFO: renamed from: h */
    public Integer f20336h;

    /* JADX INFO: renamed from: i */
    public C8805s f20337i;

    /* JADX INFO: renamed from: j */
    public int f20338j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f20339k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ PlaylistRepositoryImpl f20340l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLesson$1(PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$removePlaylistLesson$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20340l = playlistRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20339k = obj;
        this.f20331H |= Integer.MIN_VALUE;
        return this.f20340l.mo6104J(null, null, null, 0, null, this);
    }
}
