package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.NoticeRepositoryImpl", m19206f = "NoticeRepository.kt", m19207l = {45}, m19208m = "hideNotices")
public final class NoticeRepositoryImpl$hideNotices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NoticeRepositoryImpl f20167d;

    /* JADX INFO: renamed from: e */
    public List f20168e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20169f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NoticeRepositoryImpl f20170g;

    /* JADX INFO: renamed from: h */
    public int f20171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeRepositoryImpl$hideNotices$1(NoticeRepositoryImpl noticeRepositoryImpl, InterfaceC9968c<? super NoticeRepositoryImpl$hideNotices$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20170g = noticeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20169f = obj;
        this.f20171h |= Integer.MIN_VALUE;
        return this.f20170g.mo6087b(null, null, this);
    }
}
