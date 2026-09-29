package p000;

import android.os.Bundle;
import com.lingq.feature.challenges.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class b96 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f8175a;

    /* JADX INFO: renamed from: b */
    public final int f8176b = R$id.actionToChallenges;

    public b96(String str) {
        this.f8175a = str;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("languageFromDeeplink", this.f8175a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f8176b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b96) && this.f8175a.equals(((b96) obj).f8175a);
    }

    public final int hashCode() {
        return this.f8175a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ActionToChallenges(languageFromDeeplink=", this.f8175a, ")");
    }
}
