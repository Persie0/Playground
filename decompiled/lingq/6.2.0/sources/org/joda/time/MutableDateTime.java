package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import p000.f12;
import p000.s11;

/* JADX INFO: loaded from: classes2.dex */
public class MutableDateTime extends BaseDateTime implements Cloneable, Serializable {
    private static final long serialVersionUID = 2852608688135209575L;
    private f12 iRoundingField;
    private int iRoundingMode;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private f12 iField;
        private MutableDateTime iInstant;

        public Property(MutableDateTime mutableDateTime, f12 f12Var) {
            this.iInstant = mutableDateTime;
            this.iField = f12Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).mo18335b(this.iInstant.mo18365a());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.mo11491r());
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        /* JADX INFO: renamed from: b */
        public final s11 mo18375b() {
            return this.iInstant.mo18365a();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        /* JADX INFO: renamed from: c */
        public final f12 mo18376c() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        /* JADX INFO: renamed from: d */
        public final long mo18377d() {
            return this.iInstant.mo18366b();
        }

        /* JADX INFO: renamed from: e */
        public final void m18378e(int i) {
            MutableDateTime mutableDateTime = this.iInstant;
            mutableDateTime.mo18373d(this.iField.mo11031a(i, mutableDateTime.mo18366b()));
        }

        /* JADX INFO: renamed from: f */
        public final void m18379f(int i) {
            MutableDateTime mutableDateTime = this.iInstant;
            mutableDateTime.mo18373d(this.iField.mo3733B(i, mutableDateTime.mo18366b()));
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    @Override // org.joda.time.base.BaseDateTime
    /* JADX INFO: renamed from: d */
    public final void mo18373d(long j) {
        int i = this.iRoundingMode;
        if (i == 1) {
            j = this.iRoundingField.mo4687x(j);
        } else if (i == 2) {
            j = this.iRoundingField.mo4686w(j);
        } else if (i == 3) {
            j = this.iRoundingField.mo11484A(j);
        } else if (i == 4) {
            j = this.iRoundingField.mo11493y(j);
        } else if (i == 5) {
            j = this.iRoundingField.mo11494z(j);
        }
        super.mo18373d(j);
    }

    /* JADX INFO: renamed from: e */
    public final Property m18374e() {
        return new Property(this, mo18365a().mo18399f());
    }
}
