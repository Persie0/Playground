package p000;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aot implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SeekBarPreference f1934a;

    public aot(SeekBarPreference seekBarPreference) {
        this.f1934a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f1934a;
        if ((!seekBarPreference.f1615e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.f1614d;
        if (seekBar != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        Log.e("SeekBarPreference", hIAHJKEnGsNbz.APVLFSbsVvxAQ);
        return false;
    }
}
