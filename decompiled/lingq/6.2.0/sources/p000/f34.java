package p000;

import java.time.DayOfWeek;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.Month;

/* JADX INFO: loaded from: classes3.dex */
public final class f34 implements iab, z02, nm1 {

    /* JADX INFO: renamed from: a */
    public final k34 f38337a;

    /* JADX INFO: renamed from: b */
    public Integer f38338b;

    /* JADX INFO: renamed from: c */
    public final Integer f38339c;

    /* JADX INFO: renamed from: d */
    public final Integer f38340d;

    public f34(k34 k34Var, Integer num, Integer num2, Integer num3) {
        this.f38337a = k34Var;
        this.f38338b = num;
        this.f38339c = num2;
        this.f38340d = num3;
    }

    /* JADX INFO: renamed from: a */
    public final LocalDate m11511a() throws Exception {
        LocalDate localDate;
        k34 k34Var = this.f38337a;
        Integer num = k34Var.f46617a;
        lab.m16050a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.f38340d;
        if (num2 == null) {
            Integer num3 = k34Var.f46618b;
            lab.m16050a(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.f38338b;
            lab.m16050a(num4, "day");
            localDate = new LocalDate(iIntValue, iIntValue2, num4.intValue());
        } else {
            LocalDate localDate2 = new LocalDate(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            r22.Companion.getClass();
            m22 m22Var = r22.f58514a;
            m22Var.getClass();
            LocalDate localDateM24517a = xh5.m24517a(localDate2, iIntValue3, m22Var);
            java.time.LocalDate localDate3 = localDateM24517a.f48188a;
            if (localDate3.getYear() != iIntValue) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
            }
            if (k34Var.f46618b != null) {
                Month monthM15602a = localDateM24517a.m15602a();
                monthM15602a.getClass();
                int iOrdinal = monthM15602a.ordinal() + 1;
                Integer num5 = k34Var.f46618b;
                if (num5 == null || iOrdinal != num5.intValue()) {
                    StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb.append(num2);
                    sb.append(", which is ");
                    sb.append(localDateM24517a.m15602a());
                    Integer num6 = k34Var.f46618b;
                    sb.append(", but ");
                    sb.append(num6);
                    sb.append(" was specified as the month number");
                    throw new DateTimeFormatException(sb.toString());
                }
            }
            if (this.f38338b != null) {
                int dayOfMonth = localDate3.getDayOfMonth();
                Integer num7 = this.f38338b;
                if (num7 == null || dayOfMonth != num7.intValue()) {
                    StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb2.append(num2);
                    sb2.append(", which is the day ");
                    sb2.append(localDate3.getDayOfMonth());
                    sb2.append(" of ");
                    sb2.append(localDateM24517a.m15602a());
                    Integer num8 = this.f38338b;
                    sb2.append(", but ");
                    sb2.append(num8);
                    sb2.append(" was specified as the day of month");
                    throw new DateTimeFormatException(sb2.toString());
                }
            }
            localDate = localDateM24517a;
        }
        java.time.LocalDate localDate4 = localDate.f48188a;
        Integer num9 = this.f38339c;
        if (num9 != null) {
            int iIntValue4 = num9.intValue();
            DayOfWeek dayOfWeek = localDate4.getDayOfWeek();
            dayOfWeek.getClass();
            kotlinx.datetime.DayOfWeek dayOfWeek2 = (kotlinx.datetime.DayOfWeek) kotlinx.datetime.DayOfWeek.getEntries().get(dayOfWeek.getValue() - 1);
            dayOfWeek2.getClass();
            if (iIntValue4 != dayOfWeek2.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    C3386nv.m17624j(ux5.m22988k(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((kotlinx.datetime.DayOfWeek) kotlinx.datetime.DayOfWeek.getEntries().get(iIntValue4 - 1));
                sb3.append(" but the date is ");
                sb3.append(localDate);
                sb3.append(", which is a ");
                DayOfWeek dayOfWeek3 = localDate4.getDayOfWeek();
                dayOfWeek3.getClass();
                sb3.append((kotlinx.datetime.DayOfWeek) kotlinx.datetime.DayOfWeek.getEntries().get(dayOfWeek3.getValue() - 1));
                throw new DateTimeFormatException(sb3.toString());
            }
        }
        return localDate;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: c */
    public final void mo11512c(Integer num) {
        this.f38337a.f46618b = num;
    }

    @Override // p000.nm1
    public final Object copy() {
        k34 k34Var = this.f38337a;
        return new f34(new k34(k34Var.f46617a, k34Var.f46618b), this.f38338b, this.f38339c, this.f38340d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f34)) {
            return false;
        }
        f34 f34Var = (f34) obj;
        return fa4.m11650l(this.f38337a, f34Var.f38337a) && fa4.m11650l(this.f38338b, f34Var.f38338b) && fa4.m11650l(this.f38339c, f34Var.f38339c) && fa4.m11650l(this.f38340d, f34Var.f38340d);
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: f */
    public final Integer mo11513f() {
        return this.f38337a.f46617a;
    }

    public final int hashCode() {
        int iHashCode = this.f38337a.hashCode() * 29791;
        Integer num = this.f38338b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.f38339c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.f38340d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // p000.z02
    /* JADX INFO: renamed from: i */
    public final Integer mo11514i() {
        return this.f38338b;
    }

    @Override // p000.z02
    /* JADX INFO: renamed from: j */
    public final void mo11515j(Integer num) {
        this.f38338b = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: k */
    public final void mo11516k(Integer num) {
        this.f38337a.f46617a = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: l */
    public final Integer mo11517l() {
        return this.f38337a.f46618b;
    }

    public final String toString() {
        Object obj = this.f38339c;
        k34 k34Var = this.f38337a;
        Integer num = this.f38340d;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(k34Var);
            sb.append('-');
            Object obj2 = this.f38338b;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb.append(obj2);
            sb.append(" (day of week is ");
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(')');
            return sb.toString();
        }
        if (this.f38338b == null && k34Var.f46618b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj3 = k34Var.f46617a;
            if (obj3 == null) {
                obj3 = "??";
            }
            sb2.append(obj3);
            sb2.append(")-");
            sb2.append(num);
            sb2.append(" (day of week is ");
            if (obj == null) {
                obj = "??";
            }
            sb2.append(obj);
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(k34Var);
        sb3.append('-');
        Object obj4 = this.f38338b;
        if (obj4 == null) {
            obj4 = "??";
        }
        sb3.append(obj4);
        sb3.append(" (day of week is ");
        if (obj == null) {
            obj = "??";
        }
        sb3.append(obj);
        sb3.append(", day of year is ");
        sb3.append(num);
        sb3.append(')');
        return sb3.toString();
    }

    public /* synthetic */ f34() {
        this(new k34(null, null), null, null, null);
    }
}
