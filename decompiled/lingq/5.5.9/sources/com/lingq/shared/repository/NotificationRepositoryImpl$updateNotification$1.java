package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.NotificationRepositoryImpl", m19206f = "NotificationRepository.kt", m19207l = {52}, m19208m = "updateNotification")
public final class NotificationRepositoryImpl$updateNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NotificationRepositoryImpl f20191d;

    /* JADX INFO: renamed from: e */
    public String f20192e;

    /* JADX INFO: renamed from: f */
    public List f20193f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20194g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ NotificationRepositoryImpl f20195h;

    /* JADX INFO: renamed from: i */
    public int f20196i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepositoryImpl$updateNotification$1(NotificationRepositoryImpl notificationRepositoryImpl, InterfaceC9968c<? super NotificationRepositoryImpl$updateNotification$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20195h = notificationRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20194g = obj;
        this.f20196i |= Integer.MIN_VALUE;
        return this.f20195h.mo6093d(null, null, this);
    }
}
