package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class iox extends ios {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ioy f31657b;

    public iox(ioy ioyVar) {
        this.f31657b = ioyVar;
    }

    @Override // p000.ios
    /* JADX INFO: renamed from: cg */
    public void mo11569cg() {
        ioy ioyVar = this.f31657b;
        ioyVar.f31658d.mo11573a(ioyVar.f31659e.getDuration());
        ioy ioyVar2 = this.f31657b;
        ioyVar2.f31659e.seekTo(ioyVar2.f31663i);
        ioy ioyVar3 = this.f31657b;
        ioyVar3.f31658d.mo11574b(ioyVar3.f31663i);
        this.f31657b.f31660f.mo11559a();
    }

    @Override // p000.ios, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        ioy ioyVar = this.f31657b;
        Uri uri = ioyVar.f31662h;
        if (uri != null) {
            ioyVar.f31659e.setVideoURI(uri);
        }
        this.f31657b.f31659e.setOnCompletionListener(new iov(this, 0));
        this.f31657b.f31659e.setOnPreparedListener(new iow(this, 0));
    }

    @Override // p000.ios
    /* JADX INFO: renamed from: i */
    public void mo11570i() {
        ioy ioyVar = this.f31657b;
        ioyVar.f31658d.mo11573a(ioyVar.f31659e.getDuration());
        ioy ioyVar2 = this.f31657b;
        ioyVar2.f31659e.seekTo(ioyVar2.f31663i);
        ioy ioyVar3 = this.f31657b;
        ioyVar3.f31658d.mo11574b(ioyVar3.f31663i);
        this.f31657b.f31660f.mo11560b();
    }
}
