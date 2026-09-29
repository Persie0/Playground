package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class jj5 implements jn1, g94, InterfaceC3624tu, InterfaceC3735wu, jl1, ns2, xn9, a41, dqb, zc1, zn2 {

    /* JADX INFO: renamed from: b */
    public static jj5 f45611b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45622a;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jj5 f45612c = new jj5(1);

    /* JADX INFO: renamed from: d */
    public static final jj5 f45613d = new jj5(3);

    /* JADX INFO: renamed from: e */
    public static final jj5 f45614e = new jj5(4);

    /* JADX INFO: renamed from: f */
    public static final jj5 f45615f = new jj5(5);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ jj5 f45616g = new jj5(19);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ jj5 f45617h = new jj5(21);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ jj5 f45618i = new jj5(22);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ jj5 f45619j = new jj5(23);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ jj5 f45620k = new jj5(24);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ jj5 f45621l = new jj5(25);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ jj5 f45608H = new jj5(26);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ jj5 f45609I = new jj5(27);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ jj5 f45610J = new jj5(28);

    public /* synthetic */ jj5(int i) {
        this.f45622a = i;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m14497c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).toString());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m14498e(List list) {
        list.getClass();
        aj0 aj0Var = new aj0();
        for (String str : m14497c(list)) {
            aj0Var.m487k0(str.length());
            aj0Var.m495q0(str);
        }
        return aj0Var.m463N(aj0Var.f723b);
    }

    /* JADX INFO: renamed from: i */
    public static l88 m14499i(String str) {
        l88 l88Var = m88.f50759b;
        Pair pairM19044n = pb1.m19044n(null);
        Charset charset = (Charset) pairM19044n.f47623a;
        xv5 xv5Var = (xv5) pairM19044n.f47624b;
        aj0 aj0Var = new aj0();
        charset.getClass();
        int length = str.length();
        str.getClass();
        charset.getClass();
        if (length < 0) {
            C3386nv.m17624j(wq1.m24115k("endIndex < beginIndex: ", length, 0, " < "));
        } else if (length > str.length()) {
            C3386nv.m17623i(str.length(), ux5.m22998u("endIndex > string.length: ", length, " > "));
        } else if (charset.equals(yu0.f70463a)) {
            aj0Var.m493p0(0, str, length);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            bytes.getClass();
            aj0Var.write(bytes, 0, bytes.length);
        }
        return new l88(xv5Var, aj0Var.f723b, aj0Var);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m14500m(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = EmptyList.f47638a;
        }
        ArrayList arrayListM22587E0 = u91.m22587E0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM22587E0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            v30 v30Var = new v30();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                C3386nv.m17635v("Null processName");
                return null;
            }
            v30Var.f64773a = str2;
            v30Var.f64774b = runningAppProcessInfo.pid;
            byte b = (byte) (v30Var.f64777e | 1);
            v30Var.f64775c = runningAppProcessInfo.importance;
            v30Var.f64777e = (byte) (b | 2);
            v30Var.f64776d = fa4.m11650l(str2, str);
            v30Var.f64777e = (byte) (v30Var.f64777e | 4);
            arrayList2.add(v30Var.m23076a());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o */
    public static void m14501o(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && fa4.m11650l(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            uk9.m22774h(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: a */
    public float mo9967a() {
        return 0.0f;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public long mo10837b(long j, long j2) {
        float fM21636n = AbstractC3584sr.m21636n(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM21636n)) << 32) | (((long) Float.floatToRawIntBits(fM21636n)) & 4294967295L);
        int i = km8.f47515a;
        return jFloatToRawIntBits;
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // p000.xn9
    /* JADX INFO: renamed from: f */
    public yn9 mo14502f(wn9 wn9Var) {
        return new ah3((Context) wn9Var.f67096c, (String) wn9Var.f67097d, (C3126ix) wn9Var.f67098e, wn9Var.f67094a, wn9Var.f67095b);
    }

    @Override // p000.a41
    /* JADX INFO: renamed from: g */
    public long mo100g() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.zn2
    /* JADX INFO: renamed from: h */
    public yn2 mo12443h(Context context, String str, xn2 xn2Var) {
        int iMo9833c;
        yn2 yn2Var = new yn2();
        int iMo9834e = xn2Var.mo9834e(context, str);
        yn2Var.f70101a = iMo9834e;
        int i = 1;
        int i2 = 0;
        if (iMo9834e != 0) {
            iMo9833c = xn2Var.mo9833c(context, str, false);
            yn2Var.f70102b = iMo9833c;
        } else {
            iMo9833c = xn2Var.mo9833c(context, str, true);
            yn2Var.f70102b = iMo9833c;
        }
        int i3 = yn2Var.f70101a;
        if (i3 == 0) {
            if (iMo9833c == 0) {
                i = 0;
            }
            yn2Var.f70103c = i;
            return yn2Var;
        }
        i2 = i3;
        if (i2 >= iMo9833c) {
            i = -1;
        }
        yn2Var.f70103c = i;
        return yn2Var;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: j */
    public void mo9968j(fb2 fb2Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            eh0.m11111H(i, iArr, iArr2, false);
        } else {
            eh0.m11111H(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC3735wu
    /* JADX INFO: renamed from: k */
    public void mo10843k(fb2 fb2Var, int i, int[] iArr, int[] iArr2) {
        eh0.m11111H(i, iArr, iArr2, false);
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        return new m58(co7Var.mo4927b(rp7.m20740a(l58.class)));
    }

    /* JADX INFO: renamed from: n */
    public kq1 m14503n(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = m14500m(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((w30) ((kq1) next)).f66314b != iMyPid);
        kq1 kq1Var = (kq1) next;
        if (kq1Var != null) {
            return kq1Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        v30 v30Var = new v30();
        v30Var.f64773a = processName;
        v30Var.f64774b = iMyPid;
        byte b = (byte) (v30Var.f64777e | 1);
        v30Var.f64775c = 0;
        v30Var.f64776d = false;
        v30Var.f64777e = (byte) (((byte) (b | 2)) | 4);
        return v30Var.m23076a();
    }

    public String toString() {
        switch (this.f45622a) {
            case 7:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f45622a) {
            case 19:
                ((jkb) ikb.f44247b.f44248a.get()).getClass();
                return new Boolean(((Boolean) jkb.f45655a.get()).booleanValue());
            case 20:
            default:
                ((ykb) ukb.f64034b.f64035a.get()).getClass();
                return new Boolean(((Boolean) ykb.f69966a.get()).booleanValue());
            case 21:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.upload.min_delay_after_startup", 50, 5000L).get();
            case 22:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.refresh_blacklisted_config_interval", 34, 604800000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list3 = z8c.f71153a;
                zkb.f71689b.get().getClass();
                return (String) alb.f818a.m19920u("measurement.test.string_flag", 5, "---").get();
            case 24:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_bundles", 67, 100L).get()).longValue());
            case 25:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.rb.attribution.max_queue_time", 57, 864000000L).get();
            case 26:
                List list6 = z8c.f71153a;
                ((nkb) mkb.f51455b.f51456a.get()).getClass();
                return (Boolean) nkb.f52896c.get();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list7 = z8c.f71153a;
                blb.f8664b.get().getClass();
                return (Boolean) clb.f10242a.m19916p("measurement.rb.attribution.client2", 1, true).get();
        }
    }
}
