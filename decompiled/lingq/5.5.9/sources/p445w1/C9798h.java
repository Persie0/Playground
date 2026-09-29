package p445w1;

import java.util.ArrayList;
import p338qd.C8573r0;

/* JADX INFO: renamed from: w1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9798h {

    /* JADX INFO: renamed from: b */
    public static final C9798h f49911b = new C9798h(0);

    /* JADX INFO: renamed from: c */
    public static final C9798h f49912c = new C9798h(1);

    /* JADX INFO: renamed from: d */
    public static final C9798h f49913d = new C9798h(2);

    /* JADX INFO: renamed from: a */
    public final int f49914a;

    public C9798h(int i10) {
        this.f49914a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18285a(C9798h c9798h) {
        int i10 = c9798h.f49914a;
        int i11 = this.f49914a;
        return (i10 | i11) == i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9798h) {
            return this.f49914a == ((C9798h) obj).f49914a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49914a;
    }

    public final String toString() {
        int i10 = this.f49914a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C8573r0.m16719d0(arrayList, ", ", null, 62) + ']';
    }
}
