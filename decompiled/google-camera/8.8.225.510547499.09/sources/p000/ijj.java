package p000;

import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijj implements iji {

    /* JADX INFO: renamed from: a */
    private final String f31173a;

    public ijj(String str) {
        this.f31173a = str;
    }

    @Override // p000.iji
    /* JADX INFO: renamed from: a */
    public final void mo11399a(String str) {
        Trace.beginSection(this.f31173a + ":" + str);
    }

    @Override // p000.iji
    /* JADX INFO: renamed from: b */
    public final void mo11400b() {
        Trace.endSection();
    }
}
