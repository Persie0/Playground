package com.lingq.p055ui.lesson;

/* JADX INFO: renamed from: com.lingq.ui.lesson.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4272e {

    /* JADX INFO: renamed from: com.lingq.ui.lesson.e$a */
    public static final class a extends AbstractC4272e {

        /* JADX INFO: renamed from: a */
        public final double f27867a;

        /* JADX INFO: renamed from: b */
        public final double f27868b;

        public a(double d10, double d11) {
            this.f27867a = d10;
            this.f27868b = d11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f27867a, aVar.f27867a) == 0 && Double.compare(this.f27868b, aVar.f27868b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f27868b) + (Double.hashCode(this.f27867a) * 31);
        }

        public final String toString() {
            return "Play(start=" + this.f27867a + ", end=" + this.f27868b + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.e$b */
    public static final class b extends AbstractC4272e {

        /* JADX INFO: renamed from: a */
        public static final b f27869a = new b();
    }
}
