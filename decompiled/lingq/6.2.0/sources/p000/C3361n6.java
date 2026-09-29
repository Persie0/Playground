package p000;

import com.airbnb.lottie.compose.C0872b;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3361n6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0872b f52385b;

    public /* synthetic */ C3361n6(C0872b c0872b, int i) {
        this.f52384a = i;
        this.f52385b = c0872b;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        float fFloatValue;
        int i = this.f52384a;
        C0872b c0872b = this.f52385b;
        switch (i) {
            case 0:
                fFloatValue = ((Number) c0872b.getValue()).floatValue();
                break;
            case 1:
                fFloatValue = ((Number) c0872b.getValue()).floatValue();
                break;
            default:
                fFloatValue = ((Number) c0872b.getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
