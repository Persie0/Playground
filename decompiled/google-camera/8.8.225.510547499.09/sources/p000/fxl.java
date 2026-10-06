package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxl {

    /* JADX INFO: renamed from: a */
    private final String f23801a;

    public fxl(String str) {
        this.f23801a = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof fxl) && this.f23801a.equals(((fxl) obj).f23801a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23801a});
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("name", this.f23801a);
        return mrlVarM16765d.toString();
    }
}
