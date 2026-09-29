package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wh3 {

    /* JADX INFO: renamed from: a */
    public final String f66816a;

    /* JADX INFO: renamed from: b */
    public final String f66817b;

    /* JADX INFO: renamed from: c */
    public final Integer f66818c;

    public wh3(String str, String str2, Integer num) {
        this.f66816a = str;
        this.f66817b = str2;
        this.f66818c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh3)) {
            return false;
        }
        wh3 wh3Var = (wh3) obj;
        return this.f66816a.equals(wh3Var.f66816a) && this.f66817b.equals(wh3Var.f66817b) && fa4.m11650l(this.f66818c, wh3Var.f66818c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f66816a.hashCode() * 31, this.f66817b, 31);
        Integer num = this.f66818c;
        return iM22980c + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("FreeTrialOfferPresentation(trialBannerUrl=", this.f66816a, ", trialHeader=", this.f66817b, ", trialHeaderResource=");
        sbM23000w.append(this.f66818c);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
