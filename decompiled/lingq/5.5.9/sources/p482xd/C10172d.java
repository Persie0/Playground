package p482xd;

import java.util.Arrays;

/* JADX INFO: renamed from: xd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10172d {

    /* JADX INFO: renamed from: xd.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f51481a;

        /* JADX INFO: renamed from: b */
        public final b f51482b;

        /* JADX INFO: renamed from: c */
        public b f51483c;

        /* JADX INFO: renamed from: xd.d$a$a, reason: collision with other inner class name */
        public static final class C10684a extends b {
        }

        /* JADX INFO: renamed from: xd.d$a$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public String f51484a;

            /* JADX INFO: renamed from: b */
            public Object f51485b;

            /* JADX INFO: renamed from: c */
            public b f51486c;
        }

        public a(String str) {
            b bVar = new b();
            this.f51482b = bVar;
            this.f51483c = bVar;
            this.f51481a = str;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f51481a);
            sb2.append('{');
            b bVar = this.f51482b.f51486c;
            String str = "";
            while (bVar != null) {
                Object obj = bVar.f51485b;
                boolean z10 = bVar instanceof C10684a;
                sb2.append(str);
                String str2 = bVar.f51484a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                bVar = bVar.f51486c;
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m19190a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
