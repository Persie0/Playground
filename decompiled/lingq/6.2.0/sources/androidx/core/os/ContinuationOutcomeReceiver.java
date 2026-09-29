package androidx.core.os;

import android.p001os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import p000.sm0;

/* JADX INFO: loaded from: classes2.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    public final sm0 f5514a;

    public ContinuationOutcomeReceiver(sm0 sm0Var) {
        super(false);
        this.f5514a = sm0Var;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f5514a.resumeWith(AbstractC3193b.m15358a(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f5514a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
