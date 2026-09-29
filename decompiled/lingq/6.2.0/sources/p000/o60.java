package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class o60 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f53883b = AtomicIntegerFieldUpdater.newUpdater(o60.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final x92[] f53884a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public o60(x92[] x92VarArr) {
        this.f53884a = x92VarArr;
        this.notCompletedCount$volatile = x92VarArr.length;
    }
}
