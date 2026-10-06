package p000;

import android.animation.ValueAnimator;
import android.util.AndroidRuntimeException;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ais implements aib {

    /* JADX INFO: renamed from: a */
    public static final air f441a = new aii();

    /* JADX INFO: renamed from: b */
    public static final air f442b = new aij();

    /* JADX INFO: renamed from: c */
    public static final air f443c = new aik();

    /* JADX INFO: renamed from: d */
    public static final air f444d = new ail();

    /* JADX INFO: renamed from: e */
    public static final air f445e = new aim();

    /* JADX INFO: renamed from: f */
    public static final air f446f = new ain();

    /* JADX INFO: renamed from: g */
    public static final air f447g = new aig();

    /* JADX INFO: renamed from: h */
    public float f448h;

    /* JADX INFO: renamed from: i */
    float f449i;

    /* JADX INFO: renamed from: j */
    boolean f450j;

    /* JADX INFO: renamed from: k */
    final Object f451k;

    /* JADX INFO: renamed from: l */
    final aiu f452l;

    /* JADX INFO: renamed from: m */
    public boolean f453m;

    /* JADX INFO: renamed from: n */
    public float f454n;

    /* JADX INFO: renamed from: o */
    float f455o;

    /* JADX INFO: renamed from: p */
    public float f456p;

    /* JADX INFO: renamed from: q */
    private long f457q;

    /* JADX INFO: renamed from: r */
    private final ArrayList f458r;

    /* JADX INFO: renamed from: s */
    private final ArrayList f459s;

    public ais(gtx gtxVar, byte[] bArr) {
        this.f448h = 0.0f;
        this.f449i = Float.MAX_VALUE;
        this.f450j = false;
        this.f453m = false;
        this.f454n = Float.MAX_VALUE;
        this.f455o = -3.4028235E38f;
        this.f457q = 0L;
        this.f458r = new ArrayList();
        this.f459s = new ArrayList();
        this.f451k = null;
        this.f452l = new aih(gtxVar, null);
        this.f456p = 1.0f;
    }

    /* JADX INFO: renamed from: k */
    private static void m777k(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // p000.aib
    /* JADX INFO: renamed from: a */
    public final void mo752a(long j) {
        long j2 = this.f457q;
        if (j2 == 0) {
            this.f457q = j;
            m779c(this.f449i);
            return;
        }
        long j3 = j - j2;
        this.f457q = j;
        float f = aif.m771a().f434f;
        boolean zMo781e = mo781e(f == 0.0f ? 2147483647L : (long) (j3 / f));
        float fMin = Math.min(this.f449i, this.f454n);
        this.f449i = fMin;
        float fMax = Math.max(fMin, this.f455o);
        this.f449i = fMax;
        m779c(fMax);
        if (zMo781e) {
            m786j();
        }
    }

    /* JADX INFO: renamed from: b */
    final float m778b() {
        return this.f456p * 0.75f;
    }

    /* JADX INFO: renamed from: c */
    final void m779c(float f) {
        this.f452l.mo774b(this.f451k, f);
        for (int i = 0; i < this.f459s.size(); i++) {
            if (this.f459s.get(i) != null) {
                ((aiq) this.f459s.get(i)).mo776a(this.f449i);
            }
        }
        m777k(this.f459s);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public void mo780d() {
        if (!aif.m771a().m772b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f453m) {
            return;
        }
        this.f453m = true;
        if (!this.f450j) {
            this.f449i = this.f452l.mo773a(this.f451k);
        }
        float f = this.f449i;
        if (f > this.f454n || f < this.f455o) {
            throw new IllegalArgumentException(hsSUWRJfoeC.OpHBQGM);
        }
        aif aifVarM771a = aif.m771a();
        if (aifVarM771a.f430b.size() == 0) {
            aifVarM771a.f435g.m756a(aifVarM771a.f431c);
            aifVarM771a.f434f = ValueAnimator.getDurationScale();
            if (aifVarM771a.f436h == null) {
                aifVarM771a.f436h = new aid(aifVarM771a);
            }
            final aid aidVar = aifVarM771a.f436h;
            if (aidVar.f424a == null) {
                aidVar.f424a = new ValueAnimator.DurationScaleChangeListener() { // from class: aic
                    @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                    public final void onChanged(float f2) {
                        ((aif) aidVar.f425b).f434f = f2;
                    }
                };
                ValueAnimator.registerDurationScaleChangeListener(aidVar.f424a);
            }
        }
        if (aifVarM771a.f430b.contains(this)) {
            return;
        }
        aifVarM771a.f430b.add(this);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo781e(long j);

    /* JADX INFO: renamed from: f */
    public final void m782f(aip aipVar) {
        if (this.f458r.contains(aipVar)) {
            return;
        }
        this.f458r.add(aipVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m783g(aiq aiqVar) {
        if (this.f453m) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (this.f459s.contains(aiqVar)) {
            return;
        }
        this.f459s.add(aiqVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m784h() {
        this.f455o = 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m785i(float f) {
        this.f449i = f;
        this.f450j = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m786j() {
        this.f453m = false;
        aif aifVarM771a = aif.m771a();
        aifVarM771a.f429a.remove(this);
        int iIndexOf = aifVarM771a.f430b.indexOf(this);
        if (iIndexOf >= 0) {
            aifVarM771a.f430b.set(iIndexOf, null);
            aifVarM771a.f433e = true;
        }
        this.f457q = 0L;
        this.f450j = false;
        for (int i = 0; i < this.f458r.size(); i++) {
            if (this.f458r.get(i) != null) {
                ((aip) this.f458r.get(i)).mo775a();
            }
        }
        m777k(this.f458r);
    }

    public ais(Object obj, aiu aiuVar) {
        this.f448h = 0.0f;
        this.f449i = Float.MAX_VALUE;
        this.f450j = false;
        this.f453m = false;
        this.f454n = Float.MAX_VALUE;
        this.f455o = -3.4028235E38f;
        this.f457q = 0L;
        this.f458r = new ArrayList();
        this.f459s = new ArrayList();
        this.f451k = obj;
        this.f452l = aiuVar;
        this.f456p = (aiuVar == f444d || aiuVar == f445e || aiuVar == f446f) ? 0.1f : aiuVar == f447g ? 0.00390625f : (aiuVar == f442b || aiuVar == f443c) ? 0.002f : 1.0f;
    }
}
