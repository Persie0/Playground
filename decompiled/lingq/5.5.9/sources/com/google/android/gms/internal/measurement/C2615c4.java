package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2615c4 {

    /* JADX INFO: renamed from: a */
    public static final Uri f14080a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Pattern f14081b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f14082c;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f14083d;

    /* JADX INFO: renamed from: e */
    public static HashMap f14084e;

    /* JADX INFO: renamed from: f */
    public static final HashMap f14085f;

    /* JADX INFO: renamed from: g */
    public static final HashMap f14086g;

    /* JADX INFO: renamed from: h */
    public static final HashMap f14087h;

    /* JADX INFO: renamed from: i */
    public static final HashMap f14088i;

    /* JADX INFO: renamed from: j */
    public static Object f14089j;

    /* JADX INFO: renamed from: k */
    public static final String[] f14090k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f14081b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f14082c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f14083d = new AtomicBoolean();
        f14085f = new HashMap(16, 1.0f);
        f14086g = new HashMap(16, 1.0f);
        f14087h = new HashMap(16, 1.0f);
        f14088i = new HashMap(16, 1.0f);
        f14090k = new String[0];
    }
}
