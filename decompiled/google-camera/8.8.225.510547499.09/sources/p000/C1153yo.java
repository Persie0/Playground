package p000;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: yo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1153yo extends C1159yu {

    /* JADX INFO: renamed from: at */
    public int f48265at;

    /* JADX INFO: renamed from: au */
    public int f48266au;

    /* JADX INFO: renamed from: b */
    public int f48272b;

    /* JADX INFO: renamed from: d */
    public C1142yd f48274d;

    /* JADX INFO: renamed from: aJ */
    public final C1058va f48263aJ = new C1058va(this);

    /* JADX INFO: renamed from: a */
    public final C1163yy f48253a = new C1163yy(this);

    /* JADX INFO: renamed from: aI */
    public C1179zn f48262aI = null;

    /* JADX INFO: renamed from: c */
    public boolean f48273c = false;

    /* JADX INFO: renamed from: as */
    public final C1141yc f48264as = new C1141yc();

    /* JADX INFO: renamed from: av */
    public int f48267av = 0;

    /* JADX INFO: renamed from: aw */
    public int f48268aw = 0;

    /* JADX INFO: renamed from: ax */
    public C1149yk[] f48269ax = new C1149yk[4];

    /* JADX INFO: renamed from: ay */
    public C1149yk[] f48270ay = new C1149yk[4];

    /* JADX INFO: renamed from: az */
    public int f48271az = 257;

    /* JADX INFO: renamed from: aA */
    public boolean f48254aA = false;

    /* JADX INFO: renamed from: aB */
    public boolean f48255aB = false;

    /* JADX INFO: renamed from: aC */
    public WeakReference f48256aC = null;

    /* JADX INFO: renamed from: aD */
    public WeakReference f48257aD = null;

    /* JADX INFO: renamed from: aE */
    public WeakReference f48258aE = null;

    /* JADX INFO: renamed from: aF */
    public WeakReference f48259aF = null;

    /* JADX INFO: renamed from: aG */
    final HashSet f48260aG = new HashSet();

    /* JADX INFO: renamed from: aH */
    public final C1160yv f48261aH = new C1160yv();

    /* JADX INFO: renamed from: Z */
    public static void m19706Z(C1152yn c1152yn, C1179zn c1179zn, C1160yv c1160yv) {
        int i;
        int i2;
        if (c1179zn == null) {
            return;
        }
        if (c1152yn.f48220ai == 8 || (c1152yn instanceof C1155yq) || (c1152yn instanceof C1148yj)) {
            c1160yv.f48287c = 0;
            c1160yv.f48288d = 0;
            return;
        }
        c1160yv.f48293i = c1152yn.m19680O();
        c1160yv.f48294j = c1152yn.m19681P();
        c1160yv.f48285a = c1152yn.m19689j();
        c1160yv.f48286b = c1152yn.m19687h();
        c1160yv.f48291g = false;
        c1160yv.f48292h = 0;
        boolean z = c1160yv.f48293i == 3;
        boolean z2 = c1160yv.f48294j == 3;
        boolean z3 = z && c1152yn.f48209Y > 0.0f;
        boolean z4 = z2 && c1152yn.f48209Y > 0.0f;
        if (z && c1152yn.m19674I(0) && c1152yn.f48246t == 0 && !z3) {
            c1160yv.f48293i = 2;
            if (z2 && c1152yn.f48247u == 0) {
                c1160yv.f48293i = 1;
                z = false;
            } else {
                z = false;
            }
        }
        if (z2 && c1152yn.m19674I(1) && c1152yn.f48247u == 0 && !z4) {
            c1160yv.f48294j = 2;
            if (z && c1152yn.f48246t == 0) {
                c1160yv.f48294j = 1;
                z2 = false;
            } else {
                z2 = false;
            }
        }
        if (c1152yn.mo19648e()) {
            c1160yv.f48293i = 1;
            z = false;
        }
        if (c1152yn.mo19649f()) {
            c1160yv.f48294j = 1;
            z2 = false;
        }
        if (z3) {
            if (c1152yn.f48248v[0] == 4) {
                c1160yv.f48293i = 1;
            } else if (!z2) {
                if (c1160yv.f48294j == 1) {
                    i2 = c1160yv.f48286b;
                } else {
                    c1160yv.f48293i = 2;
                    c1179zn.m19799a(c1152yn, c1160yv);
                    i2 = c1160yv.f48288d;
                }
                c1160yv.f48293i = 1;
                c1160yv.f48285a = (int) (c1152yn.f48209Y * i2);
            }
        }
        if (z4) {
            if (c1152yn.f48248v[1] == 4) {
                c1160yv.f48294j = 1;
            } else if (!z) {
                if (c1160yv.f48293i == 1) {
                    i = c1160yv.f48285a;
                } else {
                    c1160yv.f48294j = 2;
                    c1179zn.m19799a(c1152yn, c1160yv);
                    i = c1160yv.f48287c;
                }
                c1160yv.f48294j = 1;
                if (c1152yn.f48210Z == -1) {
                    c1160yv.f48286b = (int) (i / c1152yn.f48209Y);
                } else {
                    c1160yv.f48286b = (int) (c1152yn.f48209Y * i);
                }
            }
        }
        c1179zn.m19799a(c1152yn, c1160yv);
        c1152yn.m19671F(c1160yv.f48287c);
        c1152yn.m19666A(c1160yv.f48288d);
        c1152yn.f48191G = c1160yv.f48290f;
        c1152yn.m19703x(c1160yv.f48289e);
        c1160yv.f48292h = 0;
        boolean z5 = c1160yv.f48291g;
    }

    /* JADX INFO: renamed from: ab */
    private final void m19707ab(C1151ym c1151ym, C1146yh c1146yh) {
        this.f48264as.m19628g(c1146yh, this.f48264as.m19623b(c1151ym), 0, 5);
    }

    /* JADX INFO: renamed from: ac */
    private final void m19708ac(C1151ym c1151ym, C1146yh c1146yh) {
        this.f48264as.m19628g(this.f48264as.m19623b(c1151ym), c1146yh, 0, 5);
    }

    /* JADX INFO: renamed from: ad */
    private final void m19709ad() {
        this.f48267av = 0;
        this.f48268aw = 0;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: G */
    public final void mo19672G(boolean z, boolean z2) {
        super.mo19672G(z, z2);
        int size = this.f48284aK.size();
        for (int i = 0; i < size; i++) {
            ((C1152yn) this.f48284aK.get(i)).mo19672G(z, z2);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m19710U() {
        this.f48253a.f48298b = true;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0270  */
    /* JADX WARN: Code duplicated, block: B:151:0x027b  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ad A[LOOP:25: B:150:0x0279->B:157:0x02ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:170:0x0305 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0307  */
    /* JADX WARN: Code duplicated, block: B:175:0x0314 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0316  */
    /* JADX WARN: Code duplicated, block: B:180:0x0322  */
    /* JADX WARN: Code duplicated, block: B:182:0x0326  */
    /* JADX WARN: Code duplicated, block: B:184:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0331  */
    /* JADX WARN: Code duplicated, block: B:189:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0342  */
    /* JADX WARN: Code duplicated, block: B:192:0x034b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0350  */
    /* JADX WARN: Code duplicated, block: B:197:0x035a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0376  */
    /* JADX WARN: Code duplicated, block: B:224:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:226:0x03c6 A[LOOP:27: B:225:0x03c4->B:226:0x03c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:230:0x03dd A[LOOP:28: B:229:0x03db->B:230:0x03dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0406 A[LOOP:29: B:234:0x0400->B:236:0x0406, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x041e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0428 A[LOOP:30: B:240:0x0422->B:242:0x0428, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x0440  */
    /* JADX WARN: Code duplicated, block: B:248:0x044a A[LOOP:31: B:246:0x0444->B:248:0x044a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x045a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0461 A[LOOP:32: B:251:0x045f->B:252:0x0461, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:254:0x0471  */
    /* JADX WARN: Code duplicated, block: B:256:0x0478 A[LOOP:33: B:255:0x0476->B:256:0x0478, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x0488  */
    /* JADX WARN: Code duplicated, block: B:260:0x048f A[LOOP:34: B:259:0x048d->B:260:0x048f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:263:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:266:0x04b8 A[LOOP:35: B:264:0x04b2->B:266:0x04b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:272:0x04da A[LOOP:36: B:270:0x04d4->B:272:0x04da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:278:0x04fc A[LOOP:37: B:276:0x04f6->B:278:0x04fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x0514  */
    /* JADX WARN: Code duplicated, block: B:284:0x051e A[LOOP:38: B:282:0x0518->B:284:0x051e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x052e  */
    /* JADX WARN: Code duplicated, block: B:288:0x0535 A[LOOP:39: B:287:0x0533->B:288:0x0535, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x0545  */
    /* JADX WARN: Code duplicated, block: B:292:0x0548  */
    /* JADX WARN: Code duplicated, block: B:303:0x057f A[EDGE_INSN: B:303:0x057f->B:358:0x0656 BREAK  A[LOOP:25: B:150:0x0279->B:157:0x02ad]] */
    /* JADX WARN: Code duplicated, block: B:304:0x058a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0591  */
    /* JADX WARN: Code duplicated, block: B:308:0x059a  */
    /* JADX WARN: Code duplicated, block: B:310:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:312:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:314:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:317:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:318:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:321:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:323:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:325:0x05da  */
    /* JADX WARN: Code duplicated, block: B:327:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:329:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:332:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:333:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:340:0x0609  */
    /* JADX WARN: Code duplicated, block: B:344:0x061c  */
    /* JADX WARN: Code duplicated, block: B:345:0x0622  */
    /* JADX WARN: Code duplicated, block: B:348:0x062b  */
    /* JADX WARN: Code duplicated, block: B:352:0x063d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0643  */
    /* JADX WARN: Code duplicated, block: B:356:0x064c A[PHI: r3
      0x064c: PHI (r3v1 int) = (r3v0 int), (r3v52 int) binds: [B:141:0x0254, B:148:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:498:0x0892  */
    /* JADX WARN: Code duplicated, block: B:549:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:551:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:555:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:559:0x09c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:564:0x09d0 A[LOOP:14: B:563:0x09ce->B:564:0x09d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:567:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:579:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:582:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a6a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:590:0x0a85 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:594:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:595:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:597:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:598:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:708:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x05e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x05e7 A[SYNTHETIC] */
    @Override // p000.C1159yu
    /* JADX INFO: renamed from: V */
    public final void mo19711V() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        boolean zM19714Y;
        int size;
        int i9;
        boolean z2;
        int iMax;
        int iMax2;
        int i10;
        boolean z3;
        int[] iArr;
        int[] iArr2;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        C1152yn c1152yn;
        boolean z4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        Iterator it;
        C1148yj c1148yj;
        boolean z5;
        C1179zn c1179zn;
        ArrayList arrayList2;
        int size2;
        int i12;
        C1142yd c1142yd;
        ArrayList arrayList3;
        int i13;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList9;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        HashSet hashSet4;
        HashSet hashSet5;
        HashSet hashSet6;
        HashSet hashSet7;
        int i18;
        C1173zh c1173zh;
        C1173zh c1173zh2;
        int i19;
        int iM19689j;
        int i20;
        int iM19687h;
        int size3;
        int i21;
        int i22;
        C1173zh c1173zh3;
        int iM19778a;
        int size4;
        int i23;
        int i24;
        C1173zh c1173zh4;
        int iM19778a2;
        int[] iArr3;
        int size5;
        int i25;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        int size6;
        int i26;
        int size7;
        int i27;
        int size8;
        int i28;
        Iterator it6;
        Iterator it7;
        Iterator it8;
        int size9;
        int i29;
        int size10;
        int i30;
        C1152yn c1152yn2;
        boolean z6;
        C1148yj c1148yj2;
        C1155yq c1155yq;
        C1152yn c1152yn3;
        int i31;
        boolean z7;
        boolean z8;
        boolean z9;
        int i32;
        boolean z10;
        int i33;
        this.f48212aa = 0;
        this.f48213ab = 0;
        this.f48254aA = false;
        this.f48255aB = false;
        int size11 = this.f48284aK.size();
        int iMax7 = Math.max(0, m19689j());
        int iMax8 = Math.max(0, m19687h());
        int[] iArr4 = this.f48229ar;
        int i34 = iArr4[1];
        int i35 = iArr4[0];
        C1142yd c1142yd2 = this.f48274d;
        if (c1142yd2 != null) {
            c1142yd2.f48082B++;
        }
        int i36 = -1;
        if (this.f48272b == 0 && C1157ys.m19721b(this.f48271az, 1)) {
            C1179zn c1179zn2 = this.f48262aI;
            int iM19680O = m19680O();
            int iM19681P = m19681P();
            C1167zb.f48327b = 0;
            C1167zb.f48328c = 0;
            m19702w();
            ArrayList arrayList10 = this.f48284aK;
            int size12 = arrayList10.size();
            for (int i37 = 0; i37 < size12; i37++) {
                ((C1152yn) arrayList10.get(i37)).m19702w();
            }
            boolean z11 = this.f48273c;
            if (iM19680O == 1) {
                m19704y(0, m19689j());
                i31 = 0;
                z7 = false;
                z8 = false;
            } else {
                this.f48195K.m19654e(0);
                this.f48212aa = 0;
                i31 = 0;
                z7 = false;
                z8 = false;
            }
            while (i31 < size12) {
                C1152yn c1152yn4 = (C1152yn) arrayList10.get(i31);
                if (c1152yn4 instanceof C1155yq) {
                    C1155yq c1155yq2 = (C1155yq) c1152yn4;
                    if (c1155yq2.f48276as == 1) {
                        int i38 = c1155yq2.f48278b;
                        if (i38 != i36) {
                            c1155yq2.m19717a(i38);
                            z7 = true;
                        } else if (c1155yq2.f48279c == i36 || !mo19648e()) {
                            if (mo19648e()) {
                                c1155yq2.m19717a((int) ((c1155yq2.f48275a * m19689j()) + 0.5f));
                            }
                            z7 = true;
                        } else {
                            c1155yq2.m19717a(m19689j() - c1155yq2.f48279c);
                            z7 = true;
                        }
                    }
                } else if ((c1152yn4 instanceof C1148yj) && ((C1148yj) c1152yn4).m19644a() == 0) {
                    z8 = true;
                }
                i31++;
                i36 = -1;
            }
            if (z7) {
                for (int i39 = 0; i39 < size12; i39++) {
                    C1152yn c1152yn5 = (C1152yn) arrayList10.get(i39);
                    if (c1152yn5 instanceof C1155yq) {
                        C1155yq c1155yq3 = (C1155yq) c1152yn5;
                        if (c1155yq3.f48276as == 1) {
                            C1167zb.m19764b(0, c1155yq3, c1179zn2, z11);
                        }
                    }
                }
            }
            C1167zb.m19764b(0, this, c1179zn2, z11);
            if (z8) {
                for (int i40 = 0; i40 < size12; i40++) {
                    C1152yn c1152yn6 = (C1152yn) arrayList10.get(i40);
                    if (c1152yn6 instanceof C1148yj) {
                        C1148yj c1148yj3 = (C1148yj) c1152yn6;
                        if (c1148yj3.m19644a() == 0) {
                            C1167zb.m19766d(c1148yj3, c1179zn2, 0, z11);
                        }
                    }
                }
            }
            if (iM19681P == 1) {
                i32 = 0;
                m19705z(0, m19687h());
                z9 = false;
                z10 = false;
            } else {
                this.f48196L.m19654e(0);
                this.f48213ab = 0;
                z9 = false;
                i32 = 0;
                z10 = false;
            }
            while (i32 < size12) {
                C1152yn c1152yn7 = (C1152yn) arrayList10.get(i32);
                if (c1152yn7 instanceof C1155yq) {
                    C1155yq c1155yq4 = (C1155yq) c1152yn7;
                    if (c1155yq4.f48276as == 0) {
                        int i41 = c1155yq4.f48278b;
                        if (i41 != -1) {
                            c1155yq4.m19717a(i41);
                            z9 = true;
                        } else if (c1155yq4.f48279c == -1 || !mo19649f()) {
                            if (mo19649f()) {
                                c1155yq4.m19717a((int) ((c1155yq4.f48275a * m19687h()) + 0.5f));
                            }
                            z9 = true;
                        } else {
                            c1155yq4.m19717a(m19687h() - c1155yq4.f48279c);
                            z9 = true;
                        }
                    }
                } else if ((c1152yn7 instanceof C1148yj) && ((C1148yj) c1152yn7).m19644a() == 1) {
                    z10 = true;
                }
                i32++;
            }
            if (z9) {
                for (int i42 = 0; i42 < size12; i42++) {
                    C1152yn c1152yn8 = (C1152yn) arrayList10.get(i42);
                    if (c1152yn8 instanceof C1155yq) {
                        C1155yq c1155yq5 = (C1155yq) c1152yn8;
                        if (c1155yq5.f48276as == 0) {
                            C1167zb.m19765c(1, c1155yq5, c1179zn2);
                        }
                    }
                }
            }
            C1167zb.m19765c(0, this, c1179zn2);
            if (z10) {
                for (int i43 = 0; i43 < size12; i43++) {
                    C1152yn c1152yn9 = (C1152yn) arrayList10.get(i43);
                    if (c1152yn9 instanceof C1148yj) {
                        C1148yj c1148yj4 = (C1148yj) c1152yn9;
                        if (c1148yj4.m19644a() == 1) {
                            C1167zb.m19766d(c1148yj4, c1179zn2, 1, z11);
                        }
                    }
                }
                i33 = 0;
            } else {
                i33 = 0;
            }
            while (i33 < size12) {
                C1152yn c1152yn10 = (C1152yn) arrayList10.get(i33);
                if (c1152yn10.m19678M() && C1167zb.m19763a(c1152yn10)) {
                    m19706Z(c1152yn10, c1179zn2, C1167zb.f48326a);
                    if (!(c1152yn10 instanceof C1155yq)) {
                        C1167zb.m19764b(0, c1152yn10, c1179zn2, z11);
                        C1167zb.m19765c(0, c1152yn10, c1179zn2);
                    } else if (((C1155yq) c1152yn10).f48276as == 0) {
                        C1167zb.m19765c(0, c1152yn10, c1179zn2);
                    } else {
                        C1167zb.m19764b(0, c1152yn10, c1179zn2, z11);
                    }
                }
                i33++;
            }
            for (int i44 = 0; i44 < size11; i44++) {
                C1152yn c1152yn11 = (C1152yn) this.f48284aK.get(i44);
                if (c1152yn11.m19678M() && !(c1152yn11 instanceof C1155yq) && !(c1152yn11 instanceof C1148yj) && !(c1152yn11 instanceof C1158yt)) {
                    boolean z12 = c1152yn11.f48192H;
                    int iM19679N = c1152yn11.m19679N(0);
                    int iM19679N2 = c1152yn11.m19679N(1);
                    if (iM19679N != 3 || c1152yn11.f48246t == 1 || iM19679N2 != 3 || c1152yn11.f48247u == 1) {
                        m19706Z(c1152yn11, this.f48262aI, new C1160yv());
                    }
                }
            }
        }
        if (size11 <= 2) {
            i = size11;
            i2 = i35;
            i3 = iMax7;
            i4 = i34;
            i5 = iMax8;
            z = false;
            break;
        }
        if (i35 == 2) {
            if (C1157ys.m19721b(this.f48271az, 1024)) {
                c1179zn = this.f48262aI;
                arrayList2 = this.f48284aK;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        c1142yd = this.f48274d;
                        if (c1142yd != null) {
                            c1142yd.f48083C++;
                            arrayList3 = null;
                            i13 = 0;
                            arrayList4 = null;
                            arrayList5 = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            arrayList8 = null;
                        } else {
                            arrayList3 = null;
                            i13 = 0;
                            arrayList4 = null;
                            arrayList5 = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            arrayList8 = null;
                        }
                        while (i13 < size2) {
                            int i45 = size11;
                            c1152yn2 = (C1152yn) arrayList2.get(i13);
                            int i46 = iMax8;
                            int i47 = i34;
                            int i48 = iMax7;
                            int i49 = i35;
                            if (!C0993sq.m19415j(m19680O(), m19681P(), c1152yn2.m19680O(), c1152yn2.m19681P())) {
                                m19706Z(c1152yn2, c1179zn, this.f48261aH);
                            }
                            z6 = c1152yn2 instanceof C1155yq;
                            if (z6) {
                                c1155yq = (C1155yq) c1152yn2;
                                if (c1155yq.f48276as == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(c1155yq);
                                }
                                if (c1155yq.f48276as == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(c1155yq);
                                }
                            }
                            if (c1152yn2 instanceof C1156yr) {
                                if (c1152yn2 instanceof C1148yj) {
                                    c1148yj2 = (C1148yj) c1152yn2;
                                    if (c1148yj2.m19644a() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(c1148yj2);
                                    }
                                    if (c1148yj2.m19644a() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(c1148yj2);
                                    }
                                } else {
                                    C1156yr c1156yr = (C1156yr) c1152yn2;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(c1156yr);
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(c1156yr);
                                }
                            }
                            if (c1152yn2.f48195K.f48181f == null && c1152yn2.f48197M.f48181f == null && !z6 && !(c1152yn2 instanceof C1148yj)) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(c1152yn2);
                            }
                            if (c1152yn2.f48196L.f48181f != null && c1152yn2.f48198N.f48181f == null && c1152yn2.f48199O.f48181f == null && !z6 && !(c1152yn2 instanceof C1148yj)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(c1152yn2);
                            }
                            i13++;
                            iMax8 = i46;
                            size11 = i45;
                            i34 = i47;
                            iMax7 = i48;
                            i35 = i49;
                        }
                        i14 = iMax7;
                        i15 = iMax8;
                        i16 = i35;
                        i17 = i34;
                        i = size11;
                        arrayList9 = new ArrayList();
                        if (arrayList3 != null) {
                            size10 = arrayList3.size();
                            for (i30 = 0; i30 < size10; i30++) {
                                C0993sq.m19413h((C1155yq) arrayList3.get(i30), 0, arrayList9, null);
                            }
                        }
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            for (i29 = 0; i29 < size9; i29++) {
                                C1156yr c1156yr2 = (C1156yr) arrayList4.get(i29);
                                C1173zh c1173zhM19413h = C0993sq.m19413h(c1156yr2, 0, arrayList9, null);
                                c1156yr2.m19719U(arrayList9, 0, c1173zhM19413h);
                                c1173zhM19413h.m19779b(arrayList9);
                            }
                        }
                        hashSet = mo19692m(EnumC1150yl.LEFT).f48176a;
                        if (hashSet != null) {
                            it8 = hashSet.iterator();
                            while (it8.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it8.next()).f48179d, 0, arrayList9, null);
                            }
                        }
                        hashSet2 = mo19692m(EnumC1150yl.RIGHT).f48176a;
                        if (hashSet2 != null) {
                            it7 = hashSet2.iterator();
                            while (it7.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it7.next()).f48179d, 0, arrayList9, null);
                            }
                        }
                        hashSet3 = mo19692m(EnumC1150yl.CENTER).f48176a;
                        if (hashSet3 != null) {
                            it6 = hashSet3.iterator();
                            while (it6.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it6.next()).f48179d, 0, arrayList9, null);
                            }
                        }
                        if (arrayList7 != null) {
                            size8 = arrayList7.size();
                            for (i28 = 0; i28 < size8; i28++) {
                                C0993sq.m19413h((C1152yn) arrayList7.get(i28), 0, arrayList9, null);
                            }
                        }
                        if (arrayList5 != null) {
                            size7 = arrayList5.size();
                            for (i27 = 0; i27 < size7; i27++) {
                                C0993sq.m19413h((C1155yq) arrayList5.get(i27), 1, arrayList9, null);
                            }
                        }
                        if (arrayList6 != null) {
                            size6 = arrayList6.size();
                            for (i26 = 0; i26 < size6; i26++) {
                                C1156yr c1156yr3 = (C1156yr) arrayList6.get(i26);
                                C1173zh c1173zhM19413h2 = C0993sq.m19413h(c1156yr3, 1, arrayList9, null);
                                c1156yr3.m19719U(arrayList9, 1, c1173zhM19413h2);
                                c1173zhM19413h2.m19779b(arrayList9);
                            }
                        }
                        hashSet4 = mo19692m(EnumC1150yl.TOP).f48176a;
                        if (hashSet4 != null) {
                            it5 = hashSet4.iterator();
                            while (it5.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it5.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        hashSet5 = mo19692m(EnumC1150yl.BASELINE).f48176a;
                        if (hashSet5 != null) {
                            it4 = hashSet5.iterator();
                            while (it4.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it4.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        hashSet6 = mo19692m(EnumC1150yl.BOTTOM).f48176a;
                        if (hashSet6 != null) {
                            it3 = hashSet6.iterator();
                            while (it3.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it3.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        hashSet7 = mo19692m(EnumC1150yl.CENTER).f48176a;
                        if (hashSet7 != null) {
                            it2 = hashSet7.iterator();
                            while (it2.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it2.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        if (arrayList8 != null) {
                            size5 = arrayList8.size();
                            for (i25 = 0; i25 < size5; i25++) {
                                C0993sq.m19413h((C1152yn) arrayList8.get(i25), 1, arrayList9, null);
                            }
                            i18 = 0;
                        } else {
                            i18 = 0;
                        }
                        while (i18 < size2) {
                            C1152yn c1152yn12 = (C1152yn) arrayList2.get(i18);
                            iArr3 = c1152yn12.f48229ar;
                            if (iArr3[0] != 3 && iArr3[1] == 3) {
                                C1173zh c1173zhM19414i = C0993sq.m19414i(arrayList9, c1152yn12.f48227ap);
                                C1173zh c1173zhM19414i2 = C0993sq.m19414i(arrayList9, c1152yn12.f48228aq);
                                if (c1173zhM19414i != null && c1173zhM19414i2 != null) {
                                    c1173zhM19414i.m19780c(0, c1173zhM19414i2);
                                    c1173zhM19414i2.f48338d = 2;
                                    arrayList9.remove(c1173zhM19414i);
                                }
                            }
                            i18++;
                        }
                        if (arrayList9.size() > 1) {
                            i5 = i15;
                            i4 = i17;
                            i3 = i14;
                            i2 = i16;
                            z = false;
                            break;
                        }
                        if (m19680O() == 2) {
                            size4 = arrayList9.size();
                            c1173zh = null;
                            i24 = 0;
                            for (i23 = 0; i23 < size4; i23++) {
                                c1173zh4 = (C1173zh) arrayList9.get(i23);
                                if (c1173zh4.f48338d == 1) {
                                    iM19778a2 = c1173zh4.m19778a(this.f48264as, 0);
                                    if (iM19778a2 > i24) {
                                        c1173zh = c1173zh4;
                                    }
                                    if (iM19778a2 > i24) {
                                        i24 = iM19778a2;
                                    }
                                }
                            }
                            if (c1173zh != null) {
                                m19682Q(1);
                                m19671F(i24);
                            } else {
                                c1173zh = null;
                            }
                        } else {
                            c1173zh = null;
                        }
                        if (m19681P() == 2) {
                            size3 = arrayList9.size();
                            c1173zh2 = null;
                            i22 = 0;
                            for (i21 = 0; i21 < size3; i21++) {
                                c1173zh3 = (C1173zh) arrayList9.get(i21);
                                if (c1173zh3.f48338d == 0) {
                                    iM19778a = c1173zh3.m19778a(this.f48264as, 1);
                                    if (iM19778a > i22) {
                                        c1173zh2 = c1173zh3;
                                    }
                                    if (iM19778a > i22) {
                                        i22 = iM19778a;
                                    }
                                }
                            }
                            if (c1173zh2 != null) {
                                m19683R(1);
                                m19666A(i22);
                            } else {
                                c1173zh2 = null;
                            }
                        } else {
                            c1173zh2 = null;
                        }
                        if (c1173zh == null || c1173zh2 != null) {
                            if (i16 == 2) {
                                i19 = i16;
                                iM19689j = i14;
                            } else if (i14 < m19689j() || i14 <= 0) {
                                iM19689j = m19689j();
                                i19 = 2;
                            } else {
                                m19671F(i14);
                                this.f48254aA = true;
                                iM19689j = i14;
                                i19 = 2;
                            }
                            i20 = i17;
                            if (i20 == 2) {
                                if (i15 < m19687h() || i15 <= 0) {
                                    iM19687h = m19687h();
                                } else {
                                    m19666A(i15);
                                    this.f48255aB = true;
                                    iM19687h = i15;
                                }
                                i20 = 2;
                            } else {
                                iM19687h = i15;
                            }
                            i3 = iM19689j;
                            i5 = iM19687h;
                            i2 = i19;
                            i4 = i20;
                            z = true;
                            break;
                        }
                        i5 = i15;
                        i4 = i17;
                        i3 = i14;
                        i2 = i16;
                    } else {
                        c1152yn3 = (C1152yn) arrayList2.get(i12);
                        if (!C0993sq.m19415j(m19680O(), m19681P(), c1152yn3.m19680O(), c1152yn3.m19681P())) {
                            i3 = iMax7;
                            i2 = i35;
                            i4 = i34;
                            i = size11;
                            z = false;
                            i5 = iMax8;
                            break;
                        }
                        if (c1152yn3 instanceof C1154yp) {
                            i3 = iMax7;
                            i2 = i35;
                            i4 = i34;
                            i = size11;
                            z = false;
                            i5 = iMax8;
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                i = size11;
                i2 = i35;
                i3 = iMax7;
                i4 = i34;
                i5 = iMax8;
            }
            z = false;
            break;
        } else if (i34 == 2) {
            i34 = 2;
            if (C1157ys.m19721b(this.f48271az, 1024)) {
                c1179zn = this.f48262aI;
                arrayList2 = this.f48284aK;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        c1142yd = this.f48274d;
                        if (c1142yd != null) {
                            c1142yd.f48083C++;
                            arrayList3 = null;
                            i13 = 0;
                            arrayList4 = null;
                            arrayList5 = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            arrayList8 = null;
                        } else {
                            arrayList3 = null;
                            i13 = 0;
                            arrayList4 = null;
                            arrayList5 = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            arrayList8 = null;
                        }
                        while (i13 < size2) {
                            int i410 = size11;
                            c1152yn2 = (C1152yn) arrayList2.get(i13);
                            int i411 = iMax8;
                            int i412 = i34;
                            int i413 = iMax7;
                            int i414 = i35;
                            if (!C0993sq.m19415j(m19680O(), m19681P(), c1152yn2.m19680O(), c1152yn2.m19681P())) {
                                m19706Z(c1152yn2, c1179zn, this.f48261aH);
                            }
                            z6 = c1152yn2 instanceof C1155yq;
                            if (z6) {
                                c1155yq = (C1155yq) c1152yn2;
                                if (c1155yq.f48276as == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(c1155yq);
                                }
                                if (c1155yq.f48276as == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(c1155yq);
                                }
                            }
                            if (c1152yn2 instanceof C1156yr) {
                                if (c1152yn2 instanceof C1148yj) {
                                    c1148yj2 = (C1148yj) c1152yn2;
                                    if (c1148yj2.m19644a() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(c1148yj2);
                                    }
                                    if (c1148yj2.m19644a() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(c1148yj2);
                                    }
                                } else {
                                    C1156yr c1156yr4 = (C1156yr) c1152yn2;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(c1156yr4);
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(c1156yr4);
                                }
                            }
                            if (c1152yn2.f48195K.f48181f == null) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(c1152yn2);
                            }
                            if (c1152yn2.f48196L.f48181f != null) {
                            }
                            i13++;
                            iMax8 = i411;
                            size11 = i410;
                            i34 = i412;
                            iMax7 = i413;
                            i35 = i414;
                        }
                        i14 = iMax7;
                        i15 = iMax8;
                        i16 = i35;
                        i17 = i34;
                        i = size11;
                        arrayList9 = new ArrayList();
                        if (arrayList3 != null) {
                            size10 = arrayList3.size();
                            while (i30 < size10) {
                                C0993sq.m19413h((C1155yq) arrayList3.get(i30), 0, arrayList9, null);
                            }
                        }
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            while (i29 < size9) {
                                C1156yr c1156yr5 = (C1156yr) arrayList4.get(i29);
                                C1173zh c1173zhM19413h3 = C0993sq.m19413h(c1156yr5, 0, arrayList9, null);
                                c1156yr5.m19719U(arrayList9, 0, c1173zhM19413h3);
                                c1173zhM19413h3.m19779b(arrayList9);
                            }
                        }
                        hashSet = mo19692m(EnumC1150yl.LEFT).f48176a;
                        if (hashSet != null) {
                            it8 = hashSet.iterator();
                            while (it8.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it8.next()).f48179d, 0, arrayList9, null);
                            }
                        }
                        hashSet2 = mo19692m(EnumC1150yl.RIGHT).f48176a;
                        if (hashSet2 != null) {
                            it7 = hashSet2.iterator();
                            while (it7.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it7.next()).f48179d, 0, arrayList9, null);
                            }
                        }
                        hashSet3 = mo19692m(EnumC1150yl.CENTER).f48176a;
                        if (hashSet3 != null) {
                            it6 = hashSet3.iterator();
                            while (it6.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it6.next()).f48179d, 0, arrayList9, null);
                            }
                        }
                        if (arrayList7 != null) {
                            size8 = arrayList7.size();
                            while (i28 < size8) {
                                C0993sq.m19413h((C1152yn) arrayList7.get(i28), 0, arrayList9, null);
                            }
                        }
                        if (arrayList5 != null) {
                            size7 = arrayList5.size();
                            while (i27 < size7) {
                                C0993sq.m19413h((C1155yq) arrayList5.get(i27), 1, arrayList9, null);
                            }
                        }
                        if (arrayList6 != null) {
                            size6 = arrayList6.size();
                            while (i26 < size6) {
                                C1156yr c1156yr6 = (C1156yr) arrayList6.get(i26);
                                C1173zh c1173zhM19413h4 = C0993sq.m19413h(c1156yr6, 1, arrayList9, null);
                                c1156yr6.m19719U(arrayList9, 1, c1173zhM19413h4);
                                c1173zhM19413h4.m19779b(arrayList9);
                            }
                        }
                        hashSet4 = mo19692m(EnumC1150yl.TOP).f48176a;
                        if (hashSet4 != null) {
                            it5 = hashSet4.iterator();
                            while (it5.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it5.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        hashSet5 = mo19692m(EnumC1150yl.BASELINE).f48176a;
                        if (hashSet5 != null) {
                            it4 = hashSet5.iterator();
                            while (it4.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it4.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        hashSet6 = mo19692m(EnumC1150yl.BOTTOM).f48176a;
                        if (hashSet6 != null) {
                            it3 = hashSet6.iterator();
                            while (it3.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it3.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        hashSet7 = mo19692m(EnumC1150yl.CENTER).f48176a;
                        if (hashSet7 != null) {
                            it2 = hashSet7.iterator();
                            while (it2.hasNext()) {
                                C0993sq.m19413h(((C1151ym) it2.next()).f48179d, 1, arrayList9, null);
                            }
                        }
                        if (arrayList8 != null) {
                            size5 = arrayList8.size();
                            while (i25 < size5) {
                                C0993sq.m19413h((C1152yn) arrayList8.get(i25), 1, arrayList9, null);
                            }
                            i18 = 0;
                        } else {
                            i18 = 0;
                        }
                        while (i18 < size2) {
                            C1152yn c1152yn13 = (C1152yn) arrayList2.get(i18);
                            iArr3 = c1152yn13.f48229ar;
                            if (iArr3[0] != 3) {
                            }
                            i18++;
                        }
                        if (arrayList9.size() > 1) {
                            if (m19680O() == 2) {
                                size4 = arrayList9.size();
                                c1173zh = null;
                                i24 = 0;
                                while (i23 < size4) {
                                    c1173zh4 = (C1173zh) arrayList9.get(i23);
                                    if (c1173zh4.f48338d == 1) {
                                        iM19778a2 = c1173zh4.m19778a(this.f48264as, 0);
                                        if (iM19778a2 > i24) {
                                            c1173zh = c1173zh4;
                                        }
                                        if (iM19778a2 > i24) {
                                            i24 = iM19778a2;
                                        }
                                    }
                                }
                                if (c1173zh != null) {
                                    m19682Q(1);
                                    m19671F(i24);
                                } else {
                                    c1173zh = null;
                                }
                            } else {
                                c1173zh = null;
                            }
                            if (m19681P() == 2) {
                                size3 = arrayList9.size();
                                c1173zh2 = null;
                                i22 = 0;
                                while (i21 < size3) {
                                    c1173zh3 = (C1173zh) arrayList9.get(i21);
                                    if (c1173zh3.f48338d == 0) {
                                        iM19778a = c1173zh3.m19778a(this.f48264as, 1);
                                        if (iM19778a > i22) {
                                            c1173zh2 = c1173zh3;
                                        }
                                        if (iM19778a > i22) {
                                            i22 = iM19778a;
                                        }
                                    }
                                }
                                if (c1173zh2 != null) {
                                    m19683R(1);
                                    m19666A(i22);
                                } else {
                                    c1173zh2 = null;
                                }
                            } else {
                                c1173zh2 = null;
                            }
                            if (c1173zh == null) {
                            }
                            if (i16 == 2) {
                                i19 = i16;
                                iM19689j = i14;
                            } else if (i14 < m19689j()) {
                                iM19689j = m19689j();
                                i19 = 2;
                            } else {
                                iM19689j = m19689j();
                                i19 = 2;
                            }
                            i20 = i17;
                            if (i20 == 2) {
                                if (i15 < m19687h()) {
                                    iM19687h = m19687h();
                                } else {
                                    iM19687h = m19687h();
                                }
                                i20 = 2;
                            } else {
                                iM19687h = i15;
                            }
                            i3 = iM19689j;
                            i5 = iM19687h;
                            i2 = i19;
                            i4 = i20;
                            z = true;
                            break;
                        }
                        i5 = i15;
                        i4 = i17;
                        i3 = i14;
                        i2 = i16;
                        z = false;
                        break;
                    }
                    c1152yn3 = (C1152yn) arrayList2.get(i12);
                    if (!C0993sq.m19415j(m19680O(), m19681P(), c1152yn3.m19680O(), c1152yn3.m19681P())) {
                        i3 = iMax7;
                        i2 = i35;
                        i4 = i34;
                        i = size11;
                        z = false;
                        i5 = iMax8;
                        break;
                    }
                    if (c1152yn3 instanceof C1154yp) {
                        i3 = iMax7;
                        i2 = i35;
                        i4 = i34;
                        i = size11;
                        z = false;
                        i5 = iMax8;
                        break;
                    }
                    i12++;
                }
            } else {
                i = size11;
                i2 = i35;
                i3 = iMax7;
                i4 = i34;
                i5 = iMax8;
            }
            z = false;
            break;
        } else {
            i3 = iMax7;
            i2 = i35;
            i4 = i34;
            i = size11;
            z = false;
            i5 = iMax8;
        }
        int i50 = 64;
        boolean z13 = m19714Y(64) || m19714Y(128);
        C1141yc c1141yc = this.f48264as;
        c1141yc.f48068g = false;
        c1141yc.f48069h = false;
        if (this.f48271az != 0 && z13) {
            c1141yc.f48069h = true;
        }
        ArrayList arrayList11 = this.f48284aK;
        boolean z14 = m19680O() == 2 || m19681P() == 2;
        m19709ad();
        int i51 = 0;
        while (true) {
            i6 = i;
            if (i51 >= i6) {
                break;
            }
            C1152yn c1152yn14 = (C1152yn) this.f48284aK.get(i51);
            if (c1152yn14 instanceof C1159yu) {
                ((C1159yu) c1152yn14).mo19711V();
            }
            i51++;
            i = i6;
        }
        boolean z15 = z;
        boolean z16 = true;
        int i52 = 0;
        while (z16) {
            int i53 = i52 + 1;
            try {
                this.f48264as.m19632k();
                m19709ad();
                m19697r(this.f48264as);
                for (int i54 = 0; i54 < i6; i54++) {
                    ((C1152yn) this.f48284aK.get(i54)).m19697r(this.f48264as);
                }
                C1141yc c1141yc2 = this.f48264as;
                boolean zM19714Y2 = m19714Y(i50);
                mo19645b(c1141yc2, zM19714Y2);
                int size13 = this.f48284aK.size();
                int i55 = 0;
                boolean z17 = false;
                while (i55 < size13) {
                    C1152yn c1152yn15 = (C1152yn) this.f48284aK.get(i55);
                    c1152yn15.m19667B(0, false);
                    int i56 = i53;
                    try {
                        c1152yn15.m19667B(1, false);
                        z17 |= c1152yn15 instanceof C1148yj;
                        i55++;
                        i53 = i56;
                    } catch (Exception e) {
                        e = e;
                        i7 = i5;
                        arrayList = arrayList11;
                        i8 = i56;
                        e.printStackTrace();
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder();
                        sb.append("EXCEPTION : ");
                        sb.append(e);
                        printStream.println("EXCEPTION : ".concat(e.toString()));
                        C1157ys.f48283a[2] = false;
                        zM19714Y = m19714Y(64);
                        mo19684S(zM19714Y);
                        size = this.f48284aK.size();
                        z2 = false;
                        for (i9 = 0; i9 < size; i9++) {
                            c1152yn = (C1152yn) this.f48284aK.get(i9);
                            c1152yn.mo19684S(zM19714Y);
                            if (c1152yn.f48237k == -1) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            z2 |= z4;
                        }
                        if (z14) {
                            iMax3 = 0;
                            iMax4 = 0;
                            for (i11 = 0; i11 < i6; i11++) {
                                C1152yn c1152yn16 = (C1152yn) this.f48284aK.get(i11);
                                iMax3 = Math.max(iMax3, c1152yn16.f48212aa + c1152yn16.m19689j());
                                iMax4 = Math.max(iMax4, c1152yn16.f48213ab + c1152yn16.m19687h());
                            }
                            iMax5 = Math.max(this.f48215ad, iMax3);
                            iMax6 = Math.max(this.f48216ae, iMax4);
                            if (i2 == 2) {
                                m19671F(iMax5);
                                this.f48229ar[0] = 2;
                                z2 = true;
                                z15 = true;
                            }
                            if (i4 == 2) {
                                m19666A(iMax6);
                                this.f48229ar[1] = 2;
                                z2 = true;
                                z15 = true;
                            }
                        }
                        iMax = Math.max(this.f48215ad, m19689j());
                        if (iMax > m19689j()) {
                            m19671F(iMax);
                            this.f48229ar[0] = 1;
                            z2 = true;
                            z15 = true;
                        }
                        iMax2 = Math.max(this.f48216ae, m19687h());
                        if (iMax2 > m19687h()) {
                            m19666A(iMax2);
                            this.f48229ar[1] = 1;
                            z2 = true;
                            z15 = true;
                        }
                        if (z15) {
                            i10 = i7;
                        } else {
                            iArr = this.f48229ar;
                            if (iArr[0] == 2) {
                                this.f48254aA = true;
                                iArr[0] = 1;
                                m19671F(i3);
                                z2 = true;
                                z15 = true;
                            }
                            iArr2 = this.f48229ar;
                            if (iArr2[1] == 2) {
                                i10 = i7;
                            } else {
                                i10 = i7;
                            }
                        }
                        if (i8 > 8) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        z16 = z3 & z2;
                        i52 = i8;
                        i5 = i10;
                        arrayList11 = arrayList;
                        i50 = 64;
                    }
                }
                int i57 = i53;
                if (z17) {
                    for (int i58 = 0; i58 < size13; i58++) {
                        C1152yn c1152yn17 = (C1152yn) this.f48284aK.get(i58);
                        if (c1152yn17 instanceof C1148yj) {
                            C1148yj c1148yj5 = (C1148yj) c1152yn17;
                            int i59 = 0;
                            while (i59 < c1148yj5.f48282at) {
                                C1152yn c1152yn18 = c1148yj5.f48281as[i59];
                                if (c1148yj5.f48143b || c1152yn18.mo19647d()) {
                                    int i60 = c1148yj5.f48142a;
                                    if (i60 != 0) {
                                        c1148yj = c1148yj5;
                                        if (i60 == 1) {
                                            z5 = true;
                                        } else if (i60 == 2 || i60 == 3) {
                                            c1152yn18.m19667B(1, true);
                                        }
                                    } else {
                                        c1148yj = c1148yj5;
                                        z5 = true;
                                    }
                                    c1152yn18.m19667B(0, z5);
                                } else {
                                    c1148yj = c1148yj5;
                                }
                                i59++;
                                c1148yj5 = c1148yj;
                            }
                        }
                    }
                }
                this.f48260aG.clear();
                int i61 = 0;
                while (i61 < size13) {
                    int i62 = i5;
                    ArrayList arrayList12 = arrayList11;
                    int i63 = i57;
                    boolean z18 = zM19714Y2;
                    C1152yn c1152yn19 = (C1152yn) this.f48284aK.get(i61);
                    if (c1152yn19.m19673H()) {
                        if (c1152yn19 instanceof C1158yt) {
                            this.f48260aG.add(c1152yn19);
                        } else {
                            c1152yn19.mo19645b(c1141yc2, z18);
                        }
                    }
                    i61++;
                    i57 = i63;
                    zM19714Y2 = z18;
                    arrayList11 = arrayList12;
                    i5 = i62;
                }
                while (this.f48260aG.size() > 0) {
                    int size14 = this.f48260aG.size();
                    Iterator it9 = this.f48260aG.iterator();
                    while (it9.hasNext()) {
                        C1158yt c1158yt = (C1158yt) ((C1152yn) it9.next());
                        HashSet hashSet8 = this.f48260aG;
                        int i64 = 0;
                        while (true) {
                            it = it9;
                            if (i64 < c1158yt.f48282at) {
                                if (hashSet8.contains(c1158yt.f48281as[i64])) {
                                    c1158yt.mo19645b(c1141yc2, zM19714Y2);
                                    this.f48260aG.remove(c1158yt);
                                    break;
                                } else {
                                    i64++;
                                    it9 = it;
                                }
                            }
                        }
                        it9 = it;
                    }
                    if (size14 == this.f48260aG.size()) {
                        Iterator it10 = this.f48260aG.iterator();
                        while (it10.hasNext()) {
                            ((C1152yn) it10.next()).mo19645b(c1141yc2, zM19714Y2);
                        }
                        this.f48260aG.clear();
                    }
                }
                if (C1141yc.f48061a) {
                    try {
                        HashSet<C1152yn> hashSet9 = new HashSet();
                        for (int i65 = 0; i65 < size13; i65++) {
                            C1152yn c1152yn20 = (C1152yn) this.f48284aK.get(i65);
                            if (!c1152yn20.m19673H()) {
                                hashSet9.add(c1152yn20);
                            }
                        }
                        arrayList = arrayList11;
                        boolean z19 = zM19714Y2;
                        i7 = i5;
                        i8 = i57;
                        try {
                            m19696q(this, c1141yc2, hashSet9, m19680O() == 2 ? 0 : 1, false);
                            for (C1152yn c1152yn21 : hashSet9) {
                                C1157ys.m19720a(this, c1141yc2, c1152yn21);
                                c1152yn21.mo19645b(c1141yc2, z19);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            PrintStream printStream2 = System.out;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("EXCEPTION : ");
                            sb2.append(e);
                            printStream2.println("EXCEPTION : ".concat(e.toString()));
                            C1157ys.f48283a[2] = false;
                            zM19714Y = m19714Y(64);
                            mo19684S(zM19714Y);
                            size = this.f48284aK.size();
                            z2 = false;
                            while (i9 < size) {
                                c1152yn = (C1152yn) this.f48284aK.get(i9);
                                c1152yn.mo19684S(zM19714Y);
                                if (c1152yn.f48237k == -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                z2 |= z4;
                            }
                            if (z14) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i6) {
                                    C1152yn c1152yn110 = (C1152yn) this.f48284aK.get(i11);
                                    iMax3 = Math.max(iMax3, c1152yn110.f48212aa + c1152yn110.m19689j());
                                    iMax4 = Math.max(iMax4, c1152yn110.f48213ab + c1152yn110.m19687h());
                                }
                                iMax5 = Math.max(this.f48215ad, iMax3);
                                iMax6 = Math.max(this.f48216ae, iMax4);
                                if (i2 == 2) {
                                    m19671F(iMax5);
                                    this.f48229ar[0] = 2;
                                    z2 = true;
                                    z15 = true;
                                }
                                if (i4 == 2) {
                                    m19666A(iMax6);
                                    this.f48229ar[1] = 2;
                                    z2 = true;
                                    z15 = true;
                                }
                            }
                            iMax = Math.max(this.f48215ad, m19689j());
                            if (iMax > m19689j()) {
                                m19671F(iMax);
                                this.f48229ar[0] = 1;
                                z2 = true;
                                z15 = true;
                            }
                            iMax2 = Math.max(this.f48216ae, m19687h());
                            if (iMax2 > m19687h()) {
                                m19666A(iMax2);
                                this.f48229ar[1] = 1;
                                z2 = true;
                                z15 = true;
                            }
                            if (z15) {
                                iArr = this.f48229ar;
                                if (iArr[0] == 2) {
                                    this.f48254aA = true;
                                    iArr[0] = 1;
                                    m19671F(i3);
                                    z2 = true;
                                    z15 = true;
                                }
                                iArr2 = this.f48229ar;
                                if (iArr2[1] == 2) {
                                    i10 = i7;
                                } else {
                                    i10 = i7;
                                }
                            } else {
                                i10 = i7;
                            }
                            if (i8 > 8) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            z16 = z3 & z2;
                            i52 = i8;
                            i5 = i10;
                            arrayList11 = arrayList;
                            i50 = 64;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i7 = i5;
                        arrayList = arrayList11;
                        i8 = i57;
                    }
                } else {
                    i7 = i5;
                    arrayList = arrayList11;
                    i8 = i57;
                    boolean z20 = zM19714Y2;
                    for (int i66 = 0; i66 < size13; i66++) {
                        C1152yn c1152yn22 = (C1152yn) this.f48284aK.get(i66);
                        if (c1152yn22 instanceof C1153yo) {
                            int[] iArr5 = c1152yn22.f48229ar;
                            int i67 = iArr5[0];
                            int i68 = iArr5[1];
                            if (i67 == 2) {
                                c1152yn22.m19682Q(1);
                                i67 = 2;
                            }
                            if (i68 == 2) {
                                c1152yn22.m19683R(1);
                                i68 = 2;
                            }
                            c1152yn22.mo19645b(c1141yc2, z20);
                            if (i67 == 2) {
                                c1152yn22.m19682Q(2);
                            }
                            if (i68 == 2) {
                                c1152yn22.m19683R(2);
                            }
                        } else {
                            C1157ys.m19720a(this, c1141yc2, c1152yn22);
                            if (!c1152yn22.m19673H()) {
                                c1152yn22.mo19645b(c1141yc2, z20);
                            }
                        }
                    }
                }
                if (this.f48267av > 0) {
                    try {
                        C0987sk.m19400b(this, c1141yc2, null, 0);
                        if (this.f48268aw > 0) {
                            C0987sk.m19400b(this, c1141yc2, null, 1);
                        }
                        weakReference = this.f48256aC;
                        if (weakReference != null && weakReference.get() != null) {
                            m19708ac((C1151ym) this.f48256aC.get(), this.f48264as.m19623b(this.f48196L));
                            this.f48256aC = null;
                        }
                        weakReference2 = this.f48258aE;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            m19707ab((C1151ym) this.f48258aE.get(), this.f48264as.m19623b(this.f48198N));
                            this.f48258aE = null;
                        }
                        weakReference3 = this.f48257aD;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            m19708ac((C1151ym) this.f48257aD.get(), this.f48264as.m19623b(this.f48195K));
                            this.f48257aD = null;
                        }
                        weakReference4 = this.f48259aF;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            m19707ab((C1151ym) this.f48259aF.get(), this.f48264as.m19623b(this.f48197M));
                            try {
                                this.f48259aF = null;
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                                PrintStream printStream3 = System.out;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("EXCEPTION : ");
                                sb3.append(e);
                                printStream3.println("EXCEPTION : ".concat(e.toString()));
                            }
                        }
                        this.f48264as.m19631j();
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        PrintStream printStream4 = System.out;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("EXCEPTION : ");
                        sb4.append(e);
                        printStream4.println("EXCEPTION : ".concat(e.toString()));
                        C1157ys.f48283a[2] = false;
                        zM19714Y = m19714Y(64);
                        mo19684S(zM19714Y);
                        size = this.f48284aK.size();
                        z2 = false;
                        while (i9 < size) {
                            c1152yn = (C1152yn) this.f48284aK.get(i9);
                            c1152yn.mo19684S(zM19714Y);
                            if (c1152yn.f48237k == -1) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            z2 |= z4;
                        }
                        if (z14) {
                            iMax3 = 0;
                            iMax4 = 0;
                            while (i11 < i6) {
                                C1152yn c1152yn111 = (C1152yn) this.f48284aK.get(i11);
                                iMax3 = Math.max(iMax3, c1152yn111.f48212aa + c1152yn111.m19689j());
                                iMax4 = Math.max(iMax4, c1152yn111.f48213ab + c1152yn111.m19687h());
                            }
                            iMax5 = Math.max(this.f48215ad, iMax3);
                            iMax6 = Math.max(this.f48216ae, iMax4);
                            if (i2 == 2) {
                                m19671F(iMax5);
                                this.f48229ar[0] = 2;
                                z2 = true;
                                z15 = true;
                            }
                            if (i4 == 2) {
                                m19666A(iMax6);
                                this.f48229ar[1] = 2;
                                z2 = true;
                                z15 = true;
                            }
                        }
                        iMax = Math.max(this.f48215ad, m19689j());
                        if (iMax > m19689j()) {
                            m19671F(iMax);
                            this.f48229ar[0] = 1;
                            z2 = true;
                            z15 = true;
                        }
                        iMax2 = Math.max(this.f48216ae, m19687h());
                        if (iMax2 > m19687h()) {
                            m19666A(iMax2);
                            this.f48229ar[1] = 1;
                            z2 = true;
                            z15 = true;
                        }
                        if (z15) {
                            iArr = this.f48229ar;
                            if (iArr[0] == 2) {
                                this.f48254aA = true;
                                iArr[0] = 1;
                                m19671F(i3);
                                z2 = true;
                                z15 = true;
                            }
                            iArr2 = this.f48229ar;
                            if (iArr2[1] == 2) {
                                i10 = i7;
                            } else {
                                i10 = i7;
                            }
                        } else {
                            i10 = i7;
                        }
                        if (i8 > 8) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        z16 = z3 & z2;
                        i52 = i8;
                        i5 = i10;
                        arrayList11 = arrayList;
                        i50 = 64;
                    }
                } else {
                    if (this.f48268aw > 0) {
                        C0987sk.m19400b(this, c1141yc2, null, 1);
                    }
                    weakReference = this.f48256aC;
                    if (weakReference != null) {
                        m19708ac((C1151ym) this.f48256aC.get(), this.f48264as.m19623b(this.f48196L));
                        this.f48256aC = null;
                    }
                    weakReference2 = this.f48258aE;
                    if (weakReference2 != null) {
                        m19707ab((C1151ym) this.f48258aE.get(), this.f48264as.m19623b(this.f48198N));
                        this.f48258aE = null;
                    }
                    weakReference3 = this.f48257aD;
                    if (weakReference3 != null) {
                        m19708ac((C1151ym) this.f48257aD.get(), this.f48264as.m19623b(this.f48195K));
                        this.f48257aD = null;
                    }
                    weakReference4 = this.f48259aF;
                    if (weakReference4 == null) {
                    }
                    this.f48264as.m19631j();
                }
            } catch (Exception e6) {
                e = e6;
                i7 = i5;
                arrayList = arrayList11;
                i8 = i53;
            }
            C1157ys.f48283a[2] = false;
            zM19714Y = m19714Y(64);
            mo19684S(zM19714Y);
            size = this.f48284aK.size();
            z2 = false;
            while (i9 < size) {
                c1152yn = (C1152yn) this.f48284aK.get(i9);
                c1152yn.mo19684S(zM19714Y);
                if (c1152yn.f48237k == -1 || c1152yn.f48238l != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z2 |= z4;
            }
            if (z14 && i8 < 8 && C1157ys.f48283a[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i6) {
                    C1152yn c1152yn112 = (C1152yn) this.f48284aK.get(i11);
                    iMax3 = Math.max(iMax3, c1152yn112.f48212aa + c1152yn112.m19689j());
                    iMax4 = Math.max(iMax4, c1152yn112.f48213ab + c1152yn112.m19687h());
                }
                iMax5 = Math.max(this.f48215ad, iMax3);
                iMax6 = Math.max(this.f48216ae, iMax4);
                if (i2 == 2 && m19689j() < iMax5) {
                    m19671F(iMax5);
                    this.f48229ar[0] = 2;
                    z2 = true;
                    z15 = true;
                }
                if (i4 == 2 && m19687h() < iMax6) {
                    m19666A(iMax6);
                    this.f48229ar[1] = 2;
                    z2 = true;
                    z15 = true;
                }
            }
            iMax = Math.max(this.f48215ad, m19689j());
            if (iMax > m19689j()) {
                m19671F(iMax);
                this.f48229ar[0] = 1;
                z2 = true;
                z15 = true;
            }
            iMax2 = Math.max(this.f48216ae, m19687h());
            if (iMax2 > m19687h()) {
                m19666A(iMax2);
                this.f48229ar[1] = 1;
                z2 = true;
                z15 = true;
            }
            if (z15) {
                iArr = this.f48229ar;
                if (iArr[0] == 2 && i3 > 0 && m19689j() > i3) {
                    this.f48254aA = true;
                    iArr[0] = 1;
                    m19671F(i3);
                    z2 = true;
                    z15 = true;
                }
                iArr2 = this.f48229ar;
                if (iArr2[1] == 2 || i7 <= 0) {
                    i10 = i7;
                } else {
                    i10 = i7;
                    if (m19687h() > i10) {
                        this.f48255aB = true;
                        iArr2[1] = 1;
                        m19666A(i10);
                        z2 = true;
                        z15 = true;
                    }
                }
            } else {
                i10 = i7;
            }
            if (i8 > 8) {
                z3 = false;
            } else {
                z3 = true;
            }
            z16 = z3 & z2;
            i52 = i8;
            i5 = i10;
            arrayList11 = arrayList;
            i50 = 64;
        }
        this.f48284aK = arrayList11;
        if (z15) {
            int[] iArr6 = this.f48229ar;
            iArr6[0] = i2;
            iArr6[1] = i4;
        }
        mo19685T(this.f48264as.f48072k);
    }

    /* JADX INFO: renamed from: W */
    public final void m19712W(int i) {
        this.f48271az = i;
        C1141yc.f48061a = m19714Y(512);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:72:0x0040 A[SYNTHETIC] */
    /* JADX INFO: renamed from: X */
    public final boolean m19713X(boolean z, int i) {
        boolean z2;
        ArrayList arrayList;
        int size;
        int i2;
        boolean z3;
        AbstractC1174zi abstractC1174zi;
        C1163yy c1163yy = this.f48253a;
        boolean z4 = false;
        int iM19679N = c1163yy.f48297a.m19679N(0);
        int iM19679N2 = c1163yy.f48297a.m19679N(1);
        C1153yo c1153yo = c1163yy.f48297a;
        int iM19690k = c1153yo.m19690k();
        int iM19691l = c1153yo.m19691l();
        if (z) {
            if (iM19679N == 2) {
                arrayList = c1163yy.f48301e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    abstractC1174zi = (AbstractC1174zi) arrayList.get(i2);
                    if (abstractC1174zi.f48345g != i && !abstractC1174zi.mo19729e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3 && iM19679N == 2) {
                        c1163yy.f48297a.m19682Q(1);
                        C1153yo c1153yo2 = c1163yy.f48297a;
                        c1153yo2.m19671F(c1163yy.m19734a(c1153yo2, 0));
                        C1153yo c1153yo3 = c1163yy.f48297a;
                        c1153yo3.f48234h.f48344f.mo19740c(c1153yo3.m19689j());
                    }
                } else if (z3 && iM19679N2 == 2) {
                    c1163yy.f48297a.m19683R(1);
                    C1153yo c1153yo4 = c1163yy.f48297a;
                    c1153yo4.m19666A(c1163yy.m19734a(c1153yo4, 1));
                    C1153yo c1153yo5 = c1163yy.f48297a;
                    c1153yo5.f48235i.f48344f.mo19740c(c1153yo5.m19687h());
                }
            } else if (iM19679N2 == 2) {
                iM19679N2 = 2;
                arrayList = c1163yy.f48301e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    abstractC1174zi = (AbstractC1174zi) arrayList.get(i2);
                    if (abstractC1174zi.f48345g != i) {
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3) {
                        c1163yy.f48297a.m19682Q(1);
                        C1153yo c1153yo6 = c1163yy.f48297a;
                        c1153yo6.m19671F(c1163yy.m19734a(c1153yo6, 0));
                        C1153yo c1153yo7 = c1163yy.f48297a;
                        c1153yo7.f48234h.f48344f.mo19740c(c1153yo7.m19689j());
                    }
                } else if (z3) {
                    c1163yy.f48297a.m19683R(1);
                    C1153yo c1153yo8 = c1163yy.f48297a;
                    c1153yo8.m19666A(c1163yy.m19734a(c1153yo8, 1));
                    C1153yo c1153yo9 = c1163yy.f48297a;
                    c1153yo9.f48235i.f48344f.mo19740c(c1153yo9.m19687h());
                }
            }
        }
        if (i == 0) {
            C1153yo c1153yo10 = c1163yy.f48297a;
            int i3 = c1153yo10.f48229ar[0];
            if (i3 == 1 || i3 == 4) {
                int iM19689j = c1153yo10.m19689j() + iM19690k;
                c1153yo10.f48234h.f48348j.mo19740c(iM19689j);
                c1163yy.f48297a.f48234h.f48344f.mo19740c(iM19689j - iM19690k);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            C1153yo c1153yo11 = c1163yy.f48297a;
            int i4 = c1153yo11.f48229ar[1];
            if (i4 == 1 || i4 == 4) {
                int iM19687h = c1153yo11.m19687h() + iM19691l;
                c1153yo11.f48235i.f48348j.mo19740c(iM19687h);
                c1163yy.f48297a.f48235i.f48344f.mo19740c(iM19687h - iM19691l);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c1163yy.m19736c();
        ArrayList arrayList2 = c1163yy.f48301e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC1174zi abstractC1174zi2 = (AbstractC1174zi) arrayList2.get(i5);
            if (abstractC1174zi2.f48345g == i && (abstractC1174zi2.f48342d != c1163yy.f48297a || abstractC1174zi2.f48346h)) {
                abstractC1174zi2.mo19727c();
            }
        }
        ArrayList arrayList3 = c1163yy.f48301e;
        int size3 = arrayList3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            AbstractC1174zi abstractC1174zi3 = (AbstractC1174zi) arrayList3.get(i6);
            if (abstractC1174zi3.f48345g == i && ((z2 || abstractC1174zi3.f48342d != c1163yy.f48297a) && !(abstractC1174zi3.f48347i.f48313i && abstractC1174zi3.f48348j.f48313i && ((abstractC1174zi3 instanceof C1161yw) || abstractC1174zi3.f48344f.f48313i)))) {
                c1163yy.f48297a.m19682Q(iM19679N);
                c1163yy.f48297a.m19683R(iM19679N2);
                return z4;
            }
        }
        z4 = true;
        c1163yy.f48297a.m19682Q(iM19679N);
        c1163yy.f48297a.m19683R(iM19679N2);
        return z4;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m19714Y(int i) {
        return (this.f48271az & i) == i;
    }

    /* JADX INFO: renamed from: c */
    public final void m19716c(C1142yd c1142yd) {
        this.f48274d = c1142yd;
        C1141yc.f48062b = c1142yd;
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: t */
    public final void mo19699t(StringBuilder sb) {
        sb.append(String.valueOf(this.f48239m).concat(":{\n"));
        sb.append("  actualWidth:" + this.f48207W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f48208X);
        sb.append("\n");
        ArrayList arrayList = this.f48284aK;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1152yn) arrayList.get(i)).mo19699t(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // p000.C1159yu, p000.C1152yn
    /* JADX INFO: renamed from: v */
    public final void mo19701v() {
        this.f48264as.m19632k();
        this.f48265at = 0;
        this.f48266au = 0;
        super.mo19701v();
    }

    /* JADX INFO: renamed from: a */
    final void m19715a(C1152yn c1152yn, int i) {
        if (i == 0) {
            int i2 = this.f48267av + 1;
            C1149yk[] c1149ykArr = this.f48270ay;
            int length = c1149ykArr.length;
            if (i2 >= length) {
                this.f48270ay = (C1149yk[]) Arrays.copyOf(c1149ykArr, length + length);
            }
            C1149yk[] c1149ykArr2 = this.f48270ay;
            int i3 = this.f48267av;
            c1149ykArr2[i3] = new C1149yk(c1152yn, 0, this.f48273c);
            this.f48267av = i3 + 1;
            return;
        }
        int i4 = this.f48268aw + 1;
        C1149yk[] c1149ykArr3 = this.f48269ax;
        int length2 = c1149ykArr3.length;
        if (i4 >= length2) {
            this.f48269ax = (C1149yk[]) Arrays.copyOf(c1149ykArr3, length2 + length2);
        }
        C1149yk[] c1149ykArr4 = this.f48269ax;
        int i5 = this.f48268aw;
        c1149ykArr4[i5] = new C1149yk(c1152yn, 1, this.f48273c);
        this.f48268aw = i5 + 1;
    }
}
