package com.kochava.core.profile.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileLoadException extends RuntimeException {
    public ProfileLoadException(InterruptedException interruptedException) {
        super(interruptedException);
    }

    public ProfileLoadException(String str) {
        super(str);
    }
}
