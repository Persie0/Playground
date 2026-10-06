package p000;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import com.google.android.apps.camera.p014ui.views.CountdownSnapSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxg implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f29793a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29794b;

    public hxg(SeekBarPreference seekBarPreference, int i) {
        this.f29794b = i;
        this.f29793a = seekBarPreference;
    }

    public hxg(hxk hxkVar, int i) {
        this.f29794b = i;
        this.f29793a = hxkVar;
    }

    public hxg(ipb ipbVar, int i) {
        this.f29794b = i;
        this.f29793a = ipbVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.f29794b) {
            case 0:
                break;
            case 1:
                ((SeekBarPreference) this.f29793a).f1613c = true;
                break;
            default:
                ((ipb) this.f29793a).f31674c.mo11562a();
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.f29794b) {
            case 0:
                break;
            case 1:
                ((SeekBarPreference) this.f29793a).f1613c = false;
                int progress = seekBar.getProgress();
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.f29793a;
                if (progress + seekBarPreference.f1612b != seekBarPreference.f1611a) {
                    seekBarPreference.m1536k(seekBar);
                }
                break;
            default:
                ((ipb) this.f29793a).f31674c.mo11563b();
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.f29794b) {
            case 0:
                if (!((hxk) this.f29793a).f29806d.m4446g(i)) {
                    ((hxk) this.f29793a).m10824m(false);
                    CountdownSnapSlider countdownSnapSlider = ((hxk) this.f29793a).f29806d;
                    countdownSnapSlider.announceForAccessibility(countdownSnapSlider.getContentDescription());
                }
                if (z) {
                    double dM4442c = ((hxk) this.f29793a).f29806d.m4442c();
                    if (!((hxk) this.f29793a).f29806d.m4446g(i)) {
                        double d = i;
                        ((hxk) this.f29793a).f29806d.m4444e(d);
                        hxk hxkVar = (hxk) this.f29793a;
                        hxkVar.f29805c.m4354n(hxkVar.f29806d.m4440a(d));
                        if (dM4442c != d) {
                            ((hxk) this.f29793a).m10830s(hxk.m10811u(i));
                        }
                        ((hxk) this.f29793a).m10819h();
                    } else {
                        ((hxk) this.f29793a).f29806d.setProgress((int) dM4442c);
                    }
                }
                break;
            case 1:
                if (z) {
                    SeekBarPreference seekBarPreference = (SeekBarPreference) this.f29793a;
                    if (seekBarPreference.f1616f || !seekBarPreference.f1613c) {
                        seekBarPreference.m1536k(seekBar);
                    }
                }
                SeekBarPreference seekBarPreference2 = (SeekBarPreference) this.f29793a;
                seekBarPreference2.m1537l(i + seekBarPreference2.f1612b);
                break;
            default:
                if (z) {
                    ((ipb) this.f29793a).f31674c.f31649d.seekTo(i);
                    break;
                }
                break;
        }
    }
}
