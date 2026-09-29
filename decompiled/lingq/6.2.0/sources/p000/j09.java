package p000;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.SubscriptionDetails;

/* JADX INFO: loaded from: classes2.dex */
public final class j09 {

    /* JADX INFO: renamed from: a */
    public final Profile f44855a;

    /* JADX INFO: renamed from: b */
    public final SubscriptionDetails f44856b;

    /* JADX INFO: renamed from: c */
    public final Language f44857c;

    /* JADX INFO: renamed from: d */
    public final kz1 f44858d;

    public j09(Profile profile, SubscriptionDetails subscriptionDetails, Language language, kz1 kz1Var) {
        kz1Var.getClass();
        this.f44855a = profile;
        this.f44856b = subscriptionDetails;
        this.f44857c = language;
        this.f44858d = kz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j09)) {
            return false;
        }
        j09 j09Var = (j09) obj;
        return fa4.m11650l(this.f44855a, j09Var.f44855a) && fa4.m11650l(this.f44856b, j09Var.f44856b) && fa4.m11650l(this.f44857c, j09Var.f44857c) && fa4.m11650l(this.f44858d, j09Var.f44858d);
    }

    public final int hashCode() {
        Profile profile = this.f44855a;
        int iHashCode = (profile == null ? 0 : profile.hashCode()) * 31;
        SubscriptionDetails subscriptionDetails = this.f44856b;
        int iHashCode2 = (iHashCode + (subscriptionDetails == null ? 0 : subscriptionDetails.hashCode())) * 31;
        Language language = this.f44857c;
        return this.f44858d.hashCode() + ((iHashCode2 + (language != null ? language.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SettingsAccountData(profile=" + this.f44855a + ", subscription=" + this.f44856b + ", language=" + this.f44857c + ", targetEditState=" + this.f44858d + ")";
    }
}
