package p000;

import com.google.android.gms.internal.measurement.C0962f;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kyc implements on9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kyc f48781a = new kyc();

    @Override // p000.on9
    public final Object get() {
        Object obj = C0962f.f11840j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(gyc.f41537a);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof c26 ? (c26) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new c26(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }
}
