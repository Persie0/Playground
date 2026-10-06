package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class nok extends nnu {

    /* JADX INFO: renamed from: a */
    private static final Logger f43983a = Logger.getLogger(nok.class.getName());

    /* JADX INFO: renamed from: b */
    public static final noh f43984b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        noh nojVar;
        Throwable th;
        try {
            nojVar = new noi(AtomicReferenceFieldUpdater.newUpdater(nok.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(nok.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            nojVar = new noj();
            th = e;
        }
        f43984b = nojVar;
        if (th != null) {
            f43983a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public nok(int i) {
        this.remaining = i;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo17558g(Set set);
}
