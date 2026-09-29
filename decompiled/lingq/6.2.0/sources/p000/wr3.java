package p000;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.firebase.datastorage.C1153a;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wr3 {

    /* JADX INFO: renamed from: b */
    public static final Preferences.Key f67200b = PreferencesKeys.longKey("fire-global");

    /* JADX INFO: renamed from: c */
    public static final Preferences.Key f67201c = PreferencesKeys.longKey("fire-count");

    /* JADX INFO: renamed from: d */
    public static final Preferences.Key f67202d = PreferencesKeys.stringKey("last-used-date");

    /* JADX INFO: renamed from: a */
    public final C1153a f67203a;

    public wr3(Context context, String str) {
        this.f67203a = new C1153a(context, "FirebaseHeartBeat".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ArrayList m24132a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strM24133b = m24133b(System.currentTimeMillis());
            for (Map.Entry entry : this.f67203a.m6687b().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM24133b);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(q40.m19633a(((Preferences.Key) entry.getKey()).getName(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f67203a.m6686a(new C3611th(4, jCurrentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m24133b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Preferences.Key m24134c(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m24135d(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyM24134c = m24134c(mutablePreferences, str);
            if (keyM24134c == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) ad4.m277a(mutablePreferences, keyM24134c, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(keyM24134c);
            } else {
                mutablePreferences.set(keyM24134c, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m24136e(Preferences.Key key, long j) {
        long jLongValue;
        jLongValue = ((Long) this.f67203a.m6688c(key)).longValue();
        synchronized (this) {
        }
        if (m24133b(jLongValue).equals(m24133b(j))) {
            return false;
        }
        this.f67203a.m6689d(key, Long.valueOf(j));
        return true;
    }
}
