package androidx.work.impl.workers;

import android.content.Context;
import androidx.activity.RunnableC0191j;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.C1268a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p026b5.AbstractC1314g;
import p131g5.InterfaceC5699c;
import p214k5.C6617s;
import p271n5.C7707a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m13365d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/d;", "Lg5/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public final class ConstraintTrackingWorker extends AbstractC1246d implements InterfaceC5699c {

    /* JADX INFO: renamed from: e */
    public final WorkerParameters f7947e;

    /* JADX INFO: renamed from: f */
    public final Object f7948f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f7949g;

    /* JADX INFO: renamed from: h */
    public final C1268a<AbstractC1246d.a> f7950h;

    /* JADX INFO: renamed from: i */
    public AbstractC1246d f7951i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "workerParameters");
        this.f7947e = workerParameters;
        this.f7948f = new Object();
        this.f7950h = new C1268a<>();
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: b */
    public final void mo4696b() {
        AbstractC1246d abstractC1246d = this.f7951i;
        if (abstractC1246d != null && !abstractC1246d.f7830c) {
            abstractC1246d.m4711e();
        }
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: c */
    public final C1268a mo4697c() {
        this.f7829b.f7804d.execute(new RunnableC0191j(6, this));
        C1268a<AbstractC1246d.a> c1268a = this.f7950h;
        C5207g.m11110e(c1268a, "future");
        return c1268a;
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: d */
    public final void mo4734d(ArrayList arrayList) {
        C5207g.m11111f(arrayList, "workSpecs");
        AbstractC1314g.m4867d().mo4869a(C7707a.f42234a, "Constraints changed for " + arrayList);
        synchronized (this.f7948f) {
            try {
                this.f7949g = true;
                C9072e c9072e = C9072e.f47360a;
            } finally {
            }
        }
    }

    @Override // p131g5.InterfaceC5699c
    /* JADX INFO: renamed from: f */
    public final void mo4736f(List<C6617s> list) {
    }
}
