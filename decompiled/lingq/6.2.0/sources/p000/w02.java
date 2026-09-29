package p000;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w02 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f66161b;

    public /* synthetic */ w02(Context context, int i) {
        this.f66160a = i;
        this.f66161b = context;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws IOException {
        int i = this.f66160a;
        Context context = this.f66161b;
        switch (i) {
            case 0:
                return PreferenceDataStoreFile.preferencesDataStoreFile(context, "com.linguist_preferences");
            case 1:
                File fileM21592C = AbstractC3584sr.m21592C(context, "firebaseSessions/sessionConfigsDataStore.data");
                jj5.m14501o(fileM21592C);
                return fileM21592C;
            default:
                File fileM21592C2 = AbstractC3584sr.m21592C(context, "firebaseSessions/sessionDataStore.data");
                jj5.m14501o(fileM21592C2);
                return fileM21592C2;
        }
    }
}
