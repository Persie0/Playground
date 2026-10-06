package p000;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpx {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f38927a = 0;

    /* JADX INFO: renamed from: b */
    private static final Map f38928b = new C1109wy();

    /* JADX INFO: renamed from: c */
    private final SharedPreferences f38929c;

    /* JADX INFO: renamed from: d */
    private final SharedPreferences.OnSharedPreferenceChangeListener f38930d;

    /* JADX INFO: renamed from: a */
    static synchronized void m15849a() {
        Map map = f38928b;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            lpx lpxVar = (lpx) it.next();
            SharedPreferences sharedPreferences = lpxVar.f38929c;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = lpxVar.f38930d;
            throw null;
        }
        map.clear();
    }
}
