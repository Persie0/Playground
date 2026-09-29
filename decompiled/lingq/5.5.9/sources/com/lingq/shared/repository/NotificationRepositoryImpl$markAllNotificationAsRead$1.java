package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.NotificationRepositoryImpl", m19206f = "NotificationRepository.kt", m19207l = {59}, m19208m = "markAllNotificationAsRead")
public final class NotificationRepositoryImpl$markAllNotificationAsRead$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NotificationRepositoryImpl f20181d;

    /* JADX INFO: renamed from: e */
    public String f20182e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20183f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NotificationRepositoryImpl f20184g;

    /* JADX INFO: renamed from: h */
    public int f20185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepositoryImpl$markAllNotificationAsRead$1(NotificationRepositoryImpl notificationRepositoryImpl, InterfaceC9968c<? super NotificationRepositoryImpl$markAllNotificationAsRead$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20184g = notificationRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20183f = obj;
        this.f20185h |= Integer.MIN_VALUE;
        return this.f20184g.mo6092c(null, this);
    }
}
