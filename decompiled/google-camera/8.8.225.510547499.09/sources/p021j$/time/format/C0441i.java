package p021j$.time.format;

import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.time.C0461i;
import p021j$.time.C0468p;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.format.i */
/* JADX INFO: loaded from: classes3.dex */
final class C0441i implements InterfaceC0439g {
    C0441i() {
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        Long lM12313e = c0455w.m12313e(EnumC0472a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorM12312d = c0455w.m12312d();
        EnumC0472a enumC0472a = EnumC0472a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorM12312d.mo12248h(enumC0472a) ? Long.valueOf(c0455w.m12312d().mo12251k(enumC0472a)) : null;
        int i = 0;
        if (lM12313e == null) {
            return false;
        }
        long jLongValue = lM12313e.longValue();
        int iM12428k = enumC0472a.m12428k(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = (jLongValue - 315569520000L) + 62167219200L;
            long jM12154c = AbstractC0359Y.m12154c(j, 315569520000L) + 1;
            C0461i c0461iM12348G = C0461i.m12348G(AbstractC0359Y.m12155d(j, 315569520000L) - 62167219200L, 0, C0468p.f33024f);
            if (jM12154c > 0) {
                sb.append('+');
                sb.append(jM12154c);
            }
            sb.append(c0461iM12348G);
            if (c0461iM12348G.m12352A() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            C0461i c0461iM12348G2 = C0461i.m12348G(j4 - 62167219200L, 0, C0468p.f33024f);
            int length = sb.length();
            sb.append(c0461iM12348G2);
            if (c0461iM12348G2.m12352A() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (c0461iM12348G2.m12353B() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iM12428k > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iM12428k <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iM12428k / i2;
                sb.append((char) (i3 + 48));
                iM12428k -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
