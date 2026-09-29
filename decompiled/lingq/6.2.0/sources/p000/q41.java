package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.glance.appwidget.protobuf.C0683q;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.google.android.gms.internal.mlkit_vision_text_common.AbstractC0981l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.oned.C1193a;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.EnumMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class q41 implements coa, g94, j90, p9b, e94, gr9, qj6, lkd, xoc {

    /* JADX INFO: renamed from: b */
    public static final q41 f57241b = new q41(0);

    /* JADX INFO: renamed from: c */
    public static final q41 f57242c = new q41(1);

    /* JADX INFO: renamed from: d */
    public static final q41 f57243d = new q41(2);

    /* JADX INFO: renamed from: e */
    public static final q41 f57244e = new q41(3);

    /* JADX INFO: renamed from: f */
    public static final q41 f57245f = new q41(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57246a;

    public /* synthetic */ q41(int i) {
        this.f57246a = i;
    }

    /* JADX INFO: renamed from: j */
    public static final o41 m19636j(nt2 nt2Var, View view, View view2) {
        if (lp1.f49971a.contains(q41.class)) {
            return null;
        }
        try {
            o41 o41Var = new o41();
            o41Var.f53814a = nt2Var;
            o41Var.f53815b = new WeakReference(view2);
            o41Var.f53816c = new WeakReference(view);
            o41Var.f53817d = mta.m17038f(view2);
            o41Var.f53818e = true;
            return o41Var;
        } catch (Throwable th) {
            lp1.m16420a(q41.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final p41 m19637k(nt2 nt2Var, View view, AdapterView adapterView) {
        if (lp1.f49971a.contains(q41.class)) {
            return null;
        }
        try {
            p41 p41Var = new p41();
            p41Var.f55541a = nt2Var;
            p41Var.f55542b = new WeakReference(adapterView);
            p41Var.f55543c = new WeakReference(view);
            p41Var.f55544d = adapterView.getOnItemClickListener();
            p41Var.f55545e = true;
            return p41Var;
        } catch (Throwable th) {
            lp1.m16420a(q41.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m19638l(nt2 nt2Var, View view, View view2) {
        if (lp1.f49971a.contains(q41.class)) {
            return;
        }
        try {
            nt2Var.getClass();
            String str = nt2Var.f53229a;
            gr7 gr7Var = w41.f66359f;
            Bundle bundleM12851e = gr7.m12851e(nt2Var, view, view2);
            f57241b.m19640m(bundleM12851e);
            sy2.m21768c().execute(new RunnableC0806bd(15, str, bundleM12851e));
        } catch (Throwable th) {
            lp1.m16420a(q41.class, th);
        }
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: a */
    public boolean mo14348a(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: b */
    public kj4 mo14349b() {
        throw new IllegalStateException("not implemented");
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: c */
    public boolean mo14350c(float f) {
        return false;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: d */
    public float mo14351d() {
        return 1.0f;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: e */
    public float mo14352e() {
        return 0.0f;
    }

    @Override // p000.p9b
    /* JADX INFO: renamed from: f */
    public ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        int i;
        int i2;
        p9b co2Var;
        int i3 = 6;
        int i4 = 1;
        int i5 = 2;
        int i6 = 0;
        ad0 ad0Var = null;
        switch (this.f57246a) {
            case 6:
                if (str.isEmpty()) {
                    C3386nv.m17626m("Found empty contents");
                } else if (barcodeFormat == BarcodeFormat.DATA_MATRIX) {
                    SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
                    SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) enumMap.get(EncodeHintType.DATA_MATRIX_SHAPE);
                    if (symbolShapeHint2 != null) {
                        symbolShapeHint = symbolShapeHint2;
                    }
                    if (enumMap.get(EncodeHintType.MIN_SIZE) == null && enumMap.get(EncodeHintType.MAX_SIZE) == null) {
                        xr2[] xr2VarArr = {new n58(4), new gna(), new du9(i6), new du9(i4), new j13(), new wkd()};
                        as2 as2Var = new as2(str);
                        as2Var.f7418b = symbolShapeHint;
                        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
                            as2Var.m3019d((char) 236);
                            as2Var.f7423g = 2;
                            as2Var.f7420d += 7;
                        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                            as2Var.m3019d((char) 237);
                            as2Var.f7423g = 2;
                            as2Var.f7420d += 7;
                        }
                        int i7 = 0;
                        while (as2Var.m3017b()) {
                            xr2VarArr[i7].mo10679d(as2Var);
                            int i8 = as2Var.f7421e;
                            if (i8 >= 0) {
                                as2Var.f7421e = -1;
                                i7 = i8;
                            }
                        }
                        StringBuilder sb = as2Var.f7419c;
                        int length = sb.length();
                        as2Var.m3018c(sb.length());
                        int i9 = as2Var.f7422f.f34352b;
                        if (length < i9 && i7 != 0 && i7 != 5 && i7 != 4) {
                            as2Var.m3019d((char) 254);
                        }
                        if (sb.length() < i9) {
                            sb.append((char) 129);
                        }
                        while (sb.length() < i9) {
                            int length2 = ((sb.length() + 1) * 149) % 253;
                            int i10 = length2 + 130;
                            if (i10 > 254) {
                                i10 = length2 - 124;
                            }
                            sb.append((char) i10);
                        }
                        String string = sb.toString();
                        cp9 cp9VarM9835e = cp9.m9835e(string.length(), symbolShapeHint);
                        int i11 = cp9VarM9835e.f34355e;
                        int i12 = cp9VarM9835e.f34354d;
                        int[] iArr = gt2.f41284a;
                        int length3 = string.length();
                        int i13 = cp9VarM9835e.f34352b;
                        int i14 = cp9VarM9835e.f34353c;
                        if (length3 == i13) {
                            StringBuilder sb2 = new StringBuilder(i13 + i14);
                            sb2.append(string);
                            int iMo9838c = cp9VarM9835e.mo9838c();
                            if (iMo9838c == 1) {
                                sb2.append(gt2.m12860a(i14, string));
                            } else {
                                sb2.setLength(sb2.capacity());
                                int[] iArr2 = new int[iMo9838c];
                                int[] iArr3 = new int[iMo9838c];
                                int[] iArr4 = new int[iMo9838c];
                                int i15 = 0;
                                while (i15 < iMo9838c) {
                                    int i16 = i15 + 1;
                                    iArr2[i15] = cp9VarM9835e.mo9836a(i16);
                                    iArr3[i15] = cp9VarM9835e.f34358h;
                                    iArr4[i15] = 0;
                                    if (i15 > 0) {
                                        iArr4[i15] = iArr4[i15 - 1] + iArr2[i15];
                                    }
                                    i15 = i16;
                                }
                                for (int i17 = 0; i17 < iMo9838c; i17++) {
                                    StringBuilder sb3 = new StringBuilder(iArr2[i17]);
                                    for (int i18 = i17; i18 < i13; i18 += iMo9838c) {
                                        sb3.append(string.charAt(i18));
                                    }
                                    String strM12860a = gt2.m12860a(iArr3[i17], sb3.toString());
                                    int i19 = i17;
                                    int i20 = 0;
                                    while (i19 < iArr3[i17] * iMo9838c) {
                                        sb2.setCharAt(i13 + i19, strM12860a.charAt(i20));
                                        i19 += iMo9838c;
                                        i20++;
                                    }
                                }
                            }
                            String string2 = sb2.toString();
                            int iM9837b = cp9VarM9835e.m9837b() * i12;
                            int iM9839d = cp9VarM9835e.m9839d() * i11;
                            xh0 xh0Var = new xh0(string2, iM9837b, iM9839d);
                            int i21 = xh0Var.f68193b;
                            byte[] bArr = (byte[]) xh0Var.f68195d;
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 4;
                            while (true) {
                                if (i24 == iM9839d && i22 == 0) {
                                    int i25 = iM9839d - 1;
                                    xh0Var.m24515a(i25, i6, i23, i4);
                                    xh0Var.m24515a(i25, i4, i23, 2);
                                    xh0Var.m24515a(i25, 2, i23, 3);
                                    xh0Var.m24515a(i6, iM9837b - 2, i23, 4);
                                    int i26 = iM9837b - 1;
                                    xh0Var.m24515a(i6, i26, i23, 5);
                                    xh0Var.m24515a(1, i26, i23, 6);
                                    xh0Var.m24515a(2, i26, i23, 7);
                                    xh0Var.m24515a(3, i26, i23, 8);
                                    i23++;
                                }
                                int i27 = iM9839d - 2;
                                if (i24 == i27 && i22 == 0 && iM9837b % 4 != 0) {
                                    xh0Var.m24515a(iM9839d - 3, 0, i23, 1);
                                    xh0Var.m24515a(i27, 0, i23, 2);
                                    xh0Var.m24515a(iM9839d - 1, 0, i23, 3);
                                    xh0Var.m24515a(0, iM9837b - 4, i23, 4);
                                    xh0Var.m24515a(0, iM9837b - 3, i23, 5);
                                    xh0Var.m24515a(0, iM9837b - 2, i23, 6);
                                    int i28 = iM9837b - 1;
                                    xh0Var.m24515a(0, i28, i23, 7);
                                    xh0Var.m24515a(1, i28, i23, 8);
                                    i23++;
                                }
                                if (i24 == i27 && i22 == 0 && iM9837b % 8 == 4) {
                                    xh0Var.m24515a(iM9839d - 3, 0, i23, 1);
                                    xh0Var.m24515a(i27, 0, i23, 2);
                                    xh0Var.m24515a(iM9839d - 1, 0, i23, 3);
                                    xh0Var.m24515a(0, iM9837b - 2, i23, 4);
                                    int i29 = iM9837b - 1;
                                    xh0Var.m24515a(0, i29, i23, 5);
                                    xh0Var.m24515a(1, i29, i23, 6);
                                    xh0Var.m24515a(2, i29, i23, 7);
                                    xh0Var.m24515a(3, i29, i23, 8);
                                    i23++;
                                }
                                if (i24 == iM9839d + 4 && i22 == 2 && iM9837b % 8 == 0) {
                                    int i30 = iM9839d - 1;
                                    xh0Var.m24515a(i30, 0, i23, 1);
                                    int i31 = iM9837b - 1;
                                    xh0Var.m24515a(i30, i31, i23, 2);
                                    int i32 = iM9837b - 3;
                                    xh0Var.m24515a(0, i32, i23, 3);
                                    int i33 = iM9837b - 2;
                                    xh0Var.m24515a(0, i33, i23, 4);
                                    xh0Var.m24515a(0, i31, i23, 5);
                                    xh0Var.m24515a(1, i32, i23, 6);
                                    xh0Var.m24515a(1, i33, i23, 7);
                                    xh0Var.m24515a(1, i31, i23, 8);
                                    i23++;
                                }
                                while (true) {
                                    if (i24 < iM9839d && i22 >= 0 && bArr[(i24 * i21) + i22] < 0) {
                                        xh0Var.m24516b(i24, i22, i23);
                                        i23++;
                                    }
                                    int i34 = i24 - 2;
                                    int i35 = i22 + 2;
                                    if (i34 >= 0 && i35 < iM9837b) {
                                        i24 = i34;
                                        i22 = i35;
                                    }
                                }
                                int i36 = i24 - 1;
                                int i37 = i22 + 5;
                                while (true) {
                                    if (i36 >= 0 && i37 < iM9837b && bArr[(i36 * i21) + i37] < 0) {
                                        xh0Var.m24516b(i36, i37, i23);
                                        i23++;
                                    }
                                    int i38 = i36 + 2;
                                    int i39 = i37 - 2;
                                    if (i38 < iM9839d && i39 >= 0) {
                                        i36 = i38;
                                        i37 = i39;
                                    }
                                }
                                i24 = i36 + 5;
                                i22 = i37 - 1;
                                if (i24 < iM9839d || i22 < iM9837b) {
                                    i4 = 1;
                                    i21 = i21;
                                    i6 = 0;
                                    cp9VarM9835e = cp9VarM9835e;
                                } else {
                                    int i40 = iM9837b - 1;
                                    boolean z = true;
                                    int i41 = iM9839d - 1;
                                    if (bArr[(i41 * i21) + i40] < 0) {
                                        bArr[(i41 * i21) + i40] = 1;
                                        bArr[(i27 * i21) + (iM9837b - 2)] = 1;
                                    }
                                    int iM9837b2 = cp9VarM9835e.m9837b() * i12;
                                    int iM9839d2 = cp9VarM9835e.m9839d() * i11;
                                    doa doaVar = new doa((cp9VarM9835e.m9837b() * i12) + (cp9VarM9835e.m9837b() << 1), (cp9VarM9835e.m9839d() * i11) + (cp9VarM9835e.m9839d() << 1));
                                    int i42 = 0;
                                    int i43 = 0;
                                    while (i43 < iM9839d2) {
                                        int i44 = i43 % i11;
                                        if (i44 == 0) {
                                            int i45 = 0;
                                            int i46 = 0;
                                            while (i45 < (cp9VarM9835e.m9837b() * i12) + (cp9VarM9835e.m9837b() << 1)) {
                                                doaVar.m10560i(i46, i42, i45 % 2 == 0 ? z : false);
                                                i46++;
                                                i45++;
                                                z = true;
                                            }
                                            i42++;
                                        }
                                        int i47 = 0;
                                        for (int i48 = 0; i48 < iM9837b2; i48++) {
                                            int i49 = i48 % i12;
                                            if (i49 == 0) {
                                                doaVar.m10560i(i47, i42, true);
                                                i47++;
                                            }
                                            doaVar.m10560i(i47, i42, bArr[(i43 * i21) + i48] == 1);
                                            int i50 = i47 + 1;
                                            if (i49 == i12 - 1) {
                                                doaVar.m10560i(i50, i42, i43 % 2 == 0);
                                                i47 += 2;
                                            } else {
                                                i47 = i50;
                                            }
                                        }
                                        int i51 = i42 + 1;
                                        if (i44 == i11 - 1) {
                                            int i52 = 0;
                                            for (int i53 = 0; i53 < (cp9VarM9835e.m9837b() * i12) + (cp9VarM9835e.m9837b() << 1); i53++) {
                                                doaVar.m10560i(i52, i51, true);
                                                i52++;
                                            }
                                            i42 += 2;
                                        } else {
                                            i42 = i51;
                                        }
                                        i43++;
                                        z = true;
                                    }
                                    int i54 = doaVar.f35972b;
                                    int i55 = doaVar.f35973c;
                                    int iMax = Math.max(200, i54);
                                    int iMax2 = Math.max(200, i55);
                                    int iMin = Math.min(iMax / i54, iMax2 / i55);
                                    int i56 = (iMax - (i54 * iMin)) / 2;
                                    int i57 = (iMax2 - (i55 * iMin)) / 2;
                                    if (200 < i55 || 200 < i54) {
                                        ad0Var = new ad0(i54, i55);
                                        i = 0;
                                        i2 = 0;
                                    } else {
                                        ad0Var = new ad0(200, 200);
                                        i = i56;
                                        i2 = i57;
                                    }
                                    int[] iArr5 = ad0Var.f506d;
                                    int length4 = iArr5.length;
                                    for (int i58 = 0; i58 < length4; i58++) {
                                        iArr5[i58] = 0;
                                    }
                                    int i59 = i2;
                                    int i60 = 0;
                                    while (i60 < i55) {
                                        int i61 = i;
                                        int i62 = 0;
                                        while (i62 < i54) {
                                            if (doaVar.m10557f(i62, i60) == 1) {
                                                ad0Var.m274c(i61, i59, iMin, iMin);
                                            }
                                            i62++;
                                            i61 += iMin;
                                        }
                                        i60++;
                                        i59 += iMin;
                                    }
                                }
                            }
                        } else {
                            C3386nv.m17626m("The number of codewords does not match the selected symbol");
                        }
                    } else {
                        ho2.m13383c();
                    }
                } else {
                    C3386nv.m17626m("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
                }
                return ad0Var;
            default:
                switch (t46.f61857a[barcodeFormat.ordinal()]) {
                    case 1:
                        co2Var = new co2(i4);
                        break;
                    case 2:
                        co2Var = new co2(i5);
                        break;
                    case 3:
                        co2Var = new co2(i6);
                        break;
                    case 4:
                        co2Var = new jh9(2);
                        break;
                    case 5:
                        co2Var = new nid();
                        break;
                    case 6:
                        co2Var = new jy3(i4);
                        break;
                    case 7:
                        co2Var = new jy3(i5);
                        break;
                    case 8:
                        co2Var = new C1193a();
                        break;
                    case 9:
                        co2Var = new jy3(i6);
                        break;
                    case 10:
                        co2Var = new n58(10);
                        break;
                    case 11:
                        co2Var = new k41();
                        break;
                    case 12:
                        co2Var = new q41(i3);
                        break;
                    case 13:
                        co2Var = new mkd();
                        break;
                    default:
                        C3386nv.m17626m("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
                        return null;
                }
                return co2Var.mo4915f(str, barcodeFormat, enumMap);
        }
    }

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        return Integer.valueOf(Math.round(og4.m17980d(abstractC0875a) * f));
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        zzuz zzuzVar = (zzuz) obj;
        is9 is9Var = new is9(zzuzVar.f12143a, zzuzVar.f12144b, zzuzVar.f12145c, zzuzVar.f12146d);
        AbstractC0981l.m5477a(zzuzVar.f12147e, new bw8());
        return is9Var;
    }

    /* JADX INFO: renamed from: i */
    public void m19639i(zr2 zr2Var) {
        zr2Var.mo12901e(t8d.class, jlc.f45735a);
        zr2Var.mo12901e(iid.class, e1d.f36590a);
        zr2Var.mo12901e(v8d.class, nlc.f52938a);
        zr2Var.mo12901e(i9d.class, ulc.f64053a);
        zr2Var.mo12901e(c9d.class, rlc.f59516a);
        zr2Var.mo12901e(f9d.class, zlc.f71719a);
        zr2Var.mo12901e(r4d.class, ufc.f63857a);
        zr2Var.mo12901e(p4d.class, ofc.f54289a);
        zr2Var.mo12901e(i7d.class, ojc.f54475a);
        zr2Var.mo12901e(ahd.class, nyc.f53423a);
        zr2Var.mo12901e(m4d.class, kfc.f47153a);
        zr2Var.mo12901e(j4d.class, ffc.f39029a);
        zr2Var.mo12901e(ocd.class, zrc.f72017a);
        zr2Var.mo12901e(bkd.class, dic.f35698a);
        zr2Var.mo12901e(v6d.class, ric.f59379a);
        zr2Var.mo12901e(e6d.class, zhc.f71585a);
        zr2Var.mo12901e(qcd.class, csc.f34500a);
        zr2Var.mo12901e(mgd.class, byc.f9184a);
        zr2Var.mo12901e(vgd.class, eyc.f38090a);
        zr2Var.mo12901e(hgd.class, xxc.f68934a);
        zr2Var.mo12901e(s9d.class, vmc.f65624a);
        zr2Var.mo12901e(zjd.class, zbc.f71339a);
        zr2Var.mo12901e(u9d.class, bnc.f8755a);
        zr2Var.mo12901e(ldd.class, ftc.f39635a);
        zr2Var.mo12901e(qdd.class, utc.f64351a);
        zr2Var.mo12901e(odd.class, otc.f54985a);
        zr2Var.mo12901e(a6c.class, ktc.f48422a);
        zr2Var.mo12901e(ped.class, bvc.f9078a);
        zr2Var.mo12901e(sed.class, gvc.f41410a);
        zr2Var.mo12901e(wed.class, nvc.f53304a);
        zr2Var.mo12901e(ued.class, kvc.f48487a);
        zr2Var.mo12901e(q9d.class, rmc.f59557a);
        zr2Var.mo12901e(yed.class, rvc.f59894a);
        zr2Var.mo12901e(zed.class, zvc.f72290a);
        zr2Var.mo12901e(bfd.class, cwc.f34668a);
        zr2Var.mo12901e(dfd.class, hwc.f43083a);
        zr2Var.mo12901e(lfd.class, wwc.f67454a);
        zr2Var.mo12901e(kfd.class, axc.f7655a);
        zr2Var.mo12901e(med.class, juc.f46171a);
        zr2Var.mo12901e(t7d.class, kkc.f47463a);
        zr2Var.mo12901e(ied.class, ruc.f59838a);
        zr2Var.mo12901e(eed.class, muc.f51869a);
        zr2Var.mo12901e(led.class, vuc.f65961a);
        zr2Var.mo12901e(ygd.class, jyc.f46412a);
        zr2Var.mo12901e(xid.class, z1d.f70765a);
        zr2Var.mo12901e(c3d.class, wcc.f66629a);
        zr2Var.mo12901e(w2d.class, ncc.f52612a);
        zr2Var.mo12901e(t2d.class, icc.f43948a);
        zr2Var.mo12901e(y2d.class, rcc.f59097a);
        zr2Var.mo12901e(h3d.class, hdc.f42229a);
        zr2Var.mo12901e(e3d.class, adc.f529a);
        zr2Var.mo12901e(j3d.class, mdc.f51190a);
        zr2Var.mo12901e(y99.class, rdc.f59142a);
        zr2Var.mo12901e(z99.class, wdc.f66673a);
        zr2Var.mo12901e(u3d.class, lec.f49575a);
        zr2Var.mo12901e(x3d.class, pec.f56018a);
        zr2Var.mo12901e(k3c.class, hbc.f42145a);
        zr2Var.mo12901e(q3c.class, qbc.f57549a);
        zr2Var.mo12901e(n3c.class, nbc.f52580a);
        zr2Var.mo12901e(o7d.class, bkc.f8648a);
        zr2Var.mo12901e(u4d.class, yfc.f69801a);
        zr2Var.mo12901e(kxb.class, y3c.f69260a);
        zr2Var.mo12901e(gxb.class, k4c.f46715a);
        zr2Var.mo12901e(y5d.class, rhc.f59327a);
        zr2Var.mo12901e(txb.class, p4c.f55584a);
        zr2Var.mo12901e(oxb.class, t4c.f61867a);
        zr2Var.mo12901e(nzb.class, d7c.f35097a);
        zr2Var.mo12901e(jzb.class, i7c.f43659a);
        zr2Var.mo12901e(ayb.class, a5c.f274a);
        zr2Var.mo12901e(wxb.class, g5c.f40256a);
        zr2Var.mo12901e(q0c.class, a8c.f366a);
        zr2Var.mo12901e(g0c.class, e8c.f36851a);
        zr2Var.mo12901e(i1c.class, r8c.f58925a);
        zr2Var.mo12901e(d1c.class, x8c.f67941a);
        zr2Var.mo12901e(h3c.class, xac.f68012a);
        zr2Var.mo12901e(b3c.class, cbc.f9859a);
        zr2Var.mo12901e(o1c.class, d9c.f35223a);
        zr2Var.mo12901e(l1c.class, l9c.f49351a);
        zr2Var.mo12901e(v1c.class, p9c.f55813a);
        zr2Var.mo12901e(r1c.class, t9c.f62025a);
        zr2Var.mo12901e(rjd.class, xyc.f68977a);
        zr2Var.mo12901e(djd.class, egc.f37226a);
        zr2Var.mo12901e(mjd.class, omc.f54595a);
        zr2Var.mo12901e(jjd.class, lmc.f49847a);
        zr2Var.mo12901e(fjd.class, iic.f44160a);
        zr2Var.mo12901e(pjd.class, uyc.f64548a);
        zr2Var.mo12901e(ojd.class, ryc.f60055a);
        zr2Var.mo12901e(sjd.class, azc.f7702a);
        zr2Var.mo12901e(hjd.class, sjc.f60944a);
        zr2Var.mo12901e(yjd.class, f2d.f38318a);
        zr2Var.mo12901e(vjd.class, i2d.f43393a);
        zr2Var.mo12901e(ujd.class, c2d.f9381a);
        zr2Var.mo12901e(fhd.class, hzc.f43264a);
        zr2Var.mo12901e(kmd.class, xjc.f68307a);
        zr2Var.mo12901e(w7d.class, pkc.f56388a);
        zr2Var.mo12901e(s2d.class, ecc.f37026a);
        zr2Var.mo12901e(y6d.class, bjc.f8621a);
        zr2Var.mo12901e(r7d.class, hkc.f42554a);
        zr2Var.mo12901e(b6d.class, vhc.f65408a);
        zr2Var.mo12901e(b5d.class, pgc.f56192a);
        zr2Var.mo12901e(f5d.class, rgc.f59245a);
        zr2Var.mo12901e(x4d.class, kgc.f47259a);
        zr2Var.mo12901e(h5d.class, vgc.f65362a);
        zr2Var.mo12901e(n9d.class, hmc.f42641a);
        zr2Var.mo12901e(k9d.class, dmc.f35881a);
        zr2Var.mo12901e(cxb.class, t3c.f61831a);
        zr2Var.mo12901e(qid.class, p1d.f55465a);
        zr2Var.mo12901e(vid.class, v1d.f64715a);
        zr2Var.mo12901e(tid.class, s1d.f60165a);
        zr2Var.mo12901e(o2d.class, vbc.f65174a);
        zr2Var.mo12901e(h4d.class, bfc.f8483a);
        zr2Var.mo12901e(d4d.class, yec.f69756a);
        zr2Var.mo12901e(b4d.class, tec.f62207a);
        zr2Var.mo12901e(hcd.class, frc.f39539a);
        zr2Var.mo12901e(lcd.class, orc.f54804a);
        zr2Var.mo12901e(jcd.class, jrc.f46051a);
        zr2Var.mo12901e(ezb.class, v6c.f64952a);
        zr2Var.mo12901e(bzb.class, z6c.f70996a);
        zr2Var.mo12901e(scd.class, fsc.f39606a);
        zr2Var.mo12901e(bdd.class, rsc.f59771a);
        zr2Var.mo12901e(vcd.class, jsc.f46089a);
        zr2Var.mo12901e(ycd.class, nsc.f53224a);
        zr2Var.mo12901e(tzb.class, m7c.f50740a);
        zr2Var.mo12901e(qzb.class, o7c.f53961a);
        zr2Var.mo12901e(qhd.class, i0d.f43305a);
        zr2Var.mo12901e(nhd.class, e0d.f36546a);
        zr2Var.mo12901e(lid.class, j1d.f44916a);
        zr2Var.mo12901e(pid.class, n1d.f52203a);
        zr2Var.mo12901e(tdd.class, wtc.f67289a);
        zr2Var.mo12901e(ced.class, guc.f41357a);
        zr2Var.mo12901e(wdd.class, ztc.f72163a);
        zr2Var.mo12901e(zdd.class, cuc.f34562a);
        zr2Var.mo12901e(d7d.class, ijc.f44206a);
        zr2Var.mo12901e(y0c.class, i8c.f43710a);
        zr2Var.mo12901e(u0c.class, m8c.f50771a);
        zr2Var.mo12901e(a7d.class, ejc.f37371a);
        zr2Var.mo12901e(h6d.class, mic.f51375a);
        zr2Var.mo12901e(ddd.class, vsc.f65869a);
        zr2Var.mo12901e(jdd.class, ctc.f34531a);
        zr2Var.mo12901e(gdd.class, zsc.f72114a);
        zr2Var.mo12901e(b0c.class, t7c.f61963a);
        zr2Var.mo12901e(xzb.class, x7c.f67909a);
        zr2Var.mo12901e(ebd.class, upc.f64202a);
        zr2Var.mo12901e(gbd.class, wpc.f67162a);
        zr2Var.mo12901e(ibd.class, aqc.f7377a);
        zr2Var.mo12901e(pyb.class, x5c.f67804a);
        zr2Var.mo12901e(myb.class, j6c.f45125a);
        zr2Var.mo12901e(yad.class, jpc.f45986a);
        zr2Var.mo12901e(abd.class, lpc.f49994a);
        zr2Var.mo12901e(ve2.class, rpc.f59701a);
        zr2Var.mo12901e(iyb.class, n5c.f52383a);
        zr2Var.mo12901e(fyb.class, t5c.f61895a);
        zr2Var.mo12901e(kbd.class, dqc.f36060a);
        zr2Var.mo12901e(mbd.class, iqc.f44447a);
        zr2Var.mo12901e(tbd.class, kqc.f48345a);
        zr2Var.mo12901e(wbd.class, oqc.f54762a);
        zr2Var.mo12901e(wyb.class, n6c.f52421a);
        zr2Var.mo12901e(syb.class, p6c.f55669a);
        zr2Var.mo12901e(jhd.class, nzc.f53482a);
        zr2Var.mo12901e(hhd.class, rzc.f60098a);
        zr2Var.mo12901e(z7d.class, ukc.f64036a);
        zr2Var.mo12901e(e8d.class, dlc.f35800a);
        zr2Var.mo12901e(c8d.class, zkc.f71691a);
        zr2Var.mo12901e(g8d.class, flc.f39270a);
        zr2Var.mo12901e(ofd.class, exc.f38058a);
        zr2Var.mo12901e(sfd.class, ixc.f44750a);
        zr2Var.mo12901e(j2c.class, fac.f38747a);
        zr2Var.mo12901e(g2c.class, kac.f46953a);
        zr2Var.mo12901e(thd.class, n0d.f52151a);
        zr2Var.mo12901e(ffd.class, nwc.f53344a);
        zr2Var.mo12901e(hfd.class, rwc.f59985a);
        zr2Var.mo12901e(c2c.class, y9c.f69527a);
        zr2Var.mo12901e(z1c.class, bac.f8259a);
        zr2Var.mo12901e(khd.class, tzc.f63154a);
        zr2Var.mo12901e(vad.class, unc.f64119a);
        zr2Var.mo12901e(tad.class, epc.f37697a);
        zr2Var.mo12901e(kad.class, soc.f61137a);
        zr2Var.mo12901e(had.class, moc.f51672a);
        zr2Var.mo12901e(nad.class, woc.f67145a);
        zr2Var.mo12901e(qad.class, bpc.f8844a);
        zr2Var.mo12901e(fad.class, ioc.f44385a);
        zr2Var.mo12901e(x9d.class, nnc.f53020a);
        zr2Var.mo12901e(C0683q.class, coc.f10376a);
        zr2Var.mo12901e(z9d.class, znc.f71808a);
        zr2Var.mo12901e(bcd.class, xqc.f68556a);
        zr2Var.mo12901e(r5d.class, ihc.f44127a);
        zr2Var.mo12901e(ybd.class, rqc.f59731a);
        zr2Var.mo12901e(ecd.class, brc.f8906a);
        zr2Var.mo12901e(o5d.class, ehc.f37271a);
        zr2Var.mo12901e(t5d.class, nhc.f52745a);
        zr2Var.mo12901e(chd.class, fzc.f39977a);
        zr2Var.mo12901e(vfd.class, lxc.f50283a);
        zr2Var.mo12901e(cid.class, a1d.f80a);
        zr2Var.mo12901e(zfd.class, sxc.f61572a);
        zr2Var.mo12901e(xfd.class, nxc.f53375a);
        zr2Var.mo12901e(whd.class, s0d.f60145a);
        zr2Var.mo12901e(q2c.class, nac.f52548a);
        zr2Var.mo12901e(n2c.class, sac.f60604a);
        zr2Var.mo12901e(zhd.class, v0d.f64682a);
        zr2Var.mo12901e(l5d.class, zgc.f71563a);
    }

    @Override // p000.j90
    public boolean isEmpty() {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m19640m(Bundle bundle) {
        Locale locale;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = sy2.m21766a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
