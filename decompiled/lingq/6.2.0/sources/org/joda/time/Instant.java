package org.joda.time;

import java.io.Serializable;
import org.joda.time.chrono.ISOChronology;
import p000.AbstractC3631u0;
import p000.s11;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant extends AbstractC3631u0 implements Serializable {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant(long j) {
        this.iMillis = j;
    }

    @Override // p000.AbstractC3631u0
    /* JADX INFO: renamed from: a */
    public final s11 mo18365a() {
        return ISOChronology.f54908e0;
    }

    @Override // p000.AbstractC3631u0
    /* JADX INFO: renamed from: b */
    public final long mo18366b() {
        return this.iMillis;
    }
}
