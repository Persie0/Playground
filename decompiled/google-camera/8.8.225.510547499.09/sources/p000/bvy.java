package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvy implements bvl {

    /* JADX INFO: renamed from: a */
    private static final Set f4568a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: b */
    private final bvl f4569b;

    public bvy(bvl bvlVar) {
        this.f4569b = bvlVar;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3083a(Object obj) {
        return f4568a.contains(((Uri) obj).getScheme());
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        return this.f4569b.mo3084b(new bvc(((Uri) obj).toString()), i, i2, bqrVar);
    }
}
