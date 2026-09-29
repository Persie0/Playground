package coil.fetch;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.disk.C0860a;
import coil.network.HttpException;
import coil.request.CachePolicy;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import p000.AbstractC3057h;
import p000.AbstractC3122is;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3552rx;
import p000.a33;
import p000.ae9;
import p000.ch2;
import p000.cl9;
import p000.cm1;
import p000.co7;
import p000.cs4;
import p000.d18;
import p000.d57;
import p000.dr6;
import p000.e18;
import p000.ee9;
import p000.fa4;
import p000.gl0;
import p000.h88;
import p000.hj0;
import p000.i18;
import p000.iy5;
import p000.j88;
import p000.jl0;
import p000.k18;
import p000.kl0;
import p000.l18;
import p000.lda;
import p000.ll0;
import p000.m88;
import p000.n33;
import p000.or3;
import p000.pk9;
import p000.qr3;
import p000.r46;
import p000.sm0;
import p000.sz6;
import p000.u33;
import p000.vk9;
import p000.w41;
import p000.xv5;
import p000.y38;

/* JADX INFO: renamed from: coil.fetch.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0861a implements a33 {

    /* JADX INFO: renamed from: f */
    public static final gl0 f10476f = new gl0(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g */
    public static final gl0 f10477g = new gl0(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a */
    public final String f10478a;

    /* JADX INFO: renamed from: b */
    public final sz6 f10479b;

    /* JADX INFO: renamed from: c */
    public final cs4 f10480c;

    /* JADX INFO: renamed from: d */
    public final cs4 f10481d;

    /* JADX INFO: renamed from: e */
    public final boolean f10482e;

    public C0861a(String str, sz6 sz6Var, cs4 cs4Var, cs4 cs4Var2, boolean z) {
        this.f10478a = str;
        this.f10479b = sz6Var;
        this.f10480c = cs4Var;
        this.f10481d = cs4Var2;
        this.f10482e = z;
    }

    /* JADX INFO: renamed from: d */
    public static String m4968d(String str, xv5 xv5Var) {
        String strM12987b;
        String str2 = xv5Var != null ? xv5Var.f68847a : null;
        if ((str2 == null || cl9.m4842Y(str2, "text/plain", false)) && (strM12987b = AbstractC3057h.m12987b(MimeTypeMap.getSingleton(), str)) != null) {
            return strM12987b;
        }
        if (str2 != null) {
            return vk9.m23370F0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0207 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f9 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01fc A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // p000.a33
    /* JADX INFO: renamed from: a */
    public final Object mo57a(Continuation continuation) throws Exception {
        HttpUriFetcher$fetch$1 httpUriFetcher$fetch$1;
        k18 k18Var;
        ll0 ll0VarM15327a;
        Object objM4969b;
        l18 l18Var;
        k18 k18Var2;
        j88 j88Var;
        C0861a c0861a;
        j88 j88Var2;
        m88 m88Var;
        DataSource dataSource;
        if (continuation instanceof HttpUriFetcher$fetch$1) {
            httpUriFetcher$fetch$1 = (HttpUriFetcher$fetch$1) continuation;
            int i = httpUriFetcher$fetch$1.f10475f;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$fetch$1.f10475f = i - Integer.MIN_VALUE;
            } else {
                httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, (ContinuationImpl) continuation);
            }
        } else {
            httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, (ContinuationImpl) continuation);
        }
        Object obj = httpUriFetcher$fetch$1.f10473d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = httpUriFetcher$fetch$1.f10475f;
        try {
            if (r2 == 0) {
                AbstractC3193b.m15359b(obj);
                sz6 sz6Var = this.f10479b;
                boolean readEnabled = sz6Var.f61672n.getReadEnabled();
                String str = this.f10478a;
                if (!readEnabled || (l18Var = (l18) this.f10481d.getValue()) == null) {
                    k18Var = null;
                } else {
                    String str2 = sz6Var.f61667i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    C0860a c0860a = l18Var.f48900b;
                    ByteString byteString = ByteString.f54513d;
                    ch2 ch2VarM4960c = c0860a.m4960c(iy5.m14193h(str2).mo18077c("SHA-256").mo18079e());
                    if (ch2VarM4960c != null) {
                        k18Var = new k18(ch2VarM4960c);
                    } else {
                        k18Var = null;
                    }
                }
                if (k18Var != null) {
                    u33 u33VarM4970c = m4970c();
                    ch2 ch2Var = k18Var.f46559a;
                    if (ch2Var.f10083b) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l = (Long) u33VarM4970c.m22435u((d57) ch2Var.f10082a.f639c.get(0)).f60615e;
                    if (l != null && l.longValue() == 0) {
                        return new ee9(m4973g(k18Var), m4968d(str, null), DataSource.DISK);
                    }
                    if (!this.f10482e) {
                        n33 n33VarM4973g = m4973g(k18Var);
                        jl0 jl0VarM4972f = m4972f(k18Var);
                        return new ee9(n33VarM4973g, m4968d(str, jl0VarM4972f != null ? (xv5) jl0VarM4972f.f45661b.getValue() : null), DataSource.DISK);
                    }
                    ll0VarM15327a = new kl0(m4971e(), m4972f(k18Var)).m15327a();
                    jl0 jl0Var = ll0VarM15327a.f49792b;
                    if (ll0VarM15327a.f49791a == null && jl0Var != null) {
                        return new ee9(m4973g(k18Var), m4968d(str, (xv5) jl0Var.f45661b.getValue()), DataSource.DISK);
                    }
                } else {
                    ll0VarM15327a = new kl0(m4971e(), null).m15327a();
                }
                co7 co7Var = ll0VarM15327a.f49791a;
                co7Var.getClass();
                httpUriFetcher$fetch$1.f10470a = this;
                httpUriFetcher$fetch$1.f10471b = k18Var;
                httpUriFetcher$fetch$1.f10472c = ll0VarM15327a;
                httpUriFetcher$fetch$1.f10475f = 1;
                objM4969b = m4969b(co7Var, httpUriFetcher$fetch$1);
                if (objM4969b == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j88Var = (j88) httpUriFetcher$fetch$1.f10472c;
                k18Var2 = httpUriFetcher$fetch$1.f10471b;
                c0861a = httpUriFetcher$fetch$1.f10470a;
                try {
                    AbstractC3193b.m15359b(obj);
                    j88Var2 = (j88) obj;
                    try {
                        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                        m88Var = j88Var2.f45207g;
                        if (m88Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        c0861a.getClass();
                        hj0 hj0VarMo3003e = m88Var.mo3003e();
                        Context context = c0861a.f10479b.f61659a;
                        ae9 ae9Var = new ae9(hj0VarMo3003e, null);
                        String strM4968d = m4968d(c0861a.f10478a, m88Var.mo3002c());
                        if (j88Var2.f45209i != null) {
                            dataSource = DataSource.NETWORK;
                        } else {
                            dataSource = DataSource.DISK;
                        }
                        return new ee9(ae9Var, strM4968d, dataSource);
                    } catch (Exception e) {
                        e = e;
                        j88Var = j88Var2;
                        try {
                            AbstractC3057h.m12986a(j88Var);
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            r2 = k18Var2;
                            if (r2 != 0) {
                                AbstractC3057h.m12986a(r2);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    AbstractC3057h.m12986a(j88Var);
                    throw e;
                }
            }
            ll0 ll0Var = (ll0) httpUriFetcher$fetch$1.f10472c;
            k18Var = httpUriFetcher$fetch$1.f10471b;
            C0861a c0861a2 = httpUriFetcher$fetch$1.f10470a;
            AbstractC3193b.m15359b(obj);
            ll0VarM15327a = ll0Var;
            this = c0861a2;
            objM4969b = obj;
            j88 j88Var3 = (j88) objM4969b;
            Bitmap.Config[] configArr2 = AbstractC3057h.f41581a;
            m88 m88Var2 = j88Var3.f45207g;
            if (m88Var2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                k18 k18VarM4974h = this.m4974h(k18Var, ll0VarM15327a.f49791a, j88Var3, ll0VarM15327a.f49792b);
                String str3 = this.f10478a;
                try {
                    if (k18VarM4974h != null) {
                        n33 n33VarM4973g2 = this.m4973g(k18VarM4974h);
                        jl0 jl0VarM4972f2 = this.m4972f(k18VarM4974h);
                        return new ee9(n33VarM4973g2, m4968d(str3, jl0VarM4972f2 != null ? (xv5) jl0VarM4972f2.f45661b.getValue() : null), DataSource.NETWORK);
                    }
                    if (m88Var2.mo3003e().mo464P(1L)) {
                        hj0 hj0VarMo3003e2 = m88Var2.mo3003e();
                        Context context2 = this.f10479b.f61659a;
                        return new ee9(new ae9(hj0VarMo3003e2, null), m4968d(str3, m88Var2.mo3002c()), j88Var3.f45209i != null ? DataSource.NETWORK : DataSource.DISK);
                    }
                    AbstractC3057h.m12986a(j88Var3);
                    co7 co7VarM4971e = this.m4971e();
                    httpUriFetcher$fetch$1.f10470a = this;
                    httpUriFetcher$fetch$1.f10471b = k18VarM4974h;
                    httpUriFetcher$fetch$1.f10472c = j88Var3;
                    httpUriFetcher$fetch$1.f10475f = 2;
                    Object objM4969b2 = this.m4969b(co7VarM4971e, httpUriFetcher$fetch$1);
                    if (objM4969b2 != coroutineSingletons) {
                        k18Var2 = k18VarM4974h;
                        obj = objM4969b2;
                        c0861a = this;
                        j88Var = j88Var3;
                        j88Var2 = (j88) obj;
                        Bitmap.Config[] configArr3 = AbstractC3057h.f41581a;
                        m88Var = j88Var2.f45207g;
                        if (m88Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        c0861a.getClass();
                        hj0 hj0VarMo3003e3 = m88Var.mo3003e();
                        Context context3 = c0861a.f10479b.f61659a;
                        ae9 ae9Var2 = new ae9(hj0VarMo3003e3, null);
                        String strM4968d2 = m4968d(c0861a.f10478a, m88Var.mo3002c());
                        if (j88Var2.f45209i != null) {
                            dataSource = DataSource.NETWORK;
                        } else {
                            dataSource = DataSource.DISK;
                        }
                        return new ee9(ae9Var2, strM4968d2, dataSource);
                    }
                    return coroutineSingletons;
                } catch (Exception e4) {
                    k18Var2 = k18VarM4974h;
                    e = e4;
                    j88Var = j88Var3;
                    AbstractC3057h.m12986a(j88Var);
                    throw e;
                }
            } catch (Exception e5) {
                e = e5;
                k18Var2 = k18Var;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m4969b(co7 co7Var, ContinuationImpl continuationImpl) throws Throwable {
        HttpUriFetcher$executeNetworkRequest$1 httpUriFetcher$executeNetworkRequest$1;
        j88 j88VarExecute;
        if (continuationImpl instanceof HttpUriFetcher$executeNetworkRequest$1) {
            httpUriFetcher$executeNetworkRequest$1 = (HttpUriFetcher$executeNetworkRequest$1) continuationImpl;
            int i = httpUriFetcher$executeNetworkRequest$1.f10469c;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$executeNetworkRequest$1.f10469c = i - Integer.MIN_VALUE;
            } else {
                httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuationImpl);
            }
        } else {
            httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuationImpl);
        }
        Object objM21466r = httpUriFetcher$executeNetworkRequest$1.f10467a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = httpUriFetcher$executeNetworkRequest$1.f10469c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21466r);
            Bitmap.Config[] configArr = AbstractC3057h.f41581a;
            boolean zM11650l = fa4.m11650l(Looper.myLooper(), Looper.getMainLooper());
            cs4 cs4Var = this.f10480c;
            if (!zM11650l) {
                dr6 dr6Var = (dr6) cs4Var.getValue();
                dr6Var.getClass();
                co7Var.getClass();
                i18 i18Var = new i18(dr6Var, co7Var);
                httpUriFetcher$executeNetworkRequest$1.f10469c = 1;
                sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(httpUriFetcher$executeNetworkRequest$1));
                sm0Var.m21468u();
                cm1 cm1Var = new cm1(0, i18Var, sm0Var);
                FirebasePerfOkHttpClient.enqueue(i18Var, cm1Var);
                sm0Var.m21470w(cm1Var);
                objM21466r = sm0Var.m21466r();
                if (objM21466r == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (this.f10479b.f61673o.getReadEnabled()) {
                    throw new NetworkOnMainThreadException();
                }
                dr6 dr6Var2 = (dr6) cs4Var.getValue();
                dr6Var2.getClass();
                co7Var.getClass();
                j88VarExecute = FirebasePerfOkHttpClient.execute(new i18(dr6Var2, co7Var));
            }
            if (!j88VarExecute.f45200L || j88VarExecute.f45204d == 304) {
                return j88VarExecute;
            }
            m88 m88Var = j88VarExecute.f45207g;
            if (m88Var != null) {
                AbstractC3057h.m12986a(m88Var);
            }
            throw new HttpException(j88VarExecute);
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM21466r);
        j88VarExecute = (j88) objM21466r;
        if (j88VarExecute.f45200L) {
        }
        return j88VarExecute;
    }

    /* JADX INFO: renamed from: c */
    public final u33 m4970c() {
        Object value = this.f10481d.getValue();
        value.getClass();
        return ((l18) value).f48899a;
    }

    /* JADX INFO: renamed from: e */
    public final co7 m4971e() {
        w41 w41Var = new w41(13);
        w41Var.m23718L(this.f10478a);
        sz6 sz6Var = this.f10479b;
        qr3 qr3Var = sz6Var.f61668j;
        CachePolicy cachePolicy = sz6Var.f61672n;
        qr3Var.getClass();
        w41Var.f66367c = qr3Var.m20123g();
        for (Map.Entry entry : sz6Var.f61669k.f34433a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            w41Var.f66369e = ((pk9) w41Var.f66369e).mo16144v(y38.m24933a((Class) key), value);
        }
        boolean readEnabled = cachePolicy.getReadEnabled();
        boolean readEnabled2 = sz6Var.f61673o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            w41Var.m23725l(gl0.f40925o);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                w41Var.m23725l(f10477g);
            }
        } else if (cachePolicy.getWriteEnabled()) {
            w41Var.m23725l(gl0.f40924n);
        } else {
            w41Var.m23725l(f10476f);
        }
        return new co7(w41Var);
    }

    /* JADX INFO: renamed from: f */
    public final jl0 m4972f(k18 k18Var) throws Throwable {
        Throwable th;
        jl0 jl0Var;
        try {
            u33 u33VarM4970c = m4970c();
            ch2 ch2Var = k18Var.f46559a;
            if (ch2Var.f10083b) {
                throw new IllegalStateException("snapshot is closed");
            }
            e18 e18VarM20390p = r46.m20390p(u33VarM4970c.mo261N((d57) ch2Var.f10082a.f639c.get(0)));
            try {
                jl0Var = new jl0(e18VarM20390p);
                try {
                    e18VarM20390p.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    e18VarM20390p.close();
                } catch (Throwable th4) {
                    lda.m16117c(th3, th4);
                }
                th = th3;
                jl0Var = null;
            }
            if (th == null) {
                return jl0Var;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final n33 m4973g(k18 k18Var) {
        ch2 ch2Var = k18Var.f46559a;
        if (ch2Var.f10083b) {
            C3386nv.m17633t("snapshot is closed");
            return null;
        }
        d57 d57Var = (d57) ch2Var.f10082a.f639c.get(1);
        u33 u33VarM4970c = m4970c();
        String str = this.f10479b.f61667i;
        if (str == null) {
            str = this.f10478a;
        }
        return new n33(d57Var, u33VarM4970c, str, k18Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX INFO: renamed from: h */
    public final k18 m4974h(k18 k18Var, co7 co7Var, j88 j88Var, jl0 jl0Var) {
        or3 or3Var;
        Throwable th;
        C3552rx c3552rxM4959b;
        Throwable th2 = null;
        if (this.f10479b.f61672n.getWriteEnabled() && (!this.f10482e || (!co7Var.m4934j().f40927b && !j88Var.m14325a().f40927b && !fa4.m11650l(j88Var.f45206f.m20121d("Vary"), "*")))) {
            if (k18Var != null) {
                ch2 ch2Var = k18Var.f46559a;
                C0860a c0860a = ch2Var.f10084c;
                synchronized (c0860a) {
                    ch2Var.close();
                    c3552rxM4959b = c0860a.m4959b(ch2Var.f10082a.f637a);
                }
                if (c3552rxM4959b != null) {
                    or3Var = new or3(c3552rxM4959b);
                } else {
                    or3Var = null;
                }
            } else {
                l18 l18Var = (l18) this.f10481d.getValue();
                if (l18Var == null) {
                    or3Var = null;
                } else {
                    String str = this.f10479b.f61667i;
                    if (str == null) {
                        str = this.f10478a;
                    }
                    C0860a c0860a2 = l18Var.f48900b;
                    ByteString byteString = ByteString.f54513d;
                    C3552rx c3552rxM4959b2 = c0860a2.m4959b(iy5.m14193h(str).mo18077c("SHA-256").mo18079e());
                    if (c3552rxM4959b2 != null) {
                        or3Var = new or3(c3552rxM4959b2);
                    } else {
                        or3Var = null;
                    }
                }
            }
            if (or3Var != null) {
                try {
                    try {
                        if (j88Var.f45204d != 304 || jl0Var == null) {
                            d18 d18VarM20389o = r46.m20389o(m4970c().mo260J(((C3552rx) or3Var.f54782a).m20971f(0)));
                            try {
                                new jl0(j88Var).m14531a(d18VarM20389o);
                                try {
                                    d18VarM20389o.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    d18VarM20389o.close();
                                } catch (Throwable th5) {
                                    lda.m16117c(th4, th5);
                                }
                                th = th4;
                            }
                            if (th != null) {
                                throw th;
                            }
                            d18 d18VarM20389o2 = r46.m20389o(m4970c().mo260J(((C3552rx) or3Var.f54782a).m20971f(1)));
                            try {
                                m88 m88Var = j88Var.f45207g;
                                m88Var.getClass();
                                m88Var.mo3003e().mo458E(d18VarM20389o2);
                                try {
                                    d18VarM20389o2.close();
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                try {
                                    d18VarM20389o2.close();
                                } catch (Throwable th8) {
                                    lda.m16117c(th2, th8);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        } else {
                            h88 h88VarM14326b = j88Var.m14326b();
                            h88VarM14326b.f41984f = AbstractC3122is.m14096j(jl0Var.f45665f, j88Var.f45206f).m20123g();
                            j88 j88VarM13143a = h88VarM14326b.m13143a();
                            d18 d18VarM20389o3 = r46.m20389o(m4970c().mo260J(((C3552rx) or3Var.f54782a).m20971f(0)));
                            try {
                                new jl0(j88VarM13143a).m14531a(d18VarM20389o3);
                                try {
                                    d18VarM20389o3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                th2 = th10;
                                try {
                                    d18VarM20389o3.close();
                                } catch (Throwable th11) {
                                    lda.m16117c(th2, th11);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        k18 k18VarM18310y = or3Var.m18310y();
                        AbstractC3057h.m12986a(j88Var);
                        return k18VarM18310y;
                    } catch (Exception e) {
                        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                        try {
                            ((C3552rx) or3Var.f54782a).m20969d(false);
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                } catch (Throwable th12) {
                    AbstractC3057h.m12986a(j88Var);
                    throw th12;
                }
            }
        } else if (k18Var != null) {
            AbstractC3057h.m12986a(k18Var);
        }
        return null;
    }
}
