package com.iterable.iterableapi;

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.cl9;
import p000.eh0;
import p000.ic4;
import p000.jc4;

/* JADX INFO: renamed from: com.iterable.iterableapi.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C1216l {

    /* JADX INFO: renamed from: a */
    public static final C1216l f14055a = new C1216l();

    /* JADX INFO: renamed from: b */
    public static volatile IterableAPIMobileFrameworkType f14056b;

    /* JADX INFO: renamed from: a */
    public static IterableAPIMobileFrameworkType m6946a(Context context) {
        boolean zM6947b = m6947b(ic4.f43924a);
        boolean zM6947b2 = m6947b(ic4.f43925b);
        if (zM6947b && zM6947b2) {
            eh0.m11133m("FrameworkDetector", "Both Flutter and React Native frameworks detected. This is unexpected.");
            String packageName = context.getPackageName();
            packageName.getClass();
            if (!cl9.m4833P(packageName, ".flutter", false) && !m6948c(context, jc4.f45400a)) {
                return m6948c(context, jc4.f45401b) ? IterableAPIMobileFrameworkType.REACT_NATIVE : IterableAPIMobileFrameworkType.REACT_NATIVE;
            }
            return IterableAPIMobileFrameworkType.FLUTTER;
        }
        if (zM6947b) {
            return IterableAPIMobileFrameworkType.FLUTTER;
        }
        if (zM6947b2) {
            return IterableAPIMobileFrameworkType.REACT_NATIVE;
        }
        if (m6948c(context, jc4.f45400a)) {
            return IterableAPIMobileFrameworkType.FLUTTER;
        }
        return m6948c(context, jc4.f45401b) ? IterableAPIMobileFrameworkType.REACT_NATIVE : IterableAPIMobileFrameworkType.NATIVE;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6947b(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Boolean) IterableMobileFrameworkDetector$hasClass$1.f13976b.invoke((String) it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6948c(Context context, List list) {
        try {
            Bundle bundle = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData;
            List<String> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str : list2) {
                    if (bundle != null && bundle.containsKey(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            eh0.m11135p("FrameworkDetector", "Error checking manifest metadata: " + e.getMessage());
            return false;
        }
    }
}
