package p000;

import android.util.Log;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcx implements lby {

    /* JADX INFO: renamed from: a */
    private final lby f37961a;

    public lcx(lby lbyVar) {
        this.f37961a = lbyVar;
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        return this.f37961a.mo15079a();
    }

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37961a.close();
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: d */
    public final ldb mo15152d() {
        return this.f37961a.mo15152d();
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: e */
    public final leb mo15153e() {
        return this.f37961a.mo15153e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f37961a.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e(PMZiHihxLGEy.QNK, "Executing command on GL context was rejected! Command ignored.", e);
        }
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: f */
    public final void mo15154f(lde ldeVar, Runnable runnable) {
        try {
            this.f37961a.mo15154f(ldeVar, runnable);
        } catch (RejectedExecutionException e) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", e);
        }
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: g */
    public final boolean mo15155g() {
        return this.f37961a.mo15155g();
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: h */
    public final lgg mo15156h(Object obj, msi msiVar) {
        return this.f37961a.mo15156h(obj, msiVar);
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: i */
    public final ldx mo15157i() {
        return this.f37961a.mo15157i();
    }
}
