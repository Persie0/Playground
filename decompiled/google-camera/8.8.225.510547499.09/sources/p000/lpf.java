package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpf {

    /* JADX INFO: renamed from: a */
    private static volatile mrm f38885a = null;

    private lpf() {
    }

    /* JADX INFO: renamed from: a */
    public static mrm m15820a(Context context) {
        mrm mrmVar;
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        synchronized (lpf.class) {
            mrmVar = f38885a;
            if (mrmVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals(aJFPpVSaoDO.olQZnvZdLCLfzB)) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    Context contextM14886a = kuh.m14886a(context);
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextM14886a.getDir("phenotype_hermetic", 0), "overrides.txt");
                            mrmVarM16829i = file.exists() ? mrm.m16829i(file) : mqu.f41450a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            mrmVarM16829i = mqu.f41450a;
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            File file2 = (File) mrmVarM16829i.mo16809c();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    C1117xf c1117xf = new C1117xf();
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
                                            String strM15685e = lle.m15685e(strArrSplit[0]);
                                            String strDecode = Uri.decode(lle.m15685e(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String strM15685e2 = lle.m15685e(strArrSplit[2]);
                                                strDecode2 = Uri.decode(strM15685e2);
                                                if (strDecode2.length() < 1024 || strDecode2 == strM15685e2) {
                                                    map.put(strM15685e2, strDecode2);
                                                }
                                            }
                                            if (!c1117xf.containsKey(strM15685e)) {
                                                c1117xf.put(strM15685e, new C1117xf());
                                            }
                                            ((C1117xf) c1117xf.get(strM15685e)).put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + contextM14886a.getPackageName());
                                    liv livVar = new liv(c1117xf);
                                    bufferedReader.close();
                                    mrmVarM16829i2 = mrm.m16829i(livVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        } catch (Exception e2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                throw new RuntimeException(e3);
                            }
                        } else {
                            mrmVarM16829i2 = mqu.f41450a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        mrmVar = mrmVarM16829i2;
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    mrmVar = mqu.f41450a;
                }
                f38885a = mrmVar;
            }
        }
        return mrmVar;
    }
}
