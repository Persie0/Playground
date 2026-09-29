package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import p000.en2;
import p000.w80;

/* JADX INFO: renamed from: org.joda.time.field.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3431a extends w80 {

    /* JADX INFO: renamed from: b */
    public final long f54923b;

    /* JADX INFO: renamed from: c */
    public final en2 f54924c;

    public AbstractC3431a(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.f54923b = j;
        final DurationFieldType durationFieldTypeMo18334a = dateTimeFieldType.mo18334a();
        this.f54924c = new BaseDurationField(durationFieldTypeMo18334a) { // from class: org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField
            private static final long serialVersionUID = -203813474600094134L;

            @Override // p000.en2
            /* JADX INFO: renamed from: a */
            public final long mo11268a(int i, long j2) {
                return this.this$0.mo11031a(i, j2);
            }

            @Override // p000.en2
            /* JADX INFO: renamed from: b */
            public final long mo11269b(long j2, long j3) {
                return this.this$0.mo18445F(j2, j3);
            }

            @Override // p000.en2
            /* JADX INFO: renamed from: d */
            public final long mo11271d() {
                return this.this$0.f54923b;
            }

            @Override // p000.en2
            /* JADX INFO: renamed from: e */
            public final boolean mo11272e() {
                return false;
            }
        };
    }

    /* JADX INFO: renamed from: F */
    public abstract long mo18445F(long j, long j2);

    @Override // p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return this.f54924c;
    }
}
