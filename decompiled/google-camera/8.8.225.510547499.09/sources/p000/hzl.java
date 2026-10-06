package p000;

import android.graphics.Rect;
import android.util.Size;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzl {

    /* JADX INFO: renamed from: a */
    private Size f30018a;

    /* JADX INFO: renamed from: b */
    private Rect f30019b;

    /* JADX INFO: renamed from: c */
    private Rect f30020c;

    /* JADX INFO: renamed from: d */
    private Rect f30021d;

    /* JADX INFO: renamed from: e */
    private Rect f30022e;

    /* JADX INFO: renamed from: f */
    private Rect f30023f;

    /* JADX INFO: renamed from: g */
    private Rect f30024g;

    /* JADX INFO: renamed from: h */
    private Rect f30025h;

    /* JADX INFO: renamed from: i */
    private Rect f30026i;

    /* JADX INFO: renamed from: j */
    private Rect f30027j;

    /* JADX INFO: renamed from: k */
    private Rect f30028k;

    /* JADX INFO: renamed from: l */
    private Rect f30029l;

    /* JADX INFO: renamed from: m */
    private Rect f30030m;

    /* JADX INFO: renamed from: n */
    private Rect f30031n;

    /* JADX INFO: renamed from: o */
    private Rect f30032o;

    /* JADX INFO: renamed from: p */
    private Rect f30033p;

    /* JADX INFO: renamed from: q */
    private boolean f30034q;

    /* JADX INFO: renamed from: r */
    private boolean f30035r;

    /* JADX INFO: renamed from: s */
    private byte f30036s;

    /* JADX INFO: renamed from: a */
    public final hzm m10920a() {
        if (this.f30036s == 3 && this.f30018a != null && this.f30019b != null && this.f30020c != null && this.f30021d != null && this.f30022e != null && this.f30023f != null && this.f30024g != null && this.f30025h != null && this.f30026i != null && this.f30027j != null && this.f30028k != null && this.f30029l != null && this.f30030m != null && this.f30031n != null && this.f30032o != null && this.f30033p != null) {
            return new hzm(this.f30018a, this.f30019b, this.f30020c, this.f30021d, this.f30022e, this.f30023f, this.f30024g, this.f30025h, this.f30026i, this.f30027j, this.f30028k, this.f30029l, this.f30030m, this.f30031n, this.f30032o, this.f30033p, this.f30034q, this.f30035r);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30018a == null) {
            sb.append(" window");
        }
        if (this.f30019b == null) {
            sb.append(qQLA.FEthGCElaInG);
        }
        if (this.f30020c == null) {
            sb.append(" optionsMenuContainer");
        }
        if (this.f30021d == null) {
            sb.append(" preview");
        }
        if (this.f30022e == null) {
            sb.append(" uncoveredPreview");
        }
        if (this.f30023f == null) {
            sb.append(" viewfinderCoverIconArea");
        }
        if (this.f30024g == null) {
            sb.append(" zoomUi");
        }
        if (this.f30025h == null) {
            sb.append(" bottomBar");
        }
        if (this.f30026i == null) {
            sb.append(" gradientBar");
        }
        if (this.f30027j == null) {
            sb.append(" fullScreen");
        }
        if (this.f30028k == null) {
            sb.append(" modeSwitchUi");
        }
        if (this.f30029l == null) {
            sb.append(" timerWidget");
        }
        if (this.f30030m == null) {
            sb.append(" cutoutArea");
        }
        if (this.f30031n == null) {
            sb.append(" modeSlider");
        }
        if (this.f30032o == null) {
            sb.append(" previewWidgets");
        }
        if (this.f30033p == null) {
            sb.append(" moreModes");
        }
        if ((this.f30036s & 1) == 0) {
            sb.append(" needsRetry");
        }
        if ((this.f30036s & 2) == 0) {
            sb.append(" zoomInViewfinder");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10921b(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null bottomBar");
        }
        this.f30025h = rect;
    }

    /* JADX INFO: renamed from: c */
    public final void m10922c(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null cutoutArea");
        }
        this.f30030m = rect;
    }

    /* JADX INFO: renamed from: d */
    public final void m10923d(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null fullScreen");
        }
        this.f30027j = rect;
    }

    /* JADX INFO: renamed from: e */
    public final void m10924e(Rect rect) {
        if (rect == null) {
            throw new NullPointerException(pIeXJQLZLfgIN.DQQeymfkZYgIk);
        }
        this.f30026i = rect;
    }

    /* JADX INFO: renamed from: f */
    public final void m10925f(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null modeSlider");
        }
        this.f30031n = rect;
    }

    /* JADX INFO: renamed from: g */
    public final void m10926g(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null modeSwitchUi");
        }
        this.f30028k = rect;
    }

    /* JADX INFO: renamed from: h */
    public final void m10927h(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null moreModes");
        }
        this.f30033p = rect;
    }

    /* JADX INFO: renamed from: i */
    public final void m10928i(boolean z) {
        this.f30034q = z;
        this.f30036s = (byte) (this.f30036s | 1);
    }

    /* JADX INFO: renamed from: j */
    public final void m10929j(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null optionsMenuContainer");
        }
        this.f30020c = rect;
    }

    /* JADX INFO: renamed from: k */
    public final void m10930k(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null preview");
        }
        this.f30021d = rect;
    }

    /* JADX INFO: renamed from: l */
    public final void m10931l(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null previewOverlay");
        }
        this.f30019b = rect;
    }

    /* JADX INFO: renamed from: m */
    public final void m10932m(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null previewWidgets");
        }
        this.f30032o = rect;
    }

    /* JADX INFO: renamed from: n */
    public final void m10933n(Rect rect) {
        if (rect == null) {
            throw new NullPointerException(BcwGDRhrTsnlj.rLKwT);
        }
        this.f30029l = rect;
    }

    /* JADX INFO: renamed from: o */
    public final void m10934o(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null uncoveredPreview");
        }
        this.f30022e = rect;
    }

    /* JADX INFO: renamed from: p */
    public final void m10935p(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null viewfinderCoverIconArea");
        }
        this.f30023f = rect;
    }

    /* JADX INFO: renamed from: q */
    public final void m10936q(Size size) {
        if (size == null) {
            throw new NullPointerException("Null window");
        }
        this.f30018a = size;
    }

    /* JADX INFO: renamed from: r */
    public final void m10937r(boolean z) {
        this.f30035r = z;
        this.f30036s = (byte) (this.f30036s | 2);
    }

    /* JADX INFO: renamed from: s */
    public final void m10938s(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null zoomUi");
        }
        this.f30024g = rect;
    }
}
