package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ju0 {

    /* JADX INFO: renamed from: b */
    public static final iu0 f46150b = new iu0();

    /* JADX INFO: renamed from: a */
    public final Object f46151a;

    /* JADX INFO: renamed from: a */
    public static final Object m14648a(Object obj) {
        if (obj instanceof iu0) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ju0) {
            return fa4.m11650l(this.f46151a, ((ju0) obj).f46151a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f46151a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f46151a;
        if (obj instanceof hu0) {
            return ((hu0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
