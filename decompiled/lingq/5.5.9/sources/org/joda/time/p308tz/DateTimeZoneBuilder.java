package org.joda.time.p308tz;

import androidx.activity.result.C0204c;
import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6095b;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeZoneBuilder {

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final C8151b iEndRecurrence;
        final int iStandardOffset;
        final C8151b iStartRecurrence;

        public DSTZone(String str, int i10, C8151b c8151b, C8151b c8151b2) {
            super(str);
            this.iStandardOffset = i10;
            this.iStartRecurrence = c8151b;
            this.iEndRecurrence = c8151b2;
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            return m16022h().equals(dSTZone.m16022h()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence);
        }

        @Override // org.joda.time.DateTimeZone
        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: k */
        public final String mo16024k(long j10) {
            long jM16169a;
            int i10 = this.iStandardOffset;
            C8151b c8151b = this.iStartRecurrence;
            C8151b c8151b2 = this.iEndRecurrence;
            try {
                jM16169a = c8151b.m16169a(i10, c8151b2.f44260c, j10);
            } catch (ArithmeticException | IllegalArgumentException unused) {
                jM16169a = j10;
            }
            try {
                j10 = c8151b2.m16169a(i10, c8151b.f44260c, j10);
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jM16169a <= j10) {
                c8151b = c8151b2;
            }
            return c8151b.f44259b;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: n */
        public final int mo16025n(long j10) {
            long jM16169a;
            int i10 = this.iStandardOffset;
            C8151b c8151b = this.iStartRecurrence;
            C8151b c8151b2 = this.iEndRecurrence;
            try {
                jM16169a = c8151b.m16169a(i10, c8151b2.f44260c, j10);
            } catch (ArithmeticException | IllegalArgumentException unused) {
                jM16169a = j10;
            }
            try {
                j10 = c8151b2.m16169a(i10, c8151b.f44260c, j10);
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jM16169a <= j10) {
                c8151b = c8151b2;
            }
            return i10 + c8151b.f44260c;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: t */
        public final int mo16028t(long j10) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: w */
        public final boolean mo16029w() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: x */
        public final long mo16030x(long j10) {
            long jM16169a;
            int i10 = this.iStandardOffset;
            C8151b c8151b = this.iStartRecurrence;
            C8151b c8151b2 = this.iEndRecurrence;
            try {
                jM16169a = c8151b.m16169a(i10, c8151b2.f44260c, j10);
                if (j10 > 0 && jM16169a < 0) {
                    jM16169a = j10;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jM16169a2 = c8151b2.m16169a(i10, c8151b.f44260c, j10);
                if (j10 <= 0 || jM16169a2 >= 0) {
                    j10 = jM16169a2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return jM16169a > j10 ? j10 : jM16169a;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: z */
        public final long mo16031z(long j10) {
            long jM16170b;
            long j11 = j10 + 1;
            int i10 = this.iStandardOffset;
            C8151b c8151b = this.iStartRecurrence;
            C8151b c8151b2 = this.iEndRecurrence;
            try {
                jM16170b = c8151b.m16170b(i10, c8151b2.f44260c, j11);
                if (j11 < 0 && jM16170b > 0) {
                    jM16170b = j11;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jM16170b2 = c8151b2.m16170b(i10, c8151b.f44260c, j11);
                if (j11 >= 0 || jM16170b2 <= 0) {
                    j11 = jM16170b2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jM16170b <= j11) {
                jM16170b = j11;
            }
            return jM16170b - 1;
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        public PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: D */
        public static PrecalculatedZone m16163D(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i10 = 0; i10 < unsignedShort; i10++) {
                strArr[i10] = dataInput.readUTF();
            }
            int i11 = dataInput.readInt();
            long[] jArr = new long[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            String[] strArr2 = new String[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = DateTimeZoneBuilder.m16162b(dataInput);
                iArr[i12] = (int) DateTimeZoneBuilder.m16162b(dataInput);
                iArr2[i12] = (int) DateTimeZoneBuilder.m16162b(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i12] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new DSTZone(str, (int) DateTimeZoneBuilder.m16162b(dataInput), C8151b.m16168c(dataInput), C8151b.m16168c(dataInput)) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (m16022h().equals(precalculatedZone.m16022h()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public final int hashCode() {
            return m16022h().hashCode();
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: k */
        public final String mo16024k(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i10 = ~iBinarySearch;
            if (i10 < jArr.length) {
                return i10 > 0 ? this.iNameKeys[i10 - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i10 - 1] : dSTZone.mo16024k(j10);
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: n */
        public final int mo16025n(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i10 = ~iBinarySearch;
            if (i10 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i10 - 1] : dSTZone.mo16025n(j10);
            }
            if (i10 > 0) {
                return this.iWallOffsets[i10 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: t */
        public final int mo16028t(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i10 = ~iBinarySearch;
            if (i10 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i10 - 1] : dSTZone.iStandardOffset;
            }
            if (i10 > 0) {
                return this.iStandardOffsets[i10 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: w */
        public final boolean mo16029w() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: x */
        public final long mo16030x(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            int i10 = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i10 < jArr.length) {
                return jArr[i10];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j10;
            }
            long j11 = jArr[jArr.length - 1];
            if (j10 < j11) {
                j10 = j11;
            }
            return dSTZone.mo16030x(j10);
        }

        @Override // org.joda.time.DateTimeZone
        /* JADX INFO: renamed from: z */
        public final long mo16031z(long j10) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch >= 0) {
                return j10 > Long.MIN_VALUE ? j10 - 1 : j10;
            }
            int i10 = ~iBinarySearch;
            if (i10 < jArr.length) {
                if (i10 > 0) {
                    long j11 = jArr[i10 - 1];
                    if (j11 > Long.MIN_VALUE) {
                        return j11 - 1;
                    }
                }
                return j10;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long jMo16031z = dSTZone.mo16031z(j10);
                if (jMo16031z < j10) {
                    return jMo16031z;
                }
            }
            long j12 = jArr[i10 - 1];
            return j12 > Long.MIN_VALUE ? j12 - 1 : j10;
        }
    }

    /* JADX INFO: renamed from: org.joda.time.tz.DateTimeZoneBuilder$a */
    public static final class C8150a {

        /* JADX INFO: renamed from: a */
        public final char f44252a;

        /* JADX INFO: renamed from: b */
        public final int f44253b;

        /* JADX INFO: renamed from: c */
        public final int f44254c;

        /* JADX INFO: renamed from: d */
        public final int f44255d;

        /* JADX INFO: renamed from: e */
        public final boolean f44256e;

        /* JADX INFO: renamed from: f */
        public final int f44257f;

        public C8150a(char c10, int i10, int i11, int i12, boolean z10, int i13) {
            if (c10 != 'u' && c10 != 'w') {
                if (c10 != 's') {
                    throw new IllegalArgumentException("Unknown mode: " + c10);
                }
            }
            this.f44252a = c10;
            this.f44253b = i10;
            this.f44254c = i11;
            this.f44255d = i12;
            this.f44256e = z10;
            this.f44257f = i13;
        }

        /* JADX INFO: renamed from: a */
        public final long m16164a(long j10, ISOChronology iSOChronology) {
            int i10 = this.f44254c;
            if (i10 >= 0) {
                return iSOChronology.f43981T.mo12568J(i10, j10);
            }
            return iSOChronology.f43981T.mo12571a(i10, iSOChronology.f43986Y.mo12571a(1, iSOChronology.f43981T.mo12568J(1, j10)));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final long m16165b(long j10, ISOChronology iSOChronology) {
            try {
                return m16164a(j10, iSOChronology);
            } catch (IllegalArgumentException e10) {
                if (this.f44253b != 2 || this.f44254c != 29) {
                    throw e10;
                }
                while (!iSOChronology.f43987Z.mo12586x(j10)) {
                    j10 = iSOChronology.f43987Z.mo12571a(1, j10);
                }
                return m16164a(j10, iSOChronology);
            }
        }

        /* JADX INFO: renamed from: c */
        public final long m16166c(long j10, ISOChronology iSOChronology) {
            try {
                return m16164a(j10, iSOChronology);
            } catch (IllegalArgumentException e10) {
                if (this.f44253b != 2 || this.f44254c != 29) {
                    throw e10;
                }
                while (!iSOChronology.f43987Z.mo12586x(j10)) {
                    j10 = iSOChronology.f43987Z.mo12571a(-1, j10);
                }
                return m16164a(j10, iSOChronology);
            }
        }

        /* JADX INFO: renamed from: d */
        public final long m16167d(long j10, ISOChronology iSOChronology) {
            int iMo12572b = this.f44255d - iSOChronology.f43980S.mo12572b(j10);
            if (iMo12572b != 0) {
                if (this.f44256e) {
                    if (iMo12572b < 0) {
                        iMo12572b += 7;
                    }
                    j10 = iSOChronology.f43980S.mo12571a(iMo12572b, j10);
                } else if (iMo12572b > 0) {
                    iMo12572b -= 7;
                }
                j10 = iSOChronology.f43980S.mo12571a(iMo12572b, j10);
            }
            return j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8150a)) {
                return false;
            }
            C8150a c8150a = (C8150a) obj;
            return this.f44252a == c8150a.f44252a && this.f44253b == c8150a.f44253b && this.f44254c == c8150a.f44254c && this.f44255d == c8150a.f44255d && this.f44256e == c8150a.f44256e && this.f44257f == c8150a.f44257f;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.f44252a), Integer.valueOf(this.f44253b), Integer.valueOf(this.f44254c), Integer.valueOf(this.f44255d), Boolean.valueOf(this.f44256e), Integer.valueOf(this.f44257f)});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[OfYear]\nMode: ");
            sb2.append(this.f44252a);
            sb2.append("\nMonthOfYear: ");
            sb2.append(this.f44253b);
            sb2.append("\nDayOfMonth: ");
            sb2.append(this.f44254c);
            sb2.append("\nDayOfWeek: ");
            sb2.append(this.f44255d);
            sb2.append("\nAdvanceDayOfWeek: ");
            sb2.append(this.f44256e);
            sb2.append("\nMillisOfDay: ");
            return C0204c.m853l(sb2, this.f44257f, '\n');
        }
    }

    /* JADX INFO: renamed from: org.joda.time.tz.DateTimeZoneBuilder$b */
    public static final class C8151b {

        /* JADX INFO: renamed from: a */
        public final C8150a f44258a;

        /* JADX INFO: renamed from: b */
        public final String f44259b;

        /* JADX INFO: renamed from: c */
        public final int f44260c;

        public C8151b(C8150a c8150a, String str, int i10) {
            this.f44258a = c8150a;
            this.f44259b = str;
            this.f44260c = i10;
        }

        /* JADX INFO: renamed from: c */
        public static C8151b m16168c(DataInput dataInput) throws IOException {
            return new C8151b(new C8150a((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.m16162b(dataInput)), dataInput.readUTF(), (int) DateTimeZoneBuilder.m16162b(dataInput));
        }

        /* JADX INFO: renamed from: a */
        public final long m16169a(int i10, int i11, long j10) {
            C8150a c8150a = this.f44258a;
            char c10 = c8150a.f44252a;
            if (c10 == 'w') {
                i10 += i11;
            } else if (c10 != 's') {
                i10 = 0;
            }
            long j11 = i10;
            long j12 = j10 + j11;
            ISOChronology iSOChronology = ISOChronology.f44066e0;
            AbstractC6095b abstractC6095b = iSOChronology.f43986Y;
            int i12 = c8150a.f44253b;
            long jMo12568J = iSOChronology.f43970I.mo12568J(0, abstractC6095b.mo12568J(i12, j12));
            AbstractC6095b abstractC6095b2 = iSOChronology.f43970I;
            int i13 = c8150a.f44257f;
            long jM16165b = c8150a.m16165b(abstractC6095b2.mo12571a(Math.min(i13, 86399999), jMo12568J), iSOChronology);
            if (c8150a.f44255d == 0) {
                if (jM16165b <= j12) {
                    jM16165b = c8150a.m16165b(iSOChronology.f43987Z.mo12571a(1, jM16165b), iSOChronology);
                }
                return iSOChronology.f43970I.mo12571a(i13, iSOChronology.f43970I.mo12568J(0, jM16165b)) - j11;
            }
            jM16165b = c8150a.m16167d(jM16165b, iSOChronology);
            if (jM16165b <= j12) {
                jM16165b = c8150a.m16167d(c8150a.m16165b(iSOChronology.f43986Y.mo12568J(i12, iSOChronology.f43987Z.mo12571a(1, jM16165b)), iSOChronology), iSOChronology);
            }
            return iSOChronology.f43970I.mo12571a(i13, iSOChronology.f43970I.mo12568J(0, jM16165b)) - j11;
        }

        /* JADX INFO: renamed from: b */
        public final long m16170b(int i10, int i11, long j10) {
            C8150a c8150a = this.f44258a;
            char c10 = c8150a.f44252a;
            if (c10 == 'w') {
                i10 += i11;
            } else if (c10 != 's') {
                i10 = 0;
            }
            long j11 = i10;
            long j12 = j10 + j11;
            ISOChronology iSOChronology = ISOChronology.f44066e0;
            AbstractC6095b abstractC6095b = iSOChronology.f43986Y;
            int i12 = c8150a.f44253b;
            long jMo12568J = iSOChronology.f43970I.mo12568J(0, abstractC6095b.mo12568J(i12, j12));
            AbstractC6095b abstractC6095b2 = iSOChronology.f43970I;
            int i13 = c8150a.f44257f;
            long jM16166c = c8150a.m16166c(abstractC6095b2.mo12571a(i13, jMo12568J), iSOChronology);
            if (c8150a.f44255d == 0) {
                if (jM16166c >= j12) {
                    jM16166c = c8150a.m16166c(iSOChronology.f43987Z.mo12571a(-1, jM16166c), iSOChronology);
                }
                return iSOChronology.f43970I.mo12571a(i13, iSOChronology.f43970I.mo12568J(0, jM16166c)) - j11;
            }
            jM16166c = c8150a.m16167d(jM16166c, iSOChronology);
            if (jM16166c >= j12) {
                jM16166c = c8150a.m16167d(c8150a.m16166c(iSOChronology.f43986Y.mo12568J(i12, iSOChronology.f43987Z.mo12571a(-1, jM16166c)), iSOChronology), iSOChronology);
            }
            return iSOChronology.f43970I.mo12571a(i13, iSOChronology.f43970I.mo12568J(0, jM16166c)) - j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8151b)) {
                return false;
            }
            C8151b c8151b = (C8151b) obj;
            return this.f44260c == c8151b.f44260c && this.f44259b.equals(c8151b.f44259b) && this.f44258a.equals(c8151b.f44258a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f44260c), this.f44259b, this.f44258a});
        }

        public final String toString() {
            return this.f44258a + " named " + this.f44259b + " at " + this.f44260c;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static DateTimeZone m16161a(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            DateTimeZone dateTimeZoneM16163D = PrecalculatedZone.m16163D(dataInput, str);
            int i10 = CachedDateTimeZone.f44244f;
            return dateTimeZoneM16163D instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZoneM16163D : new CachedDateTimeZone(dateTimeZoneM16163D);
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return PrecalculatedZone.m16163D(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, (int) m16162b(dataInput), (int) m16162b(dataInput), dataInput.readUTF());
        Object obj = DateTimeZone.f43949a;
        if (fixedDateTimeZone.equals(obj)) {
            fixedDateTimeZone = obj;
        }
        return fixedDateTimeZone;
    }

    /* JADX INFO: renamed from: b */
    public static long m16162b(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j10;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i10 = unsignedByte2 >> 6;
        if (i10 == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j10 = 60000;
        } else if (i10 == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j10 = 1000;
        } else {
            if (i10 == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j10 = 1800000;
        }
        return unsignedByte * j10;
    }
}
