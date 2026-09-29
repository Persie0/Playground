package com.iterable.iterableapi;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p000.eh0;
import p000.fa4;
import p000.gz8;
import p000.hc4;

/* JADX INFO: renamed from: com.iterable.iterableapi.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1213i {

    /* JADX INFO: renamed from: d */
    public static final ExecutorService f14045d = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f14046a;

    /* JADX INFO: renamed from: b */
    public final C1207c f14047b;

    /* JADX INFO: renamed from: c */
    public boolean f14048c;

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public C1213i(Context context, boolean z) {
        boolean z2;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.iterable.iterableapi", 0);
        sharedPreferences.getClass();
        this.f14046a = sharedPreferences;
        if (z) {
            z2 = sharedPreferences.getBoolean("iterable-encryption-enabled", true);
        }
        this.f14048c = z2;
        if (!z2) {
            eh0.m11120Q("IterableKeychain", "SharedPreferences being used without encryption");
            return;
        }
        try {
            C1207c c1207c = new C1207c();
            if (!gz8.m12973e().containsAlias("iterable_encryption_key")) {
                try {
                    if (!fa4.m11650l(gz8.m12973e().getType(), "AndroidKeyStore") || C1207c.m6900a() == null) {
                        C1207c.m6901b();
                    }
                } catch (Exception e) {
                    eh0.m11136q("IterableDataEncryptor", "Failed to generate key", e);
                    throw e;
                }
            }
            this.f14047b = c1207c;
            eh0.m11120Q("IterableKeychain", "SharedPreferences being used with encryption");
            try {
                C1215k c1215k = new C1215k(context, sharedPreferences, this);
                if (sharedPreferences.getBoolean("iterable-encrypted-migration-completed", false)) {
                    return;
                }
                c1215k.f14053d = new IterableKeychain$1(this);
                c1215k.m6944a();
                eh0.m11120Q("IterableKeychain", "Migration completed");
            } catch (Exception e2) {
                eh0.m11122S("IterableKeychain", "Migration failed, clearing data", e2);
                m6941a();
            }
        } catch (Exception e3) {
            eh0.m11136q("IterableKeychain", "Failed to initialize encryption, falling back to plain text", e3);
            m6941a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6941a() {
        eh0.m11121R("IterableKeychain", "Decryption failed, permanently disabling encryption for this device. Please login again.");
        this.f14046a.edit().remove("iterable-email").remove("iterable-user-id").remove("iterable-unknown-user-id").remove("iterable-auth-token").putBoolean("iterable-encryption-enabled", false).apply();
        this.f14048c = false;
    }

    /* JADX INFO: renamed from: b */
    public final String m6942b(String str) {
        String strConcat = str.concat("_plaintext");
        SharedPreferences sharedPreferences = this.f14046a;
        int i = 0;
        boolean z = sharedPreferences.getBoolean(strConcat, false);
        if (this.f14048c) {
            if (z) {
                return sharedPreferences.getString(str, null);
            }
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    C1207c c1207c = this.f14047b;
                    if (c1207c != null) {
                        return (String) f14045d.submit(new hc4(c1207c, string, i)).get(500L, TimeUnit.MILLISECONDS);
                    }
                } catch (Exception unused) {
                    m6941a();
                    return null;
                }
            }
        } else if (z) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m6943c(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f14046a.edit();
        if (str2 == null) {
            editorEdit.remove(str).remove(str.concat("_plaintext")).apply();
            return;
        }
        int i = 1;
        if (!this.f14048c) {
            editorEdit.putString(str, str2).putBoolean(str.concat("_plaintext"), true).apply();
            return;
        }
        try {
            C1207c c1207c = this.f14047b;
            if (c1207c != null) {
                editorEdit.putString(str, (String) f14045d.submit(new hc4(c1207c, str2, i)).get(500L, TimeUnit.MILLISECONDS)).remove(str.concat("_plaintext")).apply();
            }
        } catch (Exception unused) {
            m6941a();
            editorEdit.putString(str, str2).putBoolean(str.concat("_plaintext"), true).apply();
        }
    }
}
