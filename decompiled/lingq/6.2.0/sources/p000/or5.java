package p000;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class or5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f54784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Drawable f54785c;

    public /* synthetic */ or5(MaterialButton materialButton, Drawable drawable, int i) {
        this.f54783a = i;
        this.f54784b = materialButton;
        this.f54785c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f54783a;
        Drawable drawable = this.f54785c;
        MaterialButton materialButton = this.f54784b;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.f12752l0;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.f12752l0;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
