package p000;

import android.os.Bundle;
import com.lingq.core.premium.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class fd6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f38905a;

    /* JADX INFO: renamed from: b */
    public final String f38906b;

    /* JADX INFO: renamed from: c */
    public final boolean f38907c;

    /* JADX INFO: renamed from: d */
    public final int f38908d;

    public fd6(String str, String str2, boolean z) {
        str.getClass();
        this.f38905a = str;
        this.f38906b = str2;
        this.f38907c = z;
        this.f38908d = R$id.actionToUpgradeTest;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("attemptedAction", this.f38905a);
        bundle.putString("offer", this.f38906b);
        bundle.putBoolean("plusDefault", this.f38907c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f38908d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd6)) {
            return false;
        }
        fd6 fd6Var = (fd6) obj;
        return fa4.m11650l(this.f38905a, fd6Var.f38905a) && this.f38906b.equals(fd6Var.f38906b) && this.f38907c == fd6Var.f38907c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38907c) + ux5.m22980c(this.f38905a.hashCode() * 31, this.f38906b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("ActionToUpgradeTest(attemptedAction=", this.f38905a, ", offer=", this.f38906b, ", plusDefault="), this.f38907c, ")");
    }
}
