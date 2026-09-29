package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: vx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3701vx extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f66036a;

    /* JADX INFO: renamed from: b */
    public final Uri f66037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3738wx f66038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701vx(C3738wx c3738wx, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f66038c = c3738wx;
        this.f66036a = contentResolver;
        this.f66037b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f66038c.m24191g();
    }
}
