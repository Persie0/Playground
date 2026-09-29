package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v5d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f64902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g4c f64903c;

    public v5d(s6d s6dVar, long j, int i) {
        this.f64901a = i;
        switch (i) {
            case 1:
                this.f64902b = j;
                Objects.requireNonNull(s6dVar);
                this.f64903c = s6dVar;
                break;
            default:
                this.f64902b = j;
                Objects.requireNonNull(s6dVar);
                this.f64903c = s6dVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f64901a;
        long j = this.f64902b;
        g4c g4cVar = this.f64903c;
        switch (i) {
            case 0:
                s6d s6dVar = (s6d) g4cVar;
                zoa zoaVar = s6dVar.f60442f;
                s6dVar.mo12359D();
                s6dVar.m21133H();
                kjc kjcVar = (kjc) s6dVar.f60774a;
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17924b(Long.valueOf(j), "Activity resumed, time");
                cmb cmbVar = kjcVar.f47436d;
                if (cmbVar.m4869O(null, z8c.f71138S0)) {
                    if (cmbVar.m4873S() || s6dVar.f60440d) {
                        ((s6d) zoaVar.f71911d).mo12359D();
                        ((dsc) zoaVar.f71910c).m25216c();
                        zoaVar.f71908a = j;
                        zoaVar.f71909b = j;
                    }
                } else if (cmbVar.m4873S()) {
                    ((s6d) zoaVar.f71911d).mo12359D();
                    ((dsc) zoaVar.f71910c).m25216c();
                    zoaVar.f71908a = j;
                    zoaVar.f71909b = j;
                } else {
                    qfc qfcVar = kjcVar.f47437e;
                    kjc.m15278j(qfcVar);
                    if (qfcVar.f57718N.m22719a()) {
                        ((s6d) zoaVar.f71911d).mo12359D();
                        ((dsc) zoaVar.f71910c).m25216c();
                        zoaVar.f71908a = j;
                        zoaVar.f71909b = j;
                    }
                }
                qfa qfaVar = s6dVar.f60443g;
                s6d s6dVar2 = (s6d) qfaVar.f57706b;
                s6dVar2.mo12359D();
                c6d c6dVar = (c6d) qfaVar.f57705a;
                if (c6dVar != null) {
                    s6dVar2.f60439c.removeCallbacks(c6dVar);
                }
                qfc qfcVar2 = ((kjc) s6dVar2.f60774a).f47437e;
                kjc.m15278j(qfcVar2);
                qfcVar2.f57718N.m22720b(false);
                s6dVar2.mo12359D();
                s6dVar2.f60440d = false;
                gw9 gw9Var = s6dVar.f60441e;
                s6d s6dVar3 = (s6d) gw9Var.f41432b;
                s6dVar3.mo12359D();
                kjc kjcVar2 = (kjc) s6dVar3.f60774a;
                boolean zM15282f = kjcVar2.m15282f();
                gr7 gr7Var = kjcVar2.f47443k;
                if (zM15282f) {
                    gr7Var.getClass();
                    gw9Var.m12938i(System.currentTimeMillis(), kjcVar2.f47436d.m4869O(null, z8c.f71167e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            case 1:
                s6d s6dVar4 = (s6d) g4cVar;
                s6dVar4.mo12359D();
                s6dVar4.m21133H();
                kjc kjcVar3 = (kjc) s6dVar4.f60774a;
                xcc xccVar2 = kjcVar3.f47438f;
                kjc.m15280l(xccVar2);
                occ occVar = xccVar2.f68076I;
                long j2 = this.f64902b;
                occVar.m17924b(Long.valueOf(j2), "Activity paused, time");
                qfa qfaVar2 = s6dVar4.f60443g;
                s6d s6dVar5 = (s6d) qfaVar2.f57706b;
                ((kjc) s6dVar5.f60774a).f47443k.getClass();
                c6d c6dVar2 = new c6d(qfaVar2, System.currentTimeMillis(), j2);
                qfaVar2.f57705a = c6dVar2;
                s6dVar5.f60439c.postDelayed(c6dVar2, 2000L);
                if (kjcVar3.f47436d.m4873S()) {
                    ((dsc) s6dVar4.f60442f.f71910c).m25216c();
                }
                break;
            default:
                ((jwb) g4cVar).m14734J(j);
                break;
        }
    }

    public v5d(jwb jwbVar, long j) {
        this.f64901a = 2;
        this.f64902b = j;
        Objects.requireNonNull(jwbVar);
        this.f64903c = jwbVar;
    }
}
