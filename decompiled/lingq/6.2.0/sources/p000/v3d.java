package p000;

import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v3d {
    /* JADX INFO: renamed from: a */
    public static void m23091a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a()).edit();
        editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public static mc0 m23092b() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new mc0(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), 2, defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* JADX INFO: renamed from: c */
    public static void m23093c(AudioAttributes.Builder builder) {
        builder.setIsContentSpatialized(false);
    }

    /* JADX INFO: renamed from: d */
    public static void m23094d(AudioAttributes.Builder builder) {
        builder.setSpatializationBehavior(0);
    }
}
