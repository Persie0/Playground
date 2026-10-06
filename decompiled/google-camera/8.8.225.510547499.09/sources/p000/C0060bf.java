package p000;

import android.content.Context;

/* JADX INFO: renamed from: bf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0060bf extends C0061bg {

    /* JADX INFO: renamed from: c */
    private final boolean f3078c;

    /* JADX INFO: renamed from: d */
    private boolean f3079d;

    /* JADX INFO: renamed from: e */
    private bck f3080e;

    public C0060bf(C0133dl c0133dl, exz exzVar, boolean z, byte[] bArr) {
        super(c0133dl, exzVar, null);
        this.f3079d = false;
        this.f3078c = z;
    }

    /* JADX INFO: renamed from: a */
    final bck m2288a(Context context) {
        if (this.f3079d) {
            return this.f3080e;
        }
        C0133dl c0133dl = this.f3152a;
        bck bckVarM5784f = C0121d.m5784f(context, c0133dl.f11915a, c0133dl.f11919e == 2, this.f3078c);
        this.f3080e = bckVarM5784f;
        this.f3079d = true;
        return bckVarM5784f;
    }
}
