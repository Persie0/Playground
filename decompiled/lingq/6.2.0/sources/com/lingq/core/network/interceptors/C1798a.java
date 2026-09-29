package com.lingq.core.network.interceptors;

import android.content.Context;
import android.os.Build;
import com.lingq.core.domain.model.user.Login;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.at4;
import p000.co7;
import p000.dx3;
import p000.ex3;
import p000.j88;
import p000.nm7;
import p000.ob1;
import p000.or3;
import p000.si7;
import p000.uk6;
import p000.un1;
import p000.w41;
import p000.wfb;
import p000.x84;

/* JADX INFO: renamed from: com.lingq.core.network.interceptors.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1798a implements x84 {

    /* JADX INFO: renamed from: a */
    public final Context f21847a;

    /* JADX INFO: renamed from: b */
    public final nm7 f21848b;

    /* JADX INFO: renamed from: c */
    public final si7 f21849c;

    /* JADX INFO: renamed from: d */
    public final ob1 f21850d;

    /* JADX INFO: renamed from: e */
    public final uk6 f21851e;

    /* JADX INFO: renamed from: f */
    public final C3244l f21852f = AbstractC3352my.m17114d(new Login(null, 31, false));

    /* JADX INFO: renamed from: g */
    public final C3244l f21853g = AbstractC3352my.m17114d("");

    /* JADX INFO: renamed from: h */
    public final C3244l f21854h = AbstractC3352my.m17114d("https://www.lingq.com/");

    public C1798a(Context context, un1 un1Var, nm7 nm7Var, si7 si7Var, ob1 ob1Var, uk6 uk6Var) {
        this.f21847a = context;
        this.f21848b = nm7Var;
        this.f21849c = si7Var;
        this.f21850d = ob1Var;
        this.f21851e = uk6Var;
        wfb.m23926u(un1Var, null, null, new PostInterceptor$1(this, null), 3);
        wfb.m23926u(un1Var, null, null, new PostInterceptor$2(this, null), 3);
        wfb.m23926u(un1Var, null, null, new PostInterceptor$3(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0083  */
    @Override // p000.x84
    /* JADX INFO: renamed from: a */
    public final j88 mo8434a(at4 at4Var) {
        uk6 uk6Var;
        co7 co7Var;
        ex3 ex3VarM10734a;
        co7 co7Var2;
        at4 at4Var2 = at4Var;
        uk6 uk6Var2 = this.f21851e;
        co7 co7Var3 = (co7) at4Var2.f7465i;
        try {
            Login login = (Login) this.f21852f.getValue();
            String str = (String) this.f21853g.getValue();
            String str2 = (String) this.f21854h.getValue();
            str2.getClass();
            ex3 ex3VarM10734a2 = null;
            try {
                dx3 dx3Var = new dx3();
                dx3Var.m10737d(null, str2);
                ex3VarM10734a2 = dx3Var.m10734a();
            } catch (IllegalArgumentException unused) {
            }
            if (ex3VarM10734a2 != null) {
                dx3 dx3VarM11381g = ((ex3) co7Var3.f10360c).m11381g();
                dx3VarM11381g.m10739f(ex3VarM10734a2.f38024a);
                dx3VarM11381g.m10736c(ex3VarM10734a2.f38027d);
                dx3VarM11381g.m10738e(ex3VarM10734a2.f38028e);
                ex3VarM10734a = dx3VarM11381g.m10734a();
            } else {
                ex3VarM10734a = (ex3) co7Var3.f10360c;
            }
            String str3 = login.f19647b;
            uk6Var = uk6Var2;
            Context context = this.f21847a;
            ob1 ob1Var = this.f21850d;
            try {
                if (str3 != null) {
                    try {
                        if (str3.length() == 0) {
                            co7Var = co7Var3;
                            w41 w41VarM4938s = co7Var.m4938s();
                            ex3VarM10734a.getClass();
                            w41VarM4938s.f66365a = ex3VarM10734a;
                            ((or3) w41VarM4938s.f66367c).m18305j("User-Agent", "Android " + Build.VERSION.RELEASE + " v" + ob1Var.m17889b() + " app: " + context.getPackageName() + " GUID: " + str);
                            ((or3) w41VarM4938s.f66367c).m18305j("Accept", "application/json");
                            ((or3) w41VarM4938s.f66367c).m18305j("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                            co7Var2 = new co7(w41VarM4938s);
                        } else {
                            String str4 = login.f19647b;
                            w41 w41VarM4938s2 = co7Var3.m4938s();
                            ex3VarM10734a.getClass();
                            w41VarM4938s2.f66365a = ex3VarM10734a;
                            String str5 = Build.VERSION.RELEASE;
                            co7Var = co7Var3;
                            ((or3) w41VarM4938s2.f66367c).m18305j("User-Agent", "Android " + str5 + " v" + ob1Var.m17889b() + " app: " + context.getPackageName() + " GUID: " + str);
                            ((or3) w41VarM4938s2.f66367c).m18305j("Accept", "application/json");
                            ((or3) w41VarM4938s2.f66367c).m18305j("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                            StringBuilder sb = new StringBuilder("Token ");
                            sb.append(str4);
                            ((or3) w41VarM4938s2.f66367c).m18305j("Authorization", sb.toString());
                            co7Var2 = new co7(w41VarM4938s2);
                        }
                    } catch (Exception e) {
                        e = e;
                        co7Var = co7Var3;
                        at4Var2 = at4Var;
                        e.printStackTrace();
                        j88 j88VarM3031f = at4Var2.m3031f(co7Var);
                        if (j88VarM3031f.f45204d == 401) {
                            uk6Var.mo9816c1();
                        }
                        return j88VarM3031f;
                    }
                } else {
                    co7Var = co7Var3;
                    w41 w41VarM4938s3 = co7Var.m4938s();
                    ex3VarM10734a.getClass();
                    w41VarM4938s3.f66365a = ex3VarM10734a;
                    ((or3) w41VarM4938s3.f66367c).m18305j("User-Agent", "Android " + Build.VERSION.RELEASE + " v" + ob1Var.m17889b() + " app: " + context.getPackageName() + " GUID: " + str);
                    ((or3) w41VarM4938s3.f66367c).m18305j("Accept", "application/json");
                    ((or3) w41VarM4938s3.f66367c).m18305j("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                    co7Var2 = new co7(w41VarM4938s3);
                }
                j88 j88VarM3031f2 = at4Var.m3031f(co7Var2);
                if (j88VarM3031f2.f45204d == 401) {
                    uk6Var.mo9816c1();
                }
                return j88VarM3031f2;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            uk6Var = uk6Var2;
            co7Var = co7Var3;
        }
    }
}
