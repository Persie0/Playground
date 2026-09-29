package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: loaded from: classes.dex */
public final class z6b extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3211a f70995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6b(C3211a c3211a, Handler handler) {
        super(handler);
        this.f70995a = c3211a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f70995a.mo4677k(xfa.f68157a);
    }
}
