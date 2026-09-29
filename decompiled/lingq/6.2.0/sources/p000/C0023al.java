package p000;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.C0068g;
import androidx.compose.p002ui.node.C0358h;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: al */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0023al implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f790b;

    public /* synthetic */ C0023al(int i, t66 t66Var) {
        this.f789a = i;
        this.f790b = t66Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0389  */
    /* JADX WARN: Code duplicated, block: B:268:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0319  */
    /* JADX WARN: Code duplicated, block: B:98:0x0335 A[LOOP:12: B:96:0x0331->B:98:0x0335, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r9v16 */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        char c;
        ArrayList arrayList;
        Iterator it;
        ba1 ba1Var;
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        c37 c37Var;
        ba1 ba1Var2;
        Integer num;
        Integer numValueOf;
        Integer numValueOf2;
        ArrayList arrayList2;
        char c2;
        float fAbs;
        int i6;
        int i7 = this.f789a;
        float f = 0.0f;
        Throwable th = null;
        int i8 = 0;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f790b;
        switch (i7) {
            case 0:
                t66Var.setValue((aq4) obj);
                return xfaVar;
            case 1:
                vv9 vv9Var = (vv9) obj;
                vv9Var.getClass();
                t66Var.setValue(vv9Var);
                return xfaVar;
            case 2:
                C0358h c0358h = (C0358h) obj;
                c0358h.getClass();
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    c0358h.m1614b();
                }
                return xfaVar;
            case 3:
                t66Var.setValue((aq4) obj);
                return xfaVar;
            case 4:
                ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) obj;
                themeSettingsTab.getClass();
                t66Var.setValue(themeSettingsTab);
                return xfaVar;
            case 5:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                t66Var.setValue(wfb.m23907b(aq4Var.mo1680d(0L), omd.m18152h0(aq4Var.mo1687j())));
                return xfaVar;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                t66Var.setValue(bool);
                return xfaVar;
            case 7:
                String str = (String) obj;
                str.getClass();
                t66Var.setValue(str);
                return xfaVar;
            case 8:
                t66Var.setValue((pbb) obj);
                return xfaVar;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                t66Var.setValue(str2);
                return xfaVar;
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                t66Var.setValue(str3);
                return xfaVar;
            case 11:
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                t66Var.setValue(bitmap);
                return xfaVar;
            case 12:
                Bitmap bitmap2 = (Bitmap) obj;
                bitmap2.getClass();
                t66Var.setValue(bitmap2);
                return xfaVar;
            case 13:
                aq4 aq4Var2 = (aq4) obj;
                aq4Var2.getClass();
                t66Var.setValue(aq4Var2);
                return xfaVar;
            case 14:
                rw9 rw9Var = (rw9) obj;
                rw9Var.getClass();
                t66Var.setValue(rw9Var);
                return xfaVar;
            case 15:
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19813c(((Boolean) t66Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                return xfaVar;
            case 16:
                pbb pbbVar = (pbb) obj;
                pbbVar.getClass();
                t66Var.setValue(pbbVar);
                return xfaVar;
            case 17:
                pbb pbbVar2 = (pbb) obj;
                pbbVar2.getClass();
                t66Var.setValue(pbbVar2);
                return xfaVar;
            case 18:
                String str4 = (String) obj;
                str4.getClass();
                t66Var.setValue(str4);
                return xfaVar;
            case 19:
                String str5 = (String) obj;
                str5.getClass();
                t66Var.setValue(str5);
                return xfaVar;
            case 20:
                String str6 = (String) obj;
                str6.getClass();
                t66Var.setValue(str6);
                return xfaVar;
            case 21:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                t66Var.setValue(bool2);
                return xfaVar;
            case 22:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                t66Var.setValue(bool3);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                AbstractC3387nw abstractC3387nw = (AbstractC3387nw) obj;
                abstractC3387nw.getClass();
                if (abstractC3387nw instanceof C3350mw) {
                    Bitmap bitmapCopy = mbd.m16756d(((C3350mw) abstractC3387nw).f51905b.f42663a).copy(Bitmap.Config.ARGB_8888, false);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (bitmapCopy == null || bitmapCopy.isRecycled()) {
                        C3386nv.m17626m("Bitmap is not valid");
                        return null;
                    }
                    arrayList4.add(fwc.f39822a);
                    arrayList3.add(mr9.f51771d);
                    arrayList3.add(mr9.f51772e);
                    arrayList3.add(mr9.f51773f);
                    arrayList3.add(mr9.f51774g);
                    arrayList3.add(mr9.f51775h);
                    arrayList3.add(mr9.f51776i);
                    int height = bitmapCopy.getHeight() * bitmapCopy.getWidth();
                    double dSqrt = height > 12544 ? Math.sqrt(12544.0d / ((double) height)) : -1.0d;
                    Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmapCopy : Bitmap.createScaledBitmap(bitmapCopy, (int) Math.ceil(((double) bitmapCopy.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmapCopy.getHeight()) * dSqrt), false);
                    int width = bitmapCreateScaledBitmap.getWidth();
                    int height2 = bitmapCreateScaledBitmap.getHeight();
                    int[] iArr3 = new int[width * height2];
                    bitmapCreateScaledBitmap.getPixels(iArr3, 0, width, 0, 0, width, height2);
                    b37[] b37VarArr = arrayList4.isEmpty() ? null : (b37[]) arrayList4.toArray(new b37[arrayList4.size()]);
                    ca1 ca1Var = new ca1();
                    ca1Var.f9785e = new float[3];
                    ca1Var.f9784d = b37VarArr;
                    int[] iArr4 = new int[32768];
                    ca1Var.f9782b = iArr4;
                    int i9 = 0;
                    while (true) {
                        float f2 = f;
                        if (i9 < iArr3.length) {
                            int i10 = iArr3[i9];
                            int iM4443k = ca1.m4443k(Color.blue(i10), 8, 5) | (ca1.m4443k(Color.green(i10), 8, 5) << 5) | (ca1.m4443k(Color.red(i10), 8, 5) << 10);
                            iArr3[i9] = iM4443k;
                            iArr4[iM4443k] = iArr4[iM4443k] + 1;
                            i9++;
                            f = f2;
                            th = th;
                        } else {
                            Throwable th2 = th;
                            int i11 = 1;
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < 32768) {
                                if (iArr4[i12] > 0) {
                                    int iRgb = Color.rgb(ca1.m4443k((i12 >> 10) & 31, 5, 8), ca1.m4443k((i12 >> 5) & 31, 5, 8), ca1.m4443k(i12 & 31, 5, 8));
                                    float[] fArr = (float[]) ca1Var.f9785e;
                                    ThreadLocal threadLocal = ya1.f69540a;
                                    i6 = i8;
                                    ya1.m25008a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                                    if (ca1Var.m4456o(fArr)) {
                                        iArr4[i12] = i6;
                                    }
                                } else {
                                    i6 = i8;
                                }
                                if (iArr4[i12] > 0) {
                                    i13++;
                                }
                                i12++;
                                i8 = i6;
                            }
                            int i14 = i8;
                            int[] iArr5 = new int[i13];
                            ca1Var.f9781a = iArr5;
                            int i15 = i8;
                            while (i8 < 32768) {
                                if (iArr4[i8] > 0) {
                                    iArr5[i15] = i8;
                                    i15++;
                                }
                                i8++;
                            }
                            if (i13 <= 16) {
                                ca1Var.f9783c = new ArrayList();
                                int i16 = i14;
                                while (i16 < i13) {
                                    int i17 = iArr5[i16];
                                    ((ArrayList) ca1Var.f9783c).add(new c37(Color.rgb(ca1.m4443k((i17 >> 10) & 31, 5, 8), ca1.m4443k((i17 >> 5) & 31, 5, 8), ca1.m4443k(i17 & 31, 5, 8)), iArr4[i17]));
                                    i16++;
                                    iArr5 = iArr5;
                                }
                                c = 2;
                            } else {
                                c = 2;
                                PriorityQueue priorityQueue = new PriorityQueue(16, ca1.f9780f);
                                priorityQueue.offer(new ba1(ca1Var, i14, ((int[]) ca1Var.f9781a).length - 1));
                                for (int i18 = 16; priorityQueue.size() < i18 && (ba1Var2 = (ba1) priorityQueue.poll()) != null; i18 = 16) {
                                    int i19 = ba1Var2.f8204b;
                                    int iMin = ba1Var2.f8203a;
                                    int i20 = i11;
                                    if ((i19 + 1) - iMin > i20) {
                                        ca1 ca1Var2 = ba1Var2.f8212j;
                                        if ((i19 + 1) - iMin <= i20) {
                                            C3386nv.m17633t("Can not split a box with only 1 color");
                                            throw th2;
                                        }
                                        int i21 = ba1Var2.f8207e - ba1Var2.f8206d;
                                        int i22 = ba1Var2.f8209g - ba1Var2.f8208f;
                                        int i23 = ba1Var2.f8211i - ba1Var2.f8210h;
                                        int i24 = (i21 < i22 || i21 < i23) ? (i22 < i21 || i22 < i23) ? -1 : -2 : -3;
                                        int[] iArr6 = (int[]) ca1Var2.f9781a;
                                        int[] iArr7 = (int[]) ca1Var2.f9782b;
                                        ca1.m4442j(i24, iMin, i19, iArr6);
                                        Arrays.sort(iArr6, iMin, ba1Var2.f8204b + 1);
                                        ca1.m4442j(i24, iMin, ba1Var2.f8204b, iArr6);
                                        int i25 = ba1Var2.f8205c / 2;
                                        int i26 = iMin;
                                        int i27 = 0;
                                        while (true) {
                                            int i28 = ba1Var2.f8204b;
                                            if (i26 > i28) {
                                            }
                                            i27 += iArr7[iArr6[i26]];
                                            if (i27 >= i25) {
                                                iMin = Math.min(i28 - 1, i26);
                                            }
                                            i26++;
                                            break;
                                            break;
                                        }
                                        ba1 ba1Var3 = new ba1(ca1Var2, iMin + 1, ba1Var2.f8204b);
                                        ba1Var2.f8204b = iMin;
                                        ba1Var2.m3501a();
                                        priorityQueue.offer(ba1Var3);
                                        priorityQueue.offer(ba1Var2);
                                        i11 = 1;
                                    } else {
                                        arrayList = new ArrayList(priorityQueue.size());
                                        it = priorityQueue.iterator();
                                        while (it.hasNext()) {
                                            ba1Var = (ba1) it.next();
                                            ca1 ca1Var3 = ba1Var.f8212j;
                                            iArr = (int[]) ca1Var3.f9781a;
                                            iArr2 = (int[]) ca1Var3.f9782b;
                                            Iterator it2 = it;
                                            i2 = 0;
                                            i3 = 0;
                                            i4 = 0;
                                            i5 = 0;
                                            for (i = ba1Var.f8203a; i <= ba1Var.f8204b; i++) {
                                                int i29 = iArr[i];
                                                int i30 = iArr2[i29];
                                                i3 += i30;
                                                i2 = (((i29 >> 10) & 31) * i30) + i2;
                                                i4 = (((i29 >> 5) & 31) * i30) + i4;
                                                i5 = (i30 * (i29 & 31)) + i5;
                                            }
                                            float f3 = i3;
                                            c37Var = new c37(Color.rgb(ca1.m4443k(Math.round(i2 / f3), 5, 8), ca1.m4443k(Math.round(i4 / f3), 5, 8), ca1.m4443k(Math.round(i5 / f3), 5, 8)), i3);
                                            if (!ca1Var.m4456o(c37Var.m4300b())) {
                                                arrayList.add(c37Var);
                                            }
                                            it = it2;
                                        }
                                        ca1Var.f9783c = arrayList;
                                    }
                                }
                                arrayList = new ArrayList(priorityQueue.size());
                                it = priorityQueue.iterator();
                                while (it.hasNext()) {
                                    ba1Var = (ba1) it.next();
                                    ca1 ca1Var4 = ba1Var.f8212j;
                                    iArr = (int[]) ca1Var4.f9781a;
                                    iArr2 = (int[]) ca1Var4.f9782b;
                                    Iterator it3 = it;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                    while (i <= ba1Var.f8204b) {
                                        int i210 = iArr[i];
                                        int i31 = iArr2[i210];
                                        i3 += i31;
                                        i2 = (((i210 >> 10) & 31) * i31) + i2;
                                        i4 = (((i210 >> 5) & 31) * i31) + i4;
                                        i5 = (i31 * (i210 & 31)) + i5;
                                    }
                                    float f4 = i3;
                                    c37Var = new c37(Color.rgb(ca1.m4443k(Math.round(i2 / f4), 5, 8), ca1.m4443k(Math.round(i4 / f4), 5, 8), ca1.m4443k(Math.round(i5 / f4), 5, 8)), i3);
                                    if (!ca1Var.m4456o(c37Var.m4300b())) {
                                        arrayList.add(c37Var);
                                    }
                                    it = it3;
                                }
                                ca1Var.f9783c = arrayList;
                            }
                            if (bitmapCreateScaledBitmap != bitmapCopy) {
                                bitmapCreateScaledBitmap.recycle();
                            }
                            ArrayList arrayList5 = (ArrayList) ca1Var.f9783c;
                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                            C3275kv c3275kv = new C3275kv(0);
                            int size = arrayList5.size();
                            int i32 = Integer.MIN_VALUE;
                            c37 c37Var2 = th2;
                            int i33 = 0;
                            while (i33 < size) {
                                c37 c37Var3 = (c37) arrayList5.get(i33);
                                int i34 = c37Var3.f9418e;
                                if (i34 > i32) {
                                    c37Var2 = c37Var3;
                                    i32 = i34;
                                }
                                i33++;
                                c37Var2 = c37Var2;
                            }
                            int size2 = arrayList3.size();
                            int i35 = 0;
                            while (i35 < size2) {
                                mr9 mr9Var = (mr9) arrayList3.get(i35);
                                float[] fArr2 = mr9Var.f51779c;
                                float[] fArr3 = mr9Var.f51777a;
                                float f5 = f2;
                                for (float f6 : fArr2) {
                                    if (f6 > f2) {
                                        f5 += f6;
                                    }
                                }
                                if (f5 != f2) {
                                    int length = fArr2.length;
                                    for (int i36 = 0; i36 < length; i36++) {
                                        float f7 = fArr2[i36];
                                        if (f7 > f2) {
                                            fArr2[i36] = f7 / f5;
                                        }
                                    }
                                }
                                int size3 = arrayList5.size();
                                float f8 = f2;
                                c37 c37Var4 = th2;
                                int i37 = 0;
                                while (i37 < size3) {
                                    c37 c37Var5 = (c37) arrayList5.get(i37);
                                    float[] fArrM4300b = c37Var5.m4300b();
                                    float f9 = fArrM4300b[1];
                                    ArrayList arrayList6 = arrayList5;
                                    float[] fArr4 = mr9Var.f51778b;
                                    if (f9 < fArr3[0] || f9 > fArr3[c]) {
                                        arrayList2 = arrayList3;
                                    } else {
                                        float f10 = fArrM4300b[c];
                                        if (f10 < fArr4[0] || f10 > fArr4[c] || sparseBooleanArray.get(c37Var5.f9417d)) {
                                            arrayList2 = arrayList3;
                                        } else {
                                            float[] fArrM4300b2 = c37Var5.m4300b();
                                            int i38 = c37Var2 != 0 ? c37Var2.f9418e : 1;
                                            arrayList2 = arrayList3;
                                            float[] fArr5 = mr9Var.f51779c;
                                            float f11 = fArr5[0];
                                            if (f11 > f2) {
                                                c2 = 1;
                                                fAbs = (1.0f - Math.abs(fArrM4300b2[1] - fArr3[1])) * f11;
                                            } else {
                                                c2 = 1;
                                                fAbs = f2;
                                            }
                                            float f12 = fArr5[c2];
                                            float fAbs2 = f12 > f2 ? (1.0f - Math.abs(fArrM4300b2[c] - fArr4[c2])) * f12 : f2;
                                            float f13 = fArr5[c];
                                            float f14 = fAbs + fAbs2 + (f13 > f2 ? (c37Var5.f9418e / i38) * f13 : f2);
                                            if (c37Var4 == 0 || f14 > f8) {
                                                c37Var4 = c37Var5;
                                                f8 = f14;
                                            }
                                        }
                                    }
                                    i37++;
                                    arrayList5 = arrayList6;
                                    arrayList3 = arrayList2;
                                    c37Var4 = c37Var4;
                                }
                                ArrayList arrayList7 = arrayList5;
                                ArrayList arrayList8 = arrayList3;
                                if (c37Var4 != 0) {
                                    sparseBooleanArray.append(c37Var4.f9417d, true);
                                }
                                c3275kv.put(mr9Var, c37Var4);
                                i35++;
                                arrayList5 = arrayList7;
                                arrayList3 = arrayList8;
                            }
                            sparseBooleanArray.clear();
                            if (c37Var2 != 0) {
                                numValueOf2 = Integer.valueOf(c37Var2.f9417d);
                            } else {
                                c37 c37Var6 = (c37) c3275kv.get(mr9.f51772e);
                                if (c37Var6 != null) {
                                    numValueOf = Integer.valueOf(c37Var6.f9417d);
                                } else {
                                    num = th2;
                                }
                            }
                            if (num != 0) {
                                num = numValueOf;
                                num = numValueOf2;
                                t66Var.setValue(new aa1(d32.m10035e(num.intValue())));
                            }
                        }
                    }
                }
                num = numValueOf;
                num = numValueOf2;
                return xfaVar;
            case 24:
                t66Var.setValue(Integer.valueOf((int) (((n84) obj).f52482a >> 32)));
                return xfaVar;
            case 25:
                t66Var.setValue(Integer.valueOf((int) (((n84) obj).f52482a >> 32)));
                return xfaVar;
            case 26:
                t66Var.setValue(new gq6(((gq6) obj).f41189a));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Bitmap bitmap3 = (Bitmap) obj;
                bitmap3.getClass();
                t66Var.setValue(bitmap3);
                return xfaVar;
            case 28:
                ((C3189km) obj).getClass();
                return new C0068g(AbstractC0070i.m777l(ss5.m21703b0(500, 0, null, 6), new C0023al(29, t66Var)).m23531a(AbstractC0070i.m772g(null, 0.0f, 3)), AbstractC0070i.m779n(ss5.m21703b0(500, 0, null, 6), new dt6(i8, t66Var)).m20180a(AbstractC0070i.m773h(null, 3)));
            default:
                int iIntValue = ((Integer) obj).intValue();
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue);
        }
    }
}
