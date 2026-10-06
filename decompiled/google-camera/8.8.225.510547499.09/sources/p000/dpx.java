package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpx {

    /* JADX INFO: renamed from: a */
    public static final nbh f12248a = nbh.m17259h("com/google/android/apps/camera/faceannouncer/FaceAnnouncer");

    /* JADX INFO: renamed from: b */
    public final Context f12249b;

    /* JADX INFO: renamed from: c */
    public final View f12250c;

    /* JADX INFO: renamed from: e */
    public final jwn f12252e;

    /* JADX INFO: renamed from: f */
    public final jwn f12253f;

    /* JADX INFO: renamed from: n */
    public kpe f12261n;

    /* JADX INFO: renamed from: o */
    public Rect f12262o;

    /* JADX INFO: renamed from: d */
    public final int[][] f12251d = {new int[]{C0100R.string.top_left, C0100R.string.top_center, C0100R.string.top_right}, new int[]{C0100R.string.left, C0100R.string.center, C0100R.string.right}, new int[]{C0100R.string.bottom_left, C0100R.string.bottom_center, C0100R.string.bottom_right}};

    /* JADX INFO: renamed from: g */
    public final int[][] f12254g = {new int[]{C0100R.string.move_phone_up_left, C0100R.string.move_phone_up, C0100R.string.move_phone_up_right}, new int[]{C0100R.string.move_phone_left, 0, C0100R.string.move_phone_right}, new int[]{C0100R.string.move_phone_down_left, C0100R.string.move_phone_down, C0100R.string.move_phone_down_right}};

    /* JADX INFO: renamed from: h */
    public long f12255h = -1;

    /* JADX INFO: renamed from: i */
    public int f12256i = -1;

    /* JADX INFO: renamed from: j */
    public int f12257j = -1;

    /* JADX INFO: renamed from: k */
    public boolean f12258k = true;

    /* JADX INFO: renamed from: l */
    public boolean f12259l = false;

    /* JADX INFO: renamed from: m */
    public boolean f12260m = false;

    /* JADX INFO: renamed from: s */
    private int f12266s = 1;

    /* JADX INFO: renamed from: p */
    public hyv f12263p = hyv.IDLE;

    /* JADX INFO: renamed from: q */
    public jwn f12264q = jwr.m13637g(new hyx[0]);

    /* JADX INFO: renamed from: r */
    public kbc f12265r = new kbc(4, 3);

    public dpx(Context context, View view, jwn jwnVar, jwn jwnVar2) {
        this.f12249b = context;
        this.f12250c = view;
        jwnVar.getClass();
        this.f12252e = jwnVar;
        this.f12253f = jwnVar2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m6556f(int i, boolean z) {
        if (z) {
            i = -i;
        }
        if (i < -75) {
            return 0;
        }
        return i > 75 ? 2 : 1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m6557g(int i, int i2, int i3) {
        int i4;
        if (i2 != 0 && (i4 = (i * i3) / i2) >= 0) {
            return i4 >= i3 ? i3 - 1 : i4;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private final float m6558h() {
        int i;
        kpe kpeVar = this.f12261n;
        if (kpeVar == null) {
            this.f12266s = 1;
            return 0.0f;
        }
        Rect rect = kpeVar.f36797c;
        float fMax = Math.max(rect.width(), rect.height());
        float fMax2 = Math.max(this.f12262o.width(), this.f12262o.height());
        if (!this.f12259l) {
            if (fMax2 == 0.0f || fMax / fMax2 <= 0.05f) {
                return 0.05f;
            }
            return (m6557g((int) fMax, (int) fMax2, 10) * 10) + 10;
        }
        kbc kbcVar = this.f12265r;
        float fAbs = Math.abs((kbcVar.f35517a / kbcVar.f35518b) - 1.7777f);
        float f = fAbs <= 0.025f ? 26.0f : 35.0f;
        float f2 = fAbs <= 0.025f ? 14.0f : 18.0f;
        int i2 = (fMax2 == 0.0f || fMax / fMax2 <= 0.05f) ? 0 : (int) ((fMax * 100.0f) / fMax2);
        int i3 = this.f12266s;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 != 1 ? 2 : 0;
        float f3 = i2;
        if (f3 < f) {
            if (f3 < f2) {
                i = f2 - f3 > ((float) i4) ? 4 : 3;
            }
            this.f12266s = i;
        } else if (f3 - f >= i4) {
            this.f12266s = 2;
        }
        return f3;
    }

    /* JADX INFO: renamed from: a */
    public final String m6559a(boolean z) {
        String string;
        float fM6558h = m6558h();
        if (fM6558h == 0.05f) {
            return this.f12249b.getString(C0100R.string.face_size_tiny);
        }
        String strConcat = "";
        if (fM6558h == 0.0f) {
            return "";
        }
        if (!this.f12259l) {
            if (fM6558h >= 50.0f) {
                strConcat = ". ".concat(String.valueOf(this.f12249b.getString(C0100R.string.face_very_close)));
            } else if (fM6558h >= 30.0f && z) {
                strConcat = ". ".concat(String.valueOf(this.f12249b.getString(C0100R.string.face_in_selfie_range)));
            }
            return String.valueOf(this.f12249b.getString(C0100R.string.face_size_percent_screen, Integer.valueOf((int) fM6558h))).concat(strConcat);
        }
        if (!m6562d()) {
            return "";
        }
        kbc kbcVar = this.f12265r;
        float fAbs = Math.abs((kbcVar.f35517a / kbcVar.f35518b) - 1.7777f);
        float f = fAbs <= 0.025f ? 26.0f : 35.0f;
        float f2 = fAbs <= 0.025f ? 14.0f : 18.0f;
        if (fM6558h >= f) {
            string = this.f12249b.getString(C0100R.string.face_too_close);
        } else {
            string = fM6558h < f2 ? this.f12249b.getString(C0100R.string.face_too_far) : this.f12249b.getString(C0100R.string.face_in_selfie_range);
        }
        return String.format(Locale.US, "%s.", string);
    }

    /* JADX INFO: renamed from: b */
    public final void m6560b() {
        this.f12258k = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m6561c() {
        this.f12258k = true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6562d() {
        return this.f12263p.equals(hyv.READY_TO_CAPTURE) || this.f12263p.equals(hyv.FACE_TOO_FAR) || this.f12263p.equals(hyv.FACE_TOO_CLOSE);
    }

    /* JADX INFO: renamed from: e */
    public final int m6563e() {
        m6558h();
        return this.f12266s;
    }
}
