package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p000.C3058h0;
import p000.RunnableC0806bd;
import p000.bga;
import p000.bna;
import p000.nv4;

/* JADX INFO: renamed from: com.google.common.util.concurrent.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1114d extends AbstractC1113c {

    /* JADX INFO: renamed from: J */
    public static final nv4 f13531J = new nv4(C1114d.class);

    /* JADX INFO: renamed from: H */
    public final boolean f13532H;

    /* JADX INFO: renamed from: I */
    public CombinedFuture$CombinedFutureInterruptibleTask f13533I;

    /* JADX INFO: renamed from: l */
    public ImmutableCollection f13534l;

    public C1114d(ImmutableCollection immutableCollection, boolean z) {
        int size = immutableCollection.size();
        this.f13529h = null;
        this.f13530i = size;
        this.f13534l = immutableCollection;
        this.f13532H = z;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        ImmutableCollection immutableCollection = this.f13534l;
        AggregateFuture$ReleaseResourcesReason.OUTPUT_FUTURE_DONE.getClass();
        this.f13534l = null;
        this.f13533I = null;
        if ((this.f13524a instanceof C3058h0) && (immutableCollection != null)) {
            boolean zM6389q = m6389q();
            bga it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM6389q);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: j */
    public final void mo6383j() {
        CombinedFuture$CombinedFutureInterruptibleTask combinedFuture$CombinedFutureInterruptibleTask = this.f13533I;
        if (combinedFuture$CombinedFutureInterruptibleTask != null) {
            combinedFuture$CombinedFutureInterruptibleTask.m6374c();
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        ImmutableCollection immutableCollection = this.f13534l;
        if (immutableCollection == null) {
            return super.mo43k();
        }
        return "futures=" + immutableCollection;
    }

    /* JADX INFO: renamed from: r */
    public final void m6390r(ImmutableCollection immutableCollection) {
        int iMo4535c = AbstractC1113c.f13527j.mo4535c(this);
        bna.m3985y("Less than 0 remaining futures", iMo4535c >= 0);
        if (iMo4535c == 0) {
            if (immutableCollection != null) {
                bga it = immutableCollection.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                m6391s(e.getCause());
                            } catch (Throwable th2) {
                                m6391s(th2);
                            }
                        }
                    }
                }
            }
            this.f13529h = null;
            CombinedFuture$CombinedFutureInterruptibleTask combinedFuture$CombinedFutureInterruptibleTask = this.f13533I;
            if (combinedFuture$CombinedFutureInterruptibleTask != null) {
                try {
                    combinedFuture$CombinedFutureInterruptibleTask.f13504c.execute(combinedFuture$CombinedFutureInterruptibleTask);
                } catch (RejectedExecutionException e2) {
                    combinedFuture$CombinedFutureInterruptibleTask.f13505d.m6386n(e2);
                }
            }
            AggregateFuture$ReleaseResourcesReason aggregateFuture$ReleaseResourcesReason = AggregateFuture$ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED;
            aggregateFuture$ReleaseResourcesReason.getClass();
            this.f13534l = null;
            if (aggregateFuture$ReleaseResourcesReason == AggregateFuture$ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
                this.f13533I = null;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6391s(Throwable th) {
        th.getClass();
        if (this.f13532H && !m6386n(th)) {
            Set set = this.f13529h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f13524a instanceof C3058h0)) {
                    Throwable thM6388p = m6388p();
                    Objects.requireNonNull(thM6388p);
                    while (thM6388p != null && setNewSetFromMap.add(thM6388p)) {
                        thM6388p = thM6388p.getCause();
                    }
                }
                AbstractC1113c.f13527j.mo4534b(this, setNewSetFromMap);
                Set set2 = this.f13529h;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    f13531J.m17640a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            f13531J.m17640a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6392t() {
        Objects.requireNonNull(this.f13534l);
        if (this.f13534l.isEmpty()) {
            CombinedFuture$CombinedFutureInterruptibleTask combinedFuture$CombinedFutureInterruptibleTask = this.f13533I;
            if (combinedFuture$CombinedFutureInterruptibleTask != null) {
                try {
                    combinedFuture$CombinedFutureInterruptibleTask.f13504c.execute(combinedFuture$CombinedFutureInterruptibleTask);
                    return;
                } catch (RejectedExecutionException e) {
                    combinedFuture$CombinedFutureInterruptibleTask.f13505d.m6386n(e);
                    return;
                }
            }
            return;
        }
        if (!this.f13532H) {
            RunnableC0806bd runnableC0806bd = new RunnableC0806bd(1, this, (Object) null);
            bga it = this.f13534l.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    m6390r(null);
                } else {
                    listenableFuture.mo52a(runnableC0806bd, DirectExecutor.INSTANCE);
                }
            }
            return;
        }
        bga it2 = this.f13534l.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                m6393u(listenableFuture2);
            } else {
                listenableFuture2.mo52a(new RunnableC0806bd(this, i, listenableFuture2), DirectExecutor.INSTANCE);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6393u(ListenableFuture listenableFuture) {
        try {
            boolean z = false;
            if (listenableFuture.isCancelled()) {
                this.f13534l = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        m6391s(e.getCause());
                    } catch (Throwable th2) {
                        m6391s(th2);
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            m6390r(null);
        } catch (Throwable th3) {
            m6390r(null);
            throw th3;
        }
    }
}
