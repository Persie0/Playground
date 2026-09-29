package p000;

import android.os.Bundle;
import com.lingq.core.premium.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class sa6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f60591a;

    /* JADX INFO: renamed from: b */
    public final boolean f60592b;

    /* JADX INFO: renamed from: c */
    public final String f60593c;

    /* JADX INFO: renamed from: d */
    public final int f60594d;

    public sa6(String str, String str2, boolean z) {
        str.getClass();
        this.f60591a = str;
        this.f60592b = z;
        this.f60593c = str2;
        this.f60594d = R$id.actionToFreeTrial;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("attemptedAction", this.f60591a);
        bundle.putBoolean("isPlusDefault", this.f60592b);
        bundle.putString("offer", this.f60593c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f60594d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa6)) {
            return false;
        }
        sa6 sa6Var = (sa6) obj;
        return fa4.m11650l(this.f60591a, sa6Var.f60591a) && this.f60592b == sa6Var.f60592b && this.f60593c.equals(sa6Var.f60593c);
    }

    public final int hashCode() {
        return this.f60593c.hashCode() + g9a.m12428e(this.f60591a.hashCode() * 31, 31, this.f60592b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToFreeTrial(attemptedAction=");
        sb.append(this.f60591a);
        sb.append(", isPlusDefault=");
        sb.append(this.f60592b);
        sb.append(", offer=");
        return AbstractC3393o1.m17738m(sb, this.f60593c, ")");
    }
}
