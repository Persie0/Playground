package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xq1 {

    /* JADX INFO: renamed from: f */
    public static final HashMap f68526f;

    /* JADX INFO: renamed from: g */
    public static final String f68527g;

    /* JADX INFO: renamed from: a */
    public final Context f68528a;

    /* JADX INFO: renamed from: b */
    public final dz3 f68529b;

    /* JADX INFO: renamed from: c */
    public final xg1 f68530c;

    /* JADX INFO: renamed from: d */
    public final bl2 f68531d;

    /* JADX INFO: renamed from: e */
    public final C1150a f68532e;

    static {
        HashMap map = new HashMap();
        f68526f = map;
        AbstractC3393o1.m17750y(5, map, "armeabi", 6, "armeabi-v7a");
        AbstractC3393o1.m17750y(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f68527g = "Crashlytics Android SDK/20.0.6";
    }

    public xq1(Context context, dz3 dz3Var, xg1 xg1Var, bl2 bl2Var, C1150a c1150a) {
        this.f68528a = context;
        this.f68529b = dz3Var;
        this.f68530c = xg1Var;
        this.f68531d = bl2Var;
        this.f68532e = c1150a;
    }

    /* JADX INFO: renamed from: c */
    public static q30 m24638c(ny8 ny8Var, int i) {
        String str = (String) ny8Var.f53415c;
        String str2 = (String) ny8Var.f53414b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) ny8Var.f53416d;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ny8 ny8Var2 = (ny8) ny8Var.f53417e;
        if (i >= 8) {
            ny8 ny8Var3 = ny8Var2;
            while (ny8Var3 != null) {
                ny8Var3 = (ny8) ny8Var3.f53417e;
                i2++;
            }
        }
        int i3 = i2;
        List listM24639d = m24639d(stackTraceElementArr, 4);
        if (listM24639d == null) {
            C3386nv.m17635v("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        q30 q30VarM24638c = (ny8Var2 == null || i3 != 0) ? null : m24638c(ny8Var2, i + 1);
        if (b == 1) {
            return new q30(str, str2, listM24639d, q30VarM24638c, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static List m24639d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            t30 t30Var = new t30();
            t30Var.f61784e = i;
            t30Var.f61785f = (byte) (t30Var.f61785f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            t30Var.f61780a = jMax;
            byte b = (byte) (t30Var.f61785f | 1);
            t30Var.f61781b = str;
            t30Var.f61782c = fileName;
            t30Var.f61783d = lineNumber;
            t30Var.f61785f = (byte) (b | 2);
            arrayList.add(t30Var.m21825a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static r30 m24640e() {
        return new r30(0L, "0", "0");
    }

    /* JADX INFO: renamed from: a */
    public final List m24641a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        xg1 xg1Var = this.f68530c;
        String str = (String) xg1Var.f68170e;
        if (str == null) {
            C3386nv.m17635v("Null name");
            return null;
        }
        String str2 = (String) xg1Var.f68167b;
        if (b == 3) {
            return Collections.singletonList(new p30(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    /* JADX INFO: renamed from: b */
    public final y30 m24642b(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.f68528a;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!pb1.m19019G() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jM19043m = pb1.m19043m(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jM19043m - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                x30 x30Var = new x30();
                x30Var.f67687a = dValueOf;
                x30Var.f67688b = i2;
                byte b = (byte) (x30Var.f67693g | 1);
                x30Var.f67689c = z2;
                x30Var.f67690d = i;
                x30Var.f67691e = j;
                x30Var.f67692f = blockCount;
                x30Var.f67693g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return x30Var.m24252a();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!pb1.m19019G()) {
            z2 = true;
        }
        long jM19043m2 = pb1.m19043m(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jM19043m2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        x30 x30Var2 = new x30();
        x30Var2.f67687a = dValueOf;
        x30Var2.f67688b = i2;
        byte b2 = (byte) (x30Var2.f67693g | 1);
        x30Var2.f67689c = z2;
        x30Var2.f67690d = i;
        x30Var2.f67691e = j;
        x30Var2.f67692f = blockCount2;
        x30Var2.f67693g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return x30Var2.m24252a();
    }
}
