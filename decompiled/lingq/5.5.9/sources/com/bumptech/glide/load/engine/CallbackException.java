package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class CallbackException extends RuntimeException {
    public CallbackException(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
