package p000;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class e93 implements p46, oj8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3624tu f36870a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3735wu f36871b;

    /* JADX INFO: renamed from: c */
    public final float f36872c;

    /* JADX INFO: renamed from: d */
    public final tr1 f36873d;

    /* JADX INFO: renamed from: e */
    public final float f36874e;

    /* JADX INFO: renamed from: f */
    public final int f36875f;

    /* JADX INFO: renamed from: g */
    public final c93 f36876g;

    public e93(InterfaceC3624tu interfaceC3624tu, InterfaceC3735wu interfaceC3735wu, float f, tr1 tr1Var, float f2, int i, c93 c93Var) {
        this.f36870a = interfaceC3624tu;
        this.f36871b = interfaceC3735wu;
        this.f36872c = f;
        this.f36873d = tr1Var;
        this.f36874e = f2;
        this.f36875f = i;
        this.f36876g = c93Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static int m10948k(List list, int i, int i2, int i3, int i4, c93 c93Var) {
        long jM25484a;
        int i5 = 0;
        if (list.isEmpty()) {
            jM25484a = z74.m25484a(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            x83 x83Var = new x83(i4, c93Var, dk1.m10423a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            ct5 ct5Var = (ct5) u91.m22592J0(0, list);
            int iMo1510U = ct5Var != null ? ct5Var.mo1510U(i) : 0;
            int iMo1512l = ct5Var != null ? ct5Var.mo1512l(iMo1510U) : 0;
            int i7 = 0;
            if (x83Var.m24402b(list.size() > 1, 0, z74.m25484a(i, Integer.MAX_VALUE), ct5Var == null ? null : new z74(z74.m25484a(iMo1512l, iMo1510U)), 0, 0, 0, false, false).f66512b) {
                z74 z74VarM4405a = c93Var.m4405a(0, 0, ct5Var != null);
                jM25484a = z74.m25484a(z74VarM4405a != null ? (int) (z74VarM4405a.f71017a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i9 < size) {
                    int i14 = i8 - iMo1512l;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iMo1510U);
                    ct5 ct5Var2 = (ct5) u91.m22592J0(i15, list);
                    int iMo1510U2 = ct5Var2 != null ? ct5Var2.mo1510U(i) : i5;
                    int iMo1512l2 = ct5Var2 != null ? ct5Var2.mo1512l(iMo1510U2) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z = i9 + 2 < list.size() ? 1 : i5;
                    int i17 = i12;
                    int i18 = iMo1510U2;
                    int i19 = iMo1512l2;
                    w83 w83VarM24402b = x83Var.m24402b(z, i16, z74.m25484a(i14, i6), ct5Var2 == null ? null : new z74(z74.m25484a(iMo1512l2, iMo1510U2)), i17, i7, iMax, false, false);
                    if (w83VarM24402b.f66511a) {
                        int i20 = iMax + i3 + i7;
                        up2 up2VarM24401a = x83Var.m24401a(w83VarM24402b, ct5Var2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (w83VarM24402b.f66512b) {
                            if (up2VarM24401a != null) {
                                long j = up2VarM24401a.f64164a;
                                if (!up2VarM24401a.f64165b) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                            break;
                        }
                        i11 = i15;
                        i7 = i20;
                        iMo1512l = i21;
                        i13 = 0;
                        i8 = i;
                    } else {
                        iMo1512l = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iMo1510U = i18;
                    i6 = Integer.MAX_VALUE;
                    i5 = 0;
                }
                jM25484a = z74.m25484a(i7 - i3, i10);
            }
        }
        return (int) (jM25484a >> 32);
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: a */
    public final int mo1203a(aa4 aa4Var, List list, int i) {
        List list2 = (List) u91.m22592J0(1, list);
        ct5 ct5Var = list2 != null ? (ct5) u91.m22591I0(list2) : null;
        List list3 = (List) u91.m22592J0(2, list);
        this.f36876g.m4406b(ct5Var, list3 != null ? (ct5) u91.m22591I0(list3) : null, dk1.m10424b(0, 0, 0, i, 7));
        List list4 = (List) u91.m22591I0(list);
        if (list4 == null) {
            list4 = EmptyList.f47638a;
        }
        int iMo916w0 = aa4Var.mo916w0(this.f36872c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMo1513p = ((ct5) list4.get(i2)).mo1513p(i) + iMo916w0;
            int i5 = i2 + 1;
            if (i5 - i3 == this.f36875f || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMo1513p) - iMo916w0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iMo1513p;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.p46
    /* JADX INFO: renamed from: b */
    public final it5 mo1204b(jt5 jt5Var, List list, long j) {
        ct5 ct5Var;
        ct5 ct5Var2;
        z74 z74Var;
        w83 w83Var;
        up2 up2VarM24401a;
        int i;
        int i2;
        char c;
        ct5 ct5Var3;
        ct5 ct5Var4;
        z74 z74Var2;
        z74 z74Var3;
        w83 w83Var2;
        long jM25484a;
        long jM25484a2;
        if (this.f36875f != 0 && !((ArrayList) list).isEmpty()) {
            int iM3800h = bk1.m3800h(j);
            c93 c93Var = this.f36876g;
            if (iM3800h != 0 || c93Var.f9754a == FlowLayoutOverflow$OverflowType.Visible) {
                List list2 = (List) u91.m22589G0(list);
                if (list2.isEmpty()) {
                    return jt5Var.mo9895M0(0, 0, AbstractC3194a.m15360M(), new C2951e4(29));
                }
                boolean z = true;
                List list3 = (List) u91.m22592J0(1, list);
                ct5 ct5Var5 = list3 != null ? (ct5) u91.m22591I0(list3) : null;
                List list4 = (List) u91.m22592J0(2, list);
                ct5 ct5Var6 = list4 != null ? (ct5) u91.m22591I0(list4) : null;
                list2.size();
                c93Var.getClass();
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                long jM4712Y = ci8.m4712Y(ci8.m4729n(10, ci8.m4728m(j, layoutOrientation)), layoutOrientation);
                float f = 0.0f;
                if (ct5Var5 != null) {
                    if (AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var5)) == 0.0f) {
                        AbstractC3184kh.m15225s(ct5Var5);
                        l87 l87VarMo1514r = ct5Var5.mo1514r(jM4712Y);
                        c93Var.f9759f = new z74(z74.m25484a(l87VarMo1514r.mo1642b0(), l87VarMo1514r.mo1640a0()));
                        c93Var.f9756c = l87VarMo1514r;
                        l87VarMo1514r.mo1642b0();
                        l87VarMo1514r.mo1640a0();
                    } else {
                        ct5Var5.mo1510U(ct5Var5.mo1512l(Integer.MAX_VALUE));
                    }
                    c93Var.f9755b = ct5Var5;
                } else {
                    f = 0.0f;
                    z = true;
                }
                if (ct5Var6 != null) {
                    if (AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var6)) == f) {
                        AbstractC3184kh.m15225s(ct5Var6);
                        l87 l87VarMo1514r2 = ct5Var6.mo1514r(jM4712Y);
                        c93Var.f9760g = new z74(z74.m25484a(l87VarMo1514r2.mo1642b0(), l87VarMo1514r2.mo1640a0()));
                        c93Var.f9758e = l87VarMo1514r2;
                        l87VarMo1514r2.mo1642b0();
                        l87VarMo1514r2.mo1640a0();
                    } else {
                        ct5Var6.mo1510U(ct5Var6.mo1512l(Integer.MAX_VALUE));
                    }
                    c93Var.f9757d = ct5Var6;
                }
                Iterator it = list2.iterator();
                long jM4728m = ci8.m4728m(j, layoutOrientation);
                x66 x66Var = new x66(new it5[16]);
                int iM3801i = bk1.m3801i(jM4728m);
                int iM3803k = bk1.m3803k(jM4728m);
                int iM3800h2 = bk1.m3800h(jM4728m);
                t56 t56Var = e84.f36837a;
                t56 t56Var2 = new t56();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(jt5Var.mo912g0(this.f36872c));
                int iCeil2 = (int) Math.ceil(jt5Var.mo912g0(this.f36874e));
                long jM10423a = dk1.m10423a(0, iM3801i, 0, iM3800h2);
                long jM4712Y2 = ci8.m4712Y(ci8.m4729n(14, jM10423a), layoutOrientation);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (it.hasNext()) {
                    try {
                        ct5Var = (ct5) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        ct5Var = null;
                    }
                    ct5Var2 = ct5Var;
                } else {
                    ct5Var2 = null;
                }
                if (ct5Var2 != null) {
                    if (AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var2)) == f) {
                        AbstractC3184kh.m15225s(ct5Var2);
                        l87 l87VarMo1514r3 = ct5Var2.mo1514r(jM4712Y2);
                        ref$ObjectRef.f47718a = l87VarMo1514r3;
                        jM25484a2 = z74.m25484a(l87VarMo1514r3.mo1642b0(), l87VarMo1514r3.mo1640a0());
                    } else {
                        int iMo1512l = ct5Var2.mo1512l(Integer.MAX_VALUE);
                        jM25484a2 = z74.m25484a(iMo1512l, ct5Var2.mo1510U(iMo1512l));
                    }
                    z74Var = new z74(jM25484a2);
                } else {
                    it = it;
                    iM3803k = iM3803k;
                    z74Var = null;
                }
                Integer numValueOf = z74Var != null ? Integer.valueOf((int) (z74Var.f71017a >> 32)) : null;
                Integer numValueOf2 = z74Var != null ? Integer.valueOf((int) (z74Var.f71017a & 4294967295L)) : null;
                s56 s56Var = new s56();
                s56 s56Var2 = new s56();
                Integer num = numValueOf;
                u56 u56Var = new u56();
                z74 z74Var4 = z74Var;
                int i3 = this.f36875f;
                c93 c93Var2 = this.f36876g;
                x83 x83Var = new x83(i3, c93Var2, jM4728m, iCeil, iCeil2);
                w83 w83VarM24402b = x83Var.m24402b(it.hasNext(), 0, z74.m25484a(iM3801i, iM3800h2), z74Var4, 0, 0, 0, false, false);
                int i4 = iCeil;
                if (w83VarM24402b.f66512b) {
                    w83Var = w83VarM24402b;
                    up2VarM24401a = x83Var.m24401a(w83Var, z74Var4 != null ? z : false, -1, 0, iM3801i, 0);
                } else {
                    w83Var = w83VarM24402b;
                    up2VarM24401a = null;
                }
                up2 up2Var = up2VarM24401a;
                int i5 = iM3801i;
                w83 w83Var3 = w83Var;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                Integer num2 = numValueOf2;
                ct5 ct5Var7 = ct5Var2;
                int iMax = iM3803k;
                int i11 = iM3800h2;
                int i12 = 0;
                while (!w83Var3.f66512b && ct5Var7 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    num2.getClass();
                    u56 u56Var2 = u56Var;
                    int i13 = i7 + iIntValue;
                    int iMax2 = Math.max(i6, num2.intValue());
                    int i14 = i5 - iIntValue;
                    int i15 = i12 + 1;
                    c93Var2.getClass();
                    arrayList.add(ct5Var7);
                    t56Var2.m21850i(i12, ref$ObjectRef.f47718a);
                    ct5Var7.mo1509A();
                    int i16 = i15 - i8;
                    if (it.hasNext()) {
                        try {
                            ct5Var3 = (ct5) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            ct5Var3 = null;
                        }
                        ct5Var4 = ct5Var3;
                    } else {
                        ct5Var4 = null;
                    }
                    ref$ObjectRef.f47718a = null;
                    if (ct5Var4 != null) {
                        if (AbstractC3184kh.m15227v(AbstractC3184kh.m15225s(ct5Var4)) == f) {
                            AbstractC3184kh.m15225s(ct5Var4);
                            l87 l87VarMo1514r4 = ct5Var4.mo1514r(jM4712Y2);
                            ref$ObjectRef.f47718a = l87VarMo1514r4;
                            jM25484a = z74.m25484a(l87VarMo1514r4.mo1642b0(), l87VarMo1514r4.mo1640a0());
                        } else {
                            int iMo1512l2 = ct5Var4.mo1512l(Integer.MAX_VALUE);
                            jM25484a = z74.m25484a(iMo1512l2, ct5Var4.mo1510U(iMo1512l2));
                        }
                        z74Var2 = new z74(jM25484a);
                    } else {
                        ref$ObjectRef = ref$ObjectRef;
                        z74Var2 = null;
                    }
                    Integer numValueOf3 = z74Var2 != null ? Integer.valueOf(((int) (z74Var2.f71017a >> 32)) + i4) : null;
                    Integer numValueOf4 = z74Var2 != null ? Integer.valueOf((int) (z74Var2.f71017a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jM25484a3 = z74.m25484a(i14, i11);
                    if (z74Var2 == null) {
                        z74Var3 = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue2 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        z74Var3 = new z74(z74.m25484a(iIntValue2, numValueOf4.intValue()));
                    }
                    w83 w83VarM24402b2 = x83Var.m24402b(zHasNext, i16, jM25484a3, z74Var3, i9, i10, iMax2, false, false);
                    int i17 = iMax2;
                    if (w83VarM24402b2.f66511a) {
                        int iMin = Math.min(Math.max(iMax, i13), iM3801i);
                        int i18 = i10 + i17;
                        w83Var2 = w83VarM24402b2;
                        x83 x83Var2 = x83Var;
                        up2 up2VarM24401a2 = x83Var2.m24401a(w83Var2, z74Var2 != null ? z : false, i9, i18, i14, i16);
                        x83Var = x83Var2;
                        s56Var2.m21101a(i17);
                        i11 = (iM3800h2 - i18) - iCeil2;
                        s56Var.m21101a(i15);
                        i9++;
                        i14 = iM3801i;
                        numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i4) : null;
                        i8 = i15;
                        i10 = i18 + iCeil2;
                        i17 = 0;
                        i13 = 0;
                        iMax = iMin;
                        up2Var = up2VarM24401a2;
                    } else {
                        w83Var2 = w83VarM24402b2;
                    }
                    int i19 = i17;
                    i12 = i15;
                    i6 = i19;
                    ct5Var7 = ct5Var4;
                    ref$ObjectRef = ref$ObjectRef;
                    w83Var3 = w83Var2;
                    i5 = i14;
                    num2 = numValueOf4;
                    i7 = i13;
                    u56Var = u56Var2;
                    num = numValueOf3;
                }
                u56 u56Var3 = u56Var;
                if (up2Var != null) {
                    long j2 = up2Var.f64164a;
                    arrayList.add((ct5) up2Var.f64166c);
                    t56Var2.m21850i(arrayList.size() - 1, (l87) up2Var.f64167d);
                    int i20 = s56Var.f60382b - 1;
                    if (up2Var.f64165b) {
                        s56Var2.m21106f(i20, Math.max(s56Var2.m21103c(i20), (int) (j2 & 4294967295L)));
                        s56Var.m21106f(i20, s56Var.m21104d() + 1);
                    } else {
                        s56Var2.m21101a((int) (j2 & 4294967295L));
                        s56Var.m21101a(s56Var.m21104d() + 1);
                    }
                }
                int size = arrayList.size();
                l87[] l87VarArr = new l87[size];
                for (int i21 = 0; i21 < size; i21++) {
                    l87VarArr[i21] = t56Var2.m10152b(i21);
                }
                int i22 = s56Var.f60382b;
                int[] iArr = new int[i22];
                int[] iArr2 = new int[i22];
                int[] iArr3 = s56Var.f60381a;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    i = iMax;
                    if (i24 >= i22) {
                        break;
                    }
                    int i26 = iArr3[i24];
                    int iM21103c = s56Var2.m21103c(i24);
                    u56 u56Var4 = u56Var3;
                    if (u56Var4.m22476c(i24)) {
                        c = 65535;
                    } else {
                        c = 65535;
                        iM21103c = bk1.m3800h(jM10423a) == Integer.MAX_VALUE ? Integer.MAX_VALUE : bk1.m3800h(jM10423a) - i25;
                    }
                    u56Var3 = u56Var4;
                    int i27 = i4;
                    it5 it5VarM18234S = AbstractC3423or.m18234S(this, i, bk1.m3802j(jM10423a), bk1.m3801i(jM10423a), iM21103c, i27, jt5Var, arrayList, l87VarArr, i23, i26, iArr, i24);
                    int iMo10626d = it5VarM18234S.mo10626d();
                    int iMo10623a = it5VarM18234S.mo10623a();
                    iArr2[i24] = iMo10623a;
                    i25 += iMo10623a;
                    iMax = Math.max(i, iMo10626d);
                    x66Var.m24305c(it5VarM18234S);
                    i24++;
                    i4 = i27;
                    i23 = i26;
                    iArr3 = iArr3;
                }
                if (x66Var.f67832c == 0) {
                    i2 = 0;
                    i25 = 0;
                } else {
                    i2 = i;
                }
                InterfaceC3735wu interfaceC3735wu = this.f36871b;
                int iMo916w0 = ((x66Var.f67832c - 1) * jt5Var.mo916w0(interfaceC3735wu.m24157a())) + i25;
                int iM3802j = bk1.m3802j(jM4728m);
                int iM3800h3 = bk1.m3800h(jM4728m);
                if (iMo916w0 < iM3802j) {
                    iMo916w0 = iM3802j;
                }
                if (iMo916w0 <= iM3800h3) {
                    iM3800h3 = iMo916w0;
                }
                interfaceC3735wu.mo10843k(jt5Var, iM3800h3, iArr2, iArr);
                int iM3803k2 = bk1.m3803k(jM4728m);
                int iM3801i2 = bk1.m3801i(jM4728m);
                if (i2 < iM3803k2) {
                    i2 = iM3803k2;
                }
                if (i2 <= iM3801i2) {
                    iM3801i2 = i2;
                }
                return jt5Var.mo9895M0(iM3801i2, iM3800h3, AbstractC3194a.m15360M(), new C0011a9(x66Var, 17));
            }
        }
        return jt5Var.mo9895M0(0, 0, AbstractC3194a.m15360M(), new C2951e4(29));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.p46
    /* JADX INFO: renamed from: c */
    public final int mo1205c(aa4 aa4Var, List list, int i) {
        int i2;
        int i3;
        long jM25484a;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType;
        this = this;
        int i4 = 1;
        List list2 = (List) u91.m22592J0(1, list);
        ct5 ct5Var = list2 != null ? (ct5) u91.m22591I0(list2) : null;
        List list3 = (List) u91.m22592J0(2, list);
        int i5 = 0;
        this.f36876g.m4406b(ct5Var, list3 != null ? (ct5) u91.m22591I0(list3) : null, dk1.m10424b(0, 0, 0, i, 7));
        List list4 = (List) u91.m22591I0(list);
        if (list4 == null) {
            list4 = EmptyList.f47638a;
        }
        int iMo916w0 = aa4Var.mo916w0(this.f36872c);
        int iMo916w1 = aa4Var.mo916w0(this.f36874e);
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        List list5 = list4;
        int size3 = list5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            ct5 ct5Var2 = (ct5) list4.get(i6);
            int iMo1512l = ct5Var2.mo1512l(i);
            iArr[i6] = iMo1512l;
            iArr2[i6] = ct5Var2.mo1510U(iMo1512l);
        }
        int size4 = list4.size();
        c93 c93Var = this.f36876g;
        int i7 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= size4 || !((flowLayoutOverflow$OverflowType = c93Var.f9754a) == FlowLayoutOverflow$OverflowType.ExpandIndicator || flowLayoutOverflow$OverflowType == FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list4.size()) {
                c93Var.getClass();
                i2 = c93Var.f9754a == FlowLayoutOverflow$OverflowType.ExpandOrCollapseIndicator ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i2, list4.size());
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += iArr[i9];
        }
        int size5 = ((list4.size() - 1) * iMo916w0) + i8;
        if (size2 == 0) {
            uk9.m22784s();
            return 0;
        }
        int i10 = iArr2[0];
        int i11 = size2 - 1;
        if (1 <= i11) {
            int i12 = 1;
            while (true) {
                int i13 = iArr2[i12];
                if (i10 < i13) {
                    i10 = i13;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        if (size == 0) {
            uk9.m22784s();
            return 0;
        }
        int i14 = iArr[0];
        int i15 = size - 1;
        if (1 <= i15) {
            int i16 = 1;
            while (true) {
                int i17 = iArr[i16];
                if (i14 < i17) {
                    i14 = i17;
                }
                if (i16 == i15) {
                    break;
                }
                i16++;
            }
        }
        int i18 = size5;
        while (i14 <= i18 && i10 != i) {
            size5 = (i14 + i18) / 2;
            if (list4.isEmpty()) {
                jM25484a = z74.m25484a(i5, i5);
                list4 = list4;
                iArr = iArr;
                i5 = i5;
                iMin = iMin;
                i18 = i18;
            } else {
                iMin = iMin;
                x83 x83Var = new x83(this.f36875f, c93Var, dk1.m10423a(i5, size5, i5, i7), iMo916w0, iMo916w1);
                ct5 ct5Var3 = (ct5) u91.m22592J0(i5, list4);
                int i19 = ct5Var3 != null ? iArr2[i5] : i5;
                int i20 = ct5Var3 != null ? iArr[i5] : i5;
                iArr = iArr;
                int i21 = 0;
                int i22 = 0;
                if (x83Var.m24402b(list4.size() > i4 ? i4 : i5, 0, z74.m25484a(size5, Integer.MAX_VALUE), ct5Var3 == null ? null : new z74(z74.m25484a(i20, i19)), 0, 0, 0, false, false).f66512b) {
                    z74 z74VarM4405a = c93Var.m4405a(i5, i5, ct5Var3 != null ? 1 : i5);
                    jM25484a = z74.m25484a(z74VarM4405a != null ? (int) (z74VarM4405a.f71017a & 4294967295L) : i5, i5);
                    i18 = i18;
                    list4 = list4;
                    i5 = i5;
                } else {
                    int size6 = list5.size();
                    int i23 = size5;
                    int i24 = i5;
                    int i25 = i24;
                    int i26 = i25;
                    int i27 = 0;
                    while (true) {
                        if (i24 >= size6) {
                            i18 = i18;
                            list4 = list4;
                            i5 = i5;
                            i3 = i25;
                            break;
                        }
                        i23 -= i20;
                        i3 = i24 + 1;
                        int iMax = Math.max(i27, i19);
                        ct5 ct5Var4 = (ct5) u91.m22592J0(i3, list4);
                        i19 = ct5Var4 != null ? iArr2[i3] : i5;
                        if (ct5Var4 != null) {
                            i5 = iArr[i3] + iMo916w0;
                        }
                        int i28 = i3 - i26;
                        w83 w83VarM24402b = x83Var.m24402b(i24 + 2 < list4.size() ? 1 : i5, i28, z74.m25484a(i23, Integer.MAX_VALUE), ct5Var4 == null ? null : new z74(z74.m25484a(i5, i19)), i21, i22, iMax, false, false);
                        if (w83VarM24402b.f66511a) {
                            int i29 = iMax + iMo916w1 + i22;
                            int i30 = i21;
                            up2 up2VarM24401a = x83Var.m24401a(w83VarM24402b, ct5Var4 != null ? 1 : i5, i30, i29, i23, i28);
                            i5 -= iMo916w0;
                            i21 = i30 + 1;
                            if (w83VarM24402b.f66512b) {
                                if (up2VarM24401a != null) {
                                    long j = up2VarM24401a.f64164a;
                                    if (!up2VarM24401a.f64165b) {
                                        i29 = ((int) (j & 4294967295L)) + iMo916w1 + i29;
                                    }
                                }
                                i22 = i29;
                                break;
                            }
                            i23 = size5;
                            i26 = i3;
                            i22 = i29;
                            i27 = i5;
                        } else {
                            i27 = iMax;
                        }
                        i18 = i18;
                        i24 = i3;
                        i25 = i24;
                        list4 = list4;
                        i20 = i5;
                        i5 = i5;
                    }
                    jM25484a = z74.m25484a(i22 - iMo916w1, i3);
                }
            }
            i10 = (int) (jM25484a >> 32);
            int i31 = (int) (jM25484a & 4294967295L);
            if (i10 > i || i31 < iMin) {
                i14 = size5 + 1;
                if (i14 > i18) {
                    return i14;
                }
                i18 = i18;
                i4 = 1;
                i7 = Integer.MAX_VALUE;
            } else {
                if (i10 >= i) {
                    return size5;
                }
                i18 = size5 - 1;
                i4 = 1;
                i7 = Integer.MAX_VALUE;
            }
        }
        return size5;
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: d */
    public final int mo1206d(aa4 aa4Var, List list, int i) {
        List list2 = (List) u91.m22592J0(1, list);
        ct5 ct5Var = list2 != null ? (ct5) u91.m22591I0(list2) : null;
        List list3 = (List) u91.m22592J0(2, list);
        this.f36876g.m4406b(ct5Var, list3 != null ? (ct5) u91.m22591I0(list3) : null, dk1.m10424b(0, i, 0, 0, 13));
        List list4 = (List) u91.m22591I0(list);
        if (list4 == null) {
            list4 = EmptyList.f47638a;
        }
        return m10948k(list4, i, aa4Var.mo916w0(this.f36872c), aa4Var.mo916w0(this.f36874e), this.f36875f, this.f36876g);
    }

    @Override // p000.p46
    /* JADX INFO: renamed from: e */
    public final int mo1207e(aa4 aa4Var, List list, int i) {
        List list2 = (List) u91.m22592J0(1, list);
        ct5 ct5Var = list2 != null ? (ct5) u91.m22591I0(list2) : null;
        List list3 = (List) u91.m22592J0(2, list);
        this.f36876g.m4406b(ct5Var, list3 != null ? (ct5) u91.m22591I0(list3) : null, dk1.m10424b(0, i, 0, 0, 13));
        List list4 = (List) u91.m22591I0(list);
        if (list4 == null) {
            list4 = EmptyList.f47638a;
        }
        return m10948k(list4, i, aa4Var.mo916w0(this.f36872c), aa4Var.mo916w0(this.f36874e), this.f36875f, this.f36876g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e93)) {
            return false;
        }
        e93 e93Var = (e93) obj;
        return this.f36870a.equals(e93Var.f36870a) && this.f36871b.equals(e93Var.f36871b) && xj2.m24560b(this.f36872c, e93Var.f36872c) && this.f36873d.equals(e93Var.f36873d) && xj2.m24560b(this.f36874e, e93Var.f36874e) && this.f36875f == e93Var.f36875f && fa4.m11650l(this.f36876g, e93Var.f36876g);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: f */
    public void mo3550f(int i, int[] iArr, int[] iArr2, jt5 jt5Var) {
        this.f36870a.mo9968j(jt5Var, i, iArr, jt5Var.getLayoutDirection(), iArr2);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: g */
    public long mo3551g(int i, int i2, int i3, boolean z) {
        sj8 sj8Var = qj8.f57858a;
        return !z ? dk1.m10423a(i, i2, 0, i3) : AbstractC3423or.m18278s(i, i2, 0, i3);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: h */
    public it5 mo3552h(final l87[] l87VarArr, jt5 jt5Var, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return jt5Var.mo9895M0(i2, i3, AbstractC3194a.m15360M(), new vi3() { // from class: d93
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                d32 d32Var;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    l87 l87Var = l87VarArr[i9];
                    l87Var.getClass();
                    Object objMo1509A = l87Var.mo1509A();
                    pj8 pj8Var = objMo1509A instanceof pj8 ? (pj8) objMo1509A : null;
                    if (pj8Var == null || (d32Var = pj8Var.f56323c) == null) {
                        d32Var = this.f36873d;
                    }
                    abstractC0343j.m1530f(l87Var, iArr[i9 - i8], d32Var.mo10067A(i3, l87Var.mo1640a0(), layoutDirection, l87Var, i) + i7, 0.0f);
                }
                return xfa.f68157a;
            }
        });
    }

    public final int hashCode() {
        return this.f36876g.hashCode() + wq1.m24106b(Integer.MAX_VALUE, wq1.m24106b(this.f36875f, wq1.m24105a((this.f36873d.hashCode() + wq1.m24105a((this.f36871b.hashCode() + ((this.f36870a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.f36872c, 31)) * 31, this.f36874e, 31), 31), 31);
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: i */
    public int mo3553i(l87 l87Var) {
        return l87Var.mo1640a0();
    }

    @Override // p000.oj8
    /* JADX INFO: renamed from: j */
    public int mo3554j(l87 l87Var) {
        return l87Var.mo1642b0();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f36870a + ", verticalArrangement=" + this.f36871b + ", mainAxisSpacing=" + ((Object) xj2.m24561c(this.f36872c)) + ", crossAxisAlignment=" + this.f36873d + ", crossAxisArrangementSpacing=" + ((Object) xj2.m24561c(this.f36874e)) + ", maxItemsInMainAxis=" + this.f36875f + ", maxLines=2147483647, overflow=" + this.f36876g + ')';
    }
}
