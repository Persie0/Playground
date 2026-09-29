package p030b9;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2344a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2345b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p113f9.InterfaceC5478a;
import p371rl.InterfaceC8825a;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: b9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1346e implements InterfaceC10306b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8174a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a f8175b;

    public /* synthetic */ C1346e(InterfaceC8825a interfaceC8825a, int i10) {
        this.f8174a = i10;
        this.f8175b = interfaceC8825a;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 6 */
    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        int i10 = this.f8174a;
        InterfaceC8825a interfaceC8825a = this.f8175b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC5478a interfaceC5478a = (InterfaceC5478a) interfaceC8825a.get();
                HashMap map = new HashMap();
                Priority priority = Priority.DEFAULT;
                C2345b.a aVar = new C2345b.a();
                Set<SchedulerConfig.Flag> setEmptySet = Collections.emptySet();
                if (setEmptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar.f11789c = setEmptySet;
                aVar.f11787a = 30000L;
                aVar.f11788b = 86400000L;
                map.put(priority, aVar.m6766a());
                Priority priority2 = Priority.HIGHEST;
                C2345b.a aVar2 = new C2345b.a();
                Set<SchedulerConfig.Flag> setEmptySet2 = Collections.emptySet();
                if (setEmptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar2.f11789c = setEmptySet2;
                aVar2.f11787a = 1000L;
                aVar2.f11788b = 86400000L;
                map.put(priority2, aVar2.m6766a());
                Priority priority3 = Priority.VERY_LOW;
                C2345b.a aVar3 = new C2345b.a();
                Set<SchedulerConfig.Flag> setEmptySet3 = Collections.emptySet();
                if (setEmptySet3 == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar3.f11789c = setEmptySet3;
                aVar3.f11787a = 86400000L;
                aVar3.f11788b = 86400000L;
                Set<SchedulerConfig.Flag> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar3.f11789c = setUnmodifiableSet;
                map.put(priority3, aVar3.m6766a());
                if (interfaceC5478a == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (map.keySet().size() < Priority.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new C2344a(interfaceC5478a, map);
            default:
                String packageName = ((Context) interfaceC8825a.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
