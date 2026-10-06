package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f11772a;

    /* JADX INFO: renamed from: b */
    private final oju f11773b;

    /* JADX INFO: renamed from: c */
    private final oju f11774c;

    public djf(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f11772a = ojuVar;
        this.f11773b = ojuVar2;
        this.f11774c = ojuVar3;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dje get() {
        return new dje((khb) this.f11772a.get(), (SharedPreferences) this.f11773b.get(), ((djc) this.f11774c).get(), dvb.m6761a(), null, null);
    }
}
