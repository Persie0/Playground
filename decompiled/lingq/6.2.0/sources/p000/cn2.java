package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cn2 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final iy5 f10315b = new iy5(10);

    /* JADX INFO: renamed from: c */
    public static final long f10316c = AbstractC3352my.m17144w(4611686018427387903L);

    /* JADX INFO: renamed from: d */
    public static final long f10317d = AbstractC3352my.m17144w(-4611686018427387903L);

    /* JADX INFO: renamed from: e */
    public static final long f10318e = 9223372036854759646L;

    /* JADX INFO: renamed from: a */
    public final long f10319a;

    /* JADX INFO: renamed from: a */
    public static final long m4883a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM17120g = AbstractC3352my.m17120g(j, j3);
        if (-4611686018426L > jM17120g || jM17120g >= 4611686018427L) {
            return AbstractC3352my.m17144w(jM17120g);
        }
        long j4 = ((jM17120g * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = fn2.f39331a;
        return j4;
    }

    /* JADX INFO: renamed from: b */
    public static final void m4884b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM23396s0 = vk9.m23396s0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM23396s0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM23396s0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strM23396s0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM23396s0, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m4885c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return fa4.m11652n(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: d */
    public static final long m4886d(long j) {
        return ((((int) j) & 1) != 1 || m4888f(j)) ? m4890h(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: e */
    public static final int m4887e(long j) {
        if (m4888f(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4888f(long j) {
        return j == f10316c || j == f10317d;
    }

    /* JADX INFO: renamed from: g */
    public static final long m4889g(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m4883a(j >> 1, j2 >> 1) : m4883a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return AbstractC3352my.m17144w(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = fn2.f39331a;
            return j4;
        }
        long jM17120g = AbstractC3352my.m17120g(j >> 1, j2 >> 1);
        if (jM17120g == 9223372036854759646L) {
            C3386nv.m17626m("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM17120g == 4611686018427387903L || jM17120g == -4611686018427387903L) {
            return AbstractC3352my.m17144w(jM17120g);
        }
        if (-4611686018426L > jM17120g || jM17120g >= 4611686018427L) {
            return AbstractC3352my.m17144w(l70.m15947j(jM17120g, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jM17120g * 1000000) << 1;
        int i3 = fn2.f39331a;
        return j5;
    }

    /* JADX INFO: renamed from: h */
    public static final long m4890h(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == f10316c) {
            return Long.MAX_VALUE;
        }
        if (j == f10317d) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        DurationUnit durationUnit2 = (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
        durationUnit2.getClass();
        return durationUnit.getTimeUnit$kotlin_stdlib().convert(j2, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    /* JADX INFO: renamed from: i */
    public static String m4891i(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f10316c) {
            return "Infinity";
        }
        if (j == f10317d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = m4892j(j);
        }
        long jM4890h = m4890h(j, DurationUnit.DAYS);
        int iM4890h = m4888f(j) ? 0 : (int) (m4890h(j, DurationUnit.HOURS) % 24);
        int iM4890h2 = m4888f(j) ? 0 : (int) (m4890h(j, DurationUnit.MINUTES) % 60);
        int iM4890h3 = m4888f(j) ? 0 : (int) (m4890h(j, DurationUnit.SECONDS) % 60);
        int iM4887e = m4887e(j);
        boolean z2 = jM4890h != 0;
        boolean z3 = iM4890h != 0;
        boolean z4 = iM4890h2 != 0;
        boolean z5 = (iM4890h3 == 0 && iM4887e == 0) ? false : true;
        if (z2) {
            sb.append(jM4890h);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM4890h);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM4890h2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM4890h3 != 0 || z2 || z3 || z4) {
                m4884b(sb, iM4890h3, iM4887e, 9, "s", false);
            } else if (iM4887e >= 1000000) {
                m4884b(sb, iM4887e / 1000000, iM4887e % 1000000, 6, "ms", false);
            } else if (iM4887e >= 1000) {
                m4884b(sb, iM4887e / DescriptorProtos.Edition.EDITION_2023_VALUE, iM4887e % DescriptorProtos.Edition.EDITION_2023_VALUE, 3, "us", false);
            } else {
                sb.append(iM4887e);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static final long m4892j(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = fn2.f39331a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m4885c(this.f10319a, ((cn2) obj).f10319a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cn2) {
            return this.f10319a == ((cn2) obj).f10319a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10319a);
    }

    public final String toString() {
        return m4891i(this.f10319a);
    }
}
