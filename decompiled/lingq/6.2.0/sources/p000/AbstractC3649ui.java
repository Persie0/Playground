package p000;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: ui */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3649ui {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f63956a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f63957b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = dr6.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(dr6.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(gw3.class.getName(), "okhttp.Http2");
        linkedHashMap.put(as9.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f63957b = AbstractC3194a.m15371X(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m22744a(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f63956a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C3686vi.f65409a);
        }
    }
}
