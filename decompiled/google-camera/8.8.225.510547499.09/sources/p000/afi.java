package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afi {
    /* JADX INFO: renamed from: a */
    static int m496a(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: b */
    public static ago m497b(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ago agoVarM601m = ago.m601m(rootWindowInsets);
        agoVarM601m.m615p(agoVarM601m);
        agoVarM601m.m614o(view.getRootView());
        return agoVarM601m;
    }

    /* JADX INFO: renamed from: c */
    static void m498c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m499d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static final void m500e(aqu aquVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    aquVar.mo1846f(i);
                } else if (obj instanceof byte[]) {
                    aquVar.mo1843c(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    aquVar.mo1844d(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    aquVar.mo1844d(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    aquVar.mo1845e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    aquVar.mo1845e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    aquVar.mo1845e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    aquVar.mo1845e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    aquVar.mo1847g(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    aquVar.mo1845e(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }
}
