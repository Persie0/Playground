package com.google.android.apps.camera.keepalive;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import p000.ekr;
import p000.emv;
import p000.ent;
import p000.eny;
import p000.fcp;
import p000.gtd;
import p000.lbn;
import p000.nbh;
import p000.nlm;
import p000.nxl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProcessGcService extends JobService {

    /* JADX INFO: renamed from: a */
    public static final nbh f6758a = nbh.m17259h("com/google/android/apps/camera/keepalive/ProcessGcService");

    /* JADX INFO: renamed from: b */
    public fcp f6759b;

    /* JADX INFO: renamed from: c */
    public ent f6760c;

    /* JADX INFO: renamed from: d */
    public Handler f6761d;

    /* JADX INFO: renamed from: e */
    public lbn f6762e;

    /* JADX INFO: renamed from: f */
    private boolean f6763f = false;

    /* JADX INFO: renamed from: a */
    public final void m4188a(int i) {
        fcp fcpVar = this.f6759b;
        nxl nxlVarM18137O = nlm.f43547d.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlm nlmVar = (nlm) nxlVarM18137O.f44974b;
        nlmVar.f43550b = i - 1;
        nlmVar.f43549a |= 1;
        long jUptimeMillis = SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlm nlmVar2 = (nlm) nxlVarM18137O.f44974b;
        nlmVar2.f43549a |= 2;
        nlmVar2.f43551c = jUptimeMillis;
        fcpVar.mo8135J((nlm) nxlVarM18137O.mo18103l());
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (!this.f6763f) {
            ((eny) ((emv) getApplication()).mo4193e(eny.class)).mo7581i(this);
            this.f6763f = true;
        }
        if (jobParameters.getExtras().getLong(PMZiHihxLGEy.HKlQGYN, -1L) == this.f6762e.f37881a) {
            this.f6761d.post(new ekr(this, jobParameters, 8));
            return true;
        }
        m4188a(4);
        gtd.m9734o(this);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
