package p225kk;

import android.net.Uri;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: kk.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6707d {

    /* JADX INFO: renamed from: kk.d$a */
    public static final class a extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final Uri f37900a;

        /* JADX INFO: renamed from: b */
        public final String f37901b;

        public a(Uri uri, String str) {
            this.f37900a = uri;
            this.f37901b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f37900a, aVar.f37900a) && C5207g.m11106a(this.f37901b, aVar.f37901b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = 0;
            Uri uri = this.f37900a;
            int iHashCode2 = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f37901b;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            return "ChallengeDetail(uri=" + this.f37900a + ", language=" + this.f37901b + ")";
        }
    }

    /* JADX INFO: renamed from: kk.d$b */
    public static final class b extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final Uri f37902a;

        /* JADX INFO: renamed from: b */
        public final String f37903b;

        public b(Uri uri, String str) {
            this.f37902a = uri;
            this.f37903b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C5207g.m11106a(this.f37902a, bVar.f37902a) && C5207g.m11106a(this.f37903b, bVar.f37903b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = 0;
            Uri uri = this.f37902a;
            int iHashCode2 = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f37903b;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            return "Challenges(uri=" + this.f37902a + ", language=" + this.f37903b + ")";
        }
    }

    /* JADX INFO: renamed from: kk.d$c */
    public static final class c extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37904a;

        /* JADX INFO: renamed from: b */
        public final String f37905b;

        public c(String str, String str2) {
            this.f37904a = str;
            this.f37905b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C5207g.m11106a(this.f37904a, cVar.f37904a) && C5207g.m11106a(this.f37905b, cVar.f37905b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f37904a;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f37905b;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Collections(language=");
            sb2.append(this.f37904a);
            sb2.append(", shelfCode=");
            return C0009a.m23l(sb2, this.f37905b, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$d */
    public static final class d extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37906a;

        /* JADX INFO: renamed from: b */
        public final Integer f37907b;

        public d(Integer num, String str) {
            this.f37906a = str;
            this.f37907b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C5207g.m11106a(this.f37906a, dVar.f37906a) && C5207g.m11106a(this.f37907b, dVar.f37907b);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f37906a;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f37907b;
            if (num != null) {
                iHashCode = num.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            return "Course(language=" + this.f37906a + ", courseId=" + this.f37907b + ")";
        }
    }

    /* JADX INFO: renamed from: kk.d$e */
    public static final class e extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public static final e f37908a = new e();
    }

    /* JADX INFO: renamed from: kk.d$f */
    public static final class f extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37909a;

        public f(String str) {
            this.f37909a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C5207g.m11106a(this.f37909a, ((f) obj).f37909a);
        }

        public final int hashCode() {
            String str = this.f37909a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("InviteFriends(language="), this.f37909a, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$g */
    public static final class g extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37910a;

        /* JADX INFO: renamed from: b */
        public final Integer f37911b;

        /* JADX INFO: renamed from: c */
        public final String f37912c;

        /* JADX INFO: renamed from: d */
        public final String f37913d;

        public g(String str, String str2, Integer num, String str3) {
            this.f37910a = str;
            this.f37911b = num;
            this.f37912c = str2;
            this.f37913d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C5207g.m11106a(this.f37910a, gVar.f37910a) && C5207g.m11106a(this.f37911b, gVar.f37911b) && C5207g.m11106a(this.f37912c, gVar.f37912c) && C5207g.m11106a(this.f37913d, gVar.f37913d);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f37910a;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f37911b;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f37912c;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f37913d;
            if (str3 != null) {
                iHashCode = str3.hashCode();
            }
            return iHashCode4 + iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Lesson(language=");
            sb2.append(this.f37910a);
            sb2.append(", lessonId=");
            sb2.append(this.f37911b);
            sb2.append(", medium=");
            sb2.append(this.f37912c);
            sb2.append(", source=");
            return C0009a.m23l(sb2, this.f37913d, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$h */
    public static final class h extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37914a;

        public h(String str) {
            this.f37914a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C5207g.m11106a(this.f37914a, ((h) obj).f37914a);
        }

        public final int hashCode() {
            String str = this.f37914a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Library(language="), this.f37914a, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$i */
    public static final class i extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final Uri f37915a;

        public i(Uri uri) {
            this.f37915a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C5207g.m11106a(this.f37915a, ((i) obj).f37915a);
        }

        public final int hashCode() {
            Uri uri = this.f37915a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final String toString() {
            return "Login(uri=" + this.f37915a + ")";
        }
    }

    /* JADX INFO: renamed from: kk.d$j */
    public static final class j extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37916a;

        public j(String str) {
            C5207g.m11111f(str, "url");
            this.f37916a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof j) && C5207g.m11106a(this.f37916a, ((j) obj).f37916a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37916a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("LoginRedirect(url="), this.f37916a, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$k */
    public static final class k extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37917a;

        /* JADX INFO: renamed from: b */
        public final Integer f37918b;

        public k(Integer num, String str) {
            this.f37917a = str;
            this.f37918b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C5207g.m11106a(this.f37917a, kVar.f37917a) && C5207g.m11106a(this.f37918b, kVar.f37918b);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f37917a;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f37918b;
            if (num != null) {
                iHashCode = num.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            return "Playlist(language=" + this.f37917a + ", playlistId=" + this.f37918b + ")";
        }
    }

    /* JADX INFO: renamed from: kk.d$l */
    public static final class l extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37919a;

        public l(String str) {
            this.f37919a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C5207g.m11106a(this.f37919a, ((l) obj).f37919a);
        }

        public final int hashCode() {
            String str = this.f37919a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Redirect(url="), this.f37919a, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$m */
    public static final class m extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37920a;

        /* JADX INFO: renamed from: b */
        public final String f37921b;

        public m(String str, String str2) {
            this.f37920a = str;
            this.f37921b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return C5207g.m11106a(this.f37920a, mVar.f37920a) && C5207g.m11106a(this.f37921b, mVar.f37921b);
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f37920a;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f37921b;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Review(language=");
            sb2.append(this.f37920a);
            sb2.append(", lotd=");
            return C0009a.m23l(sb2, this.f37921b, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$n */
    public static final class n extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37922a;

        public n(String str) {
            this.f37922a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof n) && C5207g.m11106a(this.f37922a, ((n) obj).f37922a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37922a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Upgrade(offer="), this.f37922a, ")");
        }
    }

    /* JADX INFO: renamed from: kk.d$o */
    public static final class o extends AbstractC6707d {

        /* JADX INFO: renamed from: a */
        public final String f37923a;

        public o(String str) {
            this.f37923a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && C5207g.m11106a(this.f37923a, ((o) obj).f37923a);
        }

        public final int hashCode() {
            String str = this.f37923a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Vocabulary(language="), this.f37923a, ")");
        }
    }
}
