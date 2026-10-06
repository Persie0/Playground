package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyp extends IOException {
    public jyp(int i, Throwable th) {
        super("Unable to create MediaMuxer with file path file descriptor and format " + i, th);
    }
}
