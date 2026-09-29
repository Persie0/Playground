package p000;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g2d implements l0d {

    /* JADX INFO: renamed from: a */
    public final ds4 f40088a;

    /* JADX INFO: renamed from: b */
    public final c0d f40089b;

    public g2d(Context context, c0d c0dVar) {
        this.f40089b = c0dVar;
        al0 al0Var = al0.f793e;
        nba.m17319b(context);
        gba gbaVarM17320c = nba.m17318a().m17320c(al0Var);
        if (al0.f792d.contains(new bs2("json"))) {
            new ds4(new x1d(gbaVarM17320c, 0));
        }
        this.f40088a = new ds4(new x1d(gbaVarM17320c, 1));
    }

    @Override // p000.l0d
    /* JADX INFO: renamed from: a */
    public final void mo12306a(cdb cdbVar) {
        c0d c0dVar = this.f40089b;
        c0dVar.getClass();
        hba hbaVar = (hba) this.f40088a.get();
        c0dVar.getClass();
        a3d a3dVar = a3d.f192d;
        mq7 mq7Var = (mq7) cdbVar.f9945b;
        ((p29) cdbVar.f9946c).f55497i = false;
        p29 p29Var = (p29) cdbVar.f9946c;
        p29Var.f55495g = Boolean.FALSE;
        mq7Var.f51733b = new xvc(p29Var);
        try {
            a3d.m80r();
            tmc tmcVar = new tmc(mq7Var);
            mq7 mq7Var2 = new mq7(10);
            a3dVar.m92l(mq7Var2);
            HashMap map = new HashMap((HashMap) mq7Var2.f51733b);
            HashMap map2 = new HashMap((HashMap) mq7Var2.f51734c);
            rlb rlbVar = (rlb) mq7Var2.f51735d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ylb ylbVar = new ylb(byteArrayOutputStream, map, map2, rlbVar);
                fp6 fp6Var = (fp6) map.get(tmc.class);
                if (fp6Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(tmc.class)));
                }
                fp6Var.mo24a(tmcVar, ylbVar);
                hbaVar.m13185a(new j40(byteArrayOutputStream.toByteArray(), Priority.VERY_LOW, null), new uk9(8));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
