package com.lingq.commons.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.iterable.iterableapi.IterableFirebaseMessagingService;
import com.lingq.core.common.R$string;
import com.lingq.core.designsystem.R$drawable;
import com.lingq.p020ui.MainActivity;
import p000.eh0;
import p000.fb4;
import p000.k58;
import p000.ly8;
import p000.nk3;
import p000.vm6;

/* JADX INFO: loaded from: classes2.dex */
public final class LingQFirebaseMessagingService extends FirebaseMessagingService implements nk3 {

    /* JADX INFO: renamed from: h */
    public volatile ly8 f14165h;

    /* JADX INFO: renamed from: i */
    public final Object f14166i = new Object();

    /* JADX INFO: renamed from: j */
    public boolean f14167j = false;

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f14165h == null) {
            synchronized (this.f14166i) {
                try {
                    if (this.f14165h == null) {
                        this.f14165h = new ly8(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f14165h.mo6995b();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: d */
    public final void mo6715d(RemoteMessage remoteMessage) {
        k58 k58VarM6717J;
        if (IterableFirebaseMessagingService.m6890g(this, remoteMessage) || (k58VarM6717J = remoteMessage.m6717J()) == null) {
            return;
        }
        String str = k58VarM6717J.f46731c;
        Uri uri = k58VarM6717J.f46729a;
        if (uri == null) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(67108864);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
            String string = getString(R$string.default_notification_channel_id);
            string.getClass();
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            vm6 vm6Var = new vm6(this, string);
            vm6Var.f65600t.icon = R$drawable.ic_lingq;
            vm6Var.f65585e = vm6.m23410d("Daily LingQs");
            vm6Var.f65586f = vm6.m23410d(str);
            vm6Var.m23418j(16, true);
            vm6Var.m23422n(defaultUri);
            vm6Var.f65587g = activity;
            Object systemService = getSystemService("notification");
            systemService.getClass();
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.createNotificationChannel(new NotificationChannel(string, "Streak and Due LingQs", 3));
            notificationManager.notify(0, vm6Var.mo15108c());
            return;
        }
        String str2 = k58VarM6717J.f46730b;
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.setData(uri);
        intent2.setAction("android.intent.action.VIEW");
        intent2.addFlags(67108864);
        PendingIntent activity2 = PendingIntent.getActivity(this, 0, intent2, 67108864);
        String string2 = getString(R$string.default_notification_channel_id);
        string2.getClass();
        Uri defaultUri2 = RingtoneManager.getDefaultUri(2);
        vm6 vm6Var2 = new vm6(this, string2);
        vm6Var2.f65600t.icon = R$drawable.ic_lingq;
        vm6Var2.f65585e = vm6.m23410d(str2);
        vm6Var2.f65586f = vm6.m23410d(str);
        vm6Var2.m23418j(16, true);
        vm6Var2.m23422n(defaultUri2);
        vm6Var2.f65587g = activity2;
        Object systemService2 = getSystemService("notification");
        systemService2.getClass();
        NotificationManager notificationManager2 = (NotificationManager) systemService2;
        notificationManager2.createNotificationChannel(new NotificationChannel(string2, "Streak and Due LingQs", 3));
        notificationManager2.notify(0, vm6Var2.mo15108c());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: e */
    public final void mo6716e(String str) {
        str.getClass();
        eh0.m11133m("itblFCMMessagingService", "New Firebase Token generated: " + IterableFirebaseMessagingService.m6889f());
        fb4.f38769t.m11699l();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f14167j) {
            this.f14167j = true;
        }
        super.onCreate();
    }
}
