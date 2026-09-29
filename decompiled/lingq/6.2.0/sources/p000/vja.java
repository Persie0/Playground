package p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class vja {

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f65510b;

    /* JADX INFO: renamed from: a */
    public static final vja f65509a = new vja();

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f65511c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f65512d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f65513e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final HashMap m23351a() {
        ConcurrentHashMap concurrentHashMap = f65513e;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = py5.f56994d;
            HashSet hashSet = new HashSet();
            Iterator it = py5.m19568a().iterator();
            while (it.hasNext()) {
                hashSet.add(((py5) it.next()).m19570c());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    map.put(str, concurrentHashMap.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m23352b() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f65511c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a());
            defaultSharedPreferences.getClass();
            f65510b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f65510b;
            if (sharedPreferences == null) {
                fa4.m11636J("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f65512d.putAll(bna.m3951g0(string));
            f65513e.putAll(bna.m3951g0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m23353c(String str, String str2) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = fa4.m11651m(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = str2.subSequence(i, length + 1).toString().toLowerCase();
            lowerCase.getClass();
            if ("em".equals(str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e("vja", "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if ("ph".equals(str)) {
                    return new Regex("[^0-9]").m15428g(lowerCase, "");
                }
                if ("ge".equals(str)) {
                    String strSubstring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                    if (!"f".equals(strSubstring) && !"m".equals(strSubstring)) {
                        Log.e("vja", "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
