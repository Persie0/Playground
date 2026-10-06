package p000;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgm {

    /* JADX INFO: renamed from: a */
    public Map f3172a;

    /* JADX INFO: renamed from: b */
    public Map f3173b;

    /* JADX INFO: renamed from: c */
    public Map f3174c;

    /* JADX INFO: renamed from: d */
    public C1118xg f3175d;

    /* JADX INFO: renamed from: e */
    public C1114xc f3176e;

    /* JADX INFO: renamed from: f */
    public List f3177f;

    /* JADX INFO: renamed from: g */
    public Rect f3178g;

    /* JADX INFO: renamed from: h */
    public float f3179h;

    /* JADX INFO: renamed from: i */
    public float f3180i;

    /* JADX INFO: renamed from: j */
    public float f3181j;

    /* JADX INFO: renamed from: l */
    public final bzq f3183l = new bzq(null, null);

    /* JADX INFO: renamed from: m */
    private final HashSet f3184m = new HashSet();

    /* JADX INFO: renamed from: k */
    public int f3182k = 0;

    /* JADX INFO: renamed from: a */
    public final float m2415a() {
        return (long) ((m2416b() / this.f3181j) * 1000.0f);
    }

    /* JADX INFO: renamed from: b */
    public final float m2416b() {
        return this.f3180i - this.f3179h;
    }

    /* JADX INFO: renamed from: c */
    public final bkf m2417c(long j) {
        return (bkf) this.f3176e.m19546d(j);
    }

    /* JADX INFO: renamed from: d */
    public final void m2418d(String str) {
        blx.m2680a(str);
        this.f3184m.add(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m2419e(int i) {
        this.f3182k += i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f3177f.iterator();
        while (it.hasNext()) {
            sb.append(((bkf) it.next()).m2543a("\t"));
        }
        return sb.toString();
    }
}
