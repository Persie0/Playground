package p466wn;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: wn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9981d {

    /* JADX INFO: renamed from: c */
    public static final a f50711c = new a();

    /* JADX INFO: renamed from: d */
    public static int f50712d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f50713e;

    /* JADX INFO: renamed from: f */
    public static final int f50714f;

    /* JADX INFO: renamed from: g */
    public static final int f50715g;

    /* JADX INFO: renamed from: h */
    public static final int f50716h;

    /* JADX INFO: renamed from: i */
    public static final int f50717i;

    /* JADX INFO: renamed from: j */
    public static final int f50718j;

    /* JADX INFO: renamed from: k */
    public static final int f50719k;

    /* JADX INFO: renamed from: l */
    public static final int f50720l;

    /* JADX INFO: renamed from: m */
    public static final C9981d f50721m;

    /* JADX INFO: renamed from: n */
    public static final C9981d f50722n;

    /* JADX INFO: renamed from: o */
    public static final C9981d f50723o;

    /* JADX INFO: renamed from: p */
    public static final C9981d f50724p;

    /* JADX INFO: renamed from: q */
    public static final C9981d f50725q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList f50726r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList f50727s;

    /* JADX INFO: renamed from: a */
    public final List<AbstractC9980c> f50728a;

    /* JADX INFO: renamed from: b */
    public final int f50729b;

    /* JADX INFO: renamed from: wn.d$a */
    public static final class a {

        /* JADX INFO: renamed from: wn.d$a$a, reason: collision with other inner class name */
        public static final class C10678a {

            /* JADX INFO: renamed from: a */
            public final int f50730a;

            /* JADX INFO: renamed from: b */
            public final String f50731b;

            public C10678a(String str, int i10) {
                this.f50730a = i10;
                this.f50731b = str;
            }
        }
    }

    static {
        a.C10678a c10678a;
        int i10 = f50712d;
        int i11 = i10 << 1;
        f50713e = i10;
        int i12 = i11 << 1;
        f50714f = i11;
        int i13 = i12 << 1;
        f50715g = i12;
        int i14 = i13 << 1;
        f50716h = i13;
        int i15 = i14 << 1;
        f50717i = i14;
        int i16 = i15 << 1;
        f50718j = i15;
        f50712d = i16 << 1;
        int i17 = i16 - 1;
        f50719k = i17;
        int i18 = i10 | i11 | i12;
        f50720l = i18;
        f50721m = new C9981d(i17);
        f50722n = new C9981d(i14 | i15);
        new C9981d(i10);
        new C9981d(i11);
        new C9981d(i12);
        f50723o = new C9981d(i18);
        new C9981d(i13);
        f50724p = new C9981d(i14);
        f50725q = new C9981d(i15);
        new C9981d(i11 | i14 | i15);
        Field[] fields = C9981d.class.getFields();
        C5207g.m11110e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C10678a c10678a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C9981d c9981d = obj instanceof C9981d ? (C9981d) obj : null;
            if (c9981d != null) {
                String name = field2.getName();
                C5207g.m11110e(name, "field.name");
                c10678a2 = new a.C10678a(name, c9981d.f50729b);
            }
            if (c10678a2 != null) {
                arrayList2.add(c10678a2);
            }
        }
        f50726r = arrayList2;
        Field[] fields2 = C9981d.class.getFields();
        C5207g.m11110e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        loop3: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop3;
                }
                Object next = it2.next();
                if (C5207g.m11106a(((Field) next).getType(), Integer.TYPE)) {
                    arrayList4.add(next);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (true) {
            while (true) {
                if (!it3.hasNext()) {
                    f50727s = arrayList5;
                    return;
                }
                Field field4 = (Field) it3.next();
                Object obj2 = field4.get(null);
                C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                if (iIntValue == ((-iIntValue) & iIntValue)) {
                    String name2 = field4.getName();
                    C5207g.m11110e(name2, "field.name");
                    c10678a = new a.C10678a(name2, iIntValue);
                } else {
                    c10678a = null;
                }
                if (c10678a != null) {
                    arrayList5.add(c10678a);
                }
            }
        }
    }

    public C9981d(int i10) {
        this(i10, EmptyList.f38032a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9981d(int i10, List<? extends AbstractC9980c> list) {
        C5207g.m11111f(list, "excludes");
        this.f50728a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC9980c) it.next()).mo18556a();
        }
        this.f50729b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18557a(int i10) {
        return (i10 & this.f50729b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C9981d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C9981d c9981d = (C9981d) obj;
        return C5207g.m11106a(this.f50728a, c9981d.f50728a) && this.f50729b == c9981d.f50729b;
    }

    public final int hashCode() {
        return (this.f50728a.hashCode() * 31) + this.f50729b;
    }

    public final String toString() {
        Object next;
        Iterator it = f50726r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((a.C10678a) next).f50730a == this.f50729b));
        a.C10678a c10678a = (a.C10678a) next;
        String strM13430X = c10678a != null ? c10678a.f50731b : null;
        if (strM13430X == null) {
            ArrayList arrayList = f50727s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            loop1: while (true) {
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    a.C10678a c10678a2 = (a.C10678a) it2.next();
                    String str = m18557a(c10678a2.f50730a) ? c10678a2.f50731b : null;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
            }
            strM13430X = C6752c.m13430X(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder sbM854m = C0204c.m854m("DescriptorKindFilter(", strM13430X, ", ");
        sbM854m.append(this.f50728a);
        sbM854m.append(')');
        return sbM854m.toString();
    }
}
