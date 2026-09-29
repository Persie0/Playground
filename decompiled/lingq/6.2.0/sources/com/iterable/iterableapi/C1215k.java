package com.iterable.iterableapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme;
import androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme;
import androidx.security.crypto.MasterKey$KeyScheme;
import androidx.security.crypto.SharedPreferencesC0761c;
import androidx.security.crypto.SharedPreferencesEditorC0760b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.C3386nv;
import p000.eh0;
import p000.rq5;
import p000.sq5;
import p000.v63;
import p000.vi3;
import p000.vk9;

/* JADX INFO: renamed from: com.iterable.iterableapi.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1215k {

    /* JADX INFO: renamed from: a */
    public final Context f14050a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f14051b;

    /* JADX INFO: renamed from: c */
    public final C1213i f14052c;

    /* JADX INFO: renamed from: d */
    public vi3 f14053d;

    /* JADX INFO: renamed from: e */
    public final Object f14054e;

    public C1215k(Context context, SharedPreferences sharedPreferences, C1213i c1213i) {
        context.getClass();
        this.f14050a = context;
        this.f14051b = sharedPreferences;
        this.f14052c = c1213i;
        this.f14054e = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final void m6944a() {
        synchronized (this.f14054e) {
            String property = System.getProperty("java.vendor");
            if (property == null || !vk9.m23380c0(property, "Android", false)) {
                eh0.m11120Q("IterableKeychainMigrator", "Running in JVM, skipping migration of encrypted shared preferences");
                m6945b();
                vi3 vi3Var = this.f14053d;
                if (vi3Var != null) {
                    ((IterableKeychain$1) vi3Var).invoke(null);
                }
                return;
            }
            if (this.f14051b.getBoolean("iterable-encrypted-migration-completed", false)) {
                eh0.m11120Q("IterableKeychainMigrator", "Migration was already completed, skipping");
                vi3 vi3Var2 = this.f14053d;
                if (vi3Var2 != null) {
                    ((IterableKeychain$1) vi3Var2).invoke(null);
                }
                return;
            }
            if (this.f14051b.getBoolean("iterable-encrypted-migration-started", false)) {
                eh0.m11121R("IterableKeychainMigrator", "Previous migration attempt was interrupted");
                m6945b();
                IterableKeychainEncryptedDataMigrator$MigrationException iterableKeychainEncryptedDataMigrator$MigrationException = new IterableKeychainEncryptedDataMigrator$MigrationException("Previous migration attempt was interrupted");
                vi3 vi3Var3 = this.f14053d;
                if (vi3Var3 != null) {
                    ((IterableKeychain$1) vi3Var3).invoke(iterableKeychainEncryptedDataMigrator$MigrationException);
                }
                return;
            }
            this.f14051b.edit().putBoolean("iterable-encrypted-migration-started", true).apply();
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            try {
                Future<?> futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Runnable() { // from class: com.iterable.iterableapi.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedPreferencesC0761c sharedPreferencesC0761cM2865a;
                        C1215k c1215k = this.f14049a;
                        Context context = c1215k.f14050a;
                        try {
                            sq5 sq5Var = new sq5(context);
                            MasterKey$KeyScheme masterKey$KeyScheme = MasterKey$KeyScheme.AES256_GCM;
                            if (rq5.f59719a[masterKey$KeyScheme.ordinal()] != 1) {
                                v63.m23142t(masterKey$KeyScheme, "Unsupported scheme: ");
                            } else if (((KeyGenParameterSpec) sq5Var.f61249c) == null) {
                                sq5Var.f61250d = masterKey$KeyScheme;
                            } else {
                                C3386nv.m17626m("KeyScheme set after setting a KeyGenParamSpec");
                            }
                            sharedPreferencesC0761cM2865a = SharedPreferencesC0761c.m2865a(context, sq5Var.m21562c(), EncryptedSharedPreferences$PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences$PrefValueEncryptionScheme.AES256_GCM);
                        } catch (Exception unused) {
                            sharedPreferencesC0761cM2865a = null;
                        }
                        if (sharedPreferencesC0761cM2865a == null) {
                            c1215k.m6945b();
                            IterableKeychainEncryptedDataMigrator$MigrationException iterableKeychainEncryptedDataMigrator$MigrationException2 = new IterableKeychainEncryptedDataMigrator$MigrationException("Failed to load EncryptedSharedPreferences");
                            vi3 vi3Var4 = c1215k.f14053d;
                            if (vi3Var4 != null) {
                                ((IterableKeychain$1) vi3Var4).invoke(iterableKeychainEncryptedDataMigrator$MigrationException2);
                                return;
                            }
                            return;
                        }
                        C1213i c1213i = c1215k.f14052c;
                        SharedPreferences.Editor editorEdit = sharedPreferencesC0761cM2865a.edit();
                        String string = sharedPreferencesC0761cM2865a.getString("iterable-email", null);
                        if (string != null) {
                            c1213i.m6943c("iterable-email", string);
                            ((SharedPreferencesEditorC0760b) editorEdit).remove("iterable-email");
                            eh0.m11133m("IterableKeychainMigrator", "Email migrated: ".concat(string));
                        } else {
                            eh0.m11133m("IterableKeychainMigrator", "No email found to migrate.");
                        }
                        String string2 = sharedPreferencesC0761cM2865a.getString("iterable-user-id", null);
                        if (string2 != null) {
                            c1213i.m6943c("iterable-user-id", string2);
                            ((SharedPreferencesEditorC0760b) editorEdit).remove("iterable-user-id");
                            eh0.m11133m("IterableKeychainMigrator", "User ID migrated: ".concat(string2));
                        } else {
                            eh0.m11121R("IterableKeychainMigrator", "No user ID found to migrate.");
                        }
                        String string3 = sharedPreferencesC0761cM2865a.getString("iterable-auth-token", null);
                        if (string3 != null) {
                            c1213i.m6943c("iterable-auth-token", string3);
                            ((SharedPreferencesEditorC0760b) editorEdit).remove("iterable-auth-token");
                            eh0.m11133m("IterableKeychainMigrator", "Auth token migrated: ".concat(string3));
                        } else {
                            eh0.m11133m("IterableKeychainMigrator", "No auth token found to migrate.");
                        }
                        ((SharedPreferencesEditorC0760b) editorEdit).apply();
                        c1215k.m6945b();
                        vi3 vi3Var5 = c1215k.f14053d;
                        if (vi3Var5 != null) {
                            ((IterableKeychain$1) vi3Var5).invoke(null);
                        }
                    }
                });
                futureSubmit.getClass();
                try {
                    try {
                        futureSubmit.get(5000L, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        eh0.m11121R("IterableKeychainMigrator", "Migration timed out after 5000ms");
                        futureSubmit.cancel(true);
                        if (!this.f14051b.getBoolean("iterable-encrypted-migration-completed", false)) {
                            m6945b();
                            vi3 vi3Var4 = this.f14053d;
                            if (vi3Var4 != null) {
                                ((IterableKeychain$1) vi3Var4).invoke(new IterableKeychainEncryptedDataMigrator$MigrationException("Migration timed out"));
                            }
                        }
                    }
                } catch (Exception e) {
                    eh0.m11122S("IterableKeychainMigrator", "Migration failed", e);
                    m6945b();
                    vi3 vi3Var5 = this.f14053d;
                    if (vi3Var5 != null) {
                        ((IterableKeychain$1) vi3Var5).invoke(new IterableKeychainEncryptedDataMigrator$MigrationException("Migration failed", e));
                    }
                }
                executorServiceNewSingleThreadExecutor.shutdown();
            } catch (Throwable th) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6945b() {
        this.f14051b.edit().putBoolean("iterable-encrypted-migration-started", false).putBoolean("iterable-encrypted-migration-completed", true).apply();
    }
}
