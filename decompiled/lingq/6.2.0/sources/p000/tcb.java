package p000;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tcb {

    /* JADX INFO: renamed from: a */
    public final C3118io f62157a;

    /* JADX INFO: renamed from: b */
    public final Feature f62158b;

    public /* synthetic */ tcb(C3118io c3118io, Feature feature) {
        this.f62157a = c3118io;
        this.f62158b = feature;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3118io m21949a() {
        return this.f62157a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Feature m21950b() {
        return this.f62158b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tcb)) {
            return false;
        }
        tcb tcbVar = (tcb) obj;
        return x74.m24360q(this.f62157a, tcbVar.f62157a) && x74.m24360q(this.f62158b, tcbVar.f62158b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f62157a, this.f62158b});
    }

    public final String toString() {
        y12 y12Var = new y12(this);
        y12Var.m24830a(this.f62157a, "key");
        y12Var.m24830a(this.f62158b, "feature");
        return y12Var.toString();
    }
}
