package androidx.work.impl.workers;

import android.content.Context;
import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p000.C3405od;
import p000.foa;
import p000.g8b;
import p000.og5;
import p000.oj5;
import p000.sp9;
import p000.u8b;
import p000.ud2;
import p000.w8b;

/* JADX INFO: loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: d */
    public final og5 mo2901d() {
        C0773b c0773bM2910c = C0773b.m2910c(this.f56131a);
        c0773bM2910c.getClass();
        WorkDatabase workDatabase = c0773bM2910c.f7206c;
        workDatabase.getClass();
        u8b u8bVarMo2909z = workDatabase.mo2909z();
        g8b g8bVarMo2907x = workDatabase.mo2907x();
        w8b w8bVarMo2903A = workDatabase.mo2903A();
        sp9 sp9VarMo2906w = workDatabase.mo2906w();
        c0773bM2910c.f7205b.f42350d.getClass();
        List list = (List) AbstractC0758a.m2859b(u8bVarMo2909z.f63598a, true, false, new C3405od(4, System.currentTimeMillis() - 86400000));
        AbstractC0746d abstractC0746d = u8bVarMo2909z.f63598a;
        List list2 = (List) AbstractC0758a.m2859b(abstractC0746d, true, false, new foa(14));
        List list3 = (List) AbstractC0758a.m2859b(abstractC0746d, true, false, new foa(17));
        if (!list.isEmpty()) {
            oj5 oj5VarM18040f = oj5.m18040f();
            String str = ud2.f63752a;
            oj5VarM18040f.m18045g(str, "Recently completed work:\n\n");
            oj5.m18040f().m18045g(str, ud2.m22683a(g8bVarMo2907x, w8bVarMo2903A, sp9VarMo2906w, list));
        }
        if (!list2.isEmpty()) {
            oj5 oj5VarM18040f2 = oj5.m18040f();
            String str2 = ud2.f63752a;
            oj5VarM18040f2.m18045g(str2, "Running work:\n\n");
            oj5.m18040f().m18045g(str2, ud2.m22683a(g8bVarMo2907x, w8bVarMo2903A, sp9VarMo2906w, list2));
        }
        if (!list3.isEmpty()) {
            oj5 oj5VarM18040f3 = oj5.m18040f();
            String str3 = ud2.f63752a;
            oj5VarM18040f3.m18045g(str3, "Enqueued work:\n\n");
            oj5.m18040f().m18045g(str3, ud2.m22683a(g8bVarMo2907x, w8bVarMo2903A, sp9VarMo2906w, list3));
        }
        return og5.m17981a();
    }
}
