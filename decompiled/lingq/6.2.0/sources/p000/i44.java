package p000;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class i44 {

    /* JADX INFO: renamed from: a */
    public boolean f43480a;

    /* JADX INFO: renamed from: b */
    public int f43481b;

    /* JADX INFO: renamed from: c */
    public Object f43482c;

    /* JADX INFO: renamed from: d */
    public Object f43483d;

    public i44(i44 i44Var, Feature[] featureArr, boolean z, int i) {
        this.f43483d = i44Var;
        this.f43482c = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f43480a = z2;
        this.f43481b = i;
    }

    /* JADX INFO: renamed from: b */
    public static i44 m13651b() {
        i44 i44Var = new i44();
        i44Var.f43480a = true;
        i44Var.f43481b = 0;
        return i44Var;
    }

    /* JADX INFO: renamed from: a */
    public i44 m13652a() {
        lda.m16124j("execute parameter required", ((a58) this.f43482c) != null);
        return new i44(this, (Feature[]) this.f43483d, this.f43480a, this.f43481b);
    }
}
