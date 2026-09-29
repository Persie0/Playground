package p000;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;

/* JADX INFO: loaded from: classes.dex */
public final class d2d {

    /* JADX INFO: renamed from: a */
    public final ltc f34881a;

    public d2d(ltc ltcVar) {
        this.f34881a = ltcVar;
    }

    /* JADX INFO: renamed from: b */
    public static C3555s m9998b(Task task) {
        svc svcVar = new svc();
        svcVar.f61502h = task;
        task.mo5960b(AbstractC1120j.m6404a(), new gw9(svcVar, 14));
        return AbstractC1118h.m6397a(svcVar, ApiException.class, w1d.f66235a, AbstractC1120j.m6404a());
    }

    /* JADX INFO: renamed from: a */
    public final C3555s m9999a(ccd ccdVar) {
        String string;
        String simpleName = yuc.class.getSimpleName();
        ltc ltcVar = this.f34881a;
        wo3 wo3VarM4309a = c47.m4309a(ltcVar.f53051g, simpleName, ccdVar);
        if (AbstractC3423or.f54777o == null) {
            AbstractC3423or.f54777o = Application.getProcessName();
        }
        String str = AbstractC3423or.f54777o;
        if (str == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = str.length() + 1;
            int iIdentityHashCode = System.identityHashCode(yuc.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(str);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        mq7 mq7Var = new mq7(ltcVar, string, wo3VarM4309a, 16);
        b48 b48Var = new b48();
        b48Var.f7933e = true;
        b48Var.m3292f(wo3VarM4309a);
        b48Var.m3288b(mq7Var);
        b48Var.m3291e();
        b48Var.m3290d(AbstractC3423or.f54771i);
        b48Var.m3289c();
        p33 p33VarM3287a = b48Var.m3287a();
        nc0 nc0Var = (nc0) p33VarM3287a.f55513b;
        lda.m16131q(nc0Var.m17327d(), "Listener has already been released.");
        cdb cdbVar = (cdb) p33VarM3287a.f55514c;
        lda.m16131q(cdbVar.m4556c(), "Listener has already been released.");
        so3 so3Var = ltcVar.f53055k;
        so3Var.getClass();
        wr9 wr9Var = new wr9();
        so3Var.m21517c(wr9Var, 0, ltcVar);
        adb adbVar = new adb(new mdb(new bdb(nc0Var, cdbVar), wr9Var), so3Var.f61102i.get(), ltcVar);
        wdb wdbVar = so3Var.f61092H;
        wdbVar.sendMessage(wdbVar.obtainMessage(8, adbVar));
        return m9998b(wr9Var.f67208a);
    }
}
