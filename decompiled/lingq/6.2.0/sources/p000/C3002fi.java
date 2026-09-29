package p000;

import android.content.Context;
import android.os.Build;
import androidx.media3.common.C0713b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fi */
/* JADX INFO: loaded from: classes.dex */
public final class C3002fi implements rt5, oq2 {

    /* JADX INFO: renamed from: a */
    public Context f39115a;

    public C3002fi(Context context, int i) {
        switch (i) {
            case 5:
                this.f39115a = context.getApplicationContext();
                break;
            case 6:
            default:
                this.f39115a = context.getApplicationContext();
                break;
            case 7:
                lda.m16130p(context);
                Context applicationContext = context.getApplicationContext();
                lda.m16130p(applicationContext);
                this.f39115a = applicationContext;
                break;
            case 8:
                new ConcurrentHashMap();
                bca.m3614j(context != null, "Context cannot be null", new Object[0]);
                this.f39115a = context.getApplicationContext();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m11838d(C0713b c0713b) {
        String str = c0713b.f6406o;
        if (str == null || !ez5.m11399i(str)) {
            return y90.m24988f(0, 0, 0, 0);
        }
        String str2 = c0713b.f6406o;
        String str3 = uma.f64080a;
        str2.getClass();
        switch (str2) {
            case "image/avif":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return y90.m24988f(4, 0, 0, 0);
        }
        return y90.m24988f(1, 0, 0, 0);
    }

    @Override // p000.oq2
    /* JADX INFO: renamed from: a */
    public void mo11839a(d32 d32Var) {
        dg1 dg1Var = new dg1("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), dg1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new yg1(this, d32Var, threadPoolExecutor, 1));
    }

    @Override // p000.rt5
    /* JADX INFO: renamed from: b */
    public st5 mo11840b(a34 a34Var) {
        Context context;
        if (Build.VERSION.SDK_INT < 31 && ((context = this.f39115a) == null || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new mkd().mo11840b(a34Var);
        }
        int iM11397g = ez5.m11397g(((C0713b) a34Var.f175c).f6406o);
        ss5.m21686M("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(uma.m22826u(iM11397g)));
        wmd wmdVar = new wmd(iM11397g);
        wmdVar.m24063d();
        return wmdVar.mo11840b(a34Var);
    }

    /* JADX INFO: renamed from: c */
    public py1 m11841c() {
        Context context = this.f39115a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        py1 py1Var = new py1();
        py1Var.f56970a = zi2.m25667a(ss5.f61354b);
        int i = 1;
        nr1 nr1Var = new nr1(context, i);
        py1Var.f56971b = nr1Var;
        int i2 = 0;
        py1Var.f56972c = zi2.m25667a(new gy5(nr1Var, new nr1(nr1Var, i2), i2));
        nr1 nr1Var2 = py1Var.f56971b;
        py1Var.f56973d = new ku2(nr1Var2, 1);
        so7 so7VarM25667a = zi2.m25667a(new gy5(py1Var.f56973d, zi2.m25667a(new ku2(nr1Var2, 0)), i));
        py1Var.f56974e = so7VarM25667a;
        wu2 wu2Var = new wu2(i);
        nr1 nr1Var3 = py1Var.f56971b;
        vm8 vm8Var = new vm8(nr1Var3, so7VarM25667a, wu2Var, i2);
        so7 so7Var = py1Var.f56970a;
        so7 so7Var2 = py1Var.f56972c;
        py1Var.f56975f = zi2.m25667a(new vm8(new x72(so7Var, so7Var2, vm8Var, so7VarM25667a, so7VarM25667a), new ija(nr1Var3, so7Var2, so7VarM25667a, vm8Var, so7Var, so7VarM25667a, so7VarM25667a), new d8b(so7Var, so7VarM25667a, vm8Var, so7VarM25667a), i));
        return py1Var;
    }

    public /* synthetic */ C3002fi(Context context, short s) {
        this.f39115a = context;
    }
}
