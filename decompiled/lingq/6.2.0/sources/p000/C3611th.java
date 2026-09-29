package p000;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.p002ui.draw.C0296c;
import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.Result;

/* JADX INFO: renamed from: th */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3611th implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f62269b;

    public /* synthetic */ C3611th(int i, long j) {
        this.f62268a = i;
        this.f62269b = j;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        sm0 sm0Var;
        Object failure;
        int i = this.f62268a;
        xfa xfaVar = xfa.f68157a;
        long j = this.f62269b;
        switch (i) {
            case 0:
                C0296c c0296c = (C0296c) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0296c.f3864a.mo1347h() >> 32)) / 2.0f;
                return c0296c.m1349c(new C3648uh(fIntBitsToFloat, bq1.m4053c0(c0296c, fIntBitsToFloat), new qd0(5, j), 0));
            case 1:
                qi0 qi0Var = (qi0) obj;
                vi3 vi3Var = qi0Var.f57801b;
                if (vi3Var != null && (sm0Var = qi0Var.f57800a) != null) {
                    try {
                        failure = vi3Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    sm0Var.resumeWith(failure);
                    break;
                }
                return xfaVar;
            case 2:
                ((tv8) obj).mo3709d(dv8.f36273a, new cv8(Handle.Cursor, this.f62269b, SelectionHandleAnchor.Middle, true));
                return xfaVar;
            case 3:
                return Long.valueOf(j);
            default:
                ((MutablePreferences) obj).set(wr3.f67200b, Long.valueOf(j));
                return null;
        }
    }
}
