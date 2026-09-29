package p000;

import android.os.Bundle;
import com.lingq.core.settings.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class ho6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f42710a;

    /* JADX INFO: renamed from: b */
    public final String f42711b;

    /* JADX INFO: renamed from: c */
    public final int f42712c;

    public ho6(String str, String str2) {
        str.getClass();
        this.f42710a = str;
        this.f42711b = str2;
        this.f42712c = R$id.actionToNotificationsDailyLingqs;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("languageCode", this.f42710a);
        bundle.putString("title", this.f42711b);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f42712c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho6)) {
            return false;
        }
        ho6 ho6Var = (ho6) obj;
        return fa4.m11650l(this.f42710a, ho6Var.f42710a) && this.f42711b.equals(ho6Var.f42711b);
    }

    public final int hashCode() {
        return this.f42711b.hashCode() + (this.f42710a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ActionToNotificationsDailyLingqs(languageCode=", this.f42710a, ", title=", this.f42711b, ")");
    }
}
