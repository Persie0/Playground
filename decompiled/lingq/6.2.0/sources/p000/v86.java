package p000;

import android.os.Bundle;
import com.lingq.feature.challenges.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class v86 implements t86 {

    /* JADX INFO: renamed from: a */
    public final boolean f65018a;

    /* JADX INFO: renamed from: b */
    public final boolean f65019b;

    /* JADX INFO: renamed from: c */
    public final int f65020c;

    /* JADX INFO: renamed from: d */
    public final int f65021d = R$id.actionToBookChallengeChooser;

    public v86(int i, boolean z, boolean z2) {
        this.f65018a = z;
        this.f65019b = z2;
        this.f65020c = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isJoined", this.f65018a);
        bundle.putBoolean("multiBookEnabled", this.f65019b);
        bundle.putInt("replaceBookId", this.f65020c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f65021d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v86)) {
            return false;
        }
        v86 v86Var = (v86) obj;
        return this.f65018a == v86Var.f65018a && this.f65019b == v86Var.f65019b && this.f65020c == v86Var.f65020c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65020c) + g9a.m12428e(Boolean.hashCode(this.f65018a) * 31, 31, this.f65019b);
    }

    public final String toString() {
        return wq1.m24123s(hn1.m13357g("ActionToBookChallengeChooser(isJoined=", ", multiBookEnabled=", ", replaceBookId=", this.f65018a, this.f65019b), this.f65020c, ")");
    }
}
