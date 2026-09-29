package androidx.work;

import android.content.Context;
import java.util.concurrent.Executor;
import p000.f5d;
import p000.gc3;
import p000.gm0;
import p000.og5;
import p000.pg5;
import p000.vg1;
import p000.y8b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends pg5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // p000.pg5
    /* JADX INFO: renamed from: a */
    public final gm0 mo2899a() {
        Executor executor = this.f56132b.f7168d;
        executor.getClass();
        return f5d.m11561c(new vg1(18, executor, new y8b(this, 1)));
    }

    @Override // p000.pg5
    /* JADX INFO: renamed from: c */
    public final gm0 mo2900c() {
        Executor executor = this.f56132b.f7168d;
        executor.getClass();
        return f5d.m11561c(new vg1(18, executor, new y8b(this, 0)));
    }

    /* JADX INFO: renamed from: d */
    public abstract og5 mo2901d();

    /* JADX INFO: renamed from: e */
    public gc3 mo2902e() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }
}
