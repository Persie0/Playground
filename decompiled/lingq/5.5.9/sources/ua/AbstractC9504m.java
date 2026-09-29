package ua;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.fragment.app.C0987y;
import com.google.android.exoplayer2.AbstractC2406e;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.common.collect.AbstractC3190i;
import com.google.common.collect.C3205x;
import com.google.common.collect.C3206y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.InterfaceC3196o;
import com.google.common.collect.MultimapBuilder;
import com.google.common.primitives.Ints;
import ga.C5735r;
import ga.C5736s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p068d9.C5097k;
import p134g8.C5715b;
import p150h9.C5926m0;
import p150h9.InterfaceC5924l0;
import p253m1.C7461h;
import p290o6.C7946b;
import p454wa.InterfaceC9878c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.InterfaceC10133c;

/* JADX INFO: renamed from: ua.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9504m extends AbstractC9510s {

    /* JADX INFO: renamed from: ua.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f48917a;

        /* JADX INFO: renamed from: b */
        public final int[] f48918b;

        /* JADX INFO: renamed from: c */
        public final C5736s[] f48919c;

        /* JADX INFO: renamed from: d */
        public final int[] f48920d;

        /* JADX INFO: renamed from: e */
        public final int[][][] f48921e;

        /* JADX INFO: renamed from: f */
        public final C5736s f48922f;

        public a(int[] iArr, C5736s[] c5736sArr, int[] iArr2, int[][][] iArr3, C5736s c5736s) {
            this.f48918b = iArr;
            this.f48919c = c5736sArr;
            this.f48921e = iArr3;
            this.f48920d = iArr2;
            this.f48922f = c5736s;
            this.f48917a = iArr.length;
        }
    }

    @Override // ua.AbstractC9510s
    /* JADX INFO: renamed from: b */
    public final void mo17971b(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:153:0x033b  */
    /* JADX WARN: Code duplicated, block: B:278:0x05bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v74, types: [ua.i] */
    @Override // ua.AbstractC9510s
    /* JADX INFO: renamed from: d */
    public final C9511t mo17972d(InterfaceC5924l0[] interfaceC5924l0Arr, C5736s c5736s) throws ExoPlaybackException {
        final C9496e.c cVar;
        C5736s[] c5736sArr;
        int[] iArr;
        final boolean z10;
        String str;
        C5736s[] c5736sArr2;
        boolean z11;
        boolean z12;
        boolean z13;
        InterfaceC9502k c9492a;
        int[][][] iArr2;
        a aVar;
        InterfaceC9878c interfaceC9878c;
        long j10;
        InterfaceC9502k.a aVar2;
        InterfaceC9502k.a aVar3;
        C5736s[] c5736sArr3;
        int[] iArr3;
        C5735r c5735r;
        int[] iArr4;
        C9496e.e eVar;
        int[] iArr5;
        C5736s c5736s2 = c5736s;
        boolean z14 = true;
        int[] iArr6 = new int[interfaceC5924l0Arr.length + 1];
        int length = interfaceC5924l0Arr.length + 1;
        C5735r[][] c5735rArr = new C5735r[length][];
        int[][][] iArr7 = new int[interfaceC5924l0Arr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = c5736s2.f34808a;
            c5735rArr[i10] = new C5735r[i11];
            iArr7[i10] = new int[i11][];
        }
        int length2 = interfaceC5924l0Arr.length;
        int[] iArr8 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr8[i12] = interfaceC5924l0Arr[i12].mo7001o();
        }
        int i13 = 0;
        while (i13 < c5736s2.f34808a) {
            C5735r c5735rM12091a = c5736s2.m12091a(i13);
            boolean z15 = c5735rM12091a.f34802c == 5 ? z14 : false;
            int length3 = interfaceC5924l0Arr.length;
            boolean z16 = z14;
            int i14 = 0;
            for (int i15 = 0; i15 < interfaceC5924l0Arr.length; i15++) {
                InterfaceC5924l0 interfaceC5924l0 = interfaceC5924l0Arr[i15];
                int iMax = 0;
                for (int i16 = 0; i16 < c5735rM12091a.f34800a; i16++) {
                    iMax = Math.max(iMax, interfaceC5924l0.mo7144b(c5735rM12091a.f34803d[i16]) & 7);
                }
                boolean z17 = iArr6[i15] == 0;
                if (iMax > i14 || (iMax == i14 && z15 && !z16 && z17)) {
                    z16 = z17;
                    i14 = iMax;
                    length3 = i15;
                }
            }
            if (length3 == interfaceC5924l0Arr.length) {
                iArr5 = new int[c5735rM12091a.f34800a];
            } else {
                InterfaceC5924l0 interfaceC5924l1 = interfaceC5924l0Arr[length3];
                int[] iArr9 = new int[c5735rM12091a.f34800a];
                for (int i17 = 0; i17 < c5735rM12091a.f34800a; i17++) {
                    iArr9[i17] = interfaceC5924l1.mo7144b(c5735rM12091a.f34803d[i17]);
                }
                iArr5 = iArr9;
            }
            int i18 = iArr6[length3];
            c5735rArr[length3][i18] = c5735rM12091a;
            iArr7[length3][i18] = iArr5;
            iArr6[length3] = i18 + 1;
            i13++;
            c5736s2 = c5736s;
            z14 = true;
        }
        C5736s[] c5736sArr4 = new C5736s[interfaceC5924l0Arr.length];
        String[] strArr = new String[interfaceC5924l0Arr.length];
        int[] iArr10 = new int[interfaceC5924l0Arr.length];
        for (int i19 = 0; i19 < interfaceC5924l0Arr.length; i19++) {
            int i20 = iArr6[i19];
            c5736sArr4[i19] = new C5736s((C5735r[]) C10134c0.m19028M(i20, c5735rArr[i19]));
            iArr7[i19] = (int[][]) C10134c0.m19028M(i20, iArr7[i19]);
            strArr[i19] = interfaceC5924l0Arr[i19].mo6875a();
            iArr10[i19] = ((AbstractC2406e) interfaceC5924l0Arr[i19]).f12220a;
        }
        a aVar4 = new a(iArr10, c5736sArr4, iArr8, iArr7, new C5736s((C5735r[]) C10134c0.m19028M(iArr6[interfaceC5924l0Arr.length], c5735rArr[interfaceC5924l0Arr.length])));
        final C9496e c9496e = (C9496e) this;
        synchronized (c9496e.f48799c) {
            try {
                cVar = c9496e.f48803g;
                if (cVar.f48849F0 && C10134c0.f51354a >= 32 && (eVar = c9496e.f48804h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    C10129a.m18993e(looperMyLooper);
                    if (eVar.f48884d == null && eVar.f48883c == null) {
                        eVar.f48884d = new C9501j(c9496e);
                        final Handler handler = new Handler(looperMyLooper);
                        eVar.f48883c = handler;
                        eVar.f48881a.addOnSpatializerStateChangedListener(new Executor() { // from class: ua.i
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                handler.post(runnable);
                            }
                        }, eVar.f48884d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i21 = aVar4.f48917a;
        InterfaceC9502k.a[] aVarArr = new InterfaceC9502k.a[i21];
        int i22 = 4;
        int i23 = 2;
        Pair pairM17939l = C9496e.m17939l(2, aVar4, iArr7, new C7946b(cVar, 8, iArr8), new C7461h(i22));
        if (pairM17939l != null) {
            aVarArr[((Integer) pairM17939l.second).intValue()] = (InterfaceC9502k.a) pairM17939l.first;
        }
        int i24 = 0;
        while (true) {
            int i25 = aVar4.f48917a;
            c5736sArr = aVar4.f48919c;
            iArr = aVar4.f48918b;
            if (i24 >= i25) {
                z10 = false;
                break;
            }
            if (2 == iArr[i24] && c5736sArr[i24].f34808a > 0) {
                z10 = true;
                break;
            }
            i24++;
        }
        Pair pairM17939l2 = C9496e.m17939l(1, aVar4, iArr7, new C9496e.g.a() { // from class: ua.c
            @Override // ua.C9496e.g.a
            /* JADX INFO: renamed from: b */
            public final List mo10864b(int i26, C5735r c5735r2, int[] iArr11) {
                C9496e.c cVar2 = cVar;
                boolean z18 = z10;
                C9496e c9496e2 = c9496e;
                c9496e2.getClass();
                C9495d c9495d = new C9495d(c9496e2);
                ImmutableList.C3147b c3147b = ImmutableList.f16043b;
                ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
                for (int i27 = 0; i27 < c5735r2.f34800a; i27++) {
                    c3146a.m9055b(new C9496e.a(i26, c5735r2, i27, cVar2, iArr11[i27], z18, c9495d));
                }
                return c3146a.m9068e();
            }
        }, new C5715b(i22));
        if (pairM17939l2 != null) {
            aVarArr[((Integer) pairM17939l2.second).intValue()] = (InterfaceC9502k.a) pairM17939l2.first;
        }
        if (pairM17939l2 == null) {
            str = null;
        } else {
            InterfaceC9502k.a aVar5 = (InterfaceC9502k.a) pairM17939l2.first;
            str = aVar5.f48914a.f34803d[aVar5.f48915b[0]].f12474c;
        }
        int i26 = 3;
        Pair pairM17939l3 = C9496e.m17939l(3, aVar4, iArr7, new C5097k(cVar, 6, str), new C5715b(i26));
        if (pairM17939l3 != null) {
            aVarArr[((Integer) pairM17939l3.second).intValue()] = (InterfaceC9502k.a) pairM17939l3.first;
        }
        int i27 = 0;
        while (i27 < i21) {
            int i28 = iArr[i27];
            if (i28 == i23 || i28 == 1 || i28 == i26) {
                c5736sArr3 = c5736sArr;
                iArr3 = iArr;
            } else {
                C5736s c5736s3 = c5736sArr[i27];
                int[][] iArr11 = iArr7[i27];
                C5735r c5735r2 = null;
                int i29 = 0;
                int i30 = 0;
                C9496e.b bVar = null;
                while (i29 < c5736s3.f34808a) {
                    C5735r c5735rM12091a2 = c5736s3.m12091a(i29);
                    int[] iArr12 = iArr11[i29];
                    C5735r c5735r3 = c5735r2;
                    C9496e.b bVar2 = bVar;
                    int i31 = 0;
                    while (i31 < c5735rM12091a2.f34800a) {
                        C5736s[] c5736sArr5 = c5736sArr;
                        if (C9496e.m17937i(iArr12[i31], cVar.f48850G0)) {
                            c5735r = c5735rM12091a2;
                            C9496e.b bVar3 = new C9496e.b(c5735rM12091a2.f34803d[i31], iArr12[i31]);
                            if (bVar2 != null) {
                                iArr4 = iArr;
                                if (AbstractC3190i.f16159a.mo9132c(bVar3.f48825b, bVar2.f48825b).mo9132c(bVar3.f48824a, bVar2.f48824a).mo9134e() > 0) {
                                }
                            } else {
                                iArr4 = iArr;
                            }
                            i30 = i31;
                            bVar2 = bVar3;
                            c5735r3 = c5735r;
                        } else {
                            c5735r = c5735rM12091a2;
                            iArr4 = iArr;
                        }
                        i31++;
                        c5736sArr = c5736sArr5;
                        c5735rM12091a2 = c5735r;
                        iArr = iArr4;
                    }
                    i29++;
                    bVar = bVar2;
                    c5735r2 = c5735r3;
                }
                c5736sArr3 = c5736sArr;
                iArr3 = iArr;
                aVarArr[i27] = c5735r2 == null ? null : new InterfaceC9502k.a(0, c5735r2, new int[]{i30});
            }
            i27++;
            c5736sArr = c5736sArr3;
            iArr = iArr3;
            i23 = 2;
            i26 = 3;
        }
        int i32 = aVar4.f48917a;
        HashMap map = new HashMap();
        int i33 = 0;
        while (true) {
            c5736sArr2 = aVar4.f48919c;
            if (i33 >= i32) {
                break;
            }
            C9496e.m17935g(c5736sArr2[i33], cVar, map);
            i33++;
        }
        C9496e.m17935g(aVar4.f48922f, cVar, map);
        for (int i34 = 0; i34 < i32; i34++) {
            C9507p c9507p = (C9507p) map.get(Integer.valueOf(aVar4.f48918b[i34]));
            if (c9507p != null) {
                ImmutableList<Integer> immutableList = c9507p.f48929b;
                if (immutableList.isEmpty()) {
                    aVar3 = null;
                } else {
                    C5736s c5736s4 = c5736sArr2[i34];
                    C5735r c5735r4 = c9507p.f48928a;
                    if (c5736s4.m12092b(c5735r4) != -1) {
                        aVar3 = new InterfaceC9502k.a(0, c5735r4, Ints.m9145o0(immutableList));
                    } else {
                        aVar3 = null;
                    }
                }
                aVarArr[i34] = aVar3;
            }
        }
        int i35 = aVar4.f48917a;
        for (int i36 = 0; i36 < i35; i36++) {
            C5736s c5736s5 = aVar4.f48919c[i36];
            Map<C5736s, C9496e.d> map2 = cVar.f48853J0.get(i36);
            if (map2 != null && map2.containsKey(c5736s5)) {
                Map<C5736s, C9496e.d> map3 = cVar.f48853J0.get(i36);
                C9496e.d dVar = map3 != null ? map3.get(c5736s5) : null;
                if (dVar != null) {
                    int[] iArr13 = dVar.f48879b;
                    if (iArr13.length != 0) {
                        aVar2 = new InterfaceC9502k.a(dVar.f48880c, c5736s5.m12091a(dVar.f48878a), iArr13);
                    } else {
                        aVar2 = null;
                    }
                } else {
                    aVar2 = null;
                }
                aVarArr[i36] = aVar2;
            }
        }
        for (int i37 = 0; i37 < i21; i37++) {
            int i38 = aVar4.f48918b[i37];
            if (cVar.f48854K0.get(i37) || cVar.f48970U.contains(Integer.valueOf(i38))) {
                aVarArr[i37] = null;
            }
        }
        InterfaceC9502k.b bVar4 = c9496e.f48801e;
        InterfaceC9878c interfaceC9878c2 = c9496e.f49010b;
        C10129a.m18993e(interfaceC9878c2);
        ((C9492a.b) bVar4).getClass();
        ArrayList arrayList = new ArrayList();
        for (int i39 = 0; i39 < i21; i39++) {
            InterfaceC9502k.a aVar6 = aVarArr[i39];
            if (aVar6 == null || aVar6.f48915b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.C3147b c3147b = ImmutableList.f16043b;
                ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
                c3146a.m9055b(new C9492a.a(0L, 0L));
                arrayList.add(c3146a);
            }
        }
        long[][] jArr = new long[i21][];
        for (int i40 = 0; i40 < i21; i40++) {
            InterfaceC9502k.a aVar7 = aVarArr[i40];
            if (aVar7 == null) {
                jArr[i40] = new long[0];
            } else {
                int[] iArr14 = aVar7.f48915b;
                jArr[i40] = new long[iArr14.length];
                for (int i41 = 0; i41 < iArr14.length; i41++) {
                    long j11 = aVar7.f48914a.f34803d[iArr14[i41]].f12480h;
                    long[] jArr2 = jArr[i40];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i41] = j11;
                }
                Arrays.sort(jArr[i40]);
            }
        }
        int[] iArr15 = new int[i21];
        long[] jArr3 = new long[i21];
        for (int i42 = 0; i42 < i21; i42++) {
            long[] jArr4 = jArr[i42];
            jArr3[i42] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C9492a.m17932u(arrayList, jArr3);
        C3205x c3205xM9117a = MultimapBuilder.m9117a();
        C0987y.m3820b("expectedValuesPerKey", 2);
        InterfaceC3196o interfaceC3196oM9139b = new C3206y(c3205xM9117a).m9139b();
        int i43 = 0;
        while (i43 < i21) {
            long[] jArr5 = jArr[i43];
            if (jArr5.length <= 1) {
                interfaceC9878c = interfaceC9878c2;
                iArr2 = iArr7;
                j10 = -1;
                aVar = aVar4;
            } else {
                int length4 = jArr5.length;
                double[] dArr = new double[length4];
                int i44 = 0;
                while (true) {
                    long[] jArr6 = jArr[i43];
                    iArr2 = iArr7;
                    double dLog = 0.0d;
                    if (i44 >= jArr6.length) {
                        break;
                    }
                    a aVar8 = aVar4;
                    InterfaceC9878c interfaceC9878c3 = interfaceC9878c2;
                    long j12 = jArr6[i44];
                    if (j12 != -1) {
                        dLog = Math.log(j12);
                    }
                    dArr[i44] = dLog;
                    i44++;
                    aVar4 = aVar8;
                    iArr7 = iArr2;
                    interfaceC9878c2 = interfaceC9878c3;
                }
                aVar = aVar4;
                interfaceC9878c = interfaceC9878c2;
                j10 = -1;
                int i45 = length4 - 1;
                double d10 = dArr[i45] - dArr[0];
                int i46 = 0;
                while (i46 < i45) {
                    double d11 = dArr[i46];
                    i46++;
                    interfaceC3196oM9139b.mo9018a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i46]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i43));
                    d10 = d10;
                }
            }
            i43++;
            aVar4 = aVar;
            iArr7 = iArr2;
            interfaceC9878c2 = interfaceC9878c;
        }
        InterfaceC9878c interfaceC9878c4 = interfaceC9878c2;
        int[][][] iArr16 = iArr7;
        a aVar9 = aVar4;
        ImmutableList immutableListM9060Q = ImmutableList.m9060Q(interfaceC3196oM9139b.values());
        for (int i47 = 0; i47 < immutableListM9060Q.size(); i47++) {
            int iIntValue = ((Integer) immutableListM9060Q.get(i47)).intValue();
            int i48 = iArr15[iIntValue] + 1;
            iArr15[iIntValue] = i48;
            jArr3[iIntValue] = jArr[iIntValue][i48];
            C9492a.m17932u(arrayList, jArr3);
        }
        for (int i49 = 0; i49 < i21; i49++) {
            if (arrayList.get(i49) != null) {
                jArr3[i49] = jArr3[i49] * 2;
            }
        }
        C9492a.m17932u(arrayList, jArr3);
        ImmutableList.C3146a c3146a2 = new ImmutableList.C3146a();
        for (int i50 = 0; i50 < arrayList.size(); i50++) {
            ImmutableList.C3146a c3146a3 = (ImmutableList.C3146a) arrayList.get(i50);
            c3146a2.m9055b(c3146a3 == null ? ImmutableList.m9062Y() : c3146a3.m9068e());
        }
        ImmutableList immutableListM9068e = c3146a2.m9068e();
        InterfaceC9502k[] interfaceC9502kArr = new InterfaceC9502k[i21];
        for (int i51 = 0; i51 < i21; i51++) {
            InterfaceC9502k.a aVar10 = aVarArr[i51];
            if (aVar10 != null) {
                int[] iArr17 = aVar10.f48915b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        c9492a = new C9503l(iArr17[0], aVar10.f48916c, aVar10.f48914a);
                    } else {
                        long j13 = 25000;
                        c9492a = new C9492a(aVar10.f48914a, iArr17, aVar10.f48916c, interfaceC9878c4, 10000, j13, j13, 1279, 719, 0.7f, 0.75f, (ImmutableList) immutableListM9068e.get(i51), InterfaceC10133c.f51353a);
                    }
                    interfaceC9502kArr[i51] = c9492a;
                }
            }
        }
        C5926m0[] c5926m0Arr = new C5926m0[i21];
        for (int i52 = 0; i52 < i21; i52++) {
            c5926m0Arr[i52] = !(cVar.f48854K0.get(i52) || cVar.f48970U.contains(Integer.valueOf(aVar9.f48918b[i52]))) && (aVar9.f48918b[i52] == -2 || interfaceC9502kArr[i52] != null) ? C5926m0.f35345b : null;
        }
        if (cVar.f48851H0) {
            int i53 = -1;
            int i54 = -1;
            int i55 = 0;
            while (true) {
                if (i55 >= aVar9.f48917a) {
                    z12 = true;
                    break;
                }
                int i56 = aVar9.f48918b[i55];
                InterfaceC9502k interfaceC9502k = interfaceC9502kArr[i55];
                if (i56 == 1 || i56 == 2) {
                    if (interfaceC9502k != null) {
                        int[][] iArr18 = iArr16[i55];
                        int iM12092b = aVar9.f48919c[i55].m12092b(interfaceC9502k.mo7339a());
                        int i57 = 0;
                        while (true) {
                            if (i57 >= interfaceC9502k.length()) {
                                z13 = true;
                                break;
                            }
                            if ((iArr18[iM12092b][interfaceC9502k.mo7348j(i57)] & 32) != 32) {
                                z13 = false;
                                break;
                            }
                            i57++;
                        }
                        if (!z13) {
                            continue;
                        } else if (i56 == 1) {
                            if (i54 != -1) {
                                z12 = false;
                                break;
                            }
                            i54 = i55;
                        } else {
                            if (i53 != -1) {
                                z12 = false;
                                break;
                            }
                            i53 = i55;
                        }
                    }
                }
                i55++;
            }
            if (z12 & ((i54 == -1 || i53 == -1) ? false : true)) {
                C5926m0 c5926m0 = new C5926m0(true);
                c5926m0Arr[i54] = c5926m0;
                c5926m0Arr[i53] = c5926m0;
            }
        }
        Pair pairCreate = Pair.create(c5926m0Arr, interfaceC9502kArr);
        InterfaceC9505n[] interfaceC9505nArr = (InterfaceC9505n[]) pairCreate.second;
        List[] listArr = new List[interfaceC9505nArr.length];
        for (int i58 = 0; i58 < interfaceC9505nArr.length; i58++) {
            InterfaceC9505n interfaceC9505n = interfaceC9505nArr[i58];
            listArr[i58] = interfaceC9505n != null ? ImmutableList.m9064b0(interfaceC9505n) : ImmutableList.m9062Y();
        }
        ImmutableList.C3146a c3146a4 = new ImmutableList.C3146a();
        for (int i59 = 0; i59 < aVar9.f48917a; i59++) {
            C5736s[] c5736sArr6 = aVar9.f48919c;
            C5736s c5736s6 = c5736sArr6[i59];
            List list = listArr[i59];
            int i60 = 0;
            while (i60 < c5736s6.f34808a) {
                C5735r c5735rM12091a3 = c5736s6.m12091a(i60);
                int i61 = c5736sArr6[i59].m12091a(i60).f34800a;
                int[] iArr19 = new int[i61];
                int i62 = 0;
                for (int i63 = 0; i63 < i61; i63++) {
                    if ((aVar9.f48921e[i59][i60][i63] & 7) == 4) {
                        iArr19[i62] = i63;
                        i62++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr19, i62);
                int iMin = 16;
                String str2 = null;
                int i64 = 0;
                boolean z18 = false;
                int i65 = 0;
                while (i64 < iArrCopyOf.length) {
                    List[] listArr2 = listArr;
                    String str3 = c5736sArr6[i59].m12091a(i60).f34803d[iArrCopyOf[i64]].f12484l;
                    int i66 = i65 + 1;
                    if (i65 == 0) {
                        str2 = str3;
                    } else {
                        z18 = (!C10134c0.m19034a(str2, str3)) | z18;
                    }
                    iMin = Math.min(iMin, aVar9.f48921e[i59][i60][i64] & 24);
                    i64++;
                    i65 = i66;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                if (z18) {
                    iMin = Math.min(iMin, aVar9.f48920d[i59]);
                }
                boolean z19 = iMin != 0;
                int i67 = c5735rM12091a3.f34800a;
                int[] iArr20 = new int[i67];
                boolean[] zArr = new boolean[i67];
                for (int i68 = 0; i68 < c5735rM12091a3.f34800a; i68++) {
                    iArr20[i68] = aVar9.f48921e[i59][i60][i68] & 7;
                    int i69 = 0;
                    while (true) {
                        if (i69 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        InterfaceC9505n interfaceC9505n2 = (InterfaceC9505n) list.get(i69);
                        if (interfaceC9505n2.mo7339a().equals(c5735rM12091a3) && interfaceC9505n2.mo7358t(i68) != -1) {
                            z11 = true;
                            break;
                        }
                        i69++;
                    }
                    zArr[i68] = z11;
                }
                c3146a4.m9055b(new C2384d0.a(c5735rM12091a3, z19, iArr20, zArr));
                i60++;
                listArr = listArr3;
            }
        }
        int i70 = 0;
        while (true) {
            C5736s c5736s7 = aVar9.f48922f;
            if (i70 >= c5736s7.f34808a) {
                return new C9511t((C5926m0[]) pairCreate.first, (InterfaceC9502k[]) pairCreate.second, new C2384d0(c3146a4.m9068e()), aVar9);
            }
            C5735r c5735rM12091a4 = c5736s7.m12091a(i70);
            int[] iArr21 = new int[c5735rM12091a4.f34800a];
            Arrays.fill(iArr21, 0);
            c3146a4.m9055b(new C2384d0.a(c5735rM12091a4, false, iArr21, new boolean[c5735rM12091a4.f34800a]));
            i70++;
        }
    }
}
