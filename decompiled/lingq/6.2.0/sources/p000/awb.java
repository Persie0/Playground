package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class awb extends PhantomReference {

    /* JADX INFO: renamed from: a */
    public final Set f7629a;

    /* JADX INFO: renamed from: b */
    public final ddb f7630b;

    public /* synthetic */ awb(e31 e31Var, ReferenceQueue referenceQueue, Set set, ddb ddbVar) {
        super(e31Var, referenceQueue);
        this.f7629a = set;
        this.f7630b = ddbVar;
    }
}
