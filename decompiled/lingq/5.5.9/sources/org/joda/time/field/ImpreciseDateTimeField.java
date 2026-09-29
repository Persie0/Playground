package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ImpreciseDateTimeField extends AbstractC8118a {

    /* JADX INFO: renamed from: b */
    public final long f44101b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6097d f44102c;

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: a */
        public final long mo12591a(int i10, long j10) {
            return ImpreciseDateTimeField.this.mo12571a(i10, j10);
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: l */
        public final long mo12592l(long j10, long j11) {
            return ImpreciseDateTimeField.this.mo16083U(j10, j11);
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: s */
        public final long mo12594s() {
            return ImpreciseDateTimeField.this.f44101b;
        }

        @Override // p163hp.AbstractC6097d
        /* JADX INFO: renamed from: t */
        public final boolean mo12595t() {
            return false;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j10) {
        super(dateTimeFieldType);
        this.f44101b = j10;
        this.f44102c = new LinkedDurationField(dateTimeFieldType.mo16009a());
    }

    /* JADX INFO: renamed from: U */
    public abstract long mo16083U(long j10, long j11);

    @Override // p163hp.AbstractC6095b
    /* JADX INFO: renamed from: j */
    public final AbstractC6097d mo12577j() {
        return this.f44102c;
    }
}
