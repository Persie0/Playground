package p000;

import android.os.Bundle;
import com.lingq.feature.onboarding.R$id;

/* JADX INFO: loaded from: classes.dex */
public final class yb6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f69602a;

    /* JADX INFO: renamed from: b */
    public final int f69603b = R$id.actionToLogin;

    public yb6(String str) {
        this.f69602a = str;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("authCode", this.f69602a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f69603b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb6) && this.f69602a.equals(((yb6) obj).f69602a);
    }

    public final int hashCode() {
        return this.f69602a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ActionToLogin(authCode=", this.f69602a, ")");
    }
}
