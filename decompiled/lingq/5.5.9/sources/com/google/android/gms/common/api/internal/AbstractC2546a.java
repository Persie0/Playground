package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Status;
import gb.InterfaceC5740d;
import p152hb.C6020w0;
import p176ib.C6272i;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2546a<R extends InterfaceC5740d, A> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: m */
    public final C2542a.f f13914m;

    /* JADX INFO: renamed from: n */
    public final C2542a<?> f13915n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC2546a(C2542a c2542a, C6020w0 c6020w0) {
        super(c6020w0);
        if (c6020w0 == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
        if (c2542a == null) {
            throw new NullPointerException("Api must not be null");
        }
        this.f13914m = c2542a.f13885b;
        this.f13915n = c2542a;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo7580k(C2542a.e eVar) throws RemoteException;

    /* JADX INFO: renamed from: l */
    public final void m7581l(Status status) {
        C6272i.m12907a("Failed result must not be success", !status.m7534q());
        m7567f(mo7564c(status));
    }
}
