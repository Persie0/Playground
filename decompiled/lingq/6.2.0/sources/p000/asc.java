package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class asc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f7449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i9c f7450c;

    public asc(C1043b c1043b, long j, int i) {
        this.f7448a = i;
        switch (i) {
            case 1:
                this.f7449b = j;
                this.f7450c = c1043b;
                break;
            default:
                this.f7449b = j;
                Objects.requireNonNull(c1043b);
                this.f7450c = c1043b;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7448a;
        long j = this.f7449b;
        i9c i9cVar = this.f7450c;
        switch (i) {
            case 0:
                kjc kjcVar = (kjc) ((C1043b) i9cVar).f60774a;
                qfc qfcVar = kjcVar.f47437e;
                kjc.m15278j(qfcVar);
                qfcVar.f57733k.m19953h(j);
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68075H.m17924b(Long.valueOf(j), "Session timeout duration set");
                break;
            case 1:
                C1043b c1043b = (C1043b) i9cVar;
                c1043b.mo12359D();
                c1043b.m13744E();
                kjc kjcVar2 = (kjc) c1043b.f60774a;
                xcc xccVar2 = kjcVar2.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68075H.m17923a("Resetting analytics data (FE)");
                s6d s6dVar = kjcVar2.f47440h;
                kjc.m15279k(s6dVar);
                s6dVar.mo12359D();
                zoa zoaVar = s6dVar.f60442f;
                ((dsc) zoaVar.f71910c).m25216c();
                ((kjc) ((s6d) zoaVar.f71911d).f60774a).f47443k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zoaVar.f71908a = jElapsedRealtime;
                zoaVar.f71909b = jElapsedRealtime;
                kjcVar2.m15289q().m21927I();
                boolean z = !kjcVar2.m15282f();
                qfc qfcVar2 = kjcVar2.f47437e;
                kjc.m15278j(qfcVar2);
                qfcVar2.f57728f.m19953h(j);
                kjc kjcVar3 = (kjc) qfcVar2.f60774a;
                qfc qfcVar3 = kjcVar3.f47437e;
                kjc.m15278j(qfcVar3);
                if (!TextUtils.isEmpty(qfcVar3.f57721Q.m20980o())) {
                    qfcVar2.f57721Q.m20981p(null);
                }
                qfcVar2.f57715K.m19953h(0L);
                qfcVar2.f57716L.m19953h(0L);
                if (!kjcVar3.f47436d.m4872R()) {
                    qfcVar2.m19934L(z);
                }
                qfcVar2.f57722R.m20981p(null);
                qfcVar2.f57723S.m19953h(0L);
                qfcVar2.f57724T.m17689Q(null);
                v4d v4dVarM15287o = kjcVar2.m15287o();
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                zzr zzrVarM23119T = v4dVarM15287o.m23119T(false);
                v4dVarM15287o.m23115P();
                ((kjc) v4dVarM15287o.f60774a).m15286n().m14375H();
                v4dVarM15287o.m23117R(new k1d(v4dVarM15287o, zzrVarM23119T, 0));
                kjc.m15279k(s6dVar);
                s6dVar.f60441e.m12936e();
                c1043b.f12320M = z;
                kjcVar2.m15287o().m23107H(new AtomicReference());
                break;
            default:
                j0d j0dVar = (j0d) i9cVar;
                jwb jwbVar = ((kjc) j0dVar.f60774a).f47415I;
                kjc.m15277i(jwbVar);
                jwbVar.m14731G(j);
                j0dVar.f44863e = null;
                break;
        }
    }

    public asc(j0d j0dVar, long j) {
        this.f7448a = 2;
        this.f7449b = j;
        Objects.requireNonNull(j0dVar);
        this.f7450c = j0dVar;
    }
}
