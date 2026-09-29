package coil.network;

import p000.j88;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpException extends RuntimeException {
    public HttpException(j88 j88Var) {
        super("HTTP " + j88Var.f45204d + ": " + j88Var.f45203c);
    }
}
