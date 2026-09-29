package p000;

import android.os.Bundle;
import com.lingq.feature.challenges.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class l96 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f49344a;

    /* JADX INFO: renamed from: b */
    public final int f49345b = R$id.actionToCupContributors;

    public l96(String str) {
        this.f49344a = str;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("languageCode", this.f49344a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f49345b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l96) && fa4.m11650l(this.f49344a, ((l96) obj).f49344a);
    }

    public final int hashCode() {
        String str = this.f49344a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ActionToCupContributors(languageCode=", this.f49344a, ")");
    }
}
