package p000;

import java.io.Closeable;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class j88 implements Closeable {

    /* JADX INFO: renamed from: H */
    public final long f45196H;

    /* JADX INFO: renamed from: I */
    public final C3552rx f45197I;

    /* JADX INFO: renamed from: J */
    public final b9a f45198J;

    /* JADX INFO: renamed from: K */
    public gl0 f45199K;

    /* JADX INFO: renamed from: L */
    public final boolean f45200L;

    /* JADX INFO: renamed from: a */
    public final co7 f45201a;

    /* JADX INFO: renamed from: b */
    public final Protocol f45202b;

    /* JADX INFO: renamed from: c */
    public final String f45203c;

    /* JADX INFO: renamed from: d */
    public final int f45204d;

    /* JADX INFO: renamed from: e */
    public final ar3 f45205e;

    /* JADX INFO: renamed from: f */
    public final qr3 f45206f;

    /* JADX INFO: renamed from: g */
    public final m88 f45207g;

    /* JADX INFO: renamed from: h */
    public final id9 f45208h;

    /* JADX INFO: renamed from: i */
    public final j88 f45209i;

    /* JADX INFO: renamed from: j */
    public final j88 f45210j;

    /* JADX INFO: renamed from: k */
    public final j88 f45211k;

    /* JADX INFO: renamed from: l */
    public final long f45212l;

    public j88(co7 co7Var, Protocol protocol, String str, int i, ar3 ar3Var, qr3 qr3Var, m88 m88Var, id9 id9Var, j88 j88Var, j88 j88Var2, j88 j88Var3, long j, long j2, C3552rx c3552rx, b9a b9aVar) {
        co7Var.getClass();
        protocol.getClass();
        str.getClass();
        m88Var.getClass();
        b9aVar.getClass();
        this.f45201a = co7Var;
        this.f45202b = protocol;
        this.f45203c = str;
        this.f45204d = i;
        this.f45205e = ar3Var;
        this.f45206f = qr3Var;
        this.f45207g = m88Var;
        this.f45208h = id9Var;
        this.f45209i = j88Var;
        this.f45210j = j88Var2;
        this.f45211k = j88Var3;
        this.f45212l = j;
        this.f45196H = j2;
        this.f45197I = c3552rx;
        this.f45198J = b9aVar;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f45200L = z;
    }

    /* JADX INFO: renamed from: a */
    public final gl0 m14325a() {
        gl0 gl0Var = this.f45199K;
        if (gl0Var != null) {
            return gl0Var;
        }
        gl0 gl0Var2 = gl0.f40924n;
        gl0 gl0VarM21612Y = AbstractC3584sr.m21612Y(this.f45206f);
        this.f45199K = gl0VarM21612Y;
        return gl0VarM21612Y;
    }

    /* JADX INFO: renamed from: b */
    public final h88 m14326b() {
        h88 h88Var = new h88();
        h88Var.f41981c = -1;
        h88Var.f41985g = m88.f50759b;
        h88Var.f41993o = b9a.f8185x;
        h88Var.f41979a = this.f45201a;
        h88Var.f41980b = this.f45202b;
        h88Var.f41981c = this.f45204d;
        h88Var.f41982d = this.f45203c;
        h88Var.f41983e = this.f45205e;
        h88Var.f41984f = this.f45206f.m20123g();
        h88Var.f41985g = this.f45207g;
        h88Var.f41986h = this.f45208h;
        h88Var.f41987i = this.f45209i;
        h88Var.f41988j = this.f45210j;
        h88Var.f41989k = this.f45211k;
        h88Var.f41990l = this.f45212l;
        h88Var.f41991m = this.f45196H;
        h88Var.f41992n = this.f45197I;
        h88Var.f41993o = this.f45198J;
        return h88Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45207g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f45202b + ", code=" + this.f45204d + ", message=" + this.f45203c + ", url=" + ((ex3) this.f45201a.f10360c) + '}';
    }
}
