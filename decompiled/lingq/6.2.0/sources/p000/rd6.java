package p000;

import android.os.Bundle;
import com.lingq.feature.library.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class rd6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f59114a;

    /* JADX INFO: renamed from: b */
    public final int f59115b;

    public rd6(String str) {
        str.getClass();
        this.f59114a = str;
        this.f59115b = R$id.actionToYearInReview;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f59114a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f59115b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd6) && fa4.m11650l(this.f59114a, ((rd6) obj).f59114a);
    }

    public final int hashCode() {
        return this.f59114a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ActionToYearInReview(url=", this.f59114a, ")");
    }
}
