package p262mb;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p176ib.C6272i;

/* JADX INFO: renamed from: mb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7531d {

    /* JADX INFO: renamed from: a */
    public static String f41603a;

    /* JADX INFO: renamed from: b */
    public static int f41604b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static String m15043a() throws Throwable {
        String strTrim;
        if (f41603a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f41603a = Application.getProcessName();
            } else {
                int iMyPid = f41604b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f41604b = iMyPid;
                }
                String str = null;
                BufferedReader bufferedReader = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str2 = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str2));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader3.readLine();
                                C6272i.m12915i(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                                strTrim = null;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader3;
                                C7530c.m15042a(bufferedReader2);
                                throw th;
                            }
                            bufferedReader = bufferedReader3;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } catch (IOException unused2) {
                        strTrim = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    C7530c.m15042a(bufferedReader);
                    str = strTrim;
                }
                f41603a = str;
            }
        }
        return f41603a;
    }
}
