package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzin;

/* JADX INFO: loaded from: classes.dex */
public final class oyc extends i9c {

    /* JADX INFO: renamed from: c */
    public JobScheduler f55313c;

    @Override // p000.i9c
    /* JADX INFO: renamed from: G */
    public final boolean mo5850G() {
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final void m18840H(long j) {
        kjc kjcVar = (kjc) this.f60774a;
        m13744E();
        mo12359D();
        JobScheduler jobScheduler = this.f55313c;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(kjcVar.f47433a.getPackageName())).hashCode()) != null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17923a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin zzinVarM18841I = m18841I();
        if (zzinVarM18841I != zzin.CLIENT_UPLOAD_ELIGIBLE) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68076I.m17924b(zzinVarM18841I.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        xcc xccVar3 = kjcVar.f47438f;
        kjc.m15280l(xccVar3);
        xccVar3.f68076I.m17924b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(kjcVar.f47433a.getPackageName())).hashCode(), new ComponentName(kjcVar.f47433a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f55313c;
        lda.m16130p(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        xcc xccVar4 = kjcVar.f47438f;
        kjc.m15280l(xccVar4);
        xccVar4.f68076I.m17924b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* JADX INFO: renamed from: I */
    public final zzin m18841I() {
        kjc kjcVar = (kjc) this.f60774a;
        m13744E();
        mo12359D();
        if (this.f55313c == null) {
            return zzin.MISSING_JOB_SCHEDULER;
        }
        Boolean boolM4871Q = kjcVar.f47436d.m4871Q("google_analytics_sgtm_upload_enabled");
        if (!(boolM4871Q == null ? false : boolM4871Q.booleanValue())) {
            return zzin.NOT_ENABLED_IN_MANIFEST;
        }
        if (kjcVar.m15289q().f62082j < 119000) {
            return zzin.SDK_TOO_OLD;
        }
        if (rad.m20506Y(kjcVar.f47433a)) {
            return !kjcVar.m15287o().m23110K() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE;
        }
        return zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
