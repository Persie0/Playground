package p000;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ncp {

    /* JADX INFO: renamed from: a */
    public static final Locale f42021a = Locale.ROOT;

    /* JADX INFO: renamed from: a */
    public static String m17342a(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return m17345d(obj, simpleName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX INFO: renamed from: b */
    public static String m17343b(Object obj) {
        if (obj == 0) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String string = obj.toString();
                obj = string != null ? string : m17345d(obj, "toString() returned null");
            } else if (obj instanceof int[]) {
                obj = Arrays.toString((int[]) obj);
            } else if (obj instanceof long[]) {
                obj = Arrays.toString((long[]) obj);
            } else if (obj instanceof byte[]) {
                obj = Arrays.toString((byte[]) obj);
            } else if (obj instanceof char[]) {
                obj = Arrays.toString((char[]) obj);
            } else if (obj instanceof short[]) {
                obj = Arrays.toString((short[]) obj);
            } else if (obj instanceof float[]) {
                obj = Arrays.toString((float[]) obj);
            } else if (obj instanceof double[]) {
                obj = Arrays.toString((double[]) obj);
            } else {
                obj = obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
            }
            return obj;
        } catch (RuntimeException e) {
            return m17342a(obj, e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m17344c(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m17345d(Object obj, String str) {
        return "{" + obj.getClass().getName() + "@" + System.identityHashCode(obj) + ": " + str + "}";
    }
}
