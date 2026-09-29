package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;
import p113f9.InterfaceC5478a;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    @AutoValue
    public static abstract class AbstractC2343a {

        /* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a$a */
        @AutoValue.Builder
        public static abstract class a {
        }

        /* JADX INFO: renamed from: a */
        public abstract long mo6763a();

        /* JADX INFO: renamed from: b */
        public abstract Set<Flag> mo6764b();

        /* JADX INFO: renamed from: c */
        public abstract long mo6765c();
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC5478a mo6760a();

    /* JADX INFO: renamed from: b */
    public final long m6761b(Priority priority, long j10, int i10) {
        long jMo11713a = j10 - mo6760a().mo11713a();
        AbstractC2343a abstractC2343a = mo6762c().get(priority);
        long jMo6763a = abstractC2343a.mo6763a();
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * jMo6763a * Math.max(1.0d, Math.log(10000.0d) / Math.log((jMo6763a > 1 ? jMo6763a : 2L) * ((long) i11)))), jMo11713a), abstractC2343a.mo6765c());
    }

    /* JADX INFO: renamed from: c */
    public abstract Map<Priority, AbstractC2343a> mo6762c();
}
