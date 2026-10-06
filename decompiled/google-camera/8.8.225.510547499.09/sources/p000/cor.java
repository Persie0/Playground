package p000;

import android.app.job.JobScheduler;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cor implements hjk, fbp {

    /* JADX INFO: renamed from: a */
    private final jvd f8492a;

    /* JADX INFO: renamed from: f */
    public final Context f8493f;

    /* JADX INFO: renamed from: g */
    protected final Executor f8494g;

    /* JADX INFO: renamed from: h */
    protected final String f8495h;

    /* JADX INFO: renamed from: i */
    public final fan f8496i;

    public cor(Context context, Executor executor, jvd jvdVar, fan fanVar, String str) {
        this.f8493f = context;
        this.f8494g = executor;
        this.f8492a = jvdVar;
        this.f8496i = fanVar;
        this.f8495h = "camera/".concat(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m5212c() {
        JobScheduler jobScheduler = (JobScheduler) this.f8493f.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(351853807);
            jobScheduler.cancel(10281993);
            jobScheduler.cancel(216934020);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8492a.execute(new cmd(this, 7));
    }
}
