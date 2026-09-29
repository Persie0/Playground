package p000;

import android.util.SparseArray;
import androidx.media3.common.C0713b;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qq3 implements yo2 {

    /* JADX INFO: renamed from: a */
    public final eu8 f58040a;

    /* JADX INFO: renamed from: b */
    public final boolean f58041b;

    /* JADX INFO: renamed from: c */
    public final boolean f58042c;

    /* JADX INFO: renamed from: g */
    public long f58046g;

    /* JADX INFO: renamed from: i */
    public String f58048i;

    /* JADX INFO: renamed from: j */
    public n8a f58049j;

    /* JADX INFO: renamed from: k */
    public pq3 f58050k;

    /* JADX INFO: renamed from: l */
    public boolean f58051l;

    /* JADX INFO: renamed from: n */
    public boolean f58053n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f58047h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final e76 f58043d = new e76(7);

    /* JADX INFO: renamed from: e */
    public final e76 f58044e = new e76(8);

    /* JADX INFO: renamed from: f */
    public final e76 f58045f = new e76(6);

    /* JADX INFO: renamed from: m */
    public long f58052m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final k47 f58054o = new k47();

    public qq3(eu8 eu8Var, boolean z, boolean z2) {
        this.f58040a = eu8Var;
        this.f58041b = z;
        this.f58042c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:92:0x0242  */
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
    /* JADX INFO: renamed from: a */
    public final void m20101a(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        g68 g68Var = this.f58040a.f37872d;
        if (!this.f58051l || this.f58050k.f56659c) {
            e76 e76Var = this.f58043d;
            e76Var.m10907b(i2);
            e76 e76Var2 = this.f58044e;
            e76Var2.m10907b(i2);
            boolean z4 = this.f58051l;
            boolean z5 = e76Var.f36813c;
            if (z4) {
                if (z5) {
                    m76 m76VarM25803k = zuc.m25803k(e76Var.f36814d, 3, e76Var.f36815e);
                    g68Var.m12384c(m76VarM25803k.f50731s);
                    this.f58050k.f56660d.append(m76VarM25803k.f50716d, m76VarM25803k);
                    e76Var.m10908c();
                } else if (e76Var2.f36813c) {
                    l47 l47Var = new l47(e76Var2.f36814d, 4, e76Var2.f36815e);
                    int iM15784f = l47Var.m15784f();
                    int iM15784f2 = l47Var.m15784f();
                    l47Var.m15787i();
                    this.f58050k.f56661e.append(iM15784f, new l76(iM15784f, iM15784f2, l47Var.m15782d()));
                    e76Var2.m10908c();
                }
            } else if (z5 && e76Var2.f36813c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(e76Var.f36814d, e76Var.f36815e));
                arrayList.add(Arrays.copyOf(e76Var2.f36814d, e76Var2.f36815e));
                m76 m76VarM25803k2 = zuc.m25803k(e76Var.f36814d, 3, e76Var.f36815e);
                int i8 = m76VarM25803k2.f50731s;
                l47 l47Var2 = new l47(e76Var2.f36814d, 4, e76Var2.f36815e);
                int iM15784f3 = l47Var2.m15784f();
                int iM15784f4 = l47Var2.m15784f();
                l47Var2.m15787i();
                l76 l76Var = new l76(iM15784f3, iM15784f4, l47Var2.m15782d());
                int i9 = m76VarM25803k2.f50713a;
                int i10 = m76VarM25803k2.f50714b;
                int i11 = m76VarM25803k2.f50715c;
                byte[] bArr = m41.f50559a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                n8a n8aVar = this.f58049j;
                lc3 lc3Var = new lc3();
                lc3Var.f49440a = this.f58048i;
                lc3Var.f49452m = ez5.m11402l("video/mp2t");
                lc3Var.f49453n = ez5.m11402l("video/avc");
                lc3Var.f49449j = str;
                lc3Var.f49460u = m76VarM25803k2.f50717e;
                lc3Var.f49461v = m76VarM25803k2.f50718f;
                lc3Var.f49428D = new ga1(m76VarM25803k2.f50728p, m76VarM25803k2.f50729q, m76VarM25803k2.f50730r, null, m76VarM25803k2.f50720h + 8, m76VarM25803k2.f50721i + 8);
                lc3Var.f49425A = m76VarM25803k2.f50719g;
                lc3Var.f49456q = arrayList;
                lc3Var.f49455p = i8;
                n8aVar.mo2537g(new C0713b(lc3Var));
                this.f58051l = true;
                g68Var.m12384c(i8);
                this.f58050k.f56660d.append(m76VarM25803k2.f50716d, m76VarM25803k2);
                this.f58050k.f56661e.append(iM15784f3, l76Var);
                e76Var.m10908c();
                e76Var2.m10908c();
            }
        }
        e76 e76Var3 = this.f58045f;
        if (e76Var3.m10907b(i2)) {
            int iM25806n = zuc.m25806n(e76Var3.f36815e, e76Var3.f36814d);
            byte[] bArr2 = e76Var3.f36814d;
            k47 k47Var = this.f58054o;
            k47Var.m14816K(iM25806n, bArr2);
            k47Var.m14818M(4);
            g68Var.m12382a(j2, k47Var);
        }
        pq3 pq3Var = this.f58050k;
        boolean z6 = this.f58051l;
        if (pq3Var.f56665i == 9) {
            if (z6 && pq3Var.f56671o) {
                j3 = pq3Var.f56666j;
                i3 = i + ((int) (j - j3));
                j4 = pq3Var.f56673q;
                if (j4 != -9223372036854775807L) {
                    j5 = pq3Var.f56672p;
                    if (j3 != j5) {
                        pq3Var.f56657a.mo2531a(j4, pq3Var.f56674r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            pq3Var.f56672p = pq3Var.f56666j;
            pq3Var.f56673q = pq3Var.f56668l;
            pq3Var.f56674r = false;
            pq3Var.f56671o = true;
        } else if (pq3Var.f56659c) {
            oq3 oq3Var = pq3Var.f56670n;
            oq3 oq3Var2 = pq3Var.f56669m;
            if (oq3Var.f54715a) {
                if (oq3Var2.f54715a) {
                    m76 m76Var = oq3Var.f54717c;
                    m76Var.getClass();
                    m76 m76Var2 = oq3Var2.f54717c;
                    m76Var2.getClass();
                    int i12 = m76Var2.f50725m;
                    if (oq3Var.f54720f != oq3Var2.f54720f || oq3Var.f54721g != oq3Var2.f54721g || oq3Var.f54722h != oq3Var2.f54722h || ((oq3Var.f54723i && oq3Var2.f54723i && oq3Var.f54724j != oq3Var2.f54724j) || (((i5 = oq3Var.f54718d) != (i6 = oq3Var2.f54718d) && (i5 == 0 || i6 == 0)) || (((i7 = m76Var.f50725m) == 0 && i12 == 0 && (oq3Var.f54727m != oq3Var2.f54727m || oq3Var.f54728n != oq3Var2.f54728n)) || ((i7 == 1 && i12 == 1 && (oq3Var.f54729o != oq3Var2.f54729o || oq3Var.f54730p != oq3Var2.f54730p)) || (z3 = oq3Var.f54725k) != oq3Var2.f54725k || (z3 && oq3Var.f54726l != oq3Var2.f54726l)))))) {
                        if (z6) {
                            j3 = pq3Var.f56666j;
                            i3 = i + ((int) (j - j3));
                            j4 = pq3Var.f56673q;
                            if (j4 != -9223372036854775807L) {
                                j5 = pq3Var.f56672p;
                                if (j3 != j5) {
                                    pq3Var.f56657a.mo2531a(j4, pq3Var.f56674r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        pq3Var.f56672p = pq3Var.f56666j;
                        pq3Var.f56673q = pq3Var.f56668l;
                        pq3Var.f56674r = false;
                        pq3Var.f56671o = true;
                    }
                } else {
                    if (z6) {
                        j3 = pq3Var.f56666j;
                        i3 = i + ((int) (j - j3));
                        j4 = pq3Var.f56673q;
                        if (j4 != -9223372036854775807L) {
                            j5 = pq3Var.f56672p;
                            if (j3 != j5) {
                                pq3Var.f56657a.mo2531a(j4, pq3Var.f56674r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    pq3Var.f56672p = pq3Var.f56666j;
                    pq3Var.f56673q = pq3Var.f56668l;
                    pq3Var.f56674r = false;
                    pq3Var.f56671o = true;
                }
            }
        }
        if (pq3Var.f56658b) {
            oq3 oq3Var3 = pq3Var.f56670n;
            z = oq3Var3.f54716b && ((i4 = oq3Var3.f54719e) == 7 || i4 == 2);
        } else {
            z = pq3Var.f56675s;
        }
        boolean z7 = pq3Var.f56674r;
        int i13 = pq3Var.f56665i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        pq3Var.f56674r = z8;
        pq3Var.f56665i = 24;
        if (z8) {
            this.f58053n = false;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        int i;
        this.f58049j.getClass();
        String str = uma.f64080a;
        int i2 = k47Var.f46701b;
        int i3 = k47Var.f46702c;
        byte[] bArr = k47Var.f46700a;
        this.f58046g += (long) k47Var.m14820a();
        this.f58049j.mo2535e(k47Var.m14820a(), k47Var);
        while (true) {
            int iM25794b = zuc.m25794b(bArr, i2, i3, this.f58047h);
            if (iM25794b == i3) {
                this.m20102c(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iM25794b + 3] & 31;
            if (iM25794b <= 0 || bArr[iM25794b - 1] != 0) {
                i = 3;
            } else {
                iM25794b--;
                i = 4;
            }
            int i5 = iM25794b - i2;
            if (i5 > 0) {
                this.m20102c(bArr, i2, iM25794b);
            }
            int i6 = i3 - iM25794b;
            long j = this.f58046g - ((long) i6);
            qq3 qq3Var = this;
            qq3Var.m20101a(i6, i5 < 0 ? -i5 : 0, j, this.f58052m);
            qq3Var.m20103h(i4, j, qq3Var.f58052m);
            i2 = iM25794b + i;
            this = qq3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX INFO: renamed from: c */
    public final void m20102c(byte[] bArr, int i, int i2) {
        boolean zM15782d;
        boolean zM15782d2;
        boolean z;
        boolean z2;
        int iM15784f;
        int i3;
        int iM15783e;
        int i4;
        int iM15785g;
        int iM15785g2;
        if (!this.f58051l || this.f58050k.f56659c) {
            this.f58043d.m10906a(bArr, i, i2);
            this.f58044e.m10906a(bArr, i, i2);
        }
        this.f58045f.m10906a(bArr, i, i2);
        pq3 pq3Var = this.f58050k;
        SparseArray sparseArray = pq3Var.f56661e;
        l47 l47Var = pq3Var.f56662f;
        if (pq3Var.f56667k) {
            int i5 = i2 - i;
            byte[] bArr2 = pq3Var.f56663g;
            int length = bArr2.length;
            int i6 = pq3Var.f56664h + i5;
            if (length < i6) {
                pq3Var.f56663g = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i, pq3Var.f56663g, pq3Var.f56664h, i5);
            int i7 = pq3Var.f56664h + i5;
            pq3Var.f56664h = i7;
            l47Var.f49042e = pq3Var.f56663g;
            l47Var.f49039b = 0;
            l47Var.f49040c = 0;
            l47Var.f49038a = i7;
            l47Var.f49041d = 0;
            l47Var.m15779a();
            if (l47Var.m15780b(8)) {
                l47Var.m15787i();
                int iM15783e2 = l47Var.m15783e(2);
                l47Var.m15788j(5);
                if (l47Var.m15781c()) {
                    l47Var.m15784f();
                    if (l47Var.m15781c()) {
                        int iM15784f2 = l47Var.m15784f();
                        if (!pq3Var.f56659c) {
                            pq3Var.f56667k = false;
                            oq3 oq3Var = pq3Var.f56670n;
                            oq3Var.f54719e = iM15784f2;
                            oq3Var.f54716b = true;
                            return;
                        }
                        if (l47Var.m15781c()) {
                            int iM15784f3 = l47Var.m15784f();
                            if (sparseArray.indexOfKey(iM15784f3) < 0) {
                                pq3Var.f56667k = false;
                                return;
                            }
                            l76 l76Var = (l76) sparseArray.get(iM15784f3);
                            SparseArray sparseArray2 = pq3Var.f56660d;
                            int i8 = l76Var.f49249a;
                            boolean z3 = l76Var.f49250b;
                            m76 m76Var = (m76) sparseArray2.get(i8);
                            boolean z4 = m76Var.f50722j;
                            int i9 = m76Var.f50726n;
                            int i10 = m76Var.f50724l;
                            if (z4) {
                                if (!l47Var.m15780b(2)) {
                                    return;
                                } else {
                                    l47Var.m15788j(2);
                                }
                            }
                            if (l47Var.m15780b(i10)) {
                                int iM15783e3 = l47Var.m15783e(i10);
                                if (!m76Var.f50723k) {
                                    if (l47Var.m15780b(1)) {
                                        zM15782d = l47Var.m15782d();
                                        if (!zM15782d) {
                                            zM15782d2 = false;
                                        } else {
                                            if (!l47Var.m15780b(1)) {
                                                return;
                                            }
                                            zM15782d2 = l47Var.m15782d();
                                            z = true;
                                        }
                                        if (pq3Var.f56665i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iM15784f = 0;
                                        } else if (!l47Var.m15781c()) {
                                            return;
                                        } else {
                                            iM15784f = l47Var.m15784f();
                                        }
                                        i3 = m76Var.f50725m;
                                        if (i3 != 0) {
                                            if (l47Var.m15780b(i9)) {
                                                iM15783e = l47Var.m15783e(i9);
                                                if (!z3 && !zM15782d) {
                                                    if (!l47Var.m15781c()) {
                                                        return;
                                                    }
                                                    iM15785g2 = l47Var.m15785g();
                                                    i4 = 0;
                                                }
                                                iM15785g = 0;
                                                oq3 oq3Var2 = pq3Var.f56670n;
                                                oq3Var2.f54717c = m76Var;
                                                oq3Var2.f54718d = iM15783e2;
                                                oq3Var2.f54719e = iM15784f2;
                                                oq3Var2.f54720f = iM15783e3;
                                                oq3Var2.f54721g = iM15784f3;
                                                oq3Var2.f54722h = zM15782d;
                                                oq3Var2.f54723i = z;
                                                oq3Var2.f54724j = zM15782d2;
                                                oq3Var2.f54725k = z2;
                                                oq3Var2.f54726l = iM15784f;
                                                oq3Var2.f54727m = iM15783e;
                                                oq3Var2.f54728n = iM15785g2;
                                                oq3Var2.f54729o = i4;
                                                oq3Var2.f54730p = iM15785g;
                                                oq3Var2.f54715a = true;
                                                oq3Var2.f54716b = true;
                                                pq3Var.f56667k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || m76Var.f50727o) {
                                            iM15783e = 0;
                                        } else {
                                            if (!l47Var.m15781c()) {
                                                return;
                                            }
                                            int iM15785g3 = l47Var.m15785g();
                                            if (!z3 || zM15782d) {
                                                i4 = iM15785g3;
                                                iM15783e = 0;
                                                iM15785g2 = 0;
                                                iM15785g = 0;
                                            } else {
                                                if (!l47Var.m15781c()) {
                                                    return;
                                                }
                                                iM15785g = l47Var.m15785g();
                                                iM15785g2 = 0;
                                                i4 = iM15785g3;
                                                iM15783e = 0;
                                            }
                                        }
                                        oq3 oq3Var3 = pq3Var.f56670n;
                                        oq3Var3.f54717c = m76Var;
                                        oq3Var3.f54718d = iM15783e2;
                                        oq3Var3.f54719e = iM15784f2;
                                        oq3Var3.f54720f = iM15783e3;
                                        oq3Var3.f54721g = iM15784f3;
                                        oq3Var3.f54722h = zM15782d;
                                        oq3Var3.f54723i = z;
                                        oq3Var3.f54724j = zM15782d2;
                                        oq3Var3.f54725k = z2;
                                        oq3Var3.f54726l = iM15784f;
                                        oq3Var3.f54727m = iM15783e;
                                        oq3Var3.f54728n = iM15785g2;
                                        oq3Var3.f54729o = i4;
                                        oq3Var3.f54730p = iM15785g;
                                        oq3Var3.f54715a = true;
                                        oq3Var3.f54716b = true;
                                        pq3Var.f56667k = false;
                                        i4 = 0;
                                        iM15785g2 = 0;
                                        iM15785g = 0;
                                        oq3 oq3Var4 = pq3Var.f56670n;
                                        oq3Var4.f54717c = m76Var;
                                        oq3Var4.f54718d = iM15783e2;
                                        oq3Var4.f54719e = iM15784f2;
                                        oq3Var4.f54720f = iM15783e3;
                                        oq3Var4.f54721g = iM15784f3;
                                        oq3Var4.f54722h = zM15782d;
                                        oq3Var4.f54723i = z;
                                        oq3Var4.f54724j = zM15782d2;
                                        oq3Var4.f54725k = z2;
                                        oq3Var4.f54726l = iM15784f;
                                        oq3Var4.f54727m = iM15783e;
                                        oq3Var4.f54728n = iM15785g2;
                                        oq3Var4.f54729o = i4;
                                        oq3Var4.f54730p = iM15785g;
                                        oq3Var4.f54715a = true;
                                        oq3Var4.f54716b = true;
                                        pq3Var.f56667k = false;
                                    }
                                    return;
                                }
                                zM15782d = false;
                                zM15782d2 = false;
                                z = zM15782d2;
                                if (pq3Var.f56665i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iM15784f = 0;
                                } else if (!l47Var.m15781c()) {
                                    return;
                                } else {
                                    iM15784f = l47Var.m15784f();
                                }
                                i3 = m76Var.f50725m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iM15783e = 0;
                                } else {
                                    if (l47Var.m15780b(i9)) {
                                        return;
                                    }
                                    iM15783e = l47Var.m15783e(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iM15785g2 = 0;
                                iM15785g = 0;
                                oq3 oq3Var5 = pq3Var.f56670n;
                                oq3Var5.f54717c = m76Var;
                                oq3Var5.f54718d = iM15783e2;
                                oq3Var5.f54719e = iM15784f2;
                                oq3Var5.f54720f = iM15783e3;
                                oq3Var5.f54721g = iM15784f3;
                                oq3Var5.f54722h = zM15782d;
                                oq3Var5.f54723i = z;
                                oq3Var5.f54724j = zM15782d2;
                                oq3Var5.f54725k = z2;
                                oq3Var5.f54726l = iM15784f;
                                oq3Var5.f54727m = iM15783e;
                                oq3Var5.f54728n = iM15785g2;
                                oq3Var5.f54729o = i4;
                                oq3Var5.f54730p = iM15785g;
                                oq3Var5.f54715a = true;
                                oq3Var5.f54716b = true;
                                pq3Var.f56667k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        this.f58046g = 0L;
        this.f58053n = false;
        this.f58052m = -9223372036854775807L;
        zuc.m25793a(this.f58047h);
        this.f58043d.m10908c();
        this.f58044e.m10908c();
        this.f58045f.m10908c();
        this.f58040a.f37872d.m12383b(0);
        pq3 pq3Var = this.f58050k;
        if (pq3Var != null) {
            pq3Var.f56667k = false;
            pq3Var.f56671o = false;
            oq3 oq3Var = pq3Var.f56670n;
            oq3Var.f54716b = false;
            oq3Var.f54715a = false;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
        this.f58049j.getClass();
        String str = uma.f64080a;
        if (z) {
            this.f58040a.f37872d.m12383b(0);
            m20101a(0, 0, this.f58046g, this.f58052m);
            m20103h(9, this.f58046g, this.f58052m);
            m20101a(0, 0, this.f58046g, this.f58052m);
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f58052m = j;
        this.f58053n = ((i & 2) != 0) | this.f58053n;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f58048i = mcaVar.f51087e;
        mcaVar.m16768b();
        n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 2);
        this.f58049j = n8aVarMo2555n;
        this.f58050k = new pq3(n8aVarMo2555n, this.f58041b, this.f58042c);
        this.f58040a.m11345b(jy2Var, mcaVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m20103h(int i, long j, long j2) {
        if (!this.f58051l || this.f58050k.f56659c) {
            this.f58043d.m10909d(i);
            this.f58044e.m10909d(i);
        }
        this.f58045f.m10909d(i);
        pq3 pq3Var = this.f58050k;
        boolean z = this.f58053n;
        pq3Var.f56665i = i;
        pq3Var.f56668l = j2;
        pq3Var.f56666j = j;
        pq3Var.f56675s = z;
        if (!pq3Var.f56658b || i != 1) {
            if (!pq3Var.f56659c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        oq3 oq3Var = pq3Var.f56669m;
        pq3Var.f56669m = pq3Var.f56670n;
        pq3Var.f56670n = oq3Var;
        oq3Var.f54716b = false;
        oq3Var.f54715a = false;
        pq3Var.f56664h = 0;
        pq3Var.f56667k = true;
    }
}
