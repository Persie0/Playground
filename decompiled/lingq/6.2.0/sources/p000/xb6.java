package p000;

import android.os.Bundle;
import com.lingq.feature.onboarding.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class xb6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f68024a;

    /* JADX INFO: renamed from: b */
    public final String f68025b;

    /* JADX INFO: renamed from: c */
    public final boolean f68026c;

    /* JADX INFO: renamed from: d */
    public final int f68027d = R$id.actionToFinishingFragment;

    public xb6(String str, String str2, boolean z) {
        this.f68024a = str;
        this.f68025b = str2;
        this.f68026c = z;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("username", this.f68024a);
        bundle.putString("password", this.f68025b);
        bundle.putBoolean("isSocial", this.f68026c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f68027d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb6)) {
            return false;
        }
        xb6 xb6Var = (xb6) obj;
        return this.f68024a.equals(xb6Var.f68024a) && this.f68025b.equals(xb6Var.f68025b) && this.f68026c == xb6Var.f68026c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68026c) + ux5.m22980c(this.f68024a.hashCode() * 31, this.f68025b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("ActionToFinishingFragment(username=", this.f68024a, ", password=", this.f68025b, ", isSocial="), this.f68026c, ")");
    }
}
