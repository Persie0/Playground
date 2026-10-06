package p000;

import android.media.AudioFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class len {

    /* JADX INFO: renamed from: b */
    public final long f38062b;

    /* JADX INFO: renamed from: c */
    public final int f38063c;

    /* JADX INFO: renamed from: d */
    public final int f38064d;

    /* JADX INFO: renamed from: a */
    public final Object f38061a = new Object();

    /* JADX INFO: renamed from: e */
    public long f38065e = 0;

    public len(AudioFormat audioFormat) {
        this.f38062b = 1000000000 / ((long) audioFormat.getSampleRate());
        this.f38064d = audioFormat.getChannelCount();
        this.f38063c = m15256a(audioFormat);
    }

    /* JADX INFO: renamed from: a */
    public static int m15256a(AudioFormat audioFormat) {
        switch (audioFormat.getEncoding()) {
            case 1:
            case 2:
            case 13:
                return 2;
            case 3:
                return 1;
            case 4:
                return 4;
            default:
                throw new IllegalArgumentException("Bad audio format ".concat(String.valueOf(String.valueOf(audioFormat))));
        }
    }
}
