package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zm2 implements ph7 {

    /* JADX INFO: renamed from: H */
    public final C3683vf f71747H;

    /* JADX INFO: renamed from: I */
    public final p4b f71748I;

    /* JADX INFO: renamed from: J */
    public final p4b f71749J;

    /* JADX INFO: renamed from: a */
    public final t66 f71750a;

    /* JADX INFO: renamed from: b */
    public final long f71751b;

    /* JADX INFO: renamed from: c */
    public final fb2 f71752c;

    /* JADX INFO: renamed from: d */
    public final x24 f71753d;

    /* JADX INFO: renamed from: e */
    public final int f71754e;

    /* JADX INFO: renamed from: f */
    public final C0812bj f71755f;

    /* JADX INFO: renamed from: g */
    public final C3646uf f71756g;

    /* JADX INFO: renamed from: h */
    public final C3646uf f71757h;

    /* JADX INFO: renamed from: i */
    public final o4b f71758i;

    /* JADX INFO: renamed from: j */
    public final o4b f71759j;

    /* JADX INFO: renamed from: k */
    public final C3683vf f71760k;

    /* JADX INFO: renamed from: l */
    public final C3683vf f71761l;

    public zm2(t66 t66Var, long j, fb2 fb2Var, C0812bj c0812bj) {
        x24 x24Var = x24.f67674c;
        float f = tw5.f63010a;
        int iMo916w0 = fb2Var.mo916w0(48.0f);
        this.f71750a = t66Var;
        this.f71751b = j;
        this.f71752c = fb2Var;
        this.f71753d = x24Var;
        this.f71754e = iMo916w0;
        this.f71755f = c0812bj;
        int iMo916w1 = fb2Var.mo916w0(ak2.m524a(j));
        ec0 ec0Var = nj0.f52791J;
        this.f71756g = new C3646uf(ec0Var, ec0Var, iMo916w1);
        ec0 ec0Var2 = nj0.f52793L;
        new C3646uf(ec0Var2, ec0Var, iMo916w1);
        this.f71757h = new C3646uf(ec0Var2, ec0Var2, iMo916w1);
        new C3646uf(ec0Var, ec0Var2, iMo916w1);
        this.f71758i = new o4b(AbstractC3184kh.f47262d);
        this.f71759j = new o4b(AbstractC3184kh.f47263e);
        int iMo916w2 = fb2Var.mo916w0(ak2.m525b(j));
        fc0 fc0Var = nj0.f52817l;
        fc0 fc0Var2 = nj0.f52790I;
        this.f71760k = new C3683vf(fc0Var, fc0Var2, iMo916w2);
        new C3683vf(fc0Var, fc0Var, iMo916w2);
        this.f71761l = new C3683vf(fc0Var2, fc0Var, iMo916w2);
        new C3683vf(fc0Var2, fc0Var2, iMo916w2);
        this.f71747H = new C3683vf(nj0.f52789H, fc0Var, iMo916w2);
        this.f71748I = new p4b(fc0Var, iMo916w0);
        this.f71749J = new p4b(fc0Var2, iMo916w0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zm2) {
            zm2 zm2Var = (zm2) obj;
            if (fa4.m11650l(this.f71750a, zm2Var.f71750a) && this.f71751b == zm2Var.f71751b && fa4.m11650l(this.f71752c, zm2Var.f71752c) && fa4.m11650l(this.f71753d, zm2Var.f71753d) && this.f71754e == zm2Var.f71754e && fa4.m11650l(this.f71755f, zm2Var.f71755f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public final long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f71753d == null) {
            gm5.m12750e();
            return 0L;
        }
        char c = ' ';
        int i5 = (int) (j >> 32);
        char c2 = 3;
        char c3 = 2;
        List listM23605K = vz1.m23605K(this.f71756g, this.f71757h, ((int) (j84Var.m14321a() >> 32)) < i5 / 2 ? this.f71758i : this.f71759j);
        int i6 = (int) (j & 4294967295L);
        List listM23605K2 = vz1.m23605K(this.f71760k, this.f71761l, this.f71747H, ((int) (j84Var.m14321a() & 4294967295L)) < i6 / 2 ? this.f71748I : this.f71749J);
        int size = listM23605K.size();
        int[] iArr = size == 0 ? m84.f50750a : new int[size];
        int size2 = listM23605K.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size2) {
            char c4 = c;
            int i9 = i5;
            List list = listM23605K;
            List list2 = listM23605K2;
            int i10 = size2;
            int i11 = i7;
            char c5 = c2;
            int[] iArrCopyOf = iArr;
            int i12 = i6;
            int iMo4220a = ((bx5) listM23605K.get(i7)).mo4220a(j84Var, j, (int) (j2 >> c4), layoutDirection);
            int i13 = i8 + 1;
            if (iArrCopyOf.length < i13) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
            }
            iArrCopyOf[i8] = iMo4220a;
            i8++;
            i7 = i11 + 1;
            listM23605K = list;
            i6 = i12;
            listM23605K2 = list2;
            iArr = iArrCopyOf;
            c = c4;
            i5 = i9;
            size2 = i10;
            c2 = c5;
        }
        char c6 = c;
        int i14 = i5;
        List list3 = listM23605K2;
        int[] iArr2 = iArr;
        int i15 = i6;
        int size3 = list3.size();
        int[] iArrCopyOf2 = size3 == 0 ? m84.f50750a : new int[size3];
        int size4 = list3.size();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size4) {
            char c7 = c3;
            int i18 = size4;
            int i19 = i16;
            int iMo9918a = ((cx5) list3.get(i16)).mo9918a(j84Var, j, (int) (j2 & 4294967295L));
            int i20 = i17 + 1;
            if (iArrCopyOf2.length < i20) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i20, (iArrCopyOf2.length * 3) / 2));
            }
            iArrCopyOf2[i17] = iMo9918a;
            i17++;
            i16 = i19 + 1;
            size4 = i18;
            c3 = c7;
        }
        i84 i84VarM15922M = l70.m15922M(0, i8);
        int i21 = i84VarM15922M.f40379a;
        int i22 = i84VarM15922M.f40380b;
        if (i21 > i22) {
            i = 0;
            break;
        }
        while (true) {
            if (i21 >= 0 && i21 < i8) {
                i = iArr2[i21];
                if (i21 != i8 - 1) {
                    if (i >= 0) {
                        i4 = i14;
                        if (((int) (j2 >> c6)) + i > i4) {
                            break;
                        }
                        break;
                    }
                    i4 = i14;
                    if (i21 == i22) {
                        i = 0;
                        break;
                    }
                    i21++;
                    i14 = i4;
                } else {
                    break;
                }
            } else {
                v63.m23143u("Index must be between 0 and size");
                return 0L;
            }
        }
        i84 i84VarM15922M2 = l70.m15922M(0, i17);
        int i23 = i84VarM15922M2.f40379a;
        int i24 = i84VarM15922M2.f40380b;
        if (i23 <= i24) {
            while (true) {
                if (i23 >= 0 && i23 < i17) {
                    int i25 = iArrCopyOf2[i23];
                    if (i23 != i17 - 1 && (i25 < (i3 = this.f71754e) || ((int) (j2 & 4294967295L)) + i25 > i15 - i3)) {
                        if (i23 == i24) {
                            break;
                        }
                        i23++;
                    } else {
                        i2 = i25;
                    }
                } else {
                    v63.m23143u("Index must be between 0 and size");
                    return 0L;
                }
            }
            i2 = 0;
        } else {
            i2 = 0;
        }
        long j3 = (((long) i) << c6) | (((long) i2) & 4294967295L);
        this.f71755f.invoke(j84Var, xwc.m24756b(j3, j2));
        return j3;
    }

    public final int hashCode() {
        return this.f71755f.hashCode() + wq1.m24106b(0, wq1.m24106b(this.f71754e, (this.f71753d.hashCode() + ((this.f71752c.hashCode() + ux5.m22981d(this.f71751b, this.f71750a.hashCode() * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(transformOriginState=" + this.f71750a + ", contentOffset=" + ((Object) ak2.m526c(this.f71751b)) + ", density=" + this.f71752c + ", dropdownMenuAnchorPosition=" + this.f71753d + ", verticalMargin=" + this.f71754e + ", horizontalMargin=0, onPositionCalculated=" + this.f71755f + ')';
    }
}
