package com.iterable.iterableapi;

import android.os.Bundle;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import p000.RunnableC3470pr;
import p000.eh0;
import p000.fb4;
import p000.kc4;
import p000.q43;
import p000.qb4;
import p000.qgd;
import p000.vqb;
import p000.web;
import p000.wr9;

/* JADX INFO: loaded from: classes.dex */
public class IterableFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX INFO: renamed from: f */
    public static String m6889f() {
        FirebaseMessaging firebaseMessaging;
        try {
            try {
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(q43.m19641c());
                }
                firebaseMessaging.getClass();
                wr9 wr9Var = new wr9();
                firebaseMessaging.f13726f.execute(new RunnableC3470pr(15, firebaseMessaging, wr9Var));
                return (String) Tasks.await(wr9Var.f67208a);
            } catch (Exception unused) {
                eh0.m11135p("itblFCMMessagingService", "Failed to fetch firebase token");
                return null;
            }
        } catch (InterruptedException | ExecutionException e) {
            eh0.m11135p("itblFCMMessagingService", e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: g */
    public static boolean m6890g(FirebaseMessagingService firebaseMessagingService, RemoteMessage remoteMessage) {
        HashMap mapM6718r = remoteMessage.m6718r();
        if (mapM6718r.size() == 0) {
            return false;
        }
        eh0.m11133m("itblFCMMessagingService", "Message data payload: " + remoteMessage.m6718r());
        if (remoteMessage.m6717J() != null) {
            eh0.m11133m("itblFCMMessagingService", "Message Notification Body: " + remoteMessage.m6717J().m14855a());
        }
        Bundle bundleM19960g = qgd.m19960g(mapM6718r);
        if (!qgd.m19959f(bundleM19960g)) {
            eh0.m11133m("itblFCMMessagingService", "Not an Iterable push message");
            return false;
        }
        if (qgd.m19958e(bundleM19960g)) {
            eh0.m11133m("itblFCMMessagingService", "Iterable ghost silent push received");
            String string = bundleM19960g.getString("notificationType");
            if (string != null && fb4.f38769t.f38770a != null) {
                switch (string) {
                    case "UpdateEmbedded":
                        qb4 qb4VarM11694e = fb4.f38769t.m11694e();
                        qb4VarM11694e.getClass();
                        qb4.m19846c(qb4VarM11694e);
                        break;
                    case "InAppRemove":
                        String string2 = bundleM19960g.getString("messageId");
                        if (string2 != null) {
                            C1210f c1210fM11695f = fb4.f38769t.m11695f();
                            synchronized (c1210fM11695f) {
                                try {
                                    C1212h c1212hM16520x = c1210fM11695f.f14016c.m16520x(string2);
                                    if (c1212hM16520x != null) {
                                        c1210fM11695f.f14016c.m16490J(c1212hM16520x);
                                    }
                                    c1210fM11695f.m6913e();
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                        }
                        break;
                    case "InAppUpdate":
                        fb4.f38769t.m11695f().m6917i();
                        break;
                }
            }
        } else if (qgd.m19957d(bundleM19960g)) {
            eh0.m11133m("itblFCMMessagingService", "Iterable OS notification push received");
        } else {
            eh0.m11133m("itblFCMMessagingService", "Iterable push received " + mapM6718r);
            if (qgd.m19956c(bundleM19960g)) {
                new vqb(firebaseMessagingService).m23479x(bundleM19960g, new web(firebaseMessagingService));
            } else {
                m6891h(firebaseMessagingService, bundleM19960g);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m6891h(FirebaseMessagingService firebaseMessagingService, Bundle bundle) {
        if (qgd.m19956c(bundle)) {
            eh0.m11121R("itblFCMMessagingService", "image found when handling on main thread, removing it for safe handling");
            bundle = qgd.m19962i(bundle);
        }
        try {
            kc4 kc4VarM19954a = qgd.m19954a(firebaseMessagingService.getApplicationContext(), bundle);
            if (kc4VarM19954a != null) {
                qgd.m19961h(firebaseMessagingService, kc4VarM19954a);
            }
        } catch (Exception e) {
            eh0.m11136q("itblFCMMessagingService", "Failed to post notification directly", e);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: d */
    public final void mo6715d(RemoteMessage remoteMessage) {
        m6890g(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: e */
    public final void mo6716e(String str) {
        eh0.m11133m("itblFCMMessagingService", "New Firebase Token generated: " + m6889f());
        fb4.f38769t.m11699l();
    }
}
