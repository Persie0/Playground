package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.field.AbstractC8123f;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8108a extends AbstractC8123f {

    /* JADX INFO: renamed from: d */
    public final BasicChronology f44075d;

    public C8108a(BasicChronology basicChronology, AbstractC6097d abstractC6097d) {
        super(DateTimeFieldType.f43943h, abstractC6097d);
        this.f44075d = basicChronology;
    }

    @Override // org.joda.time.field.AbstractC8118a
    /* JADX INFO: renamed from: T */
    public final int mo16081T(long j10, int i10) {
        return this.f44075d.mo16065r0(i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        BasicChronology basicChronology = this.f44075d;
        int iM16053D0 = basicChronology.m16053D0(j10);
        return basicChronology.m16064p0(iM16053D0, basicChronology.mo16071y0(iM16053D0, j10), j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        this.f44075d.getClass();
        return 31;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: q */
    public final int mo12581q(long j10) {
        BasicChronology basicChronology = this.f44075d;
        int iM16053D0 = basicChronology.m16053D0(j10);
        return basicChronology.mo16066s0(iM16053D0, basicChronology.mo16071y0(iM16053D0, j10));
    }

    @Override // org.joda.time.field.AbstractC8123f, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return this.f44075d.f44000i;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: x */
    public final boolean mo12586x(long j10) {
        return this.f44075d.mo16056G0(j10);
    }
}
