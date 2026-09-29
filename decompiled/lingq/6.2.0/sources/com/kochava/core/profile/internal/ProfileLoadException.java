package com.kochava.core.profile.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ProfileLoadException extends RuntimeException {
    public ProfileLoadException(String str) {
        super(str);
    }

    public ProfileLoadException(InterruptedException interruptedException) {
        super(interruptedException);
    }
}
