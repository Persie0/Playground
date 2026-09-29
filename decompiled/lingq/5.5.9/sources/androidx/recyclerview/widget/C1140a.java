package androidx.recyclerview.widget;

import java.util.ArrayList;
import p081e0.C5339u;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1140a implements C1172w.a {

    /* JADX INFO: renamed from: d */
    public final a f7210d;

    /* JADX INFO: renamed from: a */
    public final C5339u f7207a = new C5339u(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f7208b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f7209c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public int f7212f = 0;

    /* JADX INFO: renamed from: e */
    public final C1172w f7211e = new C1172w(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f7213a;

        /* JADX INFO: renamed from: b */
        public int f7214b;

        /* JADX INFO: renamed from: c */
        public Object f7215c;

        /* JADX INFO: renamed from: d */
        public int f7216d;

        public b(Object obj, int i10, int i11, int i12) {
            this.f7213a = i10;
            this.f7214b = i11;
            this.f7216d = i12;
            this.f7215c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f7213a;
            if (i10 != bVar.f7213a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f7216d - this.f7214b) == 1 && this.f7216d == bVar.f7214b && this.f7214b == bVar.f7216d) {
                return true;
            }
            if (this.f7216d == bVar.f7216d && this.f7214b == bVar.f7214b) {
                Object obj2 = this.f7215c;
                if (obj2 != null) {
                    if (!obj2.equals(bVar.f7215c)) {
                        return false;
                    }
                } else if (bVar.f7215c != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f7213a * 31) + this.f7214b) * 31) + this.f7216d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f7213a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 != 4) {
                str = i10 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f7214b);
            sb2.append("c:");
            sb2.append(this.f7216d);
            sb2.append(",p:");
            sb2.append(this.f7215c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public C1140a(C1147d0 c1147d0) {
        this.f7210d = c1147d0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4411a(int i10) {
        ArrayList<b> arrayList = this.f7209c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f7213a;
            if (i12 == 8) {
                if (m4416f(bVar.f7216d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f7214b;
                int i14 = bVar.f7216d + i13;
                while (i13 < i14) {
                    if (m4416f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4412b() {
        ArrayList<b> arrayList = this.f7209c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1147d0) this.f7210d).m4444a(arrayList.get(i10));
        }
        m4422l(arrayList);
        this.f7212f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m4413c() {
        m4412b();
        ArrayList<b> arrayList = this.f7208b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f7213a;
            a aVar = this.f7210d;
            if (i11 == 1) {
                C1147d0 c1147d0 = (C1147d0) aVar;
                c1147d0.m4444a(bVar);
                c1147d0.m4447d(bVar.f7214b, bVar.f7216d);
            } else if (i11 == 2) {
                C1147d0 c1147d1 = (C1147d0) aVar;
                c1147d1.m4444a(bVar);
                int i12 = bVar.f7214b;
                int i13 = bVar.f7216d;
                RecyclerView recyclerView = c1147d1.f7244a;
                recyclerView.m4183Q(i12, i13, true);
                recyclerView.f6970G0 = true;
                recyclerView.f6967D0.f7142c += i13;
            } else if (i11 == 4) {
                C1147d0 c1147d2 = (C1147d0) aVar;
                c1147d2.m4444a(bVar);
                c1147d2.m4446c(bVar.f7214b, bVar.f7216d, bVar.f7215c);
            } else if (i11 == 8) {
                C1147d0 c1147d3 = (C1147d0) aVar;
                c1147d3.m4444a(bVar);
                c1147d3.m4448e(bVar.f7214b, bVar.f7216d);
            }
        }
        m4422l(arrayList);
        this.f7212f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4414d(b bVar) {
        int i10;
        C5339u c5339u;
        int i11 = bVar.f7213a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM4423m = m4423m(bVar.f7214b, i11);
        int i12 = bVar.f7214b;
        int i13 = bVar.f7213a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = bVar.f7216d;
            c5339u = this.f7207a;
            if (i14 >= i16) {
                break;
            }
            int iM4423m2 = m4423m((i10 * i14) + bVar.f7214b, bVar.f7213a);
            int i17 = bVar.f7213a;
            if (i17 == 2 ? iM4423m2 == iM4423m : i17 == 4 && iM4423m2 == iM4423m + 1) {
                i15++;
            } else {
                b bVarM4418h = m4418h(bVar.f7215c, i17, iM4423m, i15);
                m4415e(bVarM4418h, i12);
                bVarM4418h.f7215c = null;
                c5339u.mo11464a(bVarM4418h);
                if (bVar.f7213a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iM4423m = iM4423m2;
            }
            i14++;
        }
        Object obj = bVar.f7215c;
        bVar.f7215c = null;
        c5339u.mo11464a(bVar);
        if (i15 > 0) {
            b bVarM4418h2 = m4418h(obj, bVar.f7213a, iM4423m, i15);
            m4415e(bVarM4418h2, i12);
            bVarM4418h2.f7215c = null;
            c5339u.mo11464a(bVarM4418h2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m4415e(b bVar, int i10) {
        C1147d0 c1147d0 = (C1147d0) this.f7210d;
        c1147d0.m4444a(bVar);
        int i11 = bVar.f7213a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c1147d0.m4446c(i10, bVar.f7216d, bVar.f7215c);
        } else {
            int i12 = bVar.f7216d;
            RecyclerView recyclerView = c1147d0.f7244a;
            recyclerView.m4183Q(i10, i12, true);
            recyclerView.f6970G0 = true;
            recyclerView.f6967D0.f7142c += i12;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m4416f(int i10, int i11) {
        ArrayList<b> arrayList = this.f7209c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f7213a;
            if (i12 == 8) {
                int i13 = bVar.f7214b;
                if (i13 == i10) {
                    i10 = bVar.f7216d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f7216d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f7214b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f7216d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f7216d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4417g() {
        return this.f7208b.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public final b m4418h(Object obj, int i10, int i11, int i12) {
        b bVar = (b) this.f7207a.mo11465b();
        if (bVar == null) {
            return new b(obj, i10, i11, i12);
        }
        bVar.f7213a = i10;
        bVar.f7214b = i11;
        bVar.f7216d = i12;
        bVar.f7215c = obj;
        return bVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m4419i(b bVar) {
        this.f7209c.add(bVar);
        int i10 = bVar.f7213a;
        a aVar = this.f7210d;
        if (i10 == 1) {
            ((C1147d0) aVar).m4447d(bVar.f7214b, bVar.f7216d);
            return;
        }
        if (i10 == 2) {
            int i11 = bVar.f7214b;
            int i12 = bVar.f7216d;
            RecyclerView recyclerView = ((C1147d0) aVar).f7244a;
            recyclerView.m4183Q(i11, i12, false);
            recyclerView.f6970G0 = true;
            return;
        }
        if (i10 == 4) {
            ((C1147d0) aVar).m4446c(bVar.f7214b, bVar.f7216d, bVar.f7215c);
        } else if (i10 == 8) {
            ((C1147d0) aVar).m4448e(bVar.f7214b, bVar.f7216d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0197  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x016e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x018c  */
    /* JADX INFO: renamed from: j */
    public final void m4420j() {
        int i10;
        byte b10;
        int i11;
        int i12;
        boolean z10;
        byte b11;
        b bVarM4418h;
        int i13;
        int i14;
        int i15;
        b bVarM4418h2;
        boolean z11;
        boolean z12;
        b bVarM4418h3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ArrayList<b> arrayList = this.f7208b;
        C1172w c1172w = this.f7211e;
        c1172w.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i10 = 8;
                b10 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f7213a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i11 = 2;
            if (size == -1) {
                break;
            }
            int i24 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i24);
            int i25 = bVar2.f7213a;
            if (i25 != 1) {
                C1172w.a aVar = c1172w.f7473a;
                if (i25 == 2) {
                    int i26 = bVar.f7214b;
                    int i27 = bVar.f7216d;
                    if (i26 < i27) {
                        if (bVar2.f7214b == i26 && bVar2.f7216d == i27 - i26) {
                            z12 = true;
                            z11 = false;
                        } else {
                            z12 = false;
                            z11 = z12;
                        }
                    } else if (bVar2.f7214b == i27 + 1 && bVar2.f7216d == i26 - i27) {
                        z12 = true;
                        z11 = z12;
                    } else {
                        z11 = true;
                        z12 = false;
                    }
                    int i28 = bVar2.f7214b;
                    if (i27 < i28) {
                        bVar2.f7214b = i28 - 1;
                    } else {
                        int i29 = bVar2.f7216d;
                        if (i27 < i28 + i29) {
                            bVar2.f7216d = i29 - 1;
                            bVar.f7213a = 2;
                            bVar.f7216d = 1;
                            if (bVar2.f7216d == 0) {
                                arrayList.remove(i24);
                                C1140a c1140a = (C1140a) aVar;
                                c1140a.getClass();
                                bVar2.f7215c = null;
                                c1140a.f7207a.mo11464a(bVar2);
                            }
                        }
                    }
                    int i30 = bVar.f7214b;
                    int i31 = bVar2.f7214b;
                    if (i30 <= i31) {
                        bVar2.f7214b = i31 + 1;
                    } else {
                        int i32 = i31 + bVar2.f7216d;
                        if (i30 < i32) {
                            bVarM4418h3 = ((C1140a) aVar).m4418h(null, 2, i30 + 1, i32 - i30);
                            bVar2.f7216d = bVar.f7214b - bVar2.f7214b;
                        }
                        if (z12) {
                            arrayList.set(size, bVar2);
                            arrayList.remove(i24);
                            C1140a c1140a2 = (C1140a) aVar;
                            c1140a2.getClass();
                            bVar.f7215c = null;
                            c1140a2.f7207a.mo11464a(bVar);
                        } else {
                            if (z11) {
                                if (bVarM4418h3 != null) {
                                    i22 = bVar.f7214b;
                                    if (i22 > bVarM4418h3.f7214b) {
                                        bVar.f7214b = i22 - bVarM4418h3.f7216d;
                                    }
                                    i23 = bVar.f7216d;
                                    if (i23 > bVarM4418h3.f7214b) {
                                        bVar.f7216d = i23 - bVarM4418h3.f7216d;
                                    }
                                }
                                i20 = bVar.f7214b;
                                if (i20 > bVar2.f7214b) {
                                    bVar.f7214b = i20 - bVar2.f7216d;
                                }
                                i21 = bVar.f7216d;
                                if (i21 > bVar2.f7214b) {
                                    bVar.f7216d = i21 - bVar2.f7216d;
                                }
                            } else {
                                if (bVarM4418h3 != null) {
                                    i18 = bVar.f7214b;
                                    if (i18 >= bVarM4418h3.f7214b) {
                                        bVar.f7214b = i18 - bVarM4418h3.f7216d;
                                    }
                                    i19 = bVar.f7216d;
                                    if (i19 >= bVarM4418h3.f7214b) {
                                        bVar.f7216d = i19 - bVarM4418h3.f7216d;
                                    }
                                }
                                i16 = bVar.f7214b;
                                if (i16 >= bVar2.f7214b) {
                                    bVar.f7214b = i16 - bVar2.f7216d;
                                }
                                i17 = bVar.f7216d;
                                if (i17 >= bVar2.f7214b) {
                                    bVar.f7216d = i17 - bVar2.f7216d;
                                }
                            }
                            arrayList.set(size, bVar2);
                            if (bVar.f7214b != bVar.f7216d) {
                                arrayList.set(i24, bVar);
                            } else {
                                arrayList.remove(i24);
                            }
                            if (bVarM4418h3 != null) {
                                arrayList.add(size, bVarM4418h3);
                            }
                        }
                    }
                    bVarM4418h3 = null;
                    if (z12) {
                        arrayList.set(size, bVar2);
                        arrayList.remove(i24);
                        C1140a c1140a3 = (C1140a) aVar;
                        c1140a3.getClass();
                        bVar.f7215c = null;
                        c1140a3.f7207a.mo11464a(bVar);
                    } else {
                        if (z11) {
                            if (bVarM4418h3 != null) {
                                i22 = bVar.f7214b;
                                if (i22 > bVarM4418h3.f7214b) {
                                    bVar.f7214b = i22 - bVarM4418h3.f7216d;
                                }
                                i23 = bVar.f7216d;
                                if (i23 > bVarM4418h3.f7214b) {
                                    bVar.f7216d = i23 - bVarM4418h3.f7216d;
                                }
                            }
                            i20 = bVar.f7214b;
                            if (i20 > bVar2.f7214b) {
                                bVar.f7214b = i20 - bVar2.f7216d;
                            }
                            i21 = bVar.f7216d;
                            if (i21 > bVar2.f7214b) {
                                bVar.f7216d = i21 - bVar2.f7216d;
                            }
                        } else {
                            if (bVarM4418h3 != null) {
                                i18 = bVar.f7214b;
                                if (i18 >= bVarM4418h3.f7214b) {
                                    bVar.f7214b = i18 - bVarM4418h3.f7216d;
                                }
                                i19 = bVar.f7216d;
                                if (i19 >= bVarM4418h3.f7214b) {
                                    bVar.f7216d = i19 - bVarM4418h3.f7216d;
                                }
                            }
                            i16 = bVar.f7214b;
                            if (i16 >= bVar2.f7214b) {
                                bVar.f7214b = i16 - bVar2.f7216d;
                            }
                            i17 = bVar.f7216d;
                            if (i17 >= bVar2.f7214b) {
                                bVar.f7216d = i17 - bVar2.f7216d;
                            }
                        }
                        arrayList.set(size, bVar2);
                        if (bVar.f7214b != bVar.f7216d) {
                            arrayList.set(i24, bVar);
                        } else {
                            arrayList.remove(i24);
                        }
                        if (bVarM4418h3 != null) {
                            arrayList.add(size, bVarM4418h3);
                        }
                    }
                } else if (i25 == 4) {
                    int i33 = bVar.f7216d;
                    int i34 = bVar2.f7214b;
                    if (i33 < i34) {
                        bVar2.f7214b = i34 - 1;
                    } else {
                        int i35 = bVar2.f7216d;
                        if (i33 < i34 + i35) {
                            bVar2.f7216d = i35 - 1;
                            bVarM4418h = ((C1140a) aVar).m4418h(bVar2.f7215c, 4, bVar.f7214b, 1);
                        }
                        i13 = bVar.f7214b;
                        i14 = bVar2.f7214b;
                        if (i13 <= i14) {
                            bVar2.f7214b = i14 + 1;
                        } else {
                            i15 = i14 + bVar2.f7216d;
                            if (i13 < i15) {
                                int i36 = i15 - i13;
                                bVarM4418h2 = ((C1140a) aVar).m4418h(bVar2.f7215c, 4, i13 + 1, i36);
                                bVar2.f7216d -= i36;
                            }
                            arrayList.set(i24, bVar);
                            if (bVar2.f7216d > 0) {
                                arrayList.set(size, bVar2);
                            } else {
                                arrayList.remove(size);
                                C1140a c1140a4 = (C1140a) aVar;
                                c1140a4.getClass();
                                bVar2.f7215c = null;
                                c1140a4.f7207a.mo11464a(bVar2);
                            }
                            if (bVarM4418h != null) {
                                arrayList.add(size, bVarM4418h);
                            }
                            if (bVarM4418h2 != null) {
                                arrayList.add(size, bVarM4418h2);
                            }
                        }
                        bVarM4418h2 = null;
                        arrayList.set(i24, bVar);
                        if (bVar2.f7216d > 0) {
                            arrayList.set(size, bVar2);
                        } else {
                            arrayList.remove(size);
                            C1140a c1140a5 = (C1140a) aVar;
                            c1140a5.getClass();
                            bVar2.f7215c = null;
                            c1140a5.f7207a.mo11464a(bVar2);
                        }
                        if (bVarM4418h != null) {
                            arrayList.add(size, bVarM4418h);
                        }
                        if (bVarM4418h2 != null) {
                            arrayList.add(size, bVarM4418h2);
                        }
                    }
                    bVarM4418h = null;
                    i13 = bVar.f7214b;
                    i14 = bVar2.f7214b;
                    if (i13 <= i14) {
                        bVar2.f7214b = i14 + 1;
                    } else {
                        i15 = i14 + bVar2.f7216d;
                        if (i13 < i15) {
                            int i37 = i15 - i13;
                            bVarM4418h2 = ((C1140a) aVar).m4418h(bVar2.f7215c, 4, i13 + 1, i37);
                            bVar2.f7216d -= i37;
                        }
                        arrayList.set(i24, bVar);
                        if (bVar2.f7216d > 0) {
                            arrayList.set(size, bVar2);
                        } else {
                            arrayList.remove(size);
                            C1140a c1140a6 = (C1140a) aVar;
                            c1140a6.getClass();
                            bVar2.f7215c = null;
                            c1140a6.f7207a.mo11464a(bVar2);
                        }
                        if (bVarM4418h != null) {
                            arrayList.add(size, bVarM4418h);
                        }
                        if (bVarM4418h2 != null) {
                            arrayList.add(size, bVarM4418h2);
                        }
                    }
                    bVarM4418h2 = null;
                    arrayList.set(i24, bVar);
                    if (bVar2.f7216d > 0) {
                        arrayList.set(size, bVar2);
                    } else {
                        arrayList.remove(size);
                        C1140a c1140a7 = (C1140a) aVar;
                        c1140a7.getClass();
                        bVar2.f7215c = null;
                        c1140a7.f7207a.mo11464a(bVar2);
                    }
                    if (bVarM4418h != null) {
                        arrayList.add(size, bVarM4418h);
                    }
                    if (bVarM4418h2 != null) {
                        arrayList.add(size, bVarM4418h2);
                    }
                }
            } else {
                int i38 = bVar.f7216d;
                int i39 = bVar2.f7214b;
                int i40 = i38 < i39 ? -1 : 0;
                int i41 = bVar.f7214b;
                if (i41 < i39) {
                    i40++;
                }
                if (i39 <= i41) {
                    bVar.f7214b = i41 + bVar2.f7216d;
                }
                int i42 = bVar2.f7214b;
                if (i42 <= i38) {
                    bVar.f7216d = i38 + bVar2.f7216d;
                }
                bVar2.f7214b = i42 + i40;
                arrayList.set(size, bVar2);
                arrayList.set(i24, bVar);
            }
        }
        int size2 = arrayList.size();
        int i43 = 0;
        while (i43 < size2) {
            b bVarM4418h4 = arrayList.get(i43);
            int i44 = bVarM4418h4.f7213a;
            if (i44 != 1) {
                C5339u c5339u = this.f7207a;
                a aVar2 = this.f7210d;
                if (i44 == i11) {
                    int i45 = bVarM4418h4.f7214b;
                    int i46 = bVarM4418h4.f7216d + i45;
                    int i47 = i45;
                    int i48 = 0;
                    byte b12 = -1;
                    while (i47 < i46) {
                        if (((C1147d0) aVar2).m4445b(i47) != null || m4411a(i47)) {
                            if (b12 == 0) {
                                m4414d(m4418h(null, 2, i45, i48));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 1;
                        } else {
                            if (b12 == 1) {
                                m4419i(m4418h(null, 2, i45, i48));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 0;
                        }
                        if (z10) {
                            i47 -= i48;
                            i46 -= i48;
                            i48 = 1;
                        } else {
                            i48++;
                        }
                        i47++;
                        b12 = b11;
                    }
                    if (i48 != bVarM4418h4.f7216d) {
                        bVarM4418h4.f7215c = null;
                        c5339u.mo11464a(bVarM4418h4);
                        i12 = 2;
                        bVarM4418h4 = m4418h(null, 2, i45, i48);
                    } else {
                        i12 = 2;
                    }
                    if (b12 == 0) {
                        m4414d(bVarM4418h4);
                    } else {
                        m4419i(bVarM4418h4);
                    }
                } else if (i44 != 4) {
                    if (i44 == i10) {
                        m4419i(bVarM4418h4);
                    }
                    i12 = i11;
                } else {
                    int i49 = bVarM4418h4.f7214b;
                    int i50 = bVarM4418h4.f7216d + i49;
                    int i51 = i49;
                    int i52 = 0;
                    while (i49 < i50) {
                        if (((C1147d0) aVar2).m4445b(i49) != null || m4411a(i49)) {
                            if (b10 == 0) {
                                m4414d(m4418h(bVarM4418h4.f7215c, 4, i51, i52));
                                i51 = i49;
                                i52 = 0;
                            }
                            b10 = 1;
                        } else {
                            if (b10 == 1) {
                                m4419i(m4418h(bVarM4418h4.f7215c, 4, i51, i52));
                                i51 = i49;
                                i52 = 0;
                            }
                            b10 = 0;
                        }
                        i52++;
                        i49++;
                    }
                    if (i52 != bVarM4418h4.f7216d) {
                        Object obj = bVarM4418h4.f7215c;
                        bVarM4418h4.f7215c = null;
                        c5339u.mo11464a(bVarM4418h4);
                        bVarM4418h4 = m4418h(obj, 4, i51, i52);
                    }
                    if (b10 == 0) {
                        m4414d(bVarM4418h4);
                    } else {
                        m4419i(bVarM4418h4);
                    }
                    i12 = 2;
                }
            } else {
                i12 = i11;
                m4419i(bVarM4418h4);
            }
            i43++;
            i11 = i12;
            i10 = 8;
            b10 = -1;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m4421k(b bVar) {
        bVar.f7215c = null;
        this.f7207a.mo11464a(bVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m4422l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m4421k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: m */
    public final int m4423m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<b> arrayList = this.f7209c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i14 = bVar.f7213a;
            if (i14 == 8) {
                int i15 = bVar.f7214b;
                int i16 = bVar.f7216d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f7214b = i15 + 1;
                            bVar.f7216d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f7214b = i15 - 1;
                            bVar.f7216d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f7216d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f7216d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f7214b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f7214b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f7214b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f7216d;
                    } else if (i14 == 2) {
                        i10 += bVar.f7216d;
                    }
                } else if (i11 == 1) {
                    bVar.f7214b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f7214b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f7213a == 8) {
                int i18 = bVar2.f7216d;
                if (i18 == bVar2.f7214b || i18 < 0) {
                    arrayList.remove(size2);
                    m4421k(bVar2);
                }
            } else if (bVar2.f7216d <= 0) {
                arrayList.remove(size2);
                m4421k(bVar2);
            }
        }
        return i10;
    }
}
