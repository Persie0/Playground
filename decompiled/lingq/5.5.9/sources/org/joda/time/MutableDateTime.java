package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;

/* JADX INFO: loaded from: classes2.dex */
public class MutableDateTime extends BaseDateTime implements Cloneable {
    private static final long serialVersionUID = 2852608688135209575L;
    private AbstractC6095b iRoundingField;
    private int iRoundingMode;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private AbstractC6095b iField;
        private MutableDateTime iInstant;

        public Property(MutableDateTime mutableDateTime, AbstractC6095b abstractC6095b) {
            this.iInstant = mutableDateTime;
            this.iField = abstractC6095b;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).mo16010b(this.iInstant.mo12598n());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.mo12585w());
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        /* JADX INFO: renamed from: b */
        public final AbstractC6094a mo16037b() {
            return this.iInstant.mo12598n();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        /* JADX INFO: renamed from: c */
        public final AbstractC6095b mo16038c() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        /* JADX INFO: renamed from: d */
        public final long mo16039d() {
            return this.iInstant.mo12597k();
        }

        /* JADX INFO: renamed from: e */
        public final void m16040e(int i10) {
            MutableDateTime mutableDateTime = this.iInstant;
            mutableDateTime.mo16036s(this.iField.mo12571a(i10, mutableDateTime.mo12597k()));
        }

        /* JADX INFO: renamed from: h */
        public final void m16041h(int i10) {
            MutableDateTime mutableDateTime = this.iInstant;
            mutableDateTime.mo16036s(this.iField.mo12568J(i10, mutableDateTime.mo12597k()));
        }
    }

    public MutableDateTime() {
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(0L, ISOChronology.m16074k0(dateTimeZone));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    @Override // org.joda.time.base.BaseDateTime
    /* JADX INFO: renamed from: s */
    public final void mo16036s(long j10) {
        int i10 = this.iRoundingMode;
        if (i10 == 1) {
            j10 = this.iRoundingField.mo12564D(j10);
        } else if (i10 == 2) {
            j10 = this.iRoundingField.mo12563C(j10);
        } else if (i10 == 3) {
            j10 = this.iRoundingField.mo12567I(j10);
        } else if (i10 == 4) {
            j10 = this.iRoundingField.mo12565E(j10);
        } else if (i10 == 5) {
            j10 = this.iRoundingField.mo12566G(j10);
        }
        super.mo16036s(j10);
    }
}
