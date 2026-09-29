package p155he;

import android.util.Log;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;

/* JADX INFO: renamed from: he.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6039c implements InterfaceC5745a<Void, Object> {
    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g<Void> abstractC5751g) throws Exception {
        if (!abstractC5751g.mo12111m()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", abstractC5751g.mo12106h());
        }
        return null;
    }
}
