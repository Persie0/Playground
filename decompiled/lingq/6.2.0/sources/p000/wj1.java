package p000;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends vj1 {

    /* JADX INFO: renamed from: A0 */
    public int f66902A0;

    /* JADX INFO: renamed from: B0 */
    public int f66903B0;

    /* JADX INFO: renamed from: C0 */
    public int f66904C0;

    /* JADX INFO: renamed from: D0 */
    public int f66905D0;

    /* JADX INFO: renamed from: E0 */
    public lp0[] f66906E0;

    /* JADX INFO: renamed from: F0 */
    public lp0[] f66907F0;

    /* JADX INFO: renamed from: G0 */
    public int f66908G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f66909H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f66910I0;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f66911J0;

    /* JADX INFO: renamed from: K0 */
    public WeakReference f66912K0;

    /* JADX INFO: renamed from: L0 */
    public WeakReference f66913L0;

    /* JADX INFO: renamed from: M0 */
    public WeakReference f66914M0;

    /* JADX INFO: renamed from: N0 */
    public final HashSet f66915N0;

    /* JADX INFO: renamed from: O0 */
    public final ua0 f66916O0;

    /* JADX INFO: renamed from: t0 */
    public ArrayList f66917t0 = new ArrayList();

    /* JADX INFO: renamed from: u0 */
    public final C3309ls f66918u0 = new C3309ls(this);

    /* JADX INFO: renamed from: v0 */
    public final sb2 f66919v0;

    /* JADX INFO: renamed from: w0 */
    public int f66920w0;

    /* JADX INFO: renamed from: x0 */
    public ij1 f66921x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f66922y0;

    /* JADX INFO: renamed from: z0 */
    public final gd5 f66923z0;

    public wj1() {
        sb2 sb2Var = new sb2();
        sb2Var.f60612b = true;
        sb2Var.f60613c = true;
        sb2Var.f60616f = new ArrayList();
        new ArrayList();
        sb2Var.f60618h = null;
        sb2Var.f60619i = new ua0();
        sb2Var.f60617g = new ArrayList();
        sb2Var.f60614d = this;
        sb2Var.f60615e = this;
        this.f66919v0 = sb2Var;
        this.f66921x0 = null;
        this.f66922y0 = false;
        this.f66923z0 = new gd5();
        this.f66904C0 = 0;
        this.f66905D0 = 0;
        this.f66906E0 = new lp0[4];
        this.f66907F0 = new lp0[4];
        this.f66908G0 = 257;
        this.f66909H0 = false;
        this.f66910I0 = false;
        this.f66911J0 = null;
        this.f66912K0 = null;
        this.f66913L0 = null;
        this.f66914M0 = null;
        this.f66915N0 = new HashSet();
        this.f66916O0 = new ua0();
    }

    /* JADX INFO: renamed from: W */
    public static void m24003W(vj1 vj1Var, ij1 ij1Var, ua0 ua0Var) {
        int i;
        int i2;
        if (ij1Var == null) {
            return;
        }
        int i3 = vj1Var.f65473h0;
        int[] iArr = vj1Var.f65496t;
        if (i3 == 8 || (vj1Var instanceof gq3) || (vj1Var instanceof l80)) {
            ua0Var.f63630e = 0;
            ua0Var.f63631f = 0;
            return;
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
        ua0Var.f63626a = constraintWidget$DimensionBehaviourArr[0];
        ua0Var.f63627b = constraintWidget$DimensionBehaviourArr[1];
        ua0Var.f63628c = vj1Var.m23326r();
        ua0Var.f63629d = vj1Var.m23322l();
        ua0Var.f63634i = false;
        ua0Var.f63635j = 0;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ua0Var.f63626a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = ua0Var.f63627b == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && vj1Var.f65455X > 0.0f;
        boolean z4 = z2 && vj1Var.f65455X > 0.0f;
        if (z && vj1Var.m23329u(0) && vj1Var.f65492r == 0 && !z3) {
            ua0Var.f63626a = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (z2 && vj1Var.f65494s == 0) {
                ua0Var.f63626a = ConstraintWidget$DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && vj1Var.m23329u(1) && vj1Var.f65494s == 0 && !z4) {
            ua0Var.f63627b = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (z && vj1Var.f65492r == 0) {
                ua0Var.f63627b = ConstraintWidget$DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (vj1Var.mo12813B()) {
            ua0Var.f63626a = ConstraintWidget$DimensionBehaviour.FIXED;
            z = false;
        }
        if (vj1Var.mo12814C()) {
            ua0Var.f63627b = ConstraintWidget$DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                ua0Var.f63626a = ConstraintWidget$DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ua0Var.f63627b;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                    i2 = ua0Var.f63629d;
                } else {
                    ua0Var.f63626a = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    ij1Var.m13942b(vj1Var, ua0Var);
                    i2 = ua0Var.f63631f;
                }
                ua0Var.f63626a = constraintWidget$DimensionBehaviour4;
                ua0Var.f63628c = (int) (vj1Var.f65455X * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                ua0Var.f63627b = ConstraintWidget$DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ua0Var.f63626a;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour6) {
                    i = ua0Var.f63628c;
                } else {
                    ua0Var.f63627b = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    ij1Var.m13942b(vj1Var, ua0Var);
                    i = ua0Var.f63630e;
                }
                ua0Var.f63627b = constraintWidget$DimensionBehaviour6;
                int i4 = vj1Var.f65456Y;
                float f = vj1Var.f65455X;
                if (i4 == -1) {
                    ua0Var.f63629d = (int) (i / f);
                } else {
                    ua0Var.f63629d = (int) (f * i);
                }
            }
        }
        ij1Var.m13942b(vj1Var, ua0Var);
        vj1Var.m23313P(ua0Var.f63630e);
        vj1Var.m23310M(ua0Var.f63631f);
        vj1Var.f65436E = ua0Var.f63633h;
        vj1Var.m23307J(ua0Var.f63632g);
        ua0Var.f63635j = 0;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: D */
    public final void mo23303D() {
        this.f66923z0.m12503t();
        this.f66902A0 = 0;
        this.f66903B0 = 0;
        this.f66917t0.clear();
        super.mo23303D();
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: G */
    public final void mo23306G(C3309ls c3309ls) {
        super.mo23306G(c3309ls);
        int size = this.f66917t0.size();
        for (int i = 0; i < size; i++) {
            ((vj1) this.f66917t0.get(i)).mo23306G(c3309ls);
        }
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: Q */
    public final void mo23314Q(boolean z, boolean z2) {
        super.mo23314Q(z, z2);
        int size = this.f66917t0.size();
        for (int i = 0; i < size; i++) {
            ((vj1) this.f66917t0.get(i)).mo23314Q(z, z2);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m24004S(vj1 vj1Var, int i) {
        if (i == 0) {
            int i2 = this.f66904C0 + 1;
            lp0[] lp0VarArr = this.f66907F0;
            if (i2 >= lp0VarArr.length) {
                this.f66907F0 = (lp0[]) Arrays.copyOf(lp0VarArr, lp0VarArr.length * 2);
            }
            lp0[] lp0VarArr2 = this.f66907F0;
            int i3 = this.f66904C0;
            lp0VarArr2[i3] = new lp0(vj1Var, 0, this.f66922y0);
            this.f66904C0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f66905D0 + 1;
            lp0[] lp0VarArr3 = this.f66906E0;
            if (i4 >= lp0VarArr3.length) {
                this.f66906E0 = (lp0[]) Arrays.copyOf(lp0VarArr3, lp0VarArr3.length * 2);
            }
            lp0[] lp0VarArr4 = this.f66906E0;
            int i5 = this.f66905D0;
            lp0VarArr4[i5] = new lp0(vj1Var, 1, this.f66922y0);
            this.f66905D0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m24005T(gd5 gd5Var) {
        wj1 wj1Var;
        gd5 gd5Var2;
        boolean zM24008X = m24008X(64);
        mo10149b(gd5Var, zM24008X);
        int size = this.f66917t0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            vj1 vj1Var = (vj1) this.f66917t0.get(i);
            boolean[] zArr = vj1Var.f65450S;
            zArr[0] = false;
            zArr[1] = false;
            if (vj1Var instanceof l80) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                vj1 vj1Var2 = (vj1) this.f66917t0.get(i2);
                if (vj1Var2 instanceof l80) {
                    l80 l80Var = (l80) vj1Var2;
                    for (int i3 = 0; i3 < l80Var.f54931u0; i3++) {
                        vj1 vj1Var3 = l80Var.f54930t0[i3];
                        if (l80Var.f49286w0 || vj1Var3.mo12818c()) {
                            int i4 = l80Var.f49285v0;
                            if (i4 == 0 || i4 == 1) {
                                vj1Var3.f65450S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                vj1Var3.f65450S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f66915N0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            vj1 vj1Var4 = (vj1) this.f66917t0.get(i5);
            vj1Var4.getClass();
            boolean z2 = vj1Var4 instanceof ewa;
            if (z2 || (vj1Var4 instanceof gq3)) {
                if (z2) {
                    hashSet.add(vj1Var4);
                } else {
                    vj1Var4.mo10149b(gd5Var, zM24008X);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ewa ewaVar = (ewa) ((vj1) it.next());
                for (int i6 = 0; i6 < ewaVar.f54931u0; i6++) {
                    if (hashSet.contains(ewaVar.f54930t0[i6])) {
                        ewaVar.mo10149b(gd5Var, zM24008X);
                        hashSet.remove(ewaVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((vj1) it2.next()).mo10149b(gd5Var, zM24008X);
                }
                hashSet.clear();
            }
        }
        if (gd5.f40570q) {
            HashSet<vj1> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                vj1 vj1Var5 = (vj1) this.f66917t0.get(i7);
                vj1Var5.getClass();
                if (!(vj1Var5 instanceof ewa) && !(vj1Var5 instanceof gq3)) {
                    hashSet2.add(vj1Var5);
                }
            }
            wj1Var = this;
            gd5Var2 = gd5Var;
            wj1Var.m23315a(this, gd5Var2, hashSet2, this.f65451T[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (vj1 vj1Var6 : hashSet2) {
                AbstractC3423or.m18264l(wj1Var, gd5Var2, vj1Var6);
                vj1Var6.mo10149b(gd5Var2, zM24008X);
            }
        } else {
            wj1Var = this;
            gd5Var2 = gd5Var;
            for (int i8 = 0; i8 < size; i8++) {
                vj1 vj1Var7 = (vj1) wj1Var.f66917t0.get(i8);
                if (vj1Var7 instanceof wj1) {
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var7.f65451T;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        vj1Var7.m23311N(ConstraintWidget$DimensionBehaviour.FIXED);
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        vj1Var7.m23312O(ConstraintWidget$DimensionBehaviour.FIXED);
                    }
                    vj1Var7.mo10149b(gd5Var2, zM24008X);
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        vj1Var7.m23311N(constraintWidget$DimensionBehaviour);
                    }
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        vj1Var7.m23312O(constraintWidget$DimensionBehaviour2);
                    }
                } else {
                    AbstractC3423or.m18264l(wj1Var, gd5Var2, vj1Var7);
                    if (!(vj1Var7 instanceof ewa) && !(vj1Var7 instanceof gq3)) {
                        vj1Var7.mo10149b(gd5Var2, zM24008X);
                    }
                }
            }
        }
        if (wj1Var.f66904C0 > 0) {
            o5d.m17809a(wj1Var, gd5Var2, null, 0);
        }
        if (wj1Var.f66905D0 > 0) {
            o5d.m17809a(wj1Var, gd5Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX INFO: renamed from: U */
    public final boolean m24006U(int i, boolean z) {
        boolean z2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        sb2 sb2Var = this.f66919v0;
        ArrayList<AbstractC0473h> arrayList = (ArrayList) sb2Var.f60616f;
        wj1 wj1Var = (wj1) sb2Var.f60614d;
        boolean z3 = false;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k = wj1Var.m23321k(0);
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k2 = wj1Var.m23321k(1);
        int iM23327s = wj1Var.m23327s();
        int iM23328t = wj1Var.m23328t();
        if (z && (constraintWidget$DimensionBehaviourM23321k == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || constraintWidget$DimensionBehaviourM23321k2 == constraintWidget$DimensionBehaviour)) {
            for (AbstractC0473h abstractC0473h : arrayList) {
                if (abstractC0473h.f5355f == i && !abstractC0473h.mo1918k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && constraintWidget$DimensionBehaviourM23321k == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                    wj1Var.m23311N(ConstraintWidget$DimensionBehaviour.FIXED);
                    wj1Var.m23313P(sb2Var.m21197e(wj1Var, 0));
                    wj1Var.f65464d.f5354e.mo1914d(wj1Var.m23326r());
                }
            } else if (z && constraintWidget$DimensionBehaviourM23321k2 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                wj1Var.m23312O(ConstraintWidget$DimensionBehaviour.FIXED);
                wj1Var.m23310M(sb2Var.m21197e(wj1Var, 1));
                wj1Var.f65466e.f5354e.mo1914d(wj1Var.m23322l());
            }
        }
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = wj1Var.f65451T;
        if (i == 0) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[0];
            if (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                int iM23326r = wj1Var.m23326r() + iM23327s;
                wj1Var.f65464d.f5358i.mo1914d(iM23326r);
                wj1Var.f65464d.f5354e.mo1914d(iM23326r - iM23327s);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[1];
            if (constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
                int iM23322l = wj1Var.m23322l() + iM23328t;
                wj1Var.f65466e.f5358i.mo1914d(iM23322l);
                wj1Var.f65466e.f5354e.mo1914d(iM23322l - iM23328t);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        sb2Var.m21200i();
        for (AbstractC0473h abstractC0473h2 : arrayList) {
            if (abstractC0473h2.f5355f == i && (abstractC0473h2.f5351b != wj1Var || abstractC0473h2.f5356g)) {
                abstractC0473h2.mo1916e();
            }
        }
        for (AbstractC0473h abstractC0473h3 : arrayList) {
            if (abstractC0473h3.f5355f == i && (z2 || abstractC0473h3.f5351b != wj1Var)) {
                if (!abstractC0473h3.f5357h.f5341j || !abstractC0473h3.f5358i.f5341j || (!(abstractC0473h3 instanceof mp0) && !abstractC0473h3.f5354e.f5341j)) {
                    wj1Var.m23311N(constraintWidget$DimensionBehaviourM23321k);
                    wj1Var.m23312O(constraintWidget$DimensionBehaviourM23321k2);
                    return z3;
                }
            }
        }
        z3 = true;
        wj1Var.m23311N(constraintWidget$DimensionBehaviourM23321k);
        wj1Var.m23312O(constraintWidget$DimensionBehaviourM23321k2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:360:0x0639  */
    /* JADX WARN: Code duplicated, block: B:374:0x0672  */
    /* JADX WARN: Code duplicated, block: B:398:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:403:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:410:0x06de  */
    /* JADX WARN: Code duplicated, block: B:413:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:415:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:419:0x0703  */
    /* JADX WARN: Code duplicated, block: B:422:0x0715 A[Catch: Exception -> 0x0723, LOOP:12: B:421:0x0713->B:422:0x0715, LOOP_END, TryCatch #4 {Exception -> 0x0723, blocks: (B:420:0x0707, B:422:0x0715, B:425:0x0729), top: B:539:0x0707 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x075a  */
    /* JADX WARN: Code duplicated, block: B:441:0x0760 A[Catch: Exception -> 0x0751, TryCatch #5 {Exception -> 0x0751, blocks: (B:432:0x074a, B:439:0x075c, B:441:0x0760, B:443:0x0766, B:444:0x077f, B:446:0x0783, B:448:0x0789, B:452:0x079e, B:455:0x07a9, B:457:0x07ad, B:459:0x07b3), top: B:541:0x074a }] */
    /* JADX WARN: Code duplicated, block: B:446:0x0783 A[Catch: Exception -> 0x0751, TryCatch #5 {Exception -> 0x0751, blocks: (B:432:0x074a, B:439:0x075c, B:441:0x0760, B:443:0x0766, B:444:0x077f, B:446:0x0783, B:448:0x0789, B:452:0x079e, B:455:0x07a9, B:457:0x07ad, B:459:0x07b3), top: B:541:0x074a }] */
    /* JADX WARN: Code duplicated, block: B:455:0x07a9 A[Catch: Exception -> 0x0751, PHI: r23
      0x07a9: PHI (r23v7 bj1) = (r23v2 bj1), (r23v2 bj1), (r23v9 bj1) binds: [B:445:0x0781, B:447:0x0787, B:452:0x079e] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {Exception -> 0x0751, blocks: (B:432:0x074a, B:439:0x075c, B:441:0x0760, B:443:0x0766, B:444:0x077f, B:446:0x0783, B:448:0x0789, B:452:0x079e, B:455:0x07a9, B:457:0x07ad, B:459:0x07b3), top: B:541:0x074a }] */
    /* JADX WARN: Code duplicated, block: B:457:0x07ad A[Catch: Exception -> 0x0751, TryCatch #5 {Exception -> 0x0751, blocks: (B:432:0x074a, B:439:0x075c, B:441:0x0760, B:443:0x0766, B:444:0x077f, B:446:0x0783, B:448:0x0789, B:452:0x079e, B:455:0x07a9, B:457:0x07ad, B:459:0x07b3), top: B:541:0x074a }] */
    /* JADX WARN: Code duplicated, block: B:467:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:472:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:474:0x080a  */
    /* JADX WARN: Code duplicated, block: B:476:0x081e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0822  */
    /* JADX WARN: Code duplicated, block: B:481:0x082e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0835 A[LOOP:15: B:482:0x0833->B:483:0x0835, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:487:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:492:0x0853 A[LOOP:14: B:491:0x0851->B:492:0x0853, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x0889  */
    /* JADX WARN: Code duplicated, block: B:499:0x089c  */
    /* JADX WARN: Code duplicated, block: B:504:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:507:0x08da  */
    /* JADX WARN: Code duplicated, block: B:508:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:510:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:512:0x08f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:515:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:518:0x090f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:522:0x0927 A[PHI: r10 r13
      0x0927: PHI (r10v7 ??) = (r10v6 ??), (r10v9 ??), (r10v9 ??), (r10v9 ??) binds: [B:509:0x08e8, B:517:0x090d, B:518:0x090f, B:520:0x0915] A[DONT_GENERATE, DONT_INLINE]
      0x0927: PHI (r13v6 boolean) = (r13v5 boolean), (r13v8 boolean), (r13v8 boolean), (r13v8 boolean) binds: [B:509:0x08e8, B:517:0x090d, B:518:0x090f, B:520:0x0915] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:524:0x092c  */
    /* JADX WARN: Code duplicated, block: B:528:0x093a  */
    /* JADX WARN: Code duplicated, block: B:589:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x092d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v110 */
    /* JADX WARN: Type inference failed for: r14v111 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [vj1, wj1] */
    /* JADX INFO: renamed from: V */
    public final void m24007V() {
        boolean[] zArr;
        char c;
        bj1 bj1Var;
        int i;
        boolean z;
        boolean z2;
        char c2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        boolean z3;
        int i2;
        boolean zM24008X;
        boolean z4;
        int i3;
        ?? r14;
        int i4;
        boolean z5;
        ?? r15;
        int i5;
        boolean z6;
        int iMax;
        boolean z7;
        int iMax2;
        ?? r16;
        ?? r10;
        ?? r17;
        int i6;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4;
        int i7;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5;
        boolean zM24008X2;
        int size;
        boolean z8;
        int i8;
        vj1 vj1Var;
        ?? r18;
        int i9;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        vj1 vj1Var2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6;
        k4b k4bVar;
        k4b k4bVar2;
        int iM14848e;
        int iM14848e2;
        int i10;
        k4b k4bVar3;
        k4b k4bVar4;
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        int i12;
        boolean[] zArr2 = AbstractC3423or.f54767e;
        this.f65457Z = 0;
        this.f65459a0 = 0;
        this.f66909H0 = false;
        this.f66910I0 = false;
        int size2 = this.f66917t0.size();
        int iMax7 = Math.max(0, m23326r());
        int iMax8 = Math.max(0, m23322l());
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = this.f65451T;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = constraintWidget$DimensionBehaviourArr[1];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = constraintWidget$DimensionBehaviourArr[0];
        int i13 = this.f66920w0;
        bj1 bj1Var2 = this.f65441J;
        bj1 bj1Var3 = this.f65440I;
        if (i13 == 0 && AbstractC3423or.m18270o(this.f66908G0, 1)) {
            ij1 ij1Var = this.f66921x0;
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = this.f65451T;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = constraintWidget$DimensionBehaviourArr2[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = constraintWidget$DimensionBehaviourArr2[1];
            m23305F();
            ArrayList arrayList4 = this.f66917t0;
            int size3 = arrayList4.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((vj1) arrayList4.get(i14)).m23305F();
            }
            boolean z10 = this.f66922y0;
            if (constraintWidget$DimensionBehaviour9 == ConstraintWidget$DimensionBehaviour.FIXED) {
                m23308K(0, m23326r());
            } else {
                bj1Var3.m3768l(0);
                this.f65457Z = 0;
            }
            boolean z11 = false;
            int i15 = 0;
            boolean z12 = false;
            while (i15 < size3) {
                boolean[] zArr3 = zArr2;
                vj1 vj1Var3 = (vj1) arrayList4.get(i15);
                boolean z13 = z11;
                if (vj1Var3 instanceof gq3) {
                    gq3 gq3Var = (gq3) vj1Var3;
                    i12 = i15;
                    if (gq3Var.f41183x0 == 1) {
                        int i16 = gq3Var.f41180u0;
                        if (i16 != -1) {
                            gq3Var.m12816S(i16);
                        } else if (gq3Var.f41181v0 != -1 && mo12813B()) {
                            gq3Var.m12816S(m23326r() - gq3Var.f41181v0);
                        } else if (mo12813B()) {
                            gq3Var.m12816S((int) ((gq3Var.f41179t0 * m23326r()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    i12 = i15;
                    if ((vj1Var3 instanceof l80) && ((l80) vj1Var3).m16018W() == 0) {
                        z11 = z13;
                        z12 = true;
                    }
                    i15 = i12 + 1;
                    zArr2 = zArr3;
                }
                z11 = z13;
                i15 = i12 + 1;
                zArr2 = zArr3;
            }
            zArr = zArr2;
            if (z11) {
                for (int i17 = 0; i17 < size3; i17 = i11 + 1) {
                    vj1 vj1Var4 = (vj1) arrayList4.get(i17);
                    if (vj1Var4 instanceof gq3) {
                        gq3 gq3Var2 = (gq3) vj1Var4;
                        i11 = i17;
                        if (gq3Var2.f41183x0 == 1) {
                            l70.m15959v(0, ij1Var, gq3Var2, z10);
                        }
                    } else {
                        i11 = i17;
                    }
                }
            }
            l70.m15959v(0, ij1Var, this, z10);
            if (z12) {
                for (int i18 = 0; i18 < size3; i18++) {
                    vj1 vj1Var5 = (vj1) arrayList4.get(i18);
                    if (vj1Var5 instanceof l80) {
                        l80 l80Var = (l80) vj1Var5;
                        if (l80Var.m16018W() == 0 && l80Var.m16017V()) {
                            l70.m15959v(1, ij1Var, l80Var, z10);
                        }
                    }
                }
            }
            if (constraintWidget$DimensionBehaviour10 == ConstraintWidget$DimensionBehaviour.FIXED) {
                m23309L(0, m23322l());
            } else {
                bj1Var2.m3768l(0);
                this.f65459a0 = 0;
            }
            int i19 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i19 < size3) {
                vj1 vj1Var6 = (vj1) arrayList4.get(i19);
                int i20 = i19;
                if (vj1Var6 instanceof gq3) {
                    gq3 gq3Var3 = (gq3) vj1Var6;
                    if (gq3Var3.f41183x0 == 0) {
                        int i21 = gq3Var3.f41180u0;
                        if (i21 != -1) {
                            gq3Var3.m12816S(i21);
                        } else if (gq3Var3.f41181v0 != -1 && mo12814C()) {
                            gq3Var3.m12816S(m23322l() - gq3Var3.f41181v0);
                        } else if (mo12814C()) {
                            gq3Var3.m12816S((int) ((gq3Var3.f41179t0 * m23322l()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else if ((vj1Var6 instanceof l80) && ((l80) vj1Var6).m16018W() == 1) {
                    z15 = true;
                }
                i19 = i20 + 1;
            }
            if (z14) {
                for (int i22 = 0; i22 < size3; i22++) {
                    vj1 vj1Var7 = (vj1) arrayList4.get(i22);
                    if (vj1Var7 instanceof gq3) {
                        gq3 gq3Var4 = (gq3) vj1Var7;
                        if (gq3Var4.f41183x0 == 0) {
                            l70.m15923N(1, ij1Var, gq3Var4);
                        }
                    }
                }
            }
            l70.m15923N(0, ij1Var, this);
            if (z15) {
                for (int i23 = 0; i23 < size3; i23++) {
                    vj1 vj1Var8 = (vj1) arrayList4.get(i23);
                    if (vj1Var8 instanceof l80) {
                        l80 l80Var2 = (l80) vj1Var8;
                        if (l80Var2.m16018W() == 1 && l80Var2.m16017V()) {
                            l70.m15923N(1, ij1Var, l80Var2);
                        }
                    }
                }
            }
            for (int i24 = 0; i24 < size3; i24++) {
                vj1 vj1Var9 = (vj1) arrayList4.get(i24);
                if (vj1Var9.m23302A() && l70.m15941d(vj1Var9)) {
                    m24003W(vj1Var9, ij1Var, l70.f49234e);
                    if (!(vj1Var9 instanceof gq3)) {
                        l70.m15959v(0, ij1Var, vj1Var9, z10);
                        l70.m15923N(0, ij1Var, vj1Var9);
                    } else if (((gq3) vj1Var9).f41183x0 == 0) {
                        l70.m15923N(0, ij1Var, vj1Var9);
                    } else {
                        l70.m15959v(0, ij1Var, vj1Var9, z10);
                    }
                }
            }
            for (int i25 = 0; i25 < size2; i25++) {
                vj1 vj1Var10 = (vj1) this.f66917t0.get(i25);
                if (vj1Var10.m23302A() && !(vj1Var10 instanceof gq3) && !(vj1Var10 instanceof l80) && !(vj1Var10 instanceof ewa) && !vj1Var10.f65437F) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k = vj1Var10.m23321k(0);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviourM23321k2 = vj1Var10.m23321k(1);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviourM23321k != constraintWidget$DimensionBehaviour11 || vj1Var10.f65492r == 1 || constraintWidget$DimensionBehaviourM23321k2 != constraintWidget$DimensionBehaviour11 || vj1Var10.f65494s == 1) {
                        m24003W(vj1Var10, this.f66921x0, new ua0());
                    }
                }
            }
        } else {
            zArr = zArr2;
        }
        char c3 = 2;
        gd5 gd5Var = this.f66923z0;
        if (size2 > 2 && ((constraintWidget$DimensionBehaviour8 == (constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) || constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour6) && AbstractC3423or.m18270o(this.f66908G0, 1024))) {
            ij1 ij1Var2 = this.f66921x0;
            ArrayList arrayList5 = this.f66917t0;
            int size4 = arrayList5.size();
            int i26 = 0;
            while (true) {
                if (i26 >= size4) {
                    c = c3;
                    bj1Var = bj1Var3;
                    int i27 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i27 < size4) {
                        int i28 = i27;
                        vj1 vj1Var11 = (vj1) arrayList5.get(i27);
                        ArrayList arrayList12 = arrayList6;
                        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr3 = this.f65451T;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviourArr3[0];
                        ArrayList arrayList13 = arrayList7;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = constraintWidget$DimensionBehaviourArr3[1];
                        ArrayList arrayList14 = arrayList8;
                        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr4 = vj1Var11.f65451T;
                        ArrayList arrayList15 = arrayList9;
                        if (!bna.m3910A0(constraintWidget$DimensionBehaviour12, constraintWidget$DimensionBehaviour13, constraintWidget$DimensionBehaviourArr4[0], constraintWidget$DimensionBehaviourArr4[1])) {
                            m24003W(vj1Var11, ij1Var2, this.f66916O0);
                        }
                        boolean z16 = vj1Var11 instanceof gq3;
                        if (z16) {
                            gq3 gq3Var5 = (gq3) vj1Var11;
                            if (gq3Var5.f41183x0 == 0) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(gq3Var5);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            z9 = z16;
                            if (gq3Var5.f41183x0 == 1) {
                                arrayList = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList.add(gq3Var5);
                            } else {
                                arrayList = arrayList12;
                            }
                        } else {
                            z9 = z16;
                            arrayList = arrayList12;
                            arrayList8 = arrayList14;
                        }
                        if (!(vj1Var11 instanceof os3)) {
                            arrayList7 = arrayList13;
                            arrayList9 = arrayList15;
                        } else if (vj1Var11 instanceof l80) {
                            l80 l80Var3 = (l80) vj1Var11;
                            if (l80Var3.m16018W() == 0) {
                                arrayList2 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList2.add(l80Var3);
                            } else {
                                arrayList2 = arrayList13;
                            }
                            if (l80Var3.m16018W() == 1) {
                                arrayList3 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList3.add(l80Var3);
                            } else {
                                arrayList3 = arrayList15;
                            }
                            arrayList7 = arrayList2;
                            arrayList9 = arrayList3;
                        } else {
                            os3 os3Var = (os3) vj1Var11;
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(os3Var);
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(os3Var);
                        }
                        if (vj1Var11.f65440I.f8582f == null && vj1Var11.f65442K.f8582f == null && !z9 && !(vj1Var11 instanceof l80)) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList16 = arrayList10;
                            arrayList16.add(vj1Var11);
                            arrayList10 = arrayList16;
                        }
                        if (vj1Var11.f65441J.f8582f == null && vj1Var11.f65443L.f8582f == null && vj1Var11.f65444M.f8582f == null && !z9 && !(vj1Var11 instanceof l80)) {
                            if (arrayList11 == null) {
                                arrayList11 = new ArrayList();
                            }
                            ArrayList arrayList17 = arrayList11;
                            arrayList17.add(vj1Var11);
                            arrayList11 = arrayList17;
                        }
                        i27 = i28 + 1;
                        arrayList6 = arrayList;
                        ij1Var2 = ij1Var2;
                    }
                    ArrayList arrayList18 = arrayList6;
                    ArrayList<os3> arrayList19 = arrayList7;
                    ArrayList arrayList20 = arrayList8;
                    ArrayList<os3> arrayList21 = arrayList9;
                    ArrayList<k4b> arrayList22 = new ArrayList();
                    if (arrayList18 != null) {
                        Iterator it = arrayList18.iterator();
                        while (it.hasNext()) {
                            bna.m3923L((gq3) it.next(), 0, arrayList22, null);
                        }
                    }
                    k4b k4bVar5 = null;
                    int i29 = 0;
                    if (arrayList19 != null) {
                        for (os3 os3Var2 : arrayList19) {
                            k4b k4bVarM3923L = bna.m3923L(os3Var2, i29, arrayList22, k4bVar5);
                            os3Var2.m18461T(i29, k4bVarM3923L, arrayList22);
                            k4bVarM3923L.m14845b(arrayList22);
                            k4bVar5 = null;
                            i29 = 0;
                        }
                    }
                    HashSet hashSet = mo12819j(ConstraintAnchor$Type.LEFT).f8577a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            bna.m3923L(((bj1) it2.next()).f8580d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet2 = mo12819j(ConstraintAnchor$Type.RIGHT).f8577a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            bna.m3923L(((bj1) it3.next()).f8580d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet3 = mo12819j(ConstraintAnchor$Type.CENTER).f8577a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            bna.m3923L(((bj1) it4.next()).f8580d, 0, arrayList22, null);
                        }
                    }
                    k4b k4bVar6 = null;
                    if (arrayList10 != null) {
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            bna.m3923L((vj1) it5.next(), 0, arrayList22, null);
                        }
                    }
                    if (arrayList20 != null) {
                        Iterator it6 = arrayList20.iterator();
                        while (it6.hasNext()) {
                            bna.m3923L((gq3) it6.next(), 1, arrayList22, null);
                        }
                    }
                    int i30 = 1;
                    if (arrayList21 != null) {
                        for (os3 os3Var3 : arrayList21) {
                            k4b k4bVarM3923L2 = bna.m3923L(os3Var3, i30, arrayList22, k4bVar6);
                            os3Var3.m18461T(i30, k4bVarM3923L2, arrayList22);
                            k4bVarM3923L2.m14845b(arrayList22);
                            k4bVar6 = null;
                            i30 = 1;
                        }
                    }
                    HashSet hashSet4 = mo12819j(ConstraintAnchor$Type.TOP).f8577a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            bna.m3923L(((bj1) it7.next()).f8580d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet5 = mo12819j(ConstraintAnchor$Type.BASELINE).f8577a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            bna.m3923L(((bj1) it8.next()).f8580d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet6 = mo12819j(ConstraintAnchor$Type.BOTTOM).f8577a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            bna.m3923L(((bj1) it9.next()).f8580d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet7 = mo12819j(ConstraintAnchor$Type.CENTER).f8577a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            bna.m3923L(((bj1) it10.next()).f8580d, 1, arrayList22, null);
                        }
                    }
                    if (arrayList11 != null) {
                        Iterator it11 = arrayList11.iterator();
                        while (it11.hasNext()) {
                            bna.m3923L((vj1) it11.next(), 1, arrayList22, null);
                        }
                    }
                    int i31 = 0;
                    while (i31 < size4) {
                        vj1 vj1Var12 = (vj1) arrayList5.get(i31);
                        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr5 = vj1Var12.f65451T;
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour14 = constraintWidget$DimensionBehaviourArr5[0];
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour15 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        if (constraintWidget$DimensionBehaviour14 == constraintWidget$DimensionBehaviour15 && constraintWidget$DimensionBehaviourArr5[1] == constraintWidget$DimensionBehaviour15) {
                            int i32 = vj1Var12.f65493r0;
                            int size5 = arrayList22.size();
                            int i33 = 0;
                            while (true) {
                                if (i33 >= size5) {
                                    i10 = i31;
                                    k4bVar3 = null;
                                    break;
                                }
                                k4b k4bVar7 = (k4b) arrayList22.get(i33);
                                i10 = i31;
                                if (i32 == k4bVar7.m14846c()) {
                                    k4bVar3 = k4bVar7;
                                    break;
                                } else {
                                    i33++;
                                    i31 = i10;
                                }
                            }
                            int i34 = vj1Var12.f65495s0;
                            int size6 = arrayList22.size();
                            int i35 = 0;
                            while (true) {
                                if (i35 >= size6) {
                                    k4bVar4 = null;
                                    break;
                                }
                                k4bVar4 = (k4b) arrayList22.get(i35);
                                int i36 = size6;
                                if (i34 == k4bVar4.m14846c()) {
                                    break;
                                }
                                i35++;
                                size6 = i36;
                            }
                            if (k4bVar3 != null && k4bVar4 != null) {
                                k4bVar3.m14849f(0, k4bVar4);
                                k4bVar4.m14850g();
                                arrayList22.remove(k4bVar3);
                            }
                        } else {
                            i10 = i31;
                        }
                        i31 = i10 + 1;
                    }
                    if (arrayList22.size() > 1) {
                        if (this.f65451T[0] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                            int i37 = 0;
                            k4bVar = null;
                            for (k4b k4bVar8 : arrayList22) {
                                if (k4bVar8.m14847d() != 1 && (iM14848e2 = k4bVar8.m14848e(gd5Var, 0)) > i37) {
                                    k4bVar = k4bVar8;
                                    i37 = iM14848e2;
                                }
                            }
                            if (k4bVar != null) {
                                m23311N(ConstraintWidget$DimensionBehaviour.FIXED);
                                m23313P(i37);
                            } else {
                                k4bVar = null;
                            }
                        } else {
                            k4bVar = null;
                        }
                        if (this.f65451T[1] == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) {
                            int i38 = 0;
                            k4bVar2 = null;
                            for (k4b k4bVar9 : arrayList22) {
                                if (k4bVar9.m14847d() != 0 && (iM14848e = k4bVar9.m14848e(gd5Var, 1)) > i38) {
                                    k4bVar2 = k4bVar9;
                                    i38 = iM14848e;
                                }
                            }
                            if (k4bVar2 != null) {
                                m23312O(ConstraintWidget$DimensionBehaviour.FIXED);
                                m23310M(i38);
                            } else {
                                k4bVar2 = null;
                            }
                        } else {
                            k4bVar2 = null;
                        }
                        if (k4bVar != null || k4bVar2 != null) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour16 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour16) {
                                if (iMax7 >= m23326r() || iMax7 <= 0) {
                                    iMax7 = m23326r();
                                } else {
                                    m23313P(iMax7);
                                    this.f66909H0 = true;
                                }
                            }
                            if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour16) {
                                if (iMax8 >= m23322l() || iMax8 <= 0) {
                                    iMax8 = m23322l();
                                } else {
                                    m23310M(iMax8);
                                    this.f66910I0 = true;
                                }
                            }
                            i = iMax7;
                            z = true;
                            break;
                        }
                    }
                } else {
                    vj1 vj1Var13 = (vj1) arrayList5.get(i26);
                    c = c3;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr6 = this.f65451T;
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour17 = constraintWidget$DimensionBehaviourArr6[0];
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour18 = constraintWidget$DimensionBehaviourArr6[1];
                    int i39 = i26;
                    ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr7 = vj1Var13.f65451T;
                    bj1Var = bj1Var3;
                    if (bna.m3910A0(constraintWidget$DimensionBehaviour17, constraintWidget$DimensionBehaviour18, constraintWidget$DimensionBehaviourArr7[0], constraintWidget$DimensionBehaviourArr7[1]) && !(vj1Var13 instanceof d83)) {
                        i26 = i39 + 1;
                        c3 = c;
                        bj1Var3 = bj1Var;
                    }
                }
            }
            if (!m24008X(64) || m24008X(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            gd5Var.getClass();
            gd5Var.f40578h = false;
            if (this.f66908G0 == 0 && z2) {
                c2 = 1;
                gd5Var.f40578h = true;
            } else {
                c2 = 1;
            }
            ArrayList arrayList23 = this.f66917t0;
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr8 = this.f65451T;
            constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr8[0];
            constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
            if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr8[c2] == constraintWidget$DimensionBehaviour2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f66904C0 = 0;
            this.f66905D0 = 0;
            for (i2 = 0; i2 < size2; i2++) {
                vj1Var2 = (vj1) this.f66917t0.get(i2);
                if (vj1Var2 instanceof wj1) {
                    ((wj1) vj1Var2).m24007V();
                }
            }
            zM24008X = m24008X(64);
            z4 = z;
            i3 = 0;
            r14 = 1;
            while (r14 != 0) {
                i4 = i3 + 1;
                try {
                    gd5Var.m12503t();
                    this.f66904C0 = 0;
                    this.f66905D0 = 0;
                    m23319h(gd5Var);
                    for (i9 = 0; i9 < size2; i9++) {
                        ((vj1) this.f66917t0.get(i9)).m23319h(gd5Var);
                    }
                    m24005T(gd5Var);
                    try {
                        weakReference = this.f66911J0;
                        if (weakReference != null || weakReference.get() == null) {
                            z5 = z3;
                        } else {
                            z5 = z3;
                            try {
                                gd5Var.m12490f(gd5Var.m12495k((bj1) this.f66911J0.get()), gd5Var.m12495k(bj1Var2), 0, 5);
                                this.f66911J0 = null;
                            } catch (Exception e) {
                                e = e;
                                r18 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r18;
                                if (r15 != 0) {
                                    zArr[c] = false;
                                    zM24008X2 = m24008X(64);
                                    mo12815R(gd5Var, zM24008X2);
                                    size = this.f66917t0.size();
                                    z8 = false;
                                    i8 = 0;
                                    while (i8 < size) {
                                        vj1Var = (vj1) this.f66917t0.get(i8);
                                        vj1Var.mo12815R(gd5Var, zM24008X2);
                                        boolean z17 = zM24008X2;
                                        int i40 = size;
                                        if (vj1Var.f65472h == -1) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        i8++;
                                        zM24008X2 = z17;
                                        size = i40;
                                        z8 = z8;
                                    }
                                    z6 = z8;
                                } else {
                                    mo12815R(gd5Var, zM24008X);
                                    for (i5 = 0; i5 < size2; i5++) {
                                        ((vj1) this.f66917t0.get(i5)).mo12815R(gd5Var, zM24008X);
                                    }
                                    z6 = false;
                                }
                                if (z5) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    for (i7 = 0; i7 < size2; i7++) {
                                        vj1 vj1Var14 = (vj1) this.f66917t0.get(i7);
                                        iMax4 = Math.max(iMax4, vj1Var14.m23326r() + vj1Var14.f65457Z);
                                        iMax3 = Math.max(iMax3, vj1Var14.m23322l() + vj1Var14.f65459a0);
                                    }
                                    iMax5 = Math.max(this.f65463c0, iMax4);
                                    iMax6 = Math.max(this.f65465d0, iMax3);
                                    constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                    z6 = z6;
                                    if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour5) {
                                        z6 = z6;
                                        m23313P(iMax5);
                                        this.f65451T[0] = constraintWidget$DimensionBehaviour5;
                                        z6 = true;
                                        z4 = true;
                                    }
                                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                                        m23310M(iMax6);
                                        this.f65451T[1] = constraintWidget$DimensionBehaviour5;
                                        z6 = true;
                                        z4 = true;
                                    }
                                }
                                iMax = Math.max(this.f65463c0, m23326r());
                                z7 = z6;
                                if (iMax > m23326r()) {
                                    m23313P(iMax);
                                    this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                                    z7 = true;
                                    z4 = true;
                                }
                                iMax2 = Math.max(this.f65465d0, m23322l());
                                if (iMax2 > m23322l()) {
                                    m23310M(iMax2);
                                    r16 = 1;
                                    this.f65451T[1] = ConstraintWidget$DimensionBehaviour.FIXED;
                                    r10 = 1;
                                    z4 = true;
                                } else {
                                    r16 = 1;
                                }
                                if (z4) {
                                    r10 = z7;
                                    r17 = r10;
                                    i6 = 8;
                                } else {
                                    r10 = z7;
                                    constraintWidget$DimensionBehaviour3 = this.f65451T[0];
                                    constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                                        r10 = r10;
                                        if (m23326r() > i) {
                                            this.f66909H0 = r16;
                                            this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                                            m23313P(i);
                                            ?? r11 = r16;
                                            z4 = r11 == true ? 1 : 0;
                                            r10 = r11;
                                        }
                                    }
                                    r10 = r10;
                                    r10 = r10;
                                    if (this.f65451T[r16] == constraintWidget$DimensionBehaviour4) {
                                        r10 = z7;
                                        r17 = r10;
                                        i6 = 8;
                                    } else {
                                        r10 = z7;
                                        r17 = r10;
                                        i6 = 8;
                                    }
                                }
                                if (i4 > i6) {
                                    r17 = 0;
                                }
                                i3 = i4;
                                z3 = z5;
                                bj1Var2 = bj1Var2;
                                r14 = r17;
                            }
                        }
                        weakReference2 = this.f66913L0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            gd5Var.m12490f(gd5Var.m12495k(this.f65443L), gd5Var.m12495k((bj1) this.f66913L0.get()), 0, 5);
                            this.f66913L0 = null;
                        }
                        weakReference3 = this.f66912K0;
                        if (weakReference3 != null || weakReference3.get() == null) {
                            weakReference4 = this.f66914M0;
                            if (weakReference4 == null && weakReference4.get() != null) {
                                try {
                                    gd5Var.m12490f(gd5Var.m12495k(this.f65442K), gd5Var.m12495k((bj1) this.f66914M0.get()), 0, 5);
                                    try {
                                        this.f66914M0 = null;
                                    } catch (Exception e2) {
                                        e = e2;
                                        r18 = 1;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        r15 = r18;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    r18 = 1;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    r15 = r18;
                                    if (r15 != 0) {
                                        zArr[c] = false;
                                        zM24008X2 = m24008X(64);
                                        mo12815R(gd5Var, zM24008X2);
                                        size = this.f66917t0.size();
                                        z8 = false;
                                        i8 = 0;
                                        while (i8 < size) {
                                            vj1Var = (vj1) this.f66917t0.get(i8);
                                            vj1Var.mo12815R(gd5Var, zM24008X2);
                                            boolean z18 = zM24008X2;
                                            int i41 = size;
                                            if (vj1Var.f65472h == -1) {
                                                z8 = true;
                                            } else {
                                                z8 = true;
                                            }
                                            i8++;
                                            zM24008X2 = z18;
                                            size = i41;
                                            z8 = z8;
                                        }
                                        z6 = z8;
                                    } else {
                                        mo12815R(gd5Var, zM24008X);
                                        while (i5 < size2) {
                                            ((vj1) this.f66917t0.get(i5)).mo12815R(gd5Var, zM24008X);
                                        }
                                        z6 = false;
                                    }
                                    if (z5) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i7 < size2) {
                                            vj1 vj1Var15 = (vj1) this.f66917t0.get(i7);
                                            iMax4 = Math.max(iMax4, vj1Var15.m23326r() + vj1Var15.f65457Z);
                                            iMax3 = Math.max(iMax3, vj1Var15.m23322l() + vj1Var15.f65459a0);
                                        }
                                        iMax5 = Math.max(this.f65463c0, iMax4);
                                        iMax6 = Math.max(this.f65465d0, iMax3);
                                        constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                        z6 = z6;
                                        if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour5) {
                                            z6 = z6;
                                            m23313P(iMax5);
                                            this.f65451T[0] = constraintWidget$DimensionBehaviour5;
                                            z6 = true;
                                            z4 = true;
                                        }
                                        if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                                            m23310M(iMax6);
                                            this.f65451T[1] = constraintWidget$DimensionBehaviour5;
                                            z6 = true;
                                            z4 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f65463c0, m23326r());
                                    z7 = z6;
                                    if (iMax > m23326r()) {
                                        m23313P(iMax);
                                        this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                                        z7 = true;
                                        z4 = true;
                                    }
                                    iMax2 = Math.max(this.f65465d0, m23322l());
                                    if (iMax2 > m23322l()) {
                                        m23310M(iMax2);
                                        r16 = 1;
                                        this.f65451T[1] = ConstraintWidget$DimensionBehaviour.FIXED;
                                        r10 = 1;
                                        z4 = true;
                                    } else {
                                        r16 = 1;
                                    }
                                    if (z4) {
                                        r10 = z7;
                                        constraintWidget$DimensionBehaviour3 = this.f65451T[0];
                                        constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                        if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                                            r10 = r10;
                                            if (m23326r() > i) {
                                                this.f66909H0 = r16;
                                                this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                                                m23313P(i);
                                                ?? r12 = r16;
                                                z4 = r12 == true ? 1 : 0;
                                                r10 = r12;
                                            }
                                        }
                                        r10 = r10;
                                        r10 = r10;
                                        if (this.f65451T[r16] == constraintWidget$DimensionBehaviour4) {
                                            r10 = z7;
                                            r17 = r10;
                                            i6 = 8;
                                        } else {
                                            r10 = z7;
                                            r17 = r10;
                                            i6 = 8;
                                        }
                                    } else {
                                        r10 = z7;
                                        r17 = r10;
                                        i6 = 8;
                                    }
                                    if (i4 > i6) {
                                        r17 = 0;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    bj1Var2 = bj1Var2;
                                    r14 = r17;
                                }
                            }
                            gd5Var.m12499p();
                            r15 = 1;
                        } else {
                            bj1 bj1Var4 = bj1Var;
                            try {
                                bj1Var = bj1Var4;
                                gd5Var.m12490f(gd5Var.m12495k((bj1) this.f66912K0.get()), gd5Var.m12495k(bj1Var4), 0, 5);
                                this.f66912K0 = null;
                                weakReference4 = this.f66914M0;
                                if (weakReference4 == null) {
                                }
                                gd5Var.m12499p();
                                r15 = 1;
                            } catch (Exception e4) {
                                e = e4;
                                bj1Var = bj1Var4;
                                r18 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r18;
                                if (r15 != 0) {
                                    zArr[c] = false;
                                    zM24008X2 = m24008X(64);
                                    mo12815R(gd5Var, zM24008X2);
                                    size = this.f66917t0.size();
                                    z8 = false;
                                    i8 = 0;
                                    while (i8 < size) {
                                        vj1Var = (vj1) this.f66917t0.get(i8);
                                        vj1Var.mo12815R(gd5Var, zM24008X2);
                                        boolean z19 = zM24008X2;
                                        int i42 = size;
                                        if (vj1Var.f65472h == -1) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        i8++;
                                        zM24008X2 = z19;
                                        size = i42;
                                        z8 = z8;
                                    }
                                    z6 = z8;
                                } else {
                                    mo12815R(gd5Var, zM24008X);
                                    while (i5 < size2) {
                                        ((vj1) this.f66917t0.get(i5)).mo12815R(gd5Var, zM24008X);
                                    }
                                    z6 = false;
                                }
                                if (z5) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i7 < size2) {
                                        vj1 vj1Var16 = (vj1) this.f66917t0.get(i7);
                                        iMax4 = Math.max(iMax4, vj1Var16.m23326r() + vj1Var16.f65457Z);
                                        iMax3 = Math.max(iMax3, vj1Var16.m23322l() + vj1Var16.f65459a0);
                                    }
                                    iMax5 = Math.max(this.f65463c0, iMax4);
                                    iMax6 = Math.max(this.f65465d0, iMax3);
                                    constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                    z6 = z6;
                                    if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour5) {
                                        z6 = z6;
                                        m23313P(iMax5);
                                        this.f65451T[0] = constraintWidget$DimensionBehaviour5;
                                        z6 = true;
                                        z4 = true;
                                    }
                                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                                        m23310M(iMax6);
                                        this.f65451T[1] = constraintWidget$DimensionBehaviour5;
                                        z6 = true;
                                        z4 = true;
                                    }
                                }
                                iMax = Math.max(this.f65463c0, m23326r());
                                z7 = z6;
                                if (iMax > m23326r()) {
                                    m23313P(iMax);
                                    this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                                    z7 = true;
                                    z4 = true;
                                }
                                iMax2 = Math.max(this.f65465d0, m23322l());
                                if (iMax2 > m23322l()) {
                                    m23310M(iMax2);
                                    r16 = 1;
                                    this.f65451T[1] = ConstraintWidget$DimensionBehaviour.FIXED;
                                    r10 = 1;
                                    z4 = true;
                                } else {
                                    r16 = 1;
                                }
                                if (z4) {
                                    r10 = z7;
                                    constraintWidget$DimensionBehaviour3 = this.f65451T[0];
                                    constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                                        r10 = r10;
                                        if (m23326r() > i) {
                                            this.f66909H0 = r16;
                                            this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                                            m23313P(i);
                                            ?? r13 = r16;
                                            z4 = r13 == true ? 1 : 0;
                                            r10 = r13;
                                        }
                                    }
                                    r10 = r10;
                                    r10 = r10;
                                    if (this.f65451T[r16] == constraintWidget$DimensionBehaviour4) {
                                        r10 = z7;
                                        r17 = r10;
                                        i6 = 8;
                                    } else {
                                        r10 = z7;
                                        r17 = r10;
                                        i6 = 8;
                                    }
                                } else {
                                    r10 = z7;
                                    r17 = r10;
                                    i6 = 8;
                                }
                                if (i4 > i6) {
                                    r17 = 0;
                                }
                                i3 = i4;
                                z3 = z5;
                                bj1Var2 = bj1Var2;
                                r14 = r17;
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        z5 = z3;
                    }
                } catch (Exception e6) {
                    e = e6;
                    z5 = z3;
                    r18 = r14;
                }
                if (r15 != 0) {
                    zArr[c] = false;
                    zM24008X2 = m24008X(64);
                    mo12815R(gd5Var, zM24008X2);
                    size = this.f66917t0.size();
                    z8 = false;
                    i8 = 0;
                    while (i8 < size) {
                        vj1Var = (vj1) this.f66917t0.get(i8);
                        vj1Var.mo12815R(gd5Var, zM24008X2);
                        boolean z110 = zM24008X2;
                        int i43 = size;
                        if (vj1Var.f65472h == -1 || vj1Var.f65474i != -1) {
                            z8 = true;
                        }
                        i8++;
                        zM24008X2 = z110;
                        size = i43;
                        z8 = z8;
                    }
                    z6 = z8;
                } else {
                    mo12815R(gd5Var, zM24008X);
                    while (i5 < size2) {
                        ((vj1) this.f66917t0.get(i5)).mo12815R(gd5Var, zM24008X);
                    }
                    z6 = false;
                }
                if (z5 && i4 < 8 && zArr[c]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i7 < size2) {
                        vj1 vj1Var17 = (vj1) this.f66917t0.get(i7);
                        iMax4 = Math.max(iMax4, vj1Var17.m23326r() + vj1Var17.f65457Z);
                        iMax3 = Math.max(iMax3, vj1Var17.m23322l() + vj1Var17.f65459a0);
                    }
                    iMax5 = Math.max(this.f65463c0, iMax4);
                    iMax6 = Math.max(this.f65465d0, iMax3);
                    constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    z6 = z6;
                    if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour5 && m23326r() < iMax5) {
                        z6 = z6;
                        m23313P(iMax5);
                        this.f65451T[0] = constraintWidget$DimensionBehaviour5;
                        z6 = true;
                        z4 = true;
                    }
                    if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5 && m23322l() < iMax6) {
                        m23310M(iMax6);
                        this.f65451T[1] = constraintWidget$DimensionBehaviour5;
                        z6 = true;
                        z4 = true;
                    }
                }
                iMax = Math.max(this.f65463c0, m23326r());
                z7 = z6;
                if (iMax > m23326r()) {
                    m23313P(iMax);
                    this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                    z7 = true;
                    z4 = true;
                }
                iMax2 = Math.max(this.f65465d0, m23322l());
                if (iMax2 > m23322l()) {
                    m23310M(iMax2);
                    r16 = 1;
                    this.f65451T[1] = ConstraintWidget$DimensionBehaviour.FIXED;
                    r10 = 1;
                    z4 = true;
                } else {
                    r16 = 1;
                }
                if (z4) {
                    r10 = z7;
                    constraintWidget$DimensionBehaviour3 = this.f65451T[0];
                    constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                    if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && i > 0) {
                        r10 = r10;
                        if (m23326r() > i) {
                            this.f66909H0 = r16;
                            this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                            m23313P(i);
                            ?? r19 = r16;
                            z4 = r19 == true ? 1 : 0;
                            r10 = r19;
                        }
                    }
                    r10 = r10;
                    r10 = r10;
                    if (this.f65451T[r16] == constraintWidget$DimensionBehaviour4 || iMax8 <= 0 || m23322l() <= iMax8) {
                        r10 = z7;
                        r17 = r10;
                        i6 = 8;
                    } else {
                        this.f66910I0 = r16;
                        this.f65451T[r16] = ConstraintWidget$DimensionBehaviour.FIXED;
                        m23310M(iMax8);
                        i6 = 8;
                        z4 = true;
                        r17 = 1;
                    }
                } else {
                    r10 = z7;
                    r17 = r10;
                    i6 = 8;
                }
                if (i4 > i6) {
                    r17 = 0;
                }
                i3 = i4;
                z3 = z5;
                bj1Var2 = bj1Var2;
                r14 = r17;
            }
            this.f66917t0 = arrayList23;
            if (z4) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr9 = this.f65451T;
                constraintWidget$DimensionBehaviourArr9[0] = constraintWidget$DimensionBehaviour8;
                constraintWidget$DimensionBehaviourArr9[1] = constraintWidget$DimensionBehaviour7;
            }
            mo23306G(gd5Var.f40583m);
        }
        c = 2;
        bj1Var = bj1Var3;
        i = iMax7;
        z = false;
        if (m24008X(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        gd5Var.getClass();
        gd5Var.f40578h = false;
        if (this.f66908G0 == 0) {
            c2 = 1;
        } else {
            c2 = 1;
        }
        ArrayList arrayList24 = this.f66917t0;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr10 = this.f65451T;
        constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr10[0];
        constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.f66904C0 = 0;
        this.f66905D0 = 0;
        while (i2 < size2) {
            vj1Var2 = (vj1) this.f66917t0.get(i2);
            if (vj1Var2 instanceof wj1) {
                ((wj1) vj1Var2).m24007V();
            }
        }
        zM24008X = m24008X(64);
        z4 = z;
        i3 = 0;
        r14 = 1;
        while (r14 != 0) {
            i4 = i3 + 1;
            gd5Var.m12503t();
            this.f66904C0 = 0;
            this.f66905D0 = 0;
            m23319h(gd5Var);
            while (i9 < size2) {
                ((vj1) this.f66917t0.get(i9)).m23319h(gd5Var);
            }
            m24005T(gd5Var);
            weakReference = this.f66911J0;
            if (weakReference != null) {
                z5 = z3;
                weakReference2 = this.f66913L0;
                if (weakReference2 != null) {
                    gd5Var.m12490f(gd5Var.m12495k(this.f65443L), gd5Var.m12495k((bj1) this.f66913L0.get()), 0, 5);
                    this.f66913L0 = null;
                }
                weakReference3 = this.f66912K0;
                if (weakReference3 != null) {
                    weakReference4 = this.f66914M0;
                    if (weakReference4 == null) {
                    }
                    gd5Var.m12499p();
                    r15 = 1;
                } else {
                    weakReference4 = this.f66914M0;
                    if (weakReference4 == null) {
                    }
                    gd5Var.m12499p();
                    r15 = 1;
                }
            } else {
                z5 = z3;
                weakReference2 = this.f66913L0;
                if (weakReference2 != null) {
                    gd5Var.m12490f(gd5Var.m12495k(this.f65443L), gd5Var.m12495k((bj1) this.f66913L0.get()), 0, 5);
                    this.f66913L0 = null;
                }
                weakReference3 = this.f66912K0;
                if (weakReference3 != null) {
                    weakReference4 = this.f66914M0;
                    if (weakReference4 == null) {
                    }
                    gd5Var.m12499p();
                    r15 = 1;
                } else {
                    weakReference4 = this.f66914M0;
                    if (weakReference4 == null) {
                    }
                    gd5Var.m12499p();
                    r15 = 1;
                }
            }
            if (r15 != 0) {
                zArr[c] = false;
                zM24008X2 = m24008X(64);
                mo12815R(gd5Var, zM24008X2);
                size = this.f66917t0.size();
                z8 = false;
                i8 = 0;
                while (i8 < size) {
                    vj1Var = (vj1) this.f66917t0.get(i8);
                    vj1Var.mo12815R(gd5Var, zM24008X2);
                    boolean z111 = zM24008X2;
                    int i44 = size;
                    if (vj1Var.f65472h == -1) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    i8++;
                    zM24008X2 = z111;
                    size = i44;
                    z8 = z8;
                }
                z6 = z8;
            } else {
                mo12815R(gd5Var, zM24008X);
                while (i5 < size2) {
                    ((vj1) this.f66917t0.get(i5)).mo12815R(gd5Var, zM24008X);
                }
                z6 = false;
            }
            if (z5) {
                iMax3 = 0;
                iMax4 = 0;
                while (i7 < size2) {
                    vj1 vj1Var18 = (vj1) this.f66917t0.get(i7);
                    iMax4 = Math.max(iMax4, vj1Var18.m23326r() + vj1Var18.f65457Z);
                    iMax3 = Math.max(iMax3, vj1Var18.m23322l() + vj1Var18.f65459a0);
                }
                iMax5 = Math.max(this.f65463c0, iMax4);
                iMax6 = Math.max(this.f65465d0, iMax3);
                constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                z6 = z6;
                if (constraintWidget$DimensionBehaviour8 == constraintWidget$DimensionBehaviour5) {
                    z6 = z6;
                    m23313P(iMax5);
                    this.f65451T[0] = constraintWidget$DimensionBehaviour5;
                    z6 = true;
                    z4 = true;
                }
                if (constraintWidget$DimensionBehaviour7 == constraintWidget$DimensionBehaviour5) {
                    m23310M(iMax6);
                    this.f65451T[1] = constraintWidget$DimensionBehaviour5;
                    z6 = true;
                    z4 = true;
                }
            }
            iMax = Math.max(this.f65463c0, m23326r());
            z7 = z6;
            if (iMax > m23326r()) {
                m23313P(iMax);
                this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                z7 = true;
                z4 = true;
            }
            iMax2 = Math.max(this.f65465d0, m23322l());
            if (iMax2 > m23322l()) {
                m23310M(iMax2);
                r16 = 1;
                this.f65451T[1] = ConstraintWidget$DimensionBehaviour.FIXED;
                r10 = 1;
                z4 = true;
            } else {
                r16 = 1;
            }
            if (z4) {
                r10 = z7;
                constraintWidget$DimensionBehaviour3 = this.f65451T[0];
                constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4) {
                    r10 = r10;
                    if (m23326r() > i) {
                        this.f66909H0 = r16;
                        this.f65451T[0] = ConstraintWidget$DimensionBehaviour.FIXED;
                        m23313P(i);
                        ?? r110 = r16;
                        z4 = r110 == true ? 1 : 0;
                        r10 = r110;
                    }
                }
                r10 = r10;
                r10 = r10;
                if (this.f65451T[r16] == constraintWidget$DimensionBehaviour4) {
                    r10 = z7;
                    r17 = r10;
                    i6 = 8;
                } else {
                    r10 = z7;
                    r17 = r10;
                    i6 = 8;
                }
            } else {
                r10 = z7;
                r17 = r10;
                i6 = 8;
            }
            if (i4 > i6) {
                r17 = 0;
            }
            i3 = i4;
            z3 = z5;
            bj1Var2 = bj1Var2;
            r14 = r17;
        }
        this.f66917t0 = arrayList24;
        if (z4) {
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr11 = this.f65451T;
            constraintWidget$DimensionBehaviourArr11[0] = constraintWidget$DimensionBehaviour8;
            constraintWidget$DimensionBehaviourArr11[1] = constraintWidget$DimensionBehaviour7;
        }
        mo23306G(gd5Var.f40583m);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m24008X(int i) {
        return (this.f66908G0 & i) == i;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: o */
    public final void mo23325o(StringBuilder sb) {
        sb.append(this.f65476j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f65453V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f65454W);
        sb.append("\n");
        Iterator it = this.f66917t0.iterator();
        while (it.hasNext()) {
            ((vj1) it.next()).mo23325o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
