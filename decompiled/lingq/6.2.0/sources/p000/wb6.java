package p000;

import android.os.Bundle;
import com.lingq.feature.onboarding.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class wb6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f66593a;

    /* JADX INFO: renamed from: b */
    public final int f66594b = R$id.actionToCheckEmail;

    public wb6(String str) {
        this.f66593a = str;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f66593a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f66594b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb6) && this.f66593a.equals(((wb6) obj).f66593a);
    }

    public final int hashCode() {
        return this.f66593a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ActionToCheckEmail(email=", this.f66593a, ")");
    }
}
