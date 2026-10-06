package p000;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class isv implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f32037a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32038b;

    public /* synthetic */ isv(ite iteVar, int i) {
        this.f32038b = i;
        this.f32037a = iteVar;
    }

    public /* synthetic */ isv(iyv iyvVar, int i) {
        this.f32038b = i;
        this.f32037a = iyvVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f32038b) {
            case 0:
                Object obj = this.f32037a;
                if (motionEvent.getAction() == 1) {
                    ((ite) obj).f32054E.mo11675b();
                }
                return true;
            case 1:
                Object obj2 = this.f32037a;
                if (motionEvent.getAction() == 1) {
                    ((ite) obj2).f32054E.mo11678ci();
                }
                return false;
            case 2:
                Object obj3 = this.f32037a;
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    iyv iyvVar = (iyv) obj3;
                    iyvVar.f32687b = false;
                    iyvVar.m11911b();
                }
                return false;
            default:
                Object obj4 = this.f32037a;
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    iyv iyvVar2 = (iyv) obj4;
                    iyvVar2.f32688c = false;
                    iyvVar2.m11911b();
                }
                return false;
        }
    }
}
