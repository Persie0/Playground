package androidx.work.impl;

import android.content.Context;
import androidx.room.C0738c;
import androidx.work.R$bool;
import java.util.List;
import p000.C3487q7;
import p000.by8;
import p000.e8b;
import p000.f31;
import p000.gr7;
import p000.hh1;
import p000.il7;
import p000.p78;
import p000.sy5;
import p000.w8a;
import p000.xwc;

/* JADX INFO: renamed from: androidx.work.impl.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0774c {
    /* JADX INFO: renamed from: a */
    public static final C0773b m2919a(Context context, hh1 hh1Var) {
        C0738c c0738cM24779q;
        context.getClass();
        e8b e8bVar = new e8b(hh1Var.f42349c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        by8 by8Var = e8bVar.f36847a;
        by8Var.getClass();
        gr7 gr7Var = hh1Var.f42350d;
        boolean z = context.getResources().getBoolean(R$bool.workmanager_test_configuration);
        gr7Var.getClass();
        if (z) {
            c0738cM24779q = new C0738c(applicationContext, WorkDatabase.class, null);
            c0738cM24779q.f6833i = true;
        } else {
            c0738cM24779q = xwc.m24779q(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            c0738cM24779q.f6832h = new C3487q7(applicationContext, 23);
        }
        c0738cM24779q.f6830f = by8Var;
        c0738cM24779q.f6828d.add(new f31(gr7Var));
        c0738cM24779q.m2811a(sy5.f61621h);
        c0738cM24779q.m2811a(new p78(applicationContext, 2, 3));
        c0738cM24779q.m2811a(sy5.f61622i);
        c0738cM24779q.m2811a(sy5.f61623j);
        c0738cM24779q.m2811a(new p78(applicationContext, 5, 6));
        c0738cM24779q.m2811a(sy5.f61624k);
        c0738cM24779q.m2811a(sy5.f61625l);
        c0738cM24779q.m2811a(sy5.f61626m);
        c0738cM24779q.m2811a(new p78(applicationContext));
        c0738cM24779q.m2811a(new p78(applicationContext, 10, 11));
        c0738cM24779q.m2811a(sy5.f61617d);
        c0738cM24779q.m2811a(sy5.f61618e);
        c0738cM24779q.m2811a(sy5.f61619f);
        c0738cM24779q.m2811a(sy5.f61620g);
        c0738cM24779q.m2811a(new p78(applicationContext, 21, 22));
        c0738cM24779q.f6840p = false;
        c0738cM24779q.f6841q = true;
        c0738cM24779q.f6842r = true;
        WorkDatabase workDatabase = (WorkDatabase) c0738cM24779q.m2812b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        w8a w8aVar = new w8a(applicationContext2, e8bVar);
        il7 il7Var = new il7(context.getApplicationContext(), hh1Var, e8bVar, workDatabase);
        return new C0773b(context.getApplicationContext(), hh1Var, e8bVar, workDatabase, (List) WorkManagerImplExtKt$WorkManagerImpl$1.f7185i.mo1290h(context, hh1Var, e8bVar, workDatabase, w8aVar, il7Var), il7Var, w8aVar);
    }
}
