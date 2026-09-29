package p000;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.spatial.C0429a;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cgc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f10035a = new C0282a(834773669, false, new wd1(24));

    /* JADX INFO: renamed from: b */
    public static final C0282a f10036b = new C0282a(1673559837, false, new xd1(18));

    /* JADX INFO: renamed from: c */
    public static final C0282a f10037c = new C0282a(-136297599, false, new wd1(28));

    /* JADX INFO: renamed from: d */
    public static final C0282a f10038d = new C0282a(-1778455226, false, new xd1(22));

    /* JADX INFO: renamed from: e */
    public static final C0282a f10039e = new C0282a(2113820017, false, new xd1(23));

    /* JADX INFO: renamed from: f */
    public static final C0282a f10040f = new C0282a(-1053165838, false, new yd1(0));

    /* JADX INFO: renamed from: g */
    public static final C0282a f10041g = new C0282a(-257941964, false, new yd1(1));

    /* JADX INFO: renamed from: h */
    public static final C0282a f10042h = new C0282a(1300917405, false, new yd1(2));

    /* JADX INFO: renamed from: i */
    public static final C0282a f10043i = new C0282a(-1145012038, false, new yd1(3));

    /* JADX INFO: renamed from: j */
    public static final C0282a f10044j = new C0282a(-116183432, false, new yd1(4));

    /* JADX INFO: renamed from: k */
    public static final C0282a f10045k = new C0282a(371863674, false, new wd1(29));

    /* JADX INFO: renamed from: l */
    public static final C0282a f10046l = new C0282a(301146880, false, new xd1(24));

    /* JADX INFO: renamed from: m */
    public static final C0282a f10047m = new C0282a(-1227525204, false, new yd1(5));

    /* JADX INFO: renamed from: n */
    public static final C0282a f10048n = new C0282a(-402210125, false, new xd1(25));

    /* JADX INFO: renamed from: o */
    public static final C0282a f10049o = new C0282a(884272180, false, new xd1(26));

    /* JADX INFO: renamed from: p */
    public static final C0282a f10050p = new C0282a(-350029564, false, new yd1(6));

    /* JADX INFO: renamed from: q */
    public static final C0282a f10051q = new C0282a(-61210174, false, new yd1(7));

    /* JADX INFO: renamed from: r */
    public static final C0282a f10052r = new C0282a(1078385437, false, new xd1(27));

    /* JADX INFO: renamed from: s */
    public static final C0282a f10053s = new C0282a(-2108823212, false, new yd1(8));

    /* JADX INFO: renamed from: t */
    public static final C0282a f10054t = new C0282a(-1820003822, false, new wd1(25));

    /* JADX INFO: renamed from: u */
    public static final C0282a f10055u = new C0282a(-680408211, false, new xd1(19));

    /* JADX INFO: renamed from: v */
    public static final C0282a f10056v = new C0282a(-391069040, false, new wd1(26));

    /* JADX INFO: renamed from: w */
    public static final C0282a f10057w = new C0282a(1007884562, false, new wd1(27));

    /* JADX INFO: renamed from: x */
    public static final C0282a f10058x = new C0282a(-1015743017, false, new xd1(20));

    /* JADX INFO: renamed from: y */
    public static final C0282a f10059y = new C0282a(1831217432, false, new xd1(21));

    /* JADX WARN: Code duplicated, block: B:116:0x029f  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:186:0x03be  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d2 A[LOOP:5: B:190:0x03d0->B:191:0x03d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x040a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0411  */
    /* JADX WARN: Code duplicated, block: B:204:0x041a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0199 A[EDGE_INSN: B:207:0x0199->B:70:0x0199 BREAK  A[LOOP:0: B:9:0x0041->B:68:0x0178], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0176 A[DONT_INVERT, PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28 r29 r30
      0x0176: PHI (r20v7 mh) = (r20v6 mh), (r20v8 mh) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r22v7 androidx.compose.ui.state.ToggleableState) = (r22v6 androidx.compose.ui.state.ToggleableState), (r22v8 androidx.compose.ui.state.ToggleableState) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r23v5 on) = (r23v4 on), (r23v6 on) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r24v5 ci) = (r24v4 ci), (r24v6 ci) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r25v6 ol1) = (r25v5 ol1), (r25v7 ol1) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r26v6 java.lang.Boolean) = (r26v5 java.lang.Boolean), (r26v7 java.lang.Boolean) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r27v8 uh8) = (r27v7 uh8), (r27v9 uh8) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r29v6 boolean) = (r29v5 boolean), (r29v7 boolean) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r30v6 java.lang.Integer) = (r30v5 java.lang.Integer), (r30v7 java.lang.Integer) binds: [B:10:0x0050, B:66:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0178 A[LOOP:0: B:9:0x0041->B:68:0x0178, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m4646a(ViewStructure viewStructure, C0357g c0357g, AutofillId autofillId, String str, C0429a c0429a) {
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        C3335mh c3335mh;
        C3419on c3419on;
        C0848ci c0848ci;
        ToggleableState toggleableState;
        uh8 uh8Var;
        boolean z;
        ol1 ol1Var;
        Boolean bool;
        boolean z2;
        Integer num;
        int i;
        List list;
        Integer numValueOf;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        String strM24763e0;
        int size;
        String strM22992o;
        int i6;
        String[] strArrM23502m;
        String[] strArrM23502m2;
        n66 n66Var;
        int i7;
        int i8;
        int i9;
        n66 n66Var2;
        C3335mh c3335mh2;
        ToggleableState toggleableState2;
        C3419on c3419on2;
        C0848ci c0848ci2;
        uh8 uh8Var2;
        C0427g c0427g = AbstractC0424d.f4994a;
        C0427g c0427g2 = AbstractC0421a.f4945a;
        kv8 kv8VarM1613z = c0357g.m1613z();
        int i10 = 1;
        if (kv8VarM1613z == null || (n66Var2 = kv8VarM1613z.f48471a) == null) {
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            c3335mh = null;
            c3419on = null;
            c0848ci = null;
            toggleableState = null;
            uh8Var = null;
            z = false;
            ol1Var = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            j = 128;
            Object[] objArr = n66Var2.f52400b;
            Object[] objArr2 = n66Var2.f52401c;
            long[] jArr = n66Var2.f52399a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i11 = 0;
                c3335mh2 = null;
                z = false;
                toggleableState2 = null;
                c3419on2 = null;
                c0848ci2 = null;
                ol1Var = null;
                bool = null;
                uh8Var2 = null;
                z2 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i11];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j4 & 255) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                Object obj2 = objArr2[i14];
                                C0427g c0427g3 = (C0427g) obj;
                                if (fa4.m11650l(c0427g3, AbstractC0424d.f5012s)) {
                                    obj2.getClass();
                                    c3335mh2 = (C3335mh) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f4994a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) u91.m22591I0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f5011r)) {
                                    obj2.getClass();
                                    ol1Var = (ol1) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f5013t)) {
                                    obj2.getClass();
                                    c0848ci2 = (C0848ci) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f4983G)) {
                                    obj2.getClass();
                                    c3419on2 = (C3419on) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f5005l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f4992P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f4988L)) {
                                    z2 = true;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f5008o)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f5019z)) {
                                    obj2.getClass();
                                    uh8Var2 = (uh8) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f4986J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0424d.f4987K)) {
                                    obj2.getClass();
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (fa4.m11650l(c0427g3, AbstractC0421a.f4946b)) {
                                    viewStructure.setClickable(true);
                                } else if (fa4.m11650l(c0427g3, AbstractC0421a.f4947c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (fa4.m11650l(c0427g3, AbstractC0421a.f4967w)) {
                                    viewStructure.setFocusable(true);
                                } else if (fa4.m11650l(c0427g3, AbstractC0421a.f4955k)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            } else {
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                c3335mh2 = null;
                z = false;
                toggleableState2 = null;
                c3419on2 = null;
                c0848ci2 = null;
                ol1Var = null;
                bool = null;
                uh8Var2 = null;
                z2 = false;
                num = null;
            }
            c3335mh = c3335mh2;
            toggleableState = toggleableState2;
            c3419on = c3419on2;
            c0848ci = c0848ci2;
            uh8Var = uh8Var2;
        }
        kv8 kv8VarM1613z2 = c0357g.m1613z();
        if (kv8VarM1613z2 != null && kv8VarM1613z2.f48473c && !kv8VarM1613z2.f48474d) {
            kv8VarM1613z2 = kv8VarM1613z2.m15705f();
            h66 h66Var = new h66(((x66) ((f66) c0357g.m1602o()).f38520b).f67832c);
            h66Var.m13092i(c0357g.m1602o());
            while (h66Var.m720e()) {
                C0357g c0357g2 = (C0357g) h66Var.m13095l(h66Var.f1294b - 1);
                kv8 kv8VarM1613z3 = c0357g2.m1613z();
                if (kv8VarM1613z3 != null && !kv8VarM1613z3.f48473c) {
                    kv8VarM1613z2.m15707h(kv8VarM1613z3);
                    if (!kv8VarM1613z3.f48474d) {
                        h66Var.m13092i(c0357g2.m1602o());
                    }
                }
            }
        }
        if (kv8VarM1613z2 == null || (n66Var = kv8VarM1613z2.f48471a) == null) {
            i = 1;
            list = null;
        } else {
            Object[] objArr3 = n66Var.f52400b;
            Object[] objArr4 = n66Var.f52401c;
            long[] jArr2 = n66Var.f52399a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i15 = 8;
                list = null;
                int i16 = 0;
                while (true) {
                    long j5 = jArr2[i16];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j5 & j2) < j) {
                                int i19 = (i16 << 3) + i18;
                                Object obj3 = objArr5[i19];
                                Object obj4 = objArr4[i19];
                                i9 = i10;
                                C0427g c0427g4 = (C0427g) obj3;
                                i8 = i18;
                                if (fa4.m11650l(c0427g4, AbstractC0424d.f5003j)) {
                                    viewStructure.setEnabled(false);
                                } else if (fa4.m11650l(c0427g4, AbstractC0424d.f4979C)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i8 = i18;
                                i9 = i10;
                            }
                            j5 >>= i15;
                            i18 = i8 + 1;
                            i10 = i9;
                        }
                        i = i10;
                        i7 = i15;
                        if (i17 != i7) {
                            break;
                        }
                    } else {
                        i = i10;
                        i7 = i15;
                    }
                    int i20 = i16;
                    if (i20 == length2) {
                        break;
                    }
                    i16 = i20 + 1;
                    i15 = i7;
                    objArr3 = objArr5;
                    jArr2 = jArr3;
                    i10 = i;
                }
            } else {
                i = 1;
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(c0357g.f4336b);
        if (c0357g.m1610w() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (c3335mh != null) {
            numValueOf = Integer.valueOf(c3335mh.f51317a);
        } else if (z) {
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = toggleableState != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (c3419on != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(l70.m15921L(c3419on.f54604b)));
        }
        if (c0848ci != null) {
            viewStructure.setAutofillValue(c0848ci.f10108a);
        }
        if (ol1Var != null && (strArrM23502m2 = AbstractC3695vr.m23502m(ol1Var)) != null) {
            viewStructure.setAutofillHints(strArrM23502m2);
        }
        C0357g c0357g3 = (C0357g) c0429a.f5029a.m10152b(c0357g.f4336b);
        if (c0357g3 == null || c0357g3.f4346g == -4) {
            i2 = 0;
        } else {
            C3047gq c3047gq = c0429a.f5031c;
            int iM1876e = c0429a.m1876e(c0357g3);
            long[] jArr4 = (long[]) c3047gq.f41172c;
            long j6 = jArr4[iM1876e];
            long j7 = jArr4[iM1876e + 1];
            int i21 = (int) (j6 >> 32);
            int i22 = (int) j6;
            i2 = 0;
            viewStructure.setDimens(i21, i22, 0, 0, ((int) (j7 >> 32)) - i21, ((int) j7) - i22);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (toggleableState != null) {
            viewStructure.setCheckable(i);
            viewStructure.setChecked(toggleableState == ToggleableState.On ? 1 : i2);
        } else if (bool != null && (uh8Var == null || uh8Var.f63934a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        ol1.f54526a.getClass();
        String str2 = (String) AbstractC3550rv.m20838f0(AbstractC3695vr.m23502m(nl1.f52905b));
        if (ol1Var != null && (strArrM23502m = AbstractC3695vr.m23502m(ol1Var)) != null) {
            boolean zM20823Q = AbstractC3550rv.m20823Q(strArrM23502m, str2);
            i3 = 1;
            if (zM20823Q) {
                i4 = 1;
            }
            if (z2 && i4 == 0) {
                i5 = i2;
            } else {
                i5 = i3;
            }
            if (i5 == 0 || zBooleanValue) {
                z3 = i3;
            } else {
                z3 = i2;
            }
            viewStructure.setDataIsSensitive(z3);
            viewStructure.setVisibility(((AbstractC0362l) c0357g.f4335a0.f46677e).m1692n1() ? 4 : i2);
            if (list != null) {
                size = list.size();
                strM22992o = "";
                for (i6 = i2; i6 < size; i6++) {
                    strM22992o = ux5.m22992o(ux5.m22997t(strM22992o), ((C3419on) list.get(i6)).f54604b, '\n');
                }
                viewStructure.setText(strM22992o);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((f66) c0357g.m1602o()).isEmpty() && uh8Var != null && (strM24763e0 = xwc.m24763e0(uh8Var.f63934a)) != null) {
                viewStructure.setClassName(strM24763e0);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (i5 != 0) {
                    viewStructure.setInputType(129);
                }
            }
        }
        i3 = 1;
        i4 = i2;
        if (z2) {
            i5 = i3;
        } else {
            i5 = i3;
        }
        if (i5 == 0) {
            z3 = i3;
        } else {
            z3 = i3;
        }
        viewStructure.setDataIsSensitive(z3);
        viewStructure.setVisibility(((AbstractC0362l) c0357g.f4335a0.f46677e).m1692n1() ? 4 : i2);
        if (list != null) {
            size = list.size();
            strM22992o = "";
            while (i6 < size) {
                strM22992o = ux5.m22992o(ux5.m22997t(strM22992o), ((C3419on) list.get(i6)).f54604b, '\n');
            }
            viewStructure.setText(strM22992o);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((f66) c0357g.m1602o()).isEmpty()) {
            viewStructure.setClassName(strM24763e0);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (i5 != 0) {
                viewStructure.setInputType(129);
            }
        }
    }
}
