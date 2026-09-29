package p000;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iw3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44700a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f44701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f44702c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f44703d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f44704e;

    public /* synthetic */ iw3(mw3 mw3Var, int i, aj0 aj0Var, int i2, boolean z) {
        this.f44703d = mw3Var;
        this.f44701b = i;
        this.f44704e = aj0Var;
        this.f44702c = i2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f44700a) {
            case 0:
                mw3 mw3Var = (mw3) this.f44703d;
                int i = this.f44701b;
                aj0 aj0Var = (aj0) this.f44704e;
                int i2 = this.f44702c;
                try {
                    mw3Var.f51936k.getClass();
                    aj0Var.skip(i2);
                    mw3Var.f51923R.m22966q(i, ErrorCode.CANCEL);
                    synchronized (mw3Var) {
                        mw3Var.f51925T.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return xfa.f68157a;
            default:
                s87 s87Var = (s87) this.f44703d;
                CharSequence charSequence = (CharSequence) this.f44704e;
                int i3 = this.f44701b;
                return "Expected " + s87Var.f60513a + " but got " + charSequence.subSequence(i3, this.f44702c + i3 + 1).toString();
        }
    }

    public /* synthetic */ iw3(s87 s87Var, CharSequence charSequence, int i, int i2) {
        this.f44703d = s87Var;
        this.f44704e = charSequence;
        this.f44701b = i;
        this.f44702c = i2;
    }
}
