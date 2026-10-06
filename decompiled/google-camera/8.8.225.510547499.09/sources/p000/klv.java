package p000;

import android.media.ImageReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klv implements kpx {

    /* JADX INFO: renamed from: a */
    public final Object f36502a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f36503b;

    public klv(goa goaVar, int i) {
        this.f36503b = i;
        this.f36502a = goaVar;
    }

    public klv(kpa kpaVar, int i) {
        this.f36503b = i;
        this.f36502a = kpaVar;
    }

    public klv(kpx kpxVar, int i) {
        this.f36503b = i;
        this.f36502a = kpxVar;
    }

    /* JADX INFO: renamed from: c */
    private static final kpz m14515c(kpz kpzVar) {
        return new kmz(new knc(new kmb(kpzVar)));
    }

    @Override // p000.kpx
    /* JADX INFO: renamed from: a */
    public final kpz mo9570a(int i, int i2, int i3, int i4) {
        switch (this.f36503b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                Object obj = this.f36502a;
                ImageReader imageReaderNewInstance = ImageReader.newInstance(i, i2, i3, i4);
                boolean z = ((kpa) ((klv) obj).f36502a).f36759b;
                return m14515c(new klu(imageReaderNewInstance));
        }
    }

    @Override // p000.kpx
    /* JADX INFO: renamed from: b */
    public final kpz mo9571b(int i, int i2, int i3, int i4, long j) {
        switch (this.f36503b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                lku.m15614I(true, "Usage flags are not available on Android P or lower.");
                return m14515c(new klu(ImageReader.newInstance(i, i2, i3, i4, j)));
        }
    }
}
