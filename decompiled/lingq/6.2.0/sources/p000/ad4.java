package p000;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad4 {
    /* JADX INFO: renamed from: a */
    public static final Object m277a(MutablePreferences mutablePreferences, Preferences.Key key, Serializable serializable) {
        mutablePreferences.getClass();
        key.getClass();
        Object obj = mutablePreferences.get(key);
        return obj == null ? serializable : obj;
    }
}
