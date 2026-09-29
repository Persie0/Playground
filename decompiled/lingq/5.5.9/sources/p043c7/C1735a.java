package p043c7;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1735a {

    /* JADX INFO: renamed from: a */
    public static final Map<String, C1736b> f9580a = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C1736b m5472a(CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig == null) {
            throw new IllegalArgumentException("Can't create task for null config");
        }
        Map<String, C1736b> map = f9580a;
        C1736b c1736b = map.get(cleverTapInstanceConfig.f10995a);
        if (c1736b == null) {
            synchronized (C1735a.class) {
                c1736b = map.get(cleverTapInstanceConfig.f10995a);
                if (c1736b == null) {
                    c1736b = new C1736b(cleverTapInstanceConfig);
                    map.put(cleverTapInstanceConfig.f10995a, c1736b);
                }
            }
        }
        return c1736b;
    }
}
