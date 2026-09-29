package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jd4 extends bd4 {
    public jd4(String str, List list, sq5 sq5Var) {
        super(str, list, JobType.Persistent, TaskQueue.IO, sq5Var);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        return ie4.m13807a();
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo297h(ce4 ce4Var, Object obj, boolean z) {
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo298i(ce4 ce4Var) {
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ boolean mo300n(ce4 ce4Var) {
        return true;
    }
}
