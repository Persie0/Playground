package p358r7;

import android.content.SharedPreferences;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import java.util.HashMap;
import p067d8.C5078r;
import p291o7.C8004n;

/* JADX INFO: renamed from: r7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8744b {

    /* JADX INFO: renamed from: a */
    public static final C8744b f46369a = new C8744b();

    /* JADX INFO: renamed from: b */
    public static final String f46370b = C8744b.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static boolean f46371c;

    /* JADX INFO: renamed from: a */
    public static void m16982a(HashMap map) {
        SharedPreferences sharedPreferences = C8004n.m15871a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(settingsAPIFields.getRawValue(), obj.toString());
        editorEdit.putString(settingsAPIFields2.getRawValue(), obj2.toString());
        editorEdit.putString(settingsAPIFields3.getRawValue(), obj3.toString());
        editorEdit.apply();
        C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, f46370b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
