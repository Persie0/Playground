package p000;

import android.os.Bundle;
import com.lingq.feature.challenges.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class y86 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f69476a;

    /* JADX INFO: renamed from: b */
    public final String f69477b;

    /* JADX INFO: renamed from: c */
    public final String f69478c;

    /* JADX INFO: renamed from: d */
    public final int f69479d;

    public y86(String str, String str2, String str3) {
        str.getClass();
        this.f69476a = str;
        this.f69477b = str2;
        this.f69478c = str3;
        this.f69479d = R$id.actionToChallengeDetails;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("challengeCode", this.f69476a);
        bundle.putString("challengeType", this.f69477b);
        bundle.putString("languageFromDeeplink", this.f69478c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f69479d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y86)) {
            return false;
        }
        y86 y86Var = (y86) obj;
        return fa4.m11650l(this.f69476a, y86Var.f69476a) && this.f69477b.equals(y86Var.f69477b) && this.f69478c.equals(y86Var.f69478c);
    }

    public final int hashCode() {
        return this.f69478c.hashCode() + ux5.m22980c(this.f69476a.hashCode() * 31, this.f69477b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ActionToChallengeDetails(challengeCode=", this.f69476a, ", challengeType=", this.f69477b, ", languageFromDeeplink="), this.f69478c, ")");
    }
}
