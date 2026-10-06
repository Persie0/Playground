package p000;

import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class moz {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f41222a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f41223b;

    static {
        mzx mzxVar = mzx.f41874a;
        f41222a = new WeakHashMap();
        f41223b = new mow();
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, moq] */
    /* JADX INFO: renamed from: a */
    static moq m16723a() {
        return ((moy) f41223b.get()).f41220b;
    }

    /* JADX INFO: renamed from: b */
    public static moq m16724b() {
        moq moqVarM16723a = m16723a();
        return moqVarM16723a != null ? moqVarM16723a : new mog();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, moq] */
    /* JADX INFO: renamed from: c */
    public static moq m16725c(moy moyVar, moq moqVar) {
        ?? r0 = moyVar.f41220b;
        if (r0 == moqVar) {
            return moqVar;
        }
        if (r0 == 0) {
            moyVar.f41219a = mox.m16717a();
        }
        if (moyVar.f41219a) {
            m16730h(r0, moqVar);
        }
        moyVar.f41220b = moqVar;
        Object obj = moyVar.f41221c;
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public static moy m16726d() {
        return (moy) f41223b.get();
    }

    /* JADX INFO: renamed from: e */
    private static void m16727e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: f */
    private static void m16728f(moq moqVar) {
        if (moqVar.mo16670a() != null) {
            m16728f(moqVar.mo16670a());
        }
        m16727e(moqVar.mo16671b());
    }

    /* JADX INFO: renamed from: g */
    private static void m16729g(moq moqVar) {
        Trace.endSection();
        if (moqVar.mo16670a() != null) {
            m16729g(moqVar.mo16670a());
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m16730h(moq moqVar, moq moqVar2) {
        if (moqVar != null) {
            if (moqVar2 != null) {
                if (moqVar.mo16670a() == moqVar2) {
                    Trace.endSection();
                    return;
                } else if (moqVar == moqVar2.mo16670a()) {
                    m16727e(moqVar2.mo16671b());
                    return;
                }
            }
            m16729g(moqVar);
        }
        if (moqVar2 != null) {
            m16728f(moqVar2);
        }
    }
}
