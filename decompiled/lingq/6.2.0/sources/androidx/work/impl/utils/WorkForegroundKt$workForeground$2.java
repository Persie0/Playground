package androidx.work.impl.utils;

import android.content.Context;
import androidx.concurrent.futures.AbstractC0465c;
import java.util.UUID;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ah1;
import p000.by8;
import p000.c32;
import p000.f5d;
import p000.g91;
import p000.gc3;
import p000.gm0;
import p000.h9b;
import p000.oj5;
import p000.p8b;
import p000.pg5;
import p000.un1;
import p000.wq1;
import p000.xfa;
import p000.z7b;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", m4291f = "WorkForeground.kt", m4292l = {42, 50}, m4293m = "invokeSuspend")
final class WorkForegroundKt$workForeground$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7263a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pg5 f7264b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p8b f7265c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z7b f7266d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f7267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkForegroundKt$workForeground$2(pg5 pg5Var, p8b p8bVar, z7b z7bVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f7264b = pg5Var;
        this.f7265c = p8bVar;
        this.f7266d = z7bVar;
        this.f7267e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkForegroundKt$workForeground$2(this.f7264b, this.f7265c, this.f7266d, this.f7267e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkForegroundKt$workForeground$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f7265c.f55774c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7263a;
        pg5 pg5Var = this.f7264b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            gm0 gm0VarMo2899a = pg5Var.mo2899a();
            this.f7263a = 1;
            obj = h9b.m13148a(gm0VarMo2899a, pg5Var, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        gc3 gc3Var = (gc3) obj;
        if (gc3Var == null) {
            C3386nv.m17633t(wq1.m24118n("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
            return null;
        }
        String str2 = AbstractC0779a.f7268a;
        oj5.m18040f().m18042a(str2, "Updating notification for " + str);
        UUID uuid = pg5Var.f56132b.f7165a;
        z7b z7bVar = this.f7266d;
        by8 by8Var = z7bVar.f71035a.f36847a;
        g91 g91Var = new g91(z7bVar, uuid, gc3Var, this.f7267e, 16);
        by8Var.getClass();
        gm0 gm0VarM11561c = f5d.m11561c(new ah1(by8Var, "setForegroundAsync", g91Var));
        this.f7263a = 2;
        Object objM1910a = AbstractC0465c.m1910a(gm0VarM11561c, this);
        return objM1910a == coroutineSingletons ? coroutineSingletons : objM1910a;
    }
}
