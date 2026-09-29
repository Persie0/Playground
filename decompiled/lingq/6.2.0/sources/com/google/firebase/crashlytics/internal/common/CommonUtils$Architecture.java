package com.google.firebase.crashlytics.internal.common;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture, still in use, count: 1, list:
  (r0v0 com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
final class CommonUtils$Architecture {
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

    private static final Map<String, CommonUtils$Architecture> matcher;

    static {
        HashMap map = new HashMap(4);
        matcher = map;
        map.put("armeabi-v7a", new CommonUtils$Architecture());
        map.put("armeabi", new CommonUtils$Architecture());
        map.put("arm64-v8a", new CommonUtils$Architecture());
        map.put("x86", new CommonUtils$Architecture());
    }

    private CommonUtils$Architecture() {
        super(str, i);
    }

    public static CommonUtils$Architecture getValue() {
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str)) {
            CommonUtils$Architecture commonUtils$Architecture = matcher.get(str.toLowerCase(Locale.US));
            return commonUtils$Architecture == null ? UNKNOWN : commonUtils$Architecture;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        return UNKNOWN;
    }

    public static CommonUtils$Architecture valueOf(String str) {
        return (CommonUtils$Architecture) Enum.valueOf(CommonUtils$Architecture.class, str);
    }

    public static CommonUtils$Architecture[] values() {
        return (CommonUtils$Architecture[]) $VALUES.clone();
    }
}
