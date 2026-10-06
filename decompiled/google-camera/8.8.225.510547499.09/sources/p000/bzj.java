package p000;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bzj implements cbc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f4815a;

    public bzj(Context context) {
        this.f4815a = context;
    }

    @Override // p000.cbc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2844a() {
        return (ConnectivityManager) this.f4815a.getSystemService("connectivity");
    }
}
