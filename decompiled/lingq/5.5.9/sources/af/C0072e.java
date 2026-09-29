package af;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: af.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0072e {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f193a;

    public C0072e(Context context, String str) {
        this.f193a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m446a() {
        long j10 = this.f193a.getLong("fire-count", 0L);
        String key = "";
        String str = null;
        for (Map.Entry<String, ?> entry : this.f193a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (true) {
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str == null || str.compareTo(str2) > 0) {
                                key = entry.getKey();
                                str = str2;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f193a.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f193a.edit().putStringSet(key, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m447b() {
        try {
            SharedPreferences.Editor editorEdit = this.f193a.edit();
            Iterator<Map.Entry<String, ?>> it = this.f193a.getAll().entrySet().iterator();
            while (true) {
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<String, ?> next = it.next();
                        if (next.getValue() instanceof Set) {
                            editorEdit.remove(next.getKey());
                        }
                    } else {
                        editorEdit.remove("fire-count");
                        editorEdit.commit();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized ArrayList m448c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = this.f193a.getAll().entrySet().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    synchronized (this) {
                        this.f193a.edit().putLong("fire-global", jCurrentTimeMillis).commit();
                    }
                    return arrayList;
                }
                Map.Entry<String, ?> next = it.next();
                if (next.getValue() instanceof Set) {
                    arrayList.add(new C0068a(new ArrayList((Set) next.getValue()), next.getKey()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m449d(long j10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m450e(String str) {
        try {
            for (Map.Entry<String, ?> entry : this.f193a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (str.equals((String) it.next())) {
                            return entry.getKey();
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m451f(String str) {
        try {
            String strM450e = m450e(str);
            if (strM450e == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f193a.getStringSet(strM450e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f193a.edit().remove(strM450e).commit();
            } else {
                this.f193a.edit().putStringSet(strM450e, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized boolean m452g(long j10) {
        try {
            if (!this.f193a.contains("fire-global")) {
                this.f193a.edit().putLong("fire-global", j10).commit();
                return true;
            }
            long j11 = this.f193a.getLong("fire-global", -1L);
            synchronized (this) {
                try {
                    if (m449d(j11).equals(m449d(j10))) {
                        return false;
                    }
                    this.f193a.edit().putLong("fire-global", j10).commit();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m453h(String str, long j10) {
        String strM449d = m449d(j10);
        if (this.f193a.getString("last-used-date", "").equals(strM449d)) {
            String strM450e = m450e(strM449d);
            if (strM450e == null) {
                return;
            }
            if (strM450e.equals(str)) {
                return;
            }
            m454i(str, strM449d);
            return;
        }
        long j11 = this.f193a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            m446a();
            j11 = this.f193a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f193a.getStringSet(str, new HashSet()));
        hashSet.add(strM449d);
        this.f193a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", strM449d).commit();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m454i(String str, String str2) {
        try {
            m451f(str2);
            HashSet hashSet = new HashSet(this.f193a.getStringSet(str, new HashSet()));
            hashSet.add(str2);
            this.f193a.edit().putStringSet(str, hashSet).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
