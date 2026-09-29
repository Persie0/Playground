package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: renamed from: org.joda.time.field.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8119b extends AbstractC8118a {

    /* JADX INFO: renamed from: b */
    public final AbstractC6095b f44107b;

    public AbstractC8119b(AbstractC6095b abstractC6095b, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (abstractC6095b == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!abstractC6095b.mo12588z()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.f44107b = abstractC6095b;
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: J */
    public long mo12568J(int i10, long j10) {
        return this.f44107b.mo12568J(i10, j10);
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public AbstractC6097d mo12577j() {
        return this.f44107b.mo12577j();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: t */
    public AbstractC6097d mo12584t() {
        return this.f44107b.mo12584t();
    }

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: y */
    public final boolean mo12587y() {
        return this.f44107b.mo12587y();
    }
}
