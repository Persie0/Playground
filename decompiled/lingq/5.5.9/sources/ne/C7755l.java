package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7755l extends AbstractC7743b0.e.d {

    /* JADX INFO: renamed from: a */
    public final long f42598a;

    /* JADX INFO: renamed from: b */
    public final String f42599b;

    /* JADX INFO: renamed from: c */
    public final AbstractC7743b0.e.d.a f42600c;

    /* JADX INFO: renamed from: d */
    public final AbstractC7743b0.e.d.c f42601d;

    /* JADX INFO: renamed from: e */
    public final AbstractC7743b0.e.d.AbstractC10662d f42602e;

    /* JADX INFO: renamed from: ne.l$a */
    public static final class a extends AbstractC7743b0.e.d.b {

        /* JADX INFO: renamed from: a */
        public Long f42603a;

        /* JADX INFO: renamed from: b */
        public String f42604b;

        /* JADX INFO: renamed from: c */
        public AbstractC7743b0.e.d.a f42605c;

        /* JADX INFO: renamed from: d */
        public AbstractC7743b0.e.d.c f42606d;

        /* JADX INFO: renamed from: e */
        public AbstractC7743b0.e.d.AbstractC10662d f42607e;

        public a() {
        }

        public a(AbstractC7743b0.e.d dVar) {
            this.f42603a = Long.valueOf(dVar.mo15400d());
            this.f42604b = dVar.mo15401e();
            this.f42605c = dVar.mo15397a();
            this.f42606d = dVar.mo15398b();
            this.f42607e = dVar.mo15399c();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C7755l m15466a() {
            String strM765k = this.f42603a == null ? " timestamp" : "";
            if (this.f42604b == null) {
                strM765k = strM765k.concat(" type");
            }
            if (this.f42605c == null) {
                strM765k = C0166e.m765k(strM765k, " app");
            }
            if (this.f42606d == null) {
                strM765k = C0166e.m765k(strM765k, " device");
            }
            if (strM765k.isEmpty()) {
                return new C7755l(this.f42603a.longValue(), this.f42604b, this.f42605c, this.f42606d, this.f42607e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7755l(long j10, String str, AbstractC7743b0.e.d.a aVar, AbstractC7743b0.e.d.c cVar, AbstractC7743b0.e.d.AbstractC10662d abstractC10662d) {
        this.f42598a = j10;
        this.f42599b = str;
        this.f42600c = aVar;
        this.f42601d = cVar;
        this.f42602e = abstractC10662d;
    }

    @Override // ne.AbstractC7743b0.e.d
    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0.e.d.a mo15397a() {
        return this.f42600c;
    }

    @Override // ne.AbstractC7743b0.e.d
    /* JADX INFO: renamed from: b */
    public final AbstractC7743b0.e.d.c mo15398b() {
        return this.f42601d;
    }

    @Override // ne.AbstractC7743b0.e.d
    /* JADX INFO: renamed from: c */
    public final AbstractC7743b0.e.d.AbstractC10662d mo15399c() {
        return this.f42602e;
    }

    @Override // ne.AbstractC7743b0.e.d
    /* JADX INFO: renamed from: d */
    public final long mo15400d() {
        return this.f42598a;
    }

    @Override // ne.AbstractC7743b0.e.d
    /* JADX INFO: renamed from: e */
    public final String mo15401e() {
        return this.f42599b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d)) {
            return false;
        }
        AbstractC7743b0.e.d dVar = (AbstractC7743b0.e.d) obj;
        if (this.f42598a == dVar.mo15400d() && this.f42599b.equals(dVar.mo15401e()) && this.f42600c.equals(dVar.mo15397a()) && this.f42601d.equals(dVar.mo15398b())) {
            AbstractC7743b0.e.d.AbstractC10662d abstractC10662d = this.f42602e;
            if (abstractC10662d == null) {
                if (dVar.mo15399c() == null) {
                    return true;
                }
            } else if (abstractC10662d.equals(dVar.mo15399c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f42598a;
        int iHashCode = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f42599b.hashCode()) * 1000003) ^ this.f42600c.hashCode()) * 1000003) ^ this.f42601d.hashCode()) * 1000003;
        AbstractC7743b0.e.d.AbstractC10662d abstractC10662d = this.f42602e;
        return iHashCode ^ (abstractC10662d == null ? 0 : abstractC10662d.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f42598a + ", type=" + this.f42599b + ", app=" + this.f42600c + ", device=" + this.f42601d + ", log=" + this.f42602e + "}";
    }
}
