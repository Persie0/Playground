package p000;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class ndb extends sdb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Intent f52626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GoogleApiActivity f52627b;

    public ndb(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f52626a = intent;
        this.f52627b = googleApiActivity;
    }

    @Override // p000.sdb
    /* JADX INFO: renamed from: a */
    public final void mo17389a() {
        Intent intent = this.f52626a;
        if (intent != null) {
            this.f52627b.startActivityForResult(intent, 2);
        }
    }
}
