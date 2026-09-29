package com.lingq.commons.controllers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.NotificationsControllerImpl", m19206f = "NotificationsController.kt", m19207l = {45, 47}, m19208m = "updateUnreadNotifications")
public final class NotificationsControllerImpl$updateUnreadNotifications$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NotificationsControllerImpl f16560d;

    /* JADX INFO: renamed from: e */
    public int f16561e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16562f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NotificationsControllerImpl f16563g;

    /* JADX INFO: renamed from: h */
    public int f16564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$updateUnreadNotifications$1(NotificationsControllerImpl notificationsControllerImpl, InterfaceC9968c<? super NotificationsControllerImpl$updateUnreadNotifications$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f16563g = notificationsControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f16562f = obj;
        this.f16564h |= Integer.MIN_VALUE;
        return this.f16563g.mo9328D0(0, this);
    }
}
