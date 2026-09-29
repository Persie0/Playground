package bb;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C2542a;
import java.util.Arrays;
import p070db.C5126f;
import p176ib.C6268g;

/* JADX INFO: renamed from: bb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1350a {

    /* JADX INFO: renamed from: a */
    public static final C2542a<GoogleSignInOptions> f8182a;

    /* JADX INFO: renamed from: b */
    public static final C5126f f8183b;

    /* JADX INFO: renamed from: c */
    public static final C2542a.f f8184c;

    /* JADX INFO: renamed from: bb.a$a */
    @Deprecated
    public static class a implements C2542a.c {

        /* JADX INFO: renamed from: c */
        public static final a f8185c = new a(new C10596a());

        /* JADX INFO: renamed from: a */
        public final boolean f8186a;

        /* JADX INFO: renamed from: b */
        public final String f8187b;

        /* JADX INFO: renamed from: bb.a$a$a, reason: collision with other inner class name */
        @Deprecated
        public static class C10596a {

            /* JADX INFO: renamed from: a */
            public final Boolean f8188a;

            /* JADX INFO: renamed from: b */
            public String f8189b;

            public C10596a() {
                this.f8188a = Boolean.FALSE;
            }

            public C10596a(a aVar) {
                this.f8188a = Boolean.FALSE;
                a aVar2 = a.f8185c;
                aVar.getClass();
                this.f8188a = Boolean.valueOf(aVar.f8186a);
                this.f8189b = aVar.f8187b;
            }
        }

        public a(C10596a c10596a) {
            this.f8186a = c10596a.f8188a.booleanValue();
            this.f8187b = c10596a.f8189b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return C6268g.m12905a(null, null) && this.f8186a == aVar.f8186a && C6268g.m12905a(this.f8187b, aVar.f8187b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f8186a), this.f8187b});
        }
    }

    static {
        new C2542a.f();
        C2542a.f fVar = new C2542a.f();
        f8184c = fVar;
        new C1353d();
        C1354e c1354e = new C1354e();
        C2542a<C1352c> c2542a = C1351b.f8190a;
        f8182a = new C2542a<>("Auth.GOOGLE_SIGN_IN_API", c1354e, fVar);
        f8183b = new C5126f();
    }
}
