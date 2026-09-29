package com.lingq;

import android.app.Application;
import android.content.Context;
import coil.C0855a;
import com.lingq.core.analytics.C1240a;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.C3386nv;
import p000.bd1;
import p000.e0a;
import p000.eh0;
import p000.f0a;
import p000.fa4;
import p000.g0a;
import p000.gh1;
import p000.h0a;
import p000.hh1;
import p000.hm5;
import p000.l70;
import p000.nn9;
import p000.ny8;
import p000.ot3;
import p000.ph2;
import p000.r46;
import p000.r80;
import p000.s80;
import p000.si7;
import p000.sm5;
import p000.t62;
import p000.tm5;
import p000.v72;
import p000.vl1;
import p000.vz1;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractApplicationC1226a extends Application {
    public static final s80 Companion = new s80();

    /* JADX INFO: renamed from: a */
    public ot3 f14160a;

    /* JADX INFO: renamed from: b */
    public hm5 f14161b;

    /* JADX INFO: renamed from: c */
    public sm5 f14162c;

    /* JADX INFO: renamed from: d */
    public si7 f14163d;

    /* JADX INFO: renamed from: e */
    public final vl1 f14164e;

    public AbstractApplicationC1226a() {
        nn9 nn9VarM20384i = r46.m20384i();
        v72 v72Var = ph2.f56212a;
        this.f14164e = vz1.m23619a(eh0.m11113J(nn9VarM20384i, t62.f61909c));
    }

    /* JADX INFO: renamed from: a */
    public final hh1 m6993a() {
        gh1 gh1Var = new gh1(0);
        ot3 ot3Var = this.f14160a;
        if (ot3Var == null) {
            fa4.m11636J("workerFactory");
            throw null;
        }
        gh1Var.f40793e = ot3Var;
        gh1Var.f40791c = Math.min(20, 50);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8);
        executorServiceNewFixedThreadPool.getClass();
        gh1Var.f40792d = executorServiceNewFixedThreadPool;
        gh1Var.f40790b = 3;
        return new hh1(gh1Var);
    }

    /* JADX INFO: renamed from: c */
    public final C0855a m6994c() {
        ny8 ny8Var = new ny8(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList.add(new r80());
        ny8Var.f53416d = new bd1(l70.m15918I(arrayList), l70.m15918I(arrayList2), l70.m15918I(arrayList3), l70.m15918I(arrayList4), l70.m15918I(arrayList5));
        return ny8Var.m17696k();
    }

    @Override // android.app.Application
    public void onCreate() {
        boolean zBooleanValue;
        super.onCreate();
        wfb.m23899A(new BaseApplication$onCreate$1(this, null));
        hm5 hm5Var = this.f14161b;
        if (hm5Var == null) {
            fa4.m11636J("analytics");
            throw null;
        }
        ((C1240a) hm5Var).m7024e();
        sm5 sm5Var = this.f14162c;
        if (sm5Var == null) {
            fa4.m11636J("lqLogger");
            throw null;
        }
        Context context = ((tm5) sm5Var).f62526a;
        try {
            Object obj = Class.forName(context.getPackageName() + ".BuildConfig").getField("DEV_OPTIONS_AVAILABLE").get(null);
            obj.getClass();
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = (context.getApplicationInfo().flags & 2) != 0;
        }
        if (zBooleanValue) {
            f0a f0aVar = h0a.f41641a;
            e0a e0aVar = new e0a();
            f0aVar.getClass();
            if (e0aVar == f0aVar) {
                C3386nv.m17626m("Cannot plant Timber into itself.");
                return;
            }
            ArrayList arrayList = h0a.f41642b;
            synchronized (arrayList) {
                arrayList.add(e0aVar);
                Object[] array = arrayList.toArray(new g0a[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                h0a.f41643c = (g0a[]) array;
            }
        }
        wfb.m23926u(this.f14164e, null, null, new BaseApplication$onCreate$2(this, null), 3);
        wfb.m23926u(this.f14164e, null, null, new BaseApplication$onCreate$3(this, null), 3);
    }
}
