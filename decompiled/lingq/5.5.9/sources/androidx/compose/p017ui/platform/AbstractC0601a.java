package androidx.compose.p017ui.platform;

import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0601a implements InterfaceC0621f {

    /* JADX INFO: renamed from: a */
    public String f4275a;

    /* JADX INFO: renamed from: b */
    public final int[] f4276b = new int[2];

    /* JADX INFO: renamed from: c */
    public final int[] m2326c(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            if (i10 != i11) {
                int[] iArr = this.f4276b;
                iArr[0] = i10;
                iArr[1] = i11;
                return iArr;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final String m2327d() {
        String str = this.f4275a;
        if (str != null) {
            return str;
        }
        C5207g.m11117l("text");
        throw null;
    }
}
