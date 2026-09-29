package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8123f extends AbstractC8118a {

    /* JADX INFO: renamed from: b */
    public final long f44118b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6097d f44119c;

    public AbstractC8123f(DateTimeFieldType dateTimeFieldType, AbstractC6097d abstractC6097d) {
        super(dateTimeFieldType);
        if (!abstractC6097d.mo12595t()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long jMo12594s = abstractC6097d.mo12594s();
        this.f44118b = jMo12594s;
        if (jMo12594s < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.f44119c = abstractC6097d;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: A */
    public long mo12562A(long j10) {
        long j11 = this.f44118b;
        return j10 >= 0 ? j10 % j11 : (((j10 + 1) % j11) + j11) - 1;
    }

    @Override // org.joda.time.field.AbstractC8118a, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: C */
    public long mo12563C(long j10) {
        long j11 = this.f44118b;
        if (j10 <= 0) {
            return j10 - (j10 % j11);
        }
        long j12 = j10 - 1;
        return (j12 - (j12 % j11)) + j11;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: D */
    public long mo12564D(long j10) {
        long j11 = this.f44118b;
        if (j10 >= 0) {
            return j10 - (j10 % j11);
        }
        long j12 = j10 + 1;
        return (j12 - (j12 % j11)) - j11;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public long mo12568J(int i10, long j10) {
        C0062b.m419y2(this, i10, mo12582r(), mo16081T(j10, i10));
        return (((long) (i10 - mo12572b(j10))) * this.f44118b) + j10;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public final AbstractC6097d mo12577j() {
        return this.f44119c;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: r */
    public int mo12582r() {
        return 0;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final boolean mo12587y() {
        return false;
    }
}
