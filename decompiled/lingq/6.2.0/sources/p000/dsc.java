package p000;

import android.os.SystemClock;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dsc extends ynb {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f36187e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f36188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsc(C1043b c1043b, uoc uocVar) {
        super(uocVar);
        this.f36187e = 0;
        Objects.requireNonNull(c1043b);
        this.f36188f = c1043b;
    }

    @Override // p000.ynb
    /* JADX INFO: renamed from: a */
    public final void mo55a() {
        int i = this.f36187e;
        Object obj = this.f36188f;
        switch (i) {
            case 0:
                ((C1043b) obj).m5853J();
                break;
            case 1:
                zoa zoaVar = (zoa) obj;
                s6d s6dVar = (s6d) zoaVar.f71911d;
                s6dVar.mo12359D();
                kjc kjcVar = (kjc) s6dVar.f60774a;
                kjcVar.f47443k.getClass();
                zoaVar.m25732e(SystemClock.elapsedRealtime(), false, false);
                jwb jwbVar = kjcVar.f47415I;
                kjc.m15277i(jwbVar);
                kjcVar.f47443k.getClass();
                jwbVar.m14731G(SystemClock.elapsedRealtime());
                break;
            default:
                k7d k7dVar = (k7d) obj;
                k7dVar.m14947I();
                xcc xccVar = ((kjc) k7dVar.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17923a("Starting upload from DelayedRunnable");
                k7dVar.f55716b.m5939q();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsc(Object obj, uoc uocVar, int i) {
        super(uocVar);
        this.f36187e = i;
        this.f36188f = obj;
    }
}
