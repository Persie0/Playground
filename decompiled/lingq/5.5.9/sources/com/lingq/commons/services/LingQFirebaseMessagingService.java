package com.lingq.commons.services;

import ae.C0062b;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.firebase.messaging.C3253p;
import com.google.firebase.messaging.RemoteMessage;
import com.lingq.p055ui.MainActivity;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import mh.AbstractServiceC7559a;
import p043c7.C1735a;
import p076di.InterfaceC5179a;
import p232l2.C7236o;
import p290o6.C7987z;
import p290o6.CallableC7980s;
import tl.C9336x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/commons/services/LingQFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LingQFirebaseMessagingService extends AbstractServiceC7559a {

    /* JADX INFO: renamed from: d */
    public InterfaceC5179a f16709d;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        C5207g.m11111f(remoteMessage, "remoteMessage");
        C5207g.m11110e(remoteMessage.m9238q(), "remoteMessage.data");
        Map<String, String> mapM9238q = remoteMessage.m9238q();
        C5207g.m11110e(mapM9238q, "remoteMessage.data");
        Pair[] pairArr = (Pair[]) C9336x.m17688U0(mapM9238q).toArray(new Pair[0]);
        if (CleverTapAPI.m6421h(C0062b.m327Z((Pair[]) Arrays.copyOf(pairArr, pairArr.length))).f52296b) {
            Map<String, String> mapM9238q2 = remoteMessage.m9238q();
            C5207g.m11110e(mapM9238q2, "remoteMessage.data");
            Pair[] pairArr2 = (Pair[]) C9336x.m17688U0(mapM9238q2).toArray(new Pair[0]);
            Bundle bundleM327Z = C0062b.m327Z((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            CleverTapAPI cleverTapAPIM6419d = CleverTapAPI.m6419d(this, bundleM327Z.getString("wzrk_acct_id"));
            if (cleverTapAPIM6419d != null) {
                C7987z c7987z = cleverTapAPIM6419d.f10981b;
                CleverTapInstanceConfig cleverTapInstanceConfig = c7987z.f43471a;
                try {
                    C1735a.m5472a(cleverTapInstanceConfig).m5474b().m6585b("CleverTapAPI#createNotification", new CallableC7980s(c7987z, this, bundleM327Z));
                } catch (Throwable th2) {
                    cleverTapInstanceConfig.m6433b().getClass();
                    C2181a.m6453e(cleverTapInstanceConfig.f10995a, "Failed to process createNotification()", th2);
                }
            }
        }
        if (remoteMessage.f16324c == null) {
            Bundle bundle = remoteMessage.f16322a;
            if (C3253p.m9275l(bundle)) {
                remoteMessage.f16324c = new RemoteMessage.C3230a(new C3253p(bundle));
            }
        }
        RemoteMessage.C3230a c3230a = remoteMessage.f16324c;
        if (c3230a != null) {
            String str = c3230a.f16326b;
            Uri uri = c3230a.f16327c;
            if (uri == null) {
                Intent intent = new Intent(this, (Class<?>) MainActivity.class);
                intent.addFlags(67108864);
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
                String string = getString(R.string.default_notification_channel_id);
                C5207g.m11110e(string, "getString(R.string.defau…_notification_channel_id)");
                Uri defaultUri = RingtoneManager.getDefaultUri(2);
                C7236o c7236o = new C7236o(this, string);
                c7236o.f40664x.icon = R.drawable.ic_lingq;
                c7236o.m14579d("Daily LingQs");
                c7236o.f40646f = C7236o.m14576c(str);
                c7236o.m14580e(16, true);
                c7236o.m14582g(defaultUri);
                c7236o.f40647g = activity;
                Object systemService = getSystemService("notification");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationManager notificationManager = (NotificationManager) systemService;
                notificationManager.createNotificationChannel(new NotificationChannel(string, "Streak and Due LingQs", 3));
                notificationManager.notify(0, c7236o.m14578b());
                return;
            }
            String str2 = c3230a.f16325a;
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
            String string2 = getString(R.string.default_notification_channel_id);
            C5207g.m11110e(string2, "getString(R.string.defau…_notification_channel_id)");
            Uri defaultUri2 = RingtoneManager.getDefaultUri(2);
            C7236o c7236o2 = new C7236o(this, string2);
            c7236o2.f40664x.icon = R.drawable.ic_lingq;
            c7236o2.m14579d(str2);
            c7236o2.f40646f = C7236o.m14576c(str);
            c7236o2.m14580e(16, true);
            c7236o2.m14582g(defaultUri2);
            c7236o2.f40647g = activity2;
            Object systemService2 = getSystemService("notification");
            C5207g.m11109d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager2 = (NotificationManager) systemService2;
            notificationManager2.createNotificationChannel(new NotificationChannel(string2, "Streak and Due LingQs", 3));
            notificationManager2.notify(0, c7236o2.m14578b());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        C5207g.m11111f(str, "token");
    }
}
