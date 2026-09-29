package p000;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C3213d;

/* JADX INFO: loaded from: classes.dex */
public interface cd4 extends in1 {
    /* JADX INFO: renamed from: R */
    ci2 mo4536R(boolean z, boolean z2, vi3 vi3Var);

    /* JADX INFO: renamed from: a */
    void mo4537a(CancellationException cancellationException);

    /* JADX INFO: renamed from: b */
    boolean mo4538b();

    boolean isCancelled();

    /* JADX INFO: renamed from: q */
    Object mo4539q(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: r */
    ci2 mo4540r(vi3 vi3Var);

    boolean start();

    /* JADX INFO: renamed from: u */
    CancellationException mo4541u();

    /* JADX INFO: renamed from: z */
    q01 mo4542z(C3213d c3213d);
}
