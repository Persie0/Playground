package com.lingq.p055ui.home.collections;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import dm.C5207g;
import p181ii.C6332a;

/* JADX INFO: renamed from: com.lingq.ui.home.collections.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3569a {

    /* JADX INFO: renamed from: a */
    public final C6332a f23430a;

    /* JADX INFO: renamed from: b */
    public final boolean f23431b;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.a$a */
    public static final class a extends AbstractC3569a {

        /* JADX INFO: renamed from: c */
        public final C6332a f23432c;

        /* JADX INFO: renamed from: d */
        public final LibraryItemCounter f23433d;

        /* JADX INFO: renamed from: e */
        public final boolean f23434e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6332a c6332a, LibraryItemCounter libraryItemCounter, boolean z10) {
            super(c6332a, z10);
            C5207g.m11111f(c6332a, "lesson");
            this.f23432c = c6332a;
            this.f23433d = libraryItemCounter;
            this.f23434e = z10;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3569a
        /* JADX INFO: renamed from: a */
        public final C6332a mo9843a() {
            return this.f23432c;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3569a
        /* JADX INFO: renamed from: b */
        public final boolean mo9844b() {
            return this.f23434e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f23432c, aVar.f23432c) && C5207g.m11106a(this.f23433d, aVar.f23433d) && this.f23434e == aVar.f23434e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final int hashCode() {
            int iHashCode = this.f23432c.hashCode() * 31;
            LibraryItemCounter libraryItemCounter = this.f23433d;
            int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
            boolean z10 = this.f23434e;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode2 + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DownloadLesson(lesson=");
            sb2.append(this.f23432c);
            sb2.append(", lessonCounter=");
            sb2.append(this.f23433d);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f23434e, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.a$b */
    public static final class b extends AbstractC3569a {

        /* JADX INFO: renamed from: c */
        public final C6332a f23435c;

        /* JADX INFO: renamed from: d */
        public final boolean f23436d;

        /* JADX INFO: renamed from: e */
        public final boolean f23437e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6332a c6332a, boolean z10, boolean z11) {
            super(c6332a, z11);
            C5207g.m11111f(c6332a, "lesson");
            this.f23435c = c6332a;
            this.f23436d = z10;
            this.f23437e = z11;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3569a
        /* JADX INFO: renamed from: a */
        public final C6332a mo9843a() {
            return this.f23435c;
        }

        @Override // com.lingq.p055ui.home.collections.AbstractC3569a
        /* JADX INFO: renamed from: b */
        public final boolean mo9844b() {
            return this.f23437e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f23435c, bVar.f23435c) && this.f23436d == bVar.f23436d && this.f23437e == bVar.f23437e;
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
            int iHashCode = this.f23435c.hashCode() * 31;
            ?? r10 = 1;
            boolean z10 = this.f23436d;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iHashCode + r11) * 31;
            boolean z11 = this.f23437e;
            if (!z11) {
                r10 = z11;
            }
            return i10 + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveLesson(lesson=");
            sb2.append(this.f23435c);
            sb2.append(", save=");
            sb2.append(this.f23436d);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f23437e, ")");
        }
    }

    public AbstractC3569a(C6332a c6332a, boolean z10) {
        this.f23430a = c6332a;
        this.f23431b = z10;
    }

    /* JADX INFO: renamed from: a */
    public C6332a mo9843a() {
        return this.f23430a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo9844b() {
        return this.f23431b;
    }
}
