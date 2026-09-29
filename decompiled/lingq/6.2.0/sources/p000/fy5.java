package p000;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fy5 {

    /* JADX INFO: renamed from: a */
    public final bl2 f39924a;

    /* JADX INFO: renamed from: b */
    public final C3309ls f39925b;

    /* JADX INFO: renamed from: c */
    public final HashMap f39926c;

    public fy5(Context context, C3309ls c3309ls) {
        bl2 bl2Var = new bl2(context);
        this.f39926c = new HashMap();
        this.f39924a = bl2Var;
        this.f39925b = c3309ls;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized eba m12245a(String str) {
        if (this.f39926c.containsKey(str)) {
            return (eba) this.f39926c.get(str);
        }
        CctBackendFactory cctBackendFactoryM3827G = this.f39924a.m3827G(str);
        if (cctBackendFactoryM3827G == null) {
            return null;
        }
        C3309ls c3309ls = this.f39925b;
        eba ebaVarCreate = cctBackendFactoryM3827G.create(new i40((Context) c3309ls.f50066d, (a41) c3309ls.f50064b, (a41) c3309ls.f50065c, str));
        this.f39926c.put(str, ebaVarCreate);
        return ebaVarCreate;
    }
}
