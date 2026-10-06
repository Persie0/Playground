package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.ExecutorC0932qj;
import p000.acz;
import p000.ade;
import p000.adh;
import p000.aox;
import p000.aoy;
import p000.aoz;
import p000.apa;
import p000.apd;
import p000.ape;
import p000.msa;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:452:0x0826  */
    /* JADX WARN: Code duplicated, block: B:453:0x0829  */
    /* JADX WARN: Code duplicated, block: B:460:0x0842 A[Catch: all -> 0x0864, LOOP:11: B:458:0x083c->B:460:0x0842, LOOP_END, TryCatch #23 {all -> 0x0864, blocks: (B:457:0x083a, B:458:0x083c, B:460:0x0842, B:461:0x0847), top: B:562:0x083a, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:641:0x0847 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v28 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [aoy[], byte[]] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.content.pm.PackageInfo] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aox] */
    /* JADX WARN: Type inference failed for: r4v12, types: [aox] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [aox] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        aoy[] aoyVarArr;
        ?? r18;
        ?? r4;
        byte[] bArr;
        ?? r1;
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr2;
        int i;
        ?? r19;
        ?? r110;
        ?? r5;
        Throwable th2;
        ?? M275h;
        PackageInfo packageInfo;
        ?? r6;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        InputStream inputStreamM1782c;
        IOException iOException;
        AmbientMode.AmbientController ambientController;
        aoy[] aoyVarArr2;
        aoy[] aoyVarArr3;
        aox aoxVar;
        int i2;
        aoy aoyVar;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        boolean z = false;
        if (!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                    AmbientMode.AmbientController ambientController2 = new AmbientMode.AmbientController(this);
                    Process.sendSignal(Process.myPid(), 10);
                    ambientController2.m1628a(12, null);
                    return;
                } else {
                    if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                        return;
                    }
                    String string = extras.getString(CswIK.PoomRRrMriYY);
                    AmbientMode.AmbientController ambientController3 = new AmbientMode.AmbientController(this);
                    if (!"DROP_SHADER_CACHE".equals(string)) {
                        ambientController3.m1628a(16, null);
                        return;
                    } else if (acz.m258e(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                        ambientController3.m1628a(14, null);
                        return;
                    } else {
                        ambientController3.m1628a(15, null);
                        return;
                    }
                }
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string2 = extras2.getString(qQLA.EaIIGfDlKTUph);
                if (!qQLA.tLKYLTD.equals(string2)) {
                    if ("DELETE_SKIP_FILE".equals(string2)) {
                        ExecutorC0932qj executorC0932qj = ExecutorC0932qj.f47485a;
                        AmbientMode.AmbientController ambientController4 = new AmbientMode.AmbientController(this);
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        adh.m287c(executorC0932qj, ambientController4, 11, null);
                        return;
                    }
                    return;
                }
                ExecutorC0932qj executorC0932qj2 = ExecutorC0932qj.f47485a;
                AmbientMode.AmbientController ambientController5 = new AmbientMode.AmbientController(this);
                try {
                    adh.m286b(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    adh.m287c(executorC0932qj2, ambientController5, 10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    adh.m287c(executorC0932qj2, ambientController5, 7, e);
                    return;
                }
            }
            return;
        }
        ExecutorC0932qj executorC0932qj3 = ExecutorC0932qj.f47485a;
        AmbientMode.AmbientController ambientController6 = new AmbientMode.AmbientController(this);
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            context.getPackageName();
            aox aoxVar2 = new aox(assets, executorC0932qj3, ambientController6, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"), null);
            if (aoxVar2.f1942b == null) {
                aoxVar2.m1784b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else if (aoxVar2.f1943c.canWrite()) {
                aoxVar2.f1947g = true;
                aoxVar2.m1783a();
                if (aoxVar2.f1942b != null) {
                    try {
                        inputStreamM1782c = aox.m1782c(aoxVar2.f1941a, aoxVar2.f1945e);
                    } catch (FileNotFoundException e2) {
                        aoxVar2.f1950j.m1628a(6, e2);
                        inputStreamM1782c = null;
                    } catch (IOException e3) {
                        aoxVar2.f1950j.m1628a(7, e3);
                        inputStreamM1782c = null;
                    }
                    try {
                        if (inputStreamM1782c != null) {
                            try {
                                byte[] bArrM1791f = apa.m1791f(inputStreamM1782c, apa.f1973a);
                                String str = aoxVar2.f1944d;
                                if (!Arrays.equals(bArrM1791f, ape.f1983b)) {
                                    throw ade.m274g("Unsupported version");
                                }
                                int iM270c = ade.m270c(inputStreamM1782c);
                                byte[] bArrM284q = ade.m284q(inputStreamM1782c, (int) ade.m273f(inputStreamM1782c), (int) ade.m273f(inputStreamM1782c));
                                if (inputStreamM1782c.read() > 0) {
                                    throw ade.m274g("Content found after the end of file");
                                }
                                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM284q);
                                try {
                                    if (byteArrayInputStream2.available() != 0) {
                                        aoy[] aoyVarArr4 = new aoy[iM270c];
                                        int i3 = 0;
                                        while (i3 < iM270c) {
                                            int iM269b = ade.m269b(byteArrayInputStream2);
                                            int iM269b2 = ade.m269b(byteArrayInputStream2);
                                            long jM273f = ade.m273f(byteArrayInputStream2);
                                            long jM273f2 = ade.m273f(byteArrayInputStream2);
                                            aoy[] aoyVarArr5 = aoyVarArr4;
                                            long jM273f3 = ade.m273f(byteArrayInputStream2);
                                            M275h = ade.m275h(byteArrayInputStream2, iM269b);
                                            r19 = str;
                                            aoyVarArr5[i3] = new aoy(r19, M275h, jM273f2, iM269b2, (int) jM273f, (int) jM273f3, new int[iM269b2], new TreeMap());
                                            i3++;
                                            iM270c = iM270c;
                                            aoyVarArr4 = aoyVarArr5;
                                        }
                                        aoyVarArr3 = aoyVarArr4;
                                        int i4 = iM270c;
                                        int i5 = 0;
                                        while (true) {
                                            int i6 = i4;
                                            if (i5 >= i6) {
                                                break;
                                            }
                                            aoy aoyVar2 = aoyVarArr3[i5];
                                            int iAvailable = byteArrayInputStream2.available() - aoyVar2.f1957f;
                                            int i7 = 0;
                                            while (byteArrayInputStream2.available() > iAvailable) {
                                                int iM269b3 = ade.m269b(byteArrayInputStream2) + i7;
                                                int i8 = i6;
                                                aoyVar2.f1960i.put(Integer.valueOf(iM269b3), 1);
                                                for (int iM269b4 = ade.m269b(byteArrayInputStream2); iM269b4 > 0; iM269b4--) {
                                                    ade.m269b(byteArrayInputStream2);
                                                    int iM270c2 = ade.m270c(byteArrayInputStream2);
                                                    if (iM270c2 != 6 && iM270c2 != 7) {
                                                        while (iM270c2 > 0) {
                                                            ade.m270c(byteArrayInputStream2);
                                                            for (int iM270c3 = ade.m270c(byteArrayInputStream2); iM270c3 > 0; iM270c3--) {
                                                                ade.m269b(byteArrayInputStream2);
                                                            }
                                                            iM270c2--;
                                                        }
                                                    }
                                                }
                                                i7 = iM269b3;
                                                i6 = i8;
                                            }
                                            i4 = i6;
                                            if (byteArrayInputStream2.available() != iAvailable) {
                                                throw ade.m274g("Read too much data during profile line parse");
                                            }
                                            aoyVar2.f1959h = apa.m1792g(byteArrayInputStream2, aoyVar2.f1956e);
                                            int i9 = aoyVar2.f1958g;
                                            BitSet bitSetValueOf = BitSet.valueOf(ade.m283p(byteArrayInputStream2, (((i9 + i9) + 7) & (-8)) / 8));
                                            int i10 = 0;
                                            while (true) {
                                                int i11 = aoyVar2.f1958g;
                                                if (i10 < i11) {
                                                    int i12 = true != bitSetValueOf.get(i10) ? 0 : 2;
                                                    if (bitSetValueOf.get(i11 + i10)) {
                                                        i12 |= 4;
                                                    }
                                                    if (i12 != 0) {
                                                        TreeMap treeMap = aoyVar2.f1960i;
                                                        Integer numValueOf = Integer.valueOf(i10);
                                                        Integer num = (Integer) treeMap.get(numValueOf);
                                                        if (num == null) {
                                                            num = 0;
                                                        }
                                                        aoyVar2.f1960i.put(numValueOf, Integer.valueOf(num.intValue() | i12));
                                                    }
                                                    i10++;
                                                }
                                            }
                                            i5++;
                                        }
                                    } else {
                                        aoyVarArr3 = new aoy[0];
                                    }
                                    byteArrayInputStream2.close();
                                    try {
                                        inputStreamM1782c.close();
                                    } catch (IOException e4) {
                                        aoxVar2.f1950j.m1628a(7, e4);
                                    }
                                    aoyVarArr2 = aoyVarArr3;
                                    aoxVar2.f1948h = aoyVarArr2;
                                } catch (Throwable th6) {
                                    try {
                                        byteArrayInputStream2.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                        throw th6;
                                    }
                                }
                            } catch (IOException e5) {
                                aoxVar2.f1950j.m1628a(7, e5);
                                try {
                                    inputStreamM1782c.close();
                                    aoyVarArr2 = null;
                                } catch (IOException e6) {
                                    iOException = e6;
                                    ambientController = aoxVar2.f1950j;
                                    ambientController.m1628a(7, iOException);
                                    aoyVarArr2 = null;
                                }
                            } catch (IllegalStateException e7) {
                                aoxVar2.f1950j.m1628a(8, e7);
                                try {
                                    inputStreamM1782c.close();
                                    aoyVarArr2 = null;
                                } catch (IOException e8) {
                                    iOException = e8;
                                    ambientController = aoxVar2.f1950j;
                                    ambientController.m1628a(7, iOException);
                                    aoyVarArr2 = null;
                                }
                            }
                        }
                        aoy[] aoyVarArr6 = aoxVar2.f1948h;
                        if (aoyVarArr6 != null && Build.VERSION.SDK_INT <= 33) {
                            switch (Build.VERSION.SDK_INT) {
                                case 33:
                                    byte[] bArr3 = aoxVar2.f1942b;
                                    try {
                                        InputStream inputStreamM1782c2 = aox.m1782c(aoxVar2.f1941a, aoxVar2.f1946f);
                                        if (inputStreamM1782c2 != null) {
                                            try {
                                                byte[] bArrM1791f2 = apa.m1791f(inputStreamM1782c2, apa.f1974b);
                                                if (Arrays.equals(bArrM1791f2, ape.f1987f)) {
                                                    if (Arrays.equals(ape.f1982a, bArr3)) {
                                                        throw ade.m274g("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
                                                    }
                                                    if (!Arrays.equals(bArrM1791f2, ape.f1987f)) {
                                                        throw ade.m274g("Unsupported meta version");
                                                    }
                                                    int iM270c4 = ade.m270c(inputStreamM1782c2);
                                                    byte[] bArrM284q2 = ade.m284q(inputStreamM1782c2, (int) ade.m273f(inputStreamM1782c2), (int) ade.m273f(inputStreamM1782c2));
                                                    if (inputStreamM1782c2.read() > 0) {
                                                        throw ade.m274g("Content found after the end of file");
                                                    }
                                                    ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArrM284q2);
                                                    try {
                                                        if (byteArrayInputStream3.available() == 0) {
                                                            aoyVarArr6 = new aoy[0];
                                                        } else {
                                                            if (iM270c4 != aoyVarArr6.length) {
                                                                throw ade.m274g("Mismatched number of dex files found in metadata");
                                                            }
                                                            String[] strArr = new String[iM270c4];
                                                            int[] iArr = new int[iM270c4];
                                                            for (int i13 = 0; i13 < iM270c4; i13++) {
                                                                int iM269b5 = ade.m269b(byteArrayInputStream3);
                                                                iArr[i13] = ade.m269b(byteArrayInputStream3);
                                                                strArr[i13] = ade.m275h(byteArrayInputStream3, iM269b5);
                                                            }
                                                            for (int i14 = 0; i14 < iM270c4; i14++) {
                                                                aoy aoyVar3 = aoyVarArr6[i14];
                                                                if (!aoyVar3.f1953b.equals(strArr[i14])) {
                                                                    throw ade.m274g("Order of dexfiles in metadata did not match baseline");
                                                                }
                                                                int i15 = iArr[i14];
                                                                aoyVar3.f1956e = i15;
                                                                aoyVar3.f1959h = apa.m1792g(byteArrayInputStream3, i15);
                                                            }
                                                        }
                                                        byteArrayInputStream3.close();
                                                    } catch (Throwable th8) {
                                                        try {
                                                            byteArrayInputStream3.close();
                                                            throw th8;
                                                        } catch (Throwable th9) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                                                            throw th8;
                                                        }
                                                    }
                                                } else {
                                                    if (!Arrays.equals(bArrM1791f2, ape.f1988g)) {
                                                        throw ade.m274g("Unsupported meta version");
                                                    }
                                                    int iM269b6 = ade.m269b(inputStreamM1782c2);
                                                    byte[] bArrM284q3 = ade.m284q(inputStreamM1782c2, (int) ade.m273f(inputStreamM1782c2), (int) ade.m273f(inputStreamM1782c2));
                                                    if (inputStreamM1782c2.read() > 0) {
                                                        throw ade.m274g("Content found after the end of file");
                                                    }
                                                    ByteArrayInputStream byteArrayInputStream4 = new ByteArrayInputStream(bArrM284q3);
                                                    try {
                                                        if (byteArrayInputStream4.available() == 0) {
                                                            aoyVarArr6 = new aoy[0];
                                                        } else {
                                                            if (iM269b6 != aoyVarArr6.length) {
                                                                throw ade.m274g("Mismatched number of dex files found in metadata");
                                                            }
                                                            int i16 = 0;
                                                            while (i16 < iM269b6) {
                                                                ade.m269b(byteArrayInputStream4);
                                                                String strM275h = ade.m275h(byteArrayInputStream4, ade.m269b(byteArrayInputStream4));
                                                                long jM273f4 = ade.m273f(byteArrayInputStream4);
                                                                int iM269b7 = ade.m269b(byteArrayInputStream4);
                                                                if (aoyVarArr6.length <= 0) {
                                                                    i2 = iM269b6;
                                                                    aoyVar = null;
                                                                } else {
                                                                    int iIndexOf = strM275h.indexOf("!");
                                                                    if (iIndexOf < 0) {
                                                                        iIndexOf = strM275h.indexOf(":");
                                                                    }
                                                                    String strSubstring = iIndexOf > 0 ? strM275h.substring(iIndexOf + 1) : strM275h;
                                                                    i2 = iM269b6;
                                                                    int i17 = 0;
                                                                    while (true) {
                                                                        if (i17 >= aoyVarArr6.length) {
                                                                            aoyVar = null;
                                                                        } else if (aoyVarArr6[i17].f1953b.equals(strSubstring)) {
                                                                            aoyVar = aoyVarArr6[i17];
                                                                        } else {
                                                                            i17++;
                                                                        }
                                                                    }
                                                                }
                                                                if (aoyVar == null) {
                                                                    throw ade.m274g("Missing profile key: ".concat(strM275h));
                                                                }
                                                                aoyVar.f1955d = jM273f4;
                                                                int[] iArrM1792g = apa.m1792g(byteArrayInputStream4, iM269b7);
                                                                if (Arrays.equals(bArr3, ape.f1986e)) {
                                                                    aoyVar.f1956e = iM269b7;
                                                                    aoyVar.f1959h = iArrM1792g;
                                                                }
                                                                i16++;
                                                                iM269b6 = i2;
                                                            }
                                                        }
                                                        byteArrayInputStream4.close();
                                                    } catch (Throwable th10) {
                                                        try {
                                                            byteArrayInputStream4.close();
                                                            throw th10;
                                                        } catch (Throwable th11) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th10, th11);
                                                            throw th10;
                                                        }
                                                    }
                                                }
                                                aoxVar2.f1948h = aoyVarArr6;
                                                inputStreamM1782c2.close();
                                                aoxVar = aoxVar2;
                                            } catch (Throwable th12) {
                                                try {
                                                    inputStreamM1782c2.close();
                                                    throw th12;
                                                } catch (Throwable th13) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th12, th13);
                                                    throw th12;
                                                }
                                            }
                                        } else {
                                            aoxVar = null;
                                        }
                                    } catch (FileNotFoundException e9) {
                                        aoxVar2.f1950j.m1628a(9, e9);
                                        aoxVar = null;
                                    } catch (IOException e10) {
                                        aoxVar2.f1950j.m1628a(7, e10);
                                        aoxVar = null;
                                    } catch (IllegalStateException e11) {
                                        aoxVar2.f1948h = null;
                                        aoxVar2.f1950j.m1628a(8, e11);
                                        aoxVar = null;
                                    }
                                    if (aoxVar != null) {
                                        aoxVar2 = aoxVar;
                                        break;
                                    }
                                default:
                                    aoyVarArr = aoxVar2.f1948h;
                                    byte[] bArr4 = aoxVar2.f1942b;
                                    if (aoyVarArr != null || bArr4 == null) {
                                        r18 = packageInfo2;
                                        r4 = aoxVar2;
                                    } else {
                                        aoxVar2.m1783a();
                                        try {
                                            try {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(apa.f1973a);
                                                    byteArrayOutputStream.write(bArr4);
                                                    try {
                                                        try {
                                                            if (Arrays.equals(bArr4, ape.f1982a)) {
                                                                ArrayList arrayList = new ArrayList(3);
                                                                ArrayList arrayList2 = new ArrayList(3);
                                                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                                try {
                                                                    ade.m279l(byteArrayOutputStream2, aoyVarArr.length);
                                                                    int i18 = 2;
                                                                    for (aoy aoyVar4 : aoyVarArr) {
                                                                        try {
                                                                            ade.m280m(byteArrayOutputStream2, aoyVar4.f1954c);
                                                                            ade.m280m(byteArrayOutputStream2, aoyVar4.f1955d);
                                                                            ade.m280m(byteArrayOutputStream2, aoyVar4.f1958g);
                                                                            String strM1786a = apa.m1786a(aoyVar4.f1952a, aoyVar4.f1953b, ape.f1982a);
                                                                            int iM271d = ade.m271d(strM1786a);
                                                                            ade.m279l(byteArrayOutputStream2, iM271d);
                                                                            i18 = i18 + 14 + iM271d;
                                                                            ade.m277j(byteArrayOutputStream2, strM1786a);
                                                                        } catch (Throwable th14) {
                                                                            th3 = th14;
                                                                            M275h = aoxVar2;
                                                                        }
                                                                    }
                                                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                                                    int length = byteArray.length;
                                                                    if (i18 == length) {
                                                                        msa msaVar = new msa(aoz.DEX_FILES, byteArray, false);
                                                                        byteArrayOutputStream2.close();
                                                                        arrayList.add(msaVar);
                                                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                                                        int i19 = 0;
                                                                        for (int i20 = 0; i20 < aoyVarArr.length; i20++) {
                                                                            try {
                                                                                try {
                                                                                    aoy aoyVar5 = aoyVarArr[i20];
                                                                                    ade.m279l(byteArrayOutputStream3, i20);
                                                                                    ade.m279l(byteArrayOutputStream3, aoyVar5.f1956e);
                                                                                    int i21 = aoyVar5.f1956e;
                                                                                    i19 = i19 + 4 + i21 + i21;
                                                                                    apa.m1787b(byteArrayOutputStream3, aoyVar5);
                                                                                } catch (Throwable th15) {
                                                                                    th4 = th15;
                                                                                    M275h = aoxVar2;
                                                                                }
                                                                            } catch (Throwable th16) {
                                                                                th = th16;
                                                                            }
                                                                        }
                                                                        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                                                        int length2 = byteArray2.length;
                                                                        if (i19 == length2) {
                                                                            msa msaVar2 = new msa(aoz.CLASSES, byteArray2, true);
                                                                            byteArrayOutputStream3.close();
                                                                            arrayList.add(msaVar2);
                                                                            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                                                            int i22 = 0;
                                                                            int i23 = 0;
                                                                            ?? r7 = aoxVar2;
                                                                            ?? r111 = M275h;
                                                                            while (i22 < aoyVarArr.length) {
                                                                                try {
                                                                                    aoy aoyVar6 = aoyVarArr[i22];
                                                                                    Iterator it = aoyVar6.f1960i.entrySet().iterator();
                                                                                    int iIntValue = 0;
                                                                                    while (it.hasNext()) {
                                                                                        try {
                                                                                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                                                                        } catch (Throwable th17) {
                                                                                            th5 = th17;
                                                                                            M275h = r7;
                                                                                            try {
                                                                                                byteArrayOutputStream4.close();
                                                                                                throw th5;
                                                                                            } catch (Throwable th18) {
                                                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th18);
                                                                                                throw th5;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                                                                    try {
                                                                                        apa.m1788c(byteArrayOutputStream5, aoyVar6);
                                                                                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                                                                                        byteArrayOutputStream5.close();
                                                                                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                                                                                        try {
                                                                                            apa.m1789d(byteArrayOutputStream6, aoyVar6);
                                                                                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                                                                            byteArrayOutputStream6.close();
                                                                                            ade.m279l(byteArrayOutputStream4, i22);
                                                                                            PackageInfo packageInfo3 = packageInfo2;
                                                                                            try {
                                                                                                int length3 = byteArray3.length + 2 + byteArray4.length;
                                                                                                int i24 = i23 + 6;
                                                                                                r111 = r7;
                                                                                                try {
                                                                                                    ade.m280m(byteArrayOutputStream4, length3);
                                                                                                    ade.m279l(byteArrayOutputStream4, iIntValue);
                                                                                                    byteArrayOutputStream4.write(byteArray3);
                                                                                                    byteArrayOutputStream4.write(byteArray4);
                                                                                                    i23 = i24 + length3;
                                                                                                    i22++;
                                                                                                    packageInfo2 = packageInfo3;
                                                                                                    r7 = r111;
                                                                                                    r111 = r111;
                                                                                                } catch (Throwable th19) {
                                                                                                    th = th19;
                                                                                                    th5 = th;
                                                                                                    M275h = r111;
                                                                                                    byteArrayOutputStream4.close();
                                                                                                    throw th5;
                                                                                                }
                                                                                            } catch (Throwable th20) {
                                                                                                th = th20;
                                                                                                r111 = r7;
                                                                                                th5 = th;
                                                                                                M275h = r111;
                                                                                                byteArrayOutputStream4.close();
                                                                                                throw th5;
                                                                                            }
                                                                                        } catch (Throwable th21) {
                                                                                            r111 = r7;
                                                                                            try {
                                                                                                byteArrayOutputStream6.close();
                                                                                                throw th21;
                                                                                            } catch (Throwable th22) {
                                                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th21, th22);
                                                                                                throw th21;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th23) {
                                                                                        r111 = r7;
                                                                                        try {
                                                                                            byteArrayOutputStream5.close();
                                                                                            throw th23;
                                                                                        } catch (Throwable th24) {
                                                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th23, th24);
                                                                                            throw th23;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th25) {
                                                                                    th = th25;
                                                                                }
                                                                            }
                                                                            packageInfo = packageInfo2;
                                                                            ?? r112 = r7;
                                                                            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                                                                            int length4 = byteArray5.length;
                                                                            if (i23 != length4) {
                                                                                throw ade.m274g("Expected size " + i23 + ", does not match actual size " + length4);
                                                                            }
                                                                            msa msaVar3 = new msa(aoz.METHODS, byteArray5, true);
                                                                            byteArrayOutputStream4.close();
                                                                            arrayList.add(msaVar3);
                                                                            int size = arrayList.size() * 16;
                                                                            ade.m280m(byteArrayOutputStream, arrayList.size());
                                                                            long length5 = ((long) size) + 12;
                                                                            for (int i25 = 0; i25 < arrayList.size(); i25++) {
                                                                                msa msaVar4 = (msa) arrayList.get(i25);
                                                                                ade.m280m(byteArrayOutputStream, ((aoz) msaVar4.f41503c).f1967f);
                                                                                ade.m280m(byteArrayOutputStream, length5);
                                                                                if (msaVar4.f41501a) {
                                                                                    Object obj = msaVar4.f41502b;
                                                                                    long length6 = ((byte[]) obj).length;
                                                                                    byte[] bArrM282o = ade.m282o((byte[]) obj);
                                                                                    arrayList2.add(bArrM282o);
                                                                                    long length7 = bArrM282o.length;
                                                                                    ade.m280m(byteArrayOutputStream, length7);
                                                                                    ade.m280m(byteArrayOutputStream, length6);
                                                                                    length5 += length7;
                                                                                } else {
                                                                                    arrayList2.add(msaVar4.f41502b);
                                                                                    ade.m280m(byteArrayOutputStream, ((byte[]) msaVar4.f41502b).length);
                                                                                    ade.m280m(byteArrayOutputStream, 0L);
                                                                                    length5 += (long) ((byte[]) msaVar4.f41502b).length;
                                                                                }
                                                                            }
                                                                            for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                                                                                byteArrayOutputStream.write((byte[]) arrayList2.get(i26));
                                                                            }
                                                                            r6 = r112;
                                                                        } else {
                                                                            try {
                                                                                throw ade.m274g("Expected size " + i19 + ", does not match actual size " + length2);
                                                                            } catch (Throwable th26) {
                                                                                th = th26;
                                                                            }
                                                                        }
                                                                        th4 = th;
                                                                        M275h = aoxVar2;
                                                                        try {
                                                                            byteArrayOutputStream3.close();
                                                                            throw th4;
                                                                        } catch (Throwable th27) {
                                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th27);
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                    try {
                                                                        throw ade.m274g("Expected size " + i18 + ", does not match actual size " + length);
                                                                    } catch (Throwable th28) {
                                                                        th = th28;
                                                                    }
                                                                } catch (Throwable th29) {
                                                                    th = th29;
                                                                }
                                                                th3 = th;
                                                                M275h = aoxVar2;
                                                                try {
                                                                    byteArrayOutputStream2.close();
                                                                    throw th3;
                                                                } catch (Throwable th30) {
                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th30);
                                                                    throw th3;
                                                                }
                                                            }
                                                            packageInfo = packageInfo2;
                                                            aox aoxVar3 = aoxVar2;
                                                            try {
                                                                if (Arrays.equals(bArr4, ape.f1983b)) {
                                                                    byte[] bArrM1790e = apa.m1790e(aoyVarArr, ape.f1983b);
                                                                    ade.m281n(byteArrayOutputStream, aoyVarArr.length);
                                                                    ade.m276i(byteArrayOutputStream, bArrM1790e);
                                                                    r6 = aoxVar3;
                                                                } else if (Arrays.equals(bArr4, ape.f1985d)) {
                                                                    ade.m281n(byteArrayOutputStream, aoyVarArr.length);
                                                                    for (aoy aoyVar7 : aoyVarArr) {
                                                                        int size2 = aoyVar7.f1960i.size() * 4;
                                                                        String strM1786a2 = apa.m1786a(aoyVar7.f1952a, aoyVar7.f1953b, ape.f1985d);
                                                                        ade.m279l(byteArrayOutputStream, ade.m271d(strM1786a2));
                                                                        ade.m279l(byteArrayOutputStream, aoyVar7.f1959h.length);
                                                                        ade.m280m(byteArrayOutputStream, size2);
                                                                        ade.m280m(byteArrayOutputStream, aoyVar7.f1954c);
                                                                        ade.m277j(byteArrayOutputStream, strM1786a2);
                                                                        Iterator it2 = aoyVar7.f1960i.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            ade.m279l(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                                                                            ade.m279l(byteArrayOutputStream, 0);
                                                                        }
                                                                        for (int i27 : aoyVar7.f1959h) {
                                                                            ade.m279l(byteArrayOutputStream, i27);
                                                                        }
                                                                    }
                                                                    r6 = aoxVar3;
                                                                } else if (Arrays.equals(bArr4, ape.f1984c)) {
                                                                    byte[] bArrM1790e2 = apa.m1790e(aoyVarArr, ape.f1984c);
                                                                    ade.m281n(byteArrayOutputStream, aoyVarArr.length);
                                                                    ade.m276i(byteArrayOutputStream, bArrM1790e2);
                                                                    r6 = aoxVar3;
                                                                } else if (Arrays.equals(bArr4, ape.f1986e)) {
                                                                    r6 = aoxVar3;
                                                                    ade.m279l(byteArrayOutputStream, aoyVarArr.length);
                                                                    for (aoy aoyVar8 : aoyVarArr) {
                                                                        String strM1786a3 = apa.m1786a(aoyVar8.f1952a, aoyVar8.f1953b, ape.f1986e);
                                                                        ade.m279l(byteArrayOutputStream, ade.m271d(strM1786a3));
                                                                        ade.m279l(byteArrayOutputStream, aoyVar8.f1960i.size());
                                                                        ade.m279l(byteArrayOutputStream, aoyVar8.f1959h.length);
                                                                        ade.m280m(byteArrayOutputStream, aoyVar8.f1954c);
                                                                        ade.m277j(byteArrayOutputStream, strM1786a3);
                                                                        Iterator it3 = aoyVar8.f1960i.keySet().iterator();
                                                                        while (it3.hasNext()) {
                                                                            ade.m279l(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                                                                        }
                                                                        for (int i28 : aoyVar8.f1959h) {
                                                                            ade.m279l(byteArrayOutputStream, i28);
                                                                        }
                                                                    }
                                                                } else {
                                                                    aox aoxVar4 = aoxVar3;
                                                                    aoxVar4.f1950j.m1628a(5, null);
                                                                    aoxVar4.f1948h = null;
                                                                    byteArrayOutputStream.close();
                                                                    r4 = aoxVar4;
                                                                    r18 = packageInfo;
                                                                }
                                                            } catch (Throwable th31) {
                                                                th = th31;
                                                                th2 = th;
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                    throw th2;
                                                                } catch (Throwable th32) {
                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th32);
                                                                    throw th2;
                                                                }
                                                            }
                                                            r6.f1949i = byteArrayOutputStream.toByteArray();
                                                            byteArrayOutputStream.close();
                                                            r5 = r6;
                                                            r110 = packageInfo;
                                                        } catch (Throwable th33) {
                                                            th2 = th33;
                                                            byteArrayOutputStream.close();
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th34) {
                                                        th = th34;
                                                    }
                                                } catch (Throwable th35) {
                                                    th = th35;
                                                }
                                            } catch (IOException e12) {
                                                e = e12;
                                                aoxVar2.f1950j.m1628a(7, e);
                                                r5 = aoxVar2;
                                                r110 = r19;
                                            } catch (IllegalStateException e13) {
                                                e = e13;
                                                aoxVar2.f1950j.m1628a(8, e);
                                                r5 = aoxVar2;
                                                r110 = r19;
                                            }
                                        } catch (IOException e14) {
                                            e = e14;
                                            r19 = packageInfo2;
                                            aoxVar2.f1950j.m1628a(7, e);
                                            r5 = aoxVar2;
                                            r110 = r19;
                                        } catch (IllegalStateException e15) {
                                            e = e15;
                                            r19 = packageInfo2;
                                            aoxVar2.f1950j.m1628a(8, e);
                                            r5 = aoxVar2;
                                            r110 = r19;
                                        }
                                        r5.f1948h = null;
                                        r4 = r5;
                                        r18 = r110;
                                    }
                                    bArr = r4.f1949i;
                                    if (bArr == null) {
                                        r4.m1783a();
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    fileOutputStream = new FileOutputStream(r4.f1943c);
                                                    try {
                                                        bArr2 = new byte[512];
                                                        while (true) {
                                                            i = byteArrayInputStream.read(bArr2);
                                                            if (i > 0) {
                                                                fileOutputStream.write(bArr2, 0, i);
                                                            } else {
                                                                r4.m1784b(1, null);
                                                                fileOutputStream.close();
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    r4.f1949i = null;
                                                                    r4.f1948h = null;
                                                                    adh.m286b(r18, filesDir);
                                                                    z = true;
                                                                } catch (Throwable th36) {
                                                                    th = th36;
                                                                    r1 = 0;
                                                                    r4.f1949i = r1;
                                                                    r4.f1948h = r1;
                                                                    throw th;
                                                                }
                                                            }
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th;
                                                            } catch (Throwable th37) {
                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th37);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th38) {
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th38;
                                                        } catch (Throwable th39) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th38, th39);
                                                            throw th38;
                                                        }
                                                    }
                                                } catch (Throwable th40) {
                                                    byteArrayInputStream.close();
                                                    throw th40;
                                                }
                                            } catch (Throwable th41) {
                                                th = th41;
                                                r1 = 0;
                                            }
                                        } catch (FileNotFoundException e16) {
                                            try {
                                                r4.m1784b(6, e16);
                                                r4.f1949i = null;
                                                r4.f1948h = null;
                                                z = false;
                                            } catch (Throwable th42) {
                                                r1 = 0;
                                                th = th42;
                                                r4.f1949i = r1;
                                                r4.f1948h = r1;
                                                throw th;
                                            }
                                            break;
                                        } catch (IOException e17) {
                                            r4.m1784b(7, e17);
                                            r4.f1949i = null;
                                            r4.f1948h = null;
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } catch (Throwable th43) {
                        try {
                            inputStreamM1782c.close();
                            throw th43;
                        } catch (IOException e18) {
                            aoxVar2.f1950j.m1628a(7, e18);
                            throw th43;
                        }
                    }
                }
                aoyVarArr = aoxVar2.f1948h;
                byte[] bArr5 = aoxVar2.f1942b;
                if (aoyVarArr != null) {
                    r18 = packageInfo2;
                    r4 = aoxVar2;
                } else {
                    r18 = packageInfo2;
                    r4 = aoxVar2;
                }
                bArr = r4.f1949i;
                if (bArr == null) {
                    r4.m1783a();
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    fileOutputStream = new FileOutputStream(r4.f1943c);
                    bArr2 = new byte[512];
                    while (true) {
                        i = byteArrayInputStream.read(bArr2);
                        if (i > 0) {
                            fileOutputStream.write(bArr2, 0, i);
                        } else {
                            r4.m1784b(1, null);
                            fileOutputStream.close();
                            byteArrayInputStream.close();
                            r4.f1949i = null;
                            r4.f1948h = null;
                            adh.m286b(r18, filesDir);
                            z = true;
                        }
                        byteArrayInputStream.close();
                        throw th40;
                    }
                }
                z = false;
            } else {
                aoxVar2.m1784b(4, null);
            }
            apd.m1799a(context, z);
        } catch (PackageManager.NameNotFoundException e19) {
            ambientController6.m1628a(7, e19);
            apd.m1799a(context, false);
        }
    }
}
