package p000;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class sv2 {

    /* JADX INFO: renamed from: x */
    public static final int f61455x;

    /* JADX INFO: renamed from: y */
    public static final boolean f61456y;

    /* JADX INFO: renamed from: a */
    public final Context f61457a;

    /* JADX INFO: renamed from: b */
    public final mp9 f61458b;

    /* JADX INFO: renamed from: c */
    public final C3127iy f61459c;

    /* JADX INFO: renamed from: d */
    public final C3127iy f61460d;

    /* JADX INFO: renamed from: e */
    public final C3127iy f61461e;

    /* JADX INFO: renamed from: f */
    public final C3127iy f61462f;

    /* JADX INFO: renamed from: g */
    public final Looper f61463g;

    /* JADX INFO: renamed from: h */
    public final int f61464h;

    /* JADX INFO: renamed from: i */
    public C3476px f61465i;

    /* JADX INFO: renamed from: j */
    public final int f61466j;

    /* JADX INFO: renamed from: k */
    public final boolean f61467k;

    /* JADX INFO: renamed from: l */
    public final tt8 f61468l;

    /* JADX INFO: renamed from: m */
    public final jo8 f61469m;

    /* JADX INFO: renamed from: n */
    public final f72 f61470n;

    /* JADX INFO: renamed from: o */
    public final long f61471o;

    /* JADX INFO: renamed from: p */
    public final int f61472p;

    /* JADX INFO: renamed from: q */
    public final int f61473q;

    /* JADX INFO: renamed from: r */
    public final int f61474r;

    /* JADX INFO: renamed from: s */
    public final int f61475s;

    /* JADX INFO: renamed from: t */
    public final boolean f61476t;

    /* JADX INFO: renamed from: u */
    public boolean f61477u;

    /* JADX INFO: renamed from: v */
    public final String f61478v;

    /* JADX INFO: renamed from: w */
    public final boolean f61479w;

    static {
        String str = uma.f64080a;
        String strM21625f0 = AbstractC3584sr.m21625f0(Build.DEVICE);
        f61455x = (strM21625f0.contains("emulator") || strM21625f0.contains("emu64a") || strM21625f0.contains("emu64x") || strM21625f0.contains("generic")) ? 30000 : 10000;
        f61456y = true;
    }

    public sv2(Context context) {
        C3127iy c3127iy = new C3127iy(context, 1);
        C3127iy c3127iy2 = new C3127iy(context, 2);
        C3127iy c3127iy3 = new C3127iy(context, 3);
        C3127iy c3127iy4 = new C3127iy(context, 4);
        this.f61457a = context;
        this.f61459c = c3127iy;
        this.f61460d = c3127iy2;
        this.f61461e = c3127iy3;
        this.f61462f = c3127iy4;
        String str = uma.f64080a;
        Looper looperMyLooper = Looper.myLooper();
        this.f61463g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f61465i = C3476px.f56934c;
        this.f61466j = 1;
        this.f61467k = true;
        this.f61468l = tt8.f62867d;
        this.f61469m = jo8.f45921b;
        this.f61470n = new f72(uma.m22797B(20L), uma.m22797B(500L));
        this.f61458b = mp9.f51705a;
        this.f61471o = 2000L;
        this.f61472p = 600000;
        boolean z = f61456y;
        this.f61473q = z ? f61455x : Integer.MAX_VALUE;
        this.f61474r = z ? 60000 : Integer.MAX_VALUE;
        this.f61475s = 600000;
        this.f61476t = true;
        this.f61478v = "";
        this.f61464h = -1000;
        new p84();
        this.f61479w = true;
    }
}
