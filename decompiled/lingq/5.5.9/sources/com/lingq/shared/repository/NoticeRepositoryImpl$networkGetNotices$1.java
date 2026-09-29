package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.NoticeRepositoryImpl", m19206f = "NoticeRepository.kt", m19207l = {52, 55}, m19208m = "networkGetNotices")
public final class NoticeRepositoryImpl$networkGetNotices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NoticeRepositoryImpl f20172d;

    /* JADX INFO: renamed from: e */
    public String f20173e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20174f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NoticeRepositoryImpl f20175g;

    /* JADX INFO: renamed from: h */
    public int f20176h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeRepositoryImpl$networkGetNotices$1(NoticeRepositoryImpl noticeRepositoryImpl, InterfaceC9968c<? super NoticeRepositoryImpl$networkGetNotices$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20175g = noticeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20174f = obj;
        this.f20176h |= Integer.MIN_VALUE;
        return this.f20175g.mo6089d(null, this);
    }
}
