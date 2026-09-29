package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.lingq.feature.reader.old.ReaderPageFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qx7 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58339b;

    public /* synthetic */ qx7(Object obj, int i) {
        this.f58338a = i;
        this.f58339b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f58338a;
        Object obj = this.f58339b;
        switch (i) {
            case 0:
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) obj;
                vx7 vx7Var = ReaderPageFragment.Companion;
                boolean zM23653w = vz1.m23653w(readerPageFragment);
                motionEvent.getClass();
                readerPageFragment.m9300Y0(zM23653w, motionEvent);
                readerPageFragment.m9296U0();
                break;
            case 1:
                ReaderPageFragment readerPageFragment2 = (ReaderPageFragment) obj;
                vx7 vx7Var2 = ReaderPageFragment.Companion;
                boolean zM23653w2 = vz1.m23653w(readerPageFragment2);
                motionEvent.getClass();
                readerPageFragment2.m9300Y0(zM23653w2, motionEvent);
                readerPageFragment2.m9296U0();
                break;
            case 2:
                ReaderPageFragment readerPageFragment3 = (ReaderPageFragment) obj;
                vx7 vx7Var3 = ReaderPageFragment.Companion;
                boolean zM23653w3 = vz1.m23653w(readerPageFragment3);
                motionEvent.getClass();
                readerPageFragment3.m9300Y0(zM23653w3, motionEvent);
                readerPageFragment3.m9296U0();
                break;
            default:
                ym2 ym2Var = (ym2) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - ym2Var.f70060o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        ym2Var.f70058m = false;
                    }
                    ym2Var.m25198t();
                    ym2Var.f70058m = true;
                    ym2Var.f70060o = SystemClock.uptimeMillis();
                }
                break;
        }
        return false;
    }
}
