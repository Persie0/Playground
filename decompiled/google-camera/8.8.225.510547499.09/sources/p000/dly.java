package p000;

import java.util.concurrent.Executor;
import p021j$.time.Clock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dly implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12004a;

    /* JADX INFO: renamed from: b */
    private final oju f12005b;

    /* JADX INFO: renamed from: c */
    private final oju f12006c;

    /* JADX INFO: renamed from: d */
    private final oju f12007d;

    public dly(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f12004a = ojuVar;
        this.f12005b = ojuVar2;
        this.f12006c = ojuVar3;
        this.f12007d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dlx get() {
        ((dws) this.f12004a).m6830a();
        npv npvVarM5875b = dbk.m5875b();
        Executor executorM5874a = dbk.m5874a();
        Clock clockM5876c = dbk.m5876c();
        ((cde) this.f12005b).m3490a().booleanValue();
        return new dlx(npvVarM5875b, executorM5874a, clockM5876c, ((kbm) this.f12006c).get(), this.f12007d);
    }
}
