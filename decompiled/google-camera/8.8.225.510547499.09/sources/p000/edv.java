package p000;

import com.google.googlex.gcam.Gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13531a;

    public edv(oju ojuVar) {
        this.f13531a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static edv m7182a(oju ojuVar) {
        return new edv(ojuVar);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bko get() {
        return new bko((Gcam) this.f13531a.get());
    }
}
