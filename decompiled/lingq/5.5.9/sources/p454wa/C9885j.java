package p454wa;

import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: renamed from: wa.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9885j implements InterfaceC9877b {

    /* JADX INFO: renamed from: c */
    public int f50448c;

    /* JADX INFO: renamed from: d */
    public int f50449d;

    /* JADX INFO: renamed from: a */
    public final boolean f50446a = true;

    /* JADX INFO: renamed from: b */
    public final int f50447b = 65536;

    /* JADX INFO: renamed from: e */
    public int f50450e = 0;

    /* JADX INFO: renamed from: f */
    public C9876a[] f50451f = new C9876a[100];

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m18381a() {
        int i10 = this.f50448c;
        int i11 = this.f50447b;
        int i12 = C10134c0.f51354a;
        int iMax = Math.max(0, (((i10 + i11) - 1) / i11) - this.f50449d);
        int i13 = this.f50450e;
        if (iMax >= i13) {
            return;
        }
        Arrays.fill(this.f50451f, iMax, i13, (Object) null);
        this.f50450e = iMax;
    }
}
