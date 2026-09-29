package ma;

import java.util.List;
import p219ka.AbstractC6645f;
import p479xa.C10151t;

/* JADX INFO: renamed from: ma.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7526a extends AbstractC6645f {

    /* JADX INFO: renamed from: m */
    public final C7527b f41548m;

    public C7526a(List<byte[]> list) {
        C10151t c10151t = new C10151t(list.get(0));
        this.f41548m = new C7527b(c10151t.m19150y(), c10151t.m19150y());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final p219ka.InterfaceC6646g mo13279g(byte[] r31, int r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C7526a.mo13279g(byte[], int, boolean):ka.g");
    }
}
