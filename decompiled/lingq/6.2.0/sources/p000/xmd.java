package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xmd {

    /* JADX INFO: renamed from: f */
    public static HashMap f68372f;

    /* JADX INFO: renamed from: k */
    public static Object f68377k;

    /* JADX INFO: renamed from: l */
    public static boolean f68378l;

    /* JADX INFO: renamed from: a */
    public static final Uri f68367a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Uri f68368b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c */
    public static final Pattern f68369c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f68370d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f68371e = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    public static final HashMap f68373g = new HashMap();

    /* JADX INFO: renamed from: h */
    public static final HashMap f68374h = new HashMap();

    /* JADX INFO: renamed from: i */
    public static final HashMap f68375i = new HashMap();

    /* JADX INFO: renamed from: j */
    public static final HashMap f68376j = new HashMap();

    /* JADX INFO: renamed from: m */
    public static final String[] f68379m = new String[0];

    /* JADX INFO: renamed from: a */
    public static Object m24615a(HashMap map, String str, Object obj) {
        synchronized (xmd.class) {
            try {
                if (!map.containsKey(str)) {
                    return null;
                }
                Object obj2 = map.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX INFO: renamed from: b */
    public static String m24616b(ContentResolver contentResolver, String str) {
        String str2;
        synchronized (xmd.class) {
            try {
                m24617c(contentResolver);
                Object obj = f68377k;
                String str3 = null;
                if (f68372f.containsKey(str)) {
                    String str4 = (String) f68372f.get(str);
                    return str4 != null ? str4 : null;
                }
                for (String str5 : f68379m) {
                    if (str.startsWith(str5)) {
                        if (!f68378l || f68372f.isEmpty()) {
                            String[] strArr = f68379m;
                            HashMap map = f68372f;
                            Cursor cursorQuery = contentResolver.query(f68368b, null, null, strArr, null);
                            TreeMap treeMap = new TreeMap();
                            if (cursorQuery != null) {
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorQuery.close();
                                        throw th;
                                    }
                                }
                                cursorQuery.close();
                            }
                            map.putAll(treeMap);
                            f68378l = true;
                            if (f68372f.containsKey(str) && (str2 = (String) f68372f.get(str)) != null) {
                                str3 = str2;
                            }
                        }
                        return str3;
                    }
                }
                Cursor cursorQuery2 = contentResolver.query(f68367a, null, null, new String[]{str}, null);
                if (cursorQuery2 != null) {
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            String string = cursorQuery2.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (xmd.class) {
                                try {
                                    if (obj == f68377k) {
                                        f68372f.put(str, string);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            str3 = string != null ? string : null;
                            cursorQuery2.close();
                            return str3;
                        }
                    } catch (Throwable th3) {
                        if (cursorQuery2 != null) {
                            throw th3;
                        }
                        cursorQuery2.close();
                        throw th3;
                    }
                    if (cursorQuery2 != null) {
                        throw th3;
                    }
                    cursorQuery2.close();
                    throw th3;
                }
                synchronized (xmd.class) {
                    try {
                        if (obj == f68377k) {
                            f68372f.put(str, null);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                return null;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m24617c(ContentResolver contentResolver) {
        HashMap map = f68372f;
        AtomicBoolean atomicBoolean = f68371e;
        if (map == null) {
            atomicBoolean.set(false);
            f68372f = new HashMap();
            f68377k = new Object();
            f68378l = false;
            contentResolver.registerContentObserver(f68367a, true, new ond(null));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            f68372f.clear();
            f68373g.clear();
            f68374h.clear();
            f68375i.clear();
            f68376j.clear();
            f68377k = new Object();
            f68378l = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m24618d(Object obj, HashMap map, String str, Object obj2) {
        synchronized (xmd.class) {
            try {
                if (obj == f68377k) {
                    map.put(str, obj2);
                    f68372f.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
