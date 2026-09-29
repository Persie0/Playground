package p000;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.play_billing.AbstractC0997h;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gw9 implements InterfaceC3117in, d90, js6, xdc, a58, tr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41431a;

    /* JADX INFO: renamed from: b */
    public final Object f41432b;

    public gw9(int i) {
        this.f41431a = i;
        switch (i) {
            case 9:
                this.f41432b = new tld();
                break;
            default:
                this.f41432b = v1c.m23047a();
                break;
        }
    }

    @Override // p000.xdc
    /* JADX INFO: renamed from: a */
    public fgc mo12668a(Class cls) {
        for (int i = 0; i < 2; i++) {
            xdc xdcVar = ((xdc[]) this.f41432b)[i];
            if (xdcVar.mo12669c(cls)) {
                return xdcVar.mo12668a(cls);
            }
        }
        C3386nv.m17636w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p000.a58
    public /* synthetic */ void accept(Object obj, Object obj2) {
        ((suc) ((yuc) obj).m11611l()).m21746R(new lrc((ltc) this.f41432b, (wr9) obj2));
    }

    /* JADX INFO: renamed from: b */
    public e8a m12934b() {
        List listUnmodifiableList;
        b8a b8aVarM10924L = e8a.m10924L();
        b8aVarM10924L.m3482m(((Trace) this.f41432b).f13775d);
        b8aVarM10924L.m3480k(((Trace) this.f41432b).f13782k.f13787a);
        Trace trace = (Trace) this.f41432b;
        b8aVarM10924L.m3481l(trace.f13782k.m6743b(trace.f13783l));
        for (Counter counter : ((Trace) this.f41432b).f13776e.values()) {
            b8aVarM10924L.m3479j(counter.f13769a, counter.f13770b.get());
        }
        ArrayList arrayList = ((Trace) this.f41432b).f13779h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b8aVarM10924L.m3478i(new gw9((Trace) it.next(), 1).m12934b());
            }
        }
        Map<String, String> attributes = ((Trace) this.f41432b).getAttributes();
        b8aVarM10924L.m22767h();
        e8a.m10929w((e8a) b8aVarM10924L.f64019b).putAll(attributes);
        Trace trace2 = (Trace) this.f41432b;
        synchronized (trace2.f13778g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.f13778g) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        c77[] c77VarArrM6733b = PerfSession.m6733b(listUnmodifiableList);
        if (c77VarArrM6733b != null) {
            List listAsList = Arrays.asList(c77VarArrM6733b);
            b8aVarM10924L.m22767h();
            e8a.m10931y((e8a) b8aVarM10924L.f64019b, listAsList);
        }
        return (e8a) b8aVarM10924L.m22766g();
    }

    @Override // p000.xdc
    /* JADX INFO: renamed from: c */
    public boolean mo12669c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((xdc[]) this.f41432b)[i].mo12669c(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public long m12935d(long j) {
        cn5 cn5Var = (cn5) this.f41432b;
        cn5Var.getClass();
        if (dpa.m10571b(j) <= 0.0f || dpa.m10572c(j) <= 0.0f) {
            i54.m13663b("maximumVelocity should be a positive value. You specified=" + ((Object) dpa.m10576g(j)));
        }
        return uea.m22716a(((fpa) cn5Var.f10327b).m11989b(dpa.m10571b(j)), ((fpa) cn5Var.f10328c).m11989b(dpa.m10572c(j)));
    }

    /* JADX INFO: renamed from: e */
    public void m12936e() {
        s6d s6dVar = (s6d) this.f41432b;
        s6dVar.mo12359D();
        kjc kjcVar = (kjc) s6dVar.f60774a;
        qfc qfcVar = kjcVar.f47437e;
        kjc.m15278j(qfcVar);
        kjcVar.f47443k.getClass();
        if (qfcVar.m19935M(System.currentTimeMillis())) {
            qfc qfcVar2 = kjcVar.f47437e;
            kjc.m15278j(qfcVar2);
            qfcVar2.f57734l.m22720b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17923a("Detected application was in foreground");
                m12940k(System.currentTimeMillis(), kjcVar.f47436d.m4869O(null, z8c.f71167e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void mo4558f(Task task) {
        svc svcVar = (svc) this.f41432b;
        if (task.mo5969k()) {
            svcVar.cancel(false);
            return;
        }
        if (task.mo5971m()) {
            svcVar.m6385m(task.mo5967i());
            return;
        }
        Exception excMo5966h = task.mo5966h();
        if (excMo5966h != null) {
            svcVar.m6386n(excMo5966h);
        } else {
            uk9.m22770c();
        }
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        ((wr9) ((nr9) this.f41432b).f53173a).f67208a.m22204s();
    }

    @Override // p000.InterfaceC3117in
    public b73 get(int i) {
        int i2 = this.f41431a;
        Object obj = this.f41432b;
        switch (i2) {
            case 3:
                return ((m73[]) obj)[i];
            default:
                return (b73) obj;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12937h(int i, String str, List list, boolean z, boolean z2) {
        occ occVar;
        shc shcVar = (shc) this.f41432b;
        int i2 = i - 1;
        if (i2 == 0) {
            xcc xccVar = ((kjc) shcVar.f60774a).f47438f;
            kjc.m15280l(xccVar);
            occVar = xccVar.f68075H;
        } else if (i2 != 1) {
            if (i2 == 3) {
                xcc xccVar2 = ((kjc) shcVar.f60774a).f47438f;
                kjc.m15280l(xccVar2);
                occVar = xccVar2.f68076I;
            } else if (i2 != 4) {
                xcc xccVar3 = ((kjc) shcVar.f60774a).f47438f;
                kjc.m15280l(xccVar3);
                occVar = xccVar3.f68086l;
            } else if (z) {
                xcc xccVar4 = ((kjc) shcVar.f60774a).f47438f;
                kjc.m15280l(xccVar4);
                occVar = xccVar4.f68084j;
            } else if (z2) {
                xcc xccVar5 = ((kjc) shcVar.f60774a).f47438f;
                kjc.m15280l(xccVar5);
                occVar = xccVar5.f68083i;
            } else {
                xcc xccVar6 = ((kjc) shcVar.f60774a).f47438f;
                kjc.m15280l(xccVar6);
                occVar = xccVar6.f68085k;
            }
        } else if (z) {
            xcc xccVar7 = ((kjc) shcVar.f60774a).f47438f;
            kjc.m15280l(xccVar7);
            occVar = xccVar7.f68081g;
        } else if (z2) {
            xcc xccVar8 = ((kjc) shcVar.f60774a).f47438f;
            kjc.m15280l(xccVar8);
            occVar = xccVar8.f68080f;
        } else {
            xcc xccVar9 = ((kjc) shcVar.f60774a).f47438f;
            kjc.m15280l(xccVar9);
            occVar = xccVar9.f68082h;
        }
        int size = list.size();
        if (size == 1) {
            occVar.m17924b(list.get(0), str);
            return;
        }
        if (size == 2) {
            occVar.m17925c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            occVar.m17923a(str);
        } else {
            occVar.m17926d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12938i(long j, long j2) {
        s6d s6dVar = (s6d) this.f41432b;
        s6dVar.mo12359D();
        s6dVar.m21133H();
        kjc kjcVar = (kjc) s6dVar.f60774a;
        qfc qfcVar = kjcVar.f47437e;
        kjc.m15278j(qfcVar);
        if (qfcVar.m19935M(j)) {
            kjc.m15278j(qfcVar);
            qfcVar.f57734l.m22720b(true);
            kjcVar.m15289q().m21927I();
        }
        kjc.m15278j(qfcVar);
        qfcVar.f57715K.m19953h(j);
        if (qfcVar.f57734l.m22719a()) {
            m12940k(j, j2);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m12939j(String str, Bundle bundle) {
        String string;
        kjc kjcVar = (kjc) this.f41432b;
        tic ticVar = kjcVar.f47439g;
        qfc qfcVar = kjcVar.f47437e;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        if (kjcVar.m15282f()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        kjc.m15278j(qfcVar);
        qfcVar.f57722R.m20981p(string);
        qg9 qg9Var = qfcVar.f57723S;
        kjcVar.f47443k.getClass();
        qg9Var.m19953h(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public void m12940k(long j, long j2) {
        s6d s6dVar = (s6d) this.f41432b;
        s6dVar.mo12359D();
        kjc kjcVar = (kjc) s6dVar.f60774a;
        if (kjcVar.m15282f()) {
            qfc qfcVar = kjcVar.f47437e;
            kjc.m15278j(qfcVar);
            qfcVar.f57715K.m19953h(j);
            kjcVar.f47443k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17924b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            C1043b c1043b = kjcVar.f47414H;
            kjc.m15279k(c1043b);
            c1043b.m5858O(j, lValueOf, "auto", "_sid");
            kjc.m15278j(qfcVar);
            qfcVar.f57716L.m19953h(j3);
            qfcVar.f57734l.m22720b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            kjc.m15279k(c1043b);
            c1043b.m5855L(j, j2, bundle, "auto", "_s");
            String strM20980o = qfcVar.f57721Q.m20980o();
            if (TextUtils.isEmpty(strM20980o)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM20980o);
            kjc.m15279k(c1043b);
            c1043b.m5855L(j, j2, bundle2, "auto", "_ssr");
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m12941l() {
        if (!m12942m()) {
            return false;
        }
        kjc kjcVar = (kjc) this.f41432b;
        kjcVar.f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        qfc qfcVar = kjcVar.f47437e;
        kjc.m15278j(qfcVar);
        return jCurrentTimeMillis - qfcVar.f57723S.m19952g() > kjcVar.f47436d.m4866L(null, z8c.f71178i0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m12942m() {
        qfc qfcVar = ((kjc) this.f41432b).f47437e;
        kjc.m15278j(qfcVar);
        return qfcVar.f57723S.m19952g() > 0;
    }

    /* JADX INFO: renamed from: n */
    public void m12943n(int i, Object obj, fjb fjbVar) {
        nhb nhbVar = (nhb) this.f41432b;
        bhb bhbVar = (bhb) obj;
        nhbVar.mo13256d(i, 2);
        nhbVar.mo13270r(bhbVar.mo3726b(fjbVar));
        fjbVar.mo11894c(bhbVar, this);
    }

    /* JADX INFO: renamed from: o */
    public void m12944o(int i, Object obj, lgc lgcVar) throws zzfa {
        z3c z3cVar = (z3c) this.f41432b;
        AbstractC0997h abstractC0997h = (AbstractC0997h) obj;
        z3cVar.m25444j(i, 2);
        z3cVar.m25446l(abstractC0997h.mo5531c(lgcVar));
        lgcVar.mo5564h(abstractC0997h, this);
    }

    @Override // p000.d90
    public void onConnectionFailed(ConnectionResult connectionResult) {
        ((ro3) this.f41432b).onConnectionFailed(connectionResult);
    }

    public gw9(rf4 rf4Var, dg4 dg4Var, Integer num) {
        this.f41431a = 2;
        this.f41432b = rf4Var;
    }

    public gw9(gw9 gw9Var, nr9 nr9Var) {
        this.f41431a = 7;
        this.f41432b = nr9Var;
        Objects.requireNonNull(gw9Var);
    }

    public gw9(nhb nhbVar) {
        this.f41431a = 8;
        this.f41432b = nhbVar;
        nhbVar.f52744a = this;
    }

    public gw9(z3c z3cVar) {
        this.f41431a = 10;
        Charset charset = m9c.f50823a;
        this.f41432b = z3cVar;
        z3cVar.f70845a = this;
    }

    public /* synthetic */ gw9(Object obj, int i) {
        this.f41431a = i;
        this.f41432b = obj;
    }

    public gw9(AbstractC3081hn abstractC3081hn, float f, float f2) {
        this.f41431a = 3;
        int iMo10484b = abstractC3081hn.mo10484b();
        m73[] m73VarArr = new m73[iMo10484b];
        for (int i = 0; i < iMo10484b; i++) {
            m73VarArr[i] = new m73(f, f2, abstractC3081hn.mo10483a(i));
        }
        this.f41432b = m73VarArr;
    }
}
