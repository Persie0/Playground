package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ezh implements heq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LinkChipResult f21037a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mrm f21038b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kwe f21039c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ezi f21040d;

    public ezh(ezi eziVar, LinkChipResult linkChipResult, mrm mrmVar, kwe kweVar) {
        this.f21040d = eziVar;
        this.f21037a = linkChipResult;
        this.f21038b = mrmVar;
        this.f21039c = kweVar;
    }

    @Override // p000.heq
    /* JADX INFO: renamed from: a */
    public final void mo5957a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f21040d.f21070z.m13541c(new cgg(this, bitmap, this.f21037a, this.f21038b, this.f21039c, 10));
        }
    }
}
