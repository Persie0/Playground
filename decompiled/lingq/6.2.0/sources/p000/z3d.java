package p000;

import com.google.android.gms.internal.measurement.zzaeh;

/* JADX INFO: loaded from: classes.dex */
public final class z3d {

    /* JADX INFO: renamed from: c */
    public static final z3d f70849c = new z3d(d3d.m10076b(), l2d.m15751z());

    /* JADX INFO: renamed from: a */
    public final d3d f70850a;

    /* JADX INFO: renamed from: b */
    public final l2d f70851b;

    public z3d(d3d d3dVar, l2d l2dVar) {
        d3dVar.getClass();
        this.f70850a = d3dVar;
        this.f70851b = l2dVar;
    }

    /* JADX INFO: renamed from: a */
    public static z3d m25449a(ghb ghbVar, boolean z) throws zzaeh {
        d3d d3dVarM13708e;
        int iMo5362C = ghbVar.mo5362C();
        if (iMo5362C > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iMo5362C).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iMo5362C);
            sb.append(". Current version is: 1");
            throw new zzaeh(sb.toString());
        }
        ghbVar.mo5362C();
        int iMo5373a = ghbVar.mo5373a(ghbVar.mo5360A());
        phb phbVar = phb.f56224a;
        int i = dhb.f35664a;
        l2d l2dVarM15750y = l2d.m15750y(ghbVar, phb.f56225b);
        ghbVar.mo5374b(iMo5373a);
        i72 i72VarM13706c = i72.m13706c();
        try {
            if (z) {
                int iMo5373a2 = ghbVar.mo5373a(ghbVar.mo5360A());
                d3dVarM13708e = i72VarM13706c.m13709n(ghbVar);
                if (ghbVar.mo5375c() != 0) {
                    throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                }
                ghbVar.mo5374b(iMo5373a2);
            } else {
                d3dVarM13708e = i72VarM13706c.m13708e(ghbVar.mo5394z());
            }
            i72VarM13706c.close();
            return new z3d(d3dVarM13708e, l2dVarM15750y);
        } catch (Throwable th) {
            try {
                i72VarM13706c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
