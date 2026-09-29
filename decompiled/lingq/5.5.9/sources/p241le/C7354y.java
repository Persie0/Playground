package p241le;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import ne.AbstractC7743b0;
import ne.C7745c0;
import ne.C7758o;
import ne.C7759p;
import ne.C7761r;
import ne.C7762s;
import ne.C7763t;
import p023b2.C1292a;
import p105f0.C5454b;
import p399te.InterfaceC9279a;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: le.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7354y {

    /* JADX INFO: renamed from: f */
    public static final HashMap f41110f;

    /* JADX INFO: renamed from: g */
    public static final String f41111g;

    /* JADX INFO: renamed from: a */
    public final Context f41112a;

    /* JADX INFO: renamed from: b */
    public final C7331e0 f41113b;

    /* JADX INFO: renamed from: c */
    public final C7322a f41114c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9279a f41115d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8996f f41116e;

    static {
        HashMap map = new HashMap();
        f41110f = map;
        C0141b.m618n(5, map, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        f41111g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.6");
    }

    public C7354y(Context context, C7331e0 c7331e0, C7322a c7322a, C5454b c5454b, C3215a c3215a) {
        this.f41112a = context;
        this.f41113b = c7331e0;
        this.f41114c = c7322a;
        this.f41115d = c5454b;
        this.f41116e = c3215a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static C7759p m14759c(C1292a c1292a, int i10) {
        String str = (String) c1292a.f8004b;
        String str2 = (String) c1292a.f8003a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c1292a.f8005c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C1292a c1292a2 = (C1292a) c1292a.f8006d;
        if (i10 >= 8) {
            C1292a c1292a3 = c1292a2;
            while (c1292a3 != null) {
                c1292a3 = (C1292a) c1292a3.f8006d;
                i11++;
            }
        }
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        C7745c0 c7745c0 = new C7745c0(m14760d(stackTraceElementArr, 4));
        Integer numValueOf = Integer.valueOf(i11);
        C7759p c7759pM14759c = null;
        if (c1292a2 != null && i11 == 0) {
            c7759pM14759c = m14759c(c1292a2, i10 + 1);
        }
        String strM765k = numValueOf == null ? C0166e.m765k("", " overflowCount") : "";
        if (strM765k.isEmpty()) {
            return new C7759p(str, str2, c7745c0, c7759pM14759c, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM765k));
    }

    /* JADX INFO: renamed from: d */
    public static C7745c0 m14760d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            C7762s.a aVar = new C7762s.a();
            aVar.f42651e = Integer.valueOf(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            aVar.f42647a = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            aVar.f42648b = str;
            aVar.f42649c = fileName;
            aVar.f42650d = Long.valueOf(lineNumber);
            arrayList.add(aVar.m15469a());
        }
        return new C7745c0(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static C7761r m14761e(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        Integer numValueOf = Integer.valueOf(i10);
        C7745c0 c7745c0 = new C7745c0(m14760d(stackTraceElementArr, i10));
        String strConcat = numValueOf == null ? "".concat(" importance") : "";
        if (strConcat.isEmpty()) {
            return new C7761r(name, numValueOf.intValue(), c7745c0);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10656a> m14762a() {
        AbstractC7743b0.e.d.a.b.AbstractC10656a[] abstractC10656aArr = new AbstractC7743b0.e.d.a.b.AbstractC10656a[1];
        C7758o.a aVar = new C7758o.a();
        aVar.f42627a = 0L;
        aVar.f42628b = 0L;
        C7322a c7322a = this.f41114c;
        String str = c7322a.f41017e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        aVar.f42629c = str;
        aVar.f42630d = c7322a.f41014b;
        abstractC10656aArr[0] = aVar.m15468a();
        return new C7745c0<>(Arrays.asList(abstractC10656aArr));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX INFO: renamed from: b */
    public final C7763t m14763b(int i10) {
        boolean z10;
        Float fValueOf;
        Context context = this.f41112a;
        int i11 = 2;
        Double dValueOf = null;
        boolean z11 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                    if (fValueOf != null) {
                        dValueOf = Double.valueOf(fValueOf.doubleValue());
                    }
                    if (z10) {
                    }
                    i11 = 1;
                    if (!CommonUtils.m9157i()) {
                        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                            z11 = true;
                        }
                    }
                    long jM9155g = CommonUtils.m9155g();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    long j10 = jM9155g - memoryInfo.availMem;
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                    long blockSize = statFs.getBlockSize();
                    long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                    C7763t.a aVar = new C7763t.a();
                    aVar.f42658a = dValueOf;
                    aVar.f42659b = Integer.valueOf(i11);
                    aVar.f42660c = Boolean.valueOf(z11);
                    aVar.f42661d = Integer.valueOf(i10);
                    aVar.f42662e = Long.valueOf(j10);
                    aVar.f42663f = Long.valueOf(blockCount);
                    return aVar.m15470a();
                }
            } else {
                fValueOf = null;
                z10 = false;
            }
        } catch (IllegalStateException e11) {
            e = e11;
            z10 = false;
        }
        if (fValueOf != null) {
            dValueOf = Double.valueOf(fValueOf.doubleValue());
        }
        if (z10 || fValueOf == null) {
            i11 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i11 = 3;
        }
        if (!CommonUtils.m9157i()) {
            if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                z11 = true;
            }
        }
        long jM9155g2 = CommonUtils.m9155g();
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        long j11 = jM9155g2 - memoryInfo2.availMem;
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        C7763t.a aVar2 = new C7763t.a();
        aVar2.f42658a = dValueOf;
        aVar2.f42659b = Integer.valueOf(i11);
        aVar2.f42660c = Boolean.valueOf(z11);
        aVar2.f42661d = Integer.valueOf(i10);
        aVar2.f42662e = Long.valueOf(j11);
        aVar2.f42663f = Long.valueOf(blockCount2);
        return aVar2.m15470a();
    }
}
