package p000;

import android.view.Choreographer;
import androidx.compose.p002ui.platform.C0398j;
import kotlin.Result;

/* JADX INFO: renamed from: fl */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC3005fl implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sm0 f39238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f39239b;

    public ChoreographerFrameCallbackC3005fl(sm0 sm0Var, C0398j c0398j, vi3 vi3Var) {
        this.f39238a = sm0Var;
        this.f39239b = vi3Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object failure;
        try {
            failure = this.f39239b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        this.f39238a.resumeWith(failure);
    }
}
