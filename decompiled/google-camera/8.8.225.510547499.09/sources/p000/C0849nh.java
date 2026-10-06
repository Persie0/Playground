package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* JADX INFO: renamed from: nh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0849nh extends ContextWrapper {
    /* JADX INFO: renamed from: a */
    public static void m17473a(Context context) {
        if ((context instanceof C0849nh) || (context.getResources() instanceof C0851nj)) {
            return;
        }
        context.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        throw null;
    }
}
