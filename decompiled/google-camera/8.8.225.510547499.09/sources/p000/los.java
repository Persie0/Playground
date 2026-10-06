package p000;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class los implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f38845a;

    /* JADX INFO: renamed from: b */
    private final oju f38846b;

    /* JADX INFO: renamed from: c */
    private final oju f38847c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f38848d;

    public los(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f38848d = i;
        this.f38845a = ojuVar;
        this.f38846b = ojuVar2;
        this.f38847c = ojuVar3;
    }

    public los(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f38848d = i;
        this.f38847c = ojuVar;
        this.f38845a = ojuVar2;
        this.f38846b = ojuVar3;
    }

    public los(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f38848d = i;
        this.f38846b = ojuVar;
        this.f38847c = ojuVar2;
        this.f38845a = ojuVar3;
    }

    public los(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f38848d = i;
        this.f38847c = ojuVar;
        this.f38846b = ojuVar2;
        this.f38845a = ojuVar3;
    }

    public los(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f38848d = i;
        this.f38846b = ojuVar;
        this.f38847c = ojuVar2;
        this.f38845a = ojuVar3;
    }

    public los(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f38848d = i;
        this.f38847c = ojuVar;
        this.f38846b = ojuVar2;
        this.f38845a = ojuVar3;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f38848d) {
            case 0:
                return new lor(((dws) this.f38845a).m6830a(), (mrm) ((ohj) this.f38846b).f46012a, ((lop) this.f38847c).get(), new ClearcutMetricSnapshotTransmitter());
            case 1:
                return new lnw((Random) this.f38847c.get(), (lnm) this.f38845a.get(), (ksi) this.f38846b.get());
            case 2:
                oqo oqoVar = (oqo) this.f38846b.get();
                lyz lyzVar = (lyz) this.f38847c.get();
                lqi lqiVar = (lqi) this.f38845a.get();
                oqoVar.getClass();
                lyzVar.getClass();
                lqiVar.getClass();
                return new lqi();
            case 3:
                mrm mrmVar = (mrm) ((ohj) this.f38846b).f46012a;
                mrm mrmVar2 = (mrm) ((ohj) this.f38847c).f46012a;
                Context applicationContext = ((Context) mrmVar.mo16807a(mrmVar2).mo16807a(((etl) this.f38845a).m7866a()).mo16809c()).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            case 4:
                return new mbr(ohh.m18485a(this.f38847c), (mav) this.f38846b.get(), (ksi) this.f38845a.get());
            default:
                return new mms((mmx) this.f38847c.get(), (mng) this.f38846b.get(), ((dws) this.f38845a).m6830a());
        }
    }
}
