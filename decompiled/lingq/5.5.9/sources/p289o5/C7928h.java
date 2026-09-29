package p289o5;

import com.google.android.gms.internal.play_billing.zzu;

/* JADX INFO: renamed from: o5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7928h {

    /* JADX INFO: renamed from: a */
    public final zzu f43206a;

    /* JADX INFO: renamed from: o5.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public zzu f43207a;
    }

    /* JADX INFO: renamed from: o5.h$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f43208a;

        /* JADX INFO: renamed from: b */
        public final String f43209b;

        /* JADX INFO: renamed from: o5.h$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f43210a;

            /* JADX INFO: renamed from: b */
            public String f43211b;

            /* JADX INFO: renamed from: a */
            public final b m15747a() {
                if ("first_party".equals(this.f43211b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f43210a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f43211b != null) {
                    return new b(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
        }

        public /* synthetic */ b(a aVar) {
            this.f43208a = aVar.f43210a;
            this.f43209b = aVar.f43211b;
        }
    }
}
