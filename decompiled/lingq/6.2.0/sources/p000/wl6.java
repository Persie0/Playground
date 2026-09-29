package p000;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C3213d;

/* JADX INFO: loaded from: classes2.dex */
public final class wl6 extends AbstractC0830c0 implements cd4 {

    /* JADX INFO: renamed from: b */
    public static final wl6 f67013b = new wl6(nj0.f52795N);

    @Override // p000.cd4
    /* JADX INFO: renamed from: R */
    public final ci2 mo4536R(boolean z, boolean z2, vi3 vi3Var) {
        return yl6.f70031a;
    }

    @Override // p000.cd4, p000.cu0
    /* JADX INFO: renamed from: a */
    public final void mo4537a(CancellationException cancellationException) {
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: b */
    public final boolean mo4538b() {
        return true;
    }

    @Override // p000.cd4
    public final boolean isCancelled() {
        return false;
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: q */
    public final Object mo4539q(ContinuationImpl continuationImpl) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: r */
    public final ci2 mo4540r(vi3 vi3Var) {
        return yl6.f70031a;
    }

    @Override // p000.cd4
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: u */
    public final CancellationException mo4541u() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: z */
    public final q01 mo4542z(C3213d c3213d) {
        return yl6.f70031a;
    }
}
