package com.tonyodev.fetch2.fetch;

import android.os.Handler;
import android.os.HandlerThread;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13363bv = {1, InstallReferrerClient.InstallReferrerResponse.f10530OK, 3}, m13364d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13365d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, m13366k = 3, m13367mv = {1, 1, 16})
public final class ListenerCoordinator$fetchNotificationHandler$1 extends Lambda implements InterfaceC2041a<Handler> {

    /* JADX INFO: renamed from: b */
    public static final ListenerCoordinator$fetchNotificationHandler$1 f32505b = new ListenerCoordinator$fetchNotificationHandler$1();

    public ListenerCoordinator$fetchNotificationHandler$1() {
        super(0);
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final Handler mo807E() {
        HandlerThread handlerThread = new HandlerThread("FetchNotificationsIO");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
