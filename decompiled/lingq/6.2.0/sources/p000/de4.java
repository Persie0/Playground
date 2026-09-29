package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.kochava.tracker.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class de4 extends bd4 implements p67 {

    /* JADX INFO: renamed from: r */
    public static final String f35495r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f35496s;

    /* JADX INFO: renamed from: q */
    public int f35497q;

    static {
        List list = se4.f60736a;
        f35495r = "JobPayloadQueueClicks";
        sj5 sj5VarM20396w = r46.m20396w();
        f35496s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobPayloadQueueClicks");
    }

    @Override // p000.p67
    /* JADX INFO: renamed from: a */
    public final void mo10310a(StorageQueueChangedAction storageQueueChangedAction) {
        if (storageQueueChangedAction != StorageQueueChangedAction.Add) {
            return;
        }
        m3645p();
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        Pair pairM22735a = ugd.m22735a(f35496s, this.f35497q, ce4Var, ((rl7) ce4Var.f9967b).m20689e());
        if (((Boolean) pairM22735a.first).booleanValue()) {
            this.f35497q++;
        }
        return (ie4) pairM22735a.second;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo297h(ce4 ce4Var, Object obj, boolean z) {
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final void mo298i(ce4 ce4Var) {
        this.f35497q = 1;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        ((rl7) ce4Var.f9967b).m20689e().m17822b(this);
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        return ((rl7) ce4Var.f9967b).m20689e().m17824d() == 0;
    }
}
