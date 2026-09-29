package ua;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.C2415l;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.common.collect.AbstractC3177a0;
import com.google.common.collect.AbstractC3190i;
import com.google.common.collect.ImmutableList;
import ga.C5735r;
import ga.C5736s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import p253m1.C7461h;
import p291o7.C8002l;
import p404u2.C9384d;
import p479xa.C10131b;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: ua.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9496e extends AbstractC9504m {

    /* JADX INFO: renamed from: j */
    public static final AbstractC3177a0<Integer> f48797j;

    /* JADX INFO: renamed from: k */
    public static final AbstractC3177a0<Integer> f48798k;

    /* JADX INFO: renamed from: c */
    public final Object f48799c;

    /* JADX INFO: renamed from: d */
    public final Context f48800d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9502k.b f48801e;

    /* JADX INFO: renamed from: f */
    public final boolean f48802f;

    /* JADX INFO: renamed from: g */
    public c f48803g;

    /* JADX INFO: renamed from: h */
    public final e f48804h;

    /* JADX INFO: renamed from: i */
    public C2367a f48805i;

    /* JADX INFO: renamed from: ua.e$a */
    public static final class a extends g<a> implements Comparable<a> {

        /* JADX INFO: renamed from: H */
        public final boolean f48806H;

        /* JADX INFO: renamed from: I */
        public final int f48807I;

        /* JADX INFO: renamed from: J */
        public final int f48808J;

        /* JADX INFO: renamed from: K */
        public final boolean f48809K;

        /* JADX INFO: renamed from: L */
        public final int f48810L;

        /* JADX INFO: renamed from: M */
        public final int f48811M;

        /* JADX INFO: renamed from: N */
        public final int f48812N;

        /* JADX INFO: renamed from: O */
        public final int f48813O;

        /* JADX INFO: renamed from: P */
        public final boolean f48814P;

        /* JADX INFO: renamed from: Q */
        public final boolean f48815Q;

        /* JADX INFO: renamed from: e */
        public final int f48816e;

        /* JADX INFO: renamed from: f */
        public final boolean f48817f;

        /* JADX INFO: renamed from: g */
        public final String f48818g;

        /* JADX INFO: renamed from: h */
        public final c f48819h;

        /* JADX INFO: renamed from: i */
        public final boolean f48820i;

        /* JADX INFO: renamed from: j */
        public final int f48821j;

        /* JADX INFO: renamed from: k */
        public final int f48822k;

        /* JADX INFO: renamed from: l */
        public final int f48823l;

        /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
        public a(int i10, C5735r c5735r, int i11, c cVar, int i12, boolean z10, C9495d c9495d) {
            int i13;
            int iM17936h;
            boolean z11;
            String[] strArrSplit;
            int iM17936h2;
            boolean z12;
            super(i10, i11, c5735r);
            this.f48819h = cVar;
            this.f48818g = C9496e.m17938k(this.f48897d.f12474c);
            int i14 = 0;
            this.f48820i = C9496e.m17937i(i12, false);
            int i15 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i15 >= cVar.f48958I.size()) {
                    iM17936h = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM17936h = C9496e.m17936h(this.f48897d, cVar.f48958I.get(i15), false);
                    if (iM17936h > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f48822k = i15;
            this.f48821j = iM17936h;
            int i16 = this.f48897d.f12477e;
            int i17 = cVar.f48959J;
            this.f48823l = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
            C2416m c2416m = this.f48897d;
            int i18 = c2416m.f12477e;
            this.f48806H = i18 == 0 || (i18 & 1) != 0;
            this.f48809K = (c2416m.f12476d & 1) != 0;
            int i19 = c2416m.f12463T;
            this.f48810L = i19;
            this.f48811M = c2416m.f12464U;
            int i20 = c2416m.f12480h;
            this.f48812N = i20;
            if ((i20 != -1 && i20 > cVar.f48961L) || (i19 != -1 && i19 > cVar.f48960K)) {
                z11 = false;
            } else if (c9495d.apply(c2416m)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f48817f = z11;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i21 = C10134c0.f51354a;
            if (i21 >= 24) {
                strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
            } else {
                String[] strArr = new String[1];
                Locale locale = configuration.locale;
                strArr[0] = i21 >= 21 ? locale.toLanguageTag() : locale.toString();
                strArrSplit = strArr;
            }
            for (int i22 = 0; i22 < strArrSplit.length; i22++) {
                strArrSplit[i22] = C10134c0.m19027L(strArrSplit[i22]);
            }
            int i23 = 0;
            while (true) {
                if (i23 >= strArrSplit.length) {
                    iM17936h2 = 0;
                    i23 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM17936h2 = C9496e.m17936h(this.f48897d, strArrSplit[i23], false);
                    if (iM17936h2 > 0) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
            this.f48807I = i23;
            this.f48808J = iM17936h2;
            int i24 = 0;
            while (true) {
                ImmutableList<String> immutableList = cVar.f48962M;
                if (i24 >= immutableList.size()) {
                    break;
                }
                String str = this.f48897d.f12484l;
                if (str != null && str.equals(immutableList.get(i24))) {
                    i13 = i24;
                    break;
                }
                i24++;
            }
            this.f48813O = i13;
            this.f48814P = (i12 & 384) == 128;
            this.f48815Q = (i12 & 64) == 64;
            c cVar2 = this.f48819h;
            if (C9496e.m17937i(i12, cVar2.f48850G0) && ((z12 = this.f48817f) || cVar2.f48844A0)) {
                i14 = (!C9496e.m17937i(i12, false) || !z12 || this.f48897d.f12480h == -1 || cVar2.f48968S || cVar2.f48967R || (!cVar2.f48852I0 && z10)) ? 1 : 2;
            }
            this.f48816e = i14;
        }

        @Override // ua.C9496e.g
        /* JADX INFO: renamed from: a */
        public final int mo17946a() {
            return this.f48816e;
        }

        @Override // ua.C9496e.g
        /* JADX INFO: renamed from: f */
        public final boolean mo17947f(g gVar) {
            int i10;
            String str;
            int i11;
            a aVar = (a) gVar;
            c cVar = this.f48819h;
            boolean z10 = cVar.f48847D0;
            C2416m c2416m = aVar.f48897d;
            C2416m c2416m2 = this.f48897d;
            if (z10 || ((i11 = c2416m2.f12463T) != -1 && i11 == c2416m.f12463T)) {
                if (cVar.f48845B0 || ((str = c2416m2.f12484l) != null && TextUtils.equals(str, c2416m.f12484l))) {
                    if (cVar.f48846C0 || ((i10 = c2416m2.f12464U) != -1 && i10 == c2416m.f12464U)) {
                        if (!cVar.f48848E0) {
                            if (this.f48814P == aVar.f48814P && this.f48815Q == aVar.f48815Q) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z10 = this.f48820i;
            boolean z11 = this.f48817f;
            Object objMo9119c = (z11 && z10) ? C9496e.f48797j : C9496e.f48797j.mo9119c();
            AbstractC3190i abstractC3190iMo9131b = AbstractC3190i.f16159a.mo9132c(z10, aVar.f48820i).mo9131b(Integer.valueOf(this.f48822k), Integer.valueOf(aVar.f48822k), AbstractC3177a0.m9124b().mo9119c()).mo9130a(this.f48821j, aVar.f48821j).mo9130a(this.f48823l, aVar.f48823l).mo9132c(this.f48809K, aVar.f48809K).mo9132c(this.f48806H, aVar.f48806H).mo9131b(Integer.valueOf(this.f48807I), Integer.valueOf(aVar.f48807I), AbstractC3177a0.m9124b().mo9119c()).mo9130a(this.f48808J, aVar.f48808J).mo9132c(z11, aVar.f48817f).mo9131b(Integer.valueOf(this.f48813O), Integer.valueOf(aVar.f48813O), AbstractC3177a0.m9124b().mo9119c());
            int i10 = this.f48812N;
            Integer numValueOf = Integer.valueOf(i10);
            int i11 = aVar.f48812N;
            AbstractC3190i abstractC3190iMo9131b2 = abstractC3190iMo9131b.mo9131b(numValueOf, Integer.valueOf(i11), this.f48819h.f48967R ? C9496e.f48797j.mo9119c() : C9496e.f48798k).mo9132c(this.f48814P, aVar.f48814P).mo9132c(this.f48815Q, aVar.f48815Q).mo9131b(Integer.valueOf(this.f48810L), Integer.valueOf(aVar.f48810L), objMo9119c).mo9131b(Integer.valueOf(this.f48811M), Integer.valueOf(aVar.f48811M), objMo9119c);
            Integer numValueOf2 = Integer.valueOf(i10);
            Integer numValueOf3 = Integer.valueOf(i11);
            if (!C10134c0.m19034a(this.f48818g, aVar.f48818g)) {
                objMo9119c = C9496e.f48798k;
            }
            return abstractC3190iMo9131b2.mo9131b(numValueOf2, numValueOf3, objMo9119c).mo9134e();
        }
    }

    /* JADX INFO: renamed from: ua.e$b */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a */
        public final boolean f48824a;

        /* JADX INFO: renamed from: b */
        public final boolean f48825b;

        public b(C2416m c2416m, int i10) {
            boolean z10 = true;
            if ((c2416m.f12476d & 1) == 0) {
                z10 = false;
            }
            this.f48824a = z10;
            this.f48825b = C9496e.m17937i(i10, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return AbstractC3190i.f16159a.mo9132c(this.f48825b, bVar2.f48825b).mo9132c(this.f48824a, bVar2.f48824a).mo9134e();
        }
    }

    /* JADX INFO: renamed from: ua.e$c */
    public static final class c extends C9508q {

        /* JADX INFO: renamed from: L0 */
        public static final c f48826L0 = new c(new a());

        /* JADX INFO: renamed from: M0 */
        public static final String f48827M0 = C10134c0.m19021F(1000);

        /* JADX INFO: renamed from: N0 */
        public static final String f48828N0 = C10134c0.m19021F(1001);

        /* JADX INFO: renamed from: O0 */
        public static final String f48829O0 = C10134c0.m19021F(1002);

        /* JADX INFO: renamed from: P0 */
        public static final String f48830P0 = C10134c0.m19021F(1003);

        /* JADX INFO: renamed from: Q0 */
        public static final String f48831Q0 = C10134c0.m19021F(1004);

        /* JADX INFO: renamed from: R0 */
        public static final String f48832R0 = C10134c0.m19021F(1005);

        /* JADX INFO: renamed from: S0 */
        public static final String f48833S0 = C10134c0.m19021F(1006);

        /* JADX INFO: renamed from: T0 */
        public static final String f48834T0 = C10134c0.m19021F(1007);

        /* JADX INFO: renamed from: U0 */
        public static final String f48835U0 = C10134c0.m19021F(1008);

        /* JADX INFO: renamed from: V0 */
        public static final String f48836V0 = C10134c0.m19021F(1009);

        /* JADX INFO: renamed from: W0 */
        public static final String f48837W0 = C10134c0.m19021F(1010);

        /* JADX INFO: renamed from: X0 */
        public static final String f48838X0 = C10134c0.m19021F(1011);

        /* JADX INFO: renamed from: Y0 */
        public static final String f48839Y0 = C10134c0.m19021F(1012);

        /* JADX INFO: renamed from: Z0 */
        public static final String f48840Z0 = C10134c0.m19021F(1013);

        /* JADX INFO: renamed from: a1 */
        public static final String f48841a1 = C10134c0.m19021F(1014);

        /* JADX INFO: renamed from: b1 */
        public static final String f48842b1 = C10134c0.m19021F(1015);

        /* JADX INFO: renamed from: c1 */
        public static final String f48843c1 = C10134c0.m19021F(1016);

        /* JADX INFO: renamed from: A0 */
        public final boolean f48844A0;

        /* JADX INFO: renamed from: B0 */
        public final boolean f48845B0;

        /* JADX INFO: renamed from: C0 */
        public final boolean f48846C0;

        /* JADX INFO: renamed from: D0 */
        public final boolean f48847D0;

        /* JADX INFO: renamed from: E0 */
        public final boolean f48848E0;

        /* JADX INFO: renamed from: F0 */
        public final boolean f48849F0;

        /* JADX INFO: renamed from: G0 */
        public final boolean f48850G0;

        /* JADX INFO: renamed from: H0 */
        public final boolean f48851H0;

        /* JADX INFO: renamed from: I0 */
        public final boolean f48852I0;

        /* JADX INFO: renamed from: J0 */
        public final SparseArray<Map<C5736s, d>> f48853J0;

        /* JADX INFO: renamed from: K0 */
        public final SparseBooleanArray f48854K0;

        /* JADX INFO: renamed from: w0 */
        public final boolean f48855w0;

        /* JADX INFO: renamed from: x0 */
        public final boolean f48856x0;

        /* JADX INFO: renamed from: y0 */
        public final boolean f48857y0;

        /* JADX INFO: renamed from: z0 */
        public final boolean f48858z0;

        /* JADX INFO: renamed from: ua.e$c$a */
        public static final class a extends C9508q.a {

            /* JADX INFO: renamed from: A */
            public boolean f48859A;

            /* JADX INFO: renamed from: B */
            public boolean f48860B;

            /* JADX INFO: renamed from: C */
            public boolean f48861C;

            /* JADX INFO: renamed from: D */
            public boolean f48862D;

            /* JADX INFO: renamed from: E */
            public boolean f48863E;

            /* JADX INFO: renamed from: F */
            public boolean f48864F;

            /* JADX INFO: renamed from: G */
            public boolean f48865G;

            /* JADX INFO: renamed from: H */
            public boolean f48866H;

            /* JADX INFO: renamed from: I */
            public boolean f48867I;

            /* JADX INFO: renamed from: J */
            public boolean f48868J;

            /* JADX INFO: renamed from: K */
            public boolean f48869K;

            /* JADX INFO: renamed from: L */
            public boolean f48870L;

            /* JADX INFO: renamed from: M */
            public boolean f48871M;

            /* JADX INFO: renamed from: N */
            public final SparseArray<Map<C5736s, d>> f48872N;

            /* JADX INFO: renamed from: O */
            public final SparseBooleanArray f48873O;

            @Deprecated
            public a() {
                this.f48872N = new SparseArray<>();
                this.f48873O = new SparseBooleanArray();
                m17956i();
            }

            public a(Context context) {
                m17957j(context);
                m17958k(context);
                this.f48872N = new SparseArray<>();
                this.f48873O = new SparseBooleanArray();
                m17956i();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Bundle bundle) {
                SparseArray sparseArray;
                SparseBooleanArray sparseBooleanArray;
                super(bundle);
                m17956i();
                c cVar = c.f48826L0;
                this.f48859A = bundle.getBoolean(c.f48827M0, cVar.f48855w0);
                this.f48860B = bundle.getBoolean(c.f48828N0, cVar.f48856x0);
                this.f48861C = bundle.getBoolean(c.f48829O0, cVar.f48857y0);
                this.f48862D = bundle.getBoolean(c.f48841a1, cVar.f48858z0);
                this.f48863E = bundle.getBoolean(c.f48830P0, cVar.f48844A0);
                this.f48864F = bundle.getBoolean(c.f48831Q0, cVar.f48845B0);
                this.f48865G = bundle.getBoolean(c.f48832R0, cVar.f48846C0);
                this.f48866H = bundle.getBoolean(c.f48833S0, cVar.f48847D0);
                this.f48867I = bundle.getBoolean(c.f48842b1, cVar.f48848E0);
                this.f48868J = bundle.getBoolean(c.f48843c1, cVar.f48849F0);
                this.f48869K = bundle.getBoolean(c.f48834T0, cVar.f48850G0);
                this.f48870L = bundle.getBoolean(c.f48835U0, cVar.f48851H0);
                this.f48871M = bundle.getBoolean(c.f48836V0, cVar.f48852I0);
                this.f48872N = new SparseArray<>();
                int[] intArray = bundle.getIntArray(c.f48837W0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(c.f48838X0);
                ImmutableList immutableListM9062Y = parcelableArrayList == null ? ImmutableList.m9062Y() : C10131b.m19007a(C5736s.f34807f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(c.f48839Y0);
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    C8002l c8002l = d.f48877g;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i10 = 0; i10 < sparseParcelableArray.size(); i10++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i10), c8002l.mo7014g((Bundle) sparseParcelableArray.valueAt(i10)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray != null && intArray.length == immutableListM9062Y.size()) {
                    for (int i11 = 0; i11 < intArray.length; i11++) {
                        int i12 = intArray[i11];
                        C5736s c5736s = (C5736s) immutableListM9062Y.get(i11);
                        d dVar = (d) sparseArray.get(i11);
                        SparseArray<Map<C5736s, d>> sparseArray3 = this.f48872N;
                        Map<C5736s, d> map = sparseArray3.get(i12);
                        if (map == null) {
                            map = new HashMap<>();
                            sparseArray3.put(i12, map);
                        }
                        if (!map.containsKey(c5736s) || !C10134c0.m19034a(map.get(c5736s), dVar)) {
                            map.put(c5736s, dVar);
                        }
                    }
                }
                int[] intArray2 = bundle.getIntArray(c.f48840Z0);
                if (intArray2 == null) {
                    sparseBooleanArray = new SparseBooleanArray();
                } else {
                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray2.length);
                    for (int i13 : intArray2) {
                        sparseBooleanArray2.append(i13, true);
                    }
                    sparseBooleanArray = sparseBooleanArray2;
                }
                this.f48873O = sparseBooleanArray;
            }

            public a(c cVar) {
                super(cVar);
                this.f48859A = cVar.f48855w0;
                this.f48860B = cVar.f48856x0;
                this.f48861C = cVar.f48857y0;
                this.f48862D = cVar.f48858z0;
                this.f48863E = cVar.f48844A0;
                this.f48864F = cVar.f48845B0;
                this.f48865G = cVar.f48846C0;
                this.f48866H = cVar.f48847D0;
                this.f48867I = cVar.f48848E0;
                this.f48868J = cVar.f48849F0;
                this.f48869K = cVar.f48850G0;
                this.f48870L = cVar.f48851H0;
                this.f48871M = cVar.f48852I0;
                SparseArray<Map<C5736s, d>> sparseArray = new SparseArray<>();
                int i10 = 0;
                while (true) {
                    SparseArray<Map<C5736s, d>> sparseArray2 = cVar.f48853J0;
                    if (i10 >= sparseArray2.size()) {
                        this.f48872N = sparseArray;
                        this.f48873O = cVar.f48854K0.clone();
                        return;
                    } else {
                        sparseArray.put(sparseArray2.keyAt(i10), new HashMap(sparseArray2.valueAt(i10)));
                        i10++;
                    }
                }
            }

            @Override // ua.C9508q.a
            /* JADX INFO: renamed from: a */
            public final C9508q mo17950a() {
                return new c(this);
            }

            @Override // ua.C9508q.a
            /* JADX INFO: renamed from: b */
            public final C9508q.a mo17951b(int i10) {
                super.mo17951b(i10);
                return this;
            }

            @Override // ua.C9508q.a
            /* JADX INFO: renamed from: e */
            public final C9508q.a mo17952e() {
                this.f49003u = -3;
                return this;
            }

            @Override // ua.C9508q.a
            /* JADX INFO: renamed from: f */
            public final C9508q.a mo17953f(C9507p c9507p) {
                super.mo17953f(c9507p);
                return this;
            }

            @Override // ua.C9508q.a
            /* JADX INFO: renamed from: g */
            public final C9508q.a mo17954g(int i10) {
                super.mo17954g(i10);
                return this;
            }

            @Override // ua.C9508q.a
            /* JADX INFO: renamed from: h */
            public final C9508q.a mo17955h(int i10, int i11) {
                super.mo17955h(i10, i11);
                return this;
            }

            /* JADX INFO: renamed from: i */
            public final void m17956i() {
                this.f48859A = true;
                this.f48860B = false;
                this.f48861C = true;
                this.f48862D = false;
                this.f48863E = true;
                this.f48864F = false;
                this.f48865G = false;
                this.f48866H = false;
                this.f48867I = false;
                this.f48868J = true;
                this.f48869K = true;
                this.f48870L = false;
                this.f48871M = true;
            }

            /* JADX INFO: renamed from: j */
            public final void m17957j(Context context) {
                CaptioningManager captioningManager;
                int i10 = C10134c0.f51354a;
                if (i10 >= 19) {
                    if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                        this.f49002t = 1088;
                        Locale locale = captioningManager.getLocale();
                        if (locale != null) {
                            this.f49001s = ImmutableList.m9064b0(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
                        }
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00da  */
            /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
            /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:43:0x0102  */
            /* JADX INFO: renamed from: k */
            public final void m17958k(Context context) {
                Point point;
                DisplayManager displayManager;
                int i10 = C10134c0.f51354a;
                Display display = (i10 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && C10134c0.m19024I(context)) {
                    String strM19059z = i10 < 28 ? C10134c0.m19059z("sys.display-size") : C10134c0.m19059z("vendor.display-size");
                    if (!TextUtils.isEmpty(strM19059z)) {
                        try {
                            String[] strArrSplit = strM19059z.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i11 = Integer.parseInt(strArrSplit[0]);
                                int i12 = Integer.parseInt(strArrSplit[1]);
                                if (i11 > 0 && i12 > 0) {
                                    point = new Point(i11, i12);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        C10145n.m19095c("Util", "Invalid display size: " + strM19059z);
                        if (!"Sony".equals(C10134c0.f51356c) && C10134c0.f51357d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            point = new Point(3840, 2160);
                        } else {
                            point = new Point();
                            if (i10 >= 23) {
                                Display.Mode mode = display.getMode();
                                point.x = mode.getPhysicalWidth();
                                point.y = mode.getPhysicalHeight();
                            } else if (i10 >= 17) {
                                display.getRealSize(point);
                            } else {
                                display.getSize(point);
                            }
                        }
                    } else if (!"Sony".equals(C10134c0.f51356c)) {
                        point = new Point();
                        if (i10 >= 23) {
                            Display.Mode mode2 = display.getMode();
                            point.x = mode2.getPhysicalWidth();
                            point.y = mode2.getPhysicalHeight();
                        } else if (i10 >= 17) {
                            display.getRealSize(point);
                        } else {
                            display.getSize(point);
                        }
                    } else {
                        point = new Point();
                        if (i10 >= 23) {
                            Display.Mode mode3 = display.getMode();
                            point.x = mode3.getPhysicalWidth();
                            point.y = mode3.getPhysicalHeight();
                        } else if (i10 >= 17) {
                            display.getRealSize(point);
                        } else {
                            display.getSize(point);
                        }
                    }
                } else {
                    point = new Point();
                    if (i10 >= 23) {
                        Display.Mode mode4 = display.getMode();
                        point.x = mode4.getPhysicalWidth();
                        point.y = mode4.getPhysicalHeight();
                    } else if (i10 >= 17) {
                        display.getRealSize(point);
                    } else {
                        display.getSize(point);
                    }
                }
                mo17955h(point.x, point.y);
            }
        }

        public c(a aVar) {
            super(aVar);
            this.f48855w0 = aVar.f48859A;
            this.f48856x0 = aVar.f48860B;
            this.f48857y0 = aVar.f48861C;
            this.f48858z0 = aVar.f48862D;
            this.f48844A0 = aVar.f48863E;
            this.f48845B0 = aVar.f48864F;
            this.f48846C0 = aVar.f48865G;
            this.f48847D0 = aVar.f48866H;
            this.f48848E0 = aVar.f48867I;
            this.f48849F0 = aVar.f48868J;
            this.f48850G0 = aVar.f48869K;
            this.f48851H0 = aVar.f48870L;
            this.f48852I0 = aVar.f48871M;
            this.f48853J0 = aVar.f48872N;
            this.f48854K0 = aVar.f48873O;
        }

        @Override // ua.C9508q
        /* JADX INFO: renamed from: a */
        public final C9508q.a mo17949a() {
            return new a(this);
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00af  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:72:0x012a A[LOOP:0: B:55:0x00c4->B:72:0x012a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:80:0x00c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x012f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0126 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
        @Override // ua.C9508q
        public final boolean equals(Object obj) {
            boolean z10;
            SparseArray<Map<C5736s, d>> sparseArray;
            int size;
            SparseArray<Map<C5736s, d>> sparseArray2;
            int i10;
            boolean z11;
            int iIndexOfKey;
            Map<C5736s, d> mapValueAt;
            Map<C5736s, d> mapValueAt2;
            Iterator<Map.Entry<C5736s, d>> it;
            boolean z12;
            C5736s key;
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (super.equals(cVar) && this.f48855w0 == cVar.f48855w0 && this.f48856x0 == cVar.f48856x0 && this.f48857y0 == cVar.f48857y0 && this.f48858z0 == cVar.f48858z0 && this.f48844A0 == cVar.f48844A0 && this.f48845B0 == cVar.f48845B0 && this.f48846C0 == cVar.f48846C0 && this.f48847D0 == cVar.f48847D0 && this.f48848E0 == cVar.f48848E0 && this.f48849F0 == cVar.f48849F0 && this.f48850G0 == cVar.f48850G0 && this.f48851H0 == cVar.f48851H0 && this.f48852I0 == cVar.f48852I0) {
                    SparseBooleanArray sparseBooleanArray = this.f48854K0;
                    int size2 = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = cVar.f48854K0;
                    if (sparseBooleanArray2.size() == size2) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size2) {
                                z10 = true;
                                break;
                            }
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i11)) >= 0) {
                                i11++;
                            }
                        }
                        if (z10) {
                            sparseArray = this.f48853J0;
                            size = sparseArray.size();
                            sparseArray2 = cVar.f48853J0;
                            if (sparseArray2.size() != size) {
                                i10 = 0;
                                while (true) {
                                    if (i10 >= size) {
                                        z11 = true;
                                        break;
                                    }
                                    iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                    if (iIndexOfKey >= 0) {
                                        mapValueAt = sparseArray.valueAt(i10);
                                        mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                        if (mapValueAt2.size() != mapValueAt.size()) {
                                            it = mapValueAt.entrySet().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    z12 = true;
                                                    break;
                                                }
                                                Map.Entry<C5736s, d> next = it.next();
                                                key = next.getKey();
                                                if (mapValueAt2.containsKey(key) || !C10134c0.m19034a(next.getValue(), mapValueAt2.get(key))) {
                                                }
                                            }
                                            if (!z12) {
                                                i10++;
                                            }
                                        }
                                        z12 = false;
                                        if (!z12) {
                                            i10++;
                                        }
                                    }
                                }
                                if (z11) {
                                    return true;
                                }
                            }
                            z11 = false;
                            if (z11) {
                                return true;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        sparseArray = this.f48853J0;
                        size = sparseArray.size();
                        sparseArray2 = cVar.f48853J0;
                        if (sparseArray2.size() != size) {
                            i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    z11 = true;
                                    break;
                                }
                                iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                if (iIndexOfKey >= 0) {
                                    mapValueAt = sparseArray.valueAt(i10);
                                    mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() != mapValueAt.size()) {
                                        it = mapValueAt.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                z12 = true;
                                                break;
                                            }
                                            Map.Entry<C5736s, d> next2 = it.next();
                                            key = next2.getKey();
                                            if (mapValueAt2.containsKey(key)) {
                                            }
                                        }
                                        if (!z12) {
                                            i10++;
                                        }
                                    }
                                    z12 = false;
                                    if (!z12) {
                                        i10++;
                                    }
                                }
                            }
                            if (z11) {
                                return true;
                            }
                        }
                        z11 = false;
                        if (z11) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }

        @Override // ua.C9508q
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f48855w0 ? 1 : 0)) * 31) + (this.f48856x0 ? 1 : 0)) * 31) + (this.f48857y0 ? 1 : 0)) * 31) + (this.f48858z0 ? 1 : 0)) * 31) + (this.f48844A0 ? 1 : 0)) * 31) + (this.f48845B0 ? 1 : 0)) * 31) + (this.f48846C0 ? 1 : 0)) * 31) + (this.f48847D0 ? 1 : 0)) * 31) + (this.f48848E0 ? 1 : 0)) * 31) + (this.f48849F0 ? 1 : 0)) * 31) + (this.f48850G0 ? 1 : 0)) * 31) + (this.f48851H0 ? 1 : 0)) * 31) + (this.f48852I0 ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: ua.e$d */
    public static final class d implements InterfaceC2409f {

        /* JADX INFO: renamed from: d */
        public static final String f48874d = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: e */
        public static final String f48875e = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: f */
        public static final String f48876f = C10134c0.m19021F(2);

        /* JADX INFO: renamed from: g */
        public static final C8002l f48877g = new C8002l(16);

        /* JADX INFO: renamed from: a */
        public final int f48878a;

        /* JADX INFO: renamed from: b */
        public final int[] f48879b;

        /* JADX INFO: renamed from: c */
        public final int f48880c;

        public d(int i10, int i11, int[] iArr) {
            this.f48878a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f48879b = iArrCopyOf;
            this.f48880c = i11;
            Arrays.sort(iArrCopyOf);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f48878a == dVar.f48878a && Arrays.equals(this.f48879b, dVar.f48879b) && this.f48880c == dVar.f48880c;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f48879b) + (this.f48878a * 31)) * 31) + this.f48880c;
        }
    }

    /* JADX INFO: renamed from: ua.e$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final Spatializer f48881a;

        /* JADX INFO: renamed from: b */
        public final boolean f48882b;

        /* JADX INFO: renamed from: c */
        public Handler f48883c;

        /* JADX INFO: renamed from: d */
        public C9501j f48884d;

        public e(Spatializer spatializer) {
            this.f48881a = spatializer;
            this.f48882b = spatializer.getImmersiveAudioLevel() != 0;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17959a(C2416m c2416m, C2367a c2367a) {
            boolean zEquals = "audio/eac3-joc".equals(c2416m.f12484l);
            int i10 = c2416m.f12463T;
            if (zEquals && i10 == 16) {
                i10 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(C10134c0.m19046m(i10));
            int i11 = c2416m.f12464U;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f48881a.canBeSpatialized(c2367a.m6838a().f11944a, channelMask.build());
        }
    }

    /* JADX INFO: renamed from: ua.e$f */
    public static final class f extends g<f> implements Comparable<f> {

        /* JADX INFO: renamed from: H */
        public final boolean f48885H;

        /* JADX INFO: renamed from: e */
        public final int f48886e;

        /* JADX INFO: renamed from: f */
        public final boolean f48887f;

        /* JADX INFO: renamed from: g */
        public final boolean f48888g;

        /* JADX INFO: renamed from: h */
        public final boolean f48889h;

        /* JADX INFO: renamed from: i */
        public final int f48890i;

        /* JADX INFO: renamed from: j */
        public final int f48891j;

        /* JADX INFO: renamed from: k */
        public final int f48892k;

        /* JADX INFO: renamed from: l */
        public final int f48893l;

        /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
        public f(int i10, C5735r c5735r, int i11, c cVar, int i12, String str) {
            int iM17936h;
            boolean z10;
            super(i10, i11, c5735r);
            int i13 = 0;
            this.f48887f = C9496e.m17937i(i12, false);
            int i14 = this.f48897d.f12476d & (~cVar.f48965P);
            this.f48888g = (i14 & 1) != 0;
            this.f48889h = (i14 & 2) != 0;
            ImmutableList<String> immutableList = cVar.f48963N;
            ImmutableList<String> immutableListM9064b0 = immutableList.isEmpty() ? ImmutableList.m9064b0("") : immutableList;
            int i15 = 0;
            while (true) {
                if (i15 >= immutableListM9064b0.size()) {
                    iM17936h = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM17936h = C9496e.m17936h(this.f48897d, immutableListM9064b0.get(i15), cVar.f48966Q);
                    if (iM17936h > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f48890i = i15;
            this.f48891j = iM17936h;
            int i16 = this.f48897d.f12477e;
            int i17 = cVar.f48964O;
            int iBitCount = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
            this.f48892k = iBitCount;
            this.f48885H = (this.f48897d.f12477e & 1088) != 0;
            int iM17936h2 = C9496e.m17936h(this.f48897d, str, C9496e.m17938k(str) == null);
            this.f48893l = iM17936h2;
            if (iM17936h > 0 || (immutableList.isEmpty() && iBitCount > 0)) {
                z10 = true;
            } else if (this.f48888g || (this.f48889h && iM17936h2 > 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (C9496e.m17937i(i12, cVar.f48850G0) && z10) {
                i13 = 1;
            }
            this.f48886e = i13;
        }

        @Override // ua.C9496e.g
        /* JADX INFO: renamed from: a */
        public final int mo17946a() {
            return this.f48886e;
        }

        @Override // ua.C9496e.g
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ boolean mo17947f(g gVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            AbstractC3190i abstractC3190iMo9131b = AbstractC3190i.f16159a.mo9132c(this.f48887f, fVar.f48887f).mo9131b(Integer.valueOf(this.f48890i), Integer.valueOf(fVar.f48890i), AbstractC3177a0.m9124b().mo9119c());
            int i10 = this.f48891j;
            AbstractC3190i abstractC3190iMo9130a = abstractC3190iMo9131b.mo9130a(i10, fVar.f48891j);
            int i11 = this.f48892k;
            AbstractC3190i abstractC3190iMo9130a2 = abstractC3190iMo9130a.mo9130a(i11, fVar.f48892k).mo9132c(this.f48888g, fVar.f48888g).mo9131b(Boolean.valueOf(this.f48889h), Boolean.valueOf(fVar.f48889h), i10 == 0 ? AbstractC3177a0.m9124b() : AbstractC3177a0.m9124b().mo9119c()).mo9130a(this.f48893l, fVar.f48893l);
            if (i11 == 0) {
                abstractC3190iMo9130a2 = abstractC3190iMo9130a2.mo9133d(this.f48885H, fVar.f48885H);
            }
            return abstractC3190iMo9130a2.mo9134e();
        }
    }

    /* JADX INFO: renamed from: ua.e$g */
    public static abstract class g<T extends g<T>> {

        /* JADX INFO: renamed from: a */
        public final int f48894a;

        /* JADX INFO: renamed from: b */
        public final C5735r f48895b;

        /* JADX INFO: renamed from: c */
        public final int f48896c;

        /* JADX INFO: renamed from: d */
        public final C2416m f48897d;

        /* JADX INFO: renamed from: ua.e$g$a */
        public interface a<T extends g<T>> {
            /* JADX INFO: renamed from: b */
            List<T> mo10864b(int i10, C5735r c5735r, int[] iArr);
        }

        public g(int i10, int i11, C5735r c5735r) {
            this.f48894a = i10;
            this.f48895b = c5735r;
            this.f48896c = i11;
            this.f48897d = c5735r.f34803d[i11];
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo17946a();

        /* JADX INFO: renamed from: f */
        public abstract boolean mo17947f(T t10);
    }

    /* JADX INFO: renamed from: ua.e$h */
    public static final class h extends g<h> {

        /* JADX INFO: renamed from: H */
        public final boolean f48898H;

        /* JADX INFO: renamed from: I */
        public final boolean f48899I;

        /* JADX INFO: renamed from: J */
        public final int f48900J;

        /* JADX INFO: renamed from: K */
        public final boolean f48901K;

        /* JADX INFO: renamed from: L */
        public final boolean f48902L;

        /* JADX INFO: renamed from: M */
        public final int f48903M;

        /* JADX INFO: renamed from: e */
        public final boolean f48904e;

        /* JADX INFO: renamed from: f */
        public final c f48905f;

        /* JADX INFO: renamed from: g */
        public final boolean f48906g;

        /* JADX INFO: renamed from: h */
        public final boolean f48907h;

        /* JADX INFO: renamed from: i */
        public final int f48908i;

        /* JADX INFO: renamed from: j */
        public final int f48909j;

        /* JADX INFO: renamed from: k */
        public final int f48910k;

        /* JADX INFO: renamed from: l */
        public final int f48911l;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:33:0x0065  */
        /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:98:0x0145  */
        public h(int i10, C5735r c5735r, int i11, c cVar, int i12, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            int i14;
            boolean z13;
            int i15;
            C2416m c2416m;
            int i16;
            int i17;
            int i18;
            C2416m c2416m2;
            int i19;
            super(i10, i11, c5735r);
            this.f48905f = cVar;
            int i20 = cVar.f48857y0 ? 24 : 16;
            int i21 = 0;
            this.f48899I = cVar.f48856x0 && (i13 & i20) != 0;
            if (!z10 || ((i19 = (c2416m2 = this.f48897d).f12455L) != -1 && i19 > cVar.f48971a)) {
                z11 = false;
            } else {
                int i22 = c2416m2.f12456M;
                if (i22 == -1 || i22 <= cVar.f48972b) {
                    float f3 = c2416m2.f12457N;
                    if (f3 == -1.0f || f3 <= cVar.f48973c) {
                        int i23 = c2416m2.f12480h;
                        if (i23 == -1 || i23 <= cVar.f48974d) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            }
            this.f48904e = z11;
            if (!z10 || (((i16 = (c2416m = this.f48897d).f12455L) != -1 && i16 < cVar.f48975e) || ((i17 = c2416m.f12456M) != -1 && i17 < cVar.f48976f))) {
                z12 = false;
            } else {
                float f10 = c2416m.f12457N;
                if ((f10 == -1.0f || f10 >= cVar.f48977g) && ((i18 = c2416m.f12480h) == -1 || i18 >= cVar.f48978h)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f48906g = z12;
            this.f48907h = C9496e.m17937i(i12, false);
            C2416m c2416m3 = this.f48897d;
            this.f48908i = c2416m3.f12480h;
            int i24 = c2416m3.f12455L;
            this.f48909j = (i24 == -1 || (i15 = c2416m3.f12456M) == -1) ? -1 : i24 * i15;
            int i25 = c2416m3.f12477e;
            int i26 = Integer.MAX_VALUE;
            int i27 = cVar.f48957H;
            this.f48911l = (i25 == 0 || i25 != i27) ? Integer.bitCount(i25 & i27) : Integer.MAX_VALUE;
            int i28 = this.f48897d.f12477e;
            this.f48898H = i28 == 0 || (i28 & 1) != 0;
            int i29 = 0;
            while (true) {
                ImmutableList<String> immutableList = cVar.f48982l;
                if (i29 < immutableList.size()) {
                    String str = this.f48897d.f12484l;
                    if (str != null && str.equals(immutableList.get(i29))) {
                        i26 = i29;
                        break;
                    }
                    i29++;
                } else {
                    break;
                }
            }
            this.f48910k = i26;
            this.f48901K = (i12 & 384) == 128;
            this.f48902L = (i12 & 64) == 64;
            C2416m c2416m4 = this.f48897d;
            String str2 = c2416m4.f12484l;
            if (str2 != null) {
                i14 = 3;
                switch (str2) {
                    case "video/dolby-vision":
                        i14 = 5;
                        break;
                    case "video/av01":
                        i14 = 4;
                        break;
                    case "video/hevc":
                        break;
                    case "video/avc":
                        i14 = 1;
                        break;
                    case "video/x-vnd.on2.vp9":
                        i14 = 2;
                        break;
                    default:
                        i14 = 0;
                        break;
                }
            } else {
                i14 = 0;
            }
            this.f48903M = i14;
            if ((c2416m4.f12477e & 16384) == 0) {
                c cVar2 = this.f48905f;
                if (C9496e.m17937i(i12, cVar2.f48850G0) && ((z13 = this.f48904e) || cVar2.f48855w0)) {
                    i21 = (!C9496e.m17937i(i12, false) || !this.f48906g || !z13 || c2416m4.f12480h == -1 || cVar2.f48968S || cVar2.f48967R || (i20 & i12) == 0) ? 1 : 2;
                }
            }
            this.f48900J = i21;
        }

        /* JADX INFO: renamed from: g */
        public static int m17961g(h hVar, h hVar2) {
            AbstractC3190i abstractC3190iMo9131b = AbstractC3190i.f16159a.mo9132c(hVar.f48907h, hVar2.f48907h).mo9130a(hVar.f48911l, hVar2.f48911l).mo9132c(hVar.f48898H, hVar2.f48898H).mo9132c(hVar.f48904e, hVar2.f48904e).mo9132c(hVar.f48906g, hVar2.f48906g).mo9131b(Integer.valueOf(hVar.f48910k), Integer.valueOf(hVar2.f48910k), AbstractC3177a0.m9124b().mo9119c());
            boolean z10 = hVar2.f48901K;
            boolean z11 = hVar.f48901K;
            AbstractC3190i abstractC3190iMo9132c = abstractC3190iMo9131b.mo9132c(z11, z10);
            boolean z12 = hVar2.f48902L;
            boolean z13 = hVar.f48902L;
            AbstractC3190i abstractC3190iMo9132c2 = abstractC3190iMo9132c.mo9132c(z13, z12);
            if (z11 && z13) {
                abstractC3190iMo9132c2 = abstractC3190iMo9132c2.mo9130a(hVar.f48903M, hVar2.f48903M);
            }
            return abstractC3190iMo9132c2.mo9134e();
        }

        /* JADX INFO: renamed from: i */
        public static int m17962i(h hVar, h hVar2) {
            Object objMo9119c = (hVar.f48904e && hVar.f48907h) ? C9496e.f48797j : C9496e.f48797j.mo9119c();
            AbstractC3190i.a aVar = AbstractC3190i.f16159a;
            int i10 = hVar.f48908i;
            return aVar.mo9131b(Integer.valueOf(i10), Integer.valueOf(hVar2.f48908i), hVar.f48905f.f48967R ? C9496e.f48797j.mo9119c() : C9496e.f48798k).mo9131b(Integer.valueOf(hVar.f48909j), Integer.valueOf(hVar2.f48909j), objMo9119c).mo9131b(Integer.valueOf(i10), Integer.valueOf(hVar2.f48908i), objMo9119c).mo9134e();
        }

        @Override // ua.C9496e.g
        /* JADX INFO: renamed from: a */
        public final int mo17946a() {
            return this.f48900J;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if (r6.f48902L == r7.f48902L) goto L16;
         */
        @Override // ua.C9496e.g
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo17947f(g gVar) {
            h hVar = (h) gVar;
            if (this.f48899I || C10134c0.m19034a(this.f48897d.f12484l, hVar.f48897d.f12484l)) {
                if (!this.f48905f.f48858z0) {
                    if (this.f48901K == hVar.f48901K) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    static {
        int i10 = 3;
        f48797j = AbstractC3177a0.m9123a(new C9384d(i10));
        f48798k = AbstractC3177a0.m9123a(new C7461h(i10));
    }

    public C9496e(Context context, C9492a.b bVar) {
        c cVar = c.f48826L0;
        c cVar2 = new c(new c.a(context));
        this.f48799c = new Object();
        this.f48800d = context != null ? context.getApplicationContext() : null;
        this.f48801e = bVar;
        this.f48803g = cVar2;
        this.f48805i = C2367a.f11937g;
        boolean z10 = context != null && C10134c0.m19024I(context);
        this.f48802f = z10;
        if (!z10 && context != null && C10134c0.f51354a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f48804h = audioManager != null ? new e(audioManager.getSpatializer()) : null;
        }
        if (this.f48803g.f48849F0 && context == null) {
            C10145n.m19099g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m17935g(C5736s c5736s, c cVar, HashMap map) {
        for (int i10 = 0; i10 < c5736s.f34808a; i10++) {
            C9507p c9507p = cVar.f48969T.get(c5736s.m12091a(i10));
            if (c9507p != null) {
                C5735r c5735r = c9507p.f48928a;
                C9507p c9507p2 = (C9507p) map.get(Integer.valueOf(c5735r.f34802c));
                if (c9507p2 == null || (c9507p2.f48929b.isEmpty() && !c9507p.f48929b.isEmpty())) {
                    map.put(Integer.valueOf(c5735r.f34802c), c9507p);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m17936h(C2416m c2416m, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c2416m.f12474c)) {
            return 4;
        }
        String strM17938k = m17938k(str);
        String strM17938k2 = m17938k(c2416m.f12474c);
        if (strM17938k2 != null && strM17938k != null) {
            if (!strM17938k2.startsWith(strM17938k) && !strM17938k.startsWith(strM17938k2)) {
                int i10 = C10134c0.f51354a;
                return strM17938k2.split("-", 2)[0].equals(strM17938k.split("-", 2)[0]) ? 2 : 0;
            }
            return 3;
        }
        return (z10 && strM17938k2 == null) ? 1 : 0;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17937i(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    /* JADX INFO: renamed from: k */
    public static String m17938k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static Pair m17939l(int i10, AbstractC9504m.a aVar, int[][][] iArr, g.a aVar2, Comparator comparator) {
        C5736s c5736s;
        RandomAccess randomAccessM9064b0;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < aVar.f48917a; i11++) {
            if (i10 == aVar.f48918b[i11]) {
                C5736s c5736s2 = aVar.f48919c[i11];
                for (int i12 = 0; i12 < c5736s2.f34808a; i12++) {
                    C5735r c5735rM12091a = c5736s2.m12091a(i12);
                    List listMo10864b = aVar2.mo10864b(i11, c5735rM12091a, iArr[i11][i12]);
                    boolean[] zArr = new boolean[c5735rM12091a.f34800a];
                    int i13 = 0;
                    while (true) {
                        int i14 = c5735rM12091a.f34800a;
                        if (i13 < i14) {
                            g gVar = (g) listMo10864b.get(i13);
                            int iMo17946a = gVar.mo17946a();
                            if (zArr[i13] || iMo17946a == 0) {
                                c5736s = c5736s2;
                            } else {
                                if (iMo17946a == 1) {
                                    randomAccessM9064b0 = ImmutableList.m9064b0(gVar);
                                    c5736s = c5736s2;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(gVar);
                                    int i15 = i13 + 1;
                                    while (i15 < i14) {
                                        g gVar2 = (g) listMo10864b.get(i15);
                                        C5736s c5736s3 = c5736s2;
                                        if (gVar2.mo17946a() == 2 && gVar.mo17947f(gVar2)) {
                                            arrayList2.add(gVar2);
                                            z10 = true;
                                            zArr[i15] = true;
                                        } else {
                                            z10 = true;
                                        }
                                        i15++;
                                        c5736s2 = c5736s3;
                                    }
                                    c5736s = c5736s2;
                                    randomAccessM9064b0 = arrayList2;
                                }
                                arrayList.add(randomAccessM9064b0);
                            }
                            i13++;
                            c5736s2 = c5736s;
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((g) list.get(i16)).f48896c;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new InterfaceC9502k.a(0, gVar3.f48895b, iArr2), Integer.valueOf(gVar3.f48894a));
    }

    @Override // ua.AbstractC9510s
    /* JADX INFO: renamed from: a */
    public final C9508q mo17940a() {
        c cVar;
        synchronized (this.f48799c) {
            cVar = this.f48803g;
        }
        return cVar;
    }

    @Override // ua.AbstractC9510s
    /* JADX INFO: renamed from: c */
    public final void mo17941c() {
        e eVar;
        C9501j c9501j;
        synchronized (this.f48799c) {
            try {
                if (C10134c0.f51354a >= 32 && (eVar = this.f48804h) != null && (c9501j = eVar.f48884d) != null && eVar.f48883c != null) {
                    eVar.f48881a.removeOnSpatializerStateChangedListener(c9501j);
                    eVar.f48883c.removeCallbacksAndMessages(null);
                    eVar.f48883c = null;
                    eVar.f48884d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.mo17941c();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ua.AbstractC9510s
    /* JADX INFO: renamed from: e */
    public final void mo17942e(C2367a c2367a) {
        boolean z10;
        synchronized (this.f48799c) {
            z10 = !this.f48805i.equals(c2367a);
            this.f48805i = c2367a;
        }
        if (z10) {
            m17944j();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ua.AbstractC9510s
    /* JADX INFO: renamed from: f */
    public final void mo17943f(C9508q c9508q) {
        c cVar;
        if (c9508q instanceof c) {
            m17945m((c) c9508q);
        }
        synchronized (this.f48799c) {
            try {
                cVar = this.f48803g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c.a aVar = new c.a(cVar);
        aVar.m17974c(c9508q);
        m17945m(new c(aVar));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m17944j() {
        boolean z10;
        AbstractC9510s.a aVar;
        e eVar;
        synchronized (this.f48799c) {
            try {
                z10 = this.f48803g.f48849F0 && !this.f48802f && C10134c0.f51354a >= 32 && (eVar = this.f48804h) != null && eVar.f48882b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (aVar = this.f49009a) == null) {
            return;
        }
        ((C2415l) aVar).f12383h.mo19083i(10);
    }

    /* JADX INFO: renamed from: m */
    public final void m17945m(c cVar) {
        boolean z10;
        cVar.getClass();
        synchronized (this.f48799c) {
            z10 = !this.f48803g.equals(cVar);
            this.f48803g = cVar;
        }
        if (z10) {
            if (cVar.f48849F0 && this.f48800d == null) {
                C10145n.m19099g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            AbstractC9510s.a aVar = this.f49009a;
            if (aVar != null) {
                ((C2415l) aVar).f12383h.mo19083i(10);
            }
        }
    }
}
