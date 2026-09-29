package p000;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.android.gms.internal.measurement.zzxd;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.C1116f;
import com.google.common.util.concurrent.ExecutorC1122l;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class rkd {

    /* JADX INFO: renamed from: a */
    public final String f59452a;

    /* JADX INFO: renamed from: b */
    public final ListenableFuture f59453b;

    /* JADX INFO: renamed from: c */
    public final ild f59454c;

    /* JADX INFO: renamed from: d */
    public final ExecutorC1122l f59455d;

    /* JADX INFO: renamed from: e */
    public final dgd f59456e;

    /* JADX INFO: renamed from: f */
    public final Optional f59457f;

    /* JADX INFO: renamed from: g */
    public final to2 f59458g;

    /* JADX INFO: renamed from: h */
    public final Object f59459h = new Object();

    /* JADX INFO: renamed from: i */
    public final C1116f f59460i = new C1116f();

    /* JADX INFO: renamed from: j */
    public ListenableFuture f59461j = null;

    public rkd(String str, y04 y04Var, ild ildVar, Executor executor, dgd dgdVar, Optional optional, to2 to2Var) {
        this.f59452a = str;
        this.f59453b = AbstractC1118h.m6400d(y04Var);
        this.f59454c = ildVar;
        this.f59455d = new ExecutorC1122l(executor);
        this.f59456e = dgdVar;
        this.f59457f = optional;
        this.f59458g = to2Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001d A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0017, B:14:0x0019, B:16:0x001d, B:17:0x0035, B:18:0x0037), top: B:25:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: a */
    public final ListenableFuture m20684a(ubd ubdVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.f59459h) {
            ListenableFuture listenableFuture2 = this.f59461j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.f59461j == null) {
                    this.f59461j = AbstractC1118h.m6400d(this.f59460i.m6394a(jmd.m14556a(new sua(this, 5)), this.f59455d));
                }
                listenableFuture = this.f59461j;
            } else {
                try {
                    AbstractC1118h.m6398b(this.f59461j);
                } catch (ExecutionException unused) {
                    this.f59461j = null;
                }
                if (this.f59461j == null) {
                    this.f59461j = AbstractC1118h.m6400d(this.f59460i.m6394a(jmd.m14556a(new sua(this, 5)), this.f59455d));
                }
                listenableFuture = this.f59461j;
            }
            throw th;
        }
        return this.f59460i.m6394a(jmd.m14556a(new C3329mb(this, listenableFuture, ubdVar, executor, 21)), AbstractC1120j.m6404a());
    }

    /* JADX INFO: renamed from: b */
    public final bhb m20685b(Uri uri) throws IOException {
        ild ildVar = this.f59454c;
        String str = this.f59452a;
        dgd dgdVar = this.f59456e;
        try {
            try {
                to2 to2Var = this.f59458g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String string = sb.toString();
                zzxd zzxdVar = zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS;
                to2Var.getClass();
                zld zldVarM22257l = to2.m22257l(string, zzxdVar);
                try {
                    InputStream inputStreamM11077j = eda.m11077j(dgdVar.m10372b(uri));
                    try {
                        whb whbVarM23288a = ((vhb) ((ajb) ildVar.f44282a.mo329r(7))).m23288a(inputStreamM11077j, ildVar.f44283b);
                        if (inputStreamM11077j != null) {
                            inputStreamM11077j.close();
                        }
                        zldVarM22257l.close();
                        return whbVarM23288a;
                    } catch (Throwable th) {
                        if (inputStreamM11077j != null) {
                            try {
                                inputStreamM11077j.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        zldVarM22257l.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                ny8 ny8VarM10372b = dgdVar.m10372b(uri);
                if (((uid) ny8VarM10372b.f53414b).mo14448b((Uri) ny8VarM10372b.f53417e)) {
                    throw e;
                }
                return ildVar.f44282a;
            }
        } catch (IOException e2) {
            throw xed.m24480a(dgdVar, uri, e2, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20686c(Uri uri, Object obj) throws IOException {
        String str = this.f59452a;
        dgd dgdVar = this.f59456e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            to2 to2Var = this.f59458g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String string = sb.toString();
            zzxd zzxdVar = zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS;
            to2Var.getClass();
            zld zldVarM22257l = to2.m22257l(string, zzxdVar);
            try {
                cdb cdbVar = new cdb(false);
                try {
                    ny8 ny8VarM10372b = dgdVar.m10372b(uriBuild);
                    ArrayList arrayListM17690R = ny8VarM10372b.m17690R(((uid) ny8VarM10372b.f53414b).mo14451e((Uri) ny8VarM10372b.f53417e));
                    new cdb[]{cdbVar}[0].m4560h(arrayListM17690R);
                    OutputStream outputStream = (OutputStream) arrayListM17690R.get(0);
                    try {
                        bhb bhbVar = (bhb) obj;
                        bhbVar.getClass();
                        whb whbVar = (whb) bhbVar;
                        int iM23968l = whbVar.m23968l();
                        boolean z = nhb.f52743b;
                        if (iM23968l > 4096) {
                            iM23968l = 4096;
                        }
                        ihb ihbVar = new ihb(outputStream, iM23968l);
                        whbVar.m23961e(ihbVar);
                        ihbVar.m13926C();
                        if (((rhd) cdbVar.f9946c) == null) {
                            throw new zzsk("Cannot sync underlying stream");
                        }
                        ((OutputStream) cdbVar.f9945b).flush();
                        ((rhd) cdbVar.f9946c).f59334a.getFD().sync();
                        outputStream.close();
                        zldVarM22257l.close();
                        ny8 ny8VarM10372b2 = dgdVar.m10372b(uriBuild);
                        ny8 ny8VarM10372b3 = dgdVar.m10372b(uri);
                        uid uidVar = (uid) ny8VarM10372b2.f53414b;
                        if (uidVar != ((uid) ny8VarM10372b3.f53414b)) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        uidVar.mo14453g((Uri) ny8VarM10372b2.f53417e, (Uri) ny8VarM10372b3.f53417e);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw xed.m24480a(dgdVar, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    zldVarM22257l.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            ny8 ny8VarM10372b4 = dgdVar.m10372b(uriBuild);
            if (((uid) ny8VarM10372b4.f53414b).mo14448b((Uri) ny8VarM10372b4.f53417e)) {
                try {
                    ny8 ny8VarM10372b5 = dgdVar.m10372b(uriBuild);
                    ((uid) ny8VarM10372b5.f53414b).mo14452f((Uri) ny8VarM10372b5.f53417e);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }
}
