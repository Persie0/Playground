package p404u2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p312p2.C8173e;
import p326q.C8450f;
import p326q.C8452h;
import p446w2.InterfaceC9803a;

/* JADX INFO: renamed from: u2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9391k {

    /* JADX INFO: renamed from: a */
    public static final C8450f<String, Typeface> f48194a = new C8450f<>(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f48195b;

    /* JADX INFO: renamed from: c */
    public static final Object f48196c;

    /* JADX INFO: renamed from: d */
    public static final C8452h<String, ArrayList<InterfaceC9803a<a>>> f48197d;

    /* JADX INFO: renamed from: u2.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Typeface f48198a;

        /* JADX INFO: renamed from: b */
        public final int f48199b;

        public a(int i10) {
            this.f48198a = null;
            this.f48199b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f48198a = typeface;
            this.f48199b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC9394n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f48195b = threadPoolExecutor;
        f48196c = new Object();
        f48197d = new C8452h<>();
    }

    /* JADX INFO: renamed from: a */
    public static a m17755a(String str, Context context, C9386f c9386f, int i10) {
        int i11;
        C8450f<String, Typeface> c8450f = f48194a;
        Typeface typefaceM16516b = c8450f.m16516b(str);
        if (typefaceM16516b != null) {
            return new a(typefaceM16516b);
        }
        try {
            C9392l c9392lM17753a = C9385e.m17753a(context, c9386f);
            int i12 = 1;
            C9393m[] c9393mArr = c9392lM17753a.f48201b;
            int i13 = c9392lM17753a.f48200a;
            if (i13 != 0) {
                i11 = i13 != 1 ? -3 : -2;
            } else if (c9393mArr == null || c9393mArr.length == 0) {
                i11 = i12;
            } else {
                int length = c9393mArr.length;
                i12 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        i11 = i12;
                    } else {
                        int i15 = c9393mArr[i14].f48206e;
                        if (i15 == 0) {
                            i14++;
                        } else if (i15 >= 0) {
                            i11 = i15;
                        }
                    }
                }
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface typefaceMo16237b = C8173e.f44309a.mo16237b(context, c9393mArr, i10);
            if (typefaceMo16237b == null) {
                return new a(-3);
            }
            c8450f.m16517c(str, typefaceMo16237b);
            return new a(typefaceMo16237b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
