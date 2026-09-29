package org.joda.time.field;

import org.joda.time.DurationFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final AbstractC6097d iField;

    public DecoratedDurationField(AbstractC6097d abstractC6097d, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (!abstractC6097d.mo12596w()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = abstractC6097d;
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: a */
    public long mo12591a(int i10, long j10) {
        return this.iField.mo12591a(i10, j10);
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: l */
    public long mo12592l(long j10, long j11) {
        return this.iField.mo12592l(j10, j11);
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: s */
    public long mo12594s() {
        return this.iField.mo12594s();
    }

    @Override // p163hp.AbstractC6097d
    /* JADX INFO: renamed from: t */
    public final boolean mo12595t() {
        return this.iField.mo12595t();
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC6097d m16088x() {
        return this.iField;
    }
}
