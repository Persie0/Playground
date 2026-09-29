package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: on */
/* JADX INFO: loaded from: classes.dex */
public final class C3419on implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final List f54603a;

    /* JADX INFO: renamed from: b */
    public final String f54604b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f54605c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f54606d;

    static {
        fs6 fs6Var = dm8.f35846a;
    }

    public C3419on(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f54603a = list;
        this.f54604b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C3378nn c3378nn = (C3378nn) list.get(i);
                Object obj = c3378nn.f52979a;
                if (obj instanceof he9) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c3378nn);
                } else if (obj instanceof j37) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c3378nn);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f54605c = arrayList;
        this.f54606d = arrayList2;
        List listM22614f1 = arrayList2 != null ? u91.m22614f1(arrayList2, new es6(1)) : null;
        List list2 = listM22614f1;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((C3378nn) u91.m22589G0(listM22614f1)).f52981c;
        s56 s56Var = b84.f8108a;
        s56 s56Var2 = new s56(1);
        s56Var2.m21101a(i2);
        int size2 = listM22614f1.size();
        for (int i3 = 1; i3 < size2; i3++) {
            C3378nn c3378nn2 = (C3378nn) listM22614f1.get(i3);
            while (s56Var2.f60382b != 0) {
                int iM21104d = s56Var2.m21104d();
                int i4 = c3378nn2.f52980b;
                int i5 = c3378nn2.f52981c;
                if (i4 < iM21104d) {
                    if (i5 > iM21104d) {
                        j54.m14288a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iM21104d);
                        break;
                    }
                    break;
                }
                s56Var2.m21105e(s56Var2.f60382b - 1);
            }
            s56Var2.m21101a(c3378nn2.f52981c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m18171a(int i) {
        List list = this.f54603a;
        if (list == null) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            C3378nn c3378nn = (C3378nn) obj;
            if ((c3378nn.f52979a instanceof fe5) && AbstractC3466pn.m19404b(0, i, c3378nn.f52980b, c3378nn.f52981c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m18172b(int i, String str, int i2) {
        List list = this.f54603a;
        if (list == null) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C3378nn c3378nn = (C3378nn) list.get(i3);
            Object obj = c3378nn.f52979a;
            int i4 = c3378nn.f52981c;
            int i5 = c3378nn.f52980b;
            String str2 = c3378nn.f52982d;
            if ((obj instanceof ok9) && str.equals(str2) && AbstractC3466pn.m19404b(i, i2, i5, i4)) {
                Object obj2 = c3378nn.f52979a;
                obj2.getClass();
                arrayList.add(new C3378nn(((ok9) obj2).f54498a, i5, i4, str2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final C3419on m18173c(vi3 vi3Var) {
        C3341mn c3341mn = new C3341mn(this);
        ArrayList arrayList = c3341mn.f51545c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3378nn c3378nn = (C3378nn) vi3Var.invoke(((C3304ln) arrayList.get(i)).m16392a(Integer.MIN_VALUE));
            arrayList.set(i, new C3304ln(c3378nn.f52979a, c3378nn.f52980b, c3378nn.f52981c, c3378nn.f52982d));
        }
        return c3341mn.m16933h();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f54604b.charAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C3419on subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            j54.m14288a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f54604b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        C3419on c3419on = AbstractC3466pn.f56487a;
        if (i > i2) {
            j54.m14288a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f54603a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C3378nn c3378nn = (C3378nn) list.get(i3);
                int i4 = c3378nn.f52980b;
                int i5 = c3378nn.f52981c;
                if (AbstractC3466pn.m19404b(i, i2, i4, i5)) {
                    arrayList.add(new C3378nn(c3378nn.f52979a, Math.max(i, c3378nn.f52980b) - i, Math.min(i2, i5) - i, c3378nn.f52982d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new C3419on(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3419on)) {
            return false;
        }
        C3419on c3419on = (C3419on) obj;
        return fa4.m11650l(this.f54604b, c3419on.f54604b) && fa4.m11650l(this.f54603a, c3419on.f54603a);
    }

    public final int hashCode() {
        int iHashCode = this.f54604b.hashCode() * 31;
        List list = this.f54603a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f54604b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f54604b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3419on(int i, String str, List list) {
        this(list.isEmpty() ? null : list, str);
        C3419on c3419on = AbstractC3466pn.f56487a;
    }

    public /* synthetic */ C3419on(String str) {
        this(str, EmptyList.f47638a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3419on(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
