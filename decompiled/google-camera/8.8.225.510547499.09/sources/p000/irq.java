package p000;

import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class irq implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    boolean f31931a = false;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ irs f31932b;

    public irq(irs irsVar) {
        this.f31932b = irsVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        irs irsVar = this.f31932b;
        if (irsVar.f31935b.mo16813g()) {
            if (z) {
                irsVar.f31940g.mo11654i();
                this.f31932b.f31936c.mo3415bf(true);
                ((gmh) this.f31932b.f31935b.mo16809c()).mo9507e(true);
            }
            if (!this.f31931a) {
                this.f31932b.f31940g.mo11652d();
                this.f31932b.m11658m(true);
            }
            this.f31932b.f31939f.m4524e(i, 200);
            float f = i - 100.0f;
            ((gmh) this.f31932b.f31935b.mo16809c()).mo9509g(f / (f >= 0.0f ? Math.abs(100.0f) : 100.0f));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f31931a = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f31932b.f31940g.mo11652d();
        this.f31932b.m11658m(true);
        this.f31931a = false;
    }
}
