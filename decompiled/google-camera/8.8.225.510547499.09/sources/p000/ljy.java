package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ljy implements msi {

    /* JADX INFO: renamed from: a */
    private final Context f38446a;

    public ljy(Context context) {
        this.f38446a = context;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6051a() {
        return kuh.m14888c(this.f38446a) ? mqu.f41450a : mrm.m16829i(new File(this.f38446a.getFilesDir(), "primes/crash"));
    }
}
