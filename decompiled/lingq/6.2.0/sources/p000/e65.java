package p000;

import android.view.View;
import com.lingq.core.network.api.result.ResultLanguageStatValue;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.C3245a;
import kotlinx.coroutines.selects.C3247b;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class e65 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m10865A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2) {
        gr7 gr7Var = gr7.f41241f;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, gr7Var, obj2)) {
            if (atomicReferenceFieldUpdater.get(obj) != gr7Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ boolean m10866B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3245a c3245a, C3245a c3245a2, C3245a c3245a3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3245a, c3245a2, c3245a3)) {
            if (atomicReferenceFieldUpdater.get(c3245a) != c3245a2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m10867C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3247b c3247b, Object obj) {
        C0842cc c0842cc = thb.f62319o;
        while (!atomicReferenceFieldUpdater.compareAndSet(c3247b, obj, c0842cc)) {
            if (atomicReferenceFieldUpdater.get(c3247b) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m10868D(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3245a c3245a, C3245a c3245a2, C3245a c3245a3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3245a, c3245a2, c3245a3)) {
            if (atomicReferenceFieldUpdater.get(c3245a) != c3245a2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static int m10869a(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m10870b(ResultLanguageStatValue resultLanguageStatValue, int i, int i2) {
        return (resultLanguageStatValue.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: c */
    public static as4 m10871c(tj3 tj3Var, e16 e16Var, zi3 zi3Var, float f, boolean z) {
        oha.m18001g(tj3Var, zi3Var, e16Var);
        return new as4(f, z);
    }

    /* JADX INFO: renamed from: d */
    public static Object m10872d(int i, Map map) {
        return map.get(new Integer(i));
    }

    /* JADX INFO: renamed from: e */
    public static String m10873e(String str, yq9 yq9Var, String str2, yq9 yq9Var2) {
        return str + yq9Var + str2 + yq9Var2;
    }

    /* JADX INFO: renamed from: f */
    public static String m10874f(String str, String str2, List list) {
        return str + list + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m10875g(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static HashMap m10876h(Class cls, zlb zlbVar) {
        HashMap map = new HashMap();
        map.put(cls, zlbVar);
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static LinkedHashSet m10877i(LinkedHashMap linkedHashMap, String str, vq9 vq9Var) {
        linkedHashMap.put(str, vq9Var);
        return new LinkedHashSet();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m10878j() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m10880l(View view) {
        if (view == null) {
            return;
        }
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m10881m(Object obj) {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: n */
    public static void m10882n(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: o */
    public static void m10883o(StringBuilder sb, Integer num, String str, Integer num2, String str2) {
        sb.append(num);
        sb.append(str);
        sb.append(num2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m10884p(List list) {
        if (list == null) {
            return;
        }
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m10885q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, bj5 bj5Var, dj5 dj5Var, dj5 dj5Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bj5Var, dj5Var, dj5Var2) && atomicReferenceFieldUpdater.get(bj5Var) == dj5Var) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m10886r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, dj5 dj5Var, dj5 dj5Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(dj5Var, null, dj5Var2) && atomicReferenceFieldUpdater.get(dj5Var) == null) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m10887s(C3245a c3245a) {
        if (c3245a != null) {
            return;
        }
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m10888t(mib mibVar) {
        if (mibVar == null) {
            return;
        }
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m10890v(ResultLanguageStatValue resultLanguageStatValue) {
        return fa4.m11650l(resultLanguageStatValue, new ResultLanguageStatValue());
    }

    /* JADX INFO: renamed from: w */
    public static boolean m10891w(String str, String str2, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return str2.equals(lowerCase);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m10892x(AtomicReference atomicReference, ztb ztbVar) {
        while (!atomicReference.compareAndSet(null, ztbVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m10893y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, jk8 jk8Var, CoroutineSingletons coroutineSingletons, CoroutineSingletons coroutineSingletons2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jk8Var, coroutineSingletons, coroutineSingletons2)) {
            if (atomicReferenceFieldUpdater.get(jk8Var) != coroutineSingletons) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m10894z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, j8b j8bVar, rr9 rr9Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(j8bVar, rr9Var, null)) {
            if (atomicReferenceFieldUpdater.get(j8bVar) != rr9Var) {
                return false;
            }
        }
        return true;
    }
}
