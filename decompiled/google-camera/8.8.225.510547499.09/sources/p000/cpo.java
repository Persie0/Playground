package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpo implements crf {

    /* JADX INFO: renamed from: a */
    private final crh f8646a;

    /* JADX INFO: renamed from: b */
    private final ohb f8647b;

    /* JADX INFO: renamed from: c */
    private final ohb f8648c;

    public cpo(ohb ohbVar, ohb ohbVar2, crh crhVar) {
        this.f8646a = crhVar;
        this.f8647b = ohbVar;
        this.f8648c = ohbVar2;
    }

    /* JADX INFO: renamed from: c */
    private final crf m5252c() {
        return this.f8646a.mo5395a() == ikw.VIDEO_INTENT ? (crf) this.f8647b.get() : (crf) this.f8648c.get();
    }

    @Override // p000.crf
    /* JADX INFO: renamed from: a */
    public final void mo5253a() {
        m5252c().mo5253a();
    }

    @Override // p000.crf
    /* JADX INFO: renamed from: b */
    public final void mo5254b(Bitmap bitmap) {
        m5252c().mo5254b(bitmap);
    }
}
