package com.lingq.p055ui.lesson;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.CardStatus;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.lingq.ui.lesson.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4269c {

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$a */
    public static final class a extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public static final a f27844a = new a();
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$b */
    public static final class b extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public final String f27845a;

        public b(String str) {
            C5207g.m11111f(str, "url");
            this.f27845a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C5207g.m11106a(this.f27845a, ((b) obj).f27845a);
        }

        public final int hashCode() {
            return this.f27845a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("NavigateGrammarGuide(url="), this.f27845a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$c */
    public static final class c extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public final int f27846a;

        /* JADX INFO: renamed from: b */
        public final int f27847b;

        /* JADX INFO: renamed from: c */
        public final boolean f27848c;

        public c(int i10, int i11, boolean z10) {
            this.f27846a = i10;
            this.f27847b = i11;
            this.f27848c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f27846a == cVar.f27846a && this.f27847b == cVar.f27847b && this.f27848c == cVar.f27848c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM16d = C0009a.m16d(this.f27847b, Integer.hashCode(this.f27846a) * 31, 31);
            boolean z10 = this.f27848c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM16d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateLessonEdit(lessonId=");
            sb2.append(this.f27846a);
            sb2.append(", sentenceIndex=");
            sb2.append(this.f27847b);
            sb2.append(", hasAudio=");
            return C0166e.m769p(sb2, this.f27848c, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$d */
    public static final class d extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public final ReviewType f27849a;

        /* JADX INFO: renamed from: b */
        public final int f27850b;

        /* JADX INFO: renamed from: c */
        public final CardStatus f27851c;

        /* JADX INFO: renamed from: d */
        public final int f27852d;

        public d(ReviewType reviewType, int i10, CardStatus cardStatus, int i11) {
            C5207g.m11111f(reviewType, "type");
            C5207g.m11111f(cardStatus, "statusUpper");
            this.f27849a = reviewType;
            this.f27850b = i10;
            this.f27851c = cardStatus;
            this.f27852d = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27849a == dVar.f27849a && this.f27850b == dVar.f27850b && this.f27851c == dVar.f27851c && this.f27852d == dVar.f27852d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f27852d) + ((this.f27851c.hashCode() + C0009a.m16d(this.f27850b, this.f27849a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "NavigateReview(type=" + this.f27849a + ", lessonId=" + this.f27850b + ", statusUpper=" + this.f27851c + ", sentenceIndex=" + this.f27852d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$e */
    public static final class e extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public static final e f27853a = new e();
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$f */
    public static final class f extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public static final f f27854a = new f();
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$g */
    public static final class g extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public final String f27855a;

        public g(String str) {
            C5207g.m11111f(str, "attemptedAction");
            this.f27855a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g) && C5207g.m11106a(this.f27855a, ((g) obj).f27855a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f27855a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("NavigateUpgrade(attemptedAction="), this.f27855a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.c$h */
    public static final class h extends AbstractC4269c {

        /* JADX INFO: renamed from: a */
        public static final h f27856a = new h();
    }
}
