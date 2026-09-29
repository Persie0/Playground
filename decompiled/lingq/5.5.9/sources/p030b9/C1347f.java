package p030b9;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p045c9.C1747a;
import p045c9.InterfaceC1757k;
import p068d9.InterfaceC5090d;
import p113f9.C5480c;
import p113f9.InterfaceC5478a;
import p371rl.InterfaceC8825a;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: b9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1347f implements InterfaceC10306b<InterfaceC1757k> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<Context> f8176a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<InterfaceC5090d> f8177b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a<SchedulerConfig> f8178c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8825a<InterfaceC5478a> f8179d;

    public C1347f(InterfaceC8825a interfaceC8825a, InterfaceC8825a interfaceC8825a2, C1346e c1346e) {
        C5480c c5480c = C5480c.a.f34067a;
        this.f8176a = interfaceC8825a;
        this.f8177b = interfaceC8825a2;
        this.f8178c = c1346e;
        this.f8179d = c5480c;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        Context context = this.f8176a.get();
        InterfaceC5090d interfaceC5090d = this.f8177b.get();
        SchedulerConfig schedulerConfig = this.f8178c.get();
        this.f8179d.get();
        return new C1747a(context, interfaceC5090d, schedulerConfig);
    }
}
