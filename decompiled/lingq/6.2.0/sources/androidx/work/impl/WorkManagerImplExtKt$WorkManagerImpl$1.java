package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.dj3;
import p000.e8b;
import p000.hh1;
import p000.il7;
import p000.l17;
import p000.oj5;
import p000.qfa;
import p000.um8;
import p000.vp3;
import p000.vz1;
import p000.w8a;
import p000.xp9;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements dj3 {

    /* JADX INFO: renamed from: i */
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 f7185i = new WorkManagerImplExtKt$WorkManagerImpl$1(6, AbstractC0774c.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        hh1 hh1Var = (hh1) obj2;
        e8b e8bVar = (e8b) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        w8a w8aVar = (w8a) obj5;
        il7 il7Var = (il7) obj6;
        context.getClass();
        hh1Var.getClass();
        e8bVar.getClass();
        workDatabase.getClass();
        w8aVar.getClass();
        String str = um8.f64079a;
        xp9 xp9Var = new xp9(context, workDatabase, hh1Var);
        l17.m15740a(context, SystemJobService.class, true);
        oj5.m18040f().m18042a(um8.f64079a, "Created SystemJobScheduler and enabled SystemJobService");
        return vz1.m23605K(xp9Var, new vp3(context, hh1Var, w8aVar, il7Var, new qfa(il7Var, e8bVar), e8bVar));
    }
}
