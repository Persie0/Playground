package p000;

import com.google.p020vr.ndk.base.GvrApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofs {

    /* JADX INFO: renamed from: a */
    private final long f45875a;

    static {
        ofs.class.getSimpleName();
    }

    public ofs(long j) {
        this.f45875a = j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18469a(ofr ofrVar) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.f45875a, ofrVar.f45873c);
    }
}
