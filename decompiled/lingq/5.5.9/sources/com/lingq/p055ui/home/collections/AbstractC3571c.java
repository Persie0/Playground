package com.lingq.p055ui.home.collections;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.util.LessonPath;
import dm.C5207g;
import p181ii.C6332a;

/* JADX INFO: renamed from: com.lingq.ui.home.collections.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3571c {

    /* JADX INFO: renamed from: a */
    public final C6332a f23441a;

    /* JADX INFO: renamed from: b */
    public final boolean f23442b;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.c$a */
    public static final class a extends AbstractC3571c {

        /* JADX INFO: renamed from: c */
        public final C6332a f23443c;

        /* JADX INFO: renamed from: d */
        public final boolean f23444d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6332a c6332a, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f23443c = c6332a;
            this.f23444d = z10;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3571c
        /* JADX INFO: renamed from: a */
        public final C6332a mo9845a() {
            return this.f23443c;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3571c
        /* JADX INFO: renamed from: b */
        public final boolean mo9846b() {
            return this.f23444d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f23443c, aVar.f23443c) && this.f23444d == aVar.f23444d) {
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
            int iHashCode = this.f23443c.hashCode() * 31;
            boolean z10 = this.f23444d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "NavigateAddLessonToPlaylist(lesson=" + this.f23443c + ", isPremium=" + this.f23444d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.c$b */
    public static final class b extends AbstractC3571c {

        /* JADX INFO: renamed from: c */
        public final C6332a f23445c;

        /* JADX INFO: renamed from: d */
        public final LibraryItemCounter f23446d;

        /* JADX INFO: renamed from: e */
        public final boolean f23447e;

        /* JADX INFO: renamed from: f */
        public final LessonPath f23448f;

        /* JADX INFO: renamed from: g */
        public final boolean f23449g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6332a c6332a, LibraryItemCounter libraryItemCounter, LessonPath.SearchShelf searchShelf, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f23445c = c6332a;
            this.f23446d = libraryItemCounter;
            this.f23447e = true;
            this.f23448f = searchShelf;
            this.f23449g = z10;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3571c
        /* JADX INFO: renamed from: a */
        public final C6332a mo9845a() {
            return this.f23445c;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3571c
        /* JADX INFO: renamed from: b */
        public final boolean mo9846b() {
            return this.f23449g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (C5207g.m11106a(this.f23445c, bVar.f23445c) && C5207g.m11106a(this.f23446d, bVar.f23446d) && this.f23447e == bVar.f23447e && C5207g.m11106a(this.f23448f, bVar.f23448f) && this.f23449g == bVar.f23449g) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final int hashCode() {
            int iHashCode = this.f23445c.hashCode() * 31;
            LibraryItemCounter libraryItemCounter = this.f23446d;
            int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
            boolean z10 = this.f23447e;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iHashCode3 = (this.f23448f.hashCode() + ((iHashCode2 + r10) * 31)) * 31;
            boolean z11 = this.f23449g;
            return iHashCode3 + (z11 ? 1 : z11);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateLesson(lesson=");
            sb2.append(this.f23445c);
            sb2.append(", lessonCounter=");
            sb2.append(this.f23446d);
            sb2.append(", overrideOpen=");
            sb2.append(this.f23447e);
            sb2.append(", lessonPath=");
            sb2.append(this.f23448f);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f23449g, ")");
        }
    }

    public AbstractC3571c(C6332a c6332a, boolean z10) {
        this.f23441a = c6332a;
        this.f23442b = z10;
    }

    /* JADX INFO: renamed from: a */
    public C6332a mo9845a() {
        return this.f23441a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo9846b() {
        return this.f23442b;
    }
}
