package p000;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jw3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46309a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mw3 f46310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f46311c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f46312d;

    public /* synthetic */ jw3(mw3 mw3Var, int i, List list) {
        this.f46310b = mw3Var;
        this.f46311c = i;
        this.f46312d = list;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f46309a) {
            case 0:
                mw3 mw3Var = this.f46310b;
                int i = this.f46311c;
                mw3Var.f51936k.getClass();
                try {
                    mw3Var.f51923R.m22966q(i, ErrorCode.CANCEL);
                    synchronized (mw3Var) {
                        mw3Var.f51925T.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return xfa.f68157a;
            default:
                mw3 mw3Var2 = this.f46310b;
                int i2 = this.f46311c;
                mw3Var2.f51936k.getClass();
                try {
                    mw3Var2.f51923R.m22966q(i2, ErrorCode.CANCEL);
                    synchronized (mw3Var2) {
                        mw3Var2.f51925T.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return xfa.f68157a;
        }
    }

    public /* synthetic */ jw3(mw3 mw3Var, int i, List list, boolean z) {
        this.f46310b = mw3Var;
        this.f46311c = i;
        this.f46312d = list;
    }
}
