package p000;

import android.os.Bundle;
import com.lingq.feature.challenges.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class xq0 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f68523a;

    /* JADX INFO: renamed from: b */
    public final String f68524b;

    /* JADX INFO: renamed from: c */
    public final int f68525c = R$id.actionToChallengeShare;

    public xq0(String str, String str2) {
        this.f68523a = str;
        this.f68524b = str2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("challengeCode", this.f68523a);
        bundle.putString("title", this.f68524b);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f68525c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq0)) {
            return false;
        }
        xq0 xq0Var = (xq0) obj;
        return this.f68523a.equals(xq0Var.f68523a) && this.f68524b.equals(xq0Var.f68524b);
    }

    public final int hashCode() {
        return this.f68524b.hashCode() + (this.f68523a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ActionToChallengeShare(challengeCode=", this.f68523a, ", title=", this.f68524b, ")");
    }
}
