package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p326q.C8452h;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2741l4 {

    /* JADX INFO: renamed from: a */
    public static volatile zzii f14299a;

    /* JADX INFO: renamed from: a */
    public static zzii m8048a(Context context) {
        zzii zziiVar;
        zzii zzikVar;
        zzii zzikVar2;
        synchronized (C2741l4.class) {
            try {
                zziiVar = f14299a;
                if (zziiVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        if (!context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zzikVar = file.exists() ? new zzik(file) : zzie.f14537a;
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                zzikVar = zzie.f14537a;
                            }
                            if (zzikVar.mo8477b()) {
                                File file2 = (File) zzikVar.mo8476a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        C8452h c8452h = new C8452h();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", "Invalid: " + line);
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!c8452h.containsKey(str3)) {
                                                    c8452h.put(str3, new C8452h());
                                                }
                                                ((C8452h) c8452h.getOrDefault(str3, null)).put(strDecode, strDecode2);
                                            }
                                        }
                                        Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                        C2699i4 c2699i4 = new C2699i4(c8452h);
                                        bufferedReader.close();
                                        zzikVar2 = new zzik(c2699i4);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th3) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                zzikVar2 = zzie.f14537a;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            zziiVar = zzikVar2;
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        zziiVar = zzie.f14537a;
                    }
                    f14299a = zziiVar;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return zziiVar;
    }
}
