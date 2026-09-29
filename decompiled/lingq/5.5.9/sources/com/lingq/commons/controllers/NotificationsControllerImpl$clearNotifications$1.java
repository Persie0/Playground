package com.lingq.commons.controllers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.NotificationsControllerImpl", m19206f = "NotificationsController.kt", m19207l = {51, 53}, m19208m = "clearNotifications")
public final class NotificationsControllerImpl$clearNotifications$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NotificationsControllerImpl f16554d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16555e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsControllerImpl f16556f;

    /* JADX INFO: renamed from: g */
    public int f16557g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$clearNotifications$1(NotificationsControllerImpl notificationsControllerImpl, InterfaceC9968c<? super NotificationsControllerImpl$clearNotifications$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f16556f = notificationsControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f16555e = obj;
        this.f16557g |= Integer.MIN_VALUE;
        return this.f16556f.mo9329O(this);
    }
}
