package p000;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gd5 {

    /* JADX INFO: renamed from: q */
    public static boolean f40570q = false;

    /* JADX INFO: renamed from: d */
    public final lk7 f40574d;

    /* JADX INFO: renamed from: m */
    public final C3309ls f40583m;

    /* JADX INFO: renamed from: p */
    public C3349mv f40586p;

    /* JADX INFO: renamed from: a */
    public int f40571a = DescriptorProtos.Edition.EDITION_2023_VALUE;

    /* JADX INFO: renamed from: b */
    public boolean f40572b = false;

    /* JADX INFO: renamed from: c */
    public int f40573c = 0;

    /* JADX INFO: renamed from: e */
    public int f40575e = 32;

    /* JADX INFO: renamed from: f */
    public int f40576f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f40578h = false;

    /* JADX INFO: renamed from: i */
    public boolean[] f40579i = new boolean[32];

    /* JADX INFO: renamed from: j */
    public int f40580j = 1;

    /* JADX INFO: renamed from: k */
    public int f40581k = 0;

    /* JADX INFO: renamed from: l */
    public int f40582l = 32;

    /* JADX INFO: renamed from: n */
    public rd9[] f40584n = new rd9[DescriptorProtos.Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: o */
    public int f40585o = 0;

    /* JADX INFO: renamed from: g */
    public C3349mv[] f40577g = new C3349mv[32];

    public gd5() {
        m12502s();
        C3309ls c3309ls = new C3309ls(13, false);
        c3309ls.f50064b = new jh7();
        c3309ls.f50065c = new jh7();
        c3309ls.f50066d = new rd9[32];
        this.f40583m = c3309ls;
        lk7 lk7Var = new lk7(c3309ls);
        lk7Var.f49774f = new rd9[128];
        lk7Var.f49775g = 0;
        lk7Var.f49776h = new fs6(lk7Var, 10);
        this.f40574d = lk7Var;
        this.f40586p = new C3349mv(c3309ls);
    }

    /* JADX INFO: renamed from: n */
    public static int m12484n(Object obj) {
        rd9 rd9Var = ((bj1) obj).f8585i;
        if (rd9Var != null) {
            return (int) (rd9Var.f59130e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final rd9 m12485a(SolverVariable$Type solverVariable$Type) {
        jh7 jh7Var = (jh7) this.f40583m.f50065c;
        int i = jh7Var.f45550b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = jh7Var.f45549a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            jh7Var.f45550b = i2;
            obj = obj2;
        }
        rd9 rd9Var = (rd9) obj;
        if (rd9Var == null) {
            rd9Var = new rd9(solverVariable$Type);
            rd9Var.f59134i = solverVariable$Type;
        } else {
            rd9Var.m20591c();
            rd9Var.f59134i = solverVariable$Type;
        }
        int i3 = this.f40585o;
        int i4 = this.f40571a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f40571a = i5;
            this.f40584n = (rd9[]) Arrays.copyOf(this.f40584n, i5);
        }
        rd9[] rd9VarArr = this.f40584n;
        int i6 = this.f40585o;
        this.f40585o = i6 + 1;
        rd9VarArr[i6] = rd9Var;
        return rd9Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m12486b(rd9 rd9Var, rd9 rd9Var2, int i, float f, rd9 rd9Var3, rd9 rd9Var4, int i2, int i3) {
        C3349mv c3349mvM12496l = m12496l();
        if (rd9Var2 == rd9Var3) {
            c3349mvM12496l.f51873d.m9908g(rd9Var, 1.0f);
            c3349mvM12496l.f51873d.m9908g(rd9Var4, 1.0f);
            c3349mvM12496l.f51873d.m9908g(rd9Var2, -2.0f);
        } else {
            C2904cv c2904cv = c3349mvM12496l.f51873d;
            if (f == 0.5f) {
                c2904cv.m9908g(rd9Var, 1.0f);
                c3349mvM12496l.f51873d.m9908g(rd9Var2, -1.0f);
                c3349mvM12496l.f51873d.m9908g(rd9Var3, -1.0f);
                c3349mvM12496l.f51873d.m9908g(rd9Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    c3349mvM12496l.f51871b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c2904cv.m9908g(rd9Var, -1.0f);
                c3349mvM12496l.f51873d.m9908g(rd9Var2, 1.0f);
                c3349mvM12496l.f51871b = i;
            } else if (f >= 1.0f) {
                c2904cv.m9908g(rd9Var4, -1.0f);
                c3349mvM12496l.f51873d.m9908g(rd9Var3, 1.0f);
                c3349mvM12496l.f51871b = -i2;
            } else {
                float f2 = 1.0f - f;
                c2904cv.m9908g(rd9Var, f2 * 1.0f);
                c3349mvM12496l.f51873d.m9908g(rd9Var2, f2 * (-1.0f));
                c3349mvM12496l.f51873d.m9908g(rd9Var3, (-1.0f) * f);
                c3349mvM12496l.f51873d.m9908g(rd9Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c3349mvM12496l.f51871b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c3349mvM12496l.m17049a(this, i3);
        }
        m12487c(c3349mvM12496l);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX INFO: renamed from: c */
    public final void m12487c(C3349mv c3349mv) {
        boolean z;
        boolean z2;
        rd9 rd9VarM17052f;
        boolean z3 = true;
        if (this.f40581k + 1 >= this.f40582l || this.f40580j + 1 >= this.f40576f) {
            m12498o();
        }
        if (c3349mv.f51874e) {
            z = false;
        } else {
            ArrayList arrayList = c3349mv.f51872c;
            if (this.f40577g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iM9905d = c3349mv.f51873d.m9905d();
                    for (int i = 0; i < iM9905d; i++) {
                        rd9 rd9VarM9906e = c3349mv.f51873d.m9906e(i);
                        if (rd9VarM9906e.f59128c != -1 || rd9VarM9906e.f59131f) {
                            arrayList.add(rd9VarM9906e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            rd9 rd9Var = (rd9) arrayList.get(i2);
                            if (rd9Var.f59131f) {
                                c3349mv.m17054h(this, rd9Var, true);
                            } else {
                                c3349mv.mo16327i(this, this.f40577g[rd9Var.f59128c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c3349mv.f51870a != null && c3349mv.f51873d.m9905d() == 0) {
                    c3349mv.f51874e = true;
                    this.f40572b = true;
                }
            }
            if (c3349mv.mo16326e()) {
                return;
            }
            float f = c3349mv.f51871b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c3349mv.f51871b = f * (-1.0f);
                C2904cv c2904cv = c3349mv.f51873d;
                int i3 = c2904cv.f34593h;
                for (int i4 = 0; i3 != -1 && i4 < c2904cv.f34586a; i4++) {
                    float[] fArr = c2904cv.f34592g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c2904cv.f34591f[i3];
                }
            }
            int iM9905d2 = c3349mv.f51873d.m9905d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            rd9 rd9Var2 = null;
            rd9 rd9Var3 = null;
            int i5 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (i5 < iM9905d2) {
                float fM9907f = c3349mv.f51873d.m9907f(i5);
                rd9 rd9VarM9906e2 = c3349mv.f51873d.m9906e(i5);
                float f5 = f2;
                if (rd9VarM9906e2.f59134i == SolverVariable$Type.UNRESTRICTED) {
                    if (rd9Var2 == null) {
                        if (rd9VarM9906e2.f59137l <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        rd9Var2 = rd9VarM9906e2;
                        f3 = fM9907f;
                    } else {
                        if (f3 > fM9907f) {
                            if (rd9VarM9906e2.f59137l > 1) {
                                z5 = false;
                            }
                            rd9Var2 = rd9VarM9906e2;
                            f3 = fM9907f;
                        } else if (z5 || rd9VarM9906e2.f59137l > 1) {
                        }
                        z5 = true;
                        rd9Var2 = rd9VarM9906e2;
                        f3 = fM9907f;
                    }
                } else if (rd9Var2 == null && fM9907f < f5) {
                    if (rd9Var3 == null) {
                        if (rd9VarM9906e2.f59137l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        rd9Var3 = rd9VarM9906e2;
                        f4 = fM9907f;
                    } else {
                        if (f4 > fM9907f) {
                            if (rd9VarM9906e2.f59137l > 1) {
                                z6 = false;
                            }
                            rd9Var3 = rd9VarM9906e2;
                            f4 = fM9907f;
                        } else if (z6 || rd9VarM9906e2.f59137l > 1) {
                        }
                        z6 = true;
                        rd9Var3 = rd9VarM9906e2;
                        f4 = fM9907f;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (rd9Var2 == null) {
                rd9Var2 = rd9Var3;
            }
            if (rd9Var2 == null) {
                z2 = true;
            } else {
                c3349mv.m17053g(rd9Var2);
                z2 = false;
            }
            if (c3349mv.f51873d.m9905d() == 0) {
                c3349mv.f51874e = true;
            }
            if (z2) {
                if (this.f40580j + 1 >= this.f40576f) {
                    m12498o();
                }
                rd9 rd9VarM12485a = m12485a(SolverVariable$Type.SLACK);
                int i6 = this.f40573c + 1;
                this.f40573c = i6;
                this.f40580j++;
                rd9VarM12485a.f59127b = i6;
                C3309ls c3309ls = this.f40583m;
                ((rd9[]) c3309ls.f50066d)[i6] = rd9VarM12485a;
                c3349mv.f51870a = rd9VarM12485a;
                int i7 = this.f40581k;
                m12492h(c3349mv);
                if (this.f40581k == i7 + 1) {
                    C3349mv c3349mv2 = this.f40586p;
                    c3349mv2.f51870a = null;
                    c3349mv2.f51873d.m9903b();
                    for (int i8 = 0; i8 < c3349mv.f51873d.m9905d(); i8++) {
                        c3349mv2.f51873d.m9902a(c3349mv.f51873d.m9906e(i8), c3349mv.f51873d.m9907f(i8), true);
                    }
                    m12501r(this.f40586p);
                    if (rd9VarM12485a.f59128c == -1) {
                        if (c3349mv.f51870a == rd9VarM12485a && (rd9VarM17052f = c3349mv.m17052f(null, rd9VarM12485a)) != null) {
                            c3349mv.m17053g(rd9VarM17052f);
                        }
                        if (!c3349mv.f51874e) {
                            c3349mv.f51870a.m20593e(this, c3349mv);
                        }
                        ((jh7) c3309ls.f50064b).m14459b(c3349mv);
                        this.f40581k--;
                    }
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            rd9 rd9Var4 = c3349mv.f51870a;
            if (rd9Var4 == null) {
                return;
            }
            if (rd9Var4.f59134i != SolverVariable$Type.UNRESTRICTED && c3349mv.f51871b < f6) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        m12492h(c3349mv);
    }

    /* JADX INFO: renamed from: d */
    public final void m12488d(rd9 rd9Var, int i) {
        int i2 = rd9Var.f59128c;
        if (i2 == -1) {
            rd9Var.m20592d(this, i);
            for (int i3 = 0; i3 < this.f40573c + 1; i3++) {
                rd9 rd9Var2 = ((rd9[]) this.f40583m.f50066d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C3349mv c3349mvM12496l = m12496l();
            c3349mvM12496l.f51870a = rd9Var;
            float f = i;
            rd9Var.f59130e = f;
            c3349mvM12496l.f51871b = f;
            c3349mvM12496l.f51874e = true;
            m12487c(c3349mvM12496l);
            return;
        }
        C3349mv c3349mv = this.f40577g[i2];
        if (c3349mv.f51874e) {
            c3349mv.f51871b = i;
            return;
        }
        if (c3349mv.f51873d.m9905d() == 0) {
            c3349mv.f51874e = true;
            c3349mv.f51871b = i;
            return;
        }
        C3349mv c3349mvM12496l2 = m12496l();
        if (i < 0) {
            c3349mvM12496l2.f51871b = i * (-1);
            c3349mvM12496l2.f51873d.m9908g(rd9Var, 1.0f);
        } else {
            c3349mvM12496l2.f51871b = i;
            c3349mvM12496l2.f51873d.m9908g(rd9Var, -1.0f);
        }
        m12487c(c3349mvM12496l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m12489e(rd9 rd9Var, rd9 rd9Var2, int i, int i2) {
        if (i2 == 8 && rd9Var2.f59131f && rd9Var.f59128c == -1) {
            rd9Var.m20592d(this, rd9Var2.f59130e + i);
            return;
        }
        C3349mv c3349mvM12496l = m12496l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c3349mvM12496l.f51871b = i;
        }
        C2904cv c2904cv = c3349mvM12496l.f51873d;
        if (z) {
            c2904cv.m9908g(rd9Var, 1.0f);
            c3349mvM12496l.f51873d.m9908g(rd9Var2, -1.0f);
        } else {
            c2904cv.m9908g(rd9Var, -1.0f);
            c3349mvM12496l.f51873d.m9908g(rd9Var2, 1.0f);
        }
        if (i2 != 8) {
            c3349mvM12496l.m17049a(this, i2);
        }
        m12487c(c3349mvM12496l);
    }

    /* JADX INFO: renamed from: f */
    public final void m12490f(rd9 rd9Var, rd9 rd9Var2, int i, int i2) {
        C3349mv c3349mvM12496l = m12496l();
        rd9 rd9VarM12497m = m12497m();
        rd9VarM12497m.f59129d = 0;
        c3349mvM12496l.m17050b(rd9Var, rd9Var2, rd9VarM12497m, i);
        if (i2 != 8) {
            c3349mvM12496l.f51873d.m9908g(m12494j(i2), (int) (c3349mvM12496l.f51873d.m9904c(rd9VarM12497m) * (-1.0f)));
        }
        m12487c(c3349mvM12496l);
    }

    /* JADX INFO: renamed from: g */
    public final void m12491g(rd9 rd9Var, rd9 rd9Var2, int i, int i2) {
        C3349mv c3349mvM12496l = m12496l();
        rd9 rd9VarM12497m = m12497m();
        rd9VarM12497m.f59129d = 0;
        c3349mvM12496l.m17051c(rd9Var, rd9Var2, rd9VarM12497m, i);
        if (i2 != 8) {
            c3349mvM12496l.f51873d.m9908g(m12494j(i2), (int) (c3349mvM12496l.f51873d.m9904c(rd9VarM12497m) * (-1.0f)));
        }
        m12487c(c3349mvM12496l);
    }

    /* JADX INFO: renamed from: h */
    public final void m12492h(C3349mv c3349mv) {
        int i;
        if (c3349mv.f51874e) {
            c3349mv.f51870a.m20592d(this, c3349mv.f51871b);
        } else {
            C3349mv[] c3349mvArr = this.f40577g;
            int i2 = this.f40581k;
            c3349mvArr[i2] = c3349mv;
            rd9 rd9Var = c3349mv.f51870a;
            rd9Var.f59128c = i2;
            this.f40581k = i2 + 1;
            rd9Var.m20593e(this, c3349mv);
        }
        if (this.f40572b) {
            int i3 = 0;
            while (i3 < this.f40581k) {
                if (this.f40577g[i3] == null) {
                    System.out.println("WTF");
                }
                C3349mv c3349mv2 = this.f40577g[i3];
                if (c3349mv2 != null && c3349mv2.f51874e) {
                    c3349mv2.f51870a.m20592d(this, c3349mv2.f51871b);
                    ((jh7) this.f40583m.f50064b).m14459b(c3349mv2);
                    this.f40577g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f40581k;
                        if (i4 >= i) {
                            break;
                        }
                        C3349mv[] c3349mvArr2 = this.f40577g;
                        int i6 = i4 - 1;
                        C3349mv c3349mv3 = c3349mvArr2[i4];
                        c3349mvArr2[i6] = c3349mv3;
                        rd9 rd9Var2 = c3349mv3.f51870a;
                        if (rd9Var2.f59128c == i4) {
                            rd9Var2.f59128c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f40577g[i5] = null;
                    }
                    this.f40581k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f40572b = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12493i() {
        for (int i = 0; i < this.f40581k; i++) {
            C3349mv c3349mv = this.f40577g[i];
            c3349mv.f51870a.f59130e = c3349mv.f51871b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final rd9 m12494j(int i) {
        if (this.f40580j + 1 >= this.f40576f) {
            m12498o();
        }
        rd9 rd9VarM12485a = m12485a(SolverVariable$Type.ERROR);
        float[] fArr = rd9VarM12485a.f59133h;
        int i2 = this.f40573c + 1;
        this.f40573c = i2;
        this.f40580j++;
        rd9VarM12485a.f59127b = i2;
        rd9VarM12485a.f59129d = i;
        ((rd9[]) this.f40583m.f50066d)[i2] = rd9VarM12485a;
        lk7 lk7Var = this.f40574d;
        lk7Var.f49776h.f39590b = rd9VarM12485a;
        Arrays.fill(fArr, 0.0f);
        fArr[rd9VarM12485a.f59129d] = 1.0f;
        lk7Var.m16328j(rd9VarM12485a);
        return rd9VarM12485a;
    }

    /* JADX INFO: renamed from: k */
    public final rd9 m12495k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f40580j + 1 >= this.f40576f) {
            m12498o();
        }
        if (!(obj instanceof bj1)) {
            return null;
        }
        bj1 bj1Var = (bj1) obj;
        rd9 rd9Var = bj1Var.f8585i;
        if (rd9Var == null) {
            bj1Var.m3767k();
            rd9Var = bj1Var.f8585i;
        }
        int i = rd9Var.f59127b;
        C3309ls c3309ls = this.f40583m;
        if (i != -1 && i <= this.f40573c && ((rd9[]) c3309ls.f50066d)[i] != null) {
            return rd9Var;
        }
        if (i != -1) {
            rd9Var.m20591c();
        }
        int i2 = this.f40573c + 1;
        this.f40573c = i2;
        this.f40580j++;
        rd9Var.f59127b = i2;
        rd9Var.f59134i = SolverVariable$Type.UNRESTRICTED;
        ((rd9[]) c3309ls.f50066d)[i2] = rd9Var;
        return rd9Var;
    }

    /* JADX INFO: renamed from: l */
    public final C3349mv m12496l() {
        Object obj;
        C3309ls c3309ls = this.f40583m;
        jh7 jh7Var = (jh7) c3309ls.f50064b;
        int i = jh7Var.f45550b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = jh7Var.f45549a;
            obj = objArr[i2];
            objArr[i2] = null;
            jh7Var.f45550b = i2;
        } else {
            obj = null;
        }
        C3349mv c3349mv = (C3349mv) obj;
        if (c3349mv == null) {
            return new C3349mv(c3309ls);
        }
        c3349mv.f51870a = null;
        c3349mv.f51873d.m9903b();
        c3349mv.f51871b = 0.0f;
        c3349mv.f51874e = false;
        return c3349mv;
    }

    /* JADX INFO: renamed from: m */
    public final rd9 m12497m() {
        if (this.f40580j + 1 >= this.f40576f) {
            m12498o();
        }
        rd9 rd9VarM12485a = m12485a(SolverVariable$Type.SLACK);
        int i = this.f40573c + 1;
        this.f40573c = i;
        this.f40580j++;
        rd9VarM12485a.f59127b = i;
        ((rd9[]) this.f40583m.f50066d)[i] = rd9VarM12485a;
        return rd9VarM12485a;
    }

    /* JADX INFO: renamed from: o */
    public final void m12498o() {
        int i = this.f40575e * 2;
        this.f40575e = i;
        this.f40577g = (C3349mv[]) Arrays.copyOf(this.f40577g, i);
        C3309ls c3309ls = this.f40583m;
        c3309ls.f50066d = (rd9[]) Arrays.copyOf((rd9[]) c3309ls.f50066d, this.f40575e);
        int i2 = this.f40575e;
        this.f40579i = new boolean[i2];
        this.f40576f = i2;
        this.f40582l = i2;
    }

    /* JADX INFO: renamed from: p */
    public final void m12499p() {
        lk7 lk7Var = this.f40574d;
        if (lk7Var.mo16326e()) {
            m12493i();
            return;
        }
        if (!this.f40578h) {
            m12500q(lk7Var);
            return;
        }
        for (int i = 0; i < this.f40581k; i++) {
            if (!this.f40577g[i].f51874e) {
                m12500q(lk7Var);
                return;
            }
        }
        m12493i();
    }

    /* JADX INFO: renamed from: q */
    public final void m12500q(lk7 lk7Var) {
        for (int i = 0; i < this.f40581k; i++) {
            C3349mv c3349mv = this.f40577g[i];
            if (c3349mv.f51870a.f59134i != SolverVariable$Type.UNRESTRICTED) {
                float f = 0.0f;
                if (c3349mv.f51871b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f40581k) {
                            C3349mv c3349mv2 = this.f40577g[i5];
                            if (c3349mv2.f51870a.f59134i != SolverVariable$Type.UNRESTRICTED && !c3349mv2.f51874e && c3349mv2.f51871b < f) {
                                int iM9905d = c3349mv2.f51873d.m9905d();
                                int i7 = 0;
                                while (i7 < iM9905d) {
                                    rd9 rd9VarM9906e = c3349mv2.f51873d.m9906e(i7);
                                    float fM9904c = c3349mv2.f51873d.m9904c(rd9VarM9906e);
                                    if (fM9904c > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = rd9VarM9906e.f59132g[i8] / fM9904c;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = rd9VarM9906e.f59127b;
                                                i3 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            C3349mv c3349mv3 = this.f40577g[i3];
                            c3349mv3.f51870a.f59128c = -1;
                            c3349mv3.m17053g(((rd9[]) this.f40583m.f50066d)[i4]);
                            rd9 rd9Var = c3349mv3.f51870a;
                            rd9Var.f59128c = i3;
                            rd9Var.m20593e(this, c3349mv3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f40580j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        m12501r(lk7Var);
        m12493i();
    }

    /* JADX INFO: renamed from: r */
    public final void m12501r(C3349mv c3349mv) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f40580j; i2++) {
            this.f40579i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f40580j * 2) {
                return;
            }
            rd9 rd9Var = c3349mv.f51870a;
            if (rd9Var != null) {
                this.f40579i[rd9Var.f59127b] = true;
            }
            rd9 rd9VarMo16325d = c3349mv.mo16325d(this.f40579i);
            if (rd9VarMo16325d != null) {
                boolean[] zArr = this.f40579i;
                int i4 = rd9VarMo16325d.f59127b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (rd9VarMo16325d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.f40581k) {
                    C3349mv c3349mv2 = this.f40577g[i5];
                    if (c3349mv2.f51870a.f59134i != SolverVariable$Type.UNRESTRICTED && !c3349mv2.f51874e) {
                        C2904cv c2904cv = c3349mv2.f51873d;
                        int i7 = c2904cv.f34593h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= c2904cv.f34586a) {
                                z = false;
                                break;
                            } else if (c2904cv.f34590e[i7] == rd9VarMo16325d.f59127b) {
                                z = true;
                                break;
                            } else {
                                i7 = c2904cv.f34591f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fM9904c = c3349mv2.f51873d.m9904c(rd9VarMo16325d);
                            if (fM9904c < 0.0f) {
                                float f2 = (-c3349mv2.f51871b) / fM9904c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    C3349mv c3349mv3 = this.f40577g[i6];
                    c3349mv3.f51870a.f59128c = -1;
                    c3349mv3.m17053g(rd9VarMo16325d);
                    rd9 rd9Var2 = c3349mv3.f51870a;
                    rd9Var2.f59128c = i6;
                    rd9Var2.m20593e(this, c3349mv3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12502s() {
        for (int i = 0; i < this.f40581k; i++) {
            C3349mv c3349mv = this.f40577g[i];
            if (c3349mv != null) {
                ((jh7) this.f40583m.f50064b).m14459b(c3349mv);
            }
            this.f40577g[i] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12503t() {
        C3309ls c3309ls;
        int i = 0;
        while (true) {
            c3309ls = this.f40583m;
            rd9[] rd9VarArr = (rd9[]) c3309ls.f50066d;
            if (i >= rd9VarArr.length) {
                break;
            }
            rd9 rd9Var = rd9VarArr[i];
            if (rd9Var != null) {
                rd9Var.m20591c();
            }
            i++;
        }
        jh7 jh7Var = (jh7) c3309ls.f50065c;
        rd9[] rd9VarArr2 = this.f40584n;
        int length = this.f40585o;
        jh7Var.getClass();
        if (length > rd9VarArr2.length) {
            length = rd9VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            rd9 rd9Var2 = rd9VarArr2[i2];
            int i3 = jh7Var.f45550b;
            Object[] objArr = jh7Var.f45549a;
            if (i3 < objArr.length) {
                objArr[i3] = rd9Var2;
                jh7Var.f45550b = i3 + 1;
            }
        }
        this.f40585o = 0;
        Arrays.fill((rd9[]) c3309ls.f50066d, (Object) null);
        this.f40573c = 0;
        lk7 lk7Var = this.f40574d;
        lk7Var.f49775g = 0;
        lk7Var.f51871b = 0.0f;
        this.f40580j = 1;
        for (int i4 = 0; i4 < this.f40581k; i4++) {
            C3349mv c3349mv = this.f40577g[i4];
        }
        m12502s();
        this.f40581k = 0;
        this.f40586p = new C3349mv(c3309ls);
    }
}
