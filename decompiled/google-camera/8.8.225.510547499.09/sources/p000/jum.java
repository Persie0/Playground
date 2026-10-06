package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jum {

    /* JADX INFO: renamed from: f */
    static HashMap f34841f;

    /* JADX INFO: renamed from: l */
    private static Object f34847l;

    /* JADX INFO: renamed from: m */
    private static boolean f34848m;

    /* JADX INFO: renamed from: a */
    public static final Uri f34836a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Uri f34837b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c */
    public static final Pattern f34838c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f34839d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f34840e = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    static final HashMap f34842g = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: h */
    static final HashMap f34843h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i */
    public static final HashMap f34844i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j */
    static final HashMap f34845j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: k */
    static final String[] f34846k = new String[0];

    /* JADX INFO: renamed from: a */
    public static int m13512a(ContentResolver contentResolver, String str, int i) {
        Object objM13514c = m13514c(contentResolver);
        Integer numValueOf = (Integer) m13513b(f34843h, str, Integer.valueOf(i));
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String strM13517f = m13517f(contentResolver, str);
        if (strM13517f != null) {
            try {
                int i2 = Integer.parseInt(strM13517f);
                numValueOf = Integer.valueOf(i2);
                i = i2;
            } catch (NumberFormatException e) {
            }
        }
        m13516e(objM13514c, f34843h, str, numValueOf);
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static Object m13513b(HashMap map, String str, Object obj) {
        synchronized (jum.class) {
            if (!map.containsKey(str)) {
                return null;
            }
            Object obj2 = map.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m13514c(ContentResolver contentResolver) {
        Object obj;
        synchronized (jum.class) {
            m13518g(contentResolver);
            obj = f34847l;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static Map m13515d(ContentResolver contentResolver, String[] strArr, jul julVar) {
        Cursor cursorQuery = contentResolver.query(f34837b, null, null, strArr, null);
        if (cursorQuery == null) {
            return julVar.mo13510a();
        }
        ?? Mo13511b = julVar.mo13511b(cursorQuery.getCount());
        while (cursorQuery.moveToNext()) {
            try {
                Mo13511b.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return Mo13511b;
    }

    /* JADX INFO: renamed from: e */
    public static void m13516e(Object obj, HashMap map, String str, Object obj2) {
        synchronized (jum.class) {
            if (obj == f34847l) {
                map.put(str, obj2);
                f34841f.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m13517f(ContentResolver contentResolver, String str) {
        synchronized (jum.class) {
            m13518g(contentResolver);
            Object obj = f34847l;
            String str2 = null;
            if (f34841f.containsKey(str)) {
                String str3 = (String) f34841f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            int length = f34846k.length;
            Cursor cursorQuery = contentResolver.query(f34836a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    m13519h(obj, str, string);
                    if (string != null) {
                        str2 = string;
                    }
                } else {
                    m13519h(obj, str, null);
                }
                return str2;
            } finally {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m13518g(ContentResolver contentResolver) {
        if (f34841f == null) {
            f34840e.set(false);
            f34841f = new HashMap(16, 1.0f);
            f34847l = new Object();
            f34848m = false;
            contentResolver.registerContentObserver(f34836a, true, new juj());
            return;
        }
        if (f34840e.getAndSet(false)) {
            f34841f.clear();
            f34842g.clear();
            f34843h.clear();
            f34844i.clear();
            f34845j.clear();
            f34847l = new Object();
            f34848m = false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m13519h(Object obj, String str, String str2) {
        synchronized (jum.class) {
            if (obj == f34847l) {
                f34841f.put(str, str2);
            }
        }
    }
}
