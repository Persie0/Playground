package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.AbstractC1083c;
import java.util.concurrent.atomic.AtomicReference;
import p000.c26;
import p000.fcd;
import p000.kyc;
import p000.on9;
import p000.pyc;
import p000.sq5;
import p000.ved;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0962f {

    /* JADX INFO: renamed from: j */
    public static final Object f11840j = new Object();

    /* JADX INFO: renamed from: k */
    public static final AtomicReference f11841k = new AtomicReference();

    /* JADX INFO: renamed from: l */
    public static volatile C0962f f11842l = null;

    /* JADX INFO: renamed from: m */
    public static final on9 f11843m = AbstractC1083c.m6269a(kyc.f48781a);

    /* JADX INFO: renamed from: a */
    public final sq5 f11844a = new sq5(25);

    /* JADX INFO: renamed from: b */
    public final Context f11845b;

    /* JADX INFO: renamed from: c */
    public final on9 f11846c;

    /* JADX INFO: renamed from: d */
    public final on9 f11847d;

    /* JADX INFO: renamed from: e */
    public final on9 f11848e;

    /* JADX INFO: renamed from: f */
    public final on9 f11849f;

    /* JADX INFO: renamed from: g */
    public final ved f11850g;

    /* JADX INFO: renamed from: h */
    public final on9 f11851h;

    /* JADX INFO: renamed from: i */
    public final fcd f11852i;

    public C0962f(Context context, on9 on9Var, on9 on9Var2, on9 on9Var3, on9 on9Var4, on9 on9Var5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        on9Var.getClass();
        on9Var2.getClass();
        on9Var3.getClass();
        on9Var4.getClass();
        on9Var5.getClass();
        on9 on9VarM6269a = AbstractC1083c.m6269a(on9Var);
        on9 on9VarM6269a2 = AbstractC1083c.m6269a(on9Var2);
        on9 on9VarM6269a3 = AbstractC1083c.m6269a(new pyc(on9Var3, 0));
        on9 on9VarM6269a4 = AbstractC1083c.m6269a(on9Var4);
        on9 on9VarM6269a5 = AbstractC1083c.m6269a(on9Var5);
        this.f11845b = applicationContext;
        this.f11846c = on9VarM6269a;
        this.f11847d = on9VarM6269a2;
        this.f11848e = on9VarM6269a3;
        this.f11849f = on9VarM6269a4;
        this.f11850g = new ved(applicationContext, on9VarM6269a, on9VarM6269a4, on9VarM6269a2);
        this.f11851h = on9VarM6269a5;
        this.f11852i = new fcd(applicationContext, on9VarM6269a, on9VarM6269a3, on9VarM6269a2);
    }

    /* JADX INFO: renamed from: b */
    public static void m5408b() {
        synchronized (AbstractC0963g.f11853a) {
        }
        if (f11841k.get() == null && AbstractC0963g.f11854b == null) {
            AbstractC0963g.f11854b = new zzlr();
        }
    }

    /* JADX INFO: renamed from: a */
    public final c26 m5409a() {
        return (c26) this.f11846c.get();
    }
}
