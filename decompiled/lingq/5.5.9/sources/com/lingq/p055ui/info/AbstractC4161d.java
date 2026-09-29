package com.lingq.p055ui.info;

import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.library.LessonInfo;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.lingq.ui.info.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4161d {

    /* JADX INFO: renamed from: com.lingq.ui.info.d$a */
    public static final class a extends AbstractC4161d {

        /* JADX INFO: renamed from: a */
        public final int f27048a;

        public a(int i10) {
            this.f27048a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f27048a == ((a) obj).f27048a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f27048a);
        }

        public final String toString() {
            return C0166e.m768o(new StringBuilder("NavigateCourse(courseId="), this.f27048a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.info.d$b */
    public static final class b extends AbstractC4161d {

        /* JADX INFO: renamed from: a */
        public final LessonInfo f27049a;

        public b(LessonInfo lessonInfo) {
            this.f27049a = lessonInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C5207g.m11106a(this.f27049a, ((b) obj).f27049a);
        }

        public final int hashCode() {
            return this.f27049a.hashCode();
        }

        public final String toString() {
            return "NavigateLesson(lesson=" + this.f27049a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.info.d$c */
    public static final class c extends AbstractC4161d {

        /* JADX INFO: renamed from: a */
        public final LessonInfo f27050a;

        /* JADX INFO: renamed from: b */
        public final boolean f27051b;

        public c(LessonInfo lessonInfo, boolean z10) {
            this.f27050a = lessonInfo;
            this.f27051b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C5207g.m11106a(this.f27050a, cVar.f27050a) && this.f27051b == cVar.f27051b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = this.f27050a.hashCode() * 31;
            boolean z10 = this.f27051b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            return "NavigatePlaylistManage(lesson=" + this.f27050a + ", removeFromPlaylist=" + this.f27051b + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.info.d$d */
    public static final class d extends AbstractC4161d {

        /* JADX INFO: renamed from: a */
        public final String f27052a;

        public d(String str) {
            C5207g.m11111f(str, "query");
            this.f27052a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C5207g.m11106a(this.f27052a, ((d) obj).f27052a);
        }

        public final int hashCode() {
            return this.f27052a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("NavigateToSearchSource(query="), this.f27052a, ")");
        }
    }
}
