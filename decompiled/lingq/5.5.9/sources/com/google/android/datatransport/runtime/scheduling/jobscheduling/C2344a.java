package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import p113f9.InterfaceC5478a;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2344a extends SchedulerConfig {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5478a f11782a;

    /* JADX INFO: renamed from: b */
    public final Map<Priority, SchedulerConfig.AbstractC2343a> f11783b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2344a(InterfaceC5478a interfaceC5478a, Map<Priority, SchedulerConfig.AbstractC2343a> map) {
        if (interfaceC5478a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f11782a = interfaceC5478a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f11783b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* JADX INFO: renamed from: a */
    public final InterfaceC5478a mo6760a() {
        return this.f11782a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* JADX INFO: renamed from: c */
    public final Map<Priority, SchedulerConfig.AbstractC2343a> mo6762c() {
        return this.f11783b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f11782a.equals(schedulerConfig.mo6760a()) && this.f11783b.equals(schedulerConfig.mo6762c());
    }

    public final int hashCode() {
        return ((this.f11782a.hashCode() ^ 1000003) * 1000003) ^ this.f11783b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f11782a + ", values=" + this.f11783b + "}";
    }
}
