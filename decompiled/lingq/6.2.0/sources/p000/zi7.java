package p000;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zi7 implements pn3 {

    /* JADX INFO: renamed from: a */
    public static final zi7 f71615a = new zi7();

    @Override // p000.pn3
    /* JADX INFO: renamed from: a */
    public final File mo19407a(Context context, String str) {
        return PreferenceDataStoreFile.preferencesDataStoreFile(context, str);
    }

    @Override // p000.pn3
    /* JADX INFO: renamed from: b */
    public final DataStore mo19408b(Context context, String str) {
        return PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, (ReplaceFileCorruptionHandler) null, (List) null, (un1) null, new l02(2, context, str), 7, (Object) null);
    }
}
