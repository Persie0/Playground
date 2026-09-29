package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C0713b;
import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.AbstractC1110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i92 {

    /* JADX INFO: renamed from: k */
    public static final AbstractC1104t f43726k = AbstractC1104t.m6349b(new C3835zj(5));

    /* JADX INFO: renamed from: a */
    public rw2 f43727a;

    /* JADX INFO: renamed from: b */
    public u52 f43728b;

    /* JADX INFO: renamed from: c */
    public final Object f43729c;

    /* JADX INFO: renamed from: d */
    public final Context f43730d;

    /* JADX INFO: renamed from: e */
    public final a3d f43731e;

    /* JADX INFO: renamed from: f */
    public d92 f43732f;

    /* JADX INFO: renamed from: g */
    public Thread f43733g;

    /* JADX INFO: renamed from: h */
    public nc0 f43734h;

    /* JADX INFO: renamed from: i */
    public C3476px f43735i;

    /* JADX INFO: renamed from: j */
    public Boolean f43736j;

    public i92(Context context) {
        a3d a3dVar = new a3d();
        d92 d92Var = d92.f35197F;
        this.f43729c = new Object();
        this.f43730d = context.getApplicationContext();
        this.f43731e = a3dVar;
        if (d92Var != null) {
            this.f43732f = d92Var;
        } else {
            d92Var.getClass();
            c92 c92Var = new c92(d92Var);
            c92Var.m20447a(d92Var);
            this.f43732f = new d92(c92Var);
        }
        this.f43735i = C3476px.f56934c;
        boolean z = this.f43732f.f35198A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static int m13723a(C0713b c0713b, ImmutableList immutableList) {
        for (int i = 0; i < immutableList.size(); i++) {
            for (int i2 = 0; i2 < c0713b.f6394c.size(); i2++) {
                if (((al4) c0713b.f6394c.get(i2)).f802b.equals(immutableList.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    public static void m13724b(dq5 dq5Var, d92 d92Var, sw2[] sw2VarArr) {
        int iM10580a = dq5Var.m10580a();
        for (int i = 0; i < iM10580a; i++) {
            k8a k8aVarM10582c = dq5Var.m10582c(i);
            Map map = (Map) d92Var.f35201D.get(i);
            if (map != null && map.containsKey(k8aVarM10582c)) {
                Map map2 = (Map) d92Var.f35201D.get(i);
                if (map2 != null) {
                    g9a.m12435l(map2.get(k8aVarM10582c));
                }
                sw2VarArr[i] = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m13725c(dq5 dq5Var, d92 d92Var, sw2[] sw2VarArr) {
        for (int i = 0; i < dq5Var.m10580a(); i++) {
            int iM10581b = dq5Var.m10581b(i);
            if (d92Var.f35202E.get(i) || d92Var.f60540v.contains(Integer.valueOf(iM10581b))) {
                sw2VarArr[i] = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX INFO: renamed from: d */
    public static void m13726d(dq5 dq5Var, d92 d92Var, sw2[] sw2VarArr) {
        sw2 sw2Var;
        int iM10580a = dq5Var.m10580a();
        HashMap map = new HashMap();
        for (int i = 0; i < iM10580a; i++) {
            m13727e(dq5Var.m10582c(i), d92Var, map);
        }
        m13727e(dq5Var.m10583d(), d92Var, map);
        for (int i2 = 0; i2 < iM10580a; i2++) {
            p8a p8aVar = (p8a) map.get(Integer.valueOf(dq5Var.m10581b(i2)));
            if (p8aVar != null) {
                j8a j8aVar = p8aVar.f55768a;
                ImmutableList immutableList = p8aVar.f55769b;
                if (immutableList.isEmpty()) {
                    sw2Var = null;
                } else {
                    int iIndexOf = dq5Var.m10582c(i2).f46869b.indexOf(j8aVar);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        sw2Var = new sw2(j8aVar, AbstractC1110a.m6365e(immutableList));
                    } else {
                        sw2Var = null;
                    }
                }
                sw2VarArr[i2] = sw2Var;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13727e(k8a k8aVar, s8a s8aVar, HashMap map) {
        p8a p8aVar;
        for (int i = 0; i < k8aVar.f46868a; i++) {
            p8a p8aVar2 = (p8a) s8aVar.f60539u.get(k8aVar.m15003a(i));
            if (p8aVar2 != null && ((p8aVar = (p8a) map.get(Integer.valueOf(p8aVar2.m18977a()))) == null || (p8aVar.f55769b.isEmpty() && !p8aVar2.f55769b.isEmpty()))) {
                map.put(Integer.valueOf(p8aVar2.m18977a()), p8aVar2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Pair m13728f(sw2[] sw2VarArr, int i) {
        for (int i2 = 0; i2 < sw2VarArr.length; i2++) {
            sw2 sw2Var = sw2VarArr[i2];
            if (sw2Var != null && sw2Var.f61508a.f45216c == i) {
                return Pair.create(sw2Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static int m13729g(C0713b c0713b, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c0713b.f6395d)) {
            return 4;
        }
        String strM13730i = m13730i(str);
        String strM13730i2 = m13730i(c0713b.f6395d);
        if (strM13730i2 == null || strM13730i == null) {
            return (z && strM13730i2 == null) ? 1 : 0;
        }
        if (strM13730i2.startsWith(strM13730i) || strM13730i.startsWith(strM13730i2)) {
            return 3;
        }
        String str2 = uma.f64080a;
        return strM13730i2.split("-", 2)[0].equals(strM13730i.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: i */
    public static String m13730i(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static sw2 m13731k(k8a k8aVar, int[][] iArr, d92 d92Var) {
        d92Var.f60535q.getClass();
        j8a j8aVar = null;
        b92 b92Var = null;
        int i = 0;
        for (int i2 = 0; i2 < k8aVar.f46868a; i2++) {
            j8a j8aVarM15003a = k8aVar.m15003a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < j8aVarM15003a.f45214a; i3++) {
                if (y90.m24989n(iArr2[i3], d92Var.f35199B)) {
                    b92 b92Var2 = new b92(j8aVarM15003a.m14328a(i3), iArr2[i3]);
                    if (b92Var == null || b92Var2.compareTo(b92Var) > 0) {
                        j8aVar = j8aVarM15003a;
                        i = i3;
                        b92Var = b92Var2;
                    }
                }
            }
        }
        if (j8aVar == null) {
            return null;
        }
        return new sw2(j8aVar, i);
    }

    /* JADX INFO: renamed from: l */
    public static Pair m13732l(int i, dq5 dq5Var, int[][][] iArr, f92 f92Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM6291y;
        dq5 dq5Var2 = dq5Var;
        ArrayList arrayList = new ArrayList();
        int iM10580a = dq5Var2.m10580a();
        int i3 = 0;
        while (i3 < iM10580a) {
            if (i == dq5Var2.m10581b(i3)) {
                k8a k8aVarM10582c = dq5Var2.m10582c(i3);
                for (int i4 = 0; i4 < k8aVarM10582c.f46868a; i4++) {
                    j8a j8aVarM15003a = k8aVarM10582c.m15003a(i4);
                    List listMo394i = f92Var.mo394i(i3, j8aVarM15003a, iArr[i3][i4]);
                    int i5 = j8aVarM15003a.f45214a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        g92 g92Var = (g92) listMo394i.get(i6);
                        int iMo186a = g92Var.mo186a();
                        if (zArr[i6] || iMo186a == 0) {
                            i2 = iM10580a;
                        } else {
                            if (iMo186a == 1) {
                                randomAccessM6291y = ImmutableList.m6291y(g92Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(g92Var);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    g92 g92Var2 = (g92) listMo394i.get(i7);
                                    int i8 = iM10580a;
                                    if (g92Var2.mo186a() == 2 && g92Var.mo187b(g92Var2)) {
                                        arrayList2.add(g92Var2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iM10580a = i8;
                                }
                                randomAccessM6291y = arrayList2;
                            }
                            i2 = iM10580a;
                            arrayList.add(randomAccessM6291y);
                        }
                        i6++;
                        iM10580a = i2;
                    }
                }
            }
            i3++;
            dq5Var2 = dq5Var;
            iM10580a = iM10580a;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((g92) list.get(i9)).f40417c;
        }
        g92 g92Var3 = (g92) list.get(0);
        return Pair.create(new sw2(g92Var3.f40416b, iArr2), Integer.valueOf(g92Var3.f40415a));
    }

    /* JADX INFO: renamed from: h */
    public final void m13733h() {
        boolean z;
        rw2 rw2Var;
        nc0 nc0Var;
        synchronized (this.f43729c) {
            try {
                z = this.f43732f.f35198A && Build.VERSION.SDK_INT >= 32 && (nc0Var = this.f43734h) != null && nc0Var.m17331h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (rw2Var = this.f43727a) == null) {
            return;
        }
        rw2Var.f59932h.m20100e(10);
    }

    /* JADX INFO: renamed from: j */
    public final void m13734j() {
        nc0 nc0Var;
        synchronized (this.f43729c) {
            try {
                Thread thread = this.f43733g;
                if (thread != null) {
                    bna.m3985y("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (nc0Var = this.f43734h) != null) {
            nc0Var.m17333k();
            this.f43734h = null;
        }
        this.f43727a = null;
        this.f43728b = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m13735m(d92 d92Var) {
        boolean zEquals;
        synchronized (this.f43729c) {
            zEquals = this.f43732f.equals(d92Var);
            this.f43732f = d92Var;
        }
        if (zEquals) {
            return;
        }
        if (d92Var.f35198A && this.f43730d == null) {
            ss5.m21707d0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        rw2 rw2Var = this.f43727a;
        if (rw2Var != null) {
            rw2Var.f59932h.m20100e(10);
        }
    }
}
