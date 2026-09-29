package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.slider.AbstractC1071b;

/* JADX INFO: loaded from: classes2.dex */
public final class ea0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36895a;

    /* JADX INFO: renamed from: b */
    public int f36896b;

    /* JADX INFO: renamed from: c */
    public final Object f36897c;

    public ea0(AbstractC1071b abstractC1071b) {
        this.f36895a = 0;
        this.f36897c = abstractC1071b;
        this.f36896b = -1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f36895a;
        Object obj = this.f36897c;
        switch (i) {
            case 0:
                ((AbstractC1071b) obj).f13186h.m24723w(this.f36896b, 4);
                break;
            case 1:
                int i2 = this.f36896b;
                AbstractC3584sr abstractC3584sr = (AbstractC3584sr) ((hi8) obj).f42410b;
                if (abstractC3584sr != null) {
                    abstractC3584sr.mo21648Q(i2);
                }
                break;
            case 2:
                ((MaterialCalendar) obj).f12885D0.m2747l0(this.f36896b);
                break;
            case 3:
                ((RecyclerView) obj).m2747l0(this.f36896b);
                break;
            default:
                ((scb) obj).m21227b(this.f36896b);
                break;
        }
    }

    public ea0(int i, vua vuaVar) {
        this.f36895a = 3;
        this.f36896b = i;
        this.f36897c = vuaVar;
    }

    public /* synthetic */ ea0(Object obj, int i, int i2) {
        this.f36895a = i2;
        this.f36897c = obj;
        this.f36896b = i;
    }
}
