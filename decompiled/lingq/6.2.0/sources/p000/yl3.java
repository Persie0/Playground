package p000;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.chat.C1374b;
import com.lingq.core.domain.lesson.C1382d;
import com.lingq.core.domain.lesson.C1383e;
import com.lingq.core.domain.library.C1388c;
import kotlinx.coroutines.flow.AbstractC3224d;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yl3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f69986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f69987c;

    public /* synthetic */ yl3(int i, t66 t66Var) {
        this.f69985a = 4;
        this.f69986b = i;
        this.f69987c = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f69985a) {
            case 0:
                C1374b c1374b = (C1374b) this.f69987c;
                return ((C1289e) c1374b.f18622a).m7166p(this.f69986b);
            case 1:
                C1388c c1388c = (C1388c) this.f69987c;
                return ((C1296l) c1388c.f18832a).m7315j(this.f69986b);
            case 2:
                C1382d c1382d = (C1382d) this.f69987c;
                return ((C1296l) ((y95) c1382d.f18728a)).m7314i(this.f69986b);
            case 3:
                C1383e c1383e = (C1383e) this.f69987c;
                int i = this.f69986b;
                q05 q05Var = (q05) ((C1295k) c1383e.f18729a).f16498b;
                return AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(i, q05Var, 9)), 11));
            case 4:
                ((t66) this.f69987c).setValue(Integer.valueOf(this.f69986b));
                return Boolean.TRUE;
            case 5:
                mw3 mw3Var = (mw3) this.f69987c;
                int i2 = this.f69986b;
                mw3Var.f51936k.getClass();
                synchronized (mw3Var) {
                    mw3Var.f51925T.remove(Integer.valueOf(i2));
                }
                return xfa.f68157a;
            default:
                pj3 pj3Var = (pj3) this.f69987c;
                return Integer.valueOf(((rw9) pj3Var.f56314e).f59976b.m23743d(this.f69986b));
        }
    }

    public /* synthetic */ yl3(mw3 mw3Var, int i, ErrorCode errorCode) {
        this.f69985a = 5;
        this.f69987c = mw3Var;
        this.f69986b = i;
    }

    public /* synthetic */ yl3(Object obj, int i, int i2) {
        this.f69985a = i2;
        this.f69987c = obj;
        this.f69986b = i;
    }
}
