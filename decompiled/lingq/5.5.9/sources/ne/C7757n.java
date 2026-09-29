package ne;

/* JADX INFO: renamed from: ne.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7757n extends AbstractC7743b0.e.d.a.b {

    /* JADX INFO: renamed from: a */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d> f42618a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7743b0.e.d.a.b.AbstractC10658b f42619b;

    /* JADX INFO: renamed from: c */
    public final AbstractC7743b0.a f42620c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7743b0.e.d.a.b.c f42621d;

    /* JADX INFO: renamed from: e */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10656a> f42622e;

    public C7757n() {
        throw null;
    }

    public C7757n(C7745c0 c7745c0, AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b, AbstractC7743b0.a aVar, AbstractC7743b0.e.d.a.b.c cVar, C7745c0 c7745c1) {
        this.f42618a = c7745c0;
        this.f42619b = abstractC10658b;
        this.f42620c = aVar;
        this.f42621d = cVar;
        this.f42622e = c7745c1;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b
    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0.a mo15408a() {
        return this.f42620c;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b
    /* JADX INFO: renamed from: b */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10656a> mo15409b() {
        return this.f42622e;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b
    /* JADX INFO: renamed from: c */
    public final AbstractC7743b0.e.d.a.b.AbstractC10658b mo15410c() {
        return this.f42619b;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b
    /* JADX INFO: renamed from: d */
    public final AbstractC7743b0.e.d.a.b.c mo15411d() {
        return this.f42621d;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b
    /* JADX INFO: renamed from: e */
    public final C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d> mo15412e() {
        return this.f42618a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    public final boolean equals(Object obj) {
        AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b;
        AbstractC7743b0.a aVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a.b)) {
            return false;
        }
        AbstractC7743b0.e.d.a.b bVar = (AbstractC7743b0.e.d.a.b) obj;
        C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d> c7745c0 = this.f42618a;
        if (c7745c0 == null) {
            if (bVar.mo15412e() == null) {
                abstractC10658b = this.f42619b;
                if (abstractC10658b == null) {
                    if (bVar.mo15410c() == null) {
                        aVar = this.f42620c;
                        if (aVar == null) {
                            if (bVar.mo15408a() == null) {
                                if (this.f42621d.equals(bVar.mo15411d()) && this.f42622e.equals(bVar.mo15409b())) {
                                    return true;
                                }
                            }
                        } else if (aVar.equals(bVar.mo15408a())) {
                            if (this.f42621d.equals(bVar.mo15411d())) {
                                return true;
                            }
                        }
                    }
                } else if (abstractC10658b.equals(bVar.mo15410c())) {
                    aVar = this.f42620c;
                    if (aVar == null) {
                        if (bVar.mo15408a() == null) {
                            if (this.f42621d.equals(bVar.mo15411d())) {
                                return true;
                            }
                        }
                    } else if (aVar.equals(bVar.mo15408a())) {
                        if (this.f42621d.equals(bVar.mo15411d())) {
                            return true;
                        }
                    }
                }
            }
        } else if (c7745c0.equals(bVar.mo15412e())) {
            abstractC10658b = this.f42619b;
            if (abstractC10658b == null) {
                if (bVar.mo15410c() == null) {
                    aVar = this.f42620c;
                    if (aVar == null) {
                        if (bVar.mo15408a() == null) {
                            if (this.f42621d.equals(bVar.mo15411d())) {
                                return true;
                            }
                        }
                    } else if (aVar.equals(bVar.mo15408a())) {
                        if (this.f42621d.equals(bVar.mo15411d())) {
                            return true;
                        }
                    }
                }
            } else if (abstractC10658b.equals(bVar.mo15410c())) {
                aVar = this.f42620c;
                if (aVar == null) {
                    if (bVar.mo15408a() == null) {
                        if (this.f42621d.equals(bVar.mo15411d())) {
                            return true;
                        }
                    }
                } else if (aVar.equals(bVar.mo15408a())) {
                    if (this.f42621d.equals(bVar.mo15411d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        C7745c0<AbstractC7743b0.e.d.a.b.AbstractC10659d> c7745c0 = this.f42618a;
        int iHashCode2 = ((c7745c0 == null ? 0 : c7745c0.hashCode()) ^ 1000003) * 1000003;
        AbstractC7743b0.e.d.a.b.AbstractC10658b abstractC10658b = this.f42619b;
        int iHashCode3 = (iHashCode2 ^ (abstractC10658b == null ? 0 : abstractC10658b.hashCode())) * 1000003;
        AbstractC7743b0.a aVar = this.f42620c;
        if (aVar != null) {
            iHashCode = aVar.hashCode();
        }
        return ((((iHashCode ^ iHashCode3) * 1000003) ^ this.f42621d.hashCode()) * 1000003) ^ this.f42622e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f42618a + ", exception=" + this.f42619b + ", appExitInfo=" + this.f42620c + ", signal=" + this.f42621d + ", binaries=" + this.f42622e + "}";
    }
}
