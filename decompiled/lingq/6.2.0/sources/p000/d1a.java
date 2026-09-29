package p000;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class d1a extends cn8 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final long f34853g;

    public d1a(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl.getContext(), continuationImpl);
        this.f34853g = j;
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: a0 */
    public final String mo9992a0() {
        return super.mo9992a0() + "(timeMillis=" + this.f34853g + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        kn1 kn1Var = this.f7705e;
        AbstractC3208a.m15440g(kn1Var);
        qn1 qn1Var = (qn1) kn1Var.get(qn1.f57957c);
        String str = qn1Var != null ? qn1Var.f57958b : null;
        String string = "Timed out waiting for " + this.f34853g + " ms";
        if (str != null) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Coroutine \"", str, "\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sbM17742q.append(string);
            string = sbM17742q.toString();
        }
        m15518y(new TimeoutCancellationException(string, this));
    }
}
