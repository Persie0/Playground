package p000;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class m86 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final String f50755a;

    /* JADX INFO: renamed from: b */
    public final String f50756b;

    public m86(String str) {
        List listM22615g1;
        str.getClass();
        List listM15429h = new Regex("/").m15429h(str);
        if (listM15429h.isEmpty()) {
            listM22615g1 = EmptyList.f47638a;
        } else {
            ListIterator listIterator = listM15429h.listIterator(listM15429h.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM22615g1 = u91.m22615g1(listM15429h, listIterator.nextIndex() + 1);
                }
            }
            listM22615g1 = EmptyList.f47638a;
        }
        this.f50755a = (String) listM22615g1.get(0);
        this.f50756b = (String) listM22615g1.get(1);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m86 m86Var) {
        m86Var.getClass();
        int i = fa4.m11650l(this.f50755a, m86Var.f50755a) ? 2 : 0;
        return fa4.m11650l(this.f50756b, m86Var.f50756b) ? i + 1 : i;
    }

    /* JADX INFO: renamed from: b */
    public final String m16679b() {
        return this.f50756b;
    }

    /* JADX INFO: renamed from: c */
    public final String m16680c() {
        return this.f50755a;
    }
}
