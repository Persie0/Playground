package p000;

import android.os.Bundle;
import com.lingq.feature.challenges.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class k96 implements t86 {

    /* JADX INFO: renamed from: a */
    public final boolean f46890a;

    /* JADX INFO: renamed from: b */
    public final int f46891b = R$id.actionToCup;

    public k96(boolean z) {
        this.f46890a = z;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("openSignup", this.f46890a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f46891b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k96) && this.f46890a == ((k96) obj).f46890a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46890a);
    }

    public final String toString() {
        return hn1.m13355e("ActionToCup(openSignup=", ")", this.f46890a);
    }
}
