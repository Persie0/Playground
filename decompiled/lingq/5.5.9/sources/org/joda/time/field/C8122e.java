package org.joda.time.field;

import ae.C0062b;
import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.e */
/* JADX INFO: loaded from: classes2.dex */
public class C8122e extends AbstractC8123f {

    /* JADX INFO: renamed from: d */
    public final int f44116d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6097d f44117e;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C8122e(DateTimeFieldType dateTimeFieldType, AbstractC6097d abstractC6097d, AbstractC6097d abstractC6097d2) {
        super(dateTimeFieldType, abstractC6097d);
        if (!abstractC6097d2.mo12595t()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int iMo12594s = (int) (abstractC6097d2.mo12594s() / this.f44118b);
        this.f44116d = iMo12594s;
        if (iMo12594s < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.f44117e = abstractC6097d2;
    }

    @Override // org.joda.time.field.AbstractC8123f, p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public final long mo12568J(int i10, long j10) {
        C0062b.m419y2(this, i10, 0, this.f44116d - 1);
        return (((long) (i10 - mo12572b(j10))) * this.f44118b) + j10;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: b */
    public final int mo12572b(long j10) {
        long j11 = this.f44118b;
        int i10 = this.f44116d;
        return j10 >= 0 ? (int) ((j10 / j11) % ((long) i10)) : (i10 - 1) + ((int) (((j10 + 1) / j11) % ((long) i10)));
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: n */
    public final int mo12580n() {
        return this.f44116d - 1;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public final AbstractC6097d mo12584t() {
        return this.f44117e;
    }
}
