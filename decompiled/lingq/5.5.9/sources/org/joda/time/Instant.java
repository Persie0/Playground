package org.joda.time;

import java.io.Serializable;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6094a;
import p184ip.AbstractC6390b;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant extends AbstractC6390b implements Serializable {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    static {
        new Instant(0L);
    }

    public Instant(long j10) {
        this.iMillis = j10;
    }

    @Override // p163hp.InterfaceC6098e
    /* JADX INFO: renamed from: k */
    public final long mo12597k() {
        return this.iMillis;
    }

    @Override // p163hp.InterfaceC6098e
    /* JADX INFO: renamed from: n */
    public final AbstractC6094a mo12598n() {
        return ISOChronology.f44066e0;
    }
}
