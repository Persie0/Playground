package com.lingq.p055ui.home.course;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: com.lingq.ui.home.course.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3689c {

    /* JADX INFO: renamed from: a */
    public final boolean f24159a;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.c$a */
    public static final class a extends AbstractC3689c {

        /* JADX INFO: renamed from: b */
        public final int f24160b;

        /* JADX INFO: renamed from: c */
        public final String f24161c;

        /* JADX INFO: renamed from: d */
        public final boolean f24162d;

        public a(String str, int i10, boolean z10) {
            super(z10);
            this.f24160b = i10;
            this.f24161c = str;
            this.f24162d = z10;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3689c
        /* JADX INFO: renamed from: a */
        public final boolean mo9903a() {
            return this.f24162d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24160b == aVar.f24160b && C5207g.m11106a(this.f24161c, aVar.f24161c) && this.f24162d == aVar.f24162d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f24161c, Integer.hashCode(this.f24160b) * 31, 31);
            boolean z10 = this.f24162d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM758d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateAddPlaylist(id=");
            sb2.append(this.f24160b);
            sb2.append(", url=");
            sb2.append(this.f24161c);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f24162d, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.c$b */
    public static final class b extends AbstractC3689c {

        /* JADX INFO: renamed from: b */
        public final int f24163b;

        /* JADX INFO: renamed from: c */
        public final String f24164c;

        /* JADX INFO: renamed from: d */
        public final boolean f24165d;

        /* JADX INFO: renamed from: e */
        public final boolean f24166e;

        /* JADX INFO: renamed from: f */
        public final boolean f24167f;

        /* JADX INFO: renamed from: g */
        public final boolean f24168g;

        public b(int i10, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
            super(z13);
            this.f24163b = i10;
            this.f24164c = str;
            this.f24165d = z10;
            this.f24166e = z11;
            this.f24167f = z12;
            this.f24168g = z13;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3689c
        /* JADX INFO: renamed from: a */
        public final boolean mo9903a() {
            return this.f24168g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24163b == bVar.f24163b && C5207g.m11106a(this.f24164c, bVar.f24164c) && this.f24165d == bVar.f24165d && this.f24166e == bVar.f24166e && this.f24167f == bVar.f24167f && this.f24168g == bVar.f24168g) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f24163b) * 31;
            String str = this.f24164c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z10 = this.f24165d;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iHashCode2 + r10) * 31;
            boolean z11 = this.f24166e;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (i10 + r11) * 31;
            boolean z12 = this.f24167f;
            ?? r12 = z12;
            if (z12) {
                r12 = 1;
            }
            int i12 = (i11 + r12) * 31;
            boolean z13 = this.f24168g;
            return i12 + (z13 ? 1 : z13);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateCourseOverview(id=");
            sb2.append(this.f24163b);
            sb2.append(", title=");
            sb2.append(this.f24164c);
            sb2.append(", isLiked=");
            sb2.append(this.f24165d);
            sb2.append(", isAllLessonsTaken=");
            sb2.append(this.f24166e);
            sb2.append(", isSomeLessonsTaken=");
            sb2.append(this.f24167f);
            sb2.append(", isPremium=");
            return C0166e.m769p(sb2, this.f24168g, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.c$c */
    public static final class c extends AbstractC3689c {

        /* JADX INFO: renamed from: b */
        public final boolean f24169b;

        public c(boolean z10) {
            super(z10);
            this.f24169b = z10;
        }

        @Override // com.lingq.p055ui.home.course.AbstractC3689c
        /* JADX INFO: renamed from: a */
        public final boolean mo9903a() {
            return this.f24169b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f24169b == ((c) obj).f24169b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        public final int hashCode() {
            boolean z10 = this.f24169b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return r10;
        }

        public final String toString() {
            return "NavigateSaveCourse(isPremium=" + this.f24169b + ")";
        }
    }

    public AbstractC3689c(boolean z10) {
        this.f24159a = z10;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo9903a() {
        return this.f24159a;
    }
}
