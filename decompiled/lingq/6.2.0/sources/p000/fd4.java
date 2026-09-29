package p000;

import android.net.Uri;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.json.internal.JsonType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadMethod;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fd4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f38885r;

    /* JADX INFO: renamed from: s */
    public static final String f38886s;

    /* JADX INFO: renamed from: t */
    public static final sq5 f38887t;

    /* JADX INFO: renamed from: q */
    public final dg4 f38888q;

    static {
        String str = se4.f60752q;
        f38885r = str;
        f38886s = se4.f60735A;
        sj5 sj5VarM20396w = r46.m20396w();
        f38887t = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
    }

    public fd4(dg4 dg4Var) {
        super(f38885r, f38886s, Arrays.asList(se4.f60738c), JobType.OneShot, TaskQueue.Worker, f38887t);
        this.f38888q = dg4Var;
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        boolean zM21356h;
        sl7 sl7Var;
        eg4 eg4Var;
        boolean z;
        if (((rl7) ce4Var.f9967b).m20695k()) {
            f38887t.m21555D("Consent restricted, dropping incoming event");
            return ie4.m13807a();
        }
        o67 o67VarM20691g = ((rl7) ce4Var.f9967b).m20691g();
        synchronized (o67VarM20691g) {
            zM21356h = o67VarM20691g.f53897a.m21356h();
        }
        if (zM21356h) {
            f38887t.m21555D("Event queue is full. dropping incoming event");
            return ie4.m13807a();
        }
        String strM10344n = this.f38888q.m10344n("event_name", "");
        if (!((g02) ce4Var.f9969d).m12258f(strM10344n)) {
            f38887t.m21555D("Event name is denied, dropping incoming event with name " + strM10344n);
            return ie4.m13807a();
        }
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        rl7Var.m20705u();
        synchronized (rl7.f59476R) {
            sl7Var = rl7Var.f59479J;
        }
        synchronized (sl7Var) {
            eg4Var = (eg4) sl7Var.f60980b;
        }
        dg4 dg4VarM10336f = ((dg4) eg4Var).m10336f();
        if (dg4VarM10336f.m10348r() > 0) {
            rf4 rf4VarM10341k = this.f38888q.m10341k("event_data", false);
            if (rf4VarM10341k == null) {
                this.f38888q.m10356z("event_data", dg4VarM10336f);
            } else if (JsonType.getType(rf4VarM10341k.f59203a) == JsonType.JsonObject) {
                dg4VarM10336f.m10346p(rf4VarM10341k.m20646a());
                this.f38888q.m10356z("event_data", dg4VarM10336f);
            } else {
                f38887t.m21555D("Default parameters cannot be applied to this event as event_data is not in a valid format.");
            }
        }
        long jMax = Math.max(this.f8374g, ((d74) ce4Var.f9968c).f35078b);
        PayloadType payloadType = PayloadType.Event;
        long j = ((d74) ce4Var.f9968c).f35078b;
        long jM11226G = ((rl7) ce4Var.f9967b).m20699o().m11226G();
        long jM13601f = ((hz8) ce4Var.f9970e).m13601f();
        hz8 hz8Var = (hz8) ce4Var.f9970e;
        synchronized (hz8Var) {
            z = hz8Var.f43253h;
        }
        int iM13599d = ((hz8) ce4Var.f9970e).m13599d();
        dg4 dg4Var = this.f38888q;
        sq5 sq5Var = l67.f49186l;
        l67 l67Var = new l67(new n67(payloadType, PayloadMethod.Post, j, jM11226G, jMax, jM13601f, z, iM13599d), dg4.m10328c(), dg4Var, Uri.EMPTY, 0, true, true, true, false, null, false);
        l67Var.m15902e(((d74) ce4Var.f9968c).f35077a, (g02) ce4Var.f9969d);
        return ie4.m13808b(l67Var);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        l67 l67Var = (l67) obj;
        if (l67Var == null) {
            return;
        }
        ((rl7) ce4Var.f9967b).m20691g().m17821a(l67Var);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo298i(ce4 ce4Var) {
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ boolean mo300n(ce4 ce4Var) {
        return false;
    }
}
