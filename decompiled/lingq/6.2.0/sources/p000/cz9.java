package p000;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cz9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f34746c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f34747d;

    public /* synthetic */ cz9(Object obj, int i, int i2, int i3) {
        this.f34744a = i3;
        this.f34745b = obj;
        this.f34746c = i;
        this.f34747d = i2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f34744a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f34747d;
        int i3 = this.f34746c;
        Object obj = this.f34745b;
        switch (i) {
            case 0:
                vi3 vi3Var = (vi3) obj;
                List list = ua3.f63636a;
                int i4 = i3 - 1;
                vi3Var.invoke((i4 < 0 || i4 >= list.size()) ? Integer.valueOf(i2) : list.get(i4));
                break;
            case 1:
                vi3 vi3Var2 = (vi3) obj;
                List list2 = ua3.f63636a;
                int i5 = i3 + 1;
                vi3Var2.invoke((i5 < 0 || i5 >= list2.size()) ? Integer.valueOf(i2) : list2.get(i5));
                break;
            default:
                mw3 mw3Var = (mw3) obj;
                try {
                    mw3Var.f51923R.m22965p(i3, i2, true);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    mw3Var.m17065a(errorCode, errorCode, e);
                }
                break;
        }
        return xfaVar;
    }
}
