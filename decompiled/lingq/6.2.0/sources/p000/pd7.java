package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class pd7 implements v76 {
    public static final od7 Companion = new od7();

    /* JADX INFO: renamed from: a */
    public final String f55974a;

    public pd7(String str) {
        this.f55974a = str;
    }

    public static final pd7 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(pd7.class.getClassLoader());
        if (bundle.containsKey("playlistLanguageFromDeeplink")) {
            string = bundle.getString("playlistLanguageFromDeeplink");
            if (string == null) {
                C3386nv.m17626m("Argument \"playlistLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new pd7(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd7) && this.f55974a.equals(((pd7) obj).f55974a);
    }

    public final int hashCode() {
        return this.f55974a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("PlaylistFragmentArgs(playlistLanguageFromDeeplink=", this.f55974a, ")");
    }
}
