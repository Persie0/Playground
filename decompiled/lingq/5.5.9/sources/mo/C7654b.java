package mo;

import ae.C0062b;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jm.C6526i;
import kotlin.Pair;
import kotlin.text.C7076b;
import p100em.InterfaceC5429a;
import p249lo.InterfaceC7415h;

/* JADX INFO: renamed from: mo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7654b implements InterfaceC7415h<C6526i> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f42120a;

    /* JADX INFO: renamed from: b */
    public final int f42121b;

    /* JADX INFO: renamed from: c */
    public final int f42122c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2056p<CharSequence, Integer, Pair<Integer, Integer>> f42123d;

    /* JADX INFO: renamed from: mo.b$a */
    public static final class a implements Iterator<C6526i>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public int f42124a = -1;

        /* JADX INFO: renamed from: b */
        public int f42125b;

        /* JADX INFO: renamed from: c */
        public int f42126c;

        /* JADX INFO: renamed from: d */
        public C6526i f42127d;

        /* JADX INFO: renamed from: e */
        public int f42128e;

        public a() {
            int iM361k0 = C0062b.m361k0(C7654b.this.f42121b, 0, C7654b.this.f42120a.length());
            this.f42125b = iM361k0;
            this.f42126c = iM361k0;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0042  */
        /* JADX WARN: Code duplicated, block: B:15:0x0056  */
        /* JADX WARN: Code duplicated, block: B:16:0x006d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0093  */
        /* JADX WARN: Code duplicated, block: B:9:0x0022  */
        /* JADX INFO: renamed from: a */
        public final void m15244a() {
            Pair<Integer, Integer> pairMo1337m0;
            int i10 = this.f42126c;
            if (i10 < 0) {
                this.f42124a = 0;
                this.f42127d = null;
                return;
            }
            C7654b c7654b = C7654b.this;
            int i11 = c7654b.f42122c;
            if (i11 > 0) {
                int i12 = this.f42128e + 1;
                this.f42128e = i12;
                if (i12 >= i11) {
                    this.f42127d = new C6526i(this.f42125b, C7076b.m14281a3(c7654b.f42120a));
                    this.f42126c = -1;
                } else if (i10 > c7654b.f42120a.length()) {
                    this.f42127d = new C6526i(this.f42125b, C7076b.m14281a3(c7654b.f42120a));
                    this.f42126c = -1;
                } else {
                    pairMo1337m0 = c7654b.f42123d.mo1337m0(c7654b.f42120a, Integer.valueOf(this.f42126c));
                    if (pairMo1337m0 == null) {
                        this.f42127d = new C6526i(this.f42125b, C7076b.m14281a3(c7654b.f42120a));
                        this.f42126c = -1;
                    } else {
                        int iIntValue = pairMo1337m0.f38012a.intValue();
                        int iIntValue2 = pairMo1337m0.f38013b.intValue();
                        this.f42127d = C0062b.m411w2(this.f42125b, iIntValue);
                        int i13 = iIntValue + iIntValue2;
                        this.f42125b = i13;
                        this.f42126c = i13 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            } else if (i10 > c7654b.f42120a.length()) {
                this.f42127d = new C6526i(this.f42125b, C7076b.m14281a3(c7654b.f42120a));
                this.f42126c = -1;
            } else {
                pairMo1337m0 = c7654b.f42123d.mo1337m0(c7654b.f42120a, Integer.valueOf(this.f42126c));
                if (pairMo1337m0 == null) {
                    this.f42127d = new C6526i(this.f42125b, C7076b.m14281a3(c7654b.f42120a));
                    this.f42126c = -1;
                } else {
                    int iIntValue3 = pairMo1337m0.f38012a.intValue();
                    int iIntValue4 = pairMo1337m0.f38013b.intValue();
                    this.f42127d = C0062b.m411w2(this.f42125b, iIntValue3);
                    int i14 = iIntValue3 + iIntValue4;
                    this.f42125b = i14;
                    this.f42126c = i14 + (iIntValue4 == 0 ? 1 : 0);
                }
            }
            this.f42124a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f42124a == -1) {
                m15244a();
            }
            return this.f42124a == 1;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final C6526i next() {
            if (this.f42124a == -1) {
                m15244a();
            }
            if (this.f42124a == 0) {
                throw new NoSuchElementException();
            }
            C6526i c6526i = this.f42127d;
            C5207g.m11109d(c6526i, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f42127d = null;
            this.f42124a = -1;
            return c6526i;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7654b(CharSequence charSequence, int i10, int i11, InterfaceC2056p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> interfaceC2056p) {
        C5207g.m11111f(charSequence, "input");
        this.f42120a = charSequence;
        this.f42121b = i10;
        this.f42122c = i11;
        this.f42123d = interfaceC2056p;
    }

    @Override // p249lo.InterfaceC7415h
    public final Iterator<C6526i> iterator() {
        return new a();
    }
}
