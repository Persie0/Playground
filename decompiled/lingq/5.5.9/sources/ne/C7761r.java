package ne;

/* JADX INFO: renamed from: ne.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7761r extends AbstractC7743b0.e.d.a.b.AbstractC10659d {

    /* JADX INFO: renamed from: a */
    public final String f42639a;

    /* JADX INFO: renamed from: b */
    public final int f42640b;

    /* JADX INFO: renamed from: c */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a> f42641c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7761r() {
        throw null;
    }

    public C7761r(String str, int i10, C7745c0 c7745c0) {
        this.f42639a = str;
        this.f42640b = i10;
        this.f42641c = c7745c0;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d
    /* JADX INFO: renamed from: a */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a> mo15425a() {
        return this.f42641c;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d
    /* JADX INFO: renamed from: b */
    public final int mo15426b() {
        return this.f42640b;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d
    /* JADX INFO: renamed from: c */
    public final String mo15427c() {
        return this.f42639a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a.b.AbstractC10659d)) {
            return false;
        }
        AbstractC7743b0.e.d.a.b.AbstractC10659d abstractC10659d = (AbstractC7743b0.e.d.a.b.AbstractC10659d) obj;
        return this.f42639a.equals(abstractC10659d.mo15427c()) && this.f42640b == abstractC10659d.mo15426b() && this.f42641c.equals(abstractC10659d.mo15425a());
    }

    public final int hashCode() {
        return ((((this.f42639a.hashCode() ^ 1000003) * 1000003) ^ this.f42640b) * 1000003) ^ this.f42641c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f42639a + ", importance=" + this.f42640b + ", frames=" + this.f42641c + "}";
    }
}
