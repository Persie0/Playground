package p000;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zr4 implements pn3 {

    /* JADX INFO: renamed from: a */
    public static final zr4 f72004a = new zr4();

    @Override // p000.pn3
    /* JADX INFO: renamed from: a */
    public final File mo19407a(Context context, String str) {
        return AbstractC3584sr.m21592C(context, str);
    }

    @Override // p000.pn3
    /* JADX INFO: renamed from: b */
    public final DataStore mo19408b(Context context, String str) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, wr4.f67204a, null, null, null, new l02(1, context, str), 14, null);
    }
}
