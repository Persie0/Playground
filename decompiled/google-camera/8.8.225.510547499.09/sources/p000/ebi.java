package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebi implements edh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ egl f13218a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ edz f13219b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ebn f13220c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ewq f13221d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ glk f13222e;

    public ebi(ewq ewqVar, egl eglVar, glk glkVar, edz edzVar, ebn ebnVar, byte[] bArr, byte[] bArr2) {
        this.f13221d = ewqVar;
        this.f13218a = eglVar;
        this.f13222e = glkVar;
        this.f13219b = edzVar;
        this.f13220c = ebnVar;
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kbz] */
    @Override // p000.edh
    /* JADX INFO: renamed from: a */
    public final void mo7055a(eem eemVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        this.f13221d.f20674h.mo13961e("RgbCallback");
        if (((cwd) this.f13221d.f20679m).m5652K() && this.f13218a == egl.ZOOM) {
            this.f13221d.f20673g.mo13940b("Sending primary RGB for fusion processing.");
            edy edyVarMo7185d = ((edw) ((cwd) this.f13221d.f20679m).m5651J()).mo7185d(this.f13222e, egl.ZOOM);
            edyVarMo7185d.mo7187c(interleavedImageU8, new PortraitRequest(), shotMetadata, kxk.m14963I(), new jvb());
            edyVarMo7185d.close();
            return;
        }
        edz edzVar = this.f13219b;
        edzVar.f13533a = interleavedImageU8;
        edzVar.m7195f(shotMetadata);
        this.f13221d.m7954c(this.f13220c, edzVar.m7190a());
        this.f13221d.f20674h.mo13962f();
    }
}
