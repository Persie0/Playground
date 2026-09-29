package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e46 extends bj0 {

    /* JADX INFO: renamed from: c */
    public final long f36699c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f36700d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f36701e;

    public e46(int i, long j) {
        super(i, 2);
        this.f36699c = j;
        this.f36700d = new ArrayList();
        this.f36701e = new ArrayList();
    }

    /* JADX INFO: renamed from: k */
    public final e46 m10844k(int i) {
        ArrayList arrayList = this.f36701e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e46 e46Var = (e46) arrayList.get(i2);
            if (e46Var.f8576b == i) {
                return e46Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final f46 m10845m(int i) {
        ArrayList arrayList = this.f36700d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f46 f46Var = (f46) arrayList.get(i2);
            if (f46Var.f8576b == i) {
                return f46Var;
            }
        }
        return null;
    }

    @Override // p000.bj0
    public final String toString() {
        return bj0.m3750a(this.f8576b) + " leaves: " + Arrays.toString(this.f36700d.toArray()) + " containers: " + Arrays.toString(this.f36701e.toArray());
    }
}
