package p216k7;

import com.downloader.Progress;
import com.downloader.Status;
import com.google.android.exoplayer2.ExoPlayer;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import p148h7.C5899b;
import p148h7.InterfaceC5898a;
import p172i7.HandlerC6204a;
import p193j7.C6421a;
import p237l7.C7284a;
import p259m7.C7493a;
import p273n7.C7715c;

/* JADX INFO: renamed from: k7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6629d {

    /* JADX INFO: renamed from: a */
    public final C7493a f37578a;

    /* JADX INFO: renamed from: b */
    public HandlerC6204a f37579b;

    /* JADX INFO: renamed from: c */
    public long f37580c;

    /* JADX INFO: renamed from: d */
    public long f37581d;

    /* JADX INFO: renamed from: e */
    public InputStream f37582e;

    /* JADX INFO: renamed from: f */
    public C7284a f37583f;

    /* JADX INFO: renamed from: g */
    public C6421a f37584g;

    /* JADX INFO: renamed from: h */
    public long f37585h;

    /* JADX INFO: renamed from: i */
    public int f37586i;

    /* JADX INFO: renamed from: j */
    public String f37587j;

    /* JADX INFO: renamed from: k */
    public boolean f37588k;

    /* JADX INFO: renamed from: l */
    public String f37589l;

    public C6629d(C7493a c7493a) {
        this.f37578a = c7493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static void m13259c(InputStream inputStream) throws Throwable {
        if (inputStream != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    do {
                        try {
                        } catch (IOException unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader == null) {
                                return;
                            } else {
                                bufferedReader.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                            }
                            throw th;
                        }
                    } while (bufferedReader2.readLine() != null);
                    bufferedReader2.close();
                } catch (IOException | NullPointerException unused3) {
                }
            } catch (IOException unused4) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13260a(C5899b c5899b) throws IllegalAccessException, IOException {
        String str;
        if (this.f37586i != 416) {
            String str2 = this.f37587j;
            if (!((str2 == null || c5899b == null || (str = c5899b.f35238c) == null || str.equals(str2)) ? false : true)) {
                return false;
            }
        }
        C7493a c7493a = this.f37578a;
        if (c5899b != null) {
            C6626a.f37566f.m13255a().remove(c7493a.f41401o);
        }
        m13263e();
        c7493a.f41394h = 0L;
        c7493a.f41395i = 0L;
        C6421a c6421aM13256b = C6626a.f37566f.m13256b();
        this.f37584g = c6421aM13256b;
        c6421aM13256b.m13043b(c7493a);
        C6421a c6421aM15305a = C7715c.m15305a(this.f37584g, c7493a);
        this.f37584g = c6421aM15305a;
        this.f37586i = c6421aM15305a.m13044c();
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m13261b(C7284a c7284a) {
        C6421a c6421a = this.f37584g;
        InputStream inputStream = this.f37582e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        try {
            if (c7284a != null) {
                try {
                    m13266h(c7284a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (c7284a != null) {
                try {
                    c7284a.f40798a.close();
                    c7284a.f40800c.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            try {
                c7284a.f40798a.close();
                c7284a.f40800c.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13262d() {
        C5899b c5899b = new C5899b();
        C7493a c7493a = this.f37578a;
        c5899b.f35236a = c7493a.f41401o;
        c5899b.f35237b = c7493a.f41389c;
        c5899b.f35238c = this.f37587j;
        c5899b.f35239d = c7493a.f41390d;
        c5899b.f35240e = c7493a.f41391e;
        c5899b.f35242g = c7493a.f41394h;
        c5899b.f35241f = this.f37585h;
        c5899b.f35243h = System.currentTimeMillis();
        C6626a.f37566f.m13255a().mo5435a(c5899b);
    }

    /* JADX INFO: renamed from: e */
    public final void m13263e() {
        File file = new File(this.f37589l);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: f */
    public final C5899b m13264f() {
        return C6626a.f37566f.m13255a().mo5443k(this.f37578a.f41401o);
    }

    /* JADX INFO: renamed from: g */
    public final void m13265g() {
        HandlerC6204a handlerC6204a;
        C7493a c7493a = this.f37578a;
        if (c7493a.f41402p == Status.CANCELLED || (handlerC6204a = this.f37579b) == null) {
            return;
        }
        handlerC6204a.obtainMessage(1, new Progress(c7493a.f41394h, this.f37585h)).sendToTarget();
    }

    /* JADX INFO: renamed from: h */
    public final void m13266h(C7284a c7284a) {
        boolean z10;
        try {
            c7284a.f40798a.flush();
            c7284a.f40799b.sync();
            z10 = true;
        } catch (IOException e10) {
            e10.printStackTrace();
            z10 = false;
        }
        if (z10 && this.f37588k) {
            InterfaceC5898a interfaceC5898aM13255a = C6626a.f37566f.m13255a();
            C7493a c7493a = this.f37578a;
            interfaceC5898aM13255a.mo5437d(c7493a.f41401o, c7493a.f41394h, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13267i(C7284a c7284a) {
        long j10 = this.f37578a.f41394h;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = j10 - this.f37581d;
        long j12 = jCurrentTimeMillis - this.f37580c;
        if (j11 <= 65536 || j12 <= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            return;
        }
        m13266h(c7284a);
        this.f37581d = j10;
        this.f37580c = jCurrentTimeMillis;
    }
}
