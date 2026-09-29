package p000;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.AmPmMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class h34 implements n0a, nm1 {

    /* JADX INFO: renamed from: a */
    public Integer f41749a;

    /* JADX INFO: renamed from: b */
    public final Integer f41750b;

    /* JADX INFO: renamed from: c */
    public final AmPmMarker f41751c;

    /* JADX INFO: renamed from: d */
    public Integer f41752d;

    /* JADX INFO: renamed from: e */
    public Integer f41753e;

    /* JADX INFO: renamed from: f */
    public Integer f41754f;

    public h34(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5) {
        this.f41749a = num;
        this.f41750b = num2;
        this.f41751c = amPmMarker;
        this.f41752d = num3;
        this.f41753e = num4;
        this.f41754f = num5;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: b */
    public final void mo12313b(Integer num) {
        this.f41754f = num;
    }

    /* JADX INFO: renamed from: c */
    public final LocalTime m13022c() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f41749a;
        AmPmMarker amPmMarker = this.f41751c;
        Integer numValueOf = null;
        Integer num2 = this.f41750b;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                C3386nv.m17624j(wq1.m24115k("Inconsistent hour and hour-of-am-pm: hour is ", iIntValue, iIntValue2, ", but hour-of-am-pm is "));
                return null;
            }
            if (amPmMarker != null) {
                if ((amPmMarker == AmPmMarker.PM) != (iIntValue >= 12)) {
                    v63.m23129g(iIntValue, ", but the AM/PM marker is ", amPmMarker, "Inconsistent hour and the AM/PM marker: hour is ");
                    return null;
                }
            }
        } else {
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                if (amPmMarker != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (amPmMarker != AmPmMarker.PM ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.f41752d;
        lab.m16050a(num3, "minute");
        int iIntValue4 = num3.intValue();
        Integer num4 = this.f41753e;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f41754f;
        return new LocalTime(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0);
    }

    @Override // p000.nm1
    public final Object copy() {
        return new h34(this.f41749a, this.f41750b, this.f41751c, this.f41752d, this.f41753e, this.f41754f);
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: d */
    public final Integer mo12314d() {
        return this.f41752d;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: e */
    public final void mo12315e(Integer num) {
        this.f41752d = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h34)) {
            return false;
        }
        h34 h34Var = (h34) obj;
        return fa4.m11650l(this.f41749a, h34Var.f41749a) && fa4.m11650l(this.f41750b, h34Var.f41750b) && this.f41751c == h34Var.f41751c && fa4.m11650l(this.f41752d, h34Var.f41752d) && fa4.m11650l(this.f41753e, h34Var.f41753e) && fa4.m11650l(this.f41754f, h34Var.f41754f);
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: h */
    public final Integer mo12317h() {
        return this.f41754f;
    }

    public final int hashCode() {
        Integer num = this.f41749a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f41750b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        AmPmMarker amPmMarker = this.f41751c;
        int iHashCode = ((amPmMarker != null ? amPmMarker.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f41752d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f41753e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f41754f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: m */
    public final void mo12318m(Integer num) {
        this.f41749a = num;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: n */
    public final Integer mo12319n() {
        return this.f41749a;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: o */
    public final Integer mo12320o() {
        return this.f41753e;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: p */
    public final void mo12321p(Integer num) {
        this.f41753e = num;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strM23396s0;
        StringBuilder sb = new StringBuilder();
        Object obj = this.f41749a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.f41752d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.f41753e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.f41754f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strM23396s0 = vk9.m23396s0(9 - strValueOf.length(), strValueOf);
            if (strM23396s0 == null) {
                strM23396s0 = "???";
            }
        } else {
            strM23396s0 = "???";
        }
        sb.append(strM23396s0);
        return sb.toString();
    }

    public /* synthetic */ h34() {
        this(null, null, null, null, null, null);
    }
}
