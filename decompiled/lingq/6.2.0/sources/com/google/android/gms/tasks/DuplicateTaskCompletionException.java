package com.google.android.gms.tasks;

import p000.tld;

/* JADX INFO: loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    /* JADX INFO: renamed from: a */
    public static IllegalStateException m5958a(tld tldVar) {
        String strConcat;
        if (!tldVar.mo5970l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excMo5966h = tldVar.mo5966h();
        if (excMo5966h != null) {
            strConcat = "failure";
        } else if (tldVar.mo5971m()) {
            strConcat = "result ".concat(String.valueOf(tldVar.mo5967i()));
        } else {
            strConcat = tldVar.f62493d ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excMo5966h);
    }
}
