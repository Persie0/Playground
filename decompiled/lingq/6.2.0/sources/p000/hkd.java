package p000;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hkd implements tjd {

    /* JADX INFO: renamed from: a */
    public final ds4 f42555a;

    /* JADX INFO: renamed from: b */
    public final qjd f42556b;

    public hkd(Context context, qjd qjdVar) {
        this.f42556b = qjdVar;
        al0 al0Var = al0.f793e;
        nba.m17319b(context);
        gba gbaVarM17320c = nba.m17318a().m17320c(al0Var);
        if (al0.f792d.contains(new bs2("json"))) {
            new ds4(new x1d(gbaVarM17320c, 2));
        }
        this.f42555a = new ds4(new x1d(gbaVarM17320c, 3));
    }

    @Override // p000.tjd
    /* JADX INFO: renamed from: a */
    public final void mo13321a(cdb cdbVar) {
        qjd qjdVar = this.f42556b;
        qjdVar.getClass();
        hba hbaVar = (hba) this.f42555a.get();
        qjdVar.getClass();
        nid nidVar = nid.f52787d;
        ((p29) cdbVar.f9946c).f55497i = false;
        p29 p29Var = (p29) cdbVar.f9946c;
        p29Var.f55495g = Boolean.FALSE;
        lhd lhdVar = new lhd(p29Var);
        ca1 ca1Var = (ca1) cdbVar.f9945b;
        ca1Var.f9781a = lhdVar;
        try {
            mkd.m16909o();
            z5d z5dVar = new z5d(ca1Var);
            mq7 mq7Var = new mq7(11);
            nidVar.m17448d(mq7Var);
            HashMap map = new HashMap((HashMap) mq7Var.f51733b);
            HashMap map2 = new HashMap((HashMap) mq7Var.f51734c);
            rlb rlbVar = (rlb) mq7Var.f51735d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                vmb vmbVar = new vmb(byteArrayOutputStream, map, map2, rlbVar);
                fp6 fp6Var = (fp6) map.get(z5d.class);
                if (fp6Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(z5d.class)));
                }
                fp6Var.mo24a(z5dVar, vmbVar);
                hbaVar.m13185a(new j40(byteArrayOutputStream.toByteArray(), Priority.VERY_LOW, null), new uk9(8));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
