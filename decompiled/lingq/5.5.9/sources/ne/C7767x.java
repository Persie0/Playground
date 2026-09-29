package ne;

/* JADX INFO: renamed from: ne.x */
/* JADX INFO: loaded from: classes.dex */
public final class C7767x extends AbstractC7747d0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC7747d0.a f42674a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7747d0.c f42675b;

    /* JADX INFO: renamed from: c */
    public final AbstractC7747d0.b f42676c;

    public C7767x(C7768y c7768y, C7741a0 c7741a0, C7769z c7769z) {
        this.f42674a = c7768y;
        this.f42675b = c7741a0;
        this.f42676c = c7769z;
    }

    @Override // ne.AbstractC7747d0
    /* JADX INFO: renamed from: a */
    public final AbstractC7747d0.a mo15446a() {
        return this.f42674a;
    }

    @Override // ne.AbstractC7747d0
    /* JADX INFO: renamed from: b */
    public final AbstractC7747d0.b mo15447b() {
        return this.f42676c;
    }

    @Override // ne.AbstractC7747d0
    /* JADX INFO: renamed from: c */
    public final AbstractC7747d0.c mo15448c() {
        return this.f42675b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7747d0)) {
            return false;
        }
        AbstractC7747d0 abstractC7747d0 = (AbstractC7747d0) obj;
        return this.f42674a.equals(abstractC7747d0.mo15446a()) && this.f42675b.equals(abstractC7747d0.mo15448c()) && this.f42676c.equals(abstractC7747d0.mo15447b());
    }

    public final int hashCode() {
        return ((((this.f42674a.hashCode() ^ 1000003) * 1000003) ^ this.f42675b.hashCode()) * 1000003) ^ this.f42676c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f42674a + ", osData=" + this.f42675b + ", deviceData=" + this.f42676c + "}";
    }
}
