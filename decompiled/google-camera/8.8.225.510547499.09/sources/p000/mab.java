package p000;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mab implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Set f39699a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lwh f39700b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f39701c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ maj f39702d;

    public mab(maj majVar, Set set, lwh lwhVar, long j) {
        this.f39702d = majVar;
        this.f39699a = set;
        this.f39700b = lwhVar;
        this.f39701c = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        StringBuilder sbM451l = afc.m451l();
        sbM451l.append("\n      UPDATE AnnotachmentEntity SET status_uploadState = ?\n      WHERE resourceOnDeviceId = ? AND isAttachment IN (");
        afc.m452m(sbM451l, this.f39699a.size());
        sbM451l.append(")\n    ");
        arf arfVarM1832t = this.f39702d.f39706a.m1832t(sbM451l.toString());
        arfVarM1832t.mo1845e(1, lyy.m16206w(this.f39700b));
        arfVarM1832t.mo1845e(2, this.f39701c);
        Iterator it = this.f39699a.iterator();
        int i = 3;
        while (it.hasNext()) {
            arfVarM1832t.mo1845e(i, lyy.m16191h((lvl) it.next()));
            i++;
        }
        this.f39702d.f39706a.m1825m();
        try {
            Integer numValueOf = Integer.valueOf(arfVarM1832t.m1883a());
            this.f39702d.f39706a.m1829q();
            return numValueOf;
        } finally {
            this.f39702d.f39706a.m1827o();
        }
    }
}
