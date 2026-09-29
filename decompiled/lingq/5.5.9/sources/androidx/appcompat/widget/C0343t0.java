package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0343t0 {

    /* JADX INFO: renamed from: a */
    public int f1329a = 0;

    /* JADX INFO: renamed from: b */
    public int f1330b = 0;

    /* JADX INFO: renamed from: c */
    public int f1331c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f1332d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f1333e = 0;

    /* JADX INFO: renamed from: f */
    public int f1334f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f1335g = false;

    /* JADX INFO: renamed from: h */
    public boolean f1336h = false;

    /* JADX INFO: renamed from: a */
    public final void m1267a(int i10, int i11) {
        this.f1331c = i10;
        this.f1332d = i11;
        this.f1336h = true;
        if (this.f1335g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1329a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1330b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1329a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1330b = i11;
        }
    }
}
