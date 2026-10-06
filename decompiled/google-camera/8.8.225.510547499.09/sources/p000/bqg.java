package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqg extends IOException {
    private static final long serialVersionUID = 1;

    public bqg(String str, int i) {
        this(str, i, null);
    }

    public bqg(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
