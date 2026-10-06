package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwj extends ContextWrapper implements ClientContextProvider {

    /* JADX INFO: renamed from: a */
    private final Context f37511a;

    public kwj(Context context, Context context2) {
        super(context);
        this.f37511a = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        return this.f37511a.deleteSharedPreferences(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return this.f37511a.getCacheDir();
    }

    @Override // com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider
    public final Context getClientContext() {
        return this.f37511a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        return this.f37511a.getDir(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return this.f37511a.getFilesDir();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        return this.f37511a.getSharedPreferences(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveSharedPreferencesFrom(Context context, String str) {
        return this.f37511a.moveSharedPreferencesFrom(context, str);
    }
}
