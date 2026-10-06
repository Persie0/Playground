package p021j$.desugar.sun.nio.p023fs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.a */
/* JADX INFO: loaded from: classes3.dex */
final class C0287a {

    /* JADX INFO: renamed from: a */
    private HashSet f32762a = new HashSet();

    /* JADX INFO: renamed from: b */
    private HashMap f32763b = new HashMap();

    /* JADX INFO: renamed from: c */
    private boolean f32764c;

    private C0287a(HashSet hashSet, String[] strArr) {
        for (String str : strArr) {
            if (str.equals("*")) {
                this.f32764c = true;
            } else {
                if (!hashSet.contains(str)) {
                    throw new IllegalArgumentException("'" + str + "' not recognized");
                }
                this.f32762a.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static C0287a m11970b(HashSet hashSet, String[] strArr) {
        return new C0287a(hashSet, strArr);
    }

    /* JADX INFO: renamed from: a */
    final void m11971a(Object obj, String str) {
        this.f32763b.put(str, obj);
    }

    /* JADX INFO: renamed from: c */
    final boolean m11972c(String str) {
        return this.f32764c || this.f32762a.contains(str);
    }

    /* JADX INFO: renamed from: d */
    final Map m11973d() {
        return Collections.unmodifiableMap(this.f32763b);
    }
}
