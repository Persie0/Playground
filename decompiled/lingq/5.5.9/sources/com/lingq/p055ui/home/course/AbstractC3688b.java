package com.lingq.p055ui.home.course;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.util.LessonPath;
import dm.C5207g;
import p181ii.C6332a;

/* JADX INFO: renamed from: com.lingq.ui.home.course.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3688b {

    /* JADX INFO: renamed from: a */
    public final C6332a f24146a;

    /* JADX INFO: renamed from: b */
    public final boolean f24147b;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.b$a */
    public static final class a extends AbstractC3688b {

        /* JADX INFO: renamed from: c */
        public final C6332a f24148c;

        /* JADX INFO: renamed from: d */
        public final boolean f24149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6332a c6332a, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f24148c = c6332a;
            this.f24149d = z10;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: a */
        public final C6332a mo9901a() {
            return this.f24148c;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: b */
        public final boolean mo9902b() {
            return this.f24149d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f24148c, aVar.f24148c) && this.f24149d == aVar.f24149d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f24148c.hashCode() * 31;
            boolean z10 = this.f24149d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "NavigateAddLessonToPlaylist(lesson=" + this.f24148c + ", isPremium=" + this.f24149d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.b$b */
    public static final class b extends AbstractC3688b {

        /* JADX INFO: renamed from: c */
        public final C6332a f24150c;

        /* JADX INFO: renamed from: d */
        public final boolean f24151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6332a c6332a, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f24150c = c6332a;
            this.f24151d = z10;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: a */
        public final C6332a mo9901a() {
            return this.f24150c;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: b */
        public final boolean mo9902b() {
            return this.f24151d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f24150c, bVar.f24150c) && this.f24151d == bVar.f24151d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f24150c.hashCode() * 31;
            boolean z10 = this.f24151d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "NavigateDownloadLesson(lesson=" + this.f24150c + ", isPremium=" + this.f24151d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.b$c */
    public static final class c extends AbstractC3688b {

        /* JADX INFO: renamed from: c */
        public final C6332a f24152c;

        /* JADX INFO: renamed from: d */
        public final boolean f24153d;

        /* JADX INFO: renamed from: e */
        public final LessonPath f24154e;

        /* JADX INFO: renamed from: f */
        public final boolean f24155f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6332a c6332a, LessonPath lessonPath, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            C5207g.m11111f(lessonPath, "lessonPath");
            this.f24152c = c6332a;
            this.f24153d = true;
            this.f24154e = lessonPath;
            this.f24155f = z10;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: a */
        public final C6332a mo9901a() {
            return this.f24152c;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: b */
        public final boolean mo9902b() {
            return this.f24155f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C5207g.m11106a(this.f24152c, cVar.f24152c) && this.f24153d == cVar.f24153d && C5207g.m11106a(this.f24154e, cVar.f24154e) && this.f24155f == cVar.f24155f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final int hashCode() {
            int iHashCode = this.f24152c.hashCode() * 31;
            boolean z10 = this.f24153d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iHashCode2 = (this.f24154e.hashCode() + ((iHashCode + r10) * 31)) * 31;
            boolean z11 = this.f24155f;
            return iHashCode2 + (z11 ? 1 : z11);
        }

        public final String toString() {
            return "NavigateLesson(lesson=" + this.f24152c + ", overrideOpen=" + this.f24153d + ", lessonPath=" + this.f24154e + ", isPremium=" + this.f24155f + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.b$d */
    public static final class d extends AbstractC3688b {

        /* JADX INFO: renamed from: c */
        public final C6332a f24156c;

        /* JADX INFO: renamed from: d */
        public final boolean f24157d;

        /* JADX INFO: renamed from: e */
        public final boolean f24158e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6332a c6332a, boolean z10, boolean z11) {
            super(c6332a, z11);
            C5207g.m11111f(c6332a, "lesson");
            this.f24156c = c6332a;
            this.f24157d = z10;
            this.f24158e = z11;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: a */
        public final C6332a mo9901a() {
            return this.f24156c;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3688b
        /* JADX INFO: renamed from: b */
        public final boolean mo9902b() {
            return this.f24158e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C5207g.m11106a(this.f24156c, dVar.f24156c) && this.f24157d == dVar.f24157d && this.f24158e == dVar.f24158e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iHashCode = this.f24156c.hashCode() * 31;
            ?? r10 = 1;
            boolean z10 = this.f24157d;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iHashCode + r11) * 31;
            boolean z11 = this.f24158e;
            if (!z11) {
                r10 = z11;
            }
            return i10 + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateSaveLesson(lesson=");
            sb2.append(this.f24156c);
            sb2.append(", save=");
            sb2.append(this.f24157d);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f24158e, ")");
        }
    }

    public AbstractC3688b(C6332a c6332a, boolean z10) {
        this.f24146a = c6332a;
        this.f24147b = z10;
    }

    /* JADX INFO: renamed from: a */
    public C6332a mo9901a() {
        return this.f24146a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo9902b() {
        return this.f24147b;
    }
}
