package p000;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class wu2 implements xy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67294a;

    public /* synthetic */ wu2(int i) {
        this.f67294a = i;
    }

    @Override // p000.so7
    public final Object get() {
        switch (this.f67294a) {
            case 0:
                return new rk8(Executors.newSingleThreadExecutor(), 0);
            default:
                nj0 nj0Var = new nj0(18);
                HashMap map = new HashMap();
                Priority priority = Priority.DEFAULT;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    C3386nv.m17635v("Null flags");
                    return null;
                }
                map.put(priority, new j50(30000L, 86400000L, set));
                Priority priority2 = Priority.HIGHEST;
                if (set == null) {
                    C3386nv.m17635v("Null flags");
                    return null;
                }
                map.put(priority2, new j50(1000L, 86400000L, set));
                Priority priority3 = Priority.VERY_LOW;
                if (set == null) {
                    C3386nv.m17635v("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig$Flag.DEVICE_IDLE)));
                if (setUnmodifiableSet == null) {
                    C3386nv.m17635v("Null flags");
                    return null;
                }
                map.put(priority3, new j50(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= Priority.values().length) {
                    new HashMap();
                    return new i50(nj0Var, map);
                }
                C3386nv.m17633t("Not all priorities have been configured");
                return null;
        }
    }
}
