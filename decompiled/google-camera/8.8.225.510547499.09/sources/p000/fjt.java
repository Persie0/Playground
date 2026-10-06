package p000;

import android.media.MediaFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjt implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22298a;

    /* JADX INFO: renamed from: b */
    private final oju f22299b;

    /* JADX INFO: renamed from: c */
    private final oju f22300c;

    public fjt(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f22298a = ojuVar;
        this.f22299b = ojuVar2;
        this.f22300c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static fjt m8497b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fjt(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediaFormat get() {
        dhv dhvVar = (dhv) this.f22298a.get();
        String str = ((fkb) this.f22299b).get();
        kbc kbcVar = (kbc) this.f22300c.get();
        boolean zMo6184l = dhvVar.mo6184l(dib.f11267aa);
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6177e();
        MediaFormat mediaFormatM8934h = fxo.m8934h(kbcVar, 12000000, 0.23333333f, str, zMo6184l, dhvVar.mo6184l(dii.f11546v));
        mediaFormatM8934h.getClass();
        return mediaFormatM8934h;
    }
}
