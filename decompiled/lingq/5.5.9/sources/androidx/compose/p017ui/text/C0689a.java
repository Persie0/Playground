package androidx.compose.p017ui.text;

import ae.C0062b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import p003a2.C0009a;
import p231l1.C7211e;
import p231l1.C7214h;
import p260m8.C7499b;

/* JADX INFO: renamed from: androidx.compose.ui.text.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0689a implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final String f4523a;

    /* JADX INFO: renamed from: b */
    public final List<b<C7214h>> f4524b;

    /* JADX INFO: renamed from: c */
    public final List<b<C7211e>> f4525c;

    /* JADX INFO: renamed from: d */
    public final List<b<? extends Object>> f4526d;

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$a */
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: a */
        public final StringBuilder f4527a = new StringBuilder(16);

        /* JADX INFO: renamed from: b */
        public final ArrayList f4528b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final ArrayList f4529c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final ArrayList f4530d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final ArrayList f4531e = new ArrayList();

        /* JADX INFO: renamed from: androidx.compose.ui.text.a$a$a, reason: collision with other inner class name */
        public static final class C10590a<T> {

            /* JADX INFO: renamed from: a */
            public final T f4532a;

            /* JADX INFO: renamed from: b */
            public final int f4533b;

            /* JADX INFO: renamed from: c */
            public int f4534c;

            /* JADX INFO: renamed from: d */
            public final String f4535d;

            /* JADX WARN: Multi-variable type inference failed */
            public C10590a(int i10, int i11, Object obj, String str) {
                C5207g.m11111f(str, "tag");
                this.f4532a = obj;
                this.f4533b = i10;
                this.f4534c = i11;
                this.f4535d = str;
            }

            public /* synthetic */ C10590a(Object obj, int i10, int i11, int i12) {
                this(i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, obj, (i12 & 8) != 0 ? "" : null);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: a */
            public final b<T> m2572a(int i10) {
                int i11 = this.f4534c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new b<>(this.f4533b, i10, this.f4532a, this.f4535d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10590a)) {
                    return false;
                }
                C10590a c10590a = (C10590a) obj;
                return C5207g.m11106a(this.f4532a, c10590a.f4532a) && this.f4533b == c10590a.f4533b && this.f4534c == c10590a.f4534c && C5207g.m11106a(this.f4535d, c10590a.f4535d);
            }

            public final int hashCode() {
                T t10 = this.f4532a;
                return this.f4535d.hashCode() + C0009a.m16d(this.f4534c, C0009a.m16d(this.f4533b, (t10 == null ? 0 : t10.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f4532a);
                sb2.append(", start=");
                sb2.append(this.f4533b);
                sb2.append(", end=");
                sb2.append(this.f4534c);
                sb2.append(", tag=");
                return C0009a.m22j(sb2, this.f4535d, ')');
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m2567a(C7214h c7214h, int i10, int i11) {
            C5207g.m11111f(c7214h, "style");
            this.f4528b.add(new C10590a(c7214h, i10, i11, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) {
            this.f4527a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            boolean z10 = charSequence instanceof C0689a;
            StringBuilder sb2 = this.f4527a;
            if (z10) {
                C0689a c0689a = (C0689a) charSequence;
                C5207g.m11111f(c0689a, "text");
                int length = sb2.length();
                sb2.append(c0689a.f4523a);
                List<b<C7214h>> list = c0689a.f4524b;
                if (list != null) {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        b<C7214h> bVar = list.get(i10);
                        m2567a(bVar.f4536a, bVar.f4537b + length, bVar.f4538c + length);
                    }
                }
                List<b<C7211e>> list2 = c0689a.f4525c;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        b<C7211e> bVar2 = list2.get(i11);
                        C7211e c7211e = bVar2.f4536a;
                        int i12 = bVar2.f4537b + length;
                        int i13 = bVar2.f4538c + length;
                        C5207g.m11111f(c7211e, "style");
                        this.f4529c.add(new C10590a(c7211e, i12, i13, 8));
                    }
                }
                List<b<? extends Object>> list3 = c0689a.f4526d;
                if (list3 != null) {
                    int size3 = list3.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        b<? extends Object> bVar3 = list3.get(i14);
                        this.f4530d.add(new C10590a(bVar3.f4537b + length, bVar3.f4538c + length, bVar3.f4536a, bVar3.f4539d));
                    }
                }
            } else {
                sb2.append(charSequence);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.util.List<androidx.compose.ui.text.a$b<? extends java.lang.Object>>] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List, java.util.List<androidx.compose.ui.text.a$b<l1.e>>] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            ?? arrayList;
            ?? r10;
            ?? arrayList2;
            boolean z10 = charSequence instanceof C0689a;
            StringBuilder sb2 = this.f4527a;
            if (z10) {
                C0689a c0689a = (C0689a) charSequence;
                C5207g.m11111f(c0689a, "text");
                int length = sb2.length();
                String str = c0689a.f4523a;
                sb2.append((CharSequence) str, i10, i11);
                List<b<C7214h>> listM2582b = C0691b.m2582b(c0689a, i10, i11);
                if (listM2582b != null) {
                    int size = listM2582b.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        b<C7214h> bVar = listM2582b.get(i12);
                        m2567a(bVar.f4536a, bVar.f4537b + length, bVar.f4538c + length);
                    }
                }
                if (i10 == i11 || (arrayList = c0689a.f4525c) == 0) {
                    arrayList = 0;
                } else if (i10 != 0 || i11 < str.length()) {
                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                    int size2 = arrayList.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        Object obj = arrayList.get(i13);
                        b bVar2 = (b) obj;
                        if (C0691b.m2583c(i10, i11, bVar2.f4537b, bVar2.f4538c)) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList = new ArrayList(arrayList3.size());
                    int size3 = arrayList3.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        b bVar3 = (b) arrayList3.get(i14);
                        arrayList.add(new b(C0062b.m361k0(bVar3.f4537b, i10, i11) - i10, C0062b.m361k0(bVar3.f4538c, i10, i11) - i10, bVar3.f4536a));
                    }
                }
                if (arrayList != 0) {
                    int size4 = arrayList.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        b bVar4 = (b) arrayList.get(i15);
                        C7211e c7211e = (C7211e) bVar4.f4536a;
                        int i16 = bVar4.f4537b + length;
                        int i17 = bVar4.f4538c + length;
                        C5207g.m11111f(c7211e, "style");
                        this.f4529c.add(new C10590a(c7211e, i16, i17, 8));
                    }
                }
                if (i10 == i11 || (arrayList2 = c0689a.f4526d) == 0) {
                    r10 = 0;
                } else {
                    if (i10 != 0 || i11 < str.length()) {
                        ArrayList arrayList4 = new ArrayList(arrayList2.size());
                        int size5 = arrayList2.size();
                        for (int i18 = 0; i18 < size5; i18++) {
                            Object obj2 = arrayList2.get(i18);
                            b bVar5 = (b) obj2;
                            if (C0691b.m2583c(i10, i11, bVar5.f4537b, bVar5.f4538c)) {
                                arrayList4.add(obj2);
                            }
                        }
                        arrayList2 = new ArrayList(arrayList4.size());
                        int size6 = arrayList4.size();
                        for (int i19 = 0; i19 < size6; i19++) {
                            b bVar6 = (b) arrayList4.get(i19);
                            arrayList2.add(new b(C0062b.m361k0(bVar6.f4537b, i10, i11) - i10, C0062b.m361k0(bVar6.f4538c, i10, i11) - i10, bVar6.f4536a, bVar6.f4539d));
                        }
                    }
                    r10 = arrayList2;
                }
                if (r10 != 0) {
                    int size7 = r10.size();
                    for (int i20 = 0; i20 < size7; i20++) {
                        b bVar7 = (b) r10.get(i20);
                        this.f4530d.add(new C10590a(bVar7.f4537b + length, bVar7.f4538c + length, bVar7.f4536a, bVar7.f4539d));
                    }
                }
            } else {
                sb2.append(charSequence, i10, i11);
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m2568b(String str) {
            C5207g.m11111f(str, "text");
            this.f4527a.append(str);
        }

        /* JADX INFO: renamed from: c */
        public final void m2569c(int i10) {
            ArrayList arrayList = this.f4531e;
            if (i10 < arrayList.size()) {
                while (arrayList.size() - 1 >= i10) {
                    if (!(!arrayList.isEmpty())) {
                        throw new IllegalStateException("Nothing to pop.".toString());
                    }
                    ((C10590a) arrayList.remove(arrayList.size() - 1)).f4534c = this.f4527a.length();
                }
                return;
            }
            throw new IllegalStateException((i10 + " should be less than " + arrayList.size()).toString());
        }

        /* JADX INFO: renamed from: d */
        public final int m2570d(C7214h c7214h) {
            C10590a c10590a = new C10590a(c7214h, this.f4527a.length(), 0, 12);
            ArrayList arrayList = this.f4531e;
            arrayList.add(c10590a);
            this.f4528b.add(c10590a);
            return arrayList.size() - 1;
        }

        /* JADX INFO: renamed from: e */
        public final C0689a m2571e() {
            StringBuilder sb2 = this.f4527a;
            String string = sb2.toString();
            C5207g.m11110e(string, "text.toString()");
            ArrayList arrayList = this.f4528b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(((C10590a) arrayList.get(i10)).m2572a(sb2.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList3 = this.f4529c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList4.add(((C10590a) arrayList3.get(i11)).m2572a(sb2.length()));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            ArrayList arrayList5 = this.f4530d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList6.add(((C10590a) arrayList5.get(i12)).m2572a(sb2.length()));
            }
            return new C0689a(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$b */
    public static final class b<T> {

        /* JADX INFO: renamed from: a */
        public final T f4536a;

        /* JADX INFO: renamed from: b */
        public final int f4537b;

        /* JADX INFO: renamed from: c */
        public final int f4538c;

        /* JADX INFO: renamed from: d */
        public final String f4539d;

        public b(int i10, int i11, Object obj) {
            this(i10, i11, obj, "");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, int i11, Object obj, String str) {
            C5207g.m11111f(str, "tag");
            this.f4536a = obj;
            this.f4537b = i10;
            this.f4538c = i11;
            this.f4539d = str;
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C5207g.m11106a(this.f4536a, bVar.f4536a) && this.f4537b == bVar.f4537b && this.f4538c == bVar.f4538c && C5207g.m11106a(this.f4539d, bVar.f4539d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            T t10 = this.f4536a;
            return this.f4539d.hashCode() + C0009a.m16d(this.f4538c, C0009a.m16d(this.f4537b, (t10 == null ? 0 : t10.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f4536a);
            sb2.append(", start=");
            sb2.append(this.f4537b);
            sb2.append(", end=");
            sb2.append(this.f4538c);
            sb2.append(", tag=");
            return C0009a.m22j(sb2, this.f4539d, ')');
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.a$c */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(Integer.valueOf(((b) t10).f4537b), Integer.valueOf(((b) t11).f4537b));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0689a() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0689a(String str) {
        this(str, null, null, null);
        EmptyList emptyList = EmptyList.f38032a;
        C5207g.m11111f(str, "text");
        C5207g.m11111f(emptyList, "spanStyles");
        C5207g.m11111f(emptyList, "paragraphStyles");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C0689a(String str, List<b<C7214h>> list, List<b<C7211e>> list2, List<? extends b<? extends Object>> list3) {
        List listM13447o0;
        C5207g.m11111f(str, "text");
        this.f4523a = str;
        this.f4524b = list;
        this.f4525c = list2;
        this.f4526d = list3;
        if (list2 == null || (listM13447o0 = C6752c.m13447o0(list2, new c())) == null) {
            return;
        }
        int size = listM13447o0.size();
        int i10 = -1;
        int i11 = 0;
        while (i11 < size) {
            b bVar = (b) listM13447o0.get(i11);
            boolean z10 = true;
            if (!(bVar.f4537b >= i10)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            int length = this.f4523a.length();
            int i12 = bVar.f4538c;
            if (i12 > length) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f4537b + ", " + i12 + ") is out of boundary").toString());
            }
            i11++;
            i10 = i12;
        }
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0689a subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        }
        String str = this.f4523a;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0689a(strSubstring, C0691b.m2581a(i10, i11, this.f4524b), C0691b.m2581a(i10, i11, this.f4525c), C0691b.m2581a(i10, i11, this.f4526d));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f4523a.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0689a)) {
            return false;
        }
        C0689a c0689a = (C0689a) obj;
        if (C5207g.m11106a(this.f4523a, c0689a.f4523a) && C5207g.m11106a(this.f4524b, c0689a.f4524b) && C5207g.m11106a(this.f4525c, c0689a.f4525c) && C5207g.m11106a(this.f4526d, c0689a.f4526d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4523a.hashCode() * 31;
        List<b<C7214h>> list = this.f4524b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<b<C7211e>> list2 = this.f4525c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<b<? extends Object>> list3 = this.f4526d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4523a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4523a;
    }
}
