package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public class wmd implements rt5, t44 {

    /* JADX INFO: renamed from: d */
    public static final wmd f67075d;

    /* JADX INFO: renamed from: a */
    public boolean f67076a;

    /* JADX INFO: renamed from: b */
    public final Object f67077b;

    /* JADX INFO: renamed from: c */
    public final Object f67078c;

    static {
        String str = null;
        f67075d = new wmd(true, str, str);
    }

    public wmd(int i) {
        C2906cx c2906cx = new C2906cx(i, 0);
        C2906cx c2906cx2 = new C2906cx(i, 1);
        this.f67077b = c2906cx;
        this.f67078c = c2906cx2;
        this.f67076a = true;
    }

    /* JADX INFO: renamed from: a */
    public static wmd m24059a(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new wmd(dg4Var.m10337g("match", Boolean.FALSE).booleanValue(), dg4Var.m10344n("detail", null), dg4Var.m10342l("deeplink", false));
    }

    /* JADX INFO: renamed from: g */
    public static wmd m24060g(String str) {
        return new wmd(false, str, null);
    }

    /* JADX INFO: renamed from: h */
    public static wmd m24061h(String str, Exception exc) {
        return new wmd(false, str, exc);
    }

    @Override // p000.rt5
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C2943dx mo11840b(a34 a34Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        ut5 c3017fx;
        int i;
        String str = ((vt5) a34Var.f173a).f65881a;
        C2943dx c2943dx = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.f67076a || Build.VERSION.SDK_INT < 36) {
                    c3017fx = new C3017fx(mediaCodecCreateByCodecName, (HandlerThread) ((C2906cx) this.f67078c).get());
                    i = 0;
                } else {
                    c3017fx = new ck6(mediaCodecCreateByCodecName, 28);
                    i = 4;
                }
                C2943dx c2943dx2 = new C2943dx(mediaCodecCreateByCodecName, (HandlerThread) ((C2906cx) this.f67077b).get(), c3017fx, (C3309ls) a34Var.f178f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) a34Var.f176d;
                    if (surface == null && ((vt5) a34Var.f173a).f65888h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    C2943dx.m10709b(c2943dx2, (MediaFormat) a34Var.f174b, surface, (MediaCrypto) a34Var.f177e, i);
                    return c2943dx2;
                } catch (Exception e) {
                    e = e;
                    c2943dx = c2943dx2;
                    if (c2943dx != null) {
                        c2943dx.mo10715a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m24063d() {
        this.f67076a = true;
    }

    /* JADX INFO: renamed from: e */
    public dg4 m24064e() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10351u("match", this.f67076a);
        String str = (String) this.f67077b;
        if (str != null) {
            dg4VarM10328c.m10331B("detail", str);
        }
        eg4 eg4Var = (eg4) this.f67078c;
        if (eg4Var != null) {
            dg4VarM10328c.m10356z("deeplink", eg4Var);
        }
        return dg4VarM10328c;
    }

    /* JADX INFO: renamed from: f */
    public String mo13338f() {
        return (String) this.f67077b;
    }

    public /* synthetic */ wmd(boolean z, String str, Object obj) {
        this.f67076a = z;
        this.f67077b = str;
        this.f67078c = obj;
    }
}
