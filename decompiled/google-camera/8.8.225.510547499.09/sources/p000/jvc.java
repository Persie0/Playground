package p000;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class jvc extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return Boolean.valueOf(Looper.getMainLooper().isCurrentThread());
    }
}
