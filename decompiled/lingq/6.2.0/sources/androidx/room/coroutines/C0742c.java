package androidx.room.coroutines;

import kotlin.AbstractC3192a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bk8;
import p000.ck8;
import p000.cs4;
import p000.hi1;
import p000.wfb;
import p000.y47;
import p000.z47;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.coroutines.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0742c implements hi1 {

    /* JADX INFO: renamed from: a */
    public final ck8 f6937a;

    /* JADX INFO: renamed from: b */
    public final String f6938b;

    /* JADX INFO: renamed from: c */
    public final zi3 f6939c;

    /* JADX INFO: renamed from: d */
    public final cs4 f6940d = AbstractC3192a.m15356a(new y47(this, 0));

    public C0742c(ck8 ck8Var, String str, zi3 zi3Var) {
        this.f6937a = ck8Var;
        this.f6938b = str;
        this.f6939c = zi3Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        cs4 cs4Var = this.f6940d;
        if (cs4Var.isInitialized()) {
            ((bk8) cs4Var.getValue()).close();
        }
    }

    @Override // p000.hi1
    /* JADX INFO: renamed from: v */
    public final Object mo2813v(boolean z, zi3 zi3Var, ContinuationImpl continuationImpl) {
        z47 z47Var = (z47) continuationImpl.getContext().get(z47.f70896b);
        C0741b c0741b = z47Var != null ? z47Var.f70897a : null;
        if (c0741b != null) {
            return zi3Var.invoke(c0741b, continuationImpl);
        }
        C0741b c0741b2 = new C0741b(this.f6939c, (bk8) this.f6940d.getValue());
        return wfb.m23905G(new PassthroughConnectionPool$useConnection$2(zi3Var, c0741b2, null), new z47(c0741b2), continuationImpl);
    }
}
