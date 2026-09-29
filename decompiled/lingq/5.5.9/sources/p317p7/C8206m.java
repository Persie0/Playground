package p317p7;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import dm.C5207g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;
import p333q7.C8502d;

/* JADX INFO: renamed from: p7.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8206m {

    /* JADX INFO: renamed from: c */
    public static SharedPreferences f44410c;

    /* JADX INFO: renamed from: a */
    public static final C8206m f44408a = new C8206m();

    /* JADX INFO: renamed from: b */
    public static final String f44409b = C8206m.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f44411d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap<String, String> f44412e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap<String, String> f44413f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public final HashMap m16347a() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = C8502d.f45745d;
            HashSet hashSet = new HashSet();
            Iterator it = C8502d.m16602a().iterator();
            while (it.hasNext()) {
                hashSet.add(((C8502d) it.next()).m16603b());
            }
            ConcurrentHashMap<String, String> concurrentHashMap = f44413f;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    map.put(str, concurrentHashMap.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m16348b() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f44411d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a());
            C5207g.m11110e(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            f44410c = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f44410c;
            if (sharedPreferences == null) {
                C5207g.m11117l("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f44412e.putAll(C5086z.m10805D(string));
            f44413f.putAll(C5086z.m10805D(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m16349c(String str, String str2) {
        String strSubstring;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C5207g.m11113h(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String string = str2.subSequence(i10, length + 1).toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string.toLowerCase();
            C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
            boolean zM11106a = C5207g.m11106a("em", str);
            String str3 = f44409b;
            if (zM11106a) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(str3, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (C5207g.m11106a("ph", str)) {
                return new Regex("[^0-9]").m14272c(lowerCase, "");
            }
            if (!C5207g.m11106a("ge", str)) {
                return lowerCase;
            }
            if (lowerCase.length() > 0) {
                strSubstring = lowerCase.substring(0, 1);
                C5207g.m11110e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                strSubstring = "";
            }
            if (C5207g.m11106a("f", strSubstring) || C5207g.m11106a("m", strSubstring)) {
                return strSubstring;
            }
            Log.e(str3, "Setting gender failure: the supported value for gender is f or m");
            return "";
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
