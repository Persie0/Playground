package p000;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes.dex */
public final class m92 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50808a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f50809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f50810c;

    public m92(ida idaVar, ui3 ui3Var) {
        this.f50809b = idaVar;
        this.f50810c = ui3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws Throwable {
        int i = this.f50808a;
        Object obj = this.f50809b;
        Object obj2 = this.f50810c;
        switch (i) {
            case 0:
                g7a g7aVar = ((ida) obj).f44003q;
                return new aa1(d32.m10026X(g7aVar.f40360a, g7aVar.f40361b, io2.f44351c.mo12780a(((Number) ((ui3) obj2).mo0a()).floatValue())));
            default:
                mw3 mw3Var = (mw3) obj2;
                pw3 pw3Var = (pw3) obj;
                ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
                IOException iOException = null;
                try {
                    try {
                        try {
                            if (!pw3Var.m19539a(true, this)) {
                                throw new IOException("Required SETTINGS preface not received");
                            }
                            do {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } while (pw3Var.m19539a(false, this));
                            ErrorCode errorCode2 = ErrorCode.NO_ERROR;
                            try {
                                errorCode = ErrorCode.CANCEL;
                                mw3Var.m17065a(errorCode2, errorCode, null);
                                this = errorCode2;
                            } catch (IOException e) {
                                iOException = e;
                                ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                                mw3Var.m17065a(errorCode3, errorCode3, iOException);
                                this = errorCode3;
                            }
                            icb.m13766b(pw3Var);
                            return xfa.f68157a;
                        } catch (IOException e2) {
                            iOException = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    this = errorCode;
                } catch (Throwable th3) {
                    th = th3;
                }
                mw3Var.m17065a(this, errorCode, iOException);
                icb.m13766b(pw3Var);
                throw th;
        }
    }

    public m92(mw3 mw3Var, pw3 pw3Var) {
        this.f50810c = mw3Var;
        this.f50809b = pw3Var;
    }
}
