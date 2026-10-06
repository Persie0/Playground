package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: renamed from: ug */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1037ug extends C0747jn {

    /* JADX INFO: renamed from: a */
    public final C1056uz f47728a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1082vy f47729b;

    /* JADX INFO: renamed from: c */
    private final boolean f47730c = false;

    public C1037ug(C1056uz c1056uz, InterfaceC1082vy interfaceC1082vy) {
        this.f47728a = c1056uz;
        this.f47729b = interfaceC1082vy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1037ug)) {
            return false;
        }
        C1037ug c1037ug = (C1037ug) obj;
        if (!ooc.m18737c(this.f47728a, c1037ug.f47728a)) {
            return false;
        }
        boolean z = c1037ug.f47730c;
        return ooc.m18737c(this.f47729b, c1037ug.f47729b);
    }

    public final int hashCode() {
        return (this.f47728a.hashCode() * 961) + this.f47729b.hashCode();
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.f47728a + NptsKnlVczSZ.iVOfDXaUdrw + this.f47729b + ')';
    }
}
