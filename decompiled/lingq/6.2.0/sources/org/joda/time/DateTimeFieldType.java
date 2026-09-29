package org.joda.time;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p000.f12;
import p000.s11;
import p000.t22;

/* JADX INFO: loaded from: classes.dex */
public abstract class DateTimeFieldType implements Serializable {

    /* JADX INFO: renamed from: H */
    public static final DateTimeFieldType f54805H;

    /* JADX INFO: renamed from: I */
    public static final DateTimeFieldType f54806I;

    /* JADX INFO: renamed from: J */
    public static final DateTimeFieldType f54807J;

    /* JADX INFO: renamed from: K */
    public static final DateTimeFieldType f54808K;

    /* JADX INFO: renamed from: L */
    public static final DateTimeFieldType f54809L;

    /* JADX INFO: renamed from: M */
    public static final DateTimeFieldType f54810M;

    /* JADX INFO: renamed from: N */
    public static final DateTimeFieldType f54811N;

    /* JADX INFO: renamed from: O */
    public static final DateTimeFieldType f54812O;

    /* JADX INFO: renamed from: P */
    public static final DateTimeFieldType f54813P;

    /* JADX INFO: renamed from: Q */
    public static final DateTimeFieldType f54814Q;

    /* JADX INFO: renamed from: R */
    public static final DateTimeFieldType f54815R;

    /* JADX INFO: renamed from: a */
    public static final DateTimeFieldType f54816a = new StandardDateTimeFieldType("era", (byte) 1, DurationFieldType.f54834a);

    /* JADX INFO: renamed from: b */
    public static final DateTimeFieldType f54817b;

    /* JADX INFO: renamed from: c */
    public static final DateTimeFieldType f54818c;

    /* JADX INFO: renamed from: d */
    public static final DateTimeFieldType f54819d;

    /* JADX INFO: renamed from: e */
    public static final DateTimeFieldType f54820e;

    /* JADX INFO: renamed from: f */
    public static final DateTimeFieldType f54821f;

    /* JADX INFO: renamed from: g */
    public static final DateTimeFieldType f54822g;

    /* JADX INFO: renamed from: h */
    public static final DateTimeFieldType f54823h;

    /* JADX INFO: renamed from: i */
    public static final DateTimeFieldType f54824i;

    /* JADX INFO: renamed from: j */
    public static final DateTimeFieldType f54825j;

    /* JADX INFO: renamed from: k */
    public static final DateTimeFieldType f54826k;

    /* JADX INFO: renamed from: l */
    public static final DateTimeFieldType f54827l;
    private static final long serialVersionUID = -42615285973990L;
    private final String iName;

    public static class StandardDateTimeFieldType extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;

        /* JADX INFO: renamed from: S */
        public final transient DurationFieldType f54828S;
        private final byte iOrdinal;

