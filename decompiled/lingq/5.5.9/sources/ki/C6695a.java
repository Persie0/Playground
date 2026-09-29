package ki;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: ki.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6695a {

    /* JADX INFO: renamed from: a */
    public final Integer f37847a;

    /* JADX INFO: renamed from: b */
    public final String f37848b;

    /* JADX INFO: renamed from: c */
    public final String f37849c;

    /* JADX INFO: renamed from: d */
    public final String f37850d;

    /* JADX INFO: renamed from: e */
    public final String f37851e;

    /* JADX INFO: renamed from: f */
    public final String f37852f;

    public C6695a(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.f37847a = num;
        this.f37848b = str;
        this.f37849c = str2;
        this.f37850d = str3;
        this.f37851e = str4;
        this.f37852f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6695a)) {
            return false;
        }
        C6695a c6695a = (C6695a) obj;
        return C5207g.m11106a(this.f37847a, c6695a.f37847a) && C5207g.m11106a(this.f37848b, c6695a.f37848b) && C5207g.m11106a(this.f37849c, c6695a.f37849c) && C5207g.m11106a(this.f37850d, c6695a.f37850d) && C5207g.m11106a(this.f37851e, c6695a.f37851e) && C5207g.m11106a(this.f37852f, c6695a.f37852f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f37847a;
        int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f37848b;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37849c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37850d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f37851e;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f37852f;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonListening(id=");
        sb2.append(this.f37847a);
        sb2.append(", title=");
        sb2.append(this.f37848b);
        sb2.append(", imageUrl=");
        sb2.append(this.f37849c);
        sb2.append(", collectionTitle=");
        sb2.append(this.f37850d);
        sb2.append(", videoUrl=");
        sb2.append(this.f37851e);
        sb2.append(", audioUrl=");
        return C0009a.m23l(sb2, this.f37852f, ")");
    }
}
