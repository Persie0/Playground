package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzo {

    /* JADX INFO: renamed from: a */
    public final String f23980a;

    /* JADX INFO: renamed from: b */
    public final List f23981b;

    public fzo(String str, List list) {
        this.f23980a = str;
        this.f23981b = list;
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("ValidationResult");
        mrlVarM16766e.m16823b("strategy", this.f23980a);
        mrlVarM16766e.m16824c("valid", "false");
        mrlVarM16766e.m16823b("failed constraints", this.f23981b);
        return mrlVarM16766e.toString();
    }
}
