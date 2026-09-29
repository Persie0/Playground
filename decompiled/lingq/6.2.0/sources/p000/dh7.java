package p000;

import androidx.room.coroutines.C0744e;

/* JADX INFO: loaded from: classes2.dex */
public final class dh7 implements ik8 {

    /* JADX INFO: renamed from: a */
    public final ik8 f35656a;

    /* JADX INFO: renamed from: b */
    public final long f35657b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0744e f35658c;

    public dh7(C0744e c0744e, ik8 ik8Var) {
        ik8Var.getClass();
        this.f35658c = c0744e;
        this.f35656a = ik8Var;
        this.f35657b = e7d.m10915a();
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: C */
    public final void mo2874C(int i, String str) {
        str.getClass();
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.mo2874C(i, str);
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: L */
    public final String mo2875L(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.mo2875L(i);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: a0 */
    public final boolean mo2876a0() {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.mo2876a0();
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.close();
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: g */
    public final void mo2877g(int i, double d) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.mo2877g(i, d);
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    public final byte[] getBlob(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.getBlob(i);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    public final int getColumnCount() {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.getColumnCount();
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    public final String getColumnName(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.getColumnName(i);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    public final double getDouble(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.getDouble(i);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    public final long getLong(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.getLong(i);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    public final boolean isNull(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            return this.f35656a.isNull(i);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: j */
    public final void mo2878j(int i, long j) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.mo2878j(i, j);
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: k */
    public final void mo2879k(int i, byte[] bArr) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.mo2879k(i, bArr);
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: m */
    public final void mo2880m(int i) {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.mo2880m(i);
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: o */
    public final void mo3998o() {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.mo3998o();
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // p000.ik8
    public final void reset() {
        if (this.f35658c.f6953e) {
            AbstractC3695vr.m23485C(21, "Statement is recycled");
            throw null;
        }
        if (this.f35657b == e7d.m10915a()) {
            this.f35656a.reset();
        } else {
            AbstractC3695vr.m23485C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
