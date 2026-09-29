package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class nw3 implements ru2 {

    /* JADX INFO: renamed from: g */
    public static final List f53315g = kcb.m15120k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h */
    public static final List f53316h = kcb.m15120k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a */
    public final j18 f53317a;

    /* JADX INFO: renamed from: b */
    public final at4 f53318b;

    /* JADX INFO: renamed from: c */
    public final mw3 f53319c;

    /* JADX INFO: renamed from: d */
    public volatile tw3 f53320d;

    /* JADX INFO: renamed from: e */
    public final Protocol f53321e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f53322f;

    public nw3(dr6 dr6Var, j18 j18Var, at4 at4Var, mw3 mw3Var) {
        dr6Var.getClass();
        mw3Var.getClass();
        this.f53317a = j18Var;
        this.f53318b = at4Var;
        this.f53319c = mw3Var;
        List list = dr6Var.f36103s;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f53321e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: a */
    public final yd9 mo12221a(j88 j88Var) {
        tw3 tw3Var = this.f53320d;
        tw3Var.getClass();
        return tw3Var.f63001h;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: b */
    public final void mo12222b() {
        tw3 tw3Var = this.f53320d;
        tw3Var.getClass();
        tw3Var.f63002i.close();
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: c */
    public final boolean mo12223c() {
        boolean z;
        tw3 tw3Var = this.f53320d;
        if (tw3Var != null) {
            synchronized (tw3Var) {
                rw3 rw3Var = tw3Var.f63001h;
                z = rw3Var.f59956b && rw3Var.f59958d.m492p();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ru2
    public final void cancel() {
        this.f53322f = true;
        tw3 tw3Var = this.f53320d;
        if (tw3Var != null) {
            tw3Var.m22321f(ErrorCode.CANCEL);
        }
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: d */
    public final long mo12224d(j88 j88Var) {
        if (xw3.m24724a(j88Var)) {
            return kcb.m15114e(j88Var);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // p000.ru2
    /* JADX INFO: renamed from: e */
    public final h88 mo12225e(boolean z) throws IOException {
        qr3 qr3Var;
        boolean z2;
        tw3 tw3Var = this.f53320d;
        if (tw3Var == null) {
            v63.m23133k("stream wasn't created");
            return null;
        }
        synchronized (tw3Var) {
            while (true) {
                if (!tw3Var.f62999f.isEmpty() || tw3Var.m22322g() != null) {
                    break;
                }
                if (!z) {
                    tw3Var.f62995b.getClass();
                    qw3 qw3Var = tw3Var.f63002i;
                    z2 = qw3Var.f58275c || qw3Var.f58273a;
                }
                if (z2) {
                    tw3Var.f63003j.m24714h();
                }
                try {
                    try {
                        tw3Var.wait();
                        if (z2) {
                            tw3Var.f63003j.m21752l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        tw3Var.f63003j.m21752l();
                    }
                    throw th;
                }
            }
            if (tw3Var.f62999f.isEmpty()) {
                IOException iOException = tw3Var.f62993H;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCodeM22322g = tw3Var.m22322g();
                errorCodeM22322g.getClass();
                throw new StreamResetException(errorCodeM22322g);
            }
            Object objRemoveFirst = tw3Var.f62999f.removeFirst();
            objRemoveFirst.getClass();
            qr3Var = (qr3) objRemoveFirst;
        }
        Protocol protocol = this.f53321e;
        protocol.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = qr3Var.size();
        C3047gq c3047gqM19796z = null;
        for (int i = 0; i < size; i++) {
            String strM20122f = qr3Var.m20122f(i);
            String strM20124h = qr3Var.m20124h(i);
            if (strM20122f.equals(":status")) {
                c3047gqM19796z = AbstractC3489q9.m19796z("HTTP/1.1 ".concat(strM20124h));
            } else if (!f53316h.contains(strM20122f)) {
                arrayList.add(strM20122f);
                arrayList.add(vk9.m23376L0(strM20124h).toString());
            }
        }
        if (c3047gqM19796z == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        h88 h88Var = new h88();
        h88Var.f41980b = protocol;
        h88Var.f41981c = c3047gqM19796z.f41171b;
        h88Var.f41982d = (String) c3047gqM19796z.f41173d;
        h88Var.f41984f = new qr3((String[]) arrayList.toArray(new String[0])).m20123g();
        if (z && h88Var.f41981c == 100) {
            return null;
        }
        return h88Var;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: f */
    public final void mo12226f() {
        this.f53319c.flush();
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: g */
    public final id9 mo12227g() {
        tw3 tw3Var = this.f53320d;
        tw3Var.getClass();
        return tw3Var;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: h */
    public final qu2 mo12228h() {
        return this.f53317a;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: i */
    public final t89 mo12229i(co7 co7Var, long j) {
        co7Var.getClass();
        tw3 tw3Var = this.f53320d;
        tw3Var.getClass();
        return tw3Var.f63002i;
    }

    @Override // p000.ru2
    /* JADX INFO: renamed from: j */
    public final void mo12230j(co7 co7Var) throws IOException {
        int i;
        tw3 tw3Var;
        boolean z;
        co7Var.getClass();
        if (this.f53320d != null) {
            return;
        }
        boolean z2 = ((z68) co7Var.f10362e) != null;
        qr3 qr3Var = (qr3) co7Var.f10361d;
        ArrayList arrayList = new ArrayList(qr3Var.size() + 4);
        arrayList.add(new jr3(jr3.f46033f, (String) co7Var.f10359b));
        ByteString byteString = jr3.f46034g;
        ex3 ex3Var = (ex3) co7Var.f10360c;
        ex3Var.getClass();
        String strM11376b = ex3Var.m11376b();
        String strM11378d = ex3Var.m11378d();
        if (strM11378d != null) {
            strM11376b = strM11376b + '?' + strM11378d;
        }
        arrayList.add(new jr3(byteString, strM11376b));
        String strM20121d = qr3Var.m20121d("Host");
        if (strM20121d != null) {
            arrayList.add(new jr3(jr3.f46036i, strM20121d));
        }
        arrayList.add(new jr3(jr3.f46035h, ex3Var.f38024a));
        int size = qr3Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM20122f = qr3Var.m20122f(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strM20122f.toLowerCase(locale);
            lowerCase.getClass();
            if (!f53315g.contains(lowerCase) || (lowerCase.equals("te") && qr3Var.m20124h(i2).equals("trailers"))) {
                arrayList.add(new jr3(lowerCase, qr3Var.m20124h(i2)));
            }
        }
        mw3 mw3Var = this.f53319c;
        mw3Var.getClass();
        boolean z3 = !z2;
        synchronized (mw3Var.f51923R) {
            synchronized (mw3Var) {
                try {
                    if (mw3Var.f51930e > 1073741823) {
                        mw3Var.m17068e(ErrorCode.REFUSED_STREAM);
                    }
                    if (mw3Var.f51931f) {
                        throw new ConnectionShutdownException();
                    }
                    i = mw3Var.f51930e;
                    mw3Var.f51930e = i + 2;
                    tw3Var = new tw3(i, mw3Var, z3, false, null);
                    z = !z2 || mw3Var.f51920O >= mw3Var.f51921P || tw3Var.f62997d >= tw3Var.f62998e;
                    if (tw3Var.m22324i()) {
                        mw3Var.f51927b.put(Integer.valueOf(i), tw3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mw3Var.f51923R.m22964n(z3, i, arrayList);
        }
        if (z) {
            mw3Var.f51923R.flush();
        }
        this.f53320d = tw3Var;
        boolean z4 = this.f53322f;
        tw3 tw3Var2 = this.f53320d;
        if (z4) {
            tw3Var2.getClass();
            tw3Var2.m22321f(ErrorCode.CANCEL);
            v63.m23133k("Canceled");
        } else {
            tw3Var2.getClass();
            tw3Var2.f63003j.mo3173g(this.f53318b.f7460d);
            tw3 tw3Var3 = this.f53320d;
            tw3Var3.getClass();
            tw3Var3.f63004k.mo3173g(this.f53318b.f7461e);
        }
    }
}
