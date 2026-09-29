package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7742b extends AbstractC7743b0 {

    /* JADX INFO: renamed from: b */
    public final String f42504b;

    /* JADX INFO: renamed from: c */
    public final String f42505c;

    /* JADX INFO: renamed from: d */
    public final int f42506d;

    /* JADX INFO: renamed from: e */
    public final String f42507e;

    /* JADX INFO: renamed from: f */
    public final String f42508f;

    /* JADX INFO: renamed from: g */
    public final String f42509g;

    /* JADX INFO: renamed from: h */
    public final AbstractC7743b0.e f42510h;

    /* JADX INFO: renamed from: i */
    public final AbstractC7743b0.d f42511i;

    /* JADX INFO: renamed from: j */
    public final AbstractC7743b0.a f42512j;

    /* JADX INFO: renamed from: ne.b$a */
    public static final class a extends AbstractC7743b0.b {

        /* JADX INFO: renamed from: a */
        public String f42513a;

        /* JADX INFO: renamed from: b */
        public String f42514b;

        /* JADX INFO: renamed from: c */
        public Integer f42515c;

        /* JADX INFO: renamed from: d */
        public String f42516d;

        /* JADX INFO: renamed from: e */
        public String f42517e;

        /* JADX INFO: renamed from: f */
        public String f42518f;

        /* JADX INFO: renamed from: g */
        public AbstractC7743b0.e f42519g;

        /* JADX INFO: renamed from: h */
        public AbstractC7743b0.d f42520h;

        /* JADX INFO: renamed from: i */
        public AbstractC7743b0.a f42521i;

        public a() {
        }

        public a(AbstractC7743b0 abstractC7743b0) {
            this.f42513a = abstractC7743b0.mo15346h();
            this.f42514b = abstractC7743b0.mo15342d();
            this.f42515c = Integer.valueOf(abstractC7743b0.mo15345g());
            this.f42516d = abstractC7743b0.mo15343e();
            this.f42517e = abstractC7743b0.mo15340b();
            this.f42518f = abstractC7743b0.mo15341c();
            this.f42519g = abstractC7743b0.mo15347i();
            this.f42520h = abstractC7743b0.mo15344f();
            this.f42521i = abstractC7743b0.mo15339a();
        }

        /* JADX INFO: renamed from: a */
        public final C7742b m15348a() {
            String strM765k = this.f42513a == null ? " sdkVersion" : "";
            if (this.f42514b == null) {
                strM765k = strM765k.concat(" gmpAppId");
            }
            if (this.f42515c == null) {
                strM765k = C0166e.m765k(strM765k, " platform");
            }
            if (this.f42516d == null) {
                strM765k = C0166e.m765k(strM765k, " installationUuid");
            }
            if (this.f42517e == null) {
                strM765k = C0166e.m765k(strM765k, " buildVersion");
            }
            if (this.f42518f == null) {
                strM765k = C0166e.m765k(strM765k, " displayVersion");
            }
            if (strM765k.isEmpty()) {
                return new C7742b(this.f42513a, this.f42514b, this.f42515c.intValue(), this.f42516d, this.f42517e, this.f42518f, this.f42519g, this.f42520h, this.f42521i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7742b(String str, String str2, int i10, String str3, String str4, String str5, AbstractC7743b0.e eVar, AbstractC7743b0.d dVar, AbstractC7743b0.a aVar) {
        this.f42504b = str;
        this.f42505c = str2;
        this.f42506d = i10;
        this.f42507e = str3;
        this.f42508f = str4;
        this.f42509g = str5;
        this.f42510h = eVar;
        this.f42511i = dVar;
        this.f42512j = aVar;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0.a mo15339a() {
        return this.f42512j;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: b */
    public final String mo15340b() {
        return this.f42508f;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: c */
    public final String mo15341c() {
        return this.f42509g;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: d */
    public final String mo15342d() {
        return this.f42505c;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: e */
    public final String mo15343e() {
        return this.f42507e;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        AbstractC7743b0.e eVar;
        AbstractC7743b0.a aVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0)) {
            return false;
        }
        AbstractC7743b0 abstractC7743b0 = (AbstractC7743b0) obj;
        if (this.f42504b.equals(abstractC7743b0.mo15346h()) && this.f42505c.equals(abstractC7743b0.mo15342d()) && this.f42506d == abstractC7743b0.mo15345g() && this.f42507e.equals(abstractC7743b0.mo15343e()) && this.f42508f.equals(abstractC7743b0.mo15340b()) && this.f42509g.equals(abstractC7743b0.mo15341c()) && ((eVar = this.f42510h) != null ? eVar.equals(abstractC7743b0.mo15347i()) : abstractC7743b0.mo15347i() == null)) {
            AbstractC7743b0.d dVar = this.f42511i;
            if (dVar == null) {
                if (abstractC7743b0.mo15344f() == null) {
                    aVar = this.f42512j;
                    if (aVar == null) {
                        if (abstractC7743b0.mo15339a() == null) {
                            return true;
                        }
                    } else if (aVar.equals(abstractC7743b0.mo15339a())) {
                        return true;
                    }
                }
            } else if (dVar.equals(abstractC7743b0.mo15344f())) {
                aVar = this.f42512j;
                if (aVar == null) {
                    if (abstractC7743b0.mo15339a() == null) {
                        return true;
                    }
                } else if (aVar.equals(abstractC7743b0.mo15339a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: f */
    public final AbstractC7743b0.d mo15344f() {
        return this.f42511i;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: g */
    public final int mo15345g() {
        return this.f42506d;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: h */
    public final String mo15346h() {
        return this.f42504b;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f42504b.hashCode() ^ 1000003) * 1000003) ^ this.f42505c.hashCode()) * 1000003) ^ this.f42506d) * 1000003) ^ this.f42507e.hashCode()) * 1000003) ^ this.f42508f.hashCode()) * 1000003) ^ this.f42509g.hashCode()) * 1000003;
        int iHashCode2 = 0;
        AbstractC7743b0.e eVar = this.f42510h;
        int iHashCode3 = (iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC7743b0.d dVar = this.f42511i;
        int iHashCode4 = (iHashCode3 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC7743b0.a aVar = this.f42512j;
        if (aVar != null) {
            iHashCode2 = aVar.hashCode();
        }
        return iHashCode4 ^ iHashCode2;
    }

    @Override // ne.AbstractC7743b0
    /* JADX INFO: renamed from: i */
    public final AbstractC7743b0.e mo15347i() {
        return this.f42510h;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f42504b + ", gmpAppId=" + this.f42505c + ", platform=" + this.f42506d + ", installationUuid=" + this.f42507e + ", buildVersion=" + this.f42508f + ", displayVersion=" + this.f42509g + ", session=" + this.f42510h + ", ndkPayload=" + this.f42511i + ", appExitInfo=" + this.f42512j + "}";
    }
}
