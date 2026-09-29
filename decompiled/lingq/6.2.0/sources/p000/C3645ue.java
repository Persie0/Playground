package p000;

/* JADX INFO: renamed from: ue */
/* JADX INFO: loaded from: classes.dex */
public final class C3645ue {

    /* JADX INFO: renamed from: a */
    public final AbstractC3608te f63803a;

    public C3645ue(AbstractC3608te abstractC3608te) {
        this.f63803a = abstractC3608te;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3645ue) && fa4.m11650l(this.f63803a, ((C3645ue) obj).f63803a);
    }

    public final int hashCode() {
        return this.f63803a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.f63803a + ')';
    }
}
