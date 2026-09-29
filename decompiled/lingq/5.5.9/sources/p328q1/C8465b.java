package p328q1;

import ae.C0062b;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.font.InterfaceC0701g;
import dm.C5207g;

/* JADX INFO: renamed from: q1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8465b implements InterfaceC0701g {

    /* JADX INFO: renamed from: b */
    public final int f45638b;

    public C8465b(int i10) {
        this.f45638b = i10;
    }

    @Override // androidx.compose.p017ui.text.font.InterfaceC0701g
    /* JADX INFO: renamed from: a */
    public final C8476m mo2599a(C8476m c8476m) {
        C5207g.m11111f(c8476m, "fontWeight");
        int i10 = this.f45638b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? c8476m : new C8476m(C0062b.m361k0(c8476m.f45655a + i10, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C8465b) && this.f45638b == ((C8465b) obj).f45638b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45638b);
    }

    public final String toString() {
        return C0204c.m853l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f45638b, ')');
    }
}
