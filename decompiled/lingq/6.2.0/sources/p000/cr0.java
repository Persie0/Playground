package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cr0 implements er0 {

    /* JADX INFO: renamed from: a */
    public final Integer f34396a;

    public cr0(Integer num) {
        this.f34396a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr0) && fa4.m11650l(this.f34396a, ((cr0) obj).f34396a);
    }

    public final int hashCode() {
        Integer num = this.f34396a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "OpenBookChooser(replaceBookId=" + this.f34396a + ")";
    }
}
