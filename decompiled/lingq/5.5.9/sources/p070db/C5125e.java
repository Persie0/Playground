package p070db;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
import p152hb.InterfaceC5983k;
import p472x3.AbstractC10073a;

/* JADX INFO: renamed from: db.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5125e extends AbstractC10073a implements InterfaceC5983k {

    /* JADX INFO: renamed from: j */
    public final Semaphore f33111j;

    /* JADX INFO: renamed from: k */
    public final Set f33112k;

    public C5125e(Context context, Set set) {
        super(context);
        this.f33111j = new Semaphore(0);
        this.f33112k = set;
    }

    @Override // p152hb.InterfaceC5983k
    /* JADX INFO: renamed from: a */
    public final void mo10910a() {
        this.f33111j.release();
    }
}
