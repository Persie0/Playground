package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ze1 {

    /* JADX INFO: renamed from: a */
    public final tj3 f71430a;

    /* JADX INFO: renamed from: b */
    public tt0 f71431b;

    /* JADX INFO: renamed from: c */
    public boolean f71432c;

    /* JADX INFO: renamed from: f */
    public int f71435f;

    /* JADX INFO: renamed from: g */
    public int f71436g;

    /* JADX INFO: renamed from: l */
    public int f71441l;

    /* JADX INFO: renamed from: d */
    public final o84 f71433d = new o84();

    /* JADX INFO: renamed from: e */
    public boolean f71434e = true;

    /* JADX INFO: renamed from: h */
    public final ArrayList f71437h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f71438i = -1;

    /* JADX INFO: renamed from: j */
    public int f71439j = -1;

    /* JADX INFO: renamed from: k */
    public int f71440k = -1;

    public ze1(tj3 tj3Var, tt0 tt0Var) {
        this.f71430a = tj3Var;
        this.f71431b = tt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m25564a() {
        m25566c();
        ArrayList arrayList = this.f71437h;
        if (arrayList.isEmpty()) {
            this.f71436g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25565b() {
        int i = this.f71436g;
        if (i > 0) {
            kz6 kz6Var = this.f71431b.f62837p;
            kz6Var.m15737V(ez6.f38109c);
            kz6Var.f48814B[kz6Var.f48815C - kz6Var.f48818z[kz6Var.f48813A - 1].f41551a] = i;
            this.f71436g = 0;
        }
        ArrayList arrayList = this.f71437h;
        if (arrayList.isEmpty()) {
            return;
        }
        tt0 tt0Var = this.f71431b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        tt0Var.getClass();
        if (size != 0) {
            kz6 kz6Var2 = tt0Var.f62837p;
            kz6Var2.m15737V(fy6.f39927c);
            ss5.m21695V(kz6Var2, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m25566c() {
        int i = this.f71441l;
        if (i > 0) {
            int i2 = this.f71438i;
            if (i2 >= 0) {
                m25565b();
                kz6 kz6Var = this.f71431b.f62837p;
                kz6Var.m15737V(uy6.f64538c);
                int i3 = kz6Var.f48815C - kz6Var.f48818z[kz6Var.f48813A - 1].f41551a;
                int[] iArr = kz6Var.f48814B;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.f71438i = -1;
            } else {
                int i4 = this.f71440k;
                int i5 = this.f71439j;
                m25565b();
                kz6 kz6Var2 = this.f71431b.f62837p;
                kz6Var2.m15737V(qy6.f58391c);
                int i6 = kz6Var2.f48815C - kz6Var2.f48818z[kz6Var2.f48813A - 1].f41551a;
                int[] iArr2 = kz6Var2.f48814B;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f71439j = -1;
                this.f71440k = -1;
            }
            this.f71441l = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25567d(boolean z) {
        bb9 bb9Var = this.f71430a.f62372G;
        int i = z ? bb9Var.f8290i : bb9Var.f8288g;
        int i2 = i - this.f71435f;
        if (i2 < 0) {
            cf1.m4605a("Tried to seek backward");
        }
        if (i2 > 0) {
            kz6 kz6Var = this.f71431b.f62837p;
            kz6Var.m15737V(yx6.f70617c);
            kz6Var.f48814B[kz6Var.f48815C - kz6Var.f48818z[kz6Var.f48813A - 1].f41551a] = i2;
            this.f71435f = i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m25568e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                cf1.m4605a("Invalid remove index " + i);
            }
            if (this.f71438i == i) {
                this.f71441l += i2;
                return;
            }
            m25566c();
            this.f71438i = i;
            this.f71441l = i2;
        }
    }
}
