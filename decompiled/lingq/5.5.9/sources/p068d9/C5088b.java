package p068d9;

import p452w8.AbstractC9833n;
import p452w8.AbstractC9838s;

/* JADX INFO: renamed from: d9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5088b extends AbstractC5095i {

    /* JADX INFO: renamed from: a */
    public final long f33028a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9838s f33029b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9833n f33030c;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C5088b(long j10, AbstractC9838s abstractC9838s, AbstractC9833n abstractC9833n) {
        this.f33028a = j10;
        if (abstractC9838s == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f33029b = abstractC9838s;
        if (abstractC9833n == null) {
            throw new NullPointerException("Null event");
        }
        this.f33030c = abstractC9833n;
    }

    @Override // p068d9.AbstractC5095i
    /* JADX INFO: renamed from: a */
    public final AbstractC9833n mo10849a() {
        return this.f33030c;
    }

    @Override // p068d9.AbstractC5095i
    /* JADX INFO: renamed from: b */
    public final long mo10850b() {
        return this.f33028a;
    }

    @Override // p068d9.AbstractC5095i
    /* JADX INFO: renamed from: c */
    public final AbstractC9838s mo10851c() {
        return this.f33029b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5095i)) {
            return false;
        }
        AbstractC5095i abstractC5095i = (AbstractC5095i) obj;
        return this.f33028a == abstractC5095i.mo10850b() && this.f33029b.equals(abstractC5095i.mo10851c()) && this.f33030c.equals(abstractC5095i.mo10849a());
    }

    public final int hashCode() {
        long j10 = this.f33028a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f33029b.hashCode()) * 1000003) ^ this.f33030c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f33028a + ", transportContext=" + this.f33029b + ", event=" + this.f33030c + "}";
    }
}
