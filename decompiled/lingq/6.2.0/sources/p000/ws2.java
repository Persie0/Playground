package p000;

import java.io.IOException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ws2 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67238a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f67239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67240c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67241d;

    public /* synthetic */ ws2(int i, String str, xs2 xs2Var) {
        this.f67239b = i;
        this.f67240c = str;
        this.f67241d = xs2Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f67238a;
        Object obj = this.f67241d;
        int i2 = this.f67239b;
        Object obj2 = this.f67240c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                xs2 xs2Var = (xs2) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = pb1.m19042l(str + '.' + xs2Var.f8506e[i3], hl9.f42584B, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                mw3 mw3Var = (mw3) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                try {
                    errorCode.getClass();
                    mw3Var.f51923R.m22966q(i2, errorCode);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    mw3Var.m17065a(errorCode2, errorCode2, e);
                }
                return xfa.f68157a;
        }
    }

    public /* synthetic */ ws2(mw3 mw3Var, int i, ErrorCode errorCode) {
        this.f67240c = mw3Var;
        this.f67239b = i;
        this.f67241d = errorCode;
    }
}
