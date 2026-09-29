package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class CommonUtils {

    /* JADX INFO: renamed from: a */
    public static final char[] f16200a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static long f16201b = -1;

    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, Architecture> matcher;

        static {
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            HashMap map = new HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", architecture3);
            map.put("armeabi", architecture2);
            map.put("arm64-v8a", architecture4);
            map.put("x86", architecture);
        }

        public static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
                }
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                architecture = UNKNOWN;
            }
            return architecture;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9149a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m9150b(String str, int i10, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: c */
    public static String m9151c(File file) throws Throwable {
        ?? r10;
        BufferedReader bufferedReader;
        ?? r11;
        ?? Exists = file.exists();
        ?? r12 = 0;
        if (Exists != 0) {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file), 1024);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals("MemTotal")) {
                                r11 = strArrSplit[1];
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Error parsing " + file, e);
                        }
                        m9149a(bufferedReader, "Failed to close system file reader.");
                        r10 = r11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r12 = Exists;
                    m9149a(r12, "Failed to close system file reader.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                m9149a(r12, "Failed to close system file reader.");
                throw th;
            }
            r11 = r12;
            m9149a(bufferedReader, "Failed to close system file reader.");
            r10 = r11;
        } else {
            r10 = r12;
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static int m9152d() {
        boolean zM9157i = m9157i();
        int i10 = zM9157i;
        if (m9158j()) {
            i10 = (zM9157i ? 1 : 0) | 2;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            i10 = (i10 == true ? 1 : 0) | 4;
        }
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public static String m9153e(Context context) {
        int iM9154f = m9154f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iM9154f == 0) {
            iM9154f = m9154f(context, "com.crashlytics.android.build_id", "string");
        }
        if (iM9154f != 0) {
            return context.getResources().getString(iM9154f);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m9154f(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
            return resources.getIdentifier(str, str2, packageName);
        }
        packageName = context.getPackageName();
        return resources.getIdentifier(str, str2, packageName);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static synchronized long m9155g() {
        long jM9150b;
        try {
            if (f16201b == -1) {
                String strM9151c = m9151c(new File("/proc/meminfo"));
                if (TextUtils.isEmpty(strM9151c)) {
                    jM9150b = 0;
                    f16201b = jM9150b;
                } else {
                    String upperCase = strM9151c.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            jM9150b = m9150b(upperCase, 1024, "KB");
                        } else if (upperCase.endsWith("MB")) {
                            jM9150b = m9150b(upperCase, 1048576, "MB");
                        } else if (upperCase.endsWith("GB")) {
                            jM9150b = m9150b(upperCase, 1073741824, "GB");
                        } else {
                            Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), null);
                            jM9150b = 0;
                        }
                    } catch (NumberFormatException e10) {
                        Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                    f16201b = jM9150b;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16201b;
    }

    /* JADX INFO: renamed from: h */
    public static String m9156h(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f16200a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9157i() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9158j() {
        boolean zM9157i = m9157i();
        String str = Build.TAGS;
        if ((zM9157i || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM9157i && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static String m9159k(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return m9156h(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m9160l(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
