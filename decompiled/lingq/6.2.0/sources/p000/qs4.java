package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class qs4 implements bu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0129b f58132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t17 f58133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f58134c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cq3 f58135d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC3735wu f58136e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ un1 f58137f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ qp3 f58138g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ gz8 f58139h;

    public qs4(C0129b c0129b, t17 t17Var, zg4 zg4Var, cq3 cq3Var, InterfaceC3735wu interfaceC3735wu, InterfaceC3624tu interfaceC3624tu, un1 un1Var, qp3 qp3Var, gz8 gz8Var) {
        this.f58132a = c0129b;
        this.f58133b = t17Var;
        this.f58134c = zg4Var;
        this.f58135d = cq3Var;
        this.f58136e = interfaceC3735wu;
        this.f58137f = un1Var;
        this.f58138g = qp3Var;
        this.f58139h = gz8Var;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x039f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0446  */
    /* JADX WARN: Code duplicated, block: B:154:0x044d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0450  */
    /* JADX WARN: Code duplicated, block: B:157:0x0457  */
    /* JADX WARN: Code duplicated, block: B:158:0x045a  */
    /* JADX WARN: Code duplicated, block: B:163:0x046f  */
    /* JADX WARN: Code duplicated, block: B:165:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:175:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:178:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x057a A[LOOP:6: B:199:0x0528->B:216:0x057a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x058b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0597  */
    /* JADX WARN: Code duplicated, block: B:226:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:228:0x05ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0604  */
    /* JADX WARN: Code duplicated, block: B:243:0x0611  */
    /* JADX WARN: Code duplicated, block: B:247:0x0620  */
    /* JADX WARN: Code duplicated, block: B:248:0x0623  */
    /* JADX WARN: Code duplicated, block: B:250:0x0627 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x062f  */
    /* JADX WARN: Code duplicated, block: B:255:0x063a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0644 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x066b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0677  */
    /* JADX WARN: Code duplicated, block: B:269:0x067a  */
    /* JADX WARN: Code duplicated, block: B:271:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0691 A[LOOP:12: B:275:0x068f->B:276:0x0691, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:281:0x06af  */
    /* JADX WARN: Code duplicated, block: B:284:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:287:0x06c4 A[LOOP:13: B:286:0x06c2->B:287:0x06c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:292:0x06e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:293:0x06e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x0701 A[LOOP:15: B:297:0x06ff->B:298:0x0701, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x070d A[LOOP:14: B:296:0x06eb->B:300:0x070d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:302:0x0716  */
    /* JADX WARN: Code duplicated, block: B:304:0x071d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0728  */
    /* JADX WARN: Code duplicated, block: B:310:0x0744 A[LOOP:17: B:307:0x072a->B:310:0x0744, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x0751  */
    /* JADX WARN: Code duplicated, block: B:315:0x0765 A[LOOP:19: B:314:0x0763->B:315:0x0765, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:319:0x0783 A[LOOP:20: B:318:0x0781->B:319:0x0783, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:323:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:325:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:327:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:329:0x07ea A[LOOP:16: B:328:0x07e8->B:329:0x07ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:332:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:335:0x0833 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x0838  */
    /* JADX WARN: Code duplicated, block: B:363:0x04b5 A[EDGE_INSN: B:363:0x04b5->B:173:0x04b5 BREAK  A[LOOP:4: B:161:0x046b->B:172:0x04ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0595 A[EDGE_INSN: B:371:0x0595->B:222:0x0595 BREAK  A[LOOP:6: B:199:0x0528->B:216:0x057a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0711 A[EDGE_INSN: B:383:0x0711->B:301:0x0711 BREAK  A[LOOP:14: B:296:0x06eb->B:300:0x070d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0748 A[EDGE_INSN: B:386:0x0748->B:311:0x0748 BREAK  A[LOOP:17: B:307:0x072a->B:310:0x0744], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0659 A[ADDED_TO_REGION, EDGE_INSN: B:390:0x0659->B:261:0x0659 BREAK  A[LOOP:21: B:254:0x0638->B:260:0x064e], REMOVE, SYNTHETIC] */
    @Override // p000.bu4
    /* JADX INFO: renamed from: a */
    public final it5 mo1021a(cu4 cu4Var, long j) {
        int i;
        long j2;
        xs4 xs4Var;
        int iM3029d;
        int iM21222h;
        qm9 qm9Var;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        us4 us4Var;
        int i6;
        int i7;
        int size;
        ArrayList arrayList;
        int i8;
        at4 at4Var;
        List list;
        int i9;
        List arrayList2;
        int size2;
        int i10;
        int i11;
        List list2;
        int iMo4182d;
        int i12;
        us4 us4Var2;
        int i13;
        int i14;
        int iM3801i;
        long j3;
        int iM10428f;
        List listM22603U0;
        boolean z2;
        int size3;
        int i15;
        int length;
        ArrayList arrayList3;
        int size4;
        int size5;
        int iM22283l;
        int i16;
        List list3;
        int size6;
        int i17;
        ts4[] ts4VarArrM22898a;
        int length2;
        int i18;
        int iM22283l2;
        int i19;
        List list4;
        int i20;
        us4 us4Var3;
        int i21;
        boolean z3;
        ss4 ss4Var;
        long jM1010b;
        int iM10428f2;
        int size7;
        int i22;
        int size8;
        int[] iArr;
        int i23;
        int[] iArr2;
        int i24;
        int i25;
        int i26;
        int[] iArr3;
        ts4[] ts4VarArrM22898a2;
        int length3;
        int i27;
        int iIntValue;
        List list5;
        int i28;
        ts4 ts4Var;
        int iIntValue2;
        ts4[] ts4VarArr;
        ts4 ts4Var2;
        qm9 qm9Var2 = cu4Var.f34541b;
        C0129b c0129b = this.f58132a;
        t66 t66Var = c0129b.f2486s;
        ws4 ws4Var = c0129b.f2471d;
        t66Var.getValue();
        boolean z4 = c0129b.f2469b || qm9Var2.mo211f0();
        Orientation orientation = Orientation.Vertical;
        thb.m22047f(j, orientation);
        LayoutDirection layoutDirection = qm9Var2.getLayoutDirection();
        t17 t17Var = this.f58133b;
        int iMo916w0 = qm9Var2.mo916w0(t17Var.mo14019b(layoutDirection));
        int iMo916w1 = qm9Var2.mo916w0(t17Var.mo14020c(qm9Var2.getLayoutDirection()));
        int iMo916w2 = qm9Var2.mo916w0(t17Var.mo14021d());
        int iMo916w3 = qm9Var2.mo916w0(t17Var.mo14018a()) + iMo916w2;
        int i29 = iMo916w1 + iMo916w0;
        int i30 = iMo916w3 - iMo916w2;
        long jM10431i = dk1.m10431i(j, -i29, -iMo916w3);
        ls4 ls4Var = (ls4) this.f58134c.mo0a();
        at4 at4Var2 = ls4Var.f50073b.f46072a;
        cq3 cq3Var = this.f58135d;
        if (cq3Var.f34376d != null && bk1.m3795c(cq3Var.f34374b, jM10431i) && cq3Var.f34375c == qm9Var2.mo594a()) {
            xs4Var = cq3Var.f34376d;
            xs4Var.getClass();
            i = i29;
            j2 = jM10431i;
        } else {
            cq3Var.f34374b = jM10431i;
            cq3Var.f34375c = qm9Var2.mo594a();
            C3794yf c3794yf = cq3Var.f34373a;
            zp3 zp3Var = (zp3) c3794yf.f69758b;
            InterfaceC3624tu interfaceC3624tu = (InterfaceC3624tu) c3794yf.f69759c;
            if (bk1.m3801i(jM10431i) == Integer.MAX_VALUE) {
                l54.m15814a("LazyVerticalGrid's width should be bound by parent.");
            }
            int iM3801i2 = bk1.m3801i(jM10431i);
            int[] iArrM22621m1 = u91.m22621m1(zp3Var.mo24096a(cu4Var, iM3801i2, cu4Var.mo916w0(interfaceC3624tu.mo9967a())));
            int[] iArr4 = new int[iArrM22621m1.length];
            i = i29;
            j2 = jM10431i;
            interfaceC3624tu.mo9968j(cu4Var, iM3801i2, iArrM22621m1, LayoutDirection.Ltr, iArr4);
            xs4Var = new xs4(iArrM22621m1, iArr4);
            cq3Var.f34376d = xs4Var;
        }
        int length4 = xs4Var.f68644a.length;
        if (length4 != at4Var2.f7462f) {
            at4Var2.f7462f = length4;
            ArrayList arrayList4 = at4Var2.f7457a;
            arrayList4.clear();
            arrayList4.add(new ys4(0, 0));
            at4Var2.f7458b = 0;
            at4Var2.f7459c = 0;
            at4Var2.f7460d = 0;
            at4Var2.f7461e = -1;
            ((ArrayList) at4Var2.f7464h).clear();
        }
        InterfaceC3735wu interfaceC3735wu = this.f58136e;
        if (interfaceC3735wu == null) {
            throw wq1.m24126v("null verticalArrangement when isVertical == true");
        }
        int iMo916w4 = qm9Var2.mo916w0(interfaceC3735wu.m24157a());
        int iMo15745a = ls4Var.mo15745a();
        int iM3800h = bk1.m3800h(j) - r19;
        os4 os4Var = new os4(ls4Var, cu4Var, iMo916w4, this.f58132a, iMo916w2, i30, (((long) iMo916w0) << 32) | (((long) iMo916w2) & 4294967295L));
        ps4 ps4Var = new ps4(xs4Var, iMo15745a, iMo916w4, os4Var, at4Var2);
        int i31 = iMo15745a;
        C3704w c3704w = new C3704w(22, at4Var2, ps4Var);
        C0011a9 c0011a9 = new C0011a9(at4Var2, 23);
        jc9 jc9VarM16139y = lda.m16139y();
        ArrayList arrayList5 = null;
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            int iM21222h2 = ws4Var.f67245b.m21222h();
            ps4 ps4Var2 = ps4Var;
            int iM19375m = pk9.m19375m(iM21222h2, ls4Var, ws4Var.f67248e);
            if (iM21222h2 != iM19375m) {
                ws4Var.f67245b.m21223i(iM19375m);
                ws4Var.f67249f.m11342c(iM21222h2);
            }
            if (iM19375m < i31 || i31 <= 0) {
                iM3029d = at4Var2.m3029d(iM19375m);
                iM21222h = ws4Var.f67246c.m21222h();
            } else {
                iM3029d = at4Var2.m3029d(i31 - 1);
                iM21222h = 0;
            }
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            List listM10531g = do7.m10531g(ls4Var, c0129b.f2484q, c0129b.f2481n);
            float fFloatValue = (qm9Var2.mo211f0() || !z4) ? c0129b.f2474g : ((Number) ((xc9) c0129b.f2489v.f2565b.f8704b).getValue()).floatValue();
            C0135d c0135d = c0129b.f2480m;
            boolean zMo211f0 = qm9Var2.mo211f0();
            ss4 ss4Var2 = c0129b.f2470c;
            t66 t66Var2 = c0129b.f2485r;
            if (r6 < 0) {
                l54.m15814a("negative beforeContentPadding");
            }
            if (i30 < 0) {
                l54.m15814a("negative afterContentPadding");
            }
            ls4 ls4Var2 = os4Var.f54932b;
            un1 un1Var = this.f58137f;
            int i32 = iM3029d;
            qp3 qp3Var = this.f58138g;
            int i33 = iM21222h;
            EmptyList emptyList = EmptyList.f47638a;
            if (i31 <= 0) {
                int iM3803k = bk1.m3803k(j2);
                int iM3802j = bk1.m3802j(j2);
                c0135d.m1011d(0, iM3803k, iM3802j, new ArrayList(), ls4Var2.f50074c, os4Var, true, zMo211f0, length4, z4, 0, 0, un1Var, qp3Var);
                if (!zMo211f0) {
                    long jM1010b2 = c0135d.m1010b();
                    if (!n84.m17279a(jM1010b2, 0L)) {
                        long j4 = j2;
                        iM3803k = dk1.m10429g((int) (jM1010b2 >> 32), j4);
                        iM3802j = dk1.m10428f((int) (jM1010b2 & 4294967295L), j4);
                    }
                }
                qm9Var = qm9Var2;
                ss4Var = new ss4(null, 0, false, 0.0f, qm9Var2.mo9895M0(dk1.m10429g(iM3803k + i, j), dk1.m10428f(iM3802j + iMo916w3, j), AbstractC3194a.m15360M(), new C2951e4(29)), 0.0f, false, un1Var, cu4Var, length4, c3704w, c0011a9, emptyList, -iMo916w2, iM3800h + i30, 0, orientation, i30, iMo916w4);
            } else {
                qm9Var = qm9Var2;
                t66 t66Var3 = t66Var2;
                int iRound = Math.round(fFloatValue);
                int i34 = i33 - iRound;
                if (i32 == 0 && i34 < 0) {
                    iRound += i34;
                    i34 = 0;
                }
                C0825bv c0825bv = new C0825bv();
                int i35 = -r6;
                int i36 = i35 + (iMo916w4 < 0 ? iMo916w4 : 0);
                int i37 = i34 + i36;
                while (i37 < 0 && i32 > 0) {
                    float f = fFloatValue;
                    int i38 = i32 - 1;
                    EmptyList emptyList2 = emptyList;
                    ps4 ps4Var3 = ps4Var2;
                    t66 t66Var4 = t66Var3;
                    us4 us4VarM19469b = ps4Var3.m19469b(i38);
                    i32 = i38;
                    c0825bv.add(0, us4VarM19469b);
                    i37 += us4VarM19469b.f64293g;
                    fFloatValue = f;
                    t66Var3 = t66Var4;
                    ps4Var2 = ps4Var3;
                    emptyList = emptyList2;
                }
                float f2 = fFloatValue;
                EmptyList emptyList3 = emptyList;
                ps4 ps4Var4 = ps4Var2;
                t66 t66Var5 = t66Var3;
                if (i37 < i36) {
                    iRound -= i36 - i37;
                    i37 = i36;
                }
                int i39 = iRound;
                int i40 = i37 - i36;
                int i41 = iM3800h + i30;
                int i42 = i41 >= 0 ? i41 : 0;
                int i43 = i40;
                int i44 = -i40;
                int i45 = i32;
                int i46 = 0;
                boolean z5 = false;
                while (i46 < c0825bv.f9041c) {
                    if (i44 >= i42) {
                        c0825bv.mo4183f(i46);
                        z5 = true;
                    } else {
                        i45++;
                        i44 += ((us4) c0825bv.get(i46)).f64293g;
                        i46++;
                    }
                }
                int i47 = i45;
                boolean z6 = z5;
                while (true) {
                    if (i47 >= i31 || (i44 >= i42 && i44 > 0 && !c0825bv.isEmpty())) {
                        z = z6;
                        break;
                    }
                    int i48 = i42;
                    us4 us4VarM19469b2 = ps4Var4.m19469b(i47);
                    int i49 = i47;
                    int i50 = us4VarM19469b2.f64293g;
                    ts4[] ts4VarArr2 = us4VarM19469b2.f64288b;
                    z = z6;
                    if (ts4VarArr2.length == 0) {
                        break;
                    }
                    i44 += i50;
                    if (i44 > i36) {
                        c0825bv.addLast(us4VarM19469b2);
                        z6 = z;
                    } else {
                        if (ts4VarArr2.length == 0) {
                            uk9.m22775i("Array is empty.");
                            return null;
                        }
                        if (ts4VarArr2[ts4VarArr2.length - 1].f62798a != i31 - 1) {
                            i43 -= i50;
                            i32 = i49 + 1;
                            z6 = true;
                        } else {
                            c0825bv.addLast(us4VarM19469b2);
                            z6 = z;
                        }
                    }
                    i47 = i49 + 1;
                    i42 = i48;
                }
                if (i44 < iM3800h) {
                    int i51 = iM3800h - i44;
                    int i52 = i44 + i51;
                    i3 = i43 - i51;
                    while (i3 < r6 && i32 > 0) {
                        int i53 = i32 - 1;
                        int i54 = i52;
                        us4 us4VarM19469b3 = ps4Var4.m19469b(i53);
                        c0825bv.add(0, us4VarM19469b3);
                        i3 += us4VarM19469b3.f64293g;
                        i52 = i54;
                        i51 = i51;
                        i32 = i53;
                    }
                    int i55 = i52;
                    i2 = i39 + i51;
                    if (i3 < 0) {
                        i2 += i3;
                        i44 = i55 + i3;
                        i3 = 0;
                    } else {
                        i44 = i55;
                    }
                } else {
                    i2 = i39;
                    i3 = i43;
                }
                float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i2) || Math.abs(Math.round(f2)) < Math.abs(i2)) ? f2 : i2;
                float f4 = f2 - f3;
                float f5 = 0.0f;
                if (zMo211f0 && i2 > i39 && f4 <= 0.0f) {
                    f5 = (i2 - i39) + f4;
                }
                float f6 = f5;
                if (i3 < 0) {
                    l54.m15814a("negative initial offset");
                }
                int i56 = -i3;
                us4 us4Var4 = (us4) c0825bv.m4186i();
                if (us4Var4 != null) {
                    ts4[] ts4VarArr3 = us4Var4.f64288b;
                    i4 = i3;
                    ts4 ts4Var3 = ts4VarArr3.length == 0 ? null : ts4VarArr3[0];
                    i5 = ts4Var3 != null ? ts4Var3.f62798a : 0;
                    us4Var = (us4) c0825bv.m4188k();
                    if (us4Var != null) {
                        ts4VarArr = us4Var.f64288b;
                        i6 = i56;
                        if (ts4VarArr.length == 0) {
                            ts4Var2 = null;
                        } else {
                            ts4Var2 = ts4VarArr[ts4VarArr.length - 1];
                        }
                        i7 = ts4Var2 != null ? ts4Var2.f62798a : 0;
                        List list6 = listM10531g;
                        size = list6.size();
                        arrayList = null;
                        i8 = 0;
                        while (true) {
                            at4Var = ps4Var4.f56761e;
                            if (i8 < size) {
                                break;
                            }
                            int i57 = size;
                            iIntValue2 = ((Number) listM10531g.get(i8)).intValue();
                            if (iIntValue2 < 0 && iIntValue2 < i5) {
                                int i58 = at4Var.f7462f;
                                int iM3032g = at4Var.m3032g(iIntValue2);
                                ts4 ts4VarM18462E = os4Var.m18462E(iIntValue2, 0, iM3032g, os4Var.f54934d, ps4Var4.m19468a(0, iM3032g));
                                ArrayList arrayList6 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList6.add(ts4VarM18462E);
                                arrayList = arrayList6;
                            }
                            i8++;
                            size = i57;
                            i5 = i5;
                        }
                        int i59 = i5;
                        if (arrayList == null) {
                            list = emptyList3;
                        } else {
                            list = arrayList;
                        }
                        if (zMo211f0 || ss4Var2 == null) {
                            f3 = f3;
                            i9 = i7;
                            arrayList2 = null;
                        } else {
                            List list7 = ss4Var2.f61346m;
                            if (list7.isEmpty()) {
                                f3 = f3;
                                i9 = i7;
                            } else {
                                int size9 = list7.size() - 1;
                                int i60 = -1;
                                while (true) {
                                    if (i60 >= size9) {
                                        ts4Var = null;
                                        break;
                                    }
                                    int i61 = i60;
                                    if (((ts4) list7.get(size9)).f62798a > i7 && (size9 == 0 || ((ts4) list7.get(size9 - 1)).f62798a <= i7)) {
                                        ts4Var = (ts4) list7.get(size9);
                                        break;
                                    }
                                    size9--;
                                    i60 = i61;
                                }
                                ts4 ts4Var4 = (ts4) u91.m22597O0(list7);
                                us4 us4Var5 = (us4) u91.m22598P0(c0825bv);
                                int i62 = us4Var5 != null ? us4Var5.f64287a + 1 : 0;
                                if (ts4Var != null) {
                                    int i63 = ts4Var.f62798a;
                                    i9 = i7;
                                    int iMin = Math.min(ts4Var4.f62798a, i31 - 1);
                                    if (i63 <= iMin) {
                                        arrayList2 = null;
                                        while (true) {
                                            if (arrayList2 != null) {
                                                ls4Var2 = ls4Var2;
                                                int size10 = arrayList2.size();
                                                f3 = f3;
                                                int i64 = 0;
                                                while (true) {
                                                    if (i64 < size10) {
                                                        int i65 = i64;
                                                        ts4[] ts4VarArr4 = ((us4) arrayList2.get(i64)).f64288b;
                                                        List list8 = arrayList2;
                                                        int length5 = ts4VarArr4.length;
                                                        int i66 = 0;
                                                        while (true) {
                                                            if (i66 < length5) {
                                                                int i67 = i66;
                                                                if (ts4VarArr4[i67].f62798a == i63) {
                                                                    arrayList2 = list8;
                                                                } else {
                                                                    i66 = i67 + 1;
                                                                }
                                                            } else {
                                                                i64 = i65 + 1;
                                                                arrayList2 = list8;
                                                            }
                                                        }
                                                    }
                                                    if (i63 != iMin) {
                                                        break;
                                                    }
                                                    i63++;
                                                    ls4Var2 = ls4Var2;
                                                    f3 = f3;
                                                }
                                            } else {
                                                f3 = f3;
                                                ls4Var2 = ls4Var2;
                                            }
                                            List list9 = arrayList2;
                                            arrayList2 = list9 == null ? new ArrayList() : list9;
                                            us4 us4VarM19469b4 = ps4Var4.m19469b(i62);
                                            i62++;
                                            arrayList2.add(us4VarM19469b4);
                                            if (i63 != iMin) {
                                                break;
                                                break;
                                            }
                                            i63++;
                                            ls4Var2 = ls4Var2;
                                            f3 = f3;
                                        }
                                    }
                                } else {
                                    i9 = i7;
                                }
                            }
                            arrayList2 = null;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = emptyList3;
                        }
                        size2 = list6.size();
                        i10 = 0;
                        while (i10 < size2) {
                            iIntValue = ((Number) listM10531g.get(i10)).intValue();
                            if (i9 + 1 <= iIntValue || iIntValue >= i31) {
                                list5 = listM10531g;
                                i28 = i31;
                            } else if (zMo211f0) {
                                int size11 = arrayList2.size();
                                int i68 = 0;
                                while (true) {
                                    if (i68 < size11) {
                                        list5 = listM10531g;
                                        ts4[] ts4VarArr5 = ((us4) arrayList2.get(i68)).f64288b;
                                        i28 = i31;
                                        int length6 = ts4VarArr5.length;
                                        int i69 = 0;
                                        while (true) {
                                            if (i69 < length6) {
                                                int i70 = i69;
                                                if (ts4VarArr5[i70].f62798a != iIntValue) {
                                                    i69 = i70 + 1;
                                                }
                                            } else {
                                                i68++;
                                                listM10531g = list5;
                                                i31 = i28;
                                            }
                                        }
                                    } else {
                                        list5 = listM10531g;
                                        i28 = i31;
                                        int i71 = at4Var.f7462f;
                                        int iM3032g2 = at4Var.m3032g(iIntValue);
                                        ts4 ts4VarM18462E2 = os4Var.m18462E(iIntValue, 0, iM3032g2, os4Var.f54934d, ps4Var4.m19468a(0, iM3032g2));
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        ArrayList arrayList7 = arrayList5;
                                        arrayList7.add(ts4VarM18462E2);
                                        arrayList5 = arrayList7;
                                    }
                                }
                            } else {
                                list5 = listM10531g;
                                i28 = i31;
                                int i72 = at4Var.f7462f;
                                int iM3032g3 = at4Var.m3032g(iIntValue);
                                ts4 ts4VarM18462E3 = os4Var.m18462E(iIntValue, 0, iM3032g3, os4Var.f54934d, ps4Var4.m19468a(0, iM3032g3));
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                ArrayList arrayList8 = arrayList5;
                                arrayList8.add(ts4VarM18462E3);
                                arrayList5 = arrayList8;
                            }
                            i10++;
                            listM10531g = list5;
                            i31 = i28;
                        }
                        i11 = i31;
                        if (arrayList5 == null) {
                            list2 = emptyList3;
                        } else {
                            list2 = arrayList5;
                        }
                        if (r6 <= 0 || iMo916w4 < 0) {
                            iMo4182d = c0825bv.mo4182d();
                            i12 = i4;
                            us4Var2 = us4Var4;
                            i13 = 0;
                            while (i13 < iMo4182d) {
                                int i73 = ((us4) c0825bv.get(i13)).f64293g;
                                if (i12 != 0 || i73 > i12 || i13 == c0825bv.mo4182d() - 1) {
                                    break;
                                }
                                i12 -= i73;
                                i13++;
                                us4Var2 = (us4) c0825bv.get(i13);
                            }
                            i14 = i12;
                        } else {
                            i14 = i4;
                            us4Var2 = us4Var4;
                        }
                        iM3801i = bk1.m3801i(j2);
                        j3 = j2;
                        iM10428f = dk1.m10428f(i44, j3);
                        listM22603U0 = c0825bv;
                        if (!arrayList2.isEmpty()) {
                            listM22603U0 = u91.m22603U0(arrayList2, c0825bv);
                        }
                        if (i44 < Math.min(iM10428f, iM3800h)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && i6 != 0) {
                            l54.m15816c("non-zero firstLineScrollOffset");
                        }
                        size3 = listM22603U0.size();
                        int i74 = i14;
                        int i75 = i44;
                        length = 0;
                        for (i15 = 0; i15 < size3; i15++) {
                            length += ((us4) listM22603U0.get(i15)).f64288b.length;
                        }
                        arrayList3 = new ArrayList(length);
                        if (z2) {
                            if (list.isEmpty() || !list2.isEmpty()) {
                                l54.m15814a("no items");
                            }
                            size8 = listM22603U0.size();
                            iArr = new int[size8];
                            for (i23 = 0; i23 < size8; i23++) {
                                iArr[i23] = ((us4) listM22603U0.get(i23)).f64292f;
                            }
                            iArr2 = new int[size8];
                            if (interfaceC3735wu != null) {
                                throw wq1.m24126v("null verticalArrangement");
                            }
                            interfaceC3735wu.mo10843k(cu4Var, iM10428f, iArr, iArr2);
                            i84 i84VarM20840h0 = AbstractC3550rv.m20840h0(iArr2);
                            i24 = i84VarM20840h0.f40380b;
                            i25 = i84VarM20840h0.f40381c;
                            if ((i25 > 0 && i24 >= 0) || (i25 < 0 && i24 <= 0)) {
                                i26 = 0;
                                while (true) {
                                    iArr3 = iArr2;
                                    ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                                    length3 = ts4VarArrM22898a2.length;
                                    i27 = 0;
                                    while (i27 < length3) {
                                        int i76 = i27;
                                        arrayList3.add(ts4VarArrM22898a2[i76]);
                                        i27 = i76 + 1;
                                    }
                                    if (i26 == i24) {
                                        break;
                                    }
                                    i26 += i25;
                                    iArr2 = iArr3;
                                }
                            }
                        } else {
                            size4 = list.size() - 1;
                            if (size4 >= 0) {
                                iM22283l2 = i6;
                                while (true) {
                                    i19 = size4 - 1;
                                    ts4 ts4Var5 = (ts4) list.get(size4);
                                    iM22283l2 -= ts4Var5.m22283l();
                                    list4 = list;
                                    ts4Var5.mo10677k(iM22283l2, 0, iM3801i, iM10428f);
                                    arrayList3.add(ts4Var5);
                                    if (i19 < 0) {
                                        break;
                                    }
                                    size4 = i19;
                                    list = list4;
                                }
                            }
                            size5 = listM22603U0.size();
                            iM22283l = i6;
                            i16 = 0;
                            list3 = listM22603U0;
                            while (i16 < size5) {
                                us4 us4Var6 = (us4) list3.get(i16);
                                List list10 = list3;
                                ts4VarArrM22898a = us4Var6.m22898a(iM22283l, iM3801i, iM10428f);
                                int i77 = size5;
                                length2 = ts4VarArrM22898a.length;
                                i18 = 0;
                                while (i18 < length2) {
                                    int i78 = i18;
                                    arrayList3.add(ts4VarArrM22898a[i78]);
                                    i18 = i78 + 1;
                                }
                                iM22283l += us4Var6.f64293g;
                                i16++;
                                list3 = list10;
                                size5 = i77;
                            }
                            size6 = list2.size();
                            for (i17 = 0; i17 < size6; i17++) {
                                ts4 ts4Var6 = (ts4) list2.get(i17);
                                ts4Var6.mo10677k(iM22283l, 0, iM3801i, iM10428f);
                                arrayList3.add(ts4Var6);
                                iM22283l += ts4Var6.m22283l();
                            }
                        }
                        ls4 ls4Var3 = ls4Var2;
                        c0135d.m1011d((int) f3, iM3801i, iM10428f, arrayList3, ls4Var3.f50074c, os4Var, true, zMo211f0, length4, z4, i74, i75, un1Var, qp3Var);
                        if (zMo211f0) {
                            i20 = length4;
                            us4Var3 = us4Var2;
                        } else {
                            us4Var3 = us4Var2;
                            jM1010b = c0135d.m1010b();
                            i20 = length4;
                            if (!n84.m17279a(jM1010b, 0L)) {
                                iM3801i = dk1.m10429g(Math.max(iM3801i, (int) (jM1010b >> 32)), j3);
                                iM10428f2 = dk1.m10428f(Math.max(iM10428f, (int) (jM1010b & 4294967295L)), j3);
                                if (iM10428f2 != iM10428f) {
                                    size7 = arrayList3.size();
                                    for (i22 = 0; i22 < size7; i22++) {
                                        ts4 ts4Var7 = (ts4) arrayList3.get(i22);
                                        ts4Var7.f62816s = iM10428f2;
                                        ts4Var7.f62818u = ts4Var7.f62803f + iM10428f2;
                                    }
                                }
                                iM10428f = iM10428f2;
                            }
                        }
                        int i79 = iM3801i;
                        ls4Var3.f50073b.getClass();
                        i21 = i9;
                        int i80 = iM10428f;
                        List listM23909d = wfb.m23909d(this.f58139h, i59, i21, arrayList3, b84.f8108a, r6, i79, i80, true, new C3704w(23, ps4Var4, os4Var));
                        if (i21 == i11 - 1 || i75 > iM3800h) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ss4Var = new ss4(us4Var3, i74, z3, f3, qm9Var.mo9895M0(dk1.m10429g(i79 + i, j), dk1.m10428f(i80 + r19, j), AbstractC3194a.m15360M(), new rs4(t66Var5, arrayList3, listM23909d, zMo211f0, 0)), f6, z, un1Var, cu4Var, i20, c3704w, c0011a9, b34.m3235c0(i59, i21, arrayList3, listM23909d), i35, i41, i11, Orientation.Vertical, i30, iMo916w4);
                    } else {
                        i6 = i56;
                    }
                    List list11 = listM10531g;
                    size = list11.size();
                    arrayList = null;
                    i8 = 0;
                    while (true) {
                        at4Var = ps4Var4.f56761e;
                        if (i8 < size) {
                            break;
                            break;
                        }
                        int i510 = size;
                        iIntValue2 = ((Number) listM10531g.get(i8)).intValue();
                        if (iIntValue2 < 0) {
                        }
                        i8++;
                        size = i510;
                        i5 = i5;
                    }
                    int i511 = i5;
                    if (arrayList == null) {
                        list = emptyList3;
                    } else {
                        list = arrayList;
                    }
                    if (zMo211f0) {
                        f3 = f3;
                        i9 = i7;
                        arrayList2 = null;
                    } else {
                        f3 = f3;
                        i9 = i7;
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = emptyList3;
                    }
                    size2 = list11.size();
                    i10 = 0;
                    while (i10 < size2) {
                        iIntValue = ((Number) listM10531g.get(i10)).intValue();
                        if (i9 + 1 <= iIntValue) {
                            list5 = listM10531g;
                            i28 = i31;
                        } else {
                            list5 = listM10531g;
                            i28 = i31;
                        }
                        i10++;
                        listM10531g = list5;
                        i31 = i28;
                    }
                    i11 = i31;
                    if (arrayList5 == null) {
                        list2 = emptyList3;
                    } else {
                        list2 = arrayList5;
                    }
                    if (r6 <= 0) {
                        iMo4182d = c0825bv.mo4182d();
                        i12 = i4;
                        us4Var2 = us4Var4;
                        i13 = 0;
                        while (i13 < iMo4182d) {
                            int i710 = ((us4) c0825bv.get(i13)).f64293g;
                            if (i12 != 0) {
                                break;
                            }
                            break;
                        }
                        i14 = i12;
                    } else {
                        iMo4182d = c0825bv.mo4182d();
                        i12 = i4;
                        us4Var2 = us4Var4;
                        i13 = 0;
                        while (i13 < iMo4182d) {
                            int i711 = ((us4) c0825bv.get(i13)).f64293g;
                            if (i12 != 0) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        i14 = i12;
                    }
                    iM3801i = bk1.m3801i(j2);
                    j3 = j2;
                    iM10428f = dk1.m10428f(i44, j3);
                    listM22603U0 = c0825bv;
                    if (!arrayList2.isEmpty()) {
                        listM22603U0 = u91.m22603U0(arrayList2, c0825bv);
                    }
                    if (i44 < Math.min(iM10428f, iM3800h)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        l54.m15816c("non-zero firstLineScrollOffset");
                    }
                    size3 = listM22603U0.size();
                    int i712 = i14;
                    int i713 = i44;
                    length = 0;
                    while (i15 < size3) {
                        length += ((us4) listM22603U0.get(i15)).f64288b.length;
                    }
                    arrayList3 = new ArrayList(length);
                    if (z2) {
                        if (list.isEmpty()) {
                            l54.m15814a("no items");
                        } else {
                            l54.m15814a("no items");
                        }
                        size8 = listM22603U0.size();
                        iArr = new int[size8];
                        while (i23 < size8) {
                            iArr[i23] = ((us4) listM22603U0.get(i23)).f64292f;
                        }
                        iArr2 = new int[size8];
                        if (interfaceC3735wu != null) {
                            throw wq1.m24126v("null verticalArrangement");
                        }
                        interfaceC3735wu.mo10843k(cu4Var, iM10428f, iArr, iArr2);
                        i84 i84VarM20840h1 = AbstractC3550rv.m20840h0(iArr2);
                        i24 = i84VarM20840h1.f40380b;
                        i25 = i84VarM20840h1.f40381c;
                        if (i25 > 0) {
                            i26 = 0;
                            while (true) {
                                iArr3 = iArr2;
                                ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                                length3 = ts4VarArrM22898a2.length;
                                i27 = 0;
                                while (i27 < length3) {
                                    int i714 = i27;
                                    arrayList3.add(ts4VarArrM22898a2[i714]);
                                    i27 = i714 + 1;
                                }
                                if (i26 == i24) {
                                    break;
                                    break;
                                }
                                i26 += i25;
                                iArr2 = iArr3;
                            }
                        } else {
                            i26 = 0;
                            while (true) {
                                iArr3 = iArr2;
                                ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                                length3 = ts4VarArrM22898a2.length;
                                i27 = 0;
                                while (i27 < length3) {
                                    int i715 = i27;
                                    arrayList3.add(ts4VarArrM22898a2[i715]);
                                    i27 = i715 + 1;
                                }
                                if (i26 == i24) {
                                    break;
                                    break;
                                }
                                i26 += i25;
                                iArr2 = iArr3;
                            }
                        }
                    } else {
                        size4 = list.size() - 1;
                        if (size4 >= 0) {
                            iM22283l2 = i6;
                            while (true) {
                                i19 = size4 - 1;
                                ts4 ts4Var8 = (ts4) list.get(size4);
                                iM22283l2 -= ts4Var8.m22283l();
                                list4 = list;
                                ts4Var8.mo10677k(iM22283l2, 0, iM3801i, iM10428f);
                                arrayList3.add(ts4Var8);
                                if (i19 < 0) {
                                    break;
                                    break;
                                }
                                size4 = i19;
                                list = list4;
                            }
                        }
                        size5 = listM22603U0.size();
                        iM22283l = i6;
                        i16 = 0;
                        list3 = listM22603U0;
                        while (i16 < size5) {
                            us4 us4Var7 = (us4) list3.get(i16);
                            List list12 = list3;
                            ts4VarArrM22898a = us4Var7.m22898a(iM22283l, iM3801i, iM10428f);
                            int i716 = size5;
                            length2 = ts4VarArrM22898a.length;
                            i18 = 0;
                            while (i18 < length2) {
                                int i717 = i18;
                                arrayList3.add(ts4VarArrM22898a[i717]);
                                i18 = i717 + 1;
                            }
                            iM22283l += us4Var7.f64293g;
                            i16++;
                            list3 = list12;
                            size5 = i716;
                        }
                        size6 = list2.size();
                        while (i17 < size6) {
                            ts4 ts4Var9 = (ts4) list2.get(i17);
                            ts4Var9.mo10677k(iM22283l, 0, iM3801i, iM10428f);
                            arrayList3.add(ts4Var9);
                            iM22283l += ts4Var9.m22283l();
                        }
                    }
                    ls4 ls4Var4 = ls4Var2;
                    c0135d.m1011d((int) f3, iM3801i, iM10428f, arrayList3, ls4Var4.f50074c, os4Var, true, zMo211f0, length4, z4, i712, i713, un1Var, qp3Var);
                    if (zMo211f0) {
                        us4Var3 = us4Var2;
                        jM1010b = c0135d.m1010b();
                        i20 = length4;
                        if (!n84.m17279a(jM1010b, 0L)) {
                            iM3801i = dk1.m10429g(Math.max(iM3801i, (int) (jM1010b >> 32)), j3);
                            iM10428f2 = dk1.m10428f(Math.max(iM10428f, (int) (jM1010b & 4294967295L)), j3);
                            if (iM10428f2 != iM10428f) {
                                size7 = arrayList3.size();
                                while (i22 < size7) {
                                    ts4 ts4Var10 = (ts4) arrayList3.get(i22);
                                    ts4Var10.f62816s = iM10428f2;
                                    ts4Var10.f62818u = ts4Var10.f62803f + iM10428f2;
                                }
                            }
                            iM10428f = iM10428f2;
                        }
                    } else {
                        i20 = length4;
                        us4Var3 = us4Var2;
                    }
                    int i718 = iM3801i;
                    ls4Var4.f50073b.getClass();
                    i21 = i9;
                    int i81 = iM10428f;
                    List listM23909d2 = wfb.m23909d(this.f58139h, i511, i21, arrayList3, b84.f8108a, r6, i718, i81, true, new C3704w(23, ps4Var4, os4Var));
                    if (i21 == i11 - 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    ss4Var = new ss4(us4Var3, i712, z3, f3, qm9Var.mo9895M0(dk1.m10429g(i718 + i, j), dk1.m10428f(i81 + r19, j), AbstractC3194a.m15360M(), new rs4(t66Var5, arrayList3, listM23909d2, zMo211f0, 0)), f6, z, un1Var, cu4Var, i20, c3704w, c0011a9, b34.m3235c0(i511, i21, arrayList3, listM23909d2), i35, i41, i11, Orientation.Vertical, i30, iMo916w4);
                } else {
                    i4 = i3;
                }
                us4Var = (us4) c0825bv.m4188k();
                if (us4Var != null) {
                    ts4VarArr = us4Var.f64288b;
                    i6 = i56;
                    if (ts4VarArr.length == 0) {
                        ts4Var2 = null;
                    } else {
                        ts4Var2 = ts4VarArr[ts4VarArr.length - 1];
                    }
                    if (ts4Var2 != null) {
                    }
                    List list13 = listM10531g;
                    size = list13.size();
                    arrayList = null;
                    i8 = 0;
                    while (true) {
                        at4Var = ps4Var4.f56761e;
                        if (i8 < size) {
                            break;
                            break;
                        }
                        int i512 = size;
                        iIntValue2 = ((Number) listM10531g.get(i8)).intValue();
                        if (iIntValue2 < 0) {
                        }
                        i8++;
                        size = i512;
                        i5 = i5;
                    }
                    int i513 = i5;
                    if (arrayList == null) {
                        list = emptyList3;
                    } else {
                        list = arrayList;
                    }
                    if (zMo211f0) {
                        f3 = f3;
                        i9 = i7;
                        arrayList2 = null;
                    } else {
                        f3 = f3;
                        i9 = i7;
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = emptyList3;
                    }
                    size2 = list13.size();
                    i10 = 0;
                    while (i10 < size2) {
                        iIntValue = ((Number) listM10531g.get(i10)).intValue();
                        if (i9 + 1 <= iIntValue) {
                            list5 = listM10531g;
                            i28 = i31;
                        } else {
                            list5 = listM10531g;
                            i28 = i31;
                        }
                        i10++;
                        listM10531g = list5;
                        i31 = i28;
                    }
                    i11 = i31;
                    if (arrayList5 == null) {
                        list2 = emptyList3;
                    } else {
                        list2 = arrayList5;
                    }
                    if (r6 <= 0) {
                        iMo4182d = c0825bv.mo4182d();
                        i12 = i4;
                        us4Var2 = us4Var4;
                        i13 = 0;
                        while (i13 < iMo4182d) {
                            int i719 = ((us4) c0825bv.get(i13)).f64293g;
                            if (i12 != 0) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        i14 = i12;
                    } else {
                        iMo4182d = c0825bv.mo4182d();
                        i12 = i4;
                        us4Var2 = us4Var4;
                        i13 = 0;
                        while (i13 < iMo4182d) {
                            int i7110 = ((us4) c0825bv.get(i13)).f64293g;
                            if (i12 != 0) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        i14 = i12;
                    }
                    iM3801i = bk1.m3801i(j2);
                    j3 = j2;
                    iM10428f = dk1.m10428f(i44, j3);
                    listM22603U0 = c0825bv;
                    if (!arrayList2.isEmpty()) {
                        listM22603U0 = u91.m22603U0(arrayList2, c0825bv);
                    }
                    if (i44 < Math.min(iM10428f, iM3800h)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        l54.m15816c("non-zero firstLineScrollOffset");
                    }
                    size3 = listM22603U0.size();
                    int i7111 = i14;
                    int i7112 = i44;
                    length = 0;
                    while (i15 < size3) {
                        length += ((us4) listM22603U0.get(i15)).f64288b.length;
                    }
                    arrayList3 = new ArrayList(length);
                    if (z2) {
                        if (list.isEmpty()) {
                            l54.m15814a("no items");
                        } else {
                            l54.m15814a("no items");
                        }
                        size8 = listM22603U0.size();
                        iArr = new int[size8];
                        while (i23 < size8) {
                            iArr[i23] = ((us4) listM22603U0.get(i23)).f64292f;
                        }
                        iArr2 = new int[size8];
                        if (interfaceC3735wu != null) {
                            throw wq1.m24126v("null verticalArrangement");
                        }
                        interfaceC3735wu.mo10843k(cu4Var, iM10428f, iArr, iArr2);
                        i84 i84VarM20840h2 = AbstractC3550rv.m20840h0(iArr2);
                        i24 = i84VarM20840h2.f40380b;
                        i25 = i84VarM20840h2.f40381c;
                        if (i25 > 0) {
                            i26 = 0;
                            while (true) {
                                iArr3 = iArr2;
                                ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                                length3 = ts4VarArrM22898a2.length;
                                i27 = 0;
                                while (i27 < length3) {
                                    int i7113 = i27;
                                    arrayList3.add(ts4VarArrM22898a2[i7113]);
                                    i27 = i7113 + 1;
                                }
                                if (i26 == i24) {
                                    break;
                                    break;
                                }
                                i26 += i25;
                                iArr2 = iArr3;
                            }
                        } else {
                            i26 = 0;
                            while (true) {
                                iArr3 = iArr2;
                                ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                                length3 = ts4VarArrM22898a2.length;
                                i27 = 0;
                                while (i27 < length3) {
                                    int i7114 = i27;
                                    arrayList3.add(ts4VarArrM22898a2[i7114]);
                                    i27 = i7114 + 1;
                                }
                                if (i26 == i24) {
                                    break;
                                    break;
                                }
                                i26 += i25;
                                iArr2 = iArr3;
                            }
                        }
                    } else {
                        size4 = list.size() - 1;
                        if (size4 >= 0) {
                            iM22283l2 = i6;
                            while (true) {
                                i19 = size4 - 1;
                                ts4 ts4Var11 = (ts4) list.get(size4);
                                iM22283l2 -= ts4Var11.m22283l();
                                list4 = list;
                                ts4Var11.mo10677k(iM22283l2, 0, iM3801i, iM10428f);
                                arrayList3.add(ts4Var11);
                                if (i19 < 0) {
                                    break;
                                    break;
                                }
                                size4 = i19;
                                list = list4;
                            }
                        }
                        size5 = listM22603U0.size();
                        iM22283l = i6;
                        i16 = 0;
                        list3 = listM22603U0;
                        while (i16 < size5) {
                            us4 us4Var8 = (us4) list3.get(i16);
                            List list14 = list3;
                            ts4VarArrM22898a = us4Var8.m22898a(iM22283l, iM3801i, iM10428f);
                            int i7115 = size5;
                            length2 = ts4VarArrM22898a.length;
                            i18 = 0;
                            while (i18 < length2) {
                                int i7116 = i18;
                                arrayList3.add(ts4VarArrM22898a[i7116]);
                                i18 = i7116 + 1;
                            }
                            iM22283l += us4Var8.f64293g;
                            i16++;
                            list3 = list14;
                            size5 = i7115;
                        }
                        size6 = list2.size();
                        while (i17 < size6) {
                            ts4 ts4Var12 = (ts4) list2.get(i17);
                            ts4Var12.mo10677k(iM22283l, 0, iM3801i, iM10428f);
                            arrayList3.add(ts4Var12);
                            iM22283l += ts4Var12.m22283l();
                        }
                    }
                    ls4 ls4Var5 = ls4Var2;
                    c0135d.m1011d((int) f3, iM3801i, iM10428f, arrayList3, ls4Var5.f50074c, os4Var, true, zMo211f0, length4, z4, i7111, i7112, un1Var, qp3Var);
                    if (zMo211f0) {
                        us4Var3 = us4Var2;
                        jM1010b = c0135d.m1010b();
                        i20 = length4;
                        if (!n84.m17279a(jM1010b, 0L)) {
                            iM3801i = dk1.m10429g(Math.max(iM3801i, (int) (jM1010b >> 32)), j3);
                            iM10428f2 = dk1.m10428f(Math.max(iM10428f, (int) (jM1010b & 4294967295L)), j3);
                            if (iM10428f2 != iM10428f) {
                                size7 = arrayList3.size();
                                while (i22 < size7) {
                                    ts4 ts4Var13 = (ts4) arrayList3.get(i22);
                                    ts4Var13.f62816s = iM10428f2;
                                    ts4Var13.f62818u = ts4Var13.f62803f + iM10428f2;
                                }
                            }
                            iM10428f = iM10428f2;
                        }
                    } else {
                        i20 = length4;
                        us4Var3 = us4Var2;
                    }
                    int i7117 = iM3801i;
                    ls4Var5.f50073b.getClass();
                    i21 = i9;
                    int i82 = iM10428f;
                    List listM23909d3 = wfb.m23909d(this.f58139h, i513, i21, arrayList3, b84.f8108a, r6, i7117, i82, true, new C3704w(23, ps4Var4, os4Var));
                    if (i21 == i11 - 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    ss4Var = new ss4(us4Var3, i7111, z3, f3, qm9Var.mo9895M0(dk1.m10429g(i7117 + i, j), dk1.m10428f(i82 + r19, j), AbstractC3194a.m15360M(), new rs4(t66Var5, arrayList3, listM23909d3, zMo211f0, 0)), f6, z, un1Var, cu4Var, i20, c3704w, c0011a9, b34.m3235c0(i513, i21, arrayList3, listM23909d3), i35, i41, i11, Orientation.Vertical, i30, iMo916w4);
                } else {
                    i6 = i56;
                }
                List list15 = listM10531g;
                size = list15.size();
                arrayList = null;
                i8 = 0;
                while (true) {
                    at4Var = ps4Var4.f56761e;
                    if (i8 < size) {
                        break;
                        break;
                    }
                    int i514 = size;
                    iIntValue2 = ((Number) listM10531g.get(i8)).intValue();
                    if (iIntValue2 < 0) {
                    }
                    i8++;
                    size = i514;
                    i5 = i5;
                }
                int i515 = i5;
                if (arrayList == null) {
                    list = emptyList3;
                } else {
                    list = arrayList;
                }
                if (zMo211f0) {
                    f3 = f3;
                    i9 = i7;
                    arrayList2 = null;
                } else {
                    f3 = f3;
                    i9 = i7;
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = emptyList3;
                }
                size2 = list15.size();
                i10 = 0;
                while (i10 < size2) {
                    iIntValue = ((Number) listM10531g.get(i10)).intValue();
                    if (i9 + 1 <= iIntValue) {
                        list5 = listM10531g;
                        i28 = i31;
                    } else {
                        list5 = listM10531g;
                        i28 = i31;
                    }
                    i10++;
                    listM10531g = list5;
                    i31 = i28;
                }
                i11 = i31;
                if (arrayList5 == null) {
                    list2 = emptyList3;
                } else {
                    list2 = arrayList5;
                }
                if (r6 <= 0) {
                    iMo4182d = c0825bv.mo4182d();
                    i12 = i4;
                    us4Var2 = us4Var4;
                    i13 = 0;
                    while (i13 < iMo4182d) {
                        int i7118 = ((us4) c0825bv.get(i13)).f64293g;
                        if (i12 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    i14 = i12;
                } else {
                    iMo4182d = c0825bv.mo4182d();
                    i12 = i4;
                    us4Var2 = us4Var4;
                    i13 = 0;
                    while (i13 < iMo4182d) {
                        int i7119 = ((us4) c0825bv.get(i13)).f64293g;
                        if (i12 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    i14 = i12;
                }
                iM3801i = bk1.m3801i(j2);
                j3 = j2;
                iM10428f = dk1.m10428f(i44, j3);
                listM22603U0 = c0825bv;
                if (!arrayList2.isEmpty()) {
                    listM22603U0 = u91.m22603U0(arrayList2, c0825bv);
                }
                if (i44 < Math.min(iM10428f, iM3800h)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    l54.m15816c("non-zero firstLineScrollOffset");
                }
                size3 = listM22603U0.size();
                int i71110 = i14;
                int i71111 = i44;
                length = 0;
                while (i15 < size3) {
                    length += ((us4) listM22603U0.get(i15)).f64288b.length;
                }
                arrayList3 = new ArrayList(length);
                if (z2) {
                    if (list.isEmpty()) {
                        l54.m15814a("no items");
                    } else {
                        l54.m15814a("no items");
                    }
                    size8 = listM22603U0.size();
                    iArr = new int[size8];
                    while (i23 < size8) {
                        iArr[i23] = ((us4) listM22603U0.get(i23)).f64292f;
                    }
                    iArr2 = new int[size8];
                    if (interfaceC3735wu != null) {
                        throw wq1.m24126v("null verticalArrangement");
                    }
                    interfaceC3735wu.mo10843k(cu4Var, iM10428f, iArr, iArr2);
                    i84 i84VarM20840h3 = AbstractC3550rv.m20840h0(iArr2);
                    i24 = i84VarM20840h3.f40380b;
                    i25 = i84VarM20840h3.f40381c;
                    if (i25 > 0) {
                        i26 = 0;
                        while (true) {
                            iArr3 = iArr2;
                            ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                            length3 = ts4VarArrM22898a2.length;
                            i27 = 0;
                            while (i27 < length3) {
                                int i71112 = i27;
                                arrayList3.add(ts4VarArrM22898a2[i71112]);
                                i27 = i71112 + 1;
                            }
                            if (i26 == i24) {
                                break;
                                break;
                            }
                            i26 += i25;
                            iArr2 = iArr3;
                        }
                    } else {
                        i26 = 0;
                        while (true) {
                            iArr3 = iArr2;
                            ts4VarArrM22898a2 = ((us4) listM22603U0.get(i26)).m22898a(iArr2[i26], iM3801i, iM10428f);
                            length3 = ts4VarArrM22898a2.length;
                            i27 = 0;
                            while (i27 < length3) {
                                int i71113 = i27;
                                arrayList3.add(ts4VarArrM22898a2[i71113]);
                                i27 = i71113 + 1;
                            }
                            if (i26 == i24) {
                                break;
                                break;
                            }
                            i26 += i25;
                            iArr2 = iArr3;
                        }
                    }
                } else {
                    size4 = list.size() - 1;
                    if (size4 >= 0) {
                        iM22283l2 = i6;
                        while (true) {
                            i19 = size4 - 1;
                            ts4 ts4Var14 = (ts4) list.get(size4);
                            iM22283l2 -= ts4Var14.m22283l();
                            list4 = list;
                            ts4Var14.mo10677k(iM22283l2, 0, iM3801i, iM10428f);
                            arrayList3.add(ts4Var14);
                            if (i19 < 0) {
                                break;
                                break;
                            }
                            size4 = i19;
                            list = list4;
                        }
                    }
                    size5 = listM22603U0.size();
                    iM22283l = i6;
                    i16 = 0;
                    list3 = listM22603U0;
                    while (i16 < size5) {
                        us4 us4Var9 = (us4) list3.get(i16);
                        List list16 = list3;
                        ts4VarArrM22898a = us4Var9.m22898a(iM22283l, iM3801i, iM10428f);
                        int i71114 = size5;
                        length2 = ts4VarArrM22898a.length;
                        i18 = 0;
                        while (i18 < length2) {
                            int i71115 = i18;
                            arrayList3.add(ts4VarArrM22898a[i71115]);
                            i18 = i71115 + 1;
                        }
                        iM22283l += us4Var9.f64293g;
                        i16++;
                        list3 = list16;
                        size5 = i71114;
                    }
                    size6 = list2.size();
                    while (i17 < size6) {
                        ts4 ts4Var15 = (ts4) list2.get(i17);
                        ts4Var15.mo10677k(iM22283l, 0, iM3801i, iM10428f);
                        arrayList3.add(ts4Var15);
                        iM22283l += ts4Var15.m22283l();
                    }
                }
                ls4 ls4Var6 = ls4Var2;
                c0135d.m1011d((int) f3, iM3801i, iM10428f, arrayList3, ls4Var6.f50074c, os4Var, true, zMo211f0, length4, z4, i71110, i71111, un1Var, qp3Var);
                if (zMo211f0) {
                    us4Var3 = us4Var2;
                    jM1010b = c0135d.m1010b();
                    i20 = length4;
                    if (!n84.m17279a(jM1010b, 0L)) {
                        iM3801i = dk1.m10429g(Math.max(iM3801i, (int) (jM1010b >> 32)), j3);
                        iM10428f2 = dk1.m10428f(Math.max(iM10428f, (int) (jM1010b & 4294967295L)), j3);
                        if (iM10428f2 != iM10428f) {
                            size7 = arrayList3.size();
                            while (i22 < size7) {
                                ts4 ts4Var16 = (ts4) arrayList3.get(i22);
                                ts4Var16.f62816s = iM10428f2;
                                ts4Var16.f62818u = ts4Var16.f62803f + iM10428f2;
                            }
                        }
                        iM10428f = iM10428f2;
                    }
                } else {
                    i20 = length4;
                    us4Var3 = us4Var2;
                }
                int i71116 = iM3801i;
                ls4Var6.f50073b.getClass();
                i21 = i9;
                int i83 = iM10428f;
                List listM23909d4 = wfb.m23909d(this.f58139h, i515, i21, arrayList3, b84.f8108a, r6, i71116, i83, true, new C3704w(23, ps4Var4, os4Var));
                if (i21 == i11 - 1) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                ss4Var = new ss4(us4Var3, i71110, z3, f3, qm9Var.mo9895M0(dk1.m10429g(i71116 + i, j), dk1.m10428f(i83 + r19, j), AbstractC3194a.m15360M(), new rs4(t66Var5, arrayList3, listM23909d4, zMo211f0, 0)), f6, z, un1Var, cu4Var, i20, c3704w, c0011a9, b34.m3235c0(i515, i21, arrayList3, listM23909d4), i35, i41, i11, Orientation.Vertical, i30, iMo916w4);
            }
            c0129b.m984f(ss4Var, qm9Var.mo211f0(), false);
            b72 b72Var = c0129b.f2468a;
            return ss4Var;
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }
}
