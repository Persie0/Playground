package org.joda.time;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p000.en2;
import p000.s11;
import p000.t22;

/* JADX INFO: loaded from: classes.dex */
public abstract class DurationFieldType implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final DurationFieldType f54834a = new StandardDurationFieldType("eras", (byte) 1);

    /* JADX INFO: renamed from: b */
    public static final DurationFieldType f54835b = new StandardDurationFieldType("centuries", (byte) 2);

    /* JADX INFO: renamed from: c */
    public static final DurationFieldType f54836c = new StandardDurationFieldType("weekyears", (byte) 3);

    /* JADX INFO: renamed from: d */
    public static final DurationFieldType f54837d = new StandardDurationFieldType("years", (byte) 4);

    /* JADX INFO: renamed from: e */
    public static final DurationFieldType f54838e = new StandardDurationFieldType("months", (byte) 5);

    /* JADX INFO: renamed from: f */
    public static final DurationFieldType f54839f = new StandardDurationFieldType("weeks", (byte) 6);

    /* JADX INFO: renamed from: g */
    public static final DurationFieldType f54840g = new StandardDurationFieldType("days", (byte) 7);

    /* JADX INFO: renamed from: h */
    public static final DurationFieldType f54841h = new StandardDurationFieldType("halfdays", (byte) 8);

    /* JADX INFO: renamed from: i */
    public static final DurationFieldType f54842i = new StandardDurationFieldType("hours", (byte) 9);

    /* JADX INFO: renamed from: j */
    public static final DurationFieldType f54843j = new StandardDurationFieldType("minutes", (byte) 10);

    /* JADX INFO: renamed from: k */
    public static final DurationFieldType f54844k = new StandardDurationFieldType("seconds", (byte) 11);

    /* JADX INFO: renamed from: l */
    public static final DurationFieldType f54845l = new StandardDurationFieldType("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    private final String iName;

    public static class StandardDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;
        private final byte iOrdinal;

        public StandardDurationFieldType(String str, byte b) {
            super(str);
            this.iOrdinal = b;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DurationFieldType.f54834a;
                case 2:
                    return DurationFieldType.f54835b;
                case 3:
                    return DurationFieldType.f54836c;
                case 4:
                    return DurationFieldType.f54837d;
                case 5:
                    return DurationFieldType.f54838e;
                case 6:
                    return DurationFieldType.f54839f;
                case 7:
                    return DurationFieldType.f54840g;
                case 8:
                    return DurationFieldType.f54841h;
                case 9:
                    return DurationFieldType.f54842i;
                case 10:
                    return DurationFieldType.f54843j;
                case 11:
                    return DurationFieldType.f54844k;
                case 12:
                    return DurationFieldType.f54845l;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.DurationFieldType
        /* JADX INFO: renamed from: a */
        public final en2 mo18361a(s11 s11Var) {
            AtomicReference atomicReference = t22.f61763a;
            if (s11Var == null) {
                s11Var = ISOChronology.m18437Q();
            }
            switch (this.iOrdinal) {
                case 1:
                    return s11Var.mo18403j();
                case 2:
                    return s11Var.mo18394a();
                case 3:
                    return s11Var.mo18385F();
                case 4:
                    return s11Var.mo18389L();
                case 5:
                    return s11Var.mo18416x();
                case 6:
                    return s11Var.mo18382C();
                case 7:
                    return s11Var.mo18401h();
                case 8:
                    return s11Var.mo18405m();
                case 9:
                    return s11Var.mo18408p();
                case 10:
                    return s11Var.mo18414v();
                case 11:
                    return s11Var.mo18380A();
                case 12:
                    return s11Var.mo18409q();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandardDurationFieldType) && this.iOrdinal == ((StandardDurationFieldType) obj).iOrdinal;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    public DurationFieldType(String str) {
        this.iName = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract en2 mo18361a(s11 s11Var);

    /* JADX INFO: renamed from: b */
    public final String m18362b() {
        return this.iName;
    }

    public final String toString() {
        return this.iName;
    }
}
