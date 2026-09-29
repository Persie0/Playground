package com.lingq.p055ui.home.library;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.util.LessonPath;
import dm.C5207g;
import p181ii.C6332a;

/* JADX INFO: renamed from: com.lingq.ui.home.library.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3813g {

    /* JADX INFO: renamed from: a */
    public final C6332a f25017a;

    /* JADX INFO: renamed from: b */
    public final boolean f25018b;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.g$a */
    public static final class a extends AbstractC3813g {

        /* JADX INFO: renamed from: c */
        public final C6332a f25019c;

        /* JADX INFO: renamed from: d */
        public final boolean f25020d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6332a c6332a, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f25019c = c6332a;
            this.f25020d = z10;
        }

        @Override // com.lingq.p055ui.home.library.AbstractC3813g
        /* JADX INFO: renamed from: a */
        public final C6332a mo9955a() {
            return this.f25019c;
        }

        @Override // com.lingq.p055ui.home.library.AbstractC3813g
        /* JADX INFO: renamed from: b */
        public final boolean mo9956b() {
            return this.f25020d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f25019c, aVar.f25019c) && this.f25020d == aVar.f25020d) {
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
            int iHashCode = this.f25019c.hashCode() * 31;
            boolean z10 = this.f25020d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "NavigateAddLessonToPlaylist(lesson=" + this.f25019c + ", isPremium=" + this.f25020d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.g$b */
    public static final class b extends AbstractC3813g {

        /* JADX INFO: renamed from: c */
        public final LibraryShelf f25021c;

        /* JADX INFO: renamed from: d */
        public final int f25022d;

        public b(LibraryShelf libraryShelf, int i10) {
            C5207g.m11111f(libraryShelf, "shelf");
            this.f25021c = libraryShelf;
            this.f25022d = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f25021c, bVar.f25021c) && this.f25022d == bVar.f25022d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f25022d) + (this.f25021c.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateCollectionOverview(shelf=" + this.f25021c + ", miniStoriesCourseId=" + this.f25022d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.g$c */
    public static final class c extends AbstractC3813g {

        /* JADX INFO: renamed from: c */
        public final C6332a f25023c;

        /* JADX INFO: renamed from: d */
        public final LibraryItemCounter f25024d;

        /* JADX INFO: renamed from: e */
        public final boolean f25025e;

        /* JADX INFO: renamed from: f */
        public final LessonPath f25026f;

        /* JADX INFO: renamed from: g */
        public final boolean f25027g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6332a c6332a, LibraryItemCounter libraryItemCounter, LessonPath.Feed feed, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f25023c = c6332a;
            this.f25024d = libraryItemCounter;
            this.f25025e = true;
            this.f25026f = feed;
            this.f25027g = z10;
        }

        @Override // com.lingq.p055ui.home.library.AbstractC3813g
        /* JADX INFO: renamed from: a */
        public final C6332a mo9955a() {
            return this.f25023c;
        }

        @Override // com.lingq.p055ui.home.library.AbstractC3813g
        /* JADX INFO: renamed from: b */
        public final boolean mo9956b() {
            return this.f25027g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C5207g.m11106a(this.f25023c, cVar.f25023c) && C5207g.m11106a(this.f25024d, cVar.f25024d) && this.f25025e == cVar.f25025e && C5207g.m11106a(this.f25026f, cVar.f25026f) && this.f25027g == cVar.f25027g) {
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
            int iHashCode = this.f25023c.hashCode() * 31;
            LibraryItemCounter libraryItemCounter = this.f25024d;
            int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
            ?? r10 = 1;
            boolean z10 = this.f25025e;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int iHashCode3 = (this.f25026f.hashCode() + ((iHashCode2 + r11) * 31)) * 31;
            boolean z11 = this.f25027g;
            if (!z11) {
                r10 = z11;
            }
            return iHashCode3 + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateLesson(lesson=");
            sb2.append(this.f25023c);
            sb2.append(", lessonCounter=");
            sb2.append(this.f25024d);
            sb2.append(", overrideOpen=");
            sb2.append(this.f25025e);
            sb2.append(", lessonPath=");
            sb2.append(this.f25026f);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f25027g, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.g$d */
    public static final class d extends AbstractC3813g {

        /* JADX INFO: renamed from: c */
        public final C6332a f25028c;

        /* JADX INFO: renamed from: d */
        public final boolean f25029d;

        /* JADX INFO: renamed from: e */
        public final boolean f25030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6332a c6332a, boolean z10, boolean z11) {
            super(c6332a, z11);
            C5207g.m11111f(c6332a, "lesson");
            this.f25028c = c6332a;
            this.f25029d = z10;
            this.f25030e = z11;
        }

        @Override // com.lingq.p055ui.home.library.AbstractC3813g
        /* JADX INFO: renamed from: a */
        public final C6332a mo9955a() {
            return this.f25028c;
        }

        @Override // com.lingq.p055ui.home.library.AbstractC3813g
        /* JADX INFO: renamed from: b */
        public final boolean mo9956b() {
            return this.f25030e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C5207g.m11106a(this.f25028c, dVar.f25028c) && this.f25029d == dVar.f25029d && this.f25030e == dVar.f25030e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iHashCode = this.f25028c.hashCode() * 31;
            ?? r10 = 1;
            boolean z10 = this.f25029d;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iHashCode + r11) * 31;
            boolean z11 = this.f25030e;
            if (!z11) {
                r10 = z11;
            }
            return i10 + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateSaveLesson(lesson=");
            sb2.append(this.f25028c);
            sb2.append(", save=");
            sb2.append(this.f25029d);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f25030e, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.g$e */
    public static final class e extends AbstractC3813g {

        /* JADX INFO: renamed from: c */
        public static final e f25031c = new e();
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.g$f */
    public static final class f extends AbstractC3813g {

        /* JADX INFO: renamed from: c */
        public static final f f25032c = new f();
    }

    public /* synthetic */ AbstractC3813g() {
        this(null, false);
    }

    public AbstractC3813g(C6332a c6332a, boolean z10) {
        this.f25017a = c6332a;
        this.f25018b = z10;
    }

    /* JADX INFO: renamed from: a */
    public C6332a mo9955a() {
        return this.f25017a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo9956b() {
        return this.f25018b;
    }
}
