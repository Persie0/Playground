package p000;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebh implements edj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ edz f13215a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ebn f13216b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ewq f13217c;

    public ebh(ewq ewqVar, edz edzVar, ebn ebnVar, byte[] bArr) {
        this.f13217c = ewqVar;
        this.f13215a = edzVar;
        this.f13216b = ebnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kbz] */
    @Override // p000.edj
    /* JADX INFO: renamed from: a */
    public final void mo7054a(eem eemVar, YuvImage yuvImage, ShotMetadata shotMetadata) {
        this.f13217c.f20674h.mo13961e("YuvCallback");
        edz edzVar = this.f13215a;
        if (edzVar.f13541i == 0) {
            throw new IllegalStateException("Property \"timestampNs\" has not been set");
        }
        eev eevVar = new eev(yuvImage, edzVar.f13536d);
        edz edzVar2 = this.f13215a;
        edzVar2.f13534b = eevVar;
        edzVar2.m7195f(shotMetadata);
        edzVar2.f13540h = eemVar.m7219b();
        this.f13217c.m7954c(this.f13216b, edzVar2.m7190a());
        this.f13217c.f20674h.mo13962f();
    }
}
