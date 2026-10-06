package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fnu implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f22806a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ foc f22807b;

    public fnu(foc focVar, nqf nqfVar) {
        this.f22807b = focVar;
        this.f22806a = nqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        exp expVar = this.f22807b.f22886q;
        if (expVar != null) {
            expVar.f20849m = false;
            exu exuVar = expVar.f20839c;
            if (exuVar != null) {
                for (int i = 0; i < exuVar.f20890j.size(); i++) {
                    luc lucVar = ((ext) exuVar.f20890j.get(i)).f20884i;
                    if (lucVar != null) {
                        lucVar.m15987e();
                    }
                    luc lucVar2 = ((ext) exuVar.f20890j.get(i)).f20885j;
                    if (lucVar2 != null) {
                        lucVar2.m15987e();
                    }
                }
                exuVar.f20890j.clear();
                exuVar.f20889i.m8024b();
            }
            GLES20.glDeleteTextures(2, new int[]{expVar.f20852p, expVar.f20851o}, 0);
            exs exsVar = expVar.f20838b;
            luc lucVar3 = !exsVar.f20700d.isEmpty() ? (luc) exsVar.f20700d.get(0) : null;
            if (lucVar3 != null) {
                lucVar3.m15987e();
            }
            ewz ewzVar = expVar.f20795H;
            if (ewzVar != null) {
                ewzVar.m7969d();
            }
            ewz ewzVar2 = expVar.f20796I;
            if (ewzVar2 != null) {
                ewzVar2.m7969d();
            }
            eyl eylVar = expVar.f20845i;
            if (eylVar != null) {
                eylVar.m7969d();
            }
            exa exaVar = expVar.f20846j;
            if (exaVar != null) {
                exaVar.m7969d();
            }
            eyj eyjVar = expVar.f20847k;
            if (eyjVar != null) {
                eyjVar.m7969d();
            }
            ewx ewxVar = expVar.f20814a;
            if (ewxVar != null) {
                ((exq) ewxVar).f20863f.m7969d();
            }
            exw exwVar = expVar.f20844h;
            if (exwVar != null) {
                for (int i2 = 0; i2 < exwVar.f20896a.size(); i2++) {
                    if (exwVar.f20896a.get(i2) != null) {
                        ((exb) exwVar.f20896a.get(i2)).m7974e();
                    }
                }
                eyj eyjVar2 = exwVar.f20899d;
                if (eyjVar2 != null) {
                    eyjVar2.m7969d();
                }
            }
            eww ewwVar = expVar.f20842f;
            if (ewwVar != null) {
                ewwVar.m7974e();
            }
            if (expVar.f20843g != null) {
                expVar.f20842f.m7974e();
            }
            exy exyVar = expVar.f20840d;
            eyk eykVar = exyVar.f20913g;
            if (eykVar != null) {
                eykVar.m7969d();
            }
            eyj eyjVar3 = exyVar.f20914h;
            if (eyjVar3 != null) {
                eyjVar3.m7969d();
            }
            exb exbVar = exyVar.f20911e;
            if (exbVar != null) {
                exbVar.m7974e();
            }
            exb exbVar2 = exyVar.f20912f;
            if (exbVar2 != null) {
                exbVar2.m7974e();
            }
            expVar.f20838b.m8024b();
            this.f22807b.f22886q = null;
            this.f22806a.mo14894e(null);
        }
    }
}
