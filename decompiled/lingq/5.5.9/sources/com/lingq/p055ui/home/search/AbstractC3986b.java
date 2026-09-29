package com.lingq.p055ui.home.search;

import com.lingq.shared.uimodel.library.LibraryShelf;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.lingq.ui.home.search.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3986b {

    /* JADX INFO: renamed from: com.lingq.ui.home.search.b$a */
    public static final class a extends AbstractC3986b {

        /* JADX INFO: renamed from: a */
        public final String f26071a;

        public a(String str) {
            C5207g.m11111f(str, "query");
            this.f26071a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C5207g.m11106a(this.f26071a, ((a) obj).f26071a);
        }

        public final int hashCode() {
            return this.f26071a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("NavigateAccent(query="), this.f26071a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.b$b */
    public static final class b extends AbstractC3986b {

        /* JADX INFO: renamed from: a */
        public final String f26072a;

        public b(String str) {
            C5207g.m11111f(str, "query");
            this.f26072a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C5207g.m11106a(this.f26072a, ((b) obj).f26072a);
        }

        public final int hashCode() {
            return this.f26072a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("NavigateMoreCourses(query="), this.f26072a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.b$c */
    public static final class c extends AbstractC3986b {

        /* JADX INFO: renamed from: a */
        public final String f26073a;

        public c(String str) {
            C5207g.m11111f(str, "query");
            this.f26073a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C5207g.m11106a(this.f26073a, ((c) obj).f26073a);
        }

        public final int hashCode() {
            return this.f26073a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("NavigateMoreLessons(query="), this.f26073a, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.search.b$d */
    public static final class d extends AbstractC3986b {

        /* JADX INFO: renamed from: a */
        public final String f26074a;

        /* JADX INFO: renamed from: b */
        public final LibraryShelf f26075b;

        public d(LibraryShelf libraryShelf, String str) {
            C5207g.m11111f(str, "query");
            this.f26074a = str;
            this.f26075b = libraryShelf;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C5207g.m11106a(this.f26074a, dVar.f26074a) && C5207g.m11106a(this.f26075b, dVar.f26075b);
        }

        public final int hashCode() {
            return this.f26075b.hashCode() + (this.f26074a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateShelf(query=" + this.f26074a + ", shelf=" + this.f26075b + ")";
        }
    }
}
