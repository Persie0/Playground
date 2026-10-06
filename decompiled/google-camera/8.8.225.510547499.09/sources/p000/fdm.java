package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21451a;

    /* JADX INFO: renamed from: b */
    private final oju f21452b;

    /* JADX INFO: renamed from: c */
    private final oju f21453c;

    /* JADX INFO: renamed from: d */
    private final oju f21454d;

    public fdm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f21451a = ojuVar;
        this.f21452b = ojuVar2;
        this.f21453c = ojuVar3;
        this.f21454d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fdl get() {
        fdl fdlVar = new fdl(((dws) this.f21451a).m6830a(), (jvd) this.f21452b.get(), (nps) this.f21453c.get(), (hsk) this.f21454d.get());
        fdlVar.f21443b.add(fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_capture_text_1), 4000, 10));
        fdlVar.f21443b.add(fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_capture_text_2), 4000, 10));
        fdlVar.f21445d = fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_capture_text_3), 4000, 10);
        fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_stable_text), -1, 8);
        fdlVar.f21446e = fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_capturing_first), -1, 10);
        fdlVar.f21444c = fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_almost_stable_text), -1, 8);
        fdlVar.f21447f = fdlVar.m11106h(fdlVar.f30404h.getString(C0100R.string.cuttlefish_zoom_advice_text), -1, 8);
        return fdlVar;
    }
}
