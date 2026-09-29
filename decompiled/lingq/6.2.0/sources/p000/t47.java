package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t47 {

    /* JADX INFO: renamed from: a */
    public final List f61858a;

    /* JADX INFO: renamed from: b */
    public final List f61859b;

    public t47(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f61858a = list;
        this.f61859b = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u91.m22596N0(this.f61858a, ", ", null, null, null, 62));
        sb.append('(');
        return ux5.m22992o(sb, u91.m22596N0(this.f61859b, ";", null, null, null, 62), ')');
    }
}
