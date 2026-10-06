package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abq implements Iterable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f63a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Context f64b;

    public abq(Context context) {
        this.f64b = context;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.f63a.iterator();
    }
}
