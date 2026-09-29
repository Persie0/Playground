package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rt9 {

    /* JADX INFO: renamed from: b */
    public static final rt9 f59801b = new rt9(0);

    /* JADX INFO: renamed from: c */
    public static final rt9 f59802c = new rt9(1);

    /* JADX INFO: renamed from: d */
    public static final rt9 f59803d = new rt9(2);

    /* JADX INFO: renamed from: a */
    public final int f59804a;

    public rt9(int i) {
        this.f59804a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rt9) {
            return this.f59804a == ((rt9) obj).f59804a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f59804a;
    }

    public final String toString() {
        int i = this.f59804a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return ux5.m22992o(new StringBuilder("TextDecoration["), hg5.m13229a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
