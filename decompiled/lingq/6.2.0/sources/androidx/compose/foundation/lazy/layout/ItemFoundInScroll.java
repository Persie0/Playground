package androidx.compose.foundation.lazy.layout;

import java.util.concurrent.CancellationException;
import p000.C0817bn;

/* JADX INFO: loaded from: classes.dex */
final class ItemFoundInScroll extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final int f2492a;

    /* JADX INFO: renamed from: b */
    public final C0817bn f2493b;

    public ItemFoundInScroll(int i, C0817bn c0817bn) {
        this.f2492a = i;
        this.f2493b = c0817bn;
    }
}
