package p057cp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.C6753d;
import p442vo.C9768d;
import p542zo.C10561c;
import so.C9100r;

/* JADX INFO: renamed from: cp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4989c {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f32568a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f32569b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = C9100r.class.getPackage();
        String name = r10 == null ? null : r10.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C9100r.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C10561c.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C9768d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f32569b = C6753d.m13465R0(linkedHashMap);
    }
}
