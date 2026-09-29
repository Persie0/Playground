package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pk7 {

    /* JADX INFO: renamed from: a */
    public final String f56348a;

    /* JADX INFO: renamed from: b */
    public final boolean f56349b;

    /* JADX INFO: renamed from: c */
    public final String[] f56350c;

    /* JADX INFO: renamed from: d */
    public final String[] f56351d;

    public pk7(String str, boolean z, String[] strArr, String[] strArr2) {
        this.f56348a = str;
        this.f56349b = z;
        this.f56350c = strArr;
        this.f56351d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final dg4 m19363a() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10331B("name", this.f56348a);
        dg4VarM10328c.m10351u("sleep", this.f56349b);
        dg4VarM10328c.m10354x("payloads", b34.m3223T(this.f56350c));
        dg4VarM10328c.m10354x("keys", b34.m3223T(this.f56351d));
        return dg4VarM10328c;
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (pk7.class == obj.getClass()) {
                pk7 pk7Var = (pk7) obj;
                return this.f56349b == pk7Var.f56349b && this.f56348a.equals(pk7Var.f56348a) && Arrays.equals(this.f56350c, pk7Var.f56350c) && Arrays.equals(this.f56351d, pk7Var.f56351d);
            }
        }
        return false;
    }

    public final synchronized int hashCode() {
        return m19363a().toString().hashCode();
    }
}
