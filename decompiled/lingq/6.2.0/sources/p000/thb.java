package p000;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.C0112a;
import androidx.compose.foundation.pager.AbstractC0148b;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0279g;
import androidx.compose.runtime.internal.C0282a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import okhttp3.TlsVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class thb {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f62302A = 0;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f62303B = 0;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f62304C = 0;

    /* JADX INFO: renamed from: j */
    public static final C0842cc f62314j;

    /* JADX INFO: renamed from: k */
    public static final C0842cc f62315k;

    /* JADX INFO: renamed from: l */
    public static final C0842cc f62316l;

    /* JADX INFO: renamed from: m */
    public static final C0842cc f62317m;

    /* JADX INFO: renamed from: n */
    public static final C0842cc f62318n;

    /* JADX INFO: renamed from: o */
    public static final C0842cc f62319o;

    /* JADX INFO: renamed from: p */
    public static final C0842cc f62320p;

    /* JADX INFO: renamed from: q */
    public static final C0842cc f62321q;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f62325u = 0;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f62326v = 0;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f62327w = 0;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f62328x = 0;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f62329y = 0;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f62330z = 0;

    /* JADX INFO: renamed from: a */
    public static final C0282a f62305a = new C0282a(1941368645, false, new oh0(20));

    /* JADX INFO: renamed from: b */
    public static final C0282a f62306b = new C0282a(-263550299, false, new oh0(21));

    /* JADX INFO: renamed from: c */
    public static final C0282a f62307c = new C0282a(1425922493, false, new oh0(22));

    /* JADX INFO: renamed from: d */
    public static final C0282a f62308d = new C0282a(222576678, false, new oh0(23));

    /* JADX INFO: renamed from: e */
    public static final C0282a f62309e = new C0282a(622661399, false, new C2914d4(10));

    /* JADX INFO: renamed from: f */
    public static final C0282a f62310f = new C0282a(293783066, false, new oh0(24));

    /* JADX INFO: renamed from: g */
    public static final C0282a f62311g = new C0282a(-1570695501, false, new C2914d4(11));

    /* JADX INFO: renamed from: h */
    public static final C0282a f62312h = new C0282a(-774309284, false, new C2914d4(12));

    /* JADX INFO: renamed from: i */
    public static final C3835zj f62313i = new C3835zj(6);

    /* JADX INFO: renamed from: r */
    public static final foa f62322r = new foa(9);

    /* JADX INFO: renamed from: s */
    public static final foa f62323s = new foa(10);

    /* JADX INFO: renamed from: t */
    public static final foa f62324t = new foa(11);

    static {
        int i = 5;
        f62314j = new C0842cc("NULL", i);
        f62315k = new C0842cc("UNINITIALIZED", i);
        f62316l = new C0842cc("DONE", i);
        f62317m = new C0842cc("STATE_REG", i);
        f62318n = new C0842cc("STATE_COMPLETED", i);
        f62319o = new C0842cc("STATE_CANCELLED", i);
        f62320p = new C0842cc("NO_RESULT", i);
        f62321q = new C0842cc("PARAM_CLAUSE_0", i);
    }

    /* JADX INFO: renamed from: A */
    public static final void m22036A(fb9 fb9Var, int i, Object obj) {
        int iM11734h = fb9Var.m11734h(i);
        Object[] objArr = fb9Var.f38802c;
        Object obj2 = objArr[iM11734h];
        objArr[iM11734h] = we1.f66679a;
        if (obj == obj2) {
            return;
        }
        cf1.m4605a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: B */
    public static final void m22037B(String str, JSONArray jSONArray, kp3 kp3Var) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectM3930S = bna.m3930S();
            if (jSONObjectM3930S != null) {
                Iterator<String> itKeys = jSONObjectM3930S.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM3930S.get(next));
                }
            }
            String str2 = mp3.f51688j;
            s46.m21069q(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{sy2.m21767b()}, 1)), jSONObject, kp3Var).m16983d();
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C */
    public static final e16 m22038C(e16 e16Var) {
        return e16Var.mo3161g(new tp9(AbstractC0406r.m1816b(), f62322r));
    }

    /* JADX INFO: renamed from: D */
    public static final int m22039D(hv4 hv4Var) {
        List list = hv4Var.f42985k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((iv4) list.get(i2)).f44663p;
        }
        return (i / list.size()) + hv4Var.f42991q;
    }

    /* JADX INFO: renamed from: E */
    public static final void m22040E(String str, String str2) {
        File fileM22058q = m22058q();
        if (fileM22058q == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM22058q, str));
            byte[] bytes = str2.getBytes(yu0.f70463a);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: F */
    public static phb m22041F() {
        ClassLoader classLoader = thb.class.getClassLoader();
        if (phb.class.equals(phb.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new thb[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(nhb.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(phb.class.getSimpleName()), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (phb) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (phb) phb.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                uk9.m22779n(e3);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:105:0x022a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0246  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:88:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x019a  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ae  */
    /* JADX INFO: renamed from: a */
    public static final void m22042a(final AbstractC0150d abstractC0150d, final e16 e16Var, t17 t17Var, iy5 iy5Var, int i, fc0 fc0Var, C0112a c0112a, boolean z, boolean z2, vi3 vi3Var, pj6 pj6Var, gz8 gz8Var, C0077c c0077c, final C0282a c0282a, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        vi3 vi3Var2;
        int i12;
        int i13;
        int i14;
        boolean z5;
        final iy5 iy5Var2;
        final fc0 fc0Var2;
        final C0112a c0112a2;
        final boolean z6;
        final pj6 pj6Var2;
        final int i15;
        final vi3 vi3Var3;
        final boolean z7;
        final t17 t17Var2;
        final gz8 gz8Var2;
        final C0077c c0077c2;
        x18 x18VarM22143u;
        p27 p27Var;
        f32 f32VarM21341a;
        bg9 bg9VarM21698Y;
        LayoutDirection layoutDirection;
        boolean zM22120g;
        Object objM22097O;
        boolean z8;
        vi3 vi3Var4;
        Orientation orientation;
        boolean z9;
        Object objM22097O2;
        int i16;
        fc0 fc0Var3;
        vi3 vi3Var5;
        pj6 pj6Var3;
        iy5 iy5Var3;
        C0112a c0112a3;
        int i17;
        boolean z10;
        boolean z11;
        t17 t17Var3;
        gz8 gz8Var3;
        C0077c c0077cM24823b;
        int i18;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1860873769);
        int i19 = (tj3Var.m22120g(abstractC0150d) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i19 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        int i20 = i19 | 3456;
        int i21 = i3 & 16;
        if (i21 == 0) {
            if ((i2 & 24576) == 0) {
                i4 = i;
                i20 |= tj3Var.m22116e(i4) ? 16384 : 8192;
            }
            i5 = 5963776 | i20;
            i6 = i3 & 256;
            if (i6 != 0) {
                if ((100663296 & i2) == 0) {
                    z3 = z;
                    if (tj3Var.m22122h(z3)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i5 |= i7;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i10 = i5 | 805306368;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if (tj3Var.m22122h(z4)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i10 = i5 | i9;
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i13 = 24582;
                    vi3Var2 = vi3Var;
                } else {
                    vi3Var2 = vi3Var;
                    if (tj3Var.m22124i(vi3Var2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i13 = 24576 | i12;
                }
                i14 = i13 | 1424;
                if ((i10 & 306783379) == 306783378 || (i14 & 9363) != 9362) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (tj3Var.m22099R(i10 & 1, z5)) {
                    tj3Var.m22104W();
                    if ((i2 & 1) != 0 || tj3Var.m22084B()) {
                        x17 x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        iy5 iy5Var4 = iy5.f44771g;
                        if (i21 != 0) {
                            i4 = 0;
                        }
                        fc0 fc0Var4 = nj0.f52789H;
                        int i22 = (i10 & 14) | 196608;
                        p27Var = new p27();
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        Map map = jwa.f46325a;
                        int i23 = i4;
                        bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                        fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                        layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                        zM22120g = tj3Var.m22120g(fb2Var) | ((((i22 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i22 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                        objM22097O = tj3Var.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                            tj3Var.m22131l0(objM22097O);
                        }
                        C0112a c0112a4 = (C0112a) objM22097O;
                        int i24 = i10 & (-29360129);
                        if (i6 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i8 != 0) {
                            z4 = false;
                        }
                        if (i11 != 0) {
                            vi3Var4 = null;
                        } else {
                            vi3Var4 = vi3Var2;
                        }
                        orientation = Orientation.Horizontal;
                        int i25 = (i10 & 14) | 432;
                        z9 = (((i25 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i25 & 6) == 4;
                        objM22097O2 = tj3Var.m22097O();
                        if (z9 || objM22097O2 == p84Var) {
                            objM22097O2 = new n72(abstractC0150d, orientation);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        i16 = i14 & (-7281);
                        fc0Var3 = fc0Var4;
                        vi3Var5 = vi3Var4;
                        pj6Var3 = (n72) objM22097O2;
                        iy5Var3 = iy5Var4;
                        c0112a3 = c0112a4;
                        i17 = i24;
                        z10 = z8;
                        z11 = z4;
                        t17Var3 = x17Var;
                        gz8Var3 = gz8.f41567h;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        i18 = i23;
                    } else {
                        tj3Var.m22102U();
                        i17 = i10 & (-29360129);
                        iy5Var3 = iy5Var;
                        c0112a3 = c0112a;
                        pj6Var3 = pj6Var;
                        i16 = i14 & (-7281);
                        i18 = i4;
                        z10 = z3;
                        vi3Var5 = vi3Var2;
                        z11 = z4;
                        t17Var3 = t17Var;
                        fc0Var3 = fc0Var;
                        gz8Var3 = gz8Var;
                        c0077cM24823b = c0077c;
                    }
                    tj3Var.m22140r();
                    int i26 = i17;
                    AbstractC0148b.m1028a(e16Var, abstractC0150d, t17Var3, z11, Orientation.Horizontal, c0112a3, z10, c0077cM24823b, i18, iy5Var3, pj6Var3, vi3Var5, fc0Var3, gz8Var3, c0282a, tj3Var, ((i17 >> 3) & 14) | 24576 | ((i26 << 3) & 112) | 384 | ((i26 >> 18) & 7168) | ((i26 >> 6) & 3670016) | ((i26 << 12) & 234881024) | 805306368, ((i16 << 6) & 896) | 1797126);
                    C0077c c0077c3 = c0077cM24823b;
                    c0112a2 = c0112a3;
                    i15 = i18;
                    z6 = z10;
                    fc0Var2 = fc0Var3;
                    gz8Var2 = gz8Var3;
                    c0077c2 = c0077c3;
                    vi3 vi3Var6 = vi3Var5;
                    pj6Var2 = pj6Var3;
                    vi3Var3 = vi3Var6;
                    iy5Var2 = iy5Var3;
                    z7 = z11;
                    t17Var2 = t17Var3;
                } else {
                    tj3Var.m22102U();
                    iy5Var2 = iy5Var;
                    fc0Var2 = fc0Var;
                    c0112a2 = c0112a;
                    z6 = z;
                    pj6Var2 = pj6Var;
                    i15 = i4;
                    vi3Var3 = vi3Var2;
                    z7 = z4;
                    t17Var2 = t17Var;
                    gz8Var2 = gz8Var;
                    c0077c2 = c0077c;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: j27
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i2 | 1);
                            thb.m22042a(abstractC0150d, e16Var, t17Var2, iy5Var2, i15, fc0Var2, c0112a2, z6, z7, vi3Var3, pj6Var2, gz8Var2, c0077c2, c0282a, (ye1) obj, iM19383z, i3);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 = 106627072 | i20;
            z3 = z;
            i8 = i3 & 512;
            if (i8 != 0) {
                i10 = i5 | 805306368;
                z4 = z2;
            } else {
                z4 = z2;
                if (tj3Var.m22122h(z4)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i10 = i5 | i9;
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
                i13 = 24582;
                vi3Var2 = vi3Var;
            } else {
                vi3Var2 = vi3Var;
                if (tj3Var.m22124i(vi3Var2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i13 = 24576 | i12;
            }
            i14 = i13 | 1424;
            if ((i10 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (tj3Var.m22099R(i10 & 1, z5)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0) {
                    x17 x17Var2 = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    iy5 iy5Var5 = iy5.f44771g;
                    if (i21 != 0) {
                        i4 = 0;
                    }
                    fc0 fc0Var5 = nj0.f52789H;
                    int i27 = (i10 & 14) | 196608;
                    p27Var = new p27();
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    Map map2 = jwa.f46325a;
                    int i28 = i4;
                    bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    fb2 fb2Var2 = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                    layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                    zM22120g = tj3Var.m22120g(fb2Var2) | ((((i27 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i27 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O = tj3Var.m22097O();
                    p84 p84Var2 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    }
                    C0112a c0112a5 = (C0112a) objM22097O;
                    int i29 = i10 & (-29360129);
                    if (i6 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    orientation = Orientation.Horizontal;
                    int i210 = (i10 & 14) | 432;
                    if (((i210 & 14) ^ 6) <= 4) {
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z9) {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i16 = i14 & (-7281);
                    fc0Var3 = fc0Var5;
                    vi3Var5 = vi3Var4;
                    pj6Var3 = (n72) objM22097O2;
                    iy5Var3 = iy5Var5;
                    c0112a3 = c0112a5;
                    i17 = i29;
                    z10 = z8;
                    z11 = z4;
                    t17Var3 = x17Var2;
                    gz8Var3 = gz8.f41567h;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    i18 = i28;
                } else {
                    x17 x17Var3 = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    iy5 iy5Var6 = iy5.f44771g;
                    if (i21 != 0) {
                        i4 = 0;
                    }
                    fc0 fc0Var6 = nj0.f52789H;
                    int i211 = (i10 & 14) | 196608;
                    p27Var = new p27();
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    Map map3 = jwa.f46325a;
                    int i212 = i4;
                    bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    fb2 fb2Var3 = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                    layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                    zM22120g = tj3Var.m22120g(fb2Var3) | ((((i211 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i211 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O = tj3Var.m22097O();
                    p84 p84Var3 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    }
                    C0112a c0112a6 = (C0112a) objM22097O;
                    int i213 = i10 & (-29360129);
                    if (i6 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    orientation = Orientation.Horizontal;
                    int i214 = (i10 & 14) | 432;
                    if (((i214 & 14) ^ 6) <= 4) {
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z9) {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i16 = i14 & (-7281);
                    fc0Var3 = fc0Var6;
                    vi3Var5 = vi3Var4;
                    pj6Var3 = (n72) objM22097O2;
                    iy5Var3 = iy5Var6;
                    c0112a3 = c0112a6;
                    i17 = i213;
                    z10 = z8;
                    z11 = z4;
                    t17Var3 = x17Var3;
                    gz8Var3 = gz8.f41567h;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    i18 = i212;
                }
                tj3Var.m22140r();
                int i215 = i17;
                AbstractC0148b.m1028a(e16Var, abstractC0150d, t17Var3, z11, Orientation.Horizontal, c0112a3, z10, c0077cM24823b, i18, iy5Var3, pj6Var3, vi3Var5, fc0Var3, gz8Var3, c0282a, tj3Var, ((i17 >> 3) & 14) | 24576 | ((i215 << 3) & 112) | 384 | ((i215 >> 18) & 7168) | ((i215 >> 6) & 3670016) | ((i215 << 12) & 234881024) | 805306368, ((i16 << 6) & 896) | 1797126);
                C0077c c0077c4 = c0077cM24823b;
                c0112a2 = c0112a3;
                i15 = i18;
                z6 = z10;
                fc0Var2 = fc0Var3;
                gz8Var2 = gz8Var3;
                c0077c2 = c0077c4;
                vi3 vi3Var7 = vi3Var5;
                pj6Var2 = pj6Var3;
                vi3Var3 = vi3Var7;
                iy5Var2 = iy5Var3;
                z7 = z11;
                t17Var2 = t17Var3;
            } else {
                tj3Var.m22102U();
                iy5Var2 = iy5Var;
                fc0Var2 = fc0Var;
                c0112a2 = c0112a;
                z6 = z;
                pj6Var2 = pj6Var;
                i15 = i4;
                vi3Var3 = vi3Var2;
                z7 = z4;
                t17Var2 = t17Var;
                gz8Var2 = gz8Var;
                c0077c2 = c0077c;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: j27
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        thb.m22042a(abstractC0150d, e16Var, t17Var2, iy5Var2, i15, fc0Var2, c0112a2, z6, z7, vi3Var3, pj6Var2, gz8Var2, c0077c2, c0282a, (ye1) obj, iM19383z, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i20 = i19 | 28032;
        i4 = i;
        i5 = 5963776 | i20;
        i6 = i3 & 256;
        if (i6 != 0) {
            if ((100663296 & i2) == 0) {
                z3 = z;
                if (tj3Var.m22122h(z3)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i5 |= i7;
            }
            i8 = i3 & 512;
            if (i8 != 0) {
                i10 = i5 | 805306368;
                z4 = z2;
            } else {
                z4 = z2;
                if (tj3Var.m22122h(z4)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i10 = i5 | i9;
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
                i13 = 24582;
                vi3Var2 = vi3Var;
            } else {
                vi3Var2 = vi3Var;
                if (tj3Var.m22124i(vi3Var2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i13 = 24576 | i12;
            }
            i14 = i13 | 1424;
            if ((i10 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (tj3Var.m22099R(i10 & 1, z5)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0) {
                    x17 x17Var4 = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    iy5 iy5Var7 = iy5.f44771g;
                    if (i21 != 0) {
                        i4 = 0;
                    }
                    fc0 fc0Var7 = nj0.f52789H;
                    int i216 = (i10 & 14) | 196608;
                    p27Var = new p27();
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    Map map4 = jwa.f46325a;
                    int i217 = i4;
                    bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    fb2 fb2Var4 = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                    layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                    zM22120g = tj3Var.m22120g(fb2Var4) | ((((i216 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i216 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O = tj3Var.m22097O();
                    p84 p84Var4 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    }
                    C0112a c0112a7 = (C0112a) objM22097O;
                    int i218 = i10 & (-29360129);
                    if (i6 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    orientation = Orientation.Horizontal;
                    int i219 = (i10 & 14) | 432;
                    if (((i219 & 14) ^ 6) <= 4) {
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z9) {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i16 = i14 & (-7281);
                    fc0Var3 = fc0Var7;
                    vi3Var5 = vi3Var4;
                    pj6Var3 = (n72) objM22097O2;
                    iy5Var3 = iy5Var7;
                    c0112a3 = c0112a7;
                    i17 = i218;
                    z10 = z8;
                    z11 = z4;
                    t17Var3 = x17Var4;
                    gz8Var3 = gz8.f41567h;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    i18 = i217;
                } else {
                    x17 x17Var5 = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    iy5 iy5Var8 = iy5.f44771g;
                    if (i21 != 0) {
                        i4 = 0;
                    }
                    fc0 fc0Var8 = nj0.f52789H;
                    int i2110 = (i10 & 14) | 196608;
                    p27Var = new p27();
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    Map map5 = jwa.f46325a;
                    int i2111 = i4;
                    bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    fb2 fb2Var5 = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                    layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                    zM22120g = tj3Var.m22120g(fb2Var5) | ((((i2110 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i2110 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                    objM22097O = tj3Var.m22097O();
                    p84 p84Var5 = we1.f66679a;
                    if (zM22120g) {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                        tj3Var.m22131l0(objM22097O);
                    }
                    C0112a c0112a8 = (C0112a) objM22097O;
                    int i2112 = i10 & (-29360129);
                    if (i6 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i8 != 0) {
                        z4 = false;
                    }
                    if (i11 != 0) {
                        vi3Var4 = null;
                    } else {
                        vi3Var4 = vi3Var2;
                    }
                    orientation = Orientation.Horizontal;
                    int i2113 = (i10 & 14) | 432;
                    if (((i2113 & 14) ^ 6) <= 4) {
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z9) {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new n72(abstractC0150d, orientation);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    i16 = i14 & (-7281);
                    fc0Var3 = fc0Var8;
                    vi3Var5 = vi3Var4;
                    pj6Var3 = (n72) objM22097O2;
                    iy5Var3 = iy5Var8;
                    c0112a3 = c0112a8;
                    i17 = i2112;
                    z10 = z8;
                    z11 = z4;
                    t17Var3 = x17Var5;
                    gz8Var3 = gz8.f41567h;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    i18 = i2111;
                }
                tj3Var.m22140r();
                int i2114 = i17;
                AbstractC0148b.m1028a(e16Var, abstractC0150d, t17Var3, z11, Orientation.Horizontal, c0112a3, z10, c0077cM24823b, i18, iy5Var3, pj6Var3, vi3Var5, fc0Var3, gz8Var3, c0282a, tj3Var, ((i17 >> 3) & 14) | 24576 | ((i2114 << 3) & 112) | 384 | ((i2114 >> 18) & 7168) | ((i2114 >> 6) & 3670016) | ((i2114 << 12) & 234881024) | 805306368, ((i16 << 6) & 896) | 1797126);
                C0077c c0077c5 = c0077cM24823b;
                c0112a2 = c0112a3;
                i15 = i18;
                z6 = z10;
                fc0Var2 = fc0Var3;
                gz8Var2 = gz8Var3;
                c0077c2 = c0077c5;
                vi3 vi3Var8 = vi3Var5;
                pj6Var2 = pj6Var3;
                vi3Var3 = vi3Var8;
                iy5Var2 = iy5Var3;
                z7 = z11;
                t17Var2 = t17Var3;
            } else {
                tj3Var.m22102U();
                iy5Var2 = iy5Var;
                fc0Var2 = fc0Var;
                c0112a2 = c0112a;
                z6 = z;
                pj6Var2 = pj6Var;
                i15 = i4;
                vi3Var3 = vi3Var2;
                z7 = z4;
                t17Var2 = t17Var;
                gz8Var2 = gz8Var;
                c0077c2 = c0077c;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: j27
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i2 | 1);
                        thb.m22042a(abstractC0150d, e16Var, t17Var2, iy5Var2, i15, fc0Var2, c0112a2, z6, z7, vi3Var3, pj6Var2, gz8Var2, c0077c2, c0282a, (ye1) obj, iM19383z, i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 = 106627072 | i20;
        z3 = z;
        i8 = i3 & 512;
        if (i8 != 0) {
            i10 = i5 | 805306368;
            z4 = z2;
        } else {
            z4 = z2;
            if (tj3Var.m22122h(z4)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i10 = i5 | i9;
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
            i13 = 24582;
            vi3Var2 = vi3Var;
        } else {
            vi3Var2 = vi3Var;
            if (tj3Var.m22124i(vi3Var2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i13 = 24576 | i12;
        }
        i14 = i13 | 1424;
        if ((i10 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (tj3Var.m22099R(i10 & 1, z5)) {
            tj3Var.m22104W();
            if ((i2 & 1) != 0) {
                x17 x17Var6 = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                iy5 iy5Var9 = iy5.f44771g;
                if (i21 != 0) {
                    i4 = 0;
                }
                fc0 fc0Var9 = nj0.f52789H;
                int i2115 = (i10 & 14) | 196608;
                p27Var = new p27();
                f32VarM21341a = sf9.m21341a(tj3Var);
                Map map6 = jwa.f46325a;
                int i2116 = i4;
                bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                fb2 fb2Var6 = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                zM22120g = tj3Var.m22120g(fb2Var6) | ((((i2115 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i2115 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O = tj3Var.m22097O();
                p84 p84Var6 = we1.f66679a;
                if (zM22120g) {
                    objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                    tj3Var.m22131l0(objM22097O);
                }
                C0112a c0112a9 = (C0112a) objM22097O;
                int i2117 = i10 & (-29360129);
                if (i6 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i8 != 0) {
                    z4 = false;
                }
                if (i11 != 0) {
                    vi3Var4 = null;
                } else {
                    vi3Var4 = vi3Var2;
                }
                orientation = Orientation.Horizontal;
                int i2118 = (i10 & 14) | 432;
                if (((i2118 & 14) ^ 6) <= 4) {
                }
                objM22097O2 = tj3Var.m22097O();
                if (z9) {
                    objM22097O2 = new n72(abstractC0150d, orientation);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new n72(abstractC0150d, orientation);
                    tj3Var.m22131l0(objM22097O2);
                }
                i16 = i14 & (-7281);
                fc0Var3 = fc0Var9;
                vi3Var5 = vi3Var4;
                pj6Var3 = (n72) objM22097O2;
                iy5Var3 = iy5Var9;
                c0112a3 = c0112a9;
                i17 = i2117;
                z10 = z8;
                z11 = z4;
                t17Var3 = x17Var6;
                gz8Var3 = gz8.f41567h;
                c0077cM24823b = y07.m24823b(tj3Var);
                i18 = i2116;
            } else {
                x17 x17Var7 = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                iy5 iy5Var10 = iy5.f44771g;
                if (i21 != 0) {
                    i4 = 0;
                }
                fc0 fc0Var10 = nj0.f52789H;
                int i2119 = (i10 & 14) | 196608;
                p27Var = new p27();
                f32VarM21341a = sf9.m21341a(tj3Var);
                Map map7 = jwa.f46325a;
                int i21110 = i4;
                bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                fb2 fb2Var7 = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
                zM22120g = tj3Var.m22120g(fb2Var7) | ((((i2119 & 14) ^ 6) <= 4 && tj3Var.m22120g(abstractC0150d)) || (i2119 & 6) == 4) | tj3Var.m22120g(f32VarM21341a) | tj3Var.m22120g(bg9VarM21698Y) | tj3Var.m22120g(p27Var) | tj3Var.m22116e(layoutDirection.ordinal());
                objM22097O = tj3Var.m22097O();
                p84 p84Var7 = we1.f66679a;
                if (zM22120g) {
                    objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0112a(new fs6(abstractC0150d, new ia5(3, abstractC0150d, layoutDirection), p27Var), f32VarM21341a, bg9VarM21698Y);
                    tj3Var.m22131l0(objM22097O);
                }
                C0112a c0112a10 = (C0112a) objM22097O;
                int i21111 = i10 & (-29360129);
                if (i6 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i8 != 0) {
                    z4 = false;
                }
                if (i11 != 0) {
                    vi3Var4 = null;
                } else {
                    vi3Var4 = vi3Var2;
                }
                orientation = Orientation.Horizontal;
                int i21112 = (i10 & 14) | 432;
                if (((i21112 & 14) ^ 6) <= 4) {
                }
                objM22097O2 = tj3Var.m22097O();
                if (z9) {
                    objM22097O2 = new n72(abstractC0150d, orientation);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new n72(abstractC0150d, orientation);
                    tj3Var.m22131l0(objM22097O2);
                }
                i16 = i14 & (-7281);
                fc0Var3 = fc0Var10;
                vi3Var5 = vi3Var4;
                pj6Var3 = (n72) objM22097O2;
                iy5Var3 = iy5Var10;
                c0112a3 = c0112a10;
                i17 = i21111;
                z10 = z8;
                z11 = z4;
                t17Var3 = x17Var7;
                gz8Var3 = gz8.f41567h;
                c0077cM24823b = y07.m24823b(tj3Var);
                i18 = i21110;
            }
            tj3Var.m22140r();
            int i21113 = i17;
            AbstractC0148b.m1028a(e16Var, abstractC0150d, t17Var3, z11, Orientation.Horizontal, c0112a3, z10, c0077cM24823b, i18, iy5Var3, pj6Var3, vi3Var5, fc0Var3, gz8Var3, c0282a, tj3Var, ((i17 >> 3) & 14) | 24576 | ((i21113 << 3) & 112) | 384 | ((i21113 >> 18) & 7168) | ((i21113 >> 6) & 3670016) | ((i21113 << 12) & 234881024) | 805306368, ((i16 << 6) & 896) | 1797126);
            C0077c c0077c6 = c0077cM24823b;
            c0112a2 = c0112a3;
            i15 = i18;
            z6 = z10;
            fc0Var2 = fc0Var3;
            gz8Var2 = gz8Var3;
            c0077c2 = c0077c6;
            vi3 vi3Var9 = vi3Var5;
            pj6Var2 = pj6Var3;
            vi3Var3 = vi3Var9;
            iy5Var2 = iy5Var3;
            z7 = z11;
            t17Var2 = t17Var3;
        } else {
            tj3Var.m22102U();
            iy5Var2 = iy5Var;
            fc0Var2 = fc0Var;
            c0112a2 = c0112a;
            z6 = z;
            pj6Var2 = pj6Var;
            i15 = i4;
            vi3Var3 = vi3Var2;
            z7 = z4;
            t17Var2 = t17Var;
            gz8Var2 = gz8Var;
            c0077c2 = c0077c;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: j27
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i2 | 1);
                    thb.m22042a(abstractC0150d, e16Var, t17Var2, iy5Var2, i15, fc0Var2, c0112a2, z6, z7, vi3Var3, pj6Var2, gz8Var2, c0077c2, c0282a, (ye1) obj, iM19383z, i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final je5 m22043b(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new je5(kSerializer, kSerializer2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m22044c(ye1 ye1Var, e16 e16Var) {
        C3580sn c3580sn = C3580sn.f61042i;
        tj3 tj3Var = (tj3) ye1Var;
        int iHashCode = Long.hashCode(tj3Var.f62385T);
        e16 e16VarM1322c = AbstractC0287b.m1322c(ye1Var, e16Var);
        l77 l77VarM22132m = tj3Var.m22132m();
        se1.f60731q.getClass();
        ui3 ui3Var = C0352b.f4299b;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22119f0();
        if (tj3Var2.f62384S) {
            tj3Var2.m22130l(ui3Var);
        } else {
            tj3Var2.m22137o0();
        }
        oha.m18001g(ye1Var, C0352b.f4303f, c3580sn);
        oha.m18001g(ye1Var, C0352b.f4302e, l77VarM22132m);
        oha.m18000f(ye1Var, C0352b.f4305h);
        oha.m18001g(ye1Var, C0352b.f4301d, e16VarM1322c);
        oha.m18001g(ye1Var, C0352b.f4304g, Integer.valueOf(iHashCode));
        tj3Var2.m22139q(true);
    }

    /* JADX INFO: renamed from: d */
    public static final void m22045d(int i, int i2, List list) {
        int iM22053l = m22053l(i, list);
        if (iM22053l < 0) {
            iM22053l = -(iM22053l + 1);
        }
        while (iM22053l < list.size() && ((ja4) list.get(iM22053l)).f45334b < i2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static de6 m22046e(TypedValue typedValue, de6 de6Var, de6 de6Var2, String str, String str2) throws XmlPullParserException {
        if (de6Var == null || de6Var == de6Var2) {
            return de6Var == null ? de6Var2 : de6Var;
        }
        StringBuilder sbM23000w = ux5.m23000w("Type is ", str, " but found ", str2, ": ");
        sbM23000w.append(typedValue.data);
        throw new XmlPullParserException(sbM23000w.toString());
    }

    /* JADX INFO: renamed from: f */
    public static final void m22047f(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (bk1.m3800h(j) != Integer.MAX_VALUE) {
                return;
            }
            l54.m15816c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (bk1.m3801i(j) != Integer.MAX_VALUE) {
                return;
            }
            l54.m15816c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m22048g(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m22049h(bb9 bb9Var, ArrayList arrayList, int i) {
        boolean zM3568l = bb9Var.m3568l(i);
        int[] iArr = bb9Var.f8283b;
        if (zM3568l) {
            arrayList.add(bb9Var.m3570n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m22049h(bb9Var, arrayList, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final Object m22050i(tf1 tf1Var, AbstractC0279g abstractC0279g) {
        if (!((d16) tf1Var).f34837a.f34836I) {
            i54.m13663b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        l77 l77Var = (l77) te1.m21979L(tf1Var).f4330W;
        l77Var.getClass();
        return xwc.m24743P(l77Var, abstractC0279g);
    }

    /* JADX INFO: renamed from: j */
    public static final void m22051j(String str) {
        File fileM22058q = m22058q();
        if (fileM22058q == null || str == null) {
            return;
        }
        new File(fileM22058q, str).delete();
    }

    /* JADX INFO: renamed from: k */
    public static final e28 m22052k(d16 d16Var, boolean z, boolean z2) {
        if (!d16Var.f34837a.f34836I) {
            return e28.f36619e;
        }
        if (z) {
            return te1.m21976I(d16Var, 8).m1660B1();
        }
        AbstractC0362l abstractC0362lM21976I = te1.m21976I(d16Var, 8);
        return bq1.m4054e0(abstractC0362lM21976I).mo1670Q(abstractC0362lM21976I, z2);
    }

    /* JADX INFO: renamed from: l */
    public static final int m22053l(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM11651m = fa4.m11651m(((ja4) list.get(i3)).f45334b, i);
            if (iM11651m < 0) {
                i2 = i3 + 1;
            } else {
                if (iM11651m <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: m */
    public static ar3 m22054m(SSLSession sSLSession) throws IOException {
        Object objM15120k;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C3386nv.m17633t("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            v63.m23133k("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        c21 c21VarM22377f = c21.f9327b.m22377f(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C3386nv.m17633t("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            v63.m23133k("tlsVersion == NONE");
            return null;
        }
        TlsVersion.Companion.getClass();
        TlsVersion tlsVersionM19599a = q1a.m19599a(protocol);
        try {
            objM15120k = kcb.m15120k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objM15120k = EmptyList.f47638a;
        }
        return new ar3(tlsVersionM19599a, c21VarM22377f, kcb.m15120k(sSLSession.getLocalCertificates()), new C3757xf(objM15120k, 15));
    }

    /* JADX INFO: renamed from: n */
    public static xi4 m22055n(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = l48.f49043a;
        synchronized (l48.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(l48.f49046d);
        }
        xi4 xi4Var = (xi4) mapUnmodifiableMap.get(str);
        if (xi4Var != null) {
            return xi4Var;
        }
        throw new GeneralSecurityException(AbstractC3393o1.m17734i("cannot find key template: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000e, B:8:0x0014, B:15:0x0033, B:17:0x0039, B:24:0x005b, B:23:0x0058, B:14:0x0030, B:20:0x0054, B:11:0x002c), top: B:37:0x000e, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0039, please report this as an issue */
    /* JADX INFO: renamed from: o */
    public static String m22056o(Context context) {
        String str;
        if (C3012fs.m12034a() == null) {
            synchronized (C3012fs.m12036c()) {
                if (C3012fs.m12034a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!lp1.f49971a.contains(C3012fs.class)) {
                        try {
                            C3012fs.f39544g = string;
                        } catch (Throwable th) {
                            lp1.m16420a(C3012fs.class, th);
                        }
                        if (C3012fs.m12034a() == null) {
                            str = "XZ" + UUID.randomUUID();
                            if (!lp1.f49971a.contains(C3012fs.class)) {
                                C3012fs.f39544g = str;
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C3012fs.m12034a()).apply();
                        }
                    } else if (C3012fs.m12034a() == null) {
                        str = "XZ" + UUID.randomUUID();
                        if (!lp1.f49971a.contains(C3012fs.class)) {
                            try {
                                C3012fs.f39544g = str;
                            } catch (Throwable th2) {
                                lp1.m16420a(C3012fs.class, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C3012fs.m12034a()).apply();
                    }
                }
            }
        }
        String strM12034a = C3012fs.m12034a();
        if (strM12034a != null) {
            return strM12034a;
        }
        C3386nv.m17633t("Required value was null.");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static Object m22057p(Class cls, String str) {
        try {
            return cls.getField(str).get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final File m22058q() {
        File file = new File(sy2.m21766a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final KSerializer m22059r(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().mo11826c() ? kSerializer : new vo6(kSerializer);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m22060s(C3419on c3419on) {
        int length = c3419on.f54604b.length();
        List list = c3419on.f54603a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3378nn c3378nn = (C3378nn) list.get(i);
                if ((c3378nn.f52979a instanceof fe5) && AbstractC3466pn.m19404b(0, length, c3378nn.f52980b, c3378nn.f52981c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static final e16 m22061t(e16 e16Var) {
        return e16Var.mo3161g(new tp9(AbstractC0406r.m1816b(), f62323s));
    }

    /* JADX INFO: renamed from: u */
    public static final void m22062u(ov8 ov8Var) {
        te1.m21979L(ov8Var).m1567J();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m22063v(String str) {
        try {
            return !Class.forName(str).getName().isEmpty();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m22064w(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        className.getClass();
        if (cl9.m4842Y(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        className2.getClass();
        return cl9.m4842Y(className2, "com.meta", false);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m22065x(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (m22064w(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!cl9.m4842Y(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!cl9.m4842Y(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (cl9.m4842Y(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (cl9.m4842Y(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!cl9.m4842Y(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static final e16 m22066y(e16 e16Var) {
        return e16Var.mo3161g(new tp9(AbstractC0406r.m1816b(), f62324t));
    }

    /* JADX INFO: renamed from: z */
    public static final JSONObject m22067z(String str) {
        File fileM22058q = m22058q();
        if (fileM22058q != null) {
            try {
                return new JSONObject(bna.m3970q0(new FileInputStream(new File(fileM22058q, str))));
            } catch (Exception unused) {
                m22051j(str);
            }
        }
        return null;
    }
}
