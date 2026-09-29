package androidx.work.impl.workers;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.AbstractC1246d;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import dm.C5207g;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p214k5.InterfaceC6608j;
import p214k5.InterfaceC6612n;
import p214k5.InterfaceC6618t;
import p214k5.InterfaceC6621w;
import p271n5.C7708b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13365d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: g */
    public final AbstractC1246d.a.c mo4699g() {
        C1699a0 c1699a0M5430d = C1699a0.m5430d(this.f7828a);
        C5207g.m11110e(c1699a0M5430d, "getInstance(applicationContext)");
        WorkDatabase workDatabase = c1699a0M5430d.f9477c;
        C5207g.m11110e(workDatabase, "workManager.workDatabase");
        InterfaceC6618t interfaceC6618tMo4718z = workDatabase.mo4718z();
        InterfaceC6612n interfaceC6612nMo4716x = workDatabase.mo4716x();
        InterfaceC6621w interfaceC6621wMo4712A = workDatabase.mo4712A();
        InterfaceC6608j interfaceC6608jMo4715w = workDatabase.mo4715w();
        ArrayList arrayListMo13228f = interfaceC6618tMo4718z.mo13228f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListMo13233k = interfaceC6618tMo4718z.mo13233k();
        ArrayList arrayListMo13224b = interfaceC6618tMo4718z.mo13224b();
        if (!arrayListMo13228f.isEmpty()) {
            AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
            String str = C7708b.f42235a;
            abstractC1314gM4867d.mo4872e(str, "Recently completed work:\n\n");
            AbstractC1314g.m4867d().mo4872e(str, C7708b.m15301a(interfaceC6612nMo4716x, interfaceC6621wMo4712A, interfaceC6608jMo4715w, arrayListMo13228f));
        }
        if (!arrayListMo13233k.isEmpty()) {
            AbstractC1314g abstractC1314gM4867d2 = AbstractC1314g.m4867d();
            String str2 = C7708b.f42235a;
            abstractC1314gM4867d2.mo4872e(str2, "Running work:\n\n");
            AbstractC1314g.m4867d().mo4872e(str2, C7708b.m15301a(interfaceC6612nMo4716x, interfaceC6621wMo4712A, interfaceC6608jMo4715w, arrayListMo13233k));
        }
        if (!arrayListMo13224b.isEmpty()) {
            AbstractC1314g abstractC1314gM4867d3 = AbstractC1314g.m4867d();
            String str3 = C7708b.f42235a;
            abstractC1314gM4867d3.mo4872e(str3, "Enqueued work:\n\n");
            AbstractC1314g.m4867d().mo4872e(str3, C7708b.m15301a(interfaceC6612nMo4716x, interfaceC6621wMo4712A, interfaceC6608jMo4715w, arrayListMo13224b));
        }
        return new AbstractC1246d.a.c();
    }
}
