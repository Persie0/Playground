package p000;

import android.text.StaticLayout;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bfd {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m3688a(InterfaceC0310a interfaceC0310a, List list, StaticLayout staticLayout, float f) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer numValueOf = Integer.valueOf(staticLayout.getLineForVertical((int) Float.intBitsToFloat((int) (((e28) obj).m10803d() & 4294967295L))));
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        TreeMap treeMap = new TreeMap(linkedHashMap);
        float fMo912g0 = interfaceC0310a.mo912g0(4.0f);
        float f2 = f * 0.35f;
        int lineCount = staticLayout.getLineCount();
        ArrayList arrayList2 = new ArrayList(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            List list2 = (List) entry.getValue();
            list2.getClass();
            List list3 = list2;
            Iterator it = list3.iterator();
            if (!it.hasNext()) {
                uk9.m22784s();
                return null;
            }
            float fMin = ((e28) it.next()).f36620a;
            while (it.hasNext()) {
                fMin = Math.min(fMin, ((e28) it.next()).f36620a);
            }
            Iterator it2 = list3.iterator();
            if (!it2.hasNext()) {
                uk9.m22784s();
                return null;
            }
            float fMax = ((e28) it2.next()).f36622c;
            while (it2.hasNext()) {
                fMax = Math.max(fMax, ((e28) it2.next()).f36622c);
            }
            num.getClass();
            float lineBaseline = staticLayout.getLineBaseline(num.intValue()) + f2;
            Float fValueOf = num.intValue() + 1 < lineCount ? Float.valueOf(staticLayout.getLineTop(num.intValue() + 1)) : null;
            arrayList2.add(new tc5(fMin, fMax, lineBaseline + (fValueOf != null ? l70.m15944g((fValueOf.floatValue() - lineBaseline) / 2.0f, 0.0f, fMo912g0) : fMo912g0), fMax - fMin));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0277 A[EDGE_INSN: B:118:0x0277->B:97:0x0277 BREAK  A[LOOP:5: B:86:0x01bd->B:96:0x026b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x026b A[LOOP:5: B:86:0x01bd->B:96:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x02f8  */
    /* JADX INFO: renamed from: b */
    public static final void m3689b(C0358h c0358h, f00 f00Var, ArrayList arrayList, Map map, StaticLayout staticLayout, float f, long j, long j2, long j3, boolean z) {
        float f2;
        float f3;
        Iterator it;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float fM15944g;
        c0358h.getClass();
        f00Var.getClass();
        map.getClass();
        long j4 = f00Var.f38129c;
        if (j4 <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterable iterable = (List) map.get(Integer.valueOf(((q7b) it2.next()).f57357a.f69009f));
            if (iterable == null) {
                iterable = EmptyList.f47638a;
            }
            u91.m22630w0(iterable, arrayList2);
        }
        List listM22614f1 = u91.m22614f1(arrayList2, ss5.m21717n(new ae1(27), new ae1(28)));
        if (listM22614f1.isEmpty()) {
            return;
        }
        ArrayList arrayListM3688a = m3688a(c0358h, listM22614f1, staticLayout, f);
        Iterator it3 = arrayListM3688a.iterator();
        double d = 0.0d;
        while (it3.hasNext()) {
            d += (double) ((tc5) it3.next()).f62151d;
        }
        float f13 = (float) d;
        float f14 = 0.0f;
        if (f13 <= 0.0f) {
            return;
        }
        float fMo912g0 = c0358h.mo912g0(120.0f);
        if (fMo912g0 > f13) {
            fMo912g0 = f13;
        }
        float fMo912g1 = c0358h.mo912g0(2.5f);
        float fMo912g2 = c0358h.mo912g0(16.0f);
        float f15 = fMo912g0 / 3.0f;
        if (fMo912g2 > f15) {
            fMo912g2 = f15;
        }
        float fM15944g2 = l70.m15944g((((((j3 - f00Var.f38130d) / 1000000.0f) * f00Var.f38132f) + f00Var.f38131e) - f00Var.f38128b) / j4, 0.0f, 1.0f);
        int i = f00Var.f38133g;
        if (i > 0 && !arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            if (!it4.hasNext()) {
                uk9.m22784s();
                return;
            }
            int i2 = ((q7b) it4.next()).f57357a.f69006c;
            while (it4.hasNext()) {
                int i3 = ((q7b) it4.next()).f57357a.f69006c;
                if (i2 > i3) {
                    i2 = i3;
                }
            }
            Iterator it5 = arrayList.iterator();
            if (!it5.hasNext()) {
                uk9.m22784s();
                return;
            }
            int i4 = ((q7b) it5.next()).f57357a.f69007d;
            while (it5.hasNext()) {
                int i5 = ((q7b) it5.next()).f57357a.f69007d;
                if (i4 < i5) {
                    i4 = i5;
                }
            }
            float f16 = i;
            float f17 = i2 / f16;
            float f18 = (i4 / f16) - f17;
            if (f18 > 0.0f) {
                fM15944g2 = l70.m15944g((fM15944g2 - f17) / f18, 0.0f, 1.0f);
            }
        }
        float f19 = (f13 + fMo912g0) * fM15944g2;
        float fM15944g3 = l70.m15944g(f19 - fMo912g0, 0.0f, f13);
        float fM15944g4 = l70.m15944g(f19, 0.0f, f13);
        if (fM15944g4 <= fM15944g3) {
            return;
        }
        long j5 = z ? j2 : j;
        long j6 = z ? j : j2;
        Iterator it6 = arrayListM3688a.iterator();
        float f20 = 0.0f;
        while (it6.hasNext()) {
            tc5 tc5Var = (tc5) it6.next();
            float f21 = tc5Var.f62151d;
            float f22 = f20 + f21;
            if (fM15944g4 <= f20 || fM15944g3 >= f22) {
                f2 = fM15944g4;
                f3 = fM15944g3;
                it = it6;
                f4 = f20;
                f5 = f14;
                f6 = fMo912g1;
            } else {
                float f23 = fM15944g3 - f20;
                if (f23 < f14) {
                    f23 = f14;
                }
                float f24 = fM15944g4 - f20;
                if (f24 > f21) {
                    f24 = f21;
                }
                float f25 = tc5Var.f62148a;
                if (z) {
                    f7 = (f21 - f24) + f25;
                    f8 = (f21 - f23) + f25;
                } else {
                    float f26 = f25 + f23;
                    float f27 = f25 + f24;
                    f7 = f26;
                    f8 = f27;
                }
                float f28 = tc5Var.f62150c;
                float f29 = f8 - f7;
                if (f29 > f14) {
                    float f30 = fM15944g4 - fM15944g3;
                    float f31 = (f20 + f23) - fM15944g3;
                    ArrayList arrayList3 = new ArrayList();
                    float f32 = f30 - fMo912g2;
                    int i6 = 0;
                    while (true) {
                        float f33 = i6 / 5.0f;
                        float f34 = (f33 * f29) + f31;
                        if (f34 >= fMo912g2) {
                            f9 = f33;
                            f2 = fM15944g4;
                            f3 = fM15944g3;
                            f10 = 1.0f;
                            f11 = 0.0f;
                            if (f34 > f32) {
                                fM15944g = l70.m15944g((f30 - f34) / fMo912g2, 0.0f, 1.0f);
                            } else {
                                f12 = 1.0f;
                            }
                            float fM15944g5 = l70.m15944g(f34 / f30, f11, f10);
                            it = it6;
                            f4 = f20;
                            long jM10033d = d32.m10033d(((aa1.m204h(j6) - aa1.m204h(j5)) * fM15944g5) + aa1.m204h(j5), ((aa1.m203g(j6) - aa1.m203g(j5)) * fM15944g5) + aa1.m203g(j5), ((aa1.m201e(j6) - aa1.m201e(j5)) * fM15944g5) + aa1.m201e(j5), ((aa1.m200d(j6) - aa1.m200d(j5)) * fM15944g5) + aa1.m200d(j5), va1.f65100e);
                            arrayList3.add(new Pair(Float.valueOf(f9), new aa1(aa1.m198b(aa1.m200d(jM10033d) * f12, jM10033d))));
                            if (i6 != 5) {
                                break;
                            }
                            i6++;
                            fM15944g3 = f3;
                            fM15944g4 = f2;
                            f20 = f4;
                            it6 = it;
                        } else {
                            f9 = f33;
                            f2 = fM15944g4;
                            f3 = fM15944g3;
                            f10 = 1.0f;
                            f11 = 0.0f;
                            fM15944g = l70.m15944g(f34 / fMo912g2, 0.0f, 1.0f);
                        }
                        f12 = fM15944g;
                        float fM15944g6 = l70.m15944g(f34 / f30, f11, f10);
                        it = it6;
                        f4 = f20;
                        long jM10033d2 = d32.m10033d(((aa1.m204h(j6) - aa1.m204h(j5)) * fM15944g6) + aa1.m204h(j5), ((aa1.m203g(j6) - aa1.m203g(j5)) * fM15944g6) + aa1.m203g(j5), ((aa1.m201e(j6) - aa1.m201e(j5)) * fM15944g6) + aa1.m201e(j5), ((aa1.m200d(j6) - aa1.m200d(j5)) * fM15944g6) + aa1.m200d(j5), va1.f65100e);
                        arrayList3.add(new Pair(Float.valueOf(f9), new aa1(aa1.m198b(aa1.m200d(jM10033d2) * f12, jM10033d2))));
                        if (i6 != 5) {
                            break;
                            break;
                        }
                        i6++;
                        fM15944g3 = f3;
                        fM15944g4 = f2;
                        f20 = f4;
                        it6 = it;
                    }
                    ui0 ui0Var = vi0.Companion;
                    Pair[] pairArr = (Pair[]) arrayList3.toArray(new Pair[0]);
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
                    ui0Var.getClass();
                    f5 = 0.0f;
                    float f35 = fMo912g1;
                    InterfaceC0310a.m1420v0(c0358h, ui0.m22746b((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), f35, 0.0f, 480);
                    f6 = f35;
                    tc5Var = tc5Var;
                } else {
                    f2 = fM15944g4;
                    f3 = fM15944g3;
                    it = it6;
                    f4 = f20;
                    f5 = f14;
                    f6 = fMo912g1;
                }
            }
            f20 = f4 + tc5Var.f62151d;
            fM15944g3 = f3;
            fM15944g4 = f2;
            fMo912g1 = f6;
            f14 = f5;
            it6 = it;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m3690c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
