package p000;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class sma {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f61027a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static ek4 m21483a(xj4 xj4Var) {
        bk4 bk4VarM11210y = ek4.m11210y();
        int iM24567A = xj4Var.m24567A();
        bk4VarM11210y.m22174d();
        ek4.m11208v((ek4) bk4VarM11210y.f62440b, iM24567A);
        for (wj4 wj4Var : xj4Var.m24570z()) {
            ck4 ck4VarM10435A = dk4.m10435A();
            String strM439A = wj4Var.m24019z().m439A();
            ck4VarM10435A.m22174d();
            dk4.m10436v((dk4) ck4VarM10435A.f62440b, strM439A);
            KeyStatusType keyStatusTypeM24017C = wj4Var.m24017C();
            ck4VarM10435A.m22174d();
            dk4.m10438x((dk4) ck4VarM10435A.f62440b, keyStatusTypeM24017C);
            OutputPrefixType outputPrefixTypeM24016B = wj4Var.m24016B();
            ck4VarM10435A.m22174d();
            dk4.m10437w((dk4) ck4VarM10435A.f62440b, outputPrefixTypeM24016B);
            int iM24015A = wj4Var.m24015A();
            ck4VarM10435A.m22174d();
            dk4.m10439y((dk4) ck4VarM10435A.f62440b, iM24015A);
            dk4 dk4Var = (dk4) ck4VarM10435A.m22171a();
            bk4VarM11210y.m22174d();
            ek4.m11209w((ek4) bk4VarM11210y.f62440b, dk4Var);
        }
        return (ek4) bk4VarM11210y.m22171a();
    }
}
