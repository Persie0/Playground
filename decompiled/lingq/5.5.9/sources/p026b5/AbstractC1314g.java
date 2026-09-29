package p026b5;

import android.util.Log;

/* JADX INFO: renamed from: b5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1314g {

    /* JADX INFO: renamed from: a */
    public static final Object f8060a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile AbstractC1314g f8061b;

    /* JADX INFO: renamed from: b5.g$a */
    public static class a extends AbstractC1314g {

        /* JADX INFO: renamed from: c */
        public final int f8062c;

        public a(int i10) {
            this.f8062c = i10;
        }

        @Override // p026b5.AbstractC1314g
        /* JADX INFO: renamed from: a */
        public final void mo4869a(String str, String str2) {
            if (this.f8062c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // p026b5.AbstractC1314g
        /* JADX INFO: renamed from: b */
        public final void mo4870b(String str, String str2) {
            if (this.f8062c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p026b5.AbstractC1314g
        /* JADX INFO: renamed from: c */
        public final void mo4871c(String str, String str2, Throwable th2) {
            if (this.f8062c <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // p026b5.AbstractC1314g
        /* JADX INFO: renamed from: e */
        public final void mo4872e(String str, String str2) {
            if (this.f8062c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // p026b5.AbstractC1314g
        /* JADX INFO: renamed from: g */
        public final void mo4873g(String str, String str2) {
            if (this.f8062c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1314g m4867d() {
        AbstractC1314g abstractC1314g;
        synchronized (f8060a) {
            if (f8061b == null) {
                f8061b = new a(3);
            }
            abstractC1314g = f8061b;
        }
        return abstractC1314g;
    }

    /* JADX INFO: renamed from: f */
    public static String m4868f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4869a(String str, String str2);

    /* JADX INFO: renamed from: b */
    public abstract void mo4870b(String str, String str2);

    /* JADX INFO: renamed from: c */
    public abstract void mo4871c(String str, String str2, Throwable th2);

    /* JADX INFO: renamed from: e */
    public abstract void mo4872e(String str, String str2);

    /* JADX INFO: renamed from: g */
    public abstract void mo4873g(String str, String str2);
}
