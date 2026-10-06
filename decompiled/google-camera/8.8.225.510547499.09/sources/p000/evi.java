package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evi implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f20399a;

    /* JADX INFO: renamed from: b */
    private final oju f20400b;

    /* JADX INFO: renamed from: c */
    private final oju f20401c;

    public evi(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f20399a = ojuVar;
        this.f20400b = ojuVar2;
        this.f20401c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evf get() {
        chk chkVar = (chk) this.f20399a.get();
        hwx hwxVar = (hwx) this.f20400b.get();
        return new evf(chkVar.mo3693g(), ((ciq) chkVar.mo3693g()).f5840f, (Executor) this.f20401c.get(), hwxVar);
    }
}
