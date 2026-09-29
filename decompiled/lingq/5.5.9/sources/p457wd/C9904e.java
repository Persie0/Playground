package p457wd;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import p081e0.C5298b1;
import p115fb.RunnableC5494j;

/* JADX INFO: renamed from: wd.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9904e implements InterfaceC9906g {

    /* JADX INFO: renamed from: b */
    public final Executor f50535b;

    /* JADX INFO: renamed from: d */
    public final Object f50537d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50534a = 1;

    /* JADX INFO: renamed from: c */
    public final Object f50536c = new Object();

    public C9904e(Executor executor, InterfaceC9901b interfaceC9901b) {
        this.f50535b = executor;
        this.f50537d = interfaceC9901b;
    }

    public C9904e(ExecutorC9909j executorC9909j, C5298b1 c5298b1) {
        this.f50535b = executorC9909j;
        this.f50537d = c5298b1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p457wd.InterfaceC9906g
    /* JADX INFO: renamed from: a */
    public final void mo18406a(C9910k c9910k) {
        switch (this.f50534a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                synchronized (this.f50536c) {
                    try {
                        if (((C5298b1) this.f50537d) == null) {
                            return;
                        }
                        this.f50535b.execute(new RunnableC5494j(this, c9910k, 10));
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                if (c9910k.m18408a()) {
                    synchronized (this.f50536c) {
                        try {
                            if (((InterfaceC9901b) this.f50537d) != null) {
                                this.f50535b.execute(new RunnableC5494j(this, c9910k, 11));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
