package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ktl extends ContentObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ktm f37165a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktl(ktm ktmVar, Handler handler) {
        super(handler);
        this.f37165a = ktmVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f37165a.m14838b();
    }
}
