package com.lingq.shared.download;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: com.lingq.shared.download.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3312a<T> {

    /* JADX INFO: renamed from: com.lingq.shared.download.a$a */
    public static final class a<T> extends AbstractC3312a<T> {

        /* JADX INFO: renamed from: a */
        public final T f17996a;

        /* JADX INFO: renamed from: b */
        public final String f17997b;

        /* JADX INFO: renamed from: c */
        public final boolean f17998c;

        public /* synthetic */ a(Object obj) {
            this(obj, "", false);
        }

        public a(T t10, String str, boolean z10) {
            C5207g.m11111f(t10, "item");
            C5207g.m11111f(str, "fileName");
            this.f17996a = t10;
            this.f17997b = str;
            this.f17998c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f17996a, aVar.f17996a) && C5207g.m11106a(this.f17997b, aVar.f17997b) && this.f17998c == aVar.f17998c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int iM758d = C0166e.m758d(this.f17997b, this.f17996a.hashCode() * 31, 31);
            boolean z10 = this.f17998c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iM758d + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Completed(item=");
            sb2.append(this.f17996a);
            sb2.append(", fileName=");
            sb2.append(this.f17997b);
            sb2.append(", autoPlay=");
            return C0166e.m769p(sb2, this.f17998c, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.shared.download.a$b */
    public static final class b<T> extends AbstractC3312a<T> {

        /* JADX INFO: renamed from: a */
        public final T f17999a;

        public b(T t10) {
            C5207g.m11111f(t10, "item");
            this.f17999a = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && C5207g.m11106a(this.f17999a, ((b) obj).f17999a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f17999a.hashCode();
        }

        public final String toString() {
            return "Error(item=" + this.f17999a + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.shared.download.a$c */
    public static final class c<T> extends AbstractC3312a<T> {

        /* JADX INFO: renamed from: a */
        public final T f18000a;

        /* JADX INFO: renamed from: b */
        public final int f18001b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i10, Object obj) {
            C5207g.m11111f(obj, "item");
            this.f18000a = obj;
            this.f18001b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C5207g.m11106a(this.f18000a, cVar.f18000a) && this.f18001b == cVar.f18001b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18001b) + (this.f18000a.hashCode() * 31);
        }

        public final String toString() {
            return "InProgress(item=" + this.f18000a + ", progress=" + this.f18001b + ")";
        }
    }
}
