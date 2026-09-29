package androidx.compose.p017ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.AbstractChannel;
import p325po.InterfaceC8428d;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683z1 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8428d<C9072e> f4394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683z1(AbstractChannel abstractChannel, Handler handler) {
        super(handler);
        this.f4394a = abstractChannel;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f4394a.mo16479j(C9072e.f47360a);
    }
}
