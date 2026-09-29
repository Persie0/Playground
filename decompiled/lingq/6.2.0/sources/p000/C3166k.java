package p000;

import androidx.media3.common.C0713b;
import com.google.common.collect.AbstractC1104t;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3166k implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46447a;

    public /* synthetic */ C3166k(int i) {
        this.f46447a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f46447a) {
            case 0:
                r74 r74Var = (r74) obj;
                r74 r74Var2 = (r74) obj2;
                if (lp1.f49971a.contains(AbstractC3317m.class)) {
                    return 0;
                }
                try {
                    r74Var2.getClass();
                    return r74Var.m20431b(r74Var2);
                } catch (Throwable th) {
                    lp1.m16420a(AbstractC3317m.class, th);
                    return 0;
                }
            case 1:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 2:
                return ((C0713b) obj2).f6401j - ((C0713b) obj).f6401j;
            case 3:
                return Integer.compare(((qo0) obj2).f58011b, ((qo0) obj).f58011b);
            case 4:
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 5:
                return Integer.compare(((a92) ((List) obj).get(0)).f377f, ((a92) ((List) obj2).get(0)).f377f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i = 9;
                int i2 = 10;
                return rb1.m20563f(h92.m13146c((h92) Collections.max(list, new C3166k(i)), (h92) Collections.max(list2, new C3166k(i)))).mo20564a(list.size(), list2.size()).mo20565b((h92) Collections.max(list, new C3166k(i2)), (h92) Collections.max(list2, new C3166k(i2)), new C3166k(i2)).mo20568e();
            case 7:
                return ((z82) Collections.max((List) obj)).compareTo((z82) Collections.max((List) obj2));
            case 8:
                return ((e92) ((List) obj).get(0)).compareTo((e92) ((List) obj2).get(0));
            case 9:
                return h92.m13146c((h92) obj, (h92) obj2);
            case 10:
                h92 h92Var = (h92) obj;
                h92 h92Var2 = (h92) obj2;
                boolean z = h92Var.f42026e;
                int i3 = h92Var.f42031j;
                AbstractC1104t abstractC1104tMo6319e = (z && h92Var.f42029h) ? i92.f43726k : i92.f43726k.mo6319e();
                h92Var.f42027f.getClass();
                return tb1.f62090a.mo20565b(Integer.valueOf(h92Var.f42032k), Integer.valueOf(h92Var2.f42032k), abstractC1104tMo6319e).mo20565b(Integer.valueOf(i3), Integer.valueOf(h92Var2.f42031j), abstractC1104tMo6319e).mo20568e();
            case 11:
                it2 it2Var = (it2) obj;
                it2 it2Var2 = (it2) obj2;
                it2Var2.getClass();
                it2Var.getClass();
                Long l = it2Var.f44528c;
                if (l == null) {
                    return -1;
                }
                long jLongValue = l.longValue();
                Long l2 = it2Var2.f44528c;
                if (l2 != null) {
                    return fa4.m11652n(l2.longValue(), jLongValue);
                }
                return 1;
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 13:
                me9 me9Var = (me9) obj;
                me9 me9Var2 = (me9) obj2;
                int iCompare = Integer.compare(me9Var2.f51219b, me9Var.f51219b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = me9Var.f51220c.compareTo(me9Var2.f51220c);
                return iCompareTo != 0 ? iCompareTo : me9Var.f51221d.compareTo(me9Var2.f51221d);
            case 14:
                me9 me9Var3 = (me9) obj;
                me9 me9Var4 = (me9) obj2;
                int iCompare2 = Integer.compare(me9Var4.f51218a, me9Var3.f51218a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = me9Var4.f51220c.compareTo(me9Var3.f51220c);
                return iCompareTo2 != 0 ? iCompareTo2 : me9Var4.f51221d.compareTo(me9Var3.f51221d);
            case 15:
                return Integer.compare(((v3b) obj).f64803a.f66342b, ((v3b) obj2).f64803a.f66342b);
            default:
                return Long.compare(((u3b) obj).f63365b, ((u3b) obj2).f63365b);
        }
    }
}
