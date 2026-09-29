package kotlin;

import java.io.Serializable;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
public final class Result<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f47625a;

    public static final class Failure implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f47626a;

        public Failure(Throwable th) {
            th.getClass();
            this.f47626a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                return fa4.m11650l(this.f47626a, ((Failure) obj).f47626a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f47626a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f47626a + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m15355a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f47626a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return fa4.m11650l(this.f47625a, ((Result) obj).f47625a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f47625a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f47625a;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
