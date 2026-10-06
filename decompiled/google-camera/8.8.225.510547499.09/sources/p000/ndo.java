package p000;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndo implements ndp {

    /* JADX INFO: renamed from: a */
    public final String f42055a;

    /* JADX INFO: renamed from: b */
    public final boolean f42056b;

    public ndo() {
        this("", true);
    }

    public ndo(String str, boolean z) {
        this.f42055a = str;
        this.f42056b = z;
    }

    @Override // p000.ndp
    /* JADX INFO: renamed from: a */
    public final ncn mo17375a(String str) {
        return new ndy(this.f42055a, str, this.f42056b, Level.ALL, true, ndz.f42081a, ndz.f42082b);
    }
}
