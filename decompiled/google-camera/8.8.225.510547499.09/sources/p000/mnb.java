package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mnb {

    /* JADX INFO: renamed from: a */
    private static final Map f41093a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f41093a = new HashMap();
        new mav("PlayCoreVersion");
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Map m16652a() {
        Map map;
        map = f41093a;
        if (!map.containsKey("app_update")) {
            HashMap map2 = new HashMap();
            map2.put("java", 11004);
            map.put("app_update", map2);
        }
        return (Map) map.get("app_update");
    }
}
