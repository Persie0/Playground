package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f38723a;

    /* JADX INFO: renamed from: b */
    private final oju f38724b;

    /* JADX INFO: renamed from: c */
    private final oju f38725c;

    /* JADX INFO: renamed from: d */
    private final oju f38726d;

    /* JADX INFO: renamed from: e */
    private final oju f38727e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f38728f;

    public lmz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i) {
        this.f38728f = i;
        this.f38723a = ojuVar;
        this.f38724b = ojuVar2;
        this.f38725c = ojuVar3;
        this.f38726d = ojuVar4;
        this.f38727e = ojuVar5;
    }

    public lmz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr) {
        this.f38728f = i;
        this.f38725c = ojuVar;
        this.f38726d = ojuVar2;
        this.f38727e = ojuVar3;
        this.f38723a = ojuVar4;
        this.f38724b = ojuVar5;
    }

    public lmz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr) {
        this.f38728f = i;
        this.f38724b = ojuVar;
        this.f38725c = ojuVar2;
        this.f38726d = ojuVar3;
        this.f38727e = ojuVar4;
        this.f38723a = ojuVar5;
    }

    public lmz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[] sArr) {
        this.f38728f = i;
        this.f38724b = ojuVar;
        this.f38727e = ojuVar2;
        this.f38726d = ojuVar3;
        this.f38723a = ojuVar4;
        this.f38725c = ojuVar5;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f38728f) {
            case 0:
                ((etl) this.f38723a).m7866a();
                return mxk.m17136H((((mrm) ((ohj) this.f38724b).f46012a).mo16813g() && ((dra) this.f38725c).m6617a().mo16813g()) ? (ljh) this.f38727e.get() : (ljh) this.f38726d.get());
            case 1:
                return new lml(((ljg) this.f38723a).get(), (npv) this.f38724b.get(), (Executor) this.f38725c.get(), ohh.m18485a(this.f38726d), this.f38727e);
            case 2:
                ljf ljfVar = ((ljg) this.f38725c).get();
                return new lnd(ljfVar, ohh.m18485a(this.f38727e), this.f38723a, ((lnp) this.f38724b).get(), null);
            case 3:
                return new mao((oqo) this.f38724b.get(), (Context) this.f38725c.get(), (ksi) this.f38726d.get(), (mas) this.f38727e.get(), (mav) this.f38723a.get());
            default:
                return new drj((mav) this.f38724b.get(), (lzv) this.f38727e.get(), (AmbientMode.AmbientController) this.f38726d.get(), (lzd) this.f38723a.get(), (ksi) this.f38725c.get(), null, null, null, null, null);
        }
    }
}
