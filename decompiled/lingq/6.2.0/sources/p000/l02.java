package p000;

import android.content.Context;
import androidx.datastore.core.DeviceProtectedDataStoreFile;
import androidx.datastore.preferences.PreferenceDataStoreFile;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l02 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f48846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f48847c;

    public /* synthetic */ l02(int i, Context context, String str) {
        this.f48845a = i;
        this.f48846b = context;
        this.f48847c = str;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f48845a;
        String str = this.f48847c;
        Context context = this.f48846b;
        switch (i) {
            case 0:
                return DeviceProtectedDataStoreFile.deviceProtectedDataStoreFile(context, str);
            case 1:
                return AbstractC3584sr.m21592C(context, str);
            default:
                return PreferenceDataStoreFile.preferencesDataStoreFile(context, str);
        }
    }
}
