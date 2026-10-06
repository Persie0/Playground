package p000;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltn implements ltq {

    /* JADX INFO: renamed from: a */
    public final String f39178a;

    /* JADX INFO: renamed from: b */
    public final nps f39179b;

    /* JADX INFO: renamed from: c */
    public final Executor f39180c;

    /* JADX INFO: renamed from: d */
    public final ltd f39181d;

    /* JADX INFO: renamed from: g */
    public final C1058va f39184g;

    /* JADX INFO: renamed from: h */
    private final ltw f39185h;

    /* JADX INFO: renamed from: e */
    public final Object f39182e = new Object();

    /* JADX INFO: renamed from: i */
    private final ote f39186i = ote.m19025d();

    /* JADX INFO: renamed from: f */
    public nps f39183f = null;

    public ltn(String str, nps npsVar, ltw ltwVar, Executor executor, C1058va c1058va, ltd ltdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f39178a = str;
        this.f39179b = kxk.m14966L(npsVar);
        this.f39185h = ltwVar;
        this.f39180c = kxk.m14956B(executor);
        this.f39184g = c1058va;
        this.f39181d = ltdVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:12:0x0015, B:13:0x0017, B:15:0x001b, B:16:0x0034, B:17:0x0036), top: B:22:0x0003, inners: #1 }] */
    /* JADX INFO: renamed from: a */
    public final nps m15973a() {
        nps npsVar;
        synchronized (this.f39182e) {
            nps npsVar2 = this.f39183f;
            if (npsVar2 == null || !npsVar2.isDone()) {
                if (this.f39183f == null) {
                    this.f39183f = kxk.m14966L(this.f39186i.m19029c(mov.m16715a(new cnm(this, 13)), this.f39180c));
                }
                npsVar = this.f39183f;
            } else {
                try {
                    kxk.m14973S(this.f39183f);
                } catch (ExecutionException e) {
                    this.f39183f = null;
                }
                if (this.f39183f == null) {
                    this.f39183f = kxk.m14966L(this.f39186i.m19029c(mov.m16715a(new cnm(this, 13)), this.f39180c));
                }
                npsVar = this.f39183f;
            }
            throw th;
        }
        return npsVar;
    }

    /* JADX INFO: renamed from: b */
    public final Object m15974b(Uri uri) throws IllegalAccessException, IOException, InvocationTargetException {
        try {
            try {
                moj mojVarM15580g = lkm.m15580g("Read " + this.f39178a);
                try {
                    InputStream inputStream = (InputStream) this.f39184g.m19466E(uri, new lst());
                    try {
                        ltw ltwVar = this.f39185h;
                        Object objMo17766a = ltwVar.f39202a.mo18139V().mo17766a(inputStream, ltwVar.f39203b);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        mojVarM15580g.close();
                        return objMo17766a;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        mojVarM15580g.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                if (this.f39184g.m19468G(uri)) {
                    throw e;
                }
                return this.f39185h.f39202a;
            }
        } catch (IOException e2) {
            throw lkm.m15571L(this.f39184g, uri, e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lsx] */
    /* JADX INFO: renamed from: c */
    public final void m15975c(Uri uri, Object obj) {
        Uri uriM15576c = lkm.m15576c(uri, ".tmp");
        try {
            moj mojVarM15580g = lkm.m15580g("Write " + this.f39178a);
            try {
                lsg lsgVar = new lsg();
                try {
                    C1058va c1058va = this.f39184g;
                    lsw lswVar = new lsw();
                    lswVar.f39146a = new lsg[]{lsgVar};
                    OutputStream outputStream = (OutputStream) c1058va.m19466E(uriM15576c, lswVar);
                    try {
                        ((nyw) obj).mo17759I(outputStream);
                        lsgVar.m15947b();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        mojVarM15580g.close();
                        this.f39184g.m19467F(uriM15576c, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw lkm.m15571L(this.f39184g, uri, e);
                }
            } catch (Throwable th3) {
                try {
                    mojVarM15580g.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            if (this.f39184g.m19468G(uriM15576c)) {
                try {
                    lie lieVarM19471J = this.f39184g.m19471J(uriM15576c);
                    lieVarM19471J.f38295b.mo15944k((Uri) lieVarM19471J.f38294a);
                } catch (IOException e3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e3);
                }
            }
            throw e2;
        }
    }

    @Override // p000.ltq
    /* JADX INFO: renamed from: d */
    public final nps mo15976d(nom nomVar, Executor executor) {
        return this.f39186i.m19029c(mov.m16715a(new ltl(this, m15973a(), nomVar, executor, 0)), not.INSTANCE);
    }
}
