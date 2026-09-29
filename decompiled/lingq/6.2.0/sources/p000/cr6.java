package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class cr6 {

    /* JADX INFO: renamed from: b */
    public m58 f34411b;

    /* JADX INFO: renamed from: e */
    public final uk9 f34414e;

    /* JADX INFO: renamed from: f */
    public final boolean f34415f;

    /* JADX INFO: renamed from: g */
    public final boolean f34416g;

    /* JADX INFO: renamed from: h */
    public final ho5 f34417h;

    /* JADX INFO: renamed from: i */
    public final boolean f34418i;

    /* JADX INFO: renamed from: j */
    public final boolean f34419j;

    /* JADX INFO: renamed from: k */
    public final u06 f34420k;

    /* JADX INFO: renamed from: l */
    public fl0 f34421l;

    /* JADX INFO: renamed from: m */
    public final g9c f34422m;

    /* JADX INFO: renamed from: n */
    public final ho5 f34423n;

    /* JADX INFO: renamed from: o */
    public final SocketFactory f34424o;

    /* JADX INFO: renamed from: p */
    public List f34425p;

    /* JADX INFO: renamed from: q */
    public final List f34426q;

    /* JADX INFO: renamed from: r */
    public final yq6 f34427r;

    /* JADX INFO: renamed from: s */
    public final xo0 f34428s;

    /* JADX INFO: renamed from: t */
    public int f34429t;

    /* JADX INFO: renamed from: u */
    public int f34430u;

    /* JADX INFO: renamed from: v */
    public final int f34431v;

    /* JADX INFO: renamed from: a */
    public ny8 f34410a = new ny8(2);

    /* JADX INFO: renamed from: c */
    public final ArrayList f34412c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f34413d = new ArrayList();

    public cr6() {
        TimeZone timeZone = kcb.f47051a;
        this.f34414e = new uk9(24);
        this.f34415f = true;
        this.f34416g = true;
        ho5 ho5Var = ho5.f42702f;
        this.f34417h = ho5Var;
        this.f34418i = true;
        this.f34419j = true;
        this.f34420k = u06.f63174b;
        this.f34422m = g9c.f40428b;
        this.f34423n = ho5Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.f34424o = socketFactory;
        this.f34425p = dr6.f36082D;
        this.f34426q = dr6.f36081C;
        this.f34427r = yq6.f70293a;
        this.f34428s = xo0.f68421c;
        this.f34429t = 10000;
        this.f34430u = 10000;
        this.f34431v = 10000;
    }
}
