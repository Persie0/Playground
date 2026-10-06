package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.EnumMap;
import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hry implements hrx, hsh {

    /* JADX INFO: renamed from: a */
    private final hsd f29374a;

    /* JADX INFO: renamed from: b */
    private final EnumMap f29375b = new EnumMap(hrw.class);

    /* JADX INFO: renamed from: c */
    private hrw f29376c = hrw.NONE;

    public hry(hsd hsdVar) {
        this.f29374a = hsdVar;
    }

    /* JADX INFO: renamed from: l */
    private final void m10675l() {
        EnumMap enumMap = new EnumMap(hrw.class);
        synchronized (this) {
            enumMap.putAll(this.f29375b);
            this.f29376c = hrw.NONE;
        }
        Map.EL.forEach(enumMap, gnv.f25811d);
    }

    @Override // p000.hrx
    /* JADX INFO: renamed from: a */
    public final jwn mo10669a(PointF pointF, hrw hrwVar) {
        synchronized (this) {
            hrw hrwVar2 = this.f29376c;
            if (hrwVar2 != hrwVar && hrwVar2 != hrw.NONE) {
                return jwr.m13637g(hsg.m10693b());
            }
            this.f29374a.mo10662h();
            jwn jwnVarB = this.f29374a.mo10657b(pointF);
            this.f29374a.mo10659e(this);
            return jwnVarB;
        }
    }

    @Override // p000.hrx
    /* JADX INFO: renamed from: b */
    public final synchronized void mo10670b(hrw hrwVar, hrv hrvVar) {
        this.f29375b.put(hrwVar, hrvVar);
    }

    @Override // p000.hrx
    /* JADX INFO: renamed from: c */
    public final void mo10671c(hrw hrwVar) {
        synchronized (this) {
            if (this.f29376c != hrwVar) {
                return;
            }
            m10675l();
        }
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: d */
    public final kba mo10658d(mrm mrmVar, mrm mrmVar2) {
        return this.f29374a.mo10658d(mrmVar, mrmVar2);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: e */
    public final void mo10659e(hsh hshVar) {
        this.f29374a.mo10659e(hshVar);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: f */
    public final void mo10660f(kpw kpwVar) {
        this.f29374a.mo10660f(kpwVar);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: g */
    public final void mo10661g(hsh hshVar) {
        this.f29374a.mo10661g(hshVar);
    }

    @Override // p000.hrx
    /* JADX INFO: renamed from: h */
    public final synchronized void mo10672h(hrw hrwVar) {
        this.f29375b.remove(hrwVar);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: i */
    public final boolean mo10663i() {
        return this.f29374a.mo10663i();
    }

    @Override // p000.hrx
    /* JADX INFO: renamed from: j */
    public final void mo10673j(hrw hrwVar) {
        synchronized (this) {
            if (this.f29376c != hrwVar) {
                return;
            }
            this.f29374a.mo10662h();
        }
    }

    @Override // p000.hrx
    /* JADX INFO: renamed from: k */
    public final boolean mo10674k(hrw hrwVar) {
        EnumMap enumMap = new EnumMap(hrw.class);
        synchronized (this) {
            hrw hrwVar2 = this.f29376c;
            boolean z = true;
            if (hrwVar == hrwVar2) {
                this.f29374a.mo10661g(this);
                return true;
            }
            if ((!hrwVar2.equals(hrw.QR_GLEAMING) || !hrwVar.equals(hrw.TAXI)) && ((this.f29376c.equals(hrw.TAXI) && hrwVar.equals(hrw.QR_GLEAMING)) || hrwVar.f29373f < this.f29376c.f29373f)) {
                this.f29376c = hrwVar;
                this.f29374a.mo10661g(this);
                enumMap.putAll(this.f29375b);
            }
            if (this.f29376c != hrwVar) {
                z = false;
            }
            Map.EL.forEach(enumMap, new dan(hrwVar, 6));
            return z;
        }
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: s */
    public final void mo3966s() {
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: t */
    public final void mo3967t() {
        m10675l();
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: u */
    public final void mo3968u(RectF rectF, float f, hsa hsaVar) {
    }
}