        public StandardDateTimeFieldType(String str, byte b, DurationFieldType durationFieldType) {
            super(str);
            this.iOrdinal = b;
            this.f54828S = durationFieldType;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DateTimeFieldType.f54816a;
                case 2:
                    return DateTimeFieldType.f54817b;
                case 3:
                    return DateTimeFieldType.f54818c;
                case 4:
                    return DateTimeFieldType.f54819d;
                case 5:
                    return DateTimeFieldType.f54820e;
                case 6:
                    return DateTimeFieldType.f54821f;
                case 7:
                    return DateTimeFieldType.f54822g;
                case 8:
                    return DateTimeFieldType.f54823h;
                case 9:
                    return DateTimeFieldType.f54824i;
                case 10:
                    return DateTimeFieldType.f54825j;
                case 11:
                    return DateTimeFieldType.f54826k;
                case 12:
                    return DateTimeFieldType.f54827l;
                case 13:
                    return DateTimeFieldType.f54805H;
                case 14:
                    return DateTimeFieldType.f54806I;
                case 15:
                    return DateTimeFieldType.f54807J;
                case 16:
                    return DateTimeFieldType.f54808K;
                case 17:
                    return DateTimeFieldType.f54809L;
                case 18:
                    return DateTimeFieldType.f54810M;
                case 19:
                    return DateTimeFieldType.f54811N;
                case 20:
                    return DateTimeFieldType.f54812O;
                case 21:
                    return DateTimeFieldType.f54813P;
                case 22:
                    return DateTimeFieldType.f54814Q;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    return DateTimeFieldType.f54815R;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.DateTimeFieldType
        /* JADX INFO: renamed from: a */
        public final DurationFieldType mo18334a() {
            return this.f54828S;
        }

        @Override // org.joda.time.DateTimeFieldType
        /* JADX INFO: renamed from: b */
        public final f12 mo18335b(s11 s11Var) {
            AtomicReference atomicReference = t22.f61763a;
            if (s11Var == null) {
                s11Var = ISOChronology.m18437Q();
            }
            switch (this.iOrdinal) {
                case 1:
                    return s11Var.mo18402i();
                case 2:
                    return s11Var.mo18388K();
                case 3:
                    return s11Var.mo18395b();
                case 4:
                    return s11Var.mo18387J();
                case 5:
                    return s11Var.mo18386I();
                case 6:
                    return s11Var.mo18400g();
                case 7:
                    return s11Var.mo18415w();
                case 8:
                    return s11Var.mo18398e();
                case 9:
                    return s11Var.mo18384E();
                case 10:
                    return s11Var.mo18383D();
                case 11:
                    return s11Var.mo18381B();
                case 12:
                    return s11Var.mo18399f();
                case 13:
                    return s11Var.mo18404l();
                case 14:
                    return s11Var.mo18407o();
                case 15:
                    return s11Var.mo18397d();
                case 16:
                    return s11Var.mo18396c();
                case 17:
                    return s11Var.mo18406n();
                case 18:
                    return s11Var.mo18412t();
                case 19:
                    return s11Var.mo18413u();
                case 20:
                    return s11Var.mo18417y();
                case 21:
                    return s11Var.mo18418z();
                case 22:
                    return s11Var.mo18410r();
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    return s11Var.mo18411s();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandardDateTimeFieldType) && this.iOrdinal == ((StandardDateTimeFieldType) obj).iOrdinal;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    static {
        DurationFieldType durationFieldType = DurationFieldType.f54837d;
        f54817b = new StandardDateTimeFieldType("yearOfEra", (byte) 2, durationFieldType);
        f54818c = new StandardDateTimeFieldType("centuryOfEra", (byte) 3, DurationFieldType.f54835b);
        f54819d = new StandardDateTimeFieldType("yearOfCentury", (byte) 4, durationFieldType);
        f54820e = new StandardDateTimeFieldType("year", (byte) 5, durationFieldType);
        DurationFieldType durationFieldType2 = DurationFieldType.f54840g;
        f54821f = new StandardDateTimeFieldType("dayOfYear", (byte) 6, durationFieldType2);
        f54822g = new StandardDateTimeFieldType("monthOfYear", (byte) 7, DurationFieldType.f54838e);
        f54823h = new StandardDateTimeFieldType("dayOfMonth", (byte) 8, durationFieldType2);
        DurationFieldType durationFieldType3 = DurationFieldType.f54836c;
        f54824i = new StandardDateTimeFieldType("weekyearOfCentury", (byte) 9, durationFieldType3);
        f54825j = new StandardDateTimeFieldType("weekyear", (byte) 10, durationFieldType3);
        f54826k = new StandardDateTimeFieldType("weekOfWeekyear", (byte) 11, DurationFieldType.f54839f);
        f54827l = new StandardDateTimeFieldType("dayOfWeek", (byte) 12, durationFieldType2);
        f54805H = new StandardDateTimeFieldType("halfdayOfDay", (byte) 13, DurationFieldType.f54841h);
        DurationFieldType durationFieldType4 = DurationFieldType.f54842i;
        f54806I = new StandardDateTimeFieldType("hourOfHalfday", (byte) 14, durationFieldType4);
        f54807J = new StandardDateTimeFieldType("clockhourOfHalfday", (byte) 15, durationFieldType4);
        f54808K = new StandardDateTimeFieldType("clockhourOfDay", (byte) 16, durationFieldType4);
        f54809L = new StandardDateTimeFieldType("hourOfDay", (byte) 17, durationFieldType4);
        DurationFieldType durationFieldType5 = DurationFieldType.f54843j;
        f54810M = new StandardDateTimeFieldType("minuteOfDay", (byte) 18, durationFieldType5);
        f54811N = new StandardDateTimeFieldType("minuteOfHour", (byte) 19, durationFieldType5);
        DurationFieldType durationFieldType6 = DurationFieldType.f54844k;
        f54812O = new StandardDateTimeFieldType("secondOfDay", (byte) 20, durationFieldType6);
        f54813P = new StandardDateTimeFieldType("secondOfMinute", (byte) 21, durationFieldType6);
        DurationFieldType durationFieldType7 = DurationFieldType.f54845l;
        f54814Q = new StandardDateTimeFieldType("millisOfDay", (byte) 22, durationFieldType7);
        f54815R = new StandardDateTimeFieldType("millisOfSecond", (byte) 23, durationFieldType7);
    }

    public DateTimeFieldType(String str) {
        this.iName = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract DurationFieldType mo18334a();

    /* JADX INFO: renamed from: b */
    public abstract f12 mo18335b(s11 s11Var);

    /* JADX INFO: renamed from: c */
    public final String m18336c() {
        return this.iName;
    }

    public final String toString() {
        return this.iName;
    }
}
