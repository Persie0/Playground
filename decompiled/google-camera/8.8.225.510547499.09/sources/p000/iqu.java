package p000;

import android.text.TextUtils;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqu {

    /* JADX INFO: renamed from: d */
    private static final Duration f31826d = Duration.ofSeconds(1);

    /* JADX INFO: renamed from: e */
    private static final Duration f31827e = Duration.ofSeconds(5);

    /* JADX INFO: renamed from: b */
    public kbo f31829b;

    /* JADX INFO: renamed from: c */
    public final jdz f31830c;

    /* JADX INFO: renamed from: f */
    private final Executor f31831f;

    /* JADX INFO: renamed from: h */
    private final jdz f31833h;

    /* JADX INFO: renamed from: i */
    private final jdz f31834i;

    /* JADX INFO: renamed from: a */
    public String f31828a = null;

    /* JADX INFO: renamed from: g */
    private final Executor f31832g = Executors.newSingleThreadExecutor();

    public iqu(Executor executor, kbo kboVar, jdz jdzVar, jdz jdzVar2, jdz jdzVar3) {
        this.f31831f = executor;
        this.f31829b = kboVar;
        this.f31830c = jdzVar;
        this.f31833h = jdzVar2;
        this.f31834i = jdzVar3;
    }

    /* JADX INFO: renamed from: f */
    private final Set m11611f() {
        final nqf nqfVarM17621g = nqf.m17621g();
        jec jecVar = this.f31833h.f33826i;
        jib.m13196a(true);
        jrn jrnVar = new jrn(jecVar);
        jecVar.mo12967b(jrnVar);
        jib.m13207l(jrnVar, jti.f34770b).mo13455h(this.f31832g, new jpj() { // from class: iqs
            @Override // p000.jpj
            /* JADX INFO: renamed from: a */
            public final void mo8108a(jpp jppVar) {
                iqu iquVar = this.f31821a;
                nqf nqfVar = nqfVarM17621g;
                try {
                    jqq jqqVar = (jqq) jppVar.mo13450c();
                    if (jqqVar != null) {
                        nqfVar.mo14894e(jqqVar.mo13472a());
                    } else {
                        nqfVar.mo14894e(null);
                    }
                } catch (jpo e) {
                    iquVar.f31829b.mo13948j("getCapability fail with exception ", e);
                    nqfVar.mo14894e(null);
                }
            }
        });
        try {
            return (Set) nqfVarM17621g.get(f31827e.getSeconds(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f31829b.mo13941c("Failed to getNodesByCapabilitySync.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m11612a() {
        Set<jtn> setM11611f = m11611f();
        String str = null;
        if (setM11611f == null || setM11611f.isEmpty()) {
            this.f31829b.mo13940b("findBestNode failed!");
            return null;
        }
        for (jtn jtnVar : setM11611f) {
            this.f31829b.mo13940b("Check node: ".concat(String.valueOf(jtnVar.f34783a)));
            if (!TextUtils.isEmpty(jtnVar.f34783a)) {
                str = jtnVar.f34783a;
                if (jtnVar.f34786d) {
                    String str2 = jtnVar.f34784b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    this.f31829b.mo13940b("findBestNodeSync() - Found node id: " + str + ", name: " + str2);
                    break;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m11613b(String str, Runnable runnable) {
        this.f31831f.execute(new gxn(this, str, runnable, 17));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11614c() {
        final nqf nqfVarM17621g = nqf.m17621g();
        jec jecVar = this.f31834i.f33826i;
        jtl jtlVar = new jtl(jecVar);
        jecVar.mo12967b(jtlVar);
        jib.m13207l(jtlVar, jti.f34771c).mo13455h(this.f31832g, new jpj() { // from class: iqr
            @Override // p000.jpj
            /* JADX INFO: renamed from: a */
            public final void mo8108a(jpp jppVar) {
                iqu iquVar = this.f31819a;
                nqf nqfVar = nqfVarM17621g;
                try {
                    List list = (List) jppVar.mo13450c();
                    if (list != null) {
                        nqfVar.mo14894e(Boolean.valueOf(!list.isEmpty()));
                    } else {
                        nqfVar.mo14894e(false);
                    }
                } catch (jpo e) {
                    iquVar.f31829b.mo13948j("getConnectedNodes fail with exception ", e);
                    nqfVar.mo14894e(false);
                }
            }
        });
        try {
            return ((Boolean) nqfVarM17621g.get(f31826d.getSeconds(), TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f31829b.mo13948j("Failed to process isWearDeviceExistSync.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11615d(String str, byte[] bArr) {
        if (TextUtils.isEmpty(this.f31828a)) {
            this.f31828a = m11612a();
        }
        String str2 = this.f31828a;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m11616e(str2, str, bArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m11616e(String str, final String str2, byte[] bArr) {
        final nqf nqfVarM17621g = nqf.m17621g();
        jec jecVar = this.f31830c.f33826i;
        jtg jtgVar = new jtg(jecVar, str, str2, bArr);
        jecVar.mo12967b(jtgVar);
        jib.m13207l(jtgVar, jti.f34769a).mo13455h(this.f31831f, new jpj() { // from class: iqt
            @Override // p000.jpj
            /* JADX INFO: renamed from: a */
            public final void mo8108a(jpp jppVar) {
                iqu iquVar = this.f31823a;
                nqf nqfVar = nqfVarM17621g;
                String str3 = str2;
                try {
                    nqfVar.mo14894e((Integer) jppVar.mo13450c());
                } catch (jpo e) {
                    iquVar.f31829b.mo13948j("sendMessage() - Message:" + str3 + " sent fail with exception ", e);
                    nqfVar.mo14894e(null);
                }
            }
        });
        if (!str2.equals("/sending_time") && !str2.equals("/preview")) {
            this.f31829b.mo13940b(PMZiHihxLGEy.KHrfZEzJh + str2 + " sent: " + nqfVarM17621g.toString());
        }
        try {
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f31829b.mo13945g("sendMessage() - Timeout to get result.", e);
        }
    }
}
