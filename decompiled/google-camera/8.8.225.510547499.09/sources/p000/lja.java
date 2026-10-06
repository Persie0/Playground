package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lja {

    /* JADX INFO: renamed from: a */
    public int f38342a;

    /* JADX INFO: renamed from: b */
    public Object f38343b;

    /* JADX INFO: renamed from: c */
    public Object f38344c;

    /* JADX INFO: renamed from: d */
    public Object f38345d;

    /* JADX INFO: renamed from: e */
    public Object f38346e;

    /* JADX INFO: renamed from: f */
    public Object f38347f;

    /* JADX INFO: renamed from: g */
    public Object f38348g;

    /* JADX INFO: renamed from: h */
    private boolean f38349h;

    /* JADX INFO: renamed from: i */
    private boolean f38350i;

    /* JADX INFO: renamed from: j */
    private byte f38351j;

    public lja() {
    }

    public lja(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f38346e = mquVar;
        this.f38347f = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final ljb m15511a() {
        Object obj;
        if (this.f38351j == 7 && (obj = this.f38344c) != null) {
            Object obj2 = this.f38343b;
            boolean z = this.f38349h;
            Object obj3 = this.f38345d;
            Object obj4 = this.f38346e;
            return new ljb((String) obj2, z, (pat) obj, (ozk) obj3, (String) obj4, (Long) this.f38347f, this.f38350i, (lhm) this.f38348g, this.f38342a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f38351j & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.f38344c == null) {
            sb.append(" metric");
        }
        if ((this.f38351j & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.f38351j & 4) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15512b(int i) {
        this.f38342a = i;
        this.f38351j = (byte) (this.f38351j | 4);
    }

    /* JADX INFO: renamed from: c */
    public final void m15513c(boolean z) {
        this.f38349h = z;
        this.f38351j = (byte) (this.f38351j | 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m15514d(boolean z) {
        this.f38350i = z;
        this.f38351j = (byte) (this.f38351j | 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m15515e(pat patVar) {
        if (patVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.f38344c = patVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: f */
    public final het m15516f() {
        Object obj;
        Object obj2;
        Object obj3;
        ?? r10;
        int i;
        if (this.f38351j == 3 && (obj = this.f38344c) != null && (obj2 = this.f38345d) != null && (obj3 = this.f38343b) != null && (r10 = this.f38348g) != 0 && (i = this.f38342a) != 0) {
            String str = (String) obj;
            het hetVar = new het(str, (mxk) obj2, (mxk) obj3, this.f38349h, this.f38350i, r10, i, (mrm) this.f38346e, (mrm) this.f38347f);
            lku.m15670x(hetVar.f27483a.length() <= 32, "Smarts Processor name is too long.");
            lku.m15613H(!hetVar.f27484b.isEmpty());
            lku.m15613H(!hetVar.f27485c.isEmpty());
            return hetVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38344c == null) {
            sb.append(" name");
        }
        if (this.f38345d == null) {
            sb.append(" activeModes");
        }
        if (this.f38343b == null) {
            sb.append(" activeCameraFacing");
        }
        if ((this.f38351j & 1) == 0) {
            sb.append(" shouldPauseDuringCapture");
        }
        if ((this.f38351j & 2) == 0) {
            sb.append(" shouldPauseWhenTimerActive");
        }
        if (this.f38348g == null) {
            sb.append(" externalToggle");
        }
        if (this.f38342a == 0) {
            sb.append(" notificationPriority");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: g */
    public final void m15517g(mxk mxkVar) {
        if (mxkVar == null) {
            throw new NullPointerException("Null activeCameraFacing");
        }
        this.f38343b = mxkVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m15518h(mxk mxkVar) {
        if (mxkVar == null) {
            throw new NullPointerException("Null activeModes");
        }
        this.f38345d = mxkVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m15519i(jwn jwnVar) {
        if (jwnVar == null) {
            throw new NullPointerException("Null externalToggle");
        }
        this.f38348g = jwnVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m15520j(boolean z) {
        this.f38349h = z;
        this.f38351j = (byte) (this.f38351j | 1);
    }

    /* JADX INFO: renamed from: k */
    public final void m15521k(boolean z) {
        this.f38350i = z;
        this.f38351j = (byte) (this.f38351j | 2);
    }
}
