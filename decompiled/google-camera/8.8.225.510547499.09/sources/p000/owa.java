package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class owa extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient ous f46700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owa(ous ousVar) {
        super("Flow was aborted, no more elements needed");
        ousVar.getClass();
        this.f46700a = ousVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (oqu.f46432a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
