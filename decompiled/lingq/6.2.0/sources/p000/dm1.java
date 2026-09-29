package p000;

import android.content.Context;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.events.Events;
import com.kochava.tracker.modules.internal.Module;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements sk7, j16 {

    /* JADX INFO: renamed from: h */
    public static final sq5 f35809h;

    /* JADX INFO: renamed from: a */
    public final qq7 f35810a;

    /* JADX INFO: renamed from: b */
    public final g02 f35811b;

    /* JADX INFO: renamed from: c */
    public final rl7 f35812c;

    /* JADX INFO: renamed from: d */
    public final hz8 f35813d;

    /* JADX INFO: renamed from: e */
    public final rk7 f35814e;

    /* JADX INFO: renamed from: f */
    public final yd4 f35815f;

    /* JADX INFO: renamed from: g */
    public final d74 f35816g;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f35809h = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "Controller");
    }

    public dm1(d74 d74Var) {
        Module module;
        Object objInvoke;
        Module module2;
        Object objInvoke2;
        String strM20391q;
        this.f35816g = d74Var;
        List list = (List) ((ny8) d74Var.f35084h).f53417e;
        list.remove(this);
        list.add(this);
        qq7 qq7Var = new qq7();
        qq7Var.f58082a = 0L;
        qq7Var.f58083b = 0L;
        qq7Var.f58084c = false;
        this.f35810a = qq7Var;
        g02 g02Var = new g02();
        this.f35811b = g02Var;
        rl7 rl7Var = new rl7(d74Var.f35077a, (ny8) d74Var.f35084h, d74Var.f35078b);
        this.f35812c = rl7Var;
        hz8 hz8Var = new hz8(rl7Var, d74Var, g02Var);
        this.f35813d = hz8Var;
        rk7 rk7Var = new rk7((ny8) d74Var.f35084h);
        this.f35814e = rk7Var;
        this.f35815f = new yd4((ny8) d74Var.f35084h, new ce4(rl7Var, d74Var, g02Var, hz8Var, rk7Var, qq7Var));
        Context context = d74Var.f35077a;
        n16 n16Var = new n16(context);
        synchronized (n16Var) {
        }
        synchronized (n16Var) {
            k16 k16VarM14771a = k16.m14771a(context, "com.kochava.core.BuildConfig");
            if (k16VarM14771a.f46552a) {
                n16Var.f52175c = k16VarM14771a;
            }
        }
        synchronized (n16Var) {
            k16 k16VarM14771a2 = k16.m14771a(context, "com.kochava.tracker.BuildConfig");
            if (k16VarM14771a2.f46552a) {
                n16Var.f52176d = k16VarM14771a2;
            }
        }
        synchronized (n16Var) {
            k16 k16VarM14771a3 = k16.m14771a(context, "com.kochava.tracker.datapointnetwork.BuildConfig");
            if (k16VarM14771a3.f46552a) {
                n16Var.f52177e = k16VarM14771a3;
            }
        }
        synchronized (n16Var) {
            k16 k16VarM14771a4 = k16.m14771a(context, "com.kochava.tracker.legacyreferrer.BuildConfig");
            if (k16VarM14771a4.f46552a) {
                n16Var.f52178f = k16VarM14771a4;
            }
        }
        synchronized (n16Var) {
            module = null;
            try {
                sq5 sq5Var = Events.f14115g;
                objInvoke = Events.class.getMethod("getInstance", null).invoke(null, null);
            } catch (Throwable unused) {
                objInvoke = null;
            }
            if (objInvoke instanceof Module) {
                try {
                    module2 = (Module) objInvoke;
                } catch (Throwable unused2) {
                    module2 = null;
                }
            } else {
                module2 = null;
            }
            if (module2 != null) {
                module2.setController(this);
            }
            k16 k16VarM14771a5 = k16.m14771a((Context) n16Var.f52173a, "com.kochava.tracker.events.BuildConfig");
            if (k16VarM14771a5.f46552a) {
                n16Var.f52179g = k16VarM14771a5;
            }
        }
        synchronized (n16Var) {
            try {
                objInvoke2 = Class.forName("com.kochava.tracker.engagement.Engagement").getMethod("getInstance", null).invoke(null, null);
            } catch (Throwable unused3) {
                objInvoke2 = null;
            }
            if (objInvoke2 instanceof Module) {
                try {
                    module = (Module) objInvoke2;
                } catch (Throwable unused4) {
                }
            }
            if (module != null) {
                module.setController(this);
            }
            k16 k16VarM14771a6 = k16.m14771a((Context) n16Var.f52173a, "com.kochava.tracker.engagement.BuildConfig");
            if (k16VarM14771a6.f46552a) {
                n16Var.f52180h = k16VarM14771a6;
            }
        }
        synchronized (n16Var) {
            k16 k16VarM14771a7 = k16.m14771a((Context) n16Var.f52173a, "com.kochava.tracker.r8config.BuildConfig");
            if (k16VarM14771a7.f46552a) {
                n16Var.f52181i = k16VarM14771a7;
            }
        }
        sq5 sq5Var2 = f35809h;
        sq5Var2.m21555D("Registered Modules");
        sq5Var2.m21555D(n16Var.m17168a());
        e02 e02VarM12257e = g02Var.m12257e();
        ef4 ef4VarM17168a = n16Var.m17168a();
        synchronized (e02VarM12257e) {
            e02VarM12257e.f36498p = ef4VarM17168a;
        }
        e02 e02VarM12257e2 = g02Var.m12257e();
        synchronized (n16Var) {
            try {
                ArrayList arrayList = new ArrayList();
                k16 k16Var = (k16) n16Var.f52174b;
                if (k16Var != null) {
                    arrayList.addAll(k16Var.f46556e);
                }
                k16 k16Var2 = (k16) n16Var.f52175c;
                if (k16Var2 != null) {
                    arrayList.addAll(k16Var2.f46556e);
                }
                k16 k16Var3 = (k16) n16Var.f52176d;
                if (k16Var3 != null) {
                    arrayList.addAll(k16Var3.f46556e);
                }
                k16 k16Var4 = (k16) n16Var.f52177e;
                if (k16Var4 != null) {
                    arrayList.addAll(k16Var4.f46556e);
                }
                k16 k16Var5 = (k16) n16Var.f52178f;
                if (k16Var5 != null) {
                    arrayList.addAll(k16Var5.f46556e);
                }
                k16 k16Var6 = (k16) n16Var.f52179g;
                if (k16Var6 != null) {
                    arrayList.addAll(k16Var6.f46556e);
                }
                k16 k16Var7 = (k16) n16Var.f52180h;
                if (k16Var7 != null) {
                    arrayList.addAll(k16Var7.f46556e);
                }
                k16 k16Var8 = (k16) n16Var.f52181i;
                if (k16Var8 != null) {
                    arrayList.addAll(k16Var8.f46556e);
                }
                strM20391q = r46.m20391q(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (e02VarM12257e2) {
            e02VarM12257e2.f36489g = strM20391q;
        }
        synchronized (g02Var.m12257e()) {
        }
        g02Var.m12257e().m10773m((String) d74Var.f35083g);
        g02Var.m12257e().m10776p();
        g02Var.m12257e().m10775o();
        g02Var.m12257e().m10770j((String) d74Var.f35082f);
    }

    @Override // p000.sk7
    /* JADX INFO: renamed from: a */
    public final synchronized void mo10459a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        g02 g02Var = this.f35811b;
        rk7 rk7Var = this.f35814e;
        synchronized (rk7Var) {
            arrayList = rk7Var.f59443f;
        }
        synchronized (g02Var) {
            g02Var.f40007n = arrayList;
        }
        g02 g02Var2 = this.f35811b;
        rk7 rk7Var2 = this.f35814e;
        synchronized (rk7Var2) {
            arrayList2 = rk7Var2.f59444g;
        }
        synchronized (g02Var2) {
            g02Var2.f40008o = arrayList2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m10460b() {
        boolean z;
        String str;
        String str2;
        boolean z2;
        try {
            if (((String) this.f35816g.f35081e) != null) {
                em7 em7VarM20699o = this.f35812c.m20699o();
                synchronized (em7VarM20699o) {
                    z2 = em7VarM20699o.f37464e;
                }
                if (z2 && !this.f35816g.f35079c) {
                    this.f35812c.m20701q();
                }
                em7 em7VarM20699o2 = this.f35812c.m20699o();
                boolean z3 = this.f35816g.f35079c;
                synchronized (em7VarM20699o2) {
                    em7VarM20699o2.f37464e = z3;
                    ((cj9) em7VarM20699o2.f60774a).m4779g("main.last_launch_instant_app", z3);
                }
            }
            this.f35812c.m20688c(this.f35816g, this.f35811b, this.f35814e, this.f35810a);
            List list = this.f35814e.f59439b;
            list.remove(this);
            list.add(this);
            hz8 hz8Var = this.f35813d;
            synchronized (hz8Var) {
                hz8Var.f43250e.remove(this);
                hz8Var.f43250e.add(this);
            }
            this.f35813d.m13603h();
            this.f35815f.m25091l();
            sq5 sq5Var = f35809h;
            StringBuilder sb = new StringBuilder("This ");
            em7 em7VarM20699o3 = this.f35812c.m20699o();
            synchronized (em7VarM20699o3) {
                z = em7VarM20699o3.f37463d <= 1;
            }
            sb.append(z ? "is" : "is not");
            sb.append(" the first tracker SDK launch");
            r46.m20394u(sq5Var, sb.toString());
            StringBuilder sb2 = new StringBuilder("The kochava device id is ");
            em7 em7VarM20699o4 = this.f35812c.m20699o();
            synchronized (em7VarM20699o4) {
                if (b34.m3255w(em7VarM20699o4.f37467h)) {
                    str = null;
                } else {
                    str = em7VarM20699o4.f37467h;
                }
            }
            em7 em7VarM20699o5 = this.f35812c.m20699o();
            synchronized (em7VarM20699o5) {
                str2 = em7VarM20699o5.f37466g;
            }
            sb2.append(b34.m3248o(str, str2, new String[0]));
            r46.m20360A(sq5Var, sb2.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m10461c(bd4 bd4Var) {
        yd4 yd4Var = this.f35815f;
        synchronized (yd4Var.f69685e) {
            try {
                if (yd4Var.f69686f) {
                    ((ny8) yd4Var.f69681a.f50064b).m17684L(new RunnableC3470pr(23, yd4Var, bd4Var));
                } else {
                    yd4Var.m25083c(bd4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.sk7
    /* JADX INFO: renamed from: d */
    public final synchronized void mo10462d() {
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m10463e() {
        this.f35812c.m20697m(this);
    }
}
