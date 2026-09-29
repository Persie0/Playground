package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class q86 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final r86 f57380a;

    /* JADX INFO: renamed from: b */
    public final Bundle f57381b;

    /* JADX INFO: renamed from: c */
    public final boolean f57382c;

    /* JADX INFO: renamed from: d */
    public final int f57383d;

    /* JADX INFO: renamed from: e */
    public final boolean f57384e;

    /* JADX INFO: renamed from: f */
    public final int f57385f;

    public q86(r86 r86Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.f57380a = r86Var;
        this.f57381b = bundle;
        this.f57382c = z;
        this.f57383d = i;
        this.f57384e = z2;
        this.f57385f = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q86 q86Var) {
        q86Var.getClass();
        boolean z = q86Var.f57384e;
        boolean z2 = q86Var.f57382c;
        Bundle bundle = q86Var.f57381b;
        boolean z3 = this.f57382c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.f57383d - q86Var.f57383d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.f57381b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.f57384e;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.f57385f - q86Var.f57385f;
        }
        return -1;
    }
}
