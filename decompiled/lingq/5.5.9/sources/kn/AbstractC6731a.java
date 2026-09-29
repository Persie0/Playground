package kn;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import tl.C9321i;

/* JADX INFO: renamed from: kn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6731a {

    /* JADX INFO: renamed from: a */
    public final int[] f37945a;

    /* JADX INFO: renamed from: b */
    public final int f37946b;

    /* JADX INFO: renamed from: c */
    public final int f37947c;

    /* JADX INFO: renamed from: d */
    public final int f37948d;

    /* JADX INFO: renamed from: e */
    public final List<Integer> f37949e;

    public AbstractC6731a(int... iArr) {
        List<Integer> listM13453u0;
        C5207g.m11111f(iArr, "numbers");
        this.f37945a = iArr;
        Integer numM13382n0 = C6744b.m13382n0(iArr, 0);
        int i10 = -1;
        this.f37946b = numM13382n0 != null ? numM13382n0.intValue() : -1;
        Integer numM13382n1 = C6744b.m13382n0(iArr, 1);
        this.f37947c = numM13382n1 != null ? numM13382n1.intValue() : -1;
        Integer numM13382n2 = C6744b.m13382n0(iArr, 2);
        this.f37948d = numM13382n2 != null ? numM13382n2.intValue() : i10;
        if (iArr.length <= 3) {
            listM13453u0 = EmptyList.f38032a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(C0204c.m853l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listM13453u0 = C6752c.m13453u0(new C9321i(iArr).subList(3, iArr.length));
        }
        this.f37949e = listM13453u0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13343a(int i10, int i11, int i12) {
        int i13 = this.f37946b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f37947c;
        if (i14 > i11) {
            return true;
        }
        if (i14 >= i11 && this.f37948d >= i12) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13344b(AbstractC6731a abstractC6731a) {
        C5207g.m11111f(abstractC6731a, "ourVersion");
        int i10 = this.f37947c;
        int i11 = abstractC6731a.f37947c;
        int i12 = abstractC6731a.f37946b;
        int i13 = this.f37946b;
        if (i13 == 0) {
            if (i12 == 0 && i10 == i11) {
                return true;
            }
        } else if (i13 == i12 && i10 <= i11) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C5207g.m11106a(getClass(), obj.getClass())) {
            AbstractC6731a abstractC6731a = (AbstractC6731a) obj;
            if (this.f37946b == abstractC6731a.f37946b && this.f37947c == abstractC6731a.f37947c && this.f37948d == abstractC6731a.f37948d && C5207g.m11106a(this.f37949e, abstractC6731a.f37949e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f37946b;
        int i11 = (i10 * 31) + this.f37947c + i10;
        int i12 = (i11 * 31) + this.f37948d + i11;
        return this.f37949e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.f37945a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (!(i11 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? "unknown" : C6752c.m13430X(arrayList, ".", null, null, null, 62);
    }
}
