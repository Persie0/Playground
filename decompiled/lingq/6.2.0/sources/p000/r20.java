package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r20 extends AbstractC3573sg {

    /* JADX INFO: renamed from: a */
    public final Integer f58502a;

    /* JADX INFO: renamed from: b */
    public final String f58503b;

    /* JADX INFO: renamed from: c */
    public final String f58504c;

    /* JADX INFO: renamed from: d */
    public final String f58505d;

    /* JADX INFO: renamed from: e */
    public final String f58506e;

    /* JADX INFO: renamed from: f */
    public final String f58507f;

    /* JADX INFO: renamed from: g */
    public final String f58508g;

    /* JADX INFO: renamed from: h */
    public final String f58509h;

    /* JADX INFO: renamed from: i */
    public final String f58510i;

    /* JADX INFO: renamed from: j */
    public final String f58511j;

    /* JADX INFO: renamed from: k */
    public final String f58512k;

    /* JADX INFO: renamed from: l */
    public final String f58513l;

    public r20(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f58502a = num;
        this.f58503b = str;
        this.f58504c = str2;
        this.f58505d = str3;
        this.f58506e = str4;
        this.f58507f = str5;
        this.f58508g = str6;
        this.f58509h = str7;
        this.f58510i = str8;
        this.f58511j = str9;
        this.f58512k = str10;
        this.f58513l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3573sg) {
            AbstractC3573sg abstractC3573sg = (AbstractC3573sg) obj;
            Integer num = this.f58502a;
            if (num != null ? num.equals(((r20) abstractC3573sg).f58502a) : ((r20) abstractC3573sg).f58502a == null) {
                String str = this.f58503b;
                if (str != null ? str.equals(((r20) abstractC3573sg).f58503b) : ((r20) abstractC3573sg).f58503b == null) {
                    String str2 = this.f58504c;
                    if (str2 != null ? str2.equals(((r20) abstractC3573sg).f58504c) : ((r20) abstractC3573sg).f58504c == null) {
                        String str3 = this.f58505d;
                        if (str3 != null ? str3.equals(((r20) abstractC3573sg).f58505d) : ((r20) abstractC3573sg).f58505d == null) {
                            String str4 = this.f58506e;
                            if (str4 != null ? str4.equals(((r20) abstractC3573sg).f58506e) : ((r20) abstractC3573sg).f58506e == null) {
                                String str5 = this.f58507f;
                                if (str5 != null ? str5.equals(((r20) abstractC3573sg).f58507f) : ((r20) abstractC3573sg).f58507f == null) {
                                    String str6 = this.f58508g;
                                    if (str6 != null ? str6.equals(((r20) abstractC3573sg).f58508g) : ((r20) abstractC3573sg).f58508g == null) {
                                        String str7 = this.f58509h;
                                        if (str7 != null ? str7.equals(((r20) abstractC3573sg).f58509h) : ((r20) abstractC3573sg).f58509h == null) {
                                            String str8 = this.f58510i;
                                            if (str8 != null ? str8.equals(((r20) abstractC3573sg).f58510i) : ((r20) abstractC3573sg).f58510i == null) {
                                                String str9 = this.f58511j;
                                                if (str9 != null ? str9.equals(((r20) abstractC3573sg).f58511j) : ((r20) abstractC3573sg).f58511j == null) {
                                                    String str10 = this.f58512k;
                                                    if (str10 != null ? str10.equals(((r20) abstractC3573sg).f58512k) : ((r20) abstractC3573sg).f58512k == null) {
                                                        String str11 = this.f58513l;
                                                        if (str11 != null ? str11.equals(((r20) abstractC3573sg).f58513l) : ((r20) abstractC3573sg).f58513l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f58502a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f58503b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f58504c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f58505d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f58506e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f58507f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f58508g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f58509h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f58510i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f58511j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f58512k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f58513l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f58502a);
        sb.append(", model=");
        sb.append(this.f58503b);
        sb.append(", hardware=");
        sb.append(this.f58504c);
        sb.append(", device=");
        sb.append(this.f58505d);
        sb.append(", product=");
        sb.append(this.f58506e);
        sb.append(", osBuild=");
        sb.append(this.f58507f);
        sb.append(", manufacturer=");
        sb.append(this.f58508g);
        sb.append(", fingerprint=");
        sb.append(this.f58509h);
        sb.append(", locale=");
        sb.append(this.f58510i);
        sb.append(", country=");
        sb.append(this.f58511j);
        sb.append(", mccMnc=");
        sb.append(this.f58512k);
        sb.append(", applicationBuild=");
        return AbstractC3393o1.m17738m(sb, this.f58513l, "}");
    }
}
