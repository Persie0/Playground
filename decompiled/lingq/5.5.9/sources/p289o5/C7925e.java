package p289o5;

import com.google.android.gms.internal.play_billing.C2933a;

/* JADX INFO: renamed from: o5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7925e {

    /* JADX INFO: renamed from: a */
    public int f43186a;

    /* JADX INFO: renamed from: b */
    public String f43187b;

    /* JADX INFO: renamed from: o5.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f43188a;

        /* JADX INFO: renamed from: b */
        public String f43189b = "";

        /* JADX INFO: renamed from: a */
        public final C7925e m15745a() {
            C7925e c7925e = new C7925e();
            c7925e.f43186a = this.f43188a;
            c7925e.f43187b = this.f43189b;
            return c7925e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m15744a() {
        return new a();
    }

    public final String toString() {
        return "Response Code: " + C2933a.m8513e(this.f43186a) + ", Debug Message: " + this.f43187b;
    }
}
