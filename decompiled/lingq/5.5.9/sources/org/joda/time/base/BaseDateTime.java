package org.joda.time.base;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6094a;
import p163hp.C6096c;
import p184ip.AbstractC6389a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDateTime extends AbstractC6389a implements Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile AbstractC6094a iChronology;
    private volatile long iMillis;

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseDateTime() {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ISOChronology iSOChronology = ISOChronology.f44066e0;
        this(jCurrentTimeMillis, ISOChronology.m16074k0(DateTimeZone.m16016e()));
    }

    public BaseDateTime(long j10, ISOChronology iSOChronology) {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
        this.iChronology = iSOChronology;
        this.iMillis = j10;
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.mo12539a0();
        }
    }

    @Override // p163hp.InterfaceC6098e
    /* JADX INFO: renamed from: k */
    public final long mo12597k() {
        return this.iMillis;
    }

    @Override // p163hp.InterfaceC6098e
    /* JADX INFO: renamed from: n */
    public final AbstractC6094a mo12598n() {
        return this.iChronology;
    }

    /* JADX INFO: renamed from: s */
    public void mo16036s(long j10) {
        this.iMillis = j10;
    }
}
