package p000;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyi implements View.OnGenericMotionListener {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0944qv f32645b = new InterfaceC0944qv() { // from class: iyh
        @Override // p000.InterfaceC0944qv
        /* JADX INFO: renamed from: a */
        public final Object mo2905a(Object obj) {
            iyp iypVar = new iyp(((RecyclerView) obj).getContext(), (View) obj);
            iypVar.f32668b = false;
            iypVar.f32669c = false;
            return iypVar;
        }
    };

    /* JADX INFO: renamed from: a */
    public RecyclerView f32646a;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0944qv f32647c = f32645b;

    /* JADX INFO: renamed from: d */
    private final Runnable f32648d = new ith(this, 7);

    /* JADX INFO: renamed from: e */
    private final aea f32649e;

    /* JADX INFO: renamed from: f */
    private iyp f32650f;

    public iyi(aea aeaVar) {
        this.f32649e = aeaVar;
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 8 || !motionEvent.isFromSource(4194304) || !view.isActivated()) {
            return false;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        this.f32646a = recyclerView;
        if (this.f32650f == null) {
            iyp iypVar = (iyp) this.f32647c.mo2905a(recyclerView);
            this.f32650f = iypVar;
            this.f32649e.mo309a(iypVar);
        }
        view.removeCallbacks(this.f32648d);
        view.postDelayed(this.f32648d, 80L);
        Context context = view.getContext();
        int iRound = Math.round((-motionEvent.getAxisValue(26)) * afr.m554b(ViewConfiguration.get(context)));
        if (iRound == 0) {
            return true;
        }
        view.scrollBy(0, iRound);
        return true;
    }
}
