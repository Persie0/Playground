package org.joda.time.base;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p000.AbstractC2910d0;
import p000.s11;
import p000.t22;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseDateTime extends AbstractC2910d0 implements Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile s11 iChronology;
    private volatile long iMillis;

    public BaseDateTime(long j, s11 s11Var) {
        AtomicReference atomicReference = t22.f61763a;
        this.iChronology = s11Var == null ? ISOChronology.m18437Q() : s11Var;
        this.iMillis = j;
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.mo18358G();
        }
    }

    @Override // p000.AbstractC3631u0
    /* JADX INFO: renamed from: a */
    public final s11 mo18365a() {
        return this.iChronology;
    }

    @Override // p000.AbstractC3631u0
    /* JADX INFO: renamed from: b */
    public final long mo18366b() {
        return this.iMillis;
    }

    /* JADX INFO: renamed from: d */
    public void mo18373d(long j) {
        this.iMillis = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDateTime() {
        this(System.currentTimeMillis(), ISOChronology.m18437Q());
        AtomicReference atomicReference = t22.f61763a;
    }
}
