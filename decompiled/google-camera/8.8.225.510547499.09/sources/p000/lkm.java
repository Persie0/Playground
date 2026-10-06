package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.system.Os;
import android.util.Base64;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.material.snackbar.VMX.rgoX;
import com.google.p020vr.vrcore.base.api.VrCoreUtils;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class lkm {

    /* JADX INFO: renamed from: a */
    public static int f38490a;

    /* JADX INFO: renamed from: b */
    public static ogw f38491b;

    /* JADX INFO: renamed from: c */
    public static volatile Boolean f38492c;

    /* JADX INFO: renamed from: d */
    private static mmy f38493d;

    /* JADX INFO: renamed from: e */
    private static Context f38494e;

    public lkm() {
    }

    public lkm(byte[] bArr) {
    }

    public lkm(char[] cArr) {
    }

    public lkm(short[] sArr) {
    }

    /* JADX INFO: renamed from: A */
    public static int m15560A(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: B */
    public static LinkedHashMap m15561B(int i) {
        return new LinkedHashMap(m15560A(i));
    }

    /* JADX INFO: renamed from: C */
    public static List m15562C(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    /* JADX INFO: renamed from: D */
    public static ohk m15563D(LinkedHashMap linkedHashMap) {
        return new ohk(linkedHashMap);
    }

    /* JADX INFO: renamed from: E */
    public static void m15564E(Object obj, oju ojuVar, LinkedHashMap linkedHashMap) {
        obj.getClass();
        ojuVar.getClass();
        linkedHashMap.put(obj, ojuVar);
    }

    /* JADX INFO: renamed from: F */
    public static Object m15565F(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof ohc)) {
            if (obj instanceof ohd) {
                return m15565F(((ohd) obj).m18483a(), cls);
            }
            throw new IllegalStateException(String.format(rgoX.DOBWj, obj.getClass(), ohc.class, ohd.class));
        }
        if (obj instanceof ohe) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            boolean z2 = !z;
            Object[] objArr = {cls.getCanonicalName()};
            if (!z2) {
                throw new IllegalStateException(String.format("Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", objArr));
            }
        }
        return cls.cast(obj);
    }

    /* JADX INFO: renamed from: G */
    public static Context m15566G(Context context) throws oga {
        if (f38494e == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion < 9) {
                throw new oga(4);
            }
            try {
                f38494e = context.createPackageContext("com.google.vr.vrcore", 3);
                f38490a = vrCoreClientApiVersion;
            } catch (PackageManager.NameNotFoundException e) {
                throw new oga(1);
            }
        }
        return f38494e;
    }

    /* JADX INFO: renamed from: H */
    public static IBinder m15567H(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
    }

    /* JADX INFO: renamed from: I */
    public static synchronized boolean m15568I(Context context) {
        if (f38492c == null) {
            try {
                f38492c = Boolean.valueOf(ofz.m18472a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), ofz.f45899c, ofz.f45900d, ofz.f45898b));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalStateException("Unable to find self package info", e);
            }
        }
        return f38492c.booleanValue();
    }

    /* JADX INFO: renamed from: J */
    public static Uri m15569J(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }

    /* JADX INFO: renamed from: K */
    public static ofm m15570K(Context context) {
        ArrayList<String> arrayList;
        mbb mbbVar = null;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
        } else {
            List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
            if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = it.next().providerInfo;
                    String str = providerInfo.packageName;
                    if (str != null && str.startsWith(PMZiHihxLGEy.TpScgzba)) {
                        arrayList2.add(providerInfo.authority);
                    }
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            for (String str2 : arrayList) {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str2);
                if (contentProviderClientAcquireContentProviderClient != null) {
                    mbbVar = new mbb(contentProviderClientAcquireContentProviderClient, str2);
                    break;
                }
            }
        }
        if (mbbVar == null) {
            return new ofj(context);
        }
        return new oey((ContentProviderClient) mbbVar.f39760a, (String) mbbVar.f39761b);
    }

    /* JADX INFO: renamed from: L */
    public static IOException m15571L(C1058va c1058va, Uri uri, IOException iOException) {
        try {
            lsr lsrVar = new lsr();
            lsrVar.f39140a = true;
            File file = (File) c1058va.m19466E(uri, lsrVar);
            if (!file.exists()) {
                return m15573N(file, iOException);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? m15573N(file, iOException) : m15573N(file, iOException);
                }
                return file.canWrite() ? m15573N(file, iOException) : m15573N(file, iOException);
            }
            if (file.canRead()) {
                return file.canWrite() ? m15573N(file, iOException) : m15573N(file, iOException);
            }
            return file.canWrite() ? m15573N(file, iOException) : m15573N(file, iOException);
        } catch (IOException e) {
            return new IOException(iOException);
        }
    }

    /* JADX INFO: renamed from: M */
    public static ljf m15572M(Executor executor, C1058va c1058va, HashMap map, ltv ltvVar) {
        return new ljf(executor, c1058va, ltvVar, map, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: N */
    private static IOException m15573N(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m15577d(file, iOException);
        }
        if (!parentFile.exists()) {
            return m15577d(file, iOException);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? m15577d(file, iOException) : m15577d(file, iOException);
            }
            return parentFile.canWrite() ? m15577d(file, iOException) : m15577d(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? m15577d(file, iOException) : m15577d(file, iOException);
        }
        return parentFile.canWrite() ? m15577d(file, iOException) : m15577d(file, iOException);
    }

    /* JADX INFO: renamed from: a */
    public static int m15574a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ozv m15575b(ozv ozvVar, long j) {
        nxl nxlVar = (nxl) ozvVar.m18143ad(5);
        nxlVar.m18108s(ozvVar);
        nxq nxqVar = nxlVar.f44974b;
        ozv ozvVar2 = (ozv) nxqVar;
        if ((ozvVar2.f47092a & 2) != 0) {
            long j2 = ozvVar2.f47094c - j;
            if (!nxqVar.m18142ac()) {
                nxlVar.mo18106p();
            }
            ozv ozvVar3 = (ozv) nxlVar.f44974b;
            ozvVar3.f47092a |= 2;
            ozvVar3.f47094c = j2;
        }
        nxq nxqVar2 = nxlVar.f44974b;
        ozv ozvVar4 = (ozv) nxqVar2;
        if ((ozvVar4.f47092a & 4) != 0) {
            long j3 = ozvVar4.f47095d - j;
            if (!nxqVar2.m18142ac()) {
                nxlVar.mo18106p();
            }
            ozv ozvVar5 = (ozv) nxlVar.f44974b;
            ozvVar5.f47092a |= 4;
            ozvVar5.f47095d = j3;
        }
        nxq nxqVar3 = nxlVar.f44974b;
        ozv ozvVar6 = (ozv) nxqVar3;
        if ((ozvVar6.f47092a & 8) != 0) {
            long j4 = ozvVar6.f47096e - j;
            if (!nxqVar3.m18142ac()) {
                nxlVar.mo18106p();
            }
            ozv ozvVar7 = (ozv) nxlVar.f44974b;
            ozvVar7.f47092a |= 8;
            ozvVar7.f47096e = j4;
        }
        return (ozv) nxlVar.mo18103l();
    }

    /* JADX INFO: renamed from: c */
    public static Uri m15576c(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    /* JADX INFO: renamed from: d */
    private static IOException m15577d(File file, IOException iOException) {
        String strConcat;
        String str = hiCTUJiAxf.IXukjeqlJuGuoOH;
        try {
            strConcat = str + String.format(Locale.US, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()));
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception e) {
            }
        } catch (IOException e2) {
            strConcat = str.concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    /* JADX INFO: renamed from: f */
    public static void m15579f(ltr ltrVar, HashMap map) {
        lku.m15607B(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
        map.put("singleproc", ltrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [moq] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: g */
    public static moj m15580g(String str) {
        boolean z;
        ?? r2;
        moq moqVarMo16700d;
        mol molVar = mok.f41193a;
        moy moyVar = (moy) moz.f41223b.get();
        Object obj = moyVar.f41220b;
        if (obj == moi.f41185a) {
            r2 = 0;
            moz.m16725c(moyVar, null);
            z = true;
        } else {
            z = false;
        }
        if (r2 == 0) {
            r2 = obj;
            moqVarMo16700d = new moh(str, molVar);
        } else {
            r2 = obj;
            moqVarMo16700d = r2 instanceof moc ? ((moc) r2).mo16700d(str, molVar, false) : r2.mo16707g(str, molVar);
        }
        moz.m16725c(moyVar, moqVarMo16700d);
        return new moj(moqVarMo16700d, z);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m15581h(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static String m15582i(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static Context m15583j(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: k */
    public static String m15584k(String str) {
        return "update.precondition.failures:".concat(str);
    }

    /* JADX INFO: renamed from: l */
    public static synchronized mmy m15585l(Context context) {
        if (f38493d == null) {
            f38493d = new mmy(new lyz(m15583j(context)), null);
        }
        return f38493d;
    }

    /* JADX INFO: renamed from: m */
    public static int m15586m(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if ((-2147483639) + i3 > 0) {
            return i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i3;
    }

    /* JADX INFO: renamed from: n */
    public static void m15587n(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m15588o(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m15589p(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + PMZiHihxLGEy.gwqYzeme + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    /* JADX INFO: renamed from: q */
    public static okb m15590q(Object obj, Object obj2) {
        return new okb(obj, obj2);
    }

    /* JADX INFO: renamed from: r */
    public static Object m15591r(Throwable th) {
        return new okc(th);
    }

    /* JADX INFO: renamed from: s */
    public static void m15592s(Object obj) {
        if (obj instanceof okc) {
            throw ((okc) obj).f46188a;
        }
    }

    /* JADX INFO: renamed from: t */
    public static ojy m15593t(omx omxVar) {
        return new okf(omxVar);
    }

    /* JADX INFO: renamed from: u */
    public static ojy m15594u(omx omxVar) {
        return new oke(omxVar);
    }

    /* JADX INFO: renamed from: v */
    public static void m15595v(Throwable th, Throwable th2) {
        th2.getClass();
        if (th != th2) {
            omo.f46318a.mo18723b(th, th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static ohm m15596w(List list, List list2) {
        return new ohm(list, list2);
    }

    /* JADX INFO: renamed from: x */
    public static void m15597x(oju ojuVar, List list) {
        list.add(ojuVar);
    }

    /* JADX INFO: renamed from: y */
    public static void m15598y(oju ojuVar, List list) {
        list.add(ojuVar);
    }

    /* JADX INFO: renamed from: z */
    public static void m15599z(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
