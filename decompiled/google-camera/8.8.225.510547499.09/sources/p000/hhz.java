package p000;

import android.media.SoundPool;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hhz implements SoundPool.OnLoadCompleteListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hic f27871a;

    public hhz(hic hicVar) {
        this.f27871a = hicVar;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        synchronized (this.f27871a.f27880b) {
            hic hicVar = this.f27871a;
            if (hicVar.f27882d) {
                return;
            }
            synchronized (hicVar.f27880b) {
                for (int i3 = 0; i3 < hicVar.f27881c.size(); i3++) {
                    hib hibVar = (hib) hicVar.f27881c.valueAt(i3);
                    if (hibVar.f27877b == i) {
                        int i4 = hibVar.f27876a;
                        int i5 = hibVar.f27877b;
                        hibVar.f27878c.mo14894e(Boolean.valueOf(i2 == 0));
                        return;
                    }
                }
                throw new NoSuchElementException("SoundInfo for sampleId " + i + " not found.");
            }
        }
    }
}
