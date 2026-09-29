package p177ic;

import android.animation.TypeEvaluator;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: ic.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6309b implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: a */
    public static final C6309b f36528a = new C6309b();

    /* JADX INFO: renamed from: a */
    public static Integer m12938a(float f3, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f10 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f11 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM845d = C0204c.m845d(f11, f10, f3, f10);
        float fM845d2 = C0204c.m845d(fPow4, fPow, f3, fPow);
        float fM845d3 = C0204c.m845d(fPow5, fPow2, f3, fPow2);
        float fM845d4 = C0204c.m845d(fPow6, fPow3, f3, fPow3);
        float fPow7 = ((float) Math.pow(fM845d2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM845d3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM845d4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM845d * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f3, Integer num, Integer num2) {
        return m12938a(f3, num, num2);
    }
}
