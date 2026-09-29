package com.lingq.commons.controllers;

import android.net.Uri;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryShelf;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.lingq.commons.controllers.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3274b {

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$a */
    public static final class a extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final Uri f16682a;

        public a(Uri uri) {
            this.f16682a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C5207g.m11106a(this.f16682a, ((a) obj).f16682a);
        }

        public final int hashCode() {
            return this.f16682a.hashCode();
        }

        public final String toString() {
            return "Challenge(uri=" + this.f16682a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$b */
    public static final class b extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final Uri f16683a;

        public b(Uri uri) {
            this.f16683a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C5207g.m11106a(this.f16683a, ((b) obj).f16683a);
        }

        public final int hashCode() {
            return this.f16683a.hashCode();
        }

        public final String toString() {
            return "ChallengeDetail(uri=" + this.f16683a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$c */
    public static final class c extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16684a;

        /* JADX INFO: renamed from: b */
        public final AbstractC3274b f16685b;

        public c(String str, AbstractC3274b abstractC3274b) {
            C5207g.m11111f(str, "language");
            C5207g.m11111f(abstractC3274b, "destination");
            this.f16684a = str;
            this.f16685b = abstractC3274b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C5207g.m11106a(this.f16684a, cVar.f16684a) && C5207g.m11106a(this.f16685b, cVar.f16685b);
        }

        public final int hashCode() {
            return this.f16685b.hashCode() + (this.f16684a.hashCode() * 31);
        }

        public final String toString() {
            return "ChangeLanguage(language=" + this.f16684a + ", destination=" + this.f16685b + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$d */
    public static final class d extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final LibraryShelf f16686a;

        public d(LibraryShelf libraryShelf) {
            C5207g.m11111f(libraryShelf, "shelf");
            this.f16686a = libraryShelf;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C5207g.m11106a(this.f16686a, ((d) obj).f16686a);
        }

        public final int hashCode() {
            return this.f16686a.hashCode();
        }

        public final String toString() {
            return "Collections(shelf=" + this.f16686a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$e */
    public static final class e extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final int f16687a;

        public e(int i10) {
            this.f16687a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f16687a == ((e) obj).f16687a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16687a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("Course(courseId="), this.f16687a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$f */
    public static final class f extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public static final f f16688a = new f();
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$g */
    public static final class g extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final int f16689a;

        /* JADX INFO: renamed from: b */
        public final String f16690b;

        /* JADX INFO: renamed from: c */
        public final String f16691c;

        public g(String str, int i10, String str2) {
            this.f16689a = i10;
            this.f16690b = str;
            this.f16691c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f16689a == gVar.f16689a && C5207g.m11106a(this.f16690b, gVar.f16690b) && C5207g.m11106a(this.f16691c, gVar.f16691c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f16689a) * 31;
            int iHashCode2 = 0;
            String str = this.f16690b;
            int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f16691c;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
            }
            return iHashCode3 + iHashCode2;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Lesson(lessonId=");
            sb2.append(this.f16689a);
            sb2.append(", medium=");
            sb2.append(this.f16690b);
            sb2.append(", source=");
            return C0009a.m23l(sb2, this.f16691c, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$h */
    public static final class h extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public static final h f16692a = new h();
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$i */
    public static final class i extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final Uri f16693a;

        public i(Uri uri) {
            this.f16693a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && C5207g.m11106a(this.f16693a, ((i) obj).f16693a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16693a.hashCode();
        }

        public final String toString() {
            return "Login(uri=" + this.f16693a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$j */
    public static final class j extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16694a;

        public j(String str) {
            C5207g.m11111f(str, "url");
            this.f16694a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof j) && C5207g.m11106a(this.f16694a, ((j) obj).f16694a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16694a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("LoginRedirect(url="), this.f16694a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$k */
    public static final class k extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public static final k f16695a = new k();
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$l */
    public static final class l extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16696a;

        /* JADX INFO: renamed from: b */
        public final Integer f16697b;

        public l(Integer num, String str) {
            C5207g.m11111f(str, "language");
            this.f16696a = str;
            this.f16697b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return C5207g.m11106a(this.f16696a, lVar.f16696a) && C5207g.m11106a(this.f16697b, lVar.f16697b);
        }

        public final int hashCode() {
            int iHashCode = this.f16696a.hashCode() * 31;
            Integer num = this.f16697b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Playlist(language=" + this.f16696a + ", folderId=" + this.f16697b + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$m */
    public static final class m extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final int f16698a;

        public m(int i10) {
            this.f16698a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f16698a == ((m) obj).f16698a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16698a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("PlaylistFolder(folderId="), this.f16698a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$n */
    public static final class n extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16699a;

        public n(String str) {
            this.f16699a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && C5207g.m11106a(this.f16699a, ((n) obj).f16699a);
        }

        public final int hashCode() {
            String str = this.f16699a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Review(lotd="), this.f16699a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$o */
    public static final class o extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16700a;

        /* JADX INFO: renamed from: b */
        public final String f16701b;

        public o(String str, String str2) {
            this.f16700a = str;
            this.f16701b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return C5207g.m11106a(this.f16700a, oVar.f16700a) && C5207g.m11106a(this.f16701b, oVar.f16701b);
        }

        public final int hashCode() {
            return this.f16701b.hashCode() + (this.f16700a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Shelf(language=");
            sb2.append(this.f16700a);
            sb2.append(", shelfCode=");
            return C0009a.m23l(sb2, this.f16701b, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$p */
    public static final class p extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16702a;

        public p(String str) {
            C5207g.m11111f(str, "url");
            this.f16702a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && C5207g.m11106a(this.f16702a, ((p) obj).f16702a);
        }

        public final int hashCode() {
            return this.f16702a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("ShowWebpage(url="), this.f16702a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$q */
    public static final class q extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public final String f16703a;

        public q(String str) {
            C5207g.m11111f(str, "offer");
            this.f16703a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof q) && C5207g.m11106a(this.f16703a, ((q) obj).f16703a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16703a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Upgrade(offer="), this.f16703a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.b$r */
    public static final class r extends AbstractC3274b {

        /* JADX INFO: renamed from: a */
        public static final r f16704a = new r();
    }
}
