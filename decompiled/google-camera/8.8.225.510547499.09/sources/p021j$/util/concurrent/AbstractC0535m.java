package p021j$.util.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: j$.util.concurrent.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0535m {
    /* JADX INFO: renamed from: a */
    public static void m12564a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static String m12565b(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }
}
