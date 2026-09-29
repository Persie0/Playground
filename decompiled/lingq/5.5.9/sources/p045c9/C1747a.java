package p045c9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p010a9.C0051a;
import p068d9.InterfaceC5090d;
import p135g9.C5717a;
import p452w8.AbstractC9838s;

/* JADX INFO: renamed from: c9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1747a implements InterfaceC1757k {

    /* JADX INFO: renamed from: a */
    public final Context f9610a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5090d f9611b;

    /* JADX INFO: renamed from: c */
    public final SchedulerConfig f9612c;

    public C1747a(Context context, InterfaceC5090d interfaceC5090d, SchedulerConfig schedulerConfig) {
        this.f9610a = context;
        this.f9611b = interfaceC5090d;
        this.f9612c = schedulerConfig;
    }

    @Override // p045c9.InterfaceC1757k
    /* JADX INFO: renamed from: a */
    public final void mo5483a(AbstractC9838s abstractC9838s, int i10) {
        mo5484b(abstractC9838s, i10, false);
    }

    @Override // p045c9.InterfaceC1757k
    /* JADX INFO: renamed from: b */
    public final void mo5484b(AbstractC9838s abstractC9838s, int i10, boolean z10) {
        boolean z11;
        Context context = this.f9610a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC9838s.mo18319b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C5717a.m12075a(abstractC9838s.mo18321d())).array());
        if (abstractC9838s.mo18320c() != null) {
            adler32.update(abstractC9838s.mo18320c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (it.hasNext()) {
                    JobInfo next = it.next();
                    int i11 = next.getExtras().getInt("attemptNumber");
                    if (next.getId() == value) {
                        if (i11 >= i10) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                break;
            }
            if (z11) {
                C0051a.m208a(abstractC9838s, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long jMo10858a1 = this.f9611b.mo10858a1(abstractC9838s);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityMo18321d = abstractC9838s.mo18321d();
        SchedulerConfig schedulerConfig = this.f9612c;
        builder.setMinimumLatency(schedulerConfig.m6761b(priorityMo18321d, jMo10858a1, i10));
        Set<SchedulerConfig.Flag> setMo6764b = schedulerConfig.mo6762c().get(priorityMo18321d).mo6764b();
        if (setMo6764b.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setMo6764b.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setMo6764b.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC9838s.mo18319b());
        persistableBundle.putInt("priority", C5717a.m12075a(abstractC9838s.mo18321d()));
        if (abstractC9838s.mo18320c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC9838s.mo18320c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {abstractC9838s, Integer.valueOf(value), Long.valueOf(schedulerConfig.m6761b(abstractC9838s.mo18321d(), jMo10858a1, i10)), Long.valueOf(jMo10858a1), Integer.valueOf(i10)};
        String strM210c = C0051a.m210c("JobInfoScheduler");
        if (Log.isLoggable(strM210c, 3)) {
            Log.d(strM210c, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
