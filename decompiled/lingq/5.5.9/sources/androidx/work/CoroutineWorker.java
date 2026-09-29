package androidx.work;

import android.content.Context;
import androidx.activity.RunnableC0190i;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.impl.utils.futures.C1268a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C7155e;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7828f;
import no.C7832g0;
import no.C7879x0;
import p026b5.C1310c;
import p257m5.C7480b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13365d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/d;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
public abstract class CoroutineWorker extends AbstractC1246d {

    /* JADX INFO: renamed from: e */
    public final C7879x0 f7787e;

    /* JADX INFO: renamed from: f */
    public final C1268a<AbstractC1246d.a> f7788f;

    /* JADX INFO: renamed from: g */
    public final C7178b f7789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C5207g.m11111f(context, "appContext");
        C5207g.m11111f(workerParameters, "params");
        this.f7787e = new C7879x0(null);
        C1268a<AbstractC1246d.a> c1268a = new C1268a<>();
        this.f7788f = c1268a;
        c1268a.mo2629f(new RunnableC0190i(7, this), ((C7480b) this.f7829b.f7805e).f41352a);
        this.f7789g = C7832g0.f42930a;
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC10478a<C1310c> mo4695a() {
        C7879x0 c7879x0 = new C7879x0(null);
        C7178b c7178b = this.f7789g;
        c7178b.getClass();
        C7155e c7155eM14930b = C7499b.m14930b(CoroutineContext.DefaultImpls.m13470a(c7178b, c7879x0));
        C1245c c1245c = new C1245c(c7879x0);
        C7828f.m15570d(c7155eM14930b, null, null, new CoroutineWorker$getForegroundInfoAsync$1(c1245c, this, null), 3);
        return c1245c;
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: b */
    public final void mo4696b() {
        this.f7788f.cancel(false);
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: c */
    public final C1268a mo4697c() {
        C7828f.m15570d(C7499b.m14930b(this.f7789g.mo1471C(this.f7787e)), null, null, new CoroutineWorker$startWork$1(this, null), 3);
        return this.f7788f;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo4698g(InterfaceC9968c<? super AbstractC1246d.a> interfaceC9968c);
}
