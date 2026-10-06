package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.bottombar.C0100R;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqe {

    /* JADX INFO: renamed from: i */
    private static final Duration f41351i = Duration.ofSeconds(3);

    /* JADX INFO: renamed from: j */
    private static final Duration f41352j = Duration.ofSeconds(1);

    /* JADX INFO: renamed from: a */
    public final int f41353a;

    /* JADX INFO: renamed from: b */
    public final boolean f41354b;

    /* JADX INFO: renamed from: c */
    public final Duration f41355c;

    /* JADX INFO: renamed from: d */
    public final int f41356d;

    /* JADX INFO: renamed from: e */
    public final int f41357e;

    /* JADX INFO: renamed from: f */
    public final int f41358f;

    /* JADX INFO: renamed from: g */
    public final int f41359g;

    /* JADX INFO: renamed from: h */
    public final Duration f41360h;

    /* JADX INFO: renamed from: k */
    private final int f41361k;

    public mqe() {
    }

    public mqe(int i, boolean z, Duration duration, int i2, int i3, int i4, int i5, int i6, Duration duration2) {
        this.f41353a = i;
        this.f41354b = z;
        this.f41355c = duration;
        this.f41361k = i2;
        this.f41356d = i3;
        this.f41357e = i4;
        this.f41358f = i5;
        this.f41359g = i6;
        this.f41360h = duration2;
    }

    /* JADX INFO: renamed from: a */
    public static mqd m16803a() {
        mqd mqdVar = new mqd();
        mqdVar.m16802b(20);
        mqdVar.f41341a = true;
        int i = mqdVar.f41349i | 2;
        mqdVar.f41349i = (byte) i;
        Duration duration = f41351i;
        if (duration == null) {
            throw new NullPointerException("Null fpsWindowDuration");
        }
        mqdVar.f41342b = duration;
        mqdVar.f41343c = 30;
        mqdVar.f41344d = 20;
        mqdVar.f41345e = 50;
        mqdVar.f41346f = 15;
        mqdVar.f41347g = 25;
        mqdVar.f41349i = (byte) (i | C0100R.styleable.AppCompatTheme_windowMinWidthMajor);
        Duration duration2 = f41352j;
        if (duration2 == null) {
            throw new NullPointerException("Null minDurationBetweenLogs");
        }
        mqdVar.f41348h = duration2;
        return mqdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mqe) {
            mqe mqeVar = (mqe) obj;
            if (this.f41353a == mqeVar.f41353a && this.f41354b == mqeVar.f41354b && this.f41355c.equals(mqeVar.f41355c) && this.f41361k == mqeVar.f41361k && this.f41356d == mqeVar.f41356d && this.f41357e == mqeVar.f41357e && this.f41358f == mqeVar.f41358f && this.f41359g == mqeVar.f41359g && this.f41360h.equals(mqeVar.f41360h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f41353a ^ 1000003) * 1000003) ^ (true != this.f41354b ? 1237 : 1231)) * 1000003) ^ this.f41355c.hashCode()) * 1000003) ^ this.f41361k) * 1000003) ^ this.f41356d) * 1000003) ^ this.f41357e) * 1000003) ^ this.f41358f) * 1000003) ^ this.f41359g) * 1000003) ^ this.f41360h.hashCode();
    }

    public final String toString() {
        return "FpsParams{targetFps=" + this.f41353a + ", trackFpsPerformance=" + this.f41354b + ", fpsWindowDuration=" + String.valueOf(this.f41355c) + TVkaNXnfP.gcGodAReAyLLeBV + this.f41361k + ", minInputFpsWarningThreshold=" + this.f41356d + ", maxInputFpsWarningThreshold=" + this.f41357e + ", minOutputFpsWarningThreshold=" + this.f41358f + ", maxOutputFpsWarningThreshold=" + this.f41359g + ", minDurationBetweenLogs=" + String.valueOf(this.f41360h) + hiCTUJiAxf.kSeKjClOQrx;
    }
}
