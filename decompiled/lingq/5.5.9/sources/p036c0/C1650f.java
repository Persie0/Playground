package p036c0;

import androidx.compose.material3.MenuKt;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.Iterator;
import kotlin.sequences.SequencesKt__SequencesKt;
import p249lo.InterfaceC7415h;
import p338qd.C8573r0;
import p470x1.C10018f;
import p470x1.C10021i;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import p521z1.InterfaceC10434h;
import sl.C9072e;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1650f implements InterfaceC10434h {

    /* JADX INFO: renamed from: a */
    public final long f9243a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10015c f9244b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2056p<C10021i, C10021i, C9072e> f9245c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C1650f() {
        throw null;
    }

    public C1650f(long j10, InterfaceC10015c interfaceC10015c, InterfaceC2056p interfaceC2056p) {
        this.f9243a = j10;
        this.f9244b = interfaceC10015c;
        this.f9245c = interfaceC2056p;
    }

    @Override // p521z1.InterfaceC10434h
    /* JADX INFO: renamed from: a */
    public final long mo5368a(C10021i c10021i, long j10, LayoutDirection layoutDirection, long j11) {
        InterfaceC7415h interfaceC7415hM14253N2;
        Object obj;
        Object next;
        int iIntValue;
        C5207g.m11111f(layoutDirection, "layoutDirection");
        float f3 = MenuKt.f2763a;
        InterfaceC10015c interfaceC10015c = this.f9244b;
        int iMo1464s0 = interfaceC10015c.mo1464s0(f3);
        long j12 = this.f9243a;
        int iMo1464s1 = interfaceC10015c.mo1464s0(C10018f.m18620a(j12));
        int iMo1464s2 = interfaceC10015c.mo1464s0(C10018f.m18621b(j12));
        int i10 = c10021i.f50976a;
        int i11 = i10 + iMo1464s1;
        int i12 = c10021i.f50978c;
        int i13 = (int) (j11 >> 32);
        int iIntValue2 = (i12 - iMo1464s1) - i13;
        int i14 = (int) (j10 >> 32);
        int i15 = i14 - i13;
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(i11);
            numArr[1] = Integer.valueOf(iIntValue2);
            if (i10 < 0) {
                i15 = 0;
            }
            numArr[2] = Integer.valueOf(i15);
            interfaceC7415hM14253N2 = SequencesKt__SequencesKt.m14253N2(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(iIntValue2);
            numArr2[1] = Integer.valueOf(i11);
            if (i12 <= i14) {
                i15 = 0;
            }
            numArr2[2] = Integer.valueOf(i15);
            interfaceC7415hM14253N2 = SequencesKt__SequencesKt.m14253N2(numArr2);
        }
        Iterator it = interfaceC7415hM14253N2.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            iIntValue = ((Number) next).intValue();
        } while (!(iIntValue >= 0 && iIntValue + i13 <= i14));
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        int iMax = Math.max(c10021i.f50979d + iMo1464s2, iMo1464s0);
        int i16 = c10021i.f50977b;
        int iM18628b = (i16 - iMo1464s2) - C10022j.m18628b(j11);
        for (Object obj2 : SequencesKt__SequencesKt.m14253N2(Integer.valueOf(iMax), Integer.valueOf(iM18628b), Integer.valueOf(i16 - (C10022j.m18628b(j11) / 2)), Integer.valueOf((C10022j.m18628b(j10) - C10022j.m18628b(j11)) - iMo1464s0))) {
            int iIntValue3 = ((Number) obj2).intValue();
            if (iIntValue3 >= iMo1464s0 && C10022j.m18628b(j11) + iIntValue3 <= C10022j.m18628b(j10) - iMo1464s0) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iM18628b = num2.intValue();
        }
        this.f9245c.mo1337m0(c10021i, new C10021i(iIntValue2, iM18628b, i13 + iIntValue2, C10022j.m18628b(j11) + iM18628b));
        return C8573r0.m16752r(iIntValue2, iM18628b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1650f)) {
            return false;
        }
        C1650f c1650f = (C1650f) obj;
        long j10 = c1650f.f9243a;
        int i10 = C10018f.f50968c;
        return ((this.f9243a > j10 ? 1 : (this.f9243a == j10 ? 0 : -1)) == 0) && C5207g.m11106a(this.f9244b, c1650f.f9244b) && C5207g.m11106a(this.f9245c, c1650f.f9245c);
    }

    public final int hashCode() {
        int i10 = C10018f.f50968c;
        return this.f9245c.hashCode() + ((this.f9244b.hashCode() + (Long.hashCode(this.f9243a) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C10018f.m18622c(this.f9243a)) + ", density=" + this.f9244b + ", onPositionCalculated=" + this.f9245c + ')';
    }
}
