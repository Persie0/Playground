package p000;

import android.net.Uri;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadMethod;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.privacy.consent.internal.ConsentState;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class td4 extends bd4 {

    /* JADX INFO: renamed from: r */
    public static final String f62164r;

    /* JADX INFO: renamed from: s */
    public static final sq5 f62165s;

    /* JADX INFO: renamed from: q */
    public int f62166q;

    static {
        List list = se4.f60736a;
        f62164r = "JobInit";
        sj5 sj5VarM20396w = r46.m20396w();
        f62165s = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "JobInit");
    }

    /* JADX INFO: renamed from: q */
    public static void m21964q(ce4 ce4Var, p44 p44Var, p44 p44Var2) {
        if (((rl7) ce4Var.f9967b).m20700p().m14532E() == ConsentState.DECLINED) {
            boolean z = ((w83) p44Var.f55561j.f71355h).f66512b;
            boolean z2 = ((w83) p44Var2.f55561j.f71355h).f66512b;
            if (z != z2) {
                rl7 rl7Var = (rl7) ce4Var.f9967b;
                d74 d74Var = (d74) ce4Var.f9968c;
                g02 g02Var = (g02) ce4Var.f9969d;
                rk7 rk7Var = (rk7) ce4Var.f9971f;
                qq7 qq7Var = (qq7) ce4Var.f9972g;
                rl7Var.m20705u();
                synchronized (rl7.f59476R) {
                    sq5 sq5Var = rl7.f59475Q;
                    ((sj5) sq5Var.f61249c).m21420a(3, "Resetting the Kochava Device ID such that this will look like a new device", (String) sq5Var.f61248b, (String) sq5Var.f61250d);
                    rl7Var.f59494i.m11225F();
                    rl7Var.f59494i.m11229J(null);
                    zl7 zl7Var = rl7Var.f59495j;
                    synchronized (zl7Var) {
                        ((cj9) zl7Var.f60774a).m4782j("init.sent_time_millis", 0L);
                    }
                    zl7 zl7Var2 = rl7Var.f59495j;
                    synchronized (zl7Var2) {
                        zl7Var2.f71706d = 0L;
                        ((cj9) zl7Var2.f60774a).m4782j("init.received_time_millis", 0L);
                    }
                    zl7 zl7Var3 = rl7Var.f59495j;
                    synchronized (zl7Var3) {
                        zl7Var3.f71705c = false;
                        ((cj9) zl7Var3.f60774a).m4779g("init.ready", false);
                    }
                    synchronized (g02Var.m12257e()) {
                    }
                    rl7Var.m20701q();
                    rl7Var.f59496k.m570Q(0L);
                    rl7Var.f59496k.m566M(new e32());
                    am7 am7Var = rl7Var.f59496k;
                    dg4 dg4VarM10328c = dg4.m10328c();
                    synchronized (am7Var) {
                        am7Var.f846k = dg4VarM10328c;
                        ((cj9) am7Var.f60774a).m4781i("install.identity_link", dg4VarM10328c);
                    }
                    am7 am7Var2 = rl7Var.f59496k;
                    dg4 dg4VarM10328c2 = dg4.m10328c();
                    synchronized (am7Var2) {
                        am7Var2.f847l = dg4VarM10328c2;
                        ((cj9) am7Var2.f60774a).m4781i("install.custom_device_identifiers", dg4VarM10328c2);
                    }
                    rl7Var.f59483N.m17826f();
                    rl7Var.f59477H.m21449G(dg4.m10328c());
                    rl7Var.f59477H.m21450H();
                    sl7 sl7Var = rl7Var.f59477H;
                    synchronized (sl7Var) {
                        ((cj9) sl7Var.f60774a).m4782j("engagement.push_token_sent_time_millis", 0L);
                    }
                    rl7Var.f59480K.m17826f();
                    rl7Var.f59484O.m17826f();
                    rl7Var.f59485P.m17826f();
                    rl7Var.m20688c(d74Var, g02Var, rk7Var, qq7Var);
                }
                if (!z2) {
                    ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.ConsentUnrestricted);
                }
            }
        }
        String str = p44Var2.f55557f.f66375b;
        if (!b34.m3255w(str) && !str.equals(p44Var.f55557f.f66375b)) {
            f62165s.m21555D("Install resend ID changed");
            ((rl7) ce4Var.f9967b).m20701q();
        }
        String str2 = p44Var2.f55562k.f66375b;
        if (!b34.m3255w(str2) && !str2.equals(p44Var.f55562k.f66375b)) {
            f62165s.m21555D("Push Token resend ID changed");
            sl7 sl7VarM20690f = ((rl7) ce4Var.f9967b).m20690f();
            synchronized (sl7VarM20690f) {
                ((cj9) sl7VarM20690f.f60774a).m4782j("engagement.push_token_sent_time_millis", 0L);
            }
        }
        String str3 = p44Var2.f55555d.f63392c;
        if (!b34.m3255w(str3)) {
            f62165s.m21555D("Applying App GUID override");
            ((rl7) ce4Var.f9967b).m20699o().m11228I(str3);
        }
        String str4 = p44Var2.f55555d.f63393d;
        if (b34.m3255w(str4)) {
            return;
        }
        f62165s.m21555D("Applying KDID override");
        ((rl7) ce4Var.f9967b).m20699o().m11229J(str4);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: g */
    public final ie4 mo296g(ce4 ce4Var, JobAction jobAction) {
        boolean z;
        PayloadType payloadType = PayloadType.Init;
        String string = payloadType.getUrl().toString();
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10331B("url", string);
        long j = ((d74) ce4Var.f9968c).f35078b;
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        long jM11226G = rl7Var.m20699o().m11226G();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hz8 hz8Var = (hz8) ce4Var.f9970e;
        long jM13601f = hz8Var.m13601f();
        synchronized (hz8Var) {
            z = hz8Var.f43253h;
        }
        int iM13599d = hz8Var.m13599d();
        sq5 sq5Var = l67.f49186l;
        l67 l67Var = new l67(new n67(payloadType, PayloadMethod.Post, j, jM11226G, jCurrentTimeMillis, jM13601f, z, iM13599d), dg4.m10328c(), dg4VarM10328c, Uri.EMPTY, 0, true, true, true, false, null, false);
        d74 d74Var = (d74) ce4Var.f9968c;
        l67Var.m15902e(d74Var.f35077a, (g02) ce4Var.f9969d);
        sq5 sq5Var2 = f62165s;
        r46.m20394u(sq5Var2, "Sending kvinit at " + ci8.m4710W(d74Var.f35078b) + " seconds to " + string);
        nk6 nk6VarM15906i = l67Var.m15906i(d74Var.f35077a, this.f62166q, rl7Var.m20693i().m25692F().f55560i.m24936a());
        long j2 = nk6VarM15906i.f52881c;
        if (!m3644o()) {
            return ie4.m13807a();
        }
        if (nk6VarM15906i.f52879a) {
            return ie4.m13808b(nk6VarM15906i);
        }
        payloadType.incrementRotationUrlIndex();
        if (!payloadType.isRotationUrlRotated()) {
            sq5Var2.m21555D("Transmit failed, retrying immediately with rotated URL");
            return ie4.m13810d(0L);
        }
        zl7 zl7VarM20693i = rl7Var.m20693i();
        synchronized (zl7VarM20693i) {
            zl7VarM20693i.f71710h = true;
            ((cj9) zl7VarM20693i.f60774a).m4779g("init.rotation_url_rotated", true);
        }
        sq5Var2.m21555D("Transmit failed, retrying after " + (j2 / 1000.0d) + " seconds");
        this.f62166q = this.f62166q + 1;
        return ie4.m13810d(j2);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: h */
    public final void mo297h(ce4 ce4Var, Object obj, boolean z) {
        nk6 nk6Var = (nk6) obj;
        if (nk6Var == null) {
            f62165s.m21555D("Completed without response data");
            return;
        }
        p44 p44VarM25692F = ((rl7) ce4Var.f9967b).m20693i().m25692F();
        if (!nk6Var.f52879a) {
            C3386nv.m17633t("Data not accessible on failure.");
            return;
        }
        p44 p44VarM18883a = p44.m18883a(nk6Var.f52885g.m20646a());
        zl7 zl7VarM20693i = ((rl7) ce4Var.f9967b).m20693i();
        int rotationUrlIndex = PayloadType.Init.getRotationUrlIndex();
        synchronized (zl7VarM20693i) {
            zl7VarM20693i.f71709g = rotationUrlIndex;
            ((cj9) zl7VarM20693i.f60774a).m4780h(rotationUrlIndex, "init.rotation_url_index");
        }
        zl7 zl7VarM20693i2 = ((rl7) ce4Var.f9967b).m20693i();
        synchronized (zl7VarM20693i2) {
            zl7VarM20693i2.f71707e = p44VarM18883a;
            ((cj9) zl7VarM20693i2.f60774a).m4781i("init.response", p44VarM18883a.m18884b());
        }
        zl7 zl7VarM20693i3 = ((rl7) ce4Var.f9967b).m20693i();
        long j = nk6Var.f52882d;
        synchronized (zl7VarM20693i3) {
            ((cj9) zl7VarM20693i3.f60774a).m4782j("init.sent_time_millis", j);
        }
        zl7 zl7VarM20693i4 = ((rl7) ce4Var.f9967b).m20693i();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zl7VarM20693i4) {
            zl7VarM20693i4.f71706d = jCurrentTimeMillis;
            ((cj9) zl7VarM20693i4.f60774a).m4782j("init.received_time_millis", jCurrentTimeMillis);
        }
        zl7 zl7VarM20693i5 = ((rl7) ce4Var.f9967b).m20693i();
        synchronized (zl7VarM20693i5) {
            zl7VarM20693i5.f71705c = true;
            ((cj9) zl7VarM20693i5.f60774a).m4779g("init.ready", true);
        }
        m21964q(ce4Var, p44VarM25692F, p44VarM18883a);
        ((rl7) ce4Var.f9967b).m20688c((d74) ce4Var.f9968c, (g02) ce4Var.f9969d, (rk7) ce4Var.f9971f, (qq7) ce4Var.f9972g);
        sq5 sq5Var = f62165s;
        sq5Var.m21555D("Init Configuration");
        sq5Var.m21555D(p44VarM18883a.m18884b());
        ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.InitCompleted);
        StringBuilder sb = new StringBuilder("Intelligent Consent is ");
        sb.append(((w83) p44VarM18883a.f55561j.f71355h).f66511a ? "Enabled" : "Disabled");
        sb.append(" and ");
        sb.append(((w83) p44VarM18883a.f55561j.f71355h).f66512b ? "applies" : "does not apply");
        sb.append(" to this user");
        r46.m20394u(sq5Var, sb.toString());
        if (((w83) p44VarM18883a.f55561j.f71355h).f66511a) {
            sq5Var.m21555D("Intelligent Consent status is " + ((rl7) ce4Var.f9967b).m20700p().m14532E().key);
        }
        r46.m20394u(sq5Var, "Completed kvinit at " + ci8.m4710W(((d74) ce4Var.f9968c).f35078b) + " seconds with a network duration of " + (nk6Var.f52883e / 1000.0d) + " seconds");
        StringBuilder sb2 = new StringBuilder("The install ");
        sb2.append(((rl7) ce4Var.f9967b).m20694j().m562I() ? "has already" : "has not yet");
        sb2.append(" been sent");
        r46.m20394u(sq5Var, sb2.toString());
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: i */
    public final void mo298i(ce4 ce4Var) {
        int i;
        int i2;
        boolean z;
        this.f62166q = 1;
        PayloadType payloadType = PayloadType.Init;
        zl7 zl7VarM20693i = ((rl7) ce4Var.f9967b).m20693i();
        synchronized (zl7VarM20693i) {
            i = zl7VarM20693i.f71708f;
        }
        zl7 zl7VarM20693i2 = ((rl7) ce4Var.f9967b).m20693i();
        synchronized (zl7VarM20693i2) {
            i2 = zl7VarM20693i2.f71709g;
        }
        zl7 zl7VarM20693i3 = ((rl7) ce4Var.f9967b).m20693i();
        synchronized (zl7VarM20693i3) {
            z = zl7VarM20693i3.f71710h;
        }
        payloadType.loadRotationUrl(i, i2, z);
        zl7 zl7VarM20693i4 = ((rl7) ce4Var.f9967b).m20693i();
        int rotationUrlDate = payloadType.getRotationUrlDate();
        synchronized (zl7VarM20693i4) {
            zl7VarM20693i4.f71708f = rotationUrlDate;
            ((cj9) zl7VarM20693i4.f60774a).m4780h(rotationUrlDate, "init.rotation_url_date");
        }
        zl7 zl7VarM20693i5 = ((rl7) ce4Var.f9967b).m20693i();
        int rotationUrlIndex = payloadType.getRotationUrlIndex();
        synchronized (zl7VarM20693i5) {
            zl7VarM20693i5.f71709g = rotationUrlIndex;
            ((cj9) zl7VarM20693i5.f60774a).m4780h(rotationUrlIndex, "init.rotation_url_index");
        }
        zl7 zl7VarM20693i6 = ((rl7) ce4Var.f9967b).m20693i();
        boolean zIsRotationUrlRotated = payloadType.isRotationUrlRotated();
        synchronized (zl7VarM20693i6) {
            zl7VarM20693i6.f71710h = zIsRotationUrlRotated;
            ((cj9) zl7VarM20693i6.f60774a).m4779g("init.rotation_url_rotated", zIsRotationUrlRotated);
        }
        ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.InitStarted);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: l */
    public final jj5 mo299l(ce4 ce4Var) {
        return new jj5(12);
    }

    @Override // p000.bd4
    /* JADX INFO: renamed from: n */
    public final boolean mo300n(ce4 ce4Var) {
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        p44 p44VarM25692F = rl7Var.m20693i().m25692F();
        long jM25691E = rl7Var.m20693i().m25691E();
        return jM25691E + ci8.m4705R(p44VarM25692F.f55553b.f58600a) > System.currentTimeMillis() && ((jM25691E > ((d74) ce4Var.f9968c).f35078b ? 1 : (jM25691E == ((d74) ce4Var.f9968c).f35078b ? 0 : -1)) >= 0);
    }
}
