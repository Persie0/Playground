package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yba {

    /* JADX INFO: renamed from: e */
    public static final yba f69611e = new yba(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f69612a;

    /* JADX INFO: renamed from: b */
    public int f69613b;

    /* JADX INFO: renamed from: c */
    public final u06 f69614c;

    /* JADX INFO: renamed from: d */
    public Object[] f69615d;

    public yba(int i, int i2, Object[] objArr, u06 u06Var) {
        this.f69612a = i;
        this.f69613b = i2;
        this.f69614c = u06Var;
        this.f69615d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static yba m25034j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, u06 u06Var) {
        if (i3 > 30) {
            return new yba(0, 0, new Object[]{obj, obj2, obj3, obj4}, u06Var);
        }
        int iM3612e = bca.m3612e(i, i3);
        int iM3612e2 = bca.m3612e(i2, i3);
        if (iM3612e != iM3612e2) {
            return new yba((1 << iM3612e) | (1 << iM3612e2), 0, iM3612e < iM3612e2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, u06Var);
        }
        return new yba(0, 1 << iM3612e, new Object[]{m25034j(i, obj, obj2, i2, obj3, obj4, i3 + 5, u06Var)}, u06Var);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m25035a(int i, int i2, int i3, Object obj, Object obj2, int i4, u06 u06Var) {
        Object obj3 = this.f69615d[i];
        yba ybaVarM25034j = m25034j(obj3 != null ? obj3.hashCode() : 0, obj3, m25057x(i), i3, obj, obj2, i4 + 5, u06Var);
        int iM25053t = m25053t(i2);
        int i5 = iM25053t + 1;
        Object[] objArr = this.f69615d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC3550rv.m20830X(0, i, 6, objArr, objArr2);
        AbstractC3550rv.m20826T(i, i + 2, i5, objArr, objArr2);
        objArr2[iM25053t - 1] = ybaVarM25034j;
        AbstractC3550rv.m20826T(iM25053t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m25036b() {
        if (this.f69613b == 0) {
            return this.f69615d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f69612a);
        int length = this.f69615d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m25052s(i).m25036b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25037c(Object obj) {
        g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, this.f69615d.length));
        int i = g84VarM15914E.f40379a;
        int i2 = g84VarM15914E.f40380b;
        int i3 = g84VarM15914E.f40381c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!fa4.m11650l(obj, this.f69615d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25038d(int i, Object obj, int i2) {
        int iM3612e = 1 << bca.m3612e(i, i2);
        if (m25042h(iM3612e)) {
            return fa4.m11650l(obj, this.f69615d[m25040f(iM3612e)]);
        }
        if (!m25043i(iM3612e)) {
            return false;
        }
        yba ybaVarM25052s = m25052s(m25053t(iM3612e));
        return i2 == 30 ? ybaVarM25052s.m25037c(obj) : ybaVarM25052s.m25038d(i, obj, i2 + 5);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25039e(yba ybaVar) {
        if (this == ybaVar) {
            return true;
        }
        if (this.f69613b == ybaVar.f69613b && this.f69612a == ybaVar.f69612a) {
            int length = this.f69615d.length;
            for (int i = 0; i < length; i++) {
                if (this.f69615d[i] == ybaVar.f69615d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m25040f(int i) {
        return Integer.bitCount(this.f69612a & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m25041g(int i, Object obj, int i2) {
        int iM3612e = 1 << bca.m3612e(i, i2);
        if (m25042h(iM3612e)) {
            int iM25040f = m25040f(iM3612e);
            if (fa4.m11650l(obj, this.f69615d[iM25040f])) {
                return m25057x(iM25040f);
            }
            return null;
        }
        if (!m25043i(iM3612e)) {
            return null;
        }
        yba ybaVarM25052s = m25052s(m25053t(iM3612e));
        if (i2 != 30) {
            return ybaVarM25052s.m25041g(i, obj, i2 + 5);
        }
        g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVarM25052s.f69615d.length));
        int i3 = g84VarM15914E.f40379a;
        int i4 = g84VarM15914E.f40380b;
        int i5 = g84VarM15914E.f40381c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!fa4.m11650l(obj, ybaVarM25052s.f69615d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return ybaVarM25052s.m25057x(i3);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m25042h(int i) {
        return (this.f69612a & i) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m25043i(int i) {
        return (this.f69613b & i) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final yba m25044k(int i, o77 o77Var) {
        o77Var.m17830c(o77Var.f53941f - 1);
        o77Var.f53939d = m25057x(i);
        Object[] objArr = this.f69615d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f69614c != o77Var.f53937b) {
            return new yba(0, 0, bca.m3610b(objArr, i), o77Var.f53937b);
        }
        this.f69615d = bca.m3610b(objArr, i);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final yba m25045l(int i, Object obj, Object obj2, int i2, o77 o77Var) {
        o77 o77Var2;
        yba ybaVarM25045l;
        int iM3612e = 1 << bca.m3612e(i, i2);
        boolean zM25042h = m25042h(iM3612e);
        u06 u06Var = this.f69614c;
        if (zM25042h) {
            int iM25040f = m25040f(iM3612e);
            if (!fa4.m11650l(obj, this.f69615d[iM25040f])) {
                o77Var.m17830c(o77Var.f53941f + 1);
                u06 u06Var2 = o77Var.f53937b;
                if (u06Var != u06Var2) {
                    return new yba(this.f69612a ^ iM3612e, this.f69613b | iM3612e, m25035a(iM25040f, iM3612e, i, obj, obj2, i2, u06Var2), u06Var2);
                }
                this.f69615d = m25035a(iM25040f, iM3612e, i, obj, obj2, i2, u06Var2);
                this.f69612a ^= iM3612e;
                this.f69613b |= iM3612e;
                return this;
            }
            o77Var.f53939d = m25057x(iM25040f);
            if (m25057x(iM25040f) == obj2) {
                return this;
            }
            if (u06Var == o77Var.f53937b) {
                this.f69615d[iM25040f + 1] = obj2;
                return this;
            }
            o77Var.f53940e++;
            Object[] objArr = this.f69615d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM25040f + 1] = obj2;
            return new yba(this.f69612a, this.f69613b, objArrCopyOf, o77Var.f53937b);
        }
        if (!m25043i(iM3612e)) {
            o77Var.m17830c(o77Var.f53941f + 1);
            u06 u06Var3 = o77Var.f53937b;
            int iM25040f2 = m25040f(iM3612e);
            Object[] objArr2 = this.f69615d;
            if (u06Var != u06Var3) {
                return new yba(this.f69612a | iM3612e, this.f69613b, bca.m3609a(objArr2, iM25040f2, obj, obj2), u06Var3);
            }
            this.f69615d = bca.m3609a(objArr2, iM25040f2, obj, obj2);
            this.f69612a |= iM3612e;
            return this;
        }
        int iM25053t = m25053t(iM3612e);
        yba ybaVarM25052s = m25052s(iM25053t);
        if (i2 == 30) {
            g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVarM25052s.f69615d.length));
            int i3 = g84VarM15914E.f40379a;
            int i4 = g84VarM15914E.f40380b;
            int i5 = g84VarM15914E.f40381c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!fa4.m11650l(obj, ybaVarM25052s.f69615d[i3])) {
                        if (i3 == i4) {
                            o77Var.m17830c(o77Var.f53941f + 1);
                            ybaVarM25045l = new yba(0, 0, bca.m3609a(ybaVarM25052s.f69615d, 0, obj, obj2), o77Var.f53937b);
                            break;
                        }
                        i3 += i5;
                    } else {
                        o77Var.f53939d = ybaVarM25052s.m25057x(i3);
                        if (ybaVarM25052s.f69614c != o77Var.f53937b) {
                            o77Var.f53940e++;
                            Object[] objArr3 = ybaVarM25052s.f69615d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            ybaVarM25045l = new yba(0, 0, objArrCopyOf2, o77Var.f53937b);
                            break;
                        }
                        ybaVarM25052s.f69615d[i3 + 1] = obj2;
                        ybaVarM25045l = ybaVarM25052s;
                        break;
                    }
                }
            } else {
                o77Var.m17830c(o77Var.f53941f + 1);
                ybaVarM25045l = new yba(0, 0, bca.m3609a(ybaVarM25052s.f69615d, 0, obj, obj2), o77Var.f53937b);
                break;
            }
            o77Var2 = o77Var;
        } else {
            o77Var2 = o77Var;
            ybaVarM25045l = ybaVarM25052s.m25045l(i, obj, obj2, i2 + 5, o77Var2);
        }
        return ybaVarM25052s == ybaVarM25045l ? this : m25051r(iM25053t, ybaVarM25045l, o77Var2.f53937b);
    }

    /* JADX INFO: renamed from: m */
    public final yba m25046m(yba ybaVar, int i, eb2 eb2Var, o77 o77Var) {
        yba ybaVar2;
        Object[] objArr;
        yba ybaVarM25034j;
        if (this == ybaVar) {
            eb2Var.f36969a += m25036b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            u06 u06Var = o77Var.f53937b;
            int i3 = ybaVar.f69613b;
            Object[] objArr2 = this.f69615d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + ybaVar.f69615d.length);
            int length = this.f69615d.length;
            g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVar.f69615d.length));
            int i4 = g84VarM15914E.f40379a;
            int i5 = g84VarM15914E.f40380b;
            int i6 = g84VarM15914E.f40381c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m25037c(ybaVar.f69615d[i4])) {
                        eb2Var.f36969a++;
                    } else {
                        Object[] objArr3 = ybaVar.f69615d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.f69615d.length) {
                if (length == ybaVar.f69615d.length) {
                    return ybaVar;
                }
                return length == objArrCopyOf.length ? new yba(0, 0, objArrCopyOf, u06Var) : new yba(0, 0, Arrays.copyOf(objArrCopyOf, length), u06Var);
            }
        } else {
            int i7 = this.f69613b | ybaVar.f69613b;
            int i8 = this.f69612a;
            int i9 = ybaVar.f69612a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (fa4.m11650l(this.f69615d[m25040f(iLowestOneBit)], ybaVar.f69615d[ybaVar.m25040f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                hi7.m13279b("Check failed.");
            }
            if (fa4.m11650l(this.f69614c, o77Var.f53937b) && this.f69612a == i12 && this.f69613b == i7) {
                ybaVar2 = this;
            } else {
                ybaVar2 = new yba(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = ybaVar2.f69615d;
                int length2 = (objArr4.length - 1) - i14;
                if (m25043i(iLowestOneBit2)) {
                    ybaVarM25034j = m25052s(m25053t(iLowestOneBit2));
                    if (ybaVar.m25043i(iLowestOneBit2)) {
                        ybaVarM25034j = ybaVarM25034j.m25046m(ybaVar.m25052s(ybaVar.m25053t(iLowestOneBit2)), i + 5, eb2Var, o77Var);
                        objArr = objArr4;
                    } else if (ybaVar.m25042h(iLowestOneBit2)) {
                        int iM25040f = ybaVar.m25040f(iLowestOneBit2);
                        Object obj = ybaVar.f69615d[iM25040f];
                        Object objM25057x = ybaVar.m25057x(iM25040f);
                        int i15 = o77Var.f53941f;
                        objArr = objArr4;
                        ybaVarM25034j = ybaVarM25034j.m25045l(obj != null ? obj.hashCode() : i2, obj, objM25057x, i + 5, o77Var);
                        if (o77Var.f53941f == i15) {
                            eb2Var.f36969a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (ybaVar.m25043i(iLowestOneBit2)) {
                        yba ybaVarM25052s = ybaVar.m25052s(ybaVar.m25053t(iLowestOneBit2));
                        if (m25042h(iLowestOneBit2)) {
                            int iM25040f2 = m25040f(iLowestOneBit2);
                            Object obj2 = this.f69615d[iM25040f2];
                            int i16 = i + 5;
                            if (ybaVarM25052s.m25038d(obj2 != null ? obj2.hashCode() : 0, obj2, i16)) {
                                eb2Var.f36969a++;
                                ybaVarM25034j = ybaVarM25052s;
                            } else {
                                ybaVarM25034j = ybaVarM25052s.m25045l(obj2 != null ? obj2.hashCode() : 0, obj2, m25057x(iM25040f2), i16, o77Var);
                            }
                        } else {
                            ybaVarM25034j = ybaVarM25052s;
                        }
                    } else {
                        int iM25040f3 = m25040f(iLowestOneBit2);
                        Object obj3 = this.f69615d[iM25040f3];
                        Object objM25057x2 = m25057x(iM25040f3);
                        int iM25040f4 = ybaVar.m25040f(iLowestOneBit2);
                        Object obj4 = ybaVar.f69615d[iM25040f4];
                        ybaVarM25034j = m25034j(obj3 != null ? obj3.hashCode() : 0, obj3, objM25057x2, obj4 != null ? obj4.hashCode() : 0, obj4, ybaVar.m25057x(iM25040f4), i + 5, o77Var.f53937b);
                    }
                }
                objArr[length2] = ybaVarM25034j;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (ybaVar.m25042h(iLowestOneBit3)) {
                    int iM25040f5 = ybaVar.m25040f(iLowestOneBit3);
                    Object[] objArr5 = ybaVar2.f69615d;
                    objArr5[i18] = ybaVar.f69615d[iM25040f5];
                    objArr5[i18 + 1] = ybaVar.m25057x(iM25040f5);
                    if (m25042h(iLowestOneBit3)) {
                        eb2Var.f36969a++;
                    }
                } else {
                    int iM25040f6 = m25040f(iLowestOneBit3);
                    Object[] objArr6 = ybaVar2.f69615d;
                    objArr6[i18] = this.f69615d[iM25040f6];
                    objArr6[i18 + 1] = m25057x(iM25040f6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m25039e(ybaVar2)) {
                return ybaVar.m25039e(ybaVar2) ? ybaVar : ybaVar2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final yba m25047n(int i, Object obj, int i2, o77 o77Var) {
        yba ybaVarM25047n;
        int iM3612e = 1 << bca.m3612e(i, i2);
        if (m25042h(iM3612e)) {
            int iM25040f = m25040f(iM3612e);
            if (fa4.m11650l(obj, this.f69615d[iM25040f])) {
                return m25049p(iM25040f, iM3612e, o77Var);
            }
        } else if (m25043i(iM3612e)) {
            int iM25053t = m25053t(iM3612e);
            yba ybaVarM25052s = m25052s(iM25053t);
            if (i2 == 30) {
                g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVarM25052s.f69615d.length));
                int i3 = g84VarM15914E.f40379a;
                int i4 = g84VarM15914E.f40380b;
                int i5 = g84VarM15914E.f40381c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!fa4.m11650l(obj, ybaVarM25052s.f69615d[i3])) {
                            if (i3 == i4) {
                                ybaVarM25047n = ybaVarM25052s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            ybaVarM25047n = ybaVarM25052s.m25044k(i3, o77Var);
                            break;
                        }
                    }
                } else {
                    ybaVarM25047n = ybaVarM25052s;
                    break;
                }
            } else {
                ybaVarM25047n = ybaVarM25052s.m25047n(i, obj, i2 + 5, o77Var);
            }
            return m25050q(ybaVarM25052s, ybaVarM25047n, iM25053t, iM3612e, o77Var.f53937b);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final yba m25048o(int i, Object obj, Object obj2, int i2, o77 o77Var) {
        o77 o77Var2;
        yba ybaVarM25048o;
        int iM3612e = 1 << bca.m3612e(i, i2);
        if (m25042h(iM3612e)) {
            int iM25040f = m25040f(iM3612e);
            return (fa4.m11650l(obj, this.f69615d[iM25040f]) && fa4.m11650l(obj2, m25057x(iM25040f))) ? m25049p(iM25040f, iM3612e, o77Var) : this;
        }
        if (!m25043i(iM3612e)) {
            return this;
        }
        int iM25053t = m25053t(iM3612e);
        yba ybaVarM25052s = m25052s(iM25053t);
        if (i2 == 30) {
            g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVarM25052s.f69615d.length));
            int i3 = g84VarM15914E.f40379a;
            int i4 = g84VarM15914E.f40380b;
            int i5 = g84VarM15914E.f40381c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!fa4.m11650l(obj, ybaVarM25052s.f69615d[i3]) || !fa4.m11650l(obj2, ybaVarM25052s.m25057x(i3))) {
                        if (i3 == i4) {
                            ybaVarM25048o = ybaVarM25052s;
                            break;
                        }
                        i3 += i5;
                    } else {
                        ybaVarM25048o = ybaVarM25052s.m25044k(i3, o77Var);
                        break;
                    }
                }
            } else {
                ybaVarM25048o = ybaVarM25052s;
                break;
            }
            o77Var2 = o77Var;
        } else {
            o77Var2 = o77Var;
            ybaVarM25048o = ybaVarM25052s.m25048o(i, obj, obj2, i2 + 5, o77Var2);
        }
        return m25050q(ybaVarM25052s, ybaVarM25048o, iM25053t, iM3612e, o77Var2.f53937b);
    }

    /* JADX INFO: renamed from: p */
    public final yba m25049p(int i, int i2, o77 o77Var) {
        o77Var.m17830c(o77Var.f53941f - 1);
        o77Var.f53939d = m25057x(i);
        Object[] objArr = this.f69615d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f69614c != o77Var.f53937b) {
            return new yba(i2 ^ this.f69612a, this.f69613b, bca.m3610b(objArr, i), o77Var.f53937b);
        }
        this.f69615d = bca.m3610b(objArr, i);
        this.f69612a ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final yba m25050q(yba ybaVar, yba ybaVar2, int i, int i2, u06 u06Var) {
        u06 u06Var2 = this.f69614c;
        if (ybaVar2 != null) {
            return (u06Var2 == u06Var || ybaVar != ybaVar2) ? m25051r(i, ybaVar2, u06Var) : this;
        }
        Object[] objArr = this.f69615d;
        if (objArr.length == 1) {
            return null;
        }
        if (u06Var2 != u06Var) {
            return new yba(this.f69612a, this.f69613b ^ i2, bca.m3611c(objArr, i), u06Var);
        }
        this.f69615d = bca.m3611c(objArr, i);
        this.f69613b ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final yba m25051r(int i, yba ybaVar, u06 u06Var) {
        Object[] objArr = this.f69615d;
        if (objArr.length == 1 && ybaVar.f69615d.length == 2 && ybaVar.f69613b == 0) {
            ybaVar.f69612a = this.f69613b;
            return ybaVar;
        }
        if (this.f69614c == u06Var) {
            objArr[i] = ybaVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = ybaVar;
        return new yba(this.f69612a, this.f69613b, objArrCopyOf, u06Var);
    }

    /* JADX INFO: renamed from: s */
    public final yba m25052s(int i) {
        Object obj = this.f69615d[i];
        obj.getClass();
        return (yba) obj;
    }

    /* JADX INFO: renamed from: t */
    public final int m25053t(int i) {
        return (this.f69615d.length - 1) - Integer.bitCount(this.f69613b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r15.f44721c = m25056w(r3, r2, (p000.yba) r15.f44721c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        return r15;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3126ix m25054u(Object obj, int i, int i2, Object obj2) {
        C3126ix c3126ixM25054u;
        int i3 = 1;
        int iM3612e = 1 << bca.m3612e(i, i2);
        int i4 = 13;
        int i5 = 0;
        if (m25042h(iM3612e)) {
            int iM25040f = m25040f(iM3612e);
            if (!fa4.m11650l(obj, this.f69615d[iM25040f])) {
                return new C3126ix(new yba(this.f69612a ^ iM3612e, this.f69613b | iM3612e, m25035a(iM25040f, iM3612e, i, obj, obj2, i2, null), null), i3, i4);
            }
            if (m25057x(iM25040f) != obj2) {
                Object[] objArr = this.f69615d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM25040f + 1] = obj2;
                return new C3126ix(new yba(this.f69612a, this.f69613b, objArrCopyOf, null), i5, i4);
            }
        } else {
            if (!m25043i(iM3612e)) {
                return new C3126ix(new yba(iM3612e | this.f69612a, this.f69613b, bca.m3609a(this.f69615d, m25040f(iM3612e), obj, obj2), null), i3, i4);
            }
            int iM25053t = m25053t(iM3612e);
            yba ybaVarM25052s = m25052s(iM25053t);
            if (i2 == 30) {
                g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVarM25052s.f69615d.length));
                int i6 = g84VarM15914E.f40379a;
                int i7 = g84VarM15914E.f40380b;
                int i8 = g84VarM15914E.f40381c;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        if (!fa4.m11650l(obj, ybaVarM25052s.f69615d[i6])) {
                            if (i6 == i7) {
                                c3126ixM25054u = new C3126ix(new yba(0, 0, bca.m3609a(ybaVarM25052s.f69615d, 0, obj, obj2), null), i3, i4);
                                break;
                            }
                            i6 += i8;
                        } else {
                            if (obj2 != ybaVarM25052s.m25057x(i6)) {
                                Object[] objArr2 = ybaVarM25052s.f69615d;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                objArrCopyOf2[i6 + 1] = obj2;
                                c3126ixM25054u = new C3126ix(new yba(0, 0, objArrCopyOf2, null), i5, i4);
                                break;
                            }
                            c3126ixM25054u = null;
                            break;
                        }
                    }
                } else {
                    c3126ixM25054u = new C3126ix(new yba(0, 0, bca.m3609a(ybaVarM25052s.f69615d, 0, obj, obj2), null), i3, i4);
                    break;
                }
            } else {
                c3126ixM25054u = ybaVarM25052s.m25054u(obj, i, i2 + 5, obj2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final yba m25055v(int i, Object obj, int i2) {
        yba ybaVarM25055v;
        int iM3612e = 1 << bca.m3612e(i, i2);
        if (m25042h(iM3612e)) {
            int iM25040f = m25040f(iM3612e);
            if (!fa4.m11650l(obj, this.f69615d[iM25040f])) {
                return this;
            }
            Object[] objArr = this.f69615d;
            if (objArr.length != 2) {
                return new yba(this.f69612a ^ iM3612e, this.f69613b, bca.m3610b(objArr, iM25040f), null);
            }
        } else {
            if (!m25043i(iM3612e)) {
                return this;
            }
            int iM25053t = m25053t(iM3612e);
            yba ybaVarM25052s = m25052s(iM25053t);
            if (i2 == 30) {
                g84 g84VarM15914E = l70.m15914E(2, l70.m15922M(0, ybaVarM25052s.f69615d.length));
                int i3 = g84VarM15914E.f40379a;
                int i4 = g84VarM15914E.f40380b;
                int i5 = g84VarM15914E.f40381c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!fa4.m11650l(obj, ybaVarM25052s.f69615d[i3])) {
                            if (i3 == i4) {
                                ybaVarM25055v = ybaVarM25052s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = ybaVarM25052s.f69615d;
                            if (objArr2.length != 2) {
                                ybaVarM25055v = new yba(0, 0, bca.m3610b(objArr2, i3), null);
                                break;
                            }
                            ybaVarM25055v = null;
                            break;
                        }
                    }
                } else {
                    ybaVarM25055v = ybaVarM25052s;
                    break;
                }
            } else {
                ybaVarM25055v = ybaVarM25052s.m25055v(i, obj, i2 + 5);
            }
            if (ybaVarM25055v != null) {
                return ybaVarM25052s != ybaVarM25055v ? m25056w(iM25053t, iM3612e, ybaVarM25055v) : this;
            }
            Object[] objArr3 = this.f69615d;
            if (objArr3.length != 1) {
                return new yba(this.f69612a, this.f69613b ^ iM3612e, bca.m3611c(objArr3, iM25053t), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final yba m25056w(int i, int i2, yba ybaVar) {
        Object[] objArr = ybaVar.f69615d;
        if (objArr.length != 2 || ybaVar.f69613b != 0) {
            Object[] objArr2 = this.f69615d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = ybaVar;
            return new yba(this.f69612a, this.f69613b, objArrCopyOf, null);
        }
        if (this.f69615d.length == 1) {
            ybaVar.f69612a = this.f69613b;
            return ybaVar;
        }
        int iM25040f = m25040f(i2);
        Object[] objArr3 = this.f69615d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC3550rv.m20826T(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC3550rv.m20826T(iM25040f + 2, iM25040f, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM25040f] = obj;
        objArrCopyOf2[iM25040f + 1] = obj2;
        return new yba(this.f69612a ^ i2, this.f69613b ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m25057x(int i) {
        return this.f69615d[i + 1];
    }
}
