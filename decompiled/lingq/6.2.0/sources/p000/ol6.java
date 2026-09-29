package p000;

import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ol6 extends vl6 {

    /* JADX INFO: renamed from: c */
    public final d16 f54536c;

    /* JADX INFO: renamed from: d */
    public final C3126ix f54537d;

    /* JADX INFO: renamed from: e */
    public final tk5 f54538e;

    /* JADX INFO: renamed from: f */
    public AbstractC0362l f54539f;

    /* JADX INFO: renamed from: g */
    public fg7 f54540g;

    /* JADX INFO: renamed from: h */
    public boolean f54541h;

    /* JADX INFO: renamed from: i */
    public boolean f54542i;

    /* JADX INFO: renamed from: j */
    public boolean f54543j;

    public ol6(d16 d16Var) {
        this.f54536c = d16Var;
        C3126ix c3126ix = new C3126ix(8, (byte) 0);
        c3126ix.f44721c = new long[2];
        this.f54537d = c3126ix;
        this.f54538e = new tk5(2);
        this.f54542i = true;
        this.f54543j = true;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // p000.vl6
    /* JADX INFO: renamed from: a */
    public final boolean mo18096a(tk5 tk5Var, aq4 aq4Var, x44 x44Var, boolean z) {
        C3126ix c3126ix;
        tk5 tk5Var2;
        Object obj;
        boolean z2;
        boolean z3;
        fg7 fg7Var;
        int i;
        int i2;
        boolean z4;
        boolean zMo18096a = super.mo18096a(tk5Var, aq4Var, x44Var, z);
        ?? M21992f = this.f54536c;
        boolean z5 = true;
        if (M21992f.f34836I) {
            ?? x66Var = 0;
            while (M21992f != 0) {
                if (M21992f instanceof ng7) {
                    this.f54539f = te1.m21976I((ng7) M21992f, 16);
                } else if ((M21992f.f34839c & 16) != 0 && (M21992f instanceof fa2)) {
                    d16 d16Var = ((fa2) M21992f).f38701K;
                    int i3 = 0;
                    while (d16Var != null) {
                        if ((d16Var.f34839c & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                M21992f = M21992f;
                                x66Var = x66Var;
                                x66Var = x66Var;
                                M21992f = d16Var;
                            } else {
                                if (x66Var == 0) {
                                    x66Var = new x66(new d16[16]);
                                }
                                if (M21992f != 0) {
                                    x66Var.m24305c(M21992f);
                                    M21992f = 0;
                                }
                                x66Var.m24305c(d16Var);
                            }
                        } else {
                            M21992f = M21992f;
                            x66Var = x66Var;
                        }
                        d16Var = d16Var.f34842f;
                        M21992f = M21992f;
                        x66Var = x66Var;
                    }
                    if (i3 == 1) {
                        M21992f = M21992f;
                        x66Var = x66Var;
                    } else {
                        M21992f = M21992f;
                        x66Var = x66Var;
                    }
                }
                M21992f = te1.m21992f(x66Var);
            }
            if (this.f54539f != null) {
                int iM22182h = tk5Var.m22182h();
                int i4 = 0;
                while (true) {
                    c3126ix = this.f54537d;
                    tk5Var2 = this.f54538e;
                    if (i4 >= iM22182h) {
                        break;
                    }
                    long jM22179e = tk5Var.m22179e(i4);
                    kg7 kg7Var = (kg7) tk5Var.m22183i(i4);
                    if (c3126ix.m14170e(jM22179e)) {
                        boolean z6 = z5;
                        long j = kg7Var.f47241g;
                        long j2 = kg7Var.f47237c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z4 = z6;
                            ArrayList arrayList = new ArrayList(kg7Var.m15190b().size());
                            List listM15190b = kg7Var.m15190b();
                            int size = listM15190b.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list = listM15190b;
                                zt3 zt3Var = (zt3) listM15190b.get(i5);
                                tk5 tk5Var3 = tk5Var2;
                                long j3 = jM22179e;
                                long j4 = zt3Var.f72141b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = zt3Var.f72140a;
                                    AbstractC0362l abstractC0362l = this.f54539f;
                                    abstractC0362l.getClass();
                                    arrayList.add(new zt3(j5, abstractC0362l.mo1669P(aq4Var, j4), zt3Var.f72142c, zt3Var.f72143d, zt3Var.f72144e));
                                }
                                i5++;
                                size = size;
                                listM15190b = list;
                                tk5Var2 = tk5Var3;
                                jM22179e = j3;
                                kg7Var = kg7Var;
                            }
                            tk5 tk5Var4 = tk5Var2;
                            long j6 = jM22179e;
                            AbstractC0362l abstractC0362l2 = this.f54539f;
                            abstractC0362l2.getClass();
                            long jMo1669P = abstractC0362l2.mo1669P(aq4Var, j);
                            AbstractC0362l abstractC0362l3 = this.f54539f;
                            abstractC0362l3.getClass();
                            kg7 kg7Var2 = new kg7(kg7Var.f47235a, kg7Var.f47236b, abstractC0362l3.mo1669P(aq4Var, j2), kg7Var.f47238d, kg7Var.f47239e, kg7Var.f47240f, jMo1669P, kg7Var.f47242h, kg7Var.f47243i, arrayList, kg7Var.f47244j, kg7Var.f47245k, kg7Var.f47246l, kg7Var.f47248n);
                            kg7 kg7Var3 = kg7Var.f47251q;
                            if (kg7Var3 == null) {
                                kg7Var3 = kg7Var;
                            }
                            kg7Var2.f47251q = kg7Var3;
                            kg7 kg7Var4 = kg7Var.f47251q;
                            if (kg7Var4 != null) {
                                kg7Var = kg7Var4;
                            }
                            kg7Var2.f47251q = kg7Var;
                            tk5Var4.m22180f(kg7Var2, j6);
                        } else {
                            z4 = z6;
                        }
                    } else {
                        z4 = z5;
                    }
                    i4++;
                    z5 = z4;
                    zMo18096a = zMo18096a;
                    iM22182h = iM22182h;
                }
                boolean z7 = zMo18096a;
                boolean z8 = z5;
                if (tk5Var2.m22178d()) {
                    c3126ix.f44720b = 0;
                    this.f65569a.m24310h();
                    return z8;
                }
                int i6 = c3126ix.f44720b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (tk5Var.m22177c(((long[]) c3126ix.f44721c)[i6]) < 0 && i6 < (i2 = c3126ix.f44720b)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = (long[]) c3126ix.f44721c;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        c3126ix.f44720b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(tk5Var2.m22182h());
                int iM22182h2 = tk5Var2.m22182h();
                for (int i10 = 0; i10 < iM22182h2; i10++) {
                    arrayList2.add(tk5Var2.m22183i(i10));
                }
                fg7 fg7Var2 = new fg7(arrayList2, x44Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i11);
                    if (x44Var.m24264a(((kg7) obj).f47235a)) {
                        break;
                    }
                    i11++;
                }
                kg7 kg7Var5 = (kg7) obj;
                if (kg7Var5 != null) {
                    boolean z9 = kg7Var5.f47238d;
                    if (z) {
                        z2 = false;
                        if (!this.f54542i && (z9 || kg7Var5.f47242h)) {
                            AbstractC0362l abstractC0362l4 = this.f54539f;
                            abstractC0362l4.getClass();
                            long j7 = abstractC0362l4.f49303c;
                            long j8 = kg7Var5.f47237c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            this.f54542i = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z8 : false) | (fIntBitsToFloat > ((float) i12) ? z8 : false) | (fIntBitsToFloat < 0.0f ? z8 : false) | (fIntBitsToFloat2 < 0.0f ? z8 : false));
                        }
                    } else {
                        z2 = false;
                        this.f54542i = false;
                    }
                    boolean z10 = this.f54542i;
                    boolean z11 = this.f54541h;
                    if (z10 == z11 || !((i = fg7Var2.f39076f) == 3 || i == 4 || i == 5)) {
                        int i13 = fg7Var2.f39076f;
                        if (i13 == 4 && z11 && !this.f54543j) {
                            fg7Var2.f39076f = 3;
                        } else if (i13 == 5 && z10 && z9) {
                            fg7Var2.f39076f = 3;
                        }
                    } else {
                        fg7Var2.f39076f = z10 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && fg7Var2.f39076f == 3 && (fg7Var = this.f54540g) != null) {
                    ?? r1 = fg7Var.f39071a;
                    int size3 = r1.size();
                    ?? r5 = fg7Var2.f39071a;
                    if (size3 != r5.size()) {
                        z3 = z8;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!gq6.m12821b(((kg7) r1.get(r6)).f47237c, ((kg7) r5.get(r6)).f47237c)) {
                            z3 = z8;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z8;
                    break;
                }
                this.f54540g = fg7Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // p000.vl6
    /* JADX INFO: renamed from: b */
    public final void mo18097b(x44 x44Var) {
        super.mo18097b(x44Var);
        fg7 fg7Var = this.f54540g;
        if (fg7Var == null) {
            return;
        }
        this.f54541h = this.f54542i;
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kg7 kg7Var = (kg7) list.get(i);
            boolean z = kg7Var.f47238d;
            long j = kg7Var.f47235a;
            boolean zM24264a = x44Var.m24264a(j);
            boolean z2 = this.f54542i;
            if ((!z && !zM24264a) || (!z && !z2)) {
                this.f54537d.m14175k(j);
            }
        }
        this.f54542i = false;
        this.f54543j = fg7Var.f39076f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [x66] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [x66] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [d16] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [d16] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: c */
    public final void m18098c() {
        x66 x66Var = this.f65569a;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ol6) objArr[i2]).m18098c();
        }
        ?? M21992f = this.f54536c;
        ?? x66Var2 = 0;
        while (M21992f != 0) {
            if (M21992f instanceof ng7) {
                ((ng7) M21992f).mo818K();
            } else if ((M21992f.f34839c & 16) != 0 && (M21992f instanceof fa2)) {
                d16 d16Var = ((fa2) M21992f).f38701K;
                int i3 = 0;
                x66Var2 = x66Var2;
                M21992f = M21992f;
                while (d16Var != null) {
                    if ((d16Var.f34839c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            x66Var2 = x66Var2;
                            M21992f = d16Var;
                        } else {
                            if (x66Var2 == 0) {
                                x66Var2 = new x66(new d16[16]);
                            }
                            if (M21992f != 0) {
                                x66Var2.m24305c(M21992f);
                                M21992f = 0;
                            }
                            x66Var2.m24305c(d16Var);
                        }
                    }
                    d16Var = d16Var.f34842f;
                    x66Var2 = x66Var2;
                    M21992f = M21992f;
                }
                if (i3 == 1) {
                }
            }
            M21992f = te1.m21992f(x66Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: d */
    public final boolean m18099d(x44 x44Var) {
        C0357g c0357g;
        tk5 tk5Var = this.f54538e;
        boolean z = false;
        z = false;
        z = false;
        if (!tk5Var.m22178d()) {
            d16 d16Var = this.f54536c;
            if (d16Var.f34836I) {
                AbstractC0362l abstractC0362l = d16Var.f34844h;
                if ((abstractC0362l == null || (c0357g = abstractC0362l.f4432J) == null) ? false : c0357g.m1570M()) {
                    fg7 fg7Var = this.f54540g;
                    fg7Var.getClass();
                    AbstractC0362l abstractC0362l2 = this.f54539f;
                    abstractC0362l2.getClass();
                    long j = abstractC0362l2.f49303c;
                    ?? M21992f = d16Var;
                    ?? x66Var = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof ng7) {
                            ((ng7) M21992f).mo786D(fg7Var, PointerEventPass.Final, j);
                        } else if ((M21992f.f34839c & 16) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var2 = ((fa2) M21992f).f38701K;
                            int i = 0;
                            while (d16Var2 != null) {
                                if ((d16Var2.f34839c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                        x66Var = x66Var;
                                        M21992f = d16Var2;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var.m24305c(d16Var2);
                                    }
                                } else {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                                d16Var2 = d16Var2.f34842f;
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                                M21992f = M21992f;
                                x66Var = x66Var;
                            } else {
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                        }
                        M21992f = te1.m21992f(x66Var);
                    }
                    if (d16Var.f34836I) {
                        x66 x66Var2 = this.f65569a;
                        Object[] objArr = x66Var2.f67830a;
                        int i2 = x66Var2.f67832c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((ol6) objArr[i3]).m18099d(x44Var);
                        }
                    }
                    z = true;
                }
            }
        }
        mo18097b(x44Var);
        tk5Var.m22175a();
        this.f54539f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [x66] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [x66] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r6v10, types: [d16] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [x66] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [x66] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: e */
    public final boolean m18100e(x44 x44Var, boolean z) {
        C0357g c0357g;
        if (!this.f54538e.m22178d()) {
            ?? M21992f = this.f54536c;
            if (M21992f.f34836I) {
                AbstractC0362l abstractC0362l = M21992f.f34844h;
                if ((abstractC0362l == null || (c0357g = abstractC0362l.f4432J) == null) ? false : c0357g.m1570M()) {
                    fg7 fg7Var = this.f54540g;
                    fg7Var.getClass();
                    AbstractC0362l abstractC0362l2 = this.f54539f;
                    abstractC0362l2.getClass();
                    long j = abstractC0362l2.f49303c;
                    ?? M21992f2 = M21992f;
                    ?? x66Var = 0;
                    while (M21992f2 != 0) {
                        if (M21992f2 instanceof ng7) {
                            ((ng7) M21992f2).mo786D(fg7Var, PointerEventPass.Initial, j);
                        } else if ((M21992f2.f34839c & 16) != 0 && (M21992f2 instanceof fa2)) {
                            d16 d16Var = ((fa2) M21992f2).f38701K;
                            int i = 0;
                            while (d16Var != null) {
                                if ((d16Var.f34839c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M21992f2 = M21992f2;
                                        x66Var = x66Var;
                                        x66Var = x66Var;
                                        M21992f2 = d16Var;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f2 != 0) {
                                            x66Var.m24305c(M21992f2);
                                            M21992f2 = 0;
                                        }
                                        x66Var.m24305c(d16Var);
                                    }
                                } else {
                                    M21992f2 = M21992f2;
                                    x66Var = x66Var;
                                }
                                d16Var = d16Var.f34842f;
                                M21992f2 = M21992f2;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                                M21992f2 = M21992f2;
                                x66Var = x66Var;
                            } else {
                                M21992f2 = M21992f2;
                                x66Var = x66Var;
                            }
                        }
                        M21992f2 = te1.m21992f(x66Var);
                    }
                    if (M21992f.f34836I) {
                        x66 x66Var2 = this.f65569a;
                        Object[] objArr = x66Var2.f67830a;
                        int i2 = x66Var2.f67832c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ol6 ol6Var = (ol6) objArr[i3];
                            this.f54539f.getClass();
                            ol6Var.m18100e(x44Var, z);
                        }
                    }
                    if (M21992f.f34836I) {
                        ?? x66Var3 = 0;
                        while (M21992f != 0) {
                            if (M21992f instanceof ng7) {
                                ((ng7) M21992f).mo786D(fg7Var, PointerEventPass.Main, j);
                            } else if ((M21992f.f34839c & 16) != 0 && (M21992f instanceof fa2)) {
                                d16 d16Var2 = ((fa2) M21992f).f38701K;
                                int i4 = 0;
                                while (d16Var2 != null) {
                                    if ((d16Var2.f34839c & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            M21992f = M21992f;
                                            x66Var3 = x66Var3;
                                            x66Var3 = x66Var3;
                                            M21992f = d16Var2;
                                        } else {
                                            if (x66Var3 == 0) {
                                                x66Var3 = new x66(new d16[16]);
                                            }
                                            if (M21992f != 0) {
                                                x66Var3.m24305c(M21992f);
                                                M21992f = 0;
                                            }
                                            x66Var3.m24305c(d16Var2);
                                        }
                                    } else {
                                        M21992f = M21992f;
                                        x66Var3 = x66Var3;
                                    }
                                    d16Var2 = d16Var2.f34842f;
                                    M21992f = M21992f;
                                    x66Var3 = x66Var3;
                                }
                                if (i4 == 1) {
                                    M21992f = M21992f;
                                    x66Var3 = x66Var3;
                                } else {
                                    M21992f = M21992f;
                                    x66Var3 = x66Var3;
                                }
                            }
                            M21992f = te1.m21992f(x66Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m18101f(long j, h66 h66Var) {
        C3126ix c3126ix = this.f54537d;
        if (c3126ix.m14170e(j) && h66Var.m718c(this) < 0) {
            c3126ix.m14175k(j);
            this.f54538e.m22181g(j);
        }
        x66 x66Var = this.f65569a;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ol6) objArr[i2]).m18101f(j, h66Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f54536c + ", children=" + this.f65569a + ", pointerIds=" + this.f54537d + ')';
    }
}
