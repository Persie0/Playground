package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxa extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    nxa() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public nxa(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public nxa(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
