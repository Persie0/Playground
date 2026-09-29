package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.style.C0159d;
import androidx.compose.foundation.text.contextmenu.modifier.AbstractC0173b;
import androidx.compose.material3.C0269z;
import androidx.compose.material3.SheetValue;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.room.coroutines.C0742c;
import androidx.room.util.AbstractC0758a;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import com.facebook.login.C0939m;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y47 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69280b;

    public /* synthetic */ y47(Object obj, int i) {
        this.f69279a = i;
        this.f69280b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0314  */
    /* JADX WARN: Code duplicated, block: B:172:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0149 A[Catch: all -> 0x0158, LOOP:3: B:48:0x0107->B:59:0x0149, LOOP_END, TryCatch #1 {all -> 0x0158, blocks: (B:45:0x00f5, B:48:0x0107, B:50:0x011a, B:52:0x0126, B:54:0x0130, B:56:0x013e, B:59:0x0149, B:60:0x014e), top: B:164:0x00f5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws NoSuchMethodException, ClassNotFoundException, IOException {
        Pair pair;
        Pair pair2;
        boolean z;
        int i = this.f69279a;
        boolean z2 = true;
        boolean z3 = false;
        Object obj = this.f69280b;
        switch (i) {
            case 0:
                C0742c c0742c = (C0742c) obj;
                return c0742c.f6937a.mo4512m(c0742c.f6938b);
            case 1:
                ((lna) obj).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 2:
                return Float.valueOf(((k73) obj).mo169a() < 1.0f ? 0.3f : 1.0f);
            case 3:
                w78 w78Var = (w78) obj;
                ClassLoader classLoader = w78Var.f66488b;
                u33 u33Var = w78Var.f66489c;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (fa4.m11650l(url.getProtocol(), "file")) {
                        String str = d57.f35013b;
                        pair2 = new Pair(u33Var, gz8.m12977i(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String string2 = url2.toString();
                    string2.getClass();
                    if (cl9.m4842Y(string2, "jar:file:", false)) {
                        int i2 = 6;
                        int iM23394q0 = vk9.m23394q0(string2, 6, "!");
                        if (iM23394q0 == -1) {
                            pair = null;
                        } else {
                            String str2 = d57.f35013b;
                            pair = new Pair(icd.m13785f(gz8.m12977i(new File(URI.create(string2.substring(4, iM23394q0)))), u33Var, new qv7(i2)), w78.f66487e);
                        }
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return u91.m22603U0(arrayList2, arrayList);
            case 4:
                cc4 cc4Var = (cc4) obj;
                Class<?> clsLoadClass = ((ClassLoader) cc4Var.f9881a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = ((ClassLoader) cc4Var.f9881a).loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 5:
                el8 el8Var = (el8) obj;
                yl8 yl8Var = el8Var.f37441a;
                Object obj2 = el8Var.f37444d;
                if (obj2 != null) {
                    return yl8Var.mo4858f(el8Var, obj2);
                }
                C3386nv.m17626m("Value should be initialized");
                return null;
            case 6:
                fs6 fs6Var = ((ll8) obj).f49803c;
                if (fs6Var == null) {
                    return null;
                }
                Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                fs6Var.m12092G(bundleM18160p);
                if (bundleM18160p.isEmpty()) {
                    return null;
                }
                return bundleM18160p;
            case 7:
                return ci8.m4691D((dua) obj);
            case 8:
                vl8 vl8Var = (vl8) obj;
                vl8Var.mo256K().mo21323g(new d28(vl8Var, 0));
                return xfa.f68157a;
            case 9:
                ao8 ao8Var = (ao8) obj;
                C3833zh c3833zh = (C3833zh) thb.m22050i(ao8Var, y07.f69056a);
                ao8Var.f7304W = c3833zh;
                ao8Var.f7305X = c3833zh != null ? new C0077c(c3833zh.f71564a, c3833zh.f71565b, c3833zh.f71566c, c3833zh.f71567d) : null;
                return xfa.f68157a;
            case 10:
                return obj;
            case 11:
                zx8 zx8Var = (zx8) obj;
                return Integer.valueOf(r46.m20399z(zx8Var, zx8Var.f72356k));
            case 12:
                C0269z c0269z = (C0269z) obj;
                C0097e c0097e = c0269z.f3651e;
                if (((xc9) c0097e.f2243l).getValue() != null) {
                    return (SheetValue) c0097e.f2240i.getValue();
                }
                float fM19861h = c0097e.f2241j.m19861h();
                if (Float.isNaN(fM19861h)) {
                    return c0269z.m1215c();
                }
                float fM133f = c0097e.m849c().m133f(c0269z.m1215c());
                if (Float.isNaN(fM133f) || fM19861h == fM133f) {
                    return c0269z.m1215c();
                }
                SheetValue sheetValue = (SheetValue) c0097e.m849c().m128a(fM19861h);
                return sheetValue == null ? c0269z.m1215c() : sheetValue;
            case 13:
                ed9 ed9Var = (ed9) obj;
                while (true) {
                    synchronized (ed9Var.f37076g) {
                        try {
                            if (!ed9Var.f37072c) {
                                ed9Var.f37072c = z2;
                                try {
                                    x66 x66Var = ed9Var.f37075f;
                                    Object[] objArr = x66Var.f67830a;
                                    int i3 = x66Var.f67832c;
                                    for (?? r6 = z3; r6 < i3; r6++) {
                                        try {
                                            dd9 dd9Var = (dd9) objArr[r6];
                                            o66 o66Var = dd9Var.f35460g;
                                            vi3 vi3Var = dd9Var.f35454a;
                                            Object[] objArr2 = o66Var.f1303b;
                                            long[] jArr = o66Var.f1302a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                ?? r12 = z3;
                                                while (true) {
                                                    long j = jArr[r12];
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i4 = 8;
                                                        int i5 = 8 - ((~(r12 - length)) >>> 31);
                                                        int i6 = 0;
                                                        while (i6 < i5) {
                                                            if ((j & 255) < 128) {
                                                                vi3Var.invoke(objArr2[(r12 << 3) + i6]);
                                                            }
                                                            j >>= i4;
                                                            i6++;
                                                            i4 = i4;
                                                        }
                                                        if (i5 == i4) {
                                                            if (r12 != length) {
                                                                r12++;
                                                            }
                                                        }
                                                    } else if (r12 != length) {
                                                        r12++;
                                                    }
                                                }
                                            }
                                            o66Var.m17812e();
                                            z3 = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = false;
                                            ed9Var.f37072c = z;
                                            throw th;
                                        }
                                    }
                                    ed9Var.f37072c = z3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = z3;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!ed9Var.m11066b()) {
                        return xfa.f68157a;
                    }
                    z2 = true;
                    z3 = false;
                }
                break;
            case 14:
                C0939m.f11517f.m5254a().m5258b();
                ((hp5) obj).mo276a(vz1.m23604J("email"));
                return xfa.f68157a;
            case 15:
                C0159d c0159d = (C0159d) obj;
                C0312a c0312a = c0159d.f2756Q;
                if (c0312a != null) {
                    return c0312a;
                }
                C0312a c0312aMo14487c = te1.m21977J(c0159d).mo14487c();
                c0159d.f2756Q = c0312aMo14487c;
                return c0312aMo14487c;
            case 16:
                qs9 qs9Var = (qs9) obj;
                qs9Var.f58162Y = null;
                thb.m22062u(qs9Var);
                d32.m10020R(qs9Var);
                AbstractC3489q9.m19789s(qs9Var);
                return Boolean.TRUE;
            case 17:
                qt9 qt9Var = (qt9) obj;
                return qt9Var.f34836I ? AbstractC0173b.m1065a(qt9Var) : ct9.f34528b;
            case 18:
                return new f84(((j84) obj).m14323c());
            case 19:
                tx9 tx9Var = (tx9) obj;
                tx9Var.f63073T = null;
                thb.m22062u(tx9Var);
                d32.m10020R(tx9Var);
                AbstractC3489q9.m19789s(tx9Var);
                return Boolean.TRUE;
            case 20:
                a2a a2aVar = (a2a) obj;
                a2aVar.f134i0.invoke(Boolean.valueOf(!a2aVar.f133h0));
                return xfa.f68157a;
            default:
                C0773b c0773b = (C0773b) obj;
                WorkDatabase workDatabase = c0773b.f7206c;
                Context context = c0773b.f7204a;
                String str3 = xp9.f68501f;
                if (Build.VERSION.SDK_INT >= 34) {
                    ne4.m17403a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListM24632b = xp9.m24632b(context, jobScheduler);
                if (arrayListM24632b != null && !arrayListM24632b.isEmpty()) {
                    Iterator it = arrayListM24632b.iterator();
                    while (it.hasNext()) {
                        xp9.m24631a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) AbstractC0758a.m2859b(workDatabase.mo2909z().f63598a, false, true, new foa(18))).intValue();
                um8.m22795b(c0773b.f7205b, workDatabase, c0773b.f7208e);
                return xfa.f68157a;
        }
    }
}
