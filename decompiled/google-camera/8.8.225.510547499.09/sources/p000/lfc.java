package p000;

import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfc {

    /* JADX INFO: renamed from: a */
    public final Object f38111a;

    /* JADX INFO: renamed from: b */
    public mrf f38112b;

    /* JADX INFO: renamed from: c */
    public Handler f38113c;

    /* JADX INFO: renamed from: d */
    public boolean f38114d;

    /* JADX INFO: renamed from: e */
    public Surface f38115e;

    /* JADX INFO: renamed from: f */
    public boolean f38116f;

    /* JADX INFO: renamed from: g */
    private final MediaFormat f38117g;

    /* JADX INFO: renamed from: h */
    private final lfk f38118h;

    /* JADX INFO: renamed from: i */
    private nax f38119i;

    public lfc(MediaFormat mediaFormat, lfk lfkVar) {
        this.f38111a = new Object();
        this.f38112b = mrh.INSTANCE;
        this.f38116f = false;
        this.f38117g = mediaFormat;
        this.f38113c = null;
        this.f38118h = lfkVar;
        this.f38119i = new nax(lfg.f38122c);
        this.f38114d = false;
        this.f38115e = null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lfg] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, lfg] */
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ lew m15278a() {
        Object objApply;
        try {
            synchronized (this.f38111a) {
                mrf mrfVar = this.f38112b;
                try {
                    nax naxVar = this.f38119i;
                    lfk lfkVar = this.f38118h;
                    naxVar.f41919a = new lfd(naxVar.f41919a, lfkVar);
                    objApply = mrfVar.apply(new lev(this.f38117g, lfkVar, naxVar.f41919a, this.f38113c, this.f38114d, this.f38115e, this.f38116f));
                } catch (Throwable th) {
                    throw new IllegalStateException("Could not build track encoder", th);
                }
            }
            return (lew) objApply;
        } catch (Throwable th2) {
            throw new IllegalStateException("Could not build instance.", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15279b(lfg lfgVar) {
        this.f38119i = new nax(lfgVar);
    }

    public lfc() {
        this.f38111a = new Object();
        mrh mrhVar = mrh.INSTANCE;
        throw null;
    }
}
