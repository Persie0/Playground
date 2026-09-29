package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public final class zo6 implements s47 {

    /* JADX INFO: renamed from: a */
    public final List f71848a;

    /* JADX INFO: renamed from: b */
    public final int f71849b;

    /* JADX INFO: renamed from: c */
    public final boolean f71850c;

    public zo6(List list) {
        boolean z;
        list.getClass();
        this.f71848a = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((wo6) it.next()).f67123a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i2 += iIntValue;
        }
        this.f71849b = i2;
        List list2 = this.f71848a;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((wo6) it2.next()).f67123a == null) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        this.f71850c = z;
        List list3 = this.f71848a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer num2 = ((wo6) it3.next()).f67123a;
                if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) <= 0) {
                    C3386nv.m17626m("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.f71848a;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((wo6) it4.next()).f67123a == null && (i = i + 1) < 0) {
                    vz1.m23626d0();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.f71848a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((wo6) obj).f67123a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((wo6) it5.next()).f67124b);
        }
        v63.m23135m("At most one variable-length numeric field in a row is allowed, but got several: ", arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.");
        throw null;
    }

    @Override // p000.s47
    /* JADX INFO: renamed from: a */
    public final Object mo10912a(nm1 nm1Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        int i2 = this.f71849b;
        if (i + i2 > charSequence.length()) {
            return new m47(i, new hz4(this, 11));
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        while (ref$IntRef.f47716a + i < charSequence.length() && ead.m11005b(charSequence.charAt(ref$IntRef.f47716a + i))) {
            ref$IntRef.f47716a++;
        }
        if (ref$IntRef.f47716a < i2) {
            return new m47(i, new a45(10, ref$IntRef, this));
        }
        List list = this.f71848a;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            Integer num = ((wo6) list.get(i3)).f67123a;
            int iIntValue = (num != null ? num.intValue() : (ref$IntRef.f47716a - i2) + 1) + i;
            xo6 xo6VarMo4664a = ((wo6) list.get(i3)).mo4664a(nm1Var, charSequence, i, iIntValue);
            if (xo6VarMo4664a != null) {
                return new m47(i, new yo6(i3, 0, charSequence.subSequence(i, iIntValue).toString(), this, xo6VarMo4664a));
            }
            i3++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public final String m25725b() {
        List<wo6> list = this.f71848a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (wo6 wo6Var : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = wo6Var.f67123a;
            sb.append(num == null ? "at least one digit" : num + " digits");
            sb.append(" for ");
            sb.append(wo6Var.f67124b);
            arrayList.add(sb.toString());
        }
        boolean z = this.f71850c;
        int i = this.f71849b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return m25725b();
    }
}
