package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import p000.AbstractC3584sr;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String str) {
        context.getClass();
        str.getClass();
        return AbstractC3584sr.m21592C(context, str.concat(".preferences_pb"));
    }
}
