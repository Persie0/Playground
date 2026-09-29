package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.field.AbstractC8123f;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.chrono.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8110c extends AbstractC8123f {

    /* JADX INFO: renamed from: d */
    public final BasicChronology f44078d;

    public C8110c(BasicChronology basicChronology, AbstractC6097d abstractC6097d) {
        super(DateTimeFieldType.f43946k, abstractC6097d);
        this.f44078d = basicChronology;
    }

    @Override // org.joda.time.field.AbstractC8123f, org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public final long mo12562A(long j10) {
        return super.mo12562A(j10 + 259200000);
    }

    @Override // org.joda.time.field.AbstractC8123f, org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public final long mo12563C(long j10) {
        return super.mo12563C(j10 + 259200000) - 259200000;
    }

    @Override // org.joda.time.field.AbstractC8123f, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public final long mo12564D(long j10) {
        return super.mo12564D(j10 + 259200000) - 259200000;
    }

    @Override // org.joda.time.field.AbstractC8118a
    /* JADX INFO: renamed from: T */
    public final int mo16081T(long j10, int i10) {
        if (i10 > 52) {
            return mo12581q(j10);
        }
        return 52;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        BasicChronology basicChronology = this.f44078d;
        return basicChronology.m16050A0(basicChronology.m16053D0(j10), j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return 53;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: q */
    public final int mo12581q(long j10) {
        BasicChronology basicChronology = this.f44078d;
        return basicChronology.m16051B0(basicChronology.m16052C0(j10));
    }

    @Override // org.joda.time.field.AbstractC8123f, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public final int mo12582r() {
        return 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return this.f44078d.f43999h;
    }
}
