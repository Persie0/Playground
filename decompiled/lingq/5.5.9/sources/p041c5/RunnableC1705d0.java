package p041c5;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.work.AbstractC1246d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p026b5.AbstractC1314g;

/* JADX INFO: renamed from: c5.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1705d0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC1707e0 f9491b;

    public RunnableC1705d0(RunnableC1707e0 runnableC1707e0, String str) {
        this.f9491b = runnableC1707e0;
        this.f9490a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f9490a;
        RunnableC1707e0 runnableC1707e0 = this.f9491b;
        try {
            try {
                AbstractC1246d.a aVar = runnableC1707e0.f9497K.get();
                if (aVar == null) {
                    AbstractC1314g.m4867d().mo4870b(RunnableC1707e0.f9493M, runnableC1707e0.f9502d.f37526c + " returned a null result. Treating it as a failure.");
                } else {
                    AbstractC1314g.m4867d().mo4869a(RunnableC1707e0.f9493M, runnableC1707e0.f9502d.f37526c + " returned a " + aVar + ".");
                    runnableC1707e0.f9505g = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                AbstractC1314g.m4867d().mo4871c(RunnableC1707e0.f9493M, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e11) {
                AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
                String str2 = RunnableC1707e0.f9493M;
                String str3 = str + " was cancelled";
                if (((AbstractC1314g.a) abstractC1314gM4867d).f8062c <= 4) {
                    Log.i(str2, str3, e11);
                }
            } catch (ExecutionException e12) {
                e = e12;
                AbstractC1314g.m4867d().mo4871c(RunnableC1707e0.f9493M, str + " failed because it threw an exception/error", e);
            }
            runnableC1707e0.m5445b();
        } catch (Throwable th2) {
            runnableC1707e0.m5445b();
            throw th2;
        }
    }
}
