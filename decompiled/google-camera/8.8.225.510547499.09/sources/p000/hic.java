package p000;

import android.content.Context;
import android.media.SoundPool;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hic implements hhx, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f27879a = nbh.m17259h("com/google/android/apps/camera/soundplayer/SoundPlayerImpl");

    /* JADX INFO: renamed from: f */
    private final Context f27884f;

    /* JADX INFO: renamed from: g */
    private final Executor f27885g;

    /* JADX INFO: renamed from: h */
    private SoundPool f27886h;

    /* JADX INFO: renamed from: i */
    private final jwn f27887i;

    /* JADX INFO: renamed from: j */
    private final oju f27888j;

    /* JADX INFO: renamed from: e */
    public final Collection f27883e = mvi.m17027c(5);

    /* JADX INFO: renamed from: k */
    private final SoundPool.OnLoadCompleteListener f27889k = new hhz(this);

    /* JADX INFO: renamed from: b */
    public final Object f27880b = new Object();

    /* JADX INFO: renamed from: c */
    public final SparseArray f27881c = new SparseArray();

    /* JADX INFO: renamed from: d */
    public boolean f27882d = false;

    public hic(Context context, jwn jwnVar, oju ojuVar, Executor executor) {
        this.f27884f = context;
        this.f27887i = jwnVar;
        this.f27888j = ojuVar;
        this.f27885g = executor;
    }

    @Override // p000.hhx
    /* JADX INFO: renamed from: a */
    public final nps mo10324a(int i) {
        synchronized (this.f27880b) {
            if (this.f27882d) {
                return kxk.m14965K(false);
            }
            hib hibVar = (hib) this.f27881c.get(i);
            if (hibVar == null) {
                hibVar = new hib();
                hibVar.f27876a = i;
                this.f27881c.put(i, hibVar);
                hibVar.f27877b = m10331g().load(this.f27884f, i, 1);
            }
            return hibVar.f27878c;
        }
    }

    @Override // p000.hhx
    /* JADX INFO: renamed from: b */
    public final void mo10325b() {
        synchronized (this.f27880b) {
            if (!this.f27882d) {
                m10331g().autoPause();
            }
        }
    }

    @Override // p000.hhx
    /* JADX INFO: renamed from: c */
    public final void mo10326c() {
        this.f27885g.execute(new hfr(this, 10));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f27880b) {
            if (this.f27882d) {
                return;
            }
            this.f27882d = true;
            if (this.f27886h != null) {
                this.f27881c.clear();
                SoundPool soundPool = this.f27886h;
                lku.m15662p(soundPool);
                soundPool.autoPause();
                SoundPool soundPool2 = this.f27886h;
                lku.m15662p(soundPool2);
                soundPool2.release();
                this.f27886h = null;
            }
        }
    }

    @Override // p000.hhx
    /* JADX INFO: renamed from: d */
    public final void mo10327d() {
        synchronized (this.f27880b) {
            if (this.f27882d) {
                return;
            }
            for (Pair pair : this.f27883e) {
                synchronized (this.f27880b) {
                    m10331g().stop(((Integer) pair.first).intValue());
                }
            }
            this.f27883e.clear();
        }
    }

    @Override // p000.hhx
    /* JADX INFO: renamed from: e */
    public final void mo10328e() {
        synchronized (this.f27880b) {
            if (this.f27882d) {
                return;
            }
            Pair pair = null;
            for (Pair pair2 : this.f27883e) {
                if (pair2.second == null || ((Integer) pair2.second).intValue() != C0100R.raw.hotshot_ready_to_capture) {
                    synchronized (this.f27880b) {
                        m10331g().setVolume(((Integer) pair2.first).intValue(), 0.0f, 0.0f);
                    }
                } else {
                    pair = new Pair((Integer) pair2.first, (Integer) pair2.second);
                }
            }
            this.f27883e.clear();
            if (pair != null) {
                this.f27883e.add(pair);
            }
        }
    }

    @Override // p000.hhx
    /* JADX INFO: renamed from: f */
    public final void mo10329f(int i, float f) {
        int[] iArr = {-1};
        if (((Boolean) this.f27887i.mo3831be()).booleanValue()) {
            kxk.m14975U(mo10324a(i), new hia(this, i, iArr, f), this.f27885g);
        }
    }

    /* JADX INFO: renamed from: g */
    public final SoundPool m10331g() {
        if (this.f27886h == null && !this.f27882d) {
            SoundPool soundPool = (SoundPool) this.f27888j.get();
            this.f27886h = soundPool;
            lku.m15662p(soundPool);
            soundPool.setOnLoadCompleteListener(this.f27889k);
        }
        SoundPool soundPool2 = this.f27886h;
        lku.m15662p(soundPool2);
        return soundPool2;
    }

    /* JADX INFO: renamed from: h */
    public final void m10332h(int i) {
        synchronized (this.f27880b) {
            if (this.f27882d) {
                return;
            }
            hib hibVar = (hib) this.f27881c.get(i);
            if (hibVar == null) {
                return;
            }
            this.f27881c.remove(i);
            m10331g().unload(hibVar.f27877b);
        }
    }
}
