package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.vision.C1016a;
import com.google.android.gms.internal.vision.C1021f;
import com.google.android.gms.internal.vision.C1024i;
import com.google.android.gms.internal.vision.C1025j;
import com.google.android.gms.internal.vision.C1029n;
import com.google.android.gms.internal.vision.C1030o;
import com.google.android.gms.internal.vision.zzs;
import java.util.ArrayList;
import java.util.List;
import p000.b6c;
import p000.d6c;
import p000.e6c;
import p000.f6c;
import p000.g6c;
import p000.m9b;
import p000.qhd;

/* JADX INFO: loaded from: classes2.dex */
public class LogUtils {
    public static C1030o zza(long j, int i, String str, String str2, List<C1029n> list, zzs zzsVar) {
        e6c e6cVarM5707l = C1024i.m5707l();
        d6c d6cVarM5703m = C1021f.m5703m();
        if (d6cVarM5703m.f59601c) {
            d6cVarM5703m.m20723d();
            d6cVarM5703m.f59601c = false;
        }
        C1021f.m5701k((C1021f) d6cVarM5703m.f59600b, str2);
        if (d6cVarM5703m.f59601c) {
            d6cVarM5703m.m20723d();
            d6cVarM5703m.f59601c = false;
        }
        C1021f.m5700j((C1021f) d6cVarM5703m.f59600b, j);
        long j2 = i;
        if (d6cVarM5703m.f59601c) {
            d6cVarM5703m.m20723d();
            d6cVarM5703m.f59601c = false;
        }
        C1021f.m5704n((C1021f) d6cVarM5703m.f59600b, j2);
        if (d6cVarM5703m.f59601c) {
            d6cVarM5703m.m20723d();
            d6cVarM5703m.f59601c = false;
        }
        C1021f.m5702l((C1021f) d6cVarM5703m.f59600b, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C1021f) d6cVarM5703m.m20725f());
        if (e6cVarM5707l.f59601c) {
            e6cVarM5707l.m20723d();
            e6cVarM5707l.f59601c = false;
        }
        C1024i.m5706k((C1024i) e6cVarM5707l.f59600b, arrayList);
        f6c f6cVarM5709k = C1025j.m5709k();
        long j3 = zzsVar.f12302b;
        if (f6cVarM5709k.f59601c) {
            f6cVarM5709k.m20723d();
            f6cVarM5709k.f59601c = false;
        }
        C1025j.m5710l((C1025j) f6cVarM5709k.f59600b, j3);
        long j4 = zzsVar.f12301a;
        if (f6cVarM5709k.f59601c) {
            f6cVarM5709k.m20723d();
            f6cVarM5709k.f59601c = false;
        }
        C1025j.m5708j((C1025j) f6cVarM5709k.f59600b, j4);
        long j5 = zzsVar.f12303c;
        if (f6cVarM5709k.f59601c) {
            f6cVarM5709k.m20723d();
            f6cVarM5709k.f59601c = false;
        }
        C1025j.m5711m((C1025j) f6cVarM5709k.f59600b, j5);
        long j6 = zzsVar.f12304d;
        if (f6cVarM5709k.f59601c) {
            f6cVarM5709k.m20723d();
            f6cVarM5709k.f59601c = false;
        }
        C1025j.m5712n((C1025j) f6cVarM5709k.f59600b, j6);
        C1025j c1025j = (C1025j) f6cVarM5709k.m20725f();
        if (e6cVarM5707l.f59601c) {
            e6cVarM5707l.m20723d();
            e6cVarM5707l.f59601c = false;
        }
        C1024i.m5705j((C1024i) e6cVarM5707l.f59600b, c1025j);
        C1024i c1024i = (C1024i) e6cVarM5707l.m20725f();
        g6c g6cVarM5714k = C1030o.m5714k();
        if (g6cVarM5714k.f59601c) {
            g6cVarM5714k.m20723d();
            g6cVarM5714k.f59601c = false;
        }
        C1030o.m5713j((C1030o) g6cVarM5714k.f59600b, c1024i);
        return (C1030o) g6cVarM5714k.m20725f();
    }

    private static String zzb(Context context) {
        try {
            return m9b.m16702a(context).m23949b(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            qhd.m19975a(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C1016a zza(Context context) {
        b6c b6cVarM5696k = C1016a.m5696k();
        String packageName = context.getPackageName();
        if (b6cVarM5696k.f59601c) {
            b6cVarM5696k.m20723d();
            b6cVarM5696k.f59601c = false;
        }
        C1016a.m5695j((C1016a) b6cVarM5696k.f59600b, packageName);
        String strZzb = zzb(context);
        if (strZzb != null) {
            if (b6cVarM5696k.f59601c) {
                b6cVarM5696k.m20723d();
                b6cVarM5696k.f59601c = false;
            }
            C1016a.m5698m((C1016a) b6cVarM5696k.f59600b, strZzb);
        }
        return (C1016a) b6cVarM5696k.m20725f();
    }
}
