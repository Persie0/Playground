package com.google.p020vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import p000.lkm;
import p000.ofz;
import p000.oga;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class VrCoreUtils {
    /* JADX INFO: renamed from: a */
    public static int m5191a(Context context) {
        List<PackageInstaller.SessionInfo> allSessions;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            return 0;
        }
        try {
            if (!context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                return 2;
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
            if (!ofz.m18472a(packageInfo, ofz.f45897a)) {
                if (!(lkm.f38492c != null ? lkm.f38492c.booleanValue() : lkm.m15568I(context)) || !ofz.m18472a(packageInfo, ofz.f45898b)) {
                    return 9;
                }
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            try {
                allSessions = context.getPackageManager().getPackageInstaller().getAllSessions();
            } catch (RuntimeException e2) {
                Log.w("VrCoreUtils", "Failure querying package installer sessions: ".concat(e2.toString()));
                allSessions = null;
            }
            if (allSessions != null) {
                Iterator<PackageInstaller.SessionInfo> it = allSessions.iterator();
                while (it.hasNext()) {
                    if ("com.google.vr.vrcore".equals(it.next().getAppPackageName())) {
                        return 3;
                    }
                }
            }
            try {
                return context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 8192).enabled ? 3 : 1;
            } catch (PackageManager.NameNotFoundException e3) {
            }
        }
    }

    public static int getVrCoreClientApiVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (!applicationInfo.enabled) {
                throw new oga(2);
            }
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            throw new oga(m5191a(context));
        }
    }
}
