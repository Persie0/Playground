package p000;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mko extends acl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mkp f40848a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ bzm f40849b;

    public mko(mkp mkpVar, bzm bzmVar, byte[] bArr) {
        this.f40848a = mkpVar;
        this.f40849b = bzmVar;
    }

    @Override // p000.acl
    /* JADX INFO: renamed from: a */
    public final void mo198a(Typeface typeface) {
        mkp mkpVar = this.f40848a;
        mkpVar.f40860k = Typeface.create(typeface, mkpVar.f40852c);
        this.f40848a.f40862m = true;
        this.f40849b.m3222e(this.f40848a.f40860k);
    }

    @Override // p000.acl
    /* JADX INFO: renamed from: b */
    public final void mo199b() {
        this.f40848a.f40862m = true;
        this.f40849b.m3223f();
    }
}
