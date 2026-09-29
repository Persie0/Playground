package p216k7;

import com.downloader.Priority;
import com.downloader.Status;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import p111f7.C5473a;
import p133g7.C5708a;
import p148h7.C5899b;
import p172i7.HandlerC6204a;
import p193j7.C6421a;
import p237l7.C7284a;
import p259m7.C7493a;
import p259m7.RunnableC7494b;
import p259m7.RunnableC7495c;
import p273n7.C7715c;

/* JADX INFO: renamed from: k7.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6628c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Priority f37575a;

    /* JADX INFO: renamed from: b */
    public final int f37576b;

    /* JADX INFO: renamed from: c */
    public final C7493a f37577c;

    public RunnableC6628c(C7493a c7493a) {
        this.f37577c = c7493a;
        this.f37575a = c7493a.f41387a;
        this.f37576b = c7493a.f41392f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5473a c5473a;
        boolean z10;
        long j10;
        Status status = Status.RUNNING;
        C7493a c7493a = this.f37577c;
        c7493a.f41402p = status;
        C6629d c6629d = new C6629d(c7493a);
        String str = c7493a.f41391e;
        String str2 = c7493a.f41390d;
        Status status2 = Status.CANCELLED;
        boolean z11 = false;
        boolean z12 = true;
        if (status == status2) {
            z10 = false;
            c5473a = null;
        } else {
            Status status3 = Status.PAUSED;
            if (status == status3) {
                z10 = true;
                c5473a = null;
                z12 = false;
            } else {
                try {
                    try {
                        if (c7493a.f41399m != null) {
                            c6629d.f37579b = new HandlerC6204a(c7493a.f41399m);
                        }
                        c6629d.f37589l = C7715c.m15306b(str2, str);
                        File file = new File(c6629d.f37589l);
                        C5899b c5899bM13264f = c6629d.m13264f();
                        if (c5899bM13264f != null) {
                            if (file.exists()) {
                                c7493a.f41395i = c5899bM13264f.f35241f;
                                c7493a.f41394h = c5899bM13264f.f35242g;
                            } else {
                                C6626a.f37566f.m13255a().remove(c7493a.f41401o);
                                c7493a.f41394h = 0L;
                                c7493a.f41395i = 0L;
                                c5899bM13264f = null;
                            }
                        }
                        C6421a c6421aM13256b = C6626a.f37566f.m13256b();
                        c6629d.f37584g = c6421aM13256b;
                        c6421aM13256b.m13043b(c7493a);
                        Status status4 = c7493a.f41402p;
                        if (status4 != status2) {
                            if (status4 != status3) {
                                C6421a c6421aM15305a = C7715c.m15305a(c6629d.f37584g, c7493a);
                                c6629d.f37584g = c6421aM15305a;
                                c6629d.f37586i = c6421aM15305a.m13044c();
                                c6629d.f37587j = c6629d.f37584g.f36897a.getHeaderField("ETag");
                                if (c6629d.m13260a(c5899bM13264f)) {
                                    c5899bM13264f = null;
                                }
                                int i10 = c6629d.f37586i;
                                if (i10 >= 200 && i10 < 300) {
                                    boolean z13 = i10 == 206;
                                    c6629d.f37588k = z13;
                                    c6629d.f37585h = c7493a.f41395i;
                                    if (!z13) {
                                        c6629d.m13263e();
                                    }
                                    if (c6629d.f37585h == 0) {
                                        try {
                                            j10 = Long.parseLong(c6629d.f37584g.f36897a.getHeaderField("Content-Length"));
                                        } catch (NumberFormatException unused) {
                                            j10 = -1;
                                        }
                                        c6629d.f37585h = j10;
                                        c7493a.f41395i = j10;
                                    }
                                    if (c6629d.f37588k && c5899bM13264f == null) {
                                        c6629d.m13262d();
                                    }
                                    Status status5 = c7493a.f41402p;
                                    Status status6 = Status.CANCELLED;
                                    if (status5 != status6) {
                                        Status status7 = Status.PAUSED;
                                        if (status5 != status7) {
                                            c7493a.m14890b();
                                            c6629d.f37582e = c6629d.f37584g.f36897a.getInputStream();
                                            byte[] bArr = new byte[4096];
                                            if (!file.exists() && (file.getParentFile() == null || file.getParentFile().exists() || file.getParentFile().mkdirs())) {
                                                file.createNewFile();
                                            }
                                            C7284a c7284a = new C7284a(file);
                                            c6629d.f37583f = c7284a;
                                            if (c6629d.f37588k) {
                                                long j11 = c7493a.f41394h;
                                                if (j11 != 0) {
                                                    c7284a.f40800c.seek(j11);
                                                }
                                            }
                                            Status status8 = c7493a.f41402p;
                                            if (status8 != status6) {
                                                if (status8 != status7) {
                                                    while (true) {
                                                        int i11 = c6629d.f37582e.read(bArr, 0, 4096);
                                                        if (i11 == -1) {
                                                            C7715c.m15307c(c6629d.f37589l, str2 + File.separator + str);
                                                            try {
                                                                if (c6629d.f37588k) {
                                                                    C6626a.f37566f.m13255a().remove(c6629d.f37578a.f41401o);
                                                                }
                                                                c5473a = null;
                                                            } catch (IOException | IllegalAccessException unused2) {
                                                                if (!c6629d.f37588k) {
                                                                    c6629d.m13263e();
                                                                }
                                                                c5473a = new C5473a();
                                                            }
                                                            c6629d.m13261b(c6629d.f37583f);
                                                            z10 = false;
                                                            z11 = z12;
                                                            z12 = false;
                                                        } else {
                                                            c6629d.f37583f.f40798a.write(bArr, 0, i11);
                                                            c7493a.f41394h += (long) i11;
                                                            c6629d.m13265g();
                                                            c6629d.m13267i(c6629d.f37583f);
                                                            Status status9 = c7493a.f41402p;
                                                            if (status9 != Status.CANCELLED) {
                                                                if (status9 == Status.PAUSED) {
                                                                    c6629d.m13266h(c6629d.f37583f);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C5473a c5473a2 = new C5473a();
                                    URLConnection uRLConnection = c6629d.f37584g.f36897a;
                                    C6629d.m13259c(uRLConnection instanceof HttpURLConnection ? ((HttpURLConnection) uRLConnection).getErrorStream() : null);
                                    c5473a2.f34063a = c6629d.f37584g.f36897a.getHeaderFields();
                                    c5473a = c5473a2;
                                    z10 = false;
                                    z12 = false;
                                }
                                c6629d.m13261b(c6629d.f37583f);
                            }
                            z10 = true;
                            c5473a = null;
                            z12 = false;
                            c6629d.m13261b(c6629d.f37583f);
                        }
                        z10 = false;
                        c5473a = null;
                        c6629d.m13261b(c6629d.f37583f);
                    } catch (IOException | IllegalAccessException unused3) {
                        z12 = false;
                    }
                } catch (Throwable th2) {
                    c6629d.m13261b(c6629d.f37583f);
                    throw th2;
                }
            }
        }
        if (z11) {
            if (c7493a.f41402p != Status.CANCELLED) {
                c7493a.f41402p = Status.COMPLETED;
                C5708a.m12072a().f34717a.f34721c.execute(new RunnableC7494b(c7493a));
                return;
            }
            return;
        }
        if (z10) {
            if (c7493a.f41402p != Status.CANCELLED) {
                C5708a.m12072a().f34717a.f34721c.execute(new RunnableC7495c(c7493a));
            }
        } else if (c5473a != null) {
            c7493a.m14889a(c5473a);
        } else {
            if (z12) {
                return;
            }
            c7493a.m14889a(new C5473a());
        }
    }
}
