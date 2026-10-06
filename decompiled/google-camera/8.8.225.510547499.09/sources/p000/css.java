package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class css {

    /* JADX INFO: renamed from: a */
    final int f9382a;

    /* JADX INFO: renamed from: b */
    final int f9383b;

    public css(Context context) {
        this.f9382a = (int) (dhj.m6157e(context, "config_screenBrightnessSettingMaximumFloat", 1.0f) * 255.0f);
        this.f9383b = (int) (dhj.m6157e(context, "config_screenBrightnessSettingMinimumFloat", 0.0f) * 255.0f);
    }

    /* JADX INFO: renamed from: a */
    public final float m5473a(int i) {
        return i / this.f9382a;
    }

    /* JADX INFO: renamed from: b */
    public final int m5474b(int i, float f, boolean z) {
        double d;
        float fExp;
        float f2 = this.f9383b;
        float f3 = ((i - f2) / (this.f9382a - f2)) * 12.0f;
        int iRound = (int) (Math.round(((f3 <= 1.0f ? ((float) Math.sqrt(f3)) * 0.5f : (((float) Math.log(f3 - 0.28466892f)) * 0.17883277f) + 0.5599107f) * 65535.0f) + 0.0f) - (f * 65535.0f));
        double d2 = iRound;
        if (d2 > 65535.0d) {
            d = 1.0d;
        } else if (d2 < 0.0d) {
            d = 0.0d;
        } else {
            Double.isNaN(d2);
            d = (d2 + 0.0d) / 65535.0d;
        }
        if (d < (true != z ? 0.0f : 0.3f)) {
            return i;
        }
        int i2 = this.f9383b;
        int i3 = this.f9382a;
        float f4 = (iRound + 0.0f) / 65535.0f;
        if (f4 <= 0.5f) {
            float f5 = f4 / 0.5f;
            fExp = f5 * f5;
        } else {
            fExp = ((float) Math.exp((f4 - 0.5599107f) / 0.17883277f)) + 0.28466892f;
        }
        float f6 = i2;
        return Math.round(f6 + ((i3 - f6) * (fExp / 12.0f)));
    }
}
