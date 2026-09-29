package p000;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.vision.C1030o;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: zq */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3842zq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71952a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f71953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71954c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f71955d;

    public RunnableC3842zq(DynamiteClearcutLogger dynamiteClearcutLogger, int i, C1030o c1030o) {
        this.f71955d = dynamiteClearcutLogger;
        this.f71953b = i;
        this.f71954c = c1030o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f71952a;
        Object obj = this.f71954c;
        int i2 = this.f71953b;
        Object obj2 = this.f71955d;
        switch (i) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                break;
            case 1:
                int i3 = BottomSheetBehavior.f12683l0;
                ((BottomSheetBehavior) obj2).m6035P((View) obj, i2, false);
                break;
            default:
                ((DynamiteClearcutLogger) obj2).zzc.zza(i2, (C1030o) obj);
                break;
        }
    }

    public RunnableC3842zq(TextView textView, Typeface typeface, int i) {
        this.f71954c = textView;
        this.f71955d = typeface;
        this.f71953b = i;
    }

    public RunnableC3842zq(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f71955d = bottomSheetBehavior;
        this.f71954c = view;
        this.f71953b = i;
    }
}
