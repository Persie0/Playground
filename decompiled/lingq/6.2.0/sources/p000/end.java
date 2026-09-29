package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class end {

    /* JADX INFO: renamed from: a */
    public final String f37584a;

    /* JADX INFO: renamed from: b */
    public final Class f37585b;

    /* JADX INFO: renamed from: c */
    public final boolean f37586c;

    /* JADX INFO: renamed from: d */
    public final boolean f37587d;

    /* JADX INFO: renamed from: e */
    public final long f37588e;

    public end(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            C3386nv.m17626m("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                C3386nv.m17626m("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f37584a = str;
        this.f37585b = cls;
        this.f37586c = z;
        this.f37587d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f37588e = j;
    }

    /* JADX INFO: renamed from: a */
    public void mo11276a(Iterator it, qnd qndVar) {
        while (it.hasNext()) {
            mo11277b(it.next(), qndVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo11277b(Object obj, qnd qndVar) {
        qndVar.m20086a(obj, this.f37584a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f37585b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f37584a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        AbstractC3393o1.m17725C(sb, name, "/", str, "[");
        return AbstractC3393o1.m17738m(sb, name2, "]");
    }
}
