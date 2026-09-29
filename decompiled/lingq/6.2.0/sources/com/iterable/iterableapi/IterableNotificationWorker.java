package com.iterable.iterableapi;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p000.eh0;
import p000.fb4;
import p000.gc3;
import p000.jad;
import p000.kc4;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.qgd;
import p000.sz1;
import p000.vm6;

/* JADX INFO: loaded from: classes2.dex */
public final class IterableNotificationWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IterableNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX INFO: renamed from: f */
    public static final sz1 m6892f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                jSONObject.put(str, string);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("notification_data_json", jSONObject.toString());
        sz1 sz1Var = new sz1(linkedHashMap);
        jad.m14369d(sz1Var);
        return sz1Var;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m6893g(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            return bundle;
        } catch (Exception e) {
            eh0.m11136q("IterableNotificationWorker", "Error parsing notification JSON: " + e.getMessage(), e);
            return bundle;
        }
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: d */
    public final og5 mo2901d() {
        Context context = this.f56131a;
        eh0.m11133m("IterableNotificationWorker", "Starting notification processing in Worker");
        try {
            String strM21787e = this.f56132b.f7166b.m21787e("notification_data_json");
            if (strM21787e != null && strM21787e.length() != 0) {
                Bundle bundleM6893g = m6893g(strM21787e);
                if (bundleM6893g.keySet().size() == 0) {
                    eh0.m11135p("IterableNotificationWorker", "Deserialized bundle is empty");
                    return new lg5();
                }
                kc4 kc4VarM19954a = qgd.m19954a(context, bundleM6893g);
                if (kc4VarM19954a == null) {
                    eh0.m11121R("IterableNotificationWorker", "Notification builder is null, skipping");
                    return og5.m17981a();
                }
                qgd.m19961h(context, kc4VarM19954a);
                eh0.m11133m("IterableNotificationWorker", "Notification posted successfully");
                return og5.m17981a();
            }
            eh0.m11135p("IterableNotificationWorker", "No notification data provided to Worker");
            return new lg5();
        } catch (Exception e) {
            eh0.m11136q("IterableNotificationWorker", "Error processing notification in Worker", e);
            return new mg5();
        }
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: e */
    public final gc3 mo2902e() {
        int identifier;
        String string;
        Context context = this.f56131a;
        String packageName = context.getPackageName();
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(packageName) == null) {
            String str = "Notifications";
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && (string = bundle.getString("iterable_notification_channel_name")) != null) {
                    str = string;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            notificationManager.createNotificationChannel(new NotificationChannel(packageName, str, 2));
        }
        vm6 vm6Var = new vm6(context, packageName);
        try {
            ApplicationInfo applicationInfo2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo2.getClass();
            Bundle bundle2 = applicationInfo2.metaData;
            identifier = bundle2 != null ? bundle2.getInt("iterable_notification_icon", 0) : 0;
        } catch (PackageManager.NameNotFoundException unused2) {
            eh0.m11121R("IterableNotificationWorker", "Could not read application metadata for icon");
        }
        if (identifier == 0) {
            Resources resources = context.getResources();
            fb4 fb4Var = fb4.f38769t;
            identifier = resources.getIdentifier(context.getSharedPreferences("iterable_notification_icon", 0).getString("iterable_notification_icon", ""), "drawable", context.getPackageName());
        }
        if (identifier == 0) {
            identifier = context.getApplicationInfo().icon;
        }
        vm6Var.f65600t.icon = identifier;
        vm6Var.f65585e = vm6.m23410d(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
        vm6Var.f65590j = -1;
        Notification notificationMo15108c = vm6Var.mo15108c();
        notificationMo15108c.getClass();
        return new gc3(10101, 0, notificationMo15108c);
    }
}
