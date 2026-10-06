package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adr {
    /* JADX INFO: renamed from: a */
    static Cursor m305a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m306b(apt aptVar, boolean z, CancellationSignal cancellationSignal, Callable callable, ols olsVar) {
        oly olyVarM315d;
        if (aptVar.m1831s() && aptVar.m1830r()) {
            return callable.call();
        }
        aqb aqbVar = (aqb) olsVar.mo18639d().get(aqb.f2106c);
        if (aqbVar != null) {
            olyVarM315d = aqbVar.f2107a;
        } else if (z) {
            olyVarM315d = ady.m315d(aptVar);
        } else {
            Map map = aptVar.f2071j;
            Object objM18931l = map.get("QueryDispatcher");
            if (objM18931l == null) {
                objM18931l = oqv.m18931l(aptVar.m1820h());
                map.put("QueryDispatcher", objM18931l);
            }
            olyVarM315d = (oqo) objM18931l;
        }
        opy opyVar = new opy(omn.m18701f(olsVar), 1);
        opyVar.m18898x();
        opyVar.mo18870a(new apk(cancellationSignal, ooc.m18746l(ors.f46467a, olyVarM315d, new apl(callable, opyVar, null), 2), 0));
        Object objM18887m = opyVar.m18887m();
        if (objM18887m != oma.COROUTINE_SUSPENDED) {
            return objM18887m;
        }
        olsVar.getClass();
        return objM18887m;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m307c(apt aptVar, Callable callable, ols olsVar) {
        if (aptVar.m1831s() && aptVar.m1830r()) {
            return callable.call();
        }
        aqb aqbVar = (aqb) olsVar.mo18639d().get(aqb.f2106c);
        return ook.m18774L(aqbVar != null ? aqbVar.f2107a : ady.m315d(aptVar), new apj(callable, null), olsVar);
    }
}
