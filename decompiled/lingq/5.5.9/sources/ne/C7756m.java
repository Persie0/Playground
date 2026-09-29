package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7756m extends AbstractC7743b0.e.d.a {

    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0.e.d.a.b f42608a;

    /* JADX INFO: renamed from: b */
    public final C7745c0<AbstractC7743b0.c> f42609b;

    /* JADX INFO: renamed from: c */
    public final C7745c0<AbstractC7743b0.c> f42610c;

    /* JADX INFO: renamed from: d */
    public final Boolean f42611d;

    /* JADX INFO: renamed from: e */
    public final int f42612e;

    /* JADX INFO: renamed from: ne.m$a */
    public static final class a extends AbstractC7743b0.e.d.a.AbstractC10655a {

        /* JADX INFO: renamed from: a */
        public AbstractC7743b0.e.d.a.b f42613a;

        /* JADX INFO: renamed from: b */
        public C7745c0<AbstractC7743b0.c> f42614b;

        /* JADX INFO: renamed from: c */
        public C7745c0<AbstractC7743b0.c> f42615c;

        /* JADX INFO: renamed from: d */
        public Boolean f42616d;

        /* JADX INFO: renamed from: e */
        public Integer f42617e;

        public a(AbstractC7743b0.e.d.a aVar) {
            this.f42613a = aVar.mo15404c();
            this.f42614b = aVar.mo15403b();
            this.f42615c = aVar.mo15405d();
            this.f42616d = aVar.mo15402a();
            this.f42617e = Integer.valueOf(aVar.mo15406e());
        }

        /* JADX INFO: renamed from: a */
        public final C7756m m15467a() {
            String strConcat = this.f42613a == null ? " execution" : "";
            if (this.f42617e == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (strConcat.isEmpty()) {
                return new C7756m(this.f42613a, this.f42614b, this.f42615c, this.f42616d, this.f42617e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7756m() {
        throw null;
    }

    public C7756m(AbstractC7743b0.e.d.a.b bVar, C7745c0 c7745c0, C7745c0 c7745c1, Boolean bool, int i10) {
        this.f42608a = bVar;
        this.f42609b = c7745c0;
        this.f42610c = c7745c1;
        this.f42611d = bool;
        this.f42612e = i10;
    }

    @Override // ne.AbstractC7743b0.e.d.a
    /* JADX INFO: renamed from: a */
    public final Boolean mo15402a() {
        return this.f42611d;
    }

    @Override // ne.AbstractC7743b0.e.d.a
    /* JADX INFO: renamed from: b */
    public final C7745c0<AbstractC7743b0.c> mo15403b() {
        return this.f42609b;
    }

    @Override // ne.AbstractC7743b0.e.d.a
    /* JADX INFO: renamed from: c */
    public final AbstractC7743b0.e.d.a.b mo15404c() {
        return this.f42608a;
    }

    @Override // ne.AbstractC7743b0.e.d.a
    /* JADX INFO: renamed from: d */
    public final C7745c0<AbstractC7743b0.c> mo15405d() {
        return this.f42610c;
    }

    @Override // ne.AbstractC7743b0.e.d.a
    /* JADX INFO: renamed from: e */
    public final int mo15406e() {
        return this.f42612e;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        C7745c0<AbstractC7743b0.c> c7745c0;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a)) {
            return false;
        }
        AbstractC7743b0.e.d.a aVar = (AbstractC7743b0.e.d.a) obj;
        if (this.f42608a.equals(aVar.mo15404c())) {
            C7745c0<AbstractC7743b0.c> c7745c1 = this.f42609b;
            if (c7745c1 == null) {
                if (aVar.mo15403b() == null) {
                    c7745c0 = this.f42610c;
                    if (c7745c0 == null) {
                        if (aVar.mo15405d() == null) {
                            bool = this.f42611d;
                            if (bool == null) {
                                if (aVar.mo15402a() == null) {
                                    if (this.f42612e == aVar.mo15406e()) {
                                        return true;
                                    }
                                }
                            } else if (bool.equals(aVar.mo15402a())) {
                                if (this.f42612e == aVar.mo15406e()) {
                                    return true;
                                }
                            }
                        }
                    } else if (c7745c0.equals(aVar.mo15405d())) {
                        bool = this.f42611d;
                        if (bool == null) {
                            if (aVar.mo15402a() == null) {
                                if (this.f42612e == aVar.mo15406e()) {
                                    return true;
                                }
                            }
                        } else if (bool.equals(aVar.mo15402a())) {
                            if (this.f42612e == aVar.mo15406e()) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c7745c1.equals(aVar.mo15403b())) {
                c7745c0 = this.f42610c;
                if (c7745c0 == null) {
                    if (aVar.mo15405d() == null) {
                        bool = this.f42611d;
                        if (bool == null) {
                            if (aVar.mo15402a() == null) {
                                if (this.f42612e == aVar.mo15406e()) {
                                    return true;
                                }
                            }
                        } else if (bool.equals(aVar.mo15402a())) {
                            if (this.f42612e == aVar.mo15406e()) {
                                return true;
                            }
                        }
                    }
                } else if (c7745c0.equals(aVar.mo15405d())) {
                    bool = this.f42611d;
                    if (bool == null) {
                        if (aVar.mo15402a() == null) {
                            if (this.f42612e == aVar.mo15406e()) {
                                return true;
                            }
                        }
                    } else if (bool.equals(aVar.mo15402a())) {
                        if (this.f42612e == aVar.mo15406e()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ne.AbstractC7743b0.e.d.a
    /* JADX INFO: renamed from: f */
    public final a mo15407f() {
        return new a(this);
    }

    public final int hashCode() {
        int iHashCode = (this.f42608a.hashCode() ^ 1000003) * 1000003;
        C7745c0<AbstractC7743b0.c> c7745c0 = this.f42609b;
        int iHashCode2 = (iHashCode ^ (c7745c0 == null ? 0 : c7745c0.hashCode())) * 1000003;
        C7745c0<AbstractC7743b0.c> c7745c1 = this.f42610c;
        int iHashCode3 = (iHashCode2 ^ (c7745c1 == null ? 0 : c7745c1.hashCode())) * 1000003;
        Boolean bool = this.f42611d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f42612e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f42608a);
        sb2.append(", customAttributes=");
        sb2.append(this.f42609b);
        sb2.append(", internalKeys=");
        sb2.append(this.f42610c);
        sb2.append(", background=");
        sb2.append(this.f42611d);
        sb2.append(", uiOrientation=");
        return C0166e.m768o(sb2, this.f42612e, "}");
    }
}
