package org.joda.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6097d;
import p163hp.C6096c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DurationFieldType implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final DurationFieldType f43956a = new StandardDurationFieldType("eras", (byte) 1);

    /* JADX INFO: renamed from: b */
    public static final DurationFieldType f43957b = new StandardDurationFieldType("centuries", (byte) 2);

    /* JADX INFO: renamed from: c */
    public static final DurationFieldType f43958c = new StandardDurationFieldType("weekyears", (byte) 3);

    /* JADX INFO: renamed from: d */
    public static final DurationFieldType f43959d = new StandardDurationFieldType("years", (byte) 4);

    /* JADX INFO: renamed from: e */
    public static final DurationFieldType f43960e = new StandardDurationFieldType("months", (byte) 5);

    /* JADX INFO: renamed from: f */
    public static final DurationFieldType f43961f = new StandardDurationFieldType("weeks", (byte) 6);

    /* JADX INFO: renamed from: g */
    public static final DurationFieldType f43962g = new StandardDurationFieldType("days", (byte) 7);

    /* JADX INFO: renamed from: h */
    public static final DurationFieldType f43963h = new StandardDurationFieldType("halfdays", (byte) 8);

    /* JADX INFO: renamed from: i */
    public static final DurationFieldType f43964i = new StandardDurationFieldType("hours", (byte) 9);

    /* JADX INFO: renamed from: j */
    public static final DurationFieldType f43965j = new StandardDurationFieldType("minutes", (byte) 10);

    /* JADX INFO: renamed from: k */
    public static final DurationFieldType f43966k = new StandardDurationFieldType("seconds", (byte) 11);

    /* JADX INFO: renamed from: l */
    public static final DurationFieldType f43967l = new StandardDurationFieldType("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    private final String iName;

    public static class StandardDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;
        private final byte iOrdinal;

        public StandardDurationFieldType(String str, byte b10) {
            super(str);
            this.iOrdinal = b10;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DurationFieldType.f43956a;
                case 2:
                    return DurationFieldType.f43957b;
                case 3:
                    return DurationFieldType.f43958c;
                case 4:
                    return DurationFieldType.f43959d;
                case 5:
                    return DurationFieldType.f43960e;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return DurationFieldType.f43961f;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return DurationFieldType.f43962g;
                case 8:
                    return DurationFieldType.f43963h;
                case 9:
                    return DurationFieldType.f43964i;
                case 10:
                    return DurationFieldType.f43965j;
                case 11:
                    return DurationFieldType.f43966k;
                case 12:
                    return DurationFieldType.f43967l;
                default:
                    return this;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // org.joda.time.DurationFieldType
        /* JADX INFO: renamed from: a */
        public final AbstractC6097d mo16032a(AbstractC6094a abstractC6094a) {
            AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
            if (abstractC6094a == null) {
                ISOChronology iSOChronology = ISOChronology.f44066e0;
                abstractC6094a = ISOChronology.m16074k0(DateTimeZone.m16016e());
            }
            switch (this.iOrdinal) {
                case 1:
                    return abstractC6094a.mo12553n();
                case 2:
                    return abstractC6094a.mo12538a();
                case 3:
                    return abstractC6094a.mo12537Y();
                case 4:
                    return abstractC6094a.mo12548f0();
                case 5:
                    return abstractC6094a.mo12529I();
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return abstractC6094a.mo12534T();
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return abstractC6094a.mo12551k();
                case 8:
                    return abstractC6094a.mo12556s();
                case 9:
                    return abstractC6094a.mo12559x();
                case 10:
                    return abstractC6094a.mo12527E();
                case 11:
                    return abstractC6094a.mo12532Q();
                case 12:
                    return abstractC6094a.mo12560y();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof StandardDurationFieldType) && this.iOrdinal == ((StandardDurationFieldType) obj).iOrdinal) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    public DurationFieldType(String str) {
        this.iName = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC6097d mo16032a(AbstractC6094a abstractC6094a);

    /* JADX INFO: renamed from: b */
    public final String m16033b() {
        return this.iName;
    }

    public final String toString() {
        return this.iName;
    }
}
