package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsk implements fsd {

    /* JADX INFO: renamed from: a */
    private final MediaFormat f23494a;

    /* JADX INFO: renamed from: b */
    private final lby f23495b;

    /* JADX INFO: renamed from: c */
    private final gvw f23496c;

    /* JADX INFO: renamed from: d */
    private final kmd f23497d;

    /* JADX INFO: renamed from: e */
    private fql f23498e = null;

    public fsk(MediaFormat mediaFormat, lby lbyVar, gvw gvwVar, kmd kmdVar) {
        this.f23494a = mediaFormat;
        this.f23495b = lbyVar;
        this.f23496c = gvwVar;
        this.f23497d = kmdVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m8781c() {
        this.f23494a.setInteger("color-format", 2130708361);
        try {
            MediaFormat mediaFormat = this.f23494a;
            lby lbyVar = this.f23495b;
            String string = mediaFormat.getString("mime");
            string.getClass();
            this.f23498e = new fqn(new fqn(new fqo(new AtomicInteger(0), new fqj(MediaCodec.createEncoderByType(string), mediaFormat, lbyVar, lea.m15230a(lbyVar))), 0), 1);
        } catch (IOException e) {
            throw new IllegalStateException("Could not create image encoder!", e);
        }
    }

    @Override // p000.fsd
    /* JADX INFO: renamed from: a */
    public final synchronized fqu mo8765a(kyt kytVar, kay kayVar) {
        fql fqlVar;
        if (this.f23498e == null) {
            m8781c();
        }
        fqlVar = this.f23498e;
        fqlVar.getClass();
        return new fqm(fqlVar, kytVar, this.f23496c.mo9812h(this.f23497d.mo14558k()) ? fsx.f23533d : fsx.f23532c, null, null, null, null);
    }

    @Override // p000.fsd
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8766b() {
        m8781c();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        fql fqlVar = this.f23498e;
        if (fqlVar != null) {
            fqlVar.close();
        }
        this.f23495b.close();
    }
}
