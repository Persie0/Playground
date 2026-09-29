package p000;

/* JADX INFO: renamed from: mh */
/* JADX INFO: loaded from: classes.dex */
public final class C3335mh {

    /* JADX INFO: renamed from: a */
    public final int f51317a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3335mh) {
            return this.f51317a == ((C3335mh) obj).f51317a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51317a);
    }

    public final String toString() {
        return wq1.m24114j("AndroidContentDataType(androidAutofillType=", this.f51317a, ')');
    }
}
