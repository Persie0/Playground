package org.joda.time;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;
import p163hp.C6096c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DateTimeFieldType implements Serializable {

    /* JADX INFO: renamed from: H */
    public static final DateTimeFieldType f43925H;

    /* JADX INFO: renamed from: I */
    public static final DateTimeFieldType f43926I;

    /* JADX INFO: renamed from: J */
    public static final DateTimeFieldType f43927J;

    /* JADX INFO: renamed from: K */
    public static final DateTimeFieldType f43928K;

    /* JADX INFO: renamed from: L */
    public static final DateTimeFieldType f43929L;

    /* JADX INFO: renamed from: M */
    public static final DateTimeFieldType f43930M;

    /* JADX INFO: renamed from: N */
    public static final DateTimeFieldType f43931N;

    /* JADX INFO: renamed from: O */
    public static final DateTimeFieldType f43932O;

    /* JADX INFO: renamed from: P */
    public static final DateTimeFieldType f43933P;

    /* JADX INFO: renamed from: Q */
    public static final DateTimeFieldType f43934Q;

    /* JADX INFO: renamed from: R */
    public static final DateTimeFieldType f43935R;

    /* JADX INFO: renamed from: a */
    public static final DateTimeFieldType f43936a = new StandardDateTimeFieldType("era", (byte) 1, DurationFieldType.f43956a);

    /* JADX INFO: renamed from: b */
    public static final DateTimeFieldType f43937b;

    /* JADX INFO: renamed from: c */
    public static final DateTimeFieldType f43938c;

    /* JADX INFO: renamed from: d */
    public static final DateTimeFieldType f43939d;

    /* JADX INFO: renamed from: e */
    public static final DateTimeFieldType f43940e;

    /* JADX INFO: renamed from: f */
    public static final DateTimeFieldType f43941f;

    /* JADX INFO: renamed from: g */
    public static final DateTimeFieldType f43942g;

    /* JADX INFO: renamed from: h */
    public static final DateTimeFieldType f43943h;

    /* JADX INFO: renamed from: i */
    public static final DateTimeFieldType f43944i;

    /* JADX INFO: renamed from: j */
    public static final DateTimeFieldType f43945j;

    /* JADX INFO: renamed from: k */
    public static final DateTimeFieldType f43946k;

    /* JADX INFO: renamed from: l */
    public static final DateTimeFieldType f43947l;
    private static final long serialVersionUID = -42615285973990L;
    private final String iName;

    public static class StandardDateTimeFieldType extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;

        /* JADX INFO: renamed from: S */
        public final transient DurationFieldType f43948S;
        private final byte iOrdinal;

        public StandardDateTimeFieldType(String str, byte b10, DurationFieldType durationFieldType) {
            super(str);
            this.iOrdinal = b10;
            this.f43948S = durationFieldType;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DateTimeFieldType.f43936a;
                case 2:
                    return DateTimeFieldType.f43937b;
                case 3:
                    return DateTimeFieldType.f43938c;
                case 4:
                    return DateTimeFieldType.f43939d;
                case 5:
                    return DateTimeFieldType.f43940e;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return DateTimeFieldType.f43941f;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return DateTimeFieldType.f43942g;
                case 8:
                    return DateTimeFieldType.f43943h;
                case 9:
                    return DateTimeFieldType.f43944i;
                case 10:
                    return DateTimeFieldType.f43945j;
                case 11:
                    return DateTimeFieldType.f43946k;
                case 12:
                    return DateTimeFieldType.f43947l;
                case 13:
                    return DateTimeFieldType.f43925H;
                case 14:
                    return DateTimeFieldType.f43926I;
                case 15:
                    return DateTimeFieldType.f43927J;
                case 16:
                    return DateTimeFieldType.f43928K;
                case 17:
                    return DateTimeFieldType.f43929L;
                case 18:
                    return DateTimeFieldType.f43930M;
                case 19:
                    return DateTimeFieldType.f43931N;
                case 20:
                    return DateTimeFieldType.f43932O;
                case 21:
                    return DateTimeFieldType.f43933P;
                case 22:
                    return DateTimeFieldType.f43934Q;
                case 23:
                    return DateTimeFieldType.f43935R;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.DateTimeFieldType
        /* JADX INFO: renamed from: a */
        public final DurationFieldType mo16009a() {
            return this.f43948S;
        }

        @Override // org.joda.time.DateTimeFieldType
        /* JADX INFO: renamed from: b */
        public final AbstractC6095b mo16010b(AbstractC6094a abstractC6094a) {
            AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
            if (abstractC6094a == null) {
                ISOChronology iSOChronology = ISOChronology.f44066e0;
                abstractC6094a = ISOChronology.m16074k0(DateTimeZone.m16016e());
            }
            switch (this.iOrdinal) {
                case 1:
                    return abstractC6094a.mo12552l();
                case 2:
                    return abstractC6094a.mo12547e0();
                case 3:
                    return abstractC6094a.mo12540b();
                case 4:
                    return abstractC6094a.mo12545d0();
                case 5:
                    return abstractC6094a.mo12543c0();
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return abstractC6094a.mo12550j();
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return abstractC6094a.mo12528G();
                case 8:
                    return abstractC6094a.mo12546e();
                case 9:
                    return abstractC6094a.mo12536X();
                case 10:
                    return abstractC6094a.mo12535U();
                case 11:
                    return abstractC6094a.mo12533R();
                case 12:
                    return abstractC6094a.mo12549h();
                case 13:
                    return abstractC6094a.mo12555r();
                case 14:
                    return abstractC6094a.mo12558w();
                case 15:
                    return abstractC6094a.mo12544d();
                case 16:
                    return abstractC6094a.mo12542c();
                case 17:
                    return abstractC6094a.mo12557t();
                case 18:
                    return abstractC6094a.mo12525C();
                case 19:
                    return abstractC6094a.mo12526D();
                case 20:
                    return abstractC6094a.mo12530J();
                case 21:
                    return abstractC6094a.mo12531M();
                case 22:
                    return abstractC6094a.mo12561z();
                case 23:
                    return abstractC6094a.mo12524A();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof StandardDateTimeFieldType) && this.iOrdinal == ((StandardDateTimeFieldType) obj).iOrdinal) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    static {
        DurationFieldType durationFieldType = DurationFieldType.f43959d;
        f43937b = new StandardDateTimeFieldType("yearOfEra", (byte) 2, durationFieldType);
        f43938c = new StandardDateTimeFieldType("centuryOfEra", (byte) 3, DurationFieldType.f43957b);
        f43939d = new StandardDateTimeFieldType("yearOfCentury", (byte) 4, durationFieldType);
        f43940e = new StandardDateTimeFieldType("year", (byte) 5, durationFieldType);
        DurationFieldType durationFieldType2 = DurationFieldType.f43962g;
        f43941f = new StandardDateTimeFieldType("dayOfYear", (byte) 6, durationFieldType2);
        f43942g = new StandardDateTimeFieldType("monthOfYear", (byte) 7, DurationFieldType.f43960e);
        f43943h = new StandardDateTimeFieldType("dayOfMonth", (byte) 8, durationFieldType2);
        DurationFieldType durationFieldType3 = DurationFieldType.f43958c;
        f43944i = new StandardDateTimeFieldType("weekyearOfCentury", (byte) 9, durationFieldType3);
        f43945j = new StandardDateTimeFieldType("weekyear", (byte) 10, durationFieldType3);
        f43946k = new StandardDateTimeFieldType("weekOfWeekyear", (byte) 11, DurationFieldType.f43961f);
        f43947l = new StandardDateTimeFieldType("dayOfWeek", (byte) 12, durationFieldType2);
        f43925H = new StandardDateTimeFieldType("halfdayOfDay", (byte) 13, DurationFieldType.f43963h);
        DurationFieldType durationFieldType4 = DurationFieldType.f43964i;
        f43926I = new StandardDateTimeFieldType("hourOfHalfday", (byte) 14, durationFieldType4);
        f43927J = new StandardDateTimeFieldType("clockhourOfHalfday", (byte) 15, durationFieldType4);
        f43928K = new StandardDateTimeFieldType("clockhourOfDay", (byte) 16, durationFieldType4);
        f43929L = new StandardDateTimeFieldType("hourOfDay", (byte) 17, durationFieldType4);
        DurationFieldType durationFieldType5 = DurationFieldType.f43965j;
        f43930M = new StandardDateTimeFieldType("minuteOfDay", (byte) 18, durationFieldType5);
        f43931N = new StandardDateTimeFieldType("minuteOfHour", (byte) 19, durationFieldType5);
        DurationFieldType durationFieldType6 = DurationFieldType.f43966k;
        f43932O = new StandardDateTimeFieldType("secondOfDay", (byte) 20, durationFieldType6);
        f43933P = new StandardDateTimeFieldType("secondOfMinute", (byte) 21, durationFieldType6);
        DurationFieldType durationFieldType7 = DurationFieldType.f43967l;
        f43934Q = new StandardDateTimeFieldType("millisOfDay", (byte) 22, durationFieldType7);
        f43935R = new StandardDateTimeFieldType("millisOfSecond", (byte) 23, durationFieldType7);
    }

    public DateTimeFieldType(String str) {
        this.iName = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract DurationFieldType mo16009a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC6095b mo16010b(AbstractC6094a abstractC6094a);

    /* JADX INFO: renamed from: c */
    public final String m16011c() {
        return this.iName;
    }

    public final String toString() {
        return this.iName;
    }
}
