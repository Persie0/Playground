package p000;

import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2576a = 0;

    static {
        ooj.m18762a(awd.class).mo18731b();
    }

    private awd() {
    }

    /* JADX INFO: renamed from: a */
    public static final int m2071a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError e) {
            return 0;
        } catch (UnsupportedOperationException e2) {
            return 0;
        }
    }
}
