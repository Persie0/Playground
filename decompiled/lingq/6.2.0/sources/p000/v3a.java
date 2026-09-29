package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class v3a {
    public static final u3a Companion = new u3a();

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f64796a;

    /* JADX INFO: renamed from: b */
    public final bl2 f64797b;

    /* JADX INFO: renamed from: d */
    public final bl2 f64799d;

    /* JADX INFO: renamed from: e */
    public final bl2 f64800e;

    /* JADX INFO: renamed from: c */
    public final qn3 f64798c = new qn3(20);

    /* JADX INFO: renamed from: f */
    public final bl2 f64801f = new bl2(new u70(15), new v70(16));

    public v3a(AbstractC0746d abstractC0746d) {
        this.f64796a = abstractC0746d;
        int i = 0;
        this.f64797b = new bl2(new s3a(this, i), new t3a(this, i));
        int i2 = 1;
        this.f64799d = new bl2(new s3a(this, i2), new t3a(this, i2));
        int i3 = 2;
        this.f64800e = new bl2(new s3a(this, i3), new t3a(this, i3));
    }

    /* JADX INFO: renamed from: a */
    public final Object m23083a(f4a f4aVar, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new r3a(1, this, f4aVar), this.f64796a, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }
}
