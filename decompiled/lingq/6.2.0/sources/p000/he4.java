package p000;

import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.kochava.tracker.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class he4 extends bd4 implements p67 {

    /* JADX INFO: renamed from: r */
    public static final String f42254r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f42255s;

    /* JADX INFO: renamed from: q */
    public int f42256q;

    static {
        List list = se4.f60736a;
        f42254r = "JobPayloadQueueUpdates";
        sj5 sj5VarM20396w = r46.m20396w();
        f42255s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobPayloadQueueUpdates");
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
        Pair pairM22735a = ugd.m22735a(f42255s, this.f42256q, ce4Var, ((rl7) ce4Var.f9967b).m20704t());
        if (((Boolean) pairM22735a.first).booleanValue()) {
            this.f42256q++;
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
        this.f42256q = 1;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        ((rl7) ce4Var.f9967b).m20704t().m17822b(this);
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        return ((rl7) ce4Var.f9967b).m20704t().m17824d() == 0;
    }
}
