package p000;

import android.graphics.Rect;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcv {

    /* JADX INFO: renamed from: a */
    public String f21291a;

    /* JADX INFO: renamed from: b */
    public Boolean f21292b;

    /* JADX INFO: renamed from: c */
    public mrm f21293c;

    /* JADX INFO: renamed from: d */
    public mrm f21294d;

    /* JADX INFO: renamed from: e */
    public int f21295e;

    /* JADX INFO: renamed from: f */
    public int f21296f;

    /* JADX INFO: renamed from: g */
    private boolean f21297g;

    /* JADX INFO: renamed from: h */
    private float f21298h;

    /* JADX INFO: renamed from: i */
    private String f21299i;

    /* JADX INFO: renamed from: j */
    private boolean f21300j;

    /* JADX INFO: renamed from: k */
    private boolean f21301k;

    /* JADX INFO: renamed from: l */
    private boolean f21302l;

    /* JADX INFO: renamed from: m */
    private float f21303m;

    /* JADX INFO: renamed from: n */
    private Rect f21304n;

    /* JADX INFO: renamed from: o */
    private Boolean f21305o;

    /* JADX INFO: renamed from: p */
    private Boolean f21306p;

    /* JADX INFO: renamed from: q */
    private nip f21307q;

    /* JADX INFO: renamed from: r */
    private nji f21308r;

    /* JADX INFO: renamed from: s */
    private boolean f21309s;

    /* JADX INFO: renamed from: t */
    private nim f21310t;

    /* JADX INFO: renamed from: u */
    private boolean f21311u;

    /* JADX INFO: renamed from: v */
    private byte f21312v;

    public fcv() {
    }

    public fcv(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f21293c = mquVar;
        this.f21294d = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final fcw m8207a() {
        int i;
        String str;
        String str2;
        Boolean bool;
        Rect rect;
        Boolean bool2;
        Boolean bool3;
        int i2;
        nip nipVar;
        nji njiVar;
        nim nimVar;
        if (this.f21312v == -1 && (i = this.f21295e) != 0 && (str = this.f21291a) != null && (str2 = this.f21299i) != null && (bool = this.f21292b) != null && (rect = this.f21304n) != null && (bool2 = this.f21305o) != null && (bool3 = this.f21306p) != null && (i2 = this.f21296f) != 0 && (nipVar = this.f21307q) != null && (njiVar = this.f21308r) != null && (nimVar = this.f21310t) != null) {
            return new fcw(i, str, this.f21297g, this.f21298h, str2, this.f21300j, this.f21301k, this.f21302l, this.f21303m, bool, rect, bool2, bool3, i2, nipVar, this.f21293c, njiVar, this.f21309s, nimVar, this.f21311u, this.f21294d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21295e == 0) {
            sb.append(" mode");
        }
        if (this.f21291a == null) {
            sb.append(" filename");
        }
        if ((this.f21312v & 1) == 0) {
            sb.append(" frontFacing");
        }
        if ((this.f21312v & 2) == 0) {
            sb.append(" zoom");
        }
        if (this.f21299i == null) {
            sb.append(" flashSetting");
        }
        if ((this.f21312v & 4) == 0) {
            sb.append(" anglerfishOn");
        }
        if ((this.f21312v & 8) == 0) {
            sb.append(" gridLinesOn");
        }
        if ((this.f21312v & 16) == 0) {
            sb.append(HEePJw.HGClIOzX);
        }
        if ((this.f21312v & 32) == 0) {
            sb.append(" timerSeconds");
        }
        if (this.f21292b == null) {
            sb.append(" volumeButtonShutter");
        }
        if (this.f21304n == null) {
            sb.append(" activeSensorSize");
        }
        if (this.f21305o == null) {
            sb.append(" isSelfieFlashOn");
        }
        if (this.f21306p == null) {
            sb.append(" rawMode");
        }
        if (this.f21296f == 0) {
            sb.append(" afLockState");
        }
        if (this.f21307q == null) {
            sb.append(" dualEvStats");
        }
        if (this.f21308r == null) {
            sb.append(" frequentFaceMetadata");
        }
        if ((this.f21312v & 64) == 0) {
            sb.append(" isPrivateStorage");
        }
        if (this.f21310t == null) {
            sb.append(" deviceFoldState");
        }
        if ((this.f21312v & 128) == 0) {
            sb.append(" talkBackEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m8208b(Rect rect) {
        this.f21304n = rect;
    }

    /* JADX INFO: renamed from: c */
    public final void m8209c(boolean z) {
        this.f21300j = z;
        this.f21312v = (byte) (this.f21312v | 4);
    }

    /* JADX INFO: renamed from: d */
    public final void m8210d(nim nimVar) {
        if (nimVar == null) {
            throw new NullPointerException("Null deviceFoldState");
        }
        this.f21310t = nimVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m8211e(nip nipVar) {
        if (nipVar == null) {
            throw new NullPointerException(TVkaNXnfP.TSKYKPHWfQjyTRD);
        }
        this.f21307q = nipVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m8212f(String str) {
        if (str == null) {
            throw new NullPointerException("Null flashSetting");
        }
        this.f21299i = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m8213g(nji njiVar) {
        if (njiVar == null) {
            throw new NullPointerException("Null frequentFaceMetadata");
        }
        this.f21308r = njiVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m8214h(boolean z) {
        this.f21297g = z;
        this.f21312v = (byte) (this.f21312v | 1);
    }

    /* JADX INFO: renamed from: i */
    public final void m8215i(boolean z) {
        this.f21301k = z;
        this.f21312v = (byte) (this.f21312v | 8);
    }

    /* JADX INFO: renamed from: j */
    public final void m8216j(boolean z) {
        this.f21309s = z;
        this.f21312v = (byte) (this.f21312v | 64);
    }

    /* JADX INFO: renamed from: k */
    public final void m8217k(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null isSelfieFlashOn");
        }
        this.f21305o = bool;
    }

    /* JADX INFO: renamed from: l */
    public final void m8218l(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null rawMode");
        }
        this.f21306p = bool;
    }

    /* JADX INFO: renamed from: m */
    public final void m8219m(boolean z) {
        this.f21302l = z;
        this.f21312v = (byte) (this.f21312v | 16);
    }

    /* JADX INFO: renamed from: n */
    public final void m8220n(boolean z) {
        this.f21311u = z;
        this.f21312v = (byte) (this.f21312v | (-128));
    }

    /* JADX INFO: renamed from: o */
    public final void m8221o(float f) {
        this.f21303m = f;
        this.f21312v = (byte) (this.f21312v | 32);
    }

    /* JADX INFO: renamed from: p */
    public final void m8222p(float f) {
        this.f21298h = f;
        this.f21312v = (byte) (this.f21312v | 2);
    }
}
