package p000;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.apps.camera.keepalive.ProcessGcService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enu implements hjk {

    /* JADX INFO: renamed from: a */
    private final Application f14792a;

    /* JADX INFO: renamed from: b */
    private final JobScheduler f14793b;

    /* JADX INFO: renamed from: c */
    private final int f14794c;

    /* JADX INFO: renamed from: d */
    private final lbn f14795d;

    public enu(Application application, JobScheduler jobScheduler, dhv dhvVar, lbn lbnVar, byte[] bArr, byte[] bArr2) {
        this.f14792a = application;
        this.f14793b = jobScheduler;
        this.f14794c = ((Integer) dhvVar.mo6173a(dib.f11369k).get()).intValue();
        this.f14795d = lbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JobInfo.Builder requiresDeviceIdle = new JobInfo.Builder(900990555, new ComponentName(this.f14792a, (Class<?>) ProcessGcService.class)).setEstimatedNetworkBytes(0L, 0L).setRequiresDeviceIdle(true);
        lbn lbnVar = this.f14795d;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putLong("keepalive_sig", lbnVar.f37881a);
        JobInfo jobInfoBuild = requiresDeviceIdle.setExtras(persistableBundle).setMinimumLatency(TimeUnit.SECONDS.toMillis(this.f14794c)).build();
        this.f14793b.cancel(900990555);
        this.f14793b.schedule(jobInfoBuild);
    }
}
