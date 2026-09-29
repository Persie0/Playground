package p000;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class no3 {

    /* JADX INFO: renamed from: a */
    public final Context f53045a;

    /* JADX INFO: renamed from: b */
    public final String f53046b;

    /* JADX INFO: renamed from: c */
    public final m58 f53047c;

    /* JADX INFO: renamed from: d */
    public final b64 f53048d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3691vn f53049e;

    /* JADX INFO: renamed from: f */
    public final C3118io f53050f;

    /* JADX INFO: renamed from: g */
    public final Looper f53051g;

    /* JADX INFO: renamed from: h */
    public final int f53052h;

    /* JADX INFO: renamed from: i */
    public final vcb f53053i;

    /* JADX INFO: renamed from: j */
    public final ho5 f53054j;

    /* JADX INFO: renamed from: k */
    public final so3 f53055k;

    public no3(Context context, b64 b64Var, InterfaceC3691vn interfaceC3691vn, mo3 mo3Var) {
        lda.m16131q(context, "Null context is not permitted.");
        lda.m16131q(b64Var, "Api must not be null.");
        lda.m16131q(mo3Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        lda.m16131q(applicationContext, "The provided context did not have an application context.");
        this.f53045a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strM23692a = (i < 30 || i < 30) ? null : AbstractC3708w3.m23692a(context);
        this.f53046b = strM23692a;
        this.f53047c = i >= 31 ? new m58(context.getAttributionSource(), 10) : null;
        this.f53048d = b64Var;
        this.f53049e = interfaceC3691vn;
        this.f53051g = mo3Var.f51632b;
        this.f53050f = new C3118io(b64Var, interfaceC3691vn, strM23692a);
        this.f53053i = new vcb(this);
        so3 so3VarM21515e = so3.m21515e(applicationContext);
        this.f53055k = so3VarM21515e;
        this.f53052h = so3VarM21515e.f61101h.getAndIncrement();
        this.f53054j = mo3Var.f51631a;
        wdb wdbVar = so3VarM21515e.f61092H;
        wdbVar.sendMessage(wdbVar.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: a */
    public final C3309ls m17567a() {
        C3309ls c3309ls = new C3309ls(16, false);
        Set set = Collections.EMPTY_SET;
        if (((C3437ov) c3309ls.f50064b) == null) {
            c3309ls.f50064b = new C3437ov(0);
        }
        ((C3437ov) c3309ls.f50064b).addAll(set);
        Context context = this.f53045a;
        c3309ls.f50066d = context.getClass().getName();
        c3309ls.f50065c = context.getPackageName();
        return c3309ls;
    }

    /* JADX INFO: renamed from: b */
    public final void m17568b(int i, g90 g90Var) {
        g90Var.m5287f();
        so3 so3Var = this.f53055k;
        so3Var.getClass();
        adb adbVar = new adb(new idb(i, g90Var), so3Var.f61102i.get(), this);
        wdb wdbVar = so3Var.f61092H;
        wdbVar.sendMessage(wdbVar.obtainMessage(4, adbVar));
    }

    /* JADX INFO: renamed from: c */
    public final tld m17569c(int i, i44 i44Var) {
        wr9 wr9Var = new wr9();
        so3 so3Var = this.f53055k;
        so3Var.getClass();
        so3Var.m21517c(wr9Var, i44Var.f43481b, this);
        adb adbVar = new adb(new odb(i, i44Var, wr9Var, this.f53054j), so3Var.f61102i.get(), this);
        wdb wdbVar = so3Var.f61092H;
        wdbVar.sendMessage(wdbVar.obtainMessage(4, adbVar));
        return wr9Var.f67208a;
    }
}
